//
//  main.cpp
//

#include "jni.h"

#include <iostream>
#include <pthread.h>
#include <string>
#include <string.h>
#include <stdlib.h>

#include <boost/filesystem.hpp>
namespace bfs = boost::filesystem;

#ifndef __CINDER_SAMPLE_MAIN_CLASS__
#error __CINDER_SAMPLE_MAIN_CLASS__ macro is undefined
#endif

#ifndef __CINDER_SAMPLE_JAVA_CLASS_PATH__
#error __CINDER_SAMPLE_JAVA_CLASS_PATH__ macro is undefined
#endif

#ifndef __CINDER_SAMPLE_JAVA_LIBRARY_PATH__
#error __CINDER_SAMPLE_JAVA_LIBRARY_PATH__ macro is undefined
#endif

struct start_args {
    JavaVMInitArgs vm_args;
    const char *launch_class;
    
    start_args(const char **args, const char *classname) {
        vm_args.version = JNI_VERSION_1_8;
        vm_args.ignoreUnrecognized = JNI_TRUE;
        
        int arg_count = 0;
        const char **atarg = args;
        while (*atarg++) arg_count++;
        JavaVMOption *options = new JavaVMOption[arg_count];
        vm_args.nOptions = arg_count;
        vm_args.options = options;
        
        while (*args) {
            options->optionString = strdup(*args);
            options++;
            args++;
        }
        launch_class = strdup(classname);
    }
};

void *
start_java(void *start_args, int argc, char **argv)
{
    struct start_args *args = (struct start_args *)start_args;
    int res;
    JavaVM *jvm;
    JNIEnv *env;
    
    res = JNI_CreateJavaVM(&jvm, (void**)&env, &args->vm_args);
    if (res < 0) exit(1);
    /* load the launch class */
    jclass main_class;
    jmethodID main_method_id;
    main_class = env->FindClass(args->launch_class);
    if (main_class == NULL) {
        if (env->ExceptionCheck()) {
            env->ExceptionDescribe();
        }
        jvm->DestroyJavaVM();
        exit(1);
    }
    /* get main method */
    main_method_id = env->GetStaticMethodID(main_class, "main", "([Ljava/lang/String;)V");
    if (main_method_id == NULL) {
        jvm->DestroyJavaVM();
        exit(1);
        
    }
    /* make the initial argument */
    jobjectArray jArgv = env->NewObjectArray( argc, env->FindClass("java/lang/String"), NULL );
    
    int i;
    for( i = 0; i < argc; i++ ) {
        jstring jArg = env->NewStringUTF( argv[ i ] );
        env->SetObjectArrayElement( jArgv, i, jArg );
    }
    /* call the method */
    env->CallStaticVoidMethod(main_class, main_method_id, jArgv);
    /* Don't forget to destroy the JVM at the end */
    jvm->DestroyJavaVM();
    return (0);
}

int main(int argc, char **argv)
{
    char sampleExecParent[1024];
    {
        bfs::path argv0(argv[0]);
        bfs::path argv0abs = bfs::canonical(argv0.parent_path());
        sprintf(sampleExecParent, "-Dsample.exec.parent=%s", argv0abs.string().c_str());
    }

    const char *vm_arglist[] = {
        "-Djava.class.path=" __CINDER_SAMPLE_JAVA_CLASS_PATH__,
        "-Djava.library.path=" __CINDER_SAMPLE_JAVA_LIBRARY_PATH__,
        sampleExecParent,
        0,
        0,
        0
    };
    if (getenv("DEBUG_JAVA") != 0) {
        vm_arglist[3] = "-Xdebug";
        vm_arglist[4] = "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005";
    }
    struct start_args args(vm_arglist, __CINDER_SAMPLE_MAIN_CLASS__);
    start_java(&args, argc, argv);
}
