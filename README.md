# Cinder Bindings for Java with Nat/J

## About this repository

Nat/J is the Java to Native binding system of the [Multi-OS Engine](http://multi-os-engine.org). It supports binding C, Objective-C and C++ libraries to Java. This repository includes sample bindings for a subset of the Cinder C++ library including ports of some Cinder samples to Java.

## About Cinder

Cinder (http://libcinder.org) is a versatile C++ library for graphics and multimedia programming. 

## Try it out!

The repository is configured as an Intelli/J IDEA project and Mac OSX. To try it out, first install the following prerequisites:
 * Mac OSX El Capitan (10.11)
 * Intelli/J IDEA 2016.2
 * Xcode 7.3 or later
 * Oracle Java 8 JDK

The Oracle Java 8 installer does not set up the JDK to allow the execution of Java apps packaged in a Mac bundle. To fix this, you will need to execute the following commands (customize the path to match your JDK version):

```
cd /Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents
sudo defaults write $PWD/Info.plist JavaVM -dict-add 'JVMCapabilities' '<array><string>JNI</string><string>BundledApp</string><string>CommandLine</string></array>'
sudo chmod 664 Info.plist
sudo plutil -convert xml1 Info.plist
```

Now you may open the project in IDEA, and launch the preconfigured samples in Debug mode (Run mode launch is not configured at this time).

## License

Nat/J is licensed under Apache 2 license.

## More Information

To find out more about Nat/J visit the [Multi-OS Engine website](http://multi-os-engine.org)

The best place to ask questions is the [MOE Forum](https://discuss.multi-os-engine.org).
