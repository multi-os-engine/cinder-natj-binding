package cinder.params;

import cinder.ColorA;
import cinder.app.Window;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import glm.detail.IVec2;
import std.SharedPtr;
import std.UpdateFn;

@CxxHeader(value = {"cinder/params/Params.h"}, useQuotes = false)
@CxxClass("cinder::params::InterfaceGl")
public interface InterfaceGl extends CxxObject {

    @CxxClass("cinder::params::InterfaceGl::OptionsBase")
    @CxxDefaultConstructorUnavailable
    @CxxCopyConstructorUnavailable
    public interface OptionsBase extends CxxObject {

        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public std.String getName();

        @CxxMethod(isConst = true)
        public VoidPtr getVoidPtr();

        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public std.String getKeyIncr();

        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public std.String getKeyDecr();

        @CxxMethod
        void setVisible(boolean visible);

        @CxxConstructor
        public static std.Vector<OptionsBase> newVector() {
            throw new CxxExpectedGeneratedCodeException();
        }
    }

    @CxxClass("cinder::params::InterfaceGl::Options<float>")
    @CxxDefaultConstructorUnavailable
    @CxxCopyConstructorUnavailable
    public interface OptionsFloat extends OptionsBase {

        //! Sets an increment shortcut key
        @CxxMethod
        @CxxByReference
        public OptionsFloat keyIncr(@CxxConst @CxxByReference std.String keyIncr);

        default OptionsFloat keyIncr(String keyIncr) {
            final std.String _value = std.String.getString(keyIncr);
            try {
                return keyIncr(_value);
            } finally {
                CxxRuntime.delete(_value);
            }
        }

        //! Sets a decrement shortcut key
        @CxxMethod
        @CxxByReference
        public OptionsFloat keyDecr(@CxxConst @CxxByReference std.String keyDecr);

        default OptionsFloat keyDecr(String keyDecr) {
            final std.String _value = std.String.getString(keyDecr);
            try {
                return keyDecr(_value);
            } finally {
                CxxRuntime.delete(_value);
            }
        }

        //!! Sets an update function that will be called after the target param is updated.
        @CxxMethod
        @CxxByReference
        public OptionsFloat updateFn(@CxxConst @CxxByReference UpdateFn updateFn);

        //! Sets the maximum value for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsFloat min(float minVal);

        //! Sets the minimum value for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsFloat max(float maxVal);

        //! Sets step increment for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsFloat step(float stepVal);

        @CxxMethod
        @CxxByReference
        public OptionsFloat visible(boolean visible);
    }

    @CxxClass("cinder::params::InterfaceGl::Options<int>")
    @CxxDefaultConstructorUnavailable
    @CxxCopyConstructorUnavailable
    public interface OptionsInt extends OptionsBase {

        //! Sets an increment shortcut key
        @CxxMethod
        @CxxByReference
        public OptionsInt keyIncr(@CxxConst @CxxByReference std.String keyIncr);

        default OptionsInt keyIncr(String keyIncr) {
            final std.String _value = std.String.getString(keyIncr);
            try {
                return keyIncr(_value);
            } finally {
                CxxRuntime.delete(_value);
            }
        }

        //! Sets a decrement shortcut key
        @CxxMethod
        @CxxByReference
        public OptionsInt keyDecr(@CxxConst @CxxByReference std.String keyDecr);

        default OptionsInt keyDecr(String keyDecr) {
            final std.String _value = std.String.getString(keyDecr);
            try {
                return keyDecr(_value);
            } finally {
                CxxRuntime.delete(_value);
            }
        }

        //!! Sets an update function that will be called after the target param is updated.
        @CxxMethod
        @CxxByReference
        public OptionsInt updateFn(@CxxConst @CxxByReference UpdateFn updateFn);

        //! Sets the maximum value for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsInt min(float minVal);

        //! Sets the minimum value for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsInt max(float maxVal);

        //! Sets step increment for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsInt step(float stepVal);

        @CxxMethod
        @CxxByReference
        public OptionsInt visible(boolean visible);
    }

    @CxxClass("cinder::params::InterfaceGl::Options<bool>")
    @CxxDefaultConstructorUnavailable
    @CxxCopyConstructorUnavailable
    public interface OptionsBool extends OptionsBase {

        //! Sets an increment shortcut key
        @CxxMethod
        @CxxByReference
        public OptionsBool keyIncr(@CxxConst @CxxByReference std.String keyIncr);

        default OptionsBool keyIncr(String keyIncr) {
            final std.String _value = std.String.getString(keyIncr);
            try {
                return keyIncr(_value);
            } finally {
                CxxRuntime.delete(_value);
            }
        }

        //! Sets a decrement shortcut key
        @CxxMethod
        @CxxByReference
        public OptionsBool keyDecr(@CxxConst @CxxByReference std.String keyDecr);

        default OptionsBool keyDecr(String keyDecr) {
            final std.String _value = std.String.getString(keyDecr);
            try {
                return keyDecr(_value);
            } finally {
                CxxRuntime.delete(_value);
            }
        }

        //!! Sets an update function that will be called after the target param is updated.
        @CxxMethod
        @CxxByReference
        public OptionsBool updateFn(@CxxConst @CxxByReference UpdateFn updateFn);

        //! Sets the maximum value for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsBool min(float minVal);

        //! Sets the minimum value for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsBool max(float maxVal);

        //! Sets step increment for the associated target param.
        @CxxMethod
        @CxxByReference
        public OptionsBool step(float stepVal);

        @CxxMethod
        @CxxByReference
        public OptionsBool visible(boolean visible);
    }

    //! Adds enumerated parameter. The value corresponds to the indices of \a enumNames.
    @CxxMethod
    @CxxByValue
    public OptionsInt addParam(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference std.Vector<std.String> enumNames, IntPtr param, boolean readOnly);

    @CxxMethod
    @CxxByValue
    public OptionsInt addParam(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference std.Vector<std.String> enumNames, IntPtr param);

    @CxxMethod
    @CxxByValue
    public OptionsFloat addParam(@CxxConst @CxxByReference std.String name, FloatPtr target, boolean readOnly);

    @CxxMethod
    @CxxByValue
    public OptionsFloat addParam(@CxxConst @CxxByReference std.String name, FloatPtr target);

    @CxxMethod
    @CxxByValue
    public OptionsBool addParam(@CxxConst @CxxByReference std.String name, BoolPtr target, boolean readOnly);

    @CxxMethod
    @CxxByValue
    public OptionsBool addParam(@CxxConst @CxxByReference std.String name, BoolPtr target);

    @CxxMethod
    @CxxByValue
    public OptionsInt addParam(@CxxConst @CxxByReference std.String name, IntPtr target, boolean readOnly);

    @CxxMethod
    @CxxByValue
    public OptionsInt addParam(@CxxConst @CxxByReference std.String name, IntPtr target);

    //! Creates and returns an InterfaceGl referenced by \a title that belongs to \a window, and with \a size dimensions. Optionally takes \a color.
    @CxxFunction("cinder::params::InterfaceGl::create")
    @CxxByValue
    public static SharedPtr<InterfaceGl> create(@CxxConst @CxxByReference SharedPtr<Window> window, @CxxConst @CxxByReference std.String title, @CxxConst @CxxByReference IVec2 size, @CxxConst @CxxByReference ColorA color) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::params::InterfaceGl::create")
    @CxxByValue
    public static SharedPtr<InterfaceGl> create(@CxxConst @CxxByReference SharedPtr<Window> window, @CxxConst @CxxByReference std.String title, @CxxConst @CxxByReference IVec2 size) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Adds a separator to the interface.
    @CxxMethod
    public void addSeparator(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference std.String optionsStr);

    default void addSeparator(String name, String optionsStr) {
        final std.String _name = std.String.getString(name);
        final std.String _optionsStr = std.String.getString(optionsStr);
        try {
            addSeparator(_name, _optionsStr);
        } finally {
            CxxRuntime.delete(_name);
            CxxRuntime.delete(_optionsStr);
        }
    }

    @CxxMethod
    public void addSeparator();

    //! Adds a button that fires \a callback when clicked.
    @CxxMethod
    public void addButton(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference UpdateFn callback, @CxxConst @CxxByReference std.String optionsStr);

    default void addButton(String name, UpdateFn callback, String optionsStr) {
        final std.String _name = std.String.getString(name);
        final std.String _optionsStr = std.String.getString(optionsStr);
        try {
            addButton(_name, callback, _optionsStr);
        } finally {
            CxxRuntime.delete(_name);
            CxxRuntime.delete(_optionsStr);
        }
    }

    @CxxMethod
    public void addButton(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference UpdateFn callback);

    default void addButton(String name, UpdateFn callback) {
        final std.String _name = std.String.getString(name);
        try {
            addButton(_name, callback);
        } finally {
            CxxRuntime.delete(_name);
        }
    }

    //! Draw the interface.
    @CxxMethod
    public void draw();

    //! Sets runtime options on the param referred to by \a name.
    @CxxMethod
    public void setOptions(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference std.String optionsStr);

    default void setOptions(String name, String optionsStr) {
        final std.String _name = std.String.getString(name);
        final std.String _optionsStr = std.String.getString(optionsStr);
        try {
            setOptions(_name, _optionsStr);
        } finally {
            CxxRuntime.delete(_name);
            CxxRuntime.delete(_optionsStr);
        }
    }

    //! Sets runtime options on the param referred to by \a name.
    @CxxMethod
    public void setOptions(@CxxConst @CxxByReference std.String name);

    default void setOptions(String name) {
        final std.String _name = std.String.getString(name);
        try {
            setOptions(_name);
        } finally {
            CxxRuntime.delete(_name);
        }
    }
}
