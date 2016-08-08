package cinder.audio;

public enum ChannelMode {
    //! Number of channels has been specified by user or is non-settable.
    SPECIFIED,
    //! This Node matches it's channels with it's input.
    MATCHES_INPUT,
    //! This Node matches it's channels with it's output.
    MATCHES_OUTPUT
}
