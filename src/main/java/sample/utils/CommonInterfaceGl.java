package sample.utils;

import cinder.app.App;
import cinder.app.Window;
import cinder.params.InterfaceGl;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import glm.detail.IVec2;
import std.SharedPtr;
import std.UpdateFn;
import std.Vector;

import java.util.Collection;
import java.util.HashSet;

public class CommonInterfaceGl {

    private final SharedPtr<InterfaceGl> mParams;
    private final HashSet<CxxObject> optionsInstanceCollection = new HashSet<>();

    public CommonInterfaceGl(SharedPtr<Window> window, String title, int width, int height) {
        final IVec2 interfaceSize = IVec2.newIVec2(width, height);
        final IVec2 interfaceSizePixels = App.toPixels(interfaceSize);
        CxxRuntime.delete(interfaceSize);
        final std.String _title = std.String.getString(title);
        mParams = InterfaceGl.create(window, _title, interfaceSizePixels);
        CxxRuntime.delete(interfaceSizePixels);
        CxxRuntime.delete(_title);
    }

    public void finish() {
        for (CxxObject cxxObject : optionsInstanceCollection) {
            CxxRuntime.delete(cxxObject);
        }
        optionsInstanceCollection.clear();
    }

    public InterfaceGl.OptionsInt addParam(String name, String[] enumNames, IntPtr param, boolean readOnly) {
        final std.String _name = std.String.getString(name);
        final Vector<std.String> _values = vecFromStrings(enumNames);
        final InterfaceGl.OptionsInt options = mParams.get().addParam(_name, _values, param, readOnly);
        optionsInstanceCollection.add(options);
        CxxRuntime.delete(_values);
        CxxRuntime.delete(_name);
        return options;
    }

    public InterfaceGl.OptionsInt addParam(String name, String[] enumNames, IntPtr param) {
        return addParam(name, enumNames, param, false);
    }

    public InterfaceGl.OptionsFloat addParam(String name, FloatPtr target, boolean readOnly) {
        final std.String _name = std.String.getString(name);
        final InterfaceGl.OptionsFloat options = mParams.get().addParam(_name, target, readOnly);
        optionsInstanceCollection.add(options);
        CxxRuntime.delete(_name);
        return options;
    }

    public InterfaceGl.OptionsFloat addParam(String name, FloatPtr target) {
        return addParam(name, target, false);
    }

    public InterfaceGl.OptionsBool addParam(String name, BoolPtr target, boolean readOnly) {
        final std.String _name = std.String.getString(name);
        final InterfaceGl.OptionsBool options = mParams.get().addParam(_name, target, readOnly);
        optionsInstanceCollection.add(options);
        CxxRuntime.delete(_name);
        return options;
    }

    public InterfaceGl.OptionsBool addParam(String name, BoolPtr target) {
        return addParam(name, target, false);
    }

    public InterfaceGl.OptionsInt addParam(String name, IntPtr target, boolean readOnly) {
        final std.String _name = std.String.getString(name);
        final InterfaceGl.OptionsInt options = mParams.get().addParam(_name, target, readOnly);
        optionsInstanceCollection.add(options);
        CxxRuntime.delete(_name);
        return options;
    }

    public InterfaceGl.OptionsInt addParam(String name, IntPtr target) {
        return addParam(name, target, false);
    }

    private std.Vector<std.String> vecFromStrings(String... values) {
        std.Vector<std.String> vector = std.String.newStringVector();
        for (String value : values) {
            final std.String string = std.String.getString(value);
            vector.push_back(string);
            CxxRuntime.delete(string);
        }
        return vector;
    }

    public void addSeparator(String name, String optionsStr) {
        mParams.get().addSeparator(name, optionsStr);
    }

    public void addSeparator() {
        mParams.get().addSeparator();
    }

    //! Adds a button that fires \a callback when clicked.
    public void addButton(String name, UpdateFn callback, String optionsStr) {
        mParams.get().addButton(name, callback, optionsStr);
    }

    public void addButton(String name, UpdateFn callback) {
        mParams.get().addButton(name, callback);
    }

    //! Draw the interface.
    public void draw() {
        mParams.get().draw();
    }

    public void setOptions(String name, String optionsStr) {
        mParams.get().setOptions(name, optionsStr);
    }

    public void setOptions(String name) {
        mParams.get().setOptions(name);
    }

    public void keepOption(InterfaceGl.OptionsBase option) {
        final long peer = option._cxx_rt_peer();
        for (CxxObject cxxObject : optionsInstanceCollection) {
            if (cxxObject._cxx_rt_peer() == peer) {
                optionsInstanceCollection.remove(cxxObject);
                break;
            }
        }
    }

    public void keepAllOptions(Collection<InterfaceGl.OptionsBase> options) {
        for (InterfaceGl.OptionsBase option : options) {
            keepOption(option);
        }
    }
}
