package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/audio/Param.h"}, useQuotes = false)
@CxxClass("cinder::audio::Param")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Param extends CxxObject {

    @CxxHeader(value = {"cinder/audio/Param.h"}, useQuotes = false)
    @CxxClass("cinder::audio::Param::Options")
    public interface Options extends CxxObject {

        //! Specifies a delay of \a delay in seconds.
        @CxxMethod
        @CxxByReference
        public Options delay(double delay);

        //! Specifies the begin time in seconds. If this is value is greater or equal to zero, delay() is ignored.
        @CxxMethod
        @CxxByReference
        public Options beginTime(double time);

        //! Specifies the ramping function used during evaluation.
        @CxxMethod
        @CxxByReference
        public Options rampFn(@CxxConst @CxxByReference RampFn rampFn);

        @CxxMethod
        @CxxByReference
        public Options rampFn2();

        //! Sets a label that will be assigned to the Event. Useful when debugging.
        @CxxMethod
        @CxxByReference
        public Options label(@CxxConst @CxxByReference std.String label);

        //! Returns the delay specified in seconds.
        double getDelay();

        //! Returns the begin time specified in seconds.
        double getBeginTime();

        //! Returns the ramping function that will be used during evaluation.
        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public RampFn getRampFn();

        //! Returns a label that will be assigned to the Event. Useful when debugging.
        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public std.String getLabel();
    }

    //! Sets this Param's input to be the processing performed by \a node. Any existing Event's are discarded. \note Forces \a node to be mono.
    @CxxMethod
    public void setProcessor(@CxxConst @CxxByReference SharedPtr<AddNode> node);

    //! Apply a ramp Event from the current value to \a valueEnd over \a rampSeconds, replacing any existing Events when this one begins. Any existing processing Node is disconnected. \see Options.
    @CxxMethod
    @CxxByValue
    public SharedPtr<Event> applyRamp(float valueEnd, double rampSeconds);

    @CxxMethod
    @CxxByValue
    public SharedPtr<Event> applyRamp(float valueEnd, double rampSeconds, @CxxConst @CxxByReference Options options);

    @CxxConstructor()
    public static Param.Options newOptions() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
