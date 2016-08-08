package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = {"cinder/audio/Node.h"}, useQuotes = false)
@CxxClass("cinder::audio::Node")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Node extends CxxObject {

    @CxxHeader(value = {"cinder/audio/Node.h"}, useQuotes = false)
    @CxxClass("cinder::audio::Node::Format")
    public interface Format extends CxxObject {

        //! Sets the number of channels for the Node.
        @CxxMethod
        @CxxByReference
        public Format channels(@NULong long ch);

        //! Controls how channels will be matched between connected Node's, if necessary. \see ChannelMode.
        @CxxMethod
        @CxxByReference
        public Format channelMode(@CxxEnum("cinder::audio::Node::ChannelMode") int mode);

        //! Whether or not the Node will be auto-enabled when connection changes occur.  Default is true for base \a Node class, although sub-classes may choose a different default.
        @CxxMethod
        @CxxByReference
        public Format autoEnable(boolean autoEnable);

        @CxxMethod
        @NULong
        public long getChannels();

        @CxxMethod
        @CxxEnum("cinder::audio::Node::ChannelMode")
        public int getChannelMode();

        @CxxMethod
        public void setChannels(@NULong long ch);

        @CxxMethod
        public void setChannelMode(@CxxEnum("cinder::audio::Node::ChannelMode") int mode);

        @CxxMethod
        public void setAutoEnable(boolean autoEnable);

    }

    @CxxConstructor()
    public static Node.Format newFormat() {
        throw new CxxExpectedGeneratedCodeException();
    }

    /*//! Sets this Node's name to a user-specified string.
    @CxxMethod
    public void setName(@CxxConst @CxxByReference std.String name );

    //! Enables this Node for processing. Same as `setEnabled( true )`.
    @CxxMethod
    public void enable();*/

}
