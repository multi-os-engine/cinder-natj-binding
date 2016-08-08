package cinder.app;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxMethod;
import org.moe.natj.cxx.ann.CxxUnsigned;

@CxxHeader(value = {"cinder/app/KeyEvent.h"}, useQuotes = false)
@CxxClass("cinder::app::KeyEvent")
public interface KeyEvent extends CxxObject {

    public static final int KEY_UNKNOWN = 0;
    public static final int KEY_FIRST = 0;
    public static final int KEY_BACKSPACE = 8;
    public static final int KEY_TAB = 9;
    public static final int KEY_CLEAR = 12;
    public static final int KEY_RETURN = 13;
    public static final int KEY_PAUSE = 19;
    public static final int KEY_ESCAPE = 27;
    public static final int KEY_SPACE = 32;
    public static final int KEY_EXCLAIM = 33;
    public static final int KEY_QUOTEDBL = 34;
    public static final int KEY_HASH = 35;
    public static final int KEY_DOLLAR = 36;
    public static final int KEY_AMPERSAND = 38;
    public static final int KEY_QUOTE = 39;
    public static final int KEY_LEFTPAREN = 40;
    public static final int KEY_RIGHTPAREN = 41;
    public static final int KEY_ASTERISK = 42;
    public static final int KEY_PLUS = 43;
    public static final int KEY_COMMA = 44;
    public static final int KEY_MINUS = 45;
    public static final int KEY_PERIOD = 46;
    public static final int KEY_SLASH = 47;
    public static final int KEY_0 = 48;
    public static final int KEY_1 = 49;
    public static final int KEY_2 = 50;
    public static final int KEY_3 = 51;
    public static final int KEY_4 = 52;
    public static final int KEY_5 = 53;
    public static final int KEY_6 = 54;
    public static final int KEY_7 = 55;
    public static final int KEY_8 = 56;
    public static final int KEY_9 = 57;
    public static final int KEY_COLON = 58;
    public static final int KEY_SEMICOLON = 59;
    public static final int KEY_LESS = 60;
    public static final int KEY_EQUALS = 61;
    public static final int KEY_GREATER = 62;
    public static final int KEY_QUESTION = 63;
    public static final int KEY_AT = 64;

    public static final int KEY_LEFTBRACKET = 91;
    public static final int KEY_BACKSLASH = 92;
    public static final int KEY_RIGHTBRACKET = 93;
    public static final int KEY_CARET = 94;
    public static final int KEY_UNDERSCORE = 95;
    public static final int KEY_BACKQUOTE = 96;
    public static final int KEY_a = 97;
    public static final int KEY_b = 98;
    public static final int KEY_c = 99;
    public static final int KEY_d = 100;
    public static final int KEY_e = 101;
    public static final int KEY_f = 102;
    public static final int KEY_g = 103;
    public static final int KEY_h = 104;
    public static final int KEY_i = 105;
    public static final int KEY_j = 106;
    public static final int KEY_k = 107;
    public static final int KEY_l = 108;
    public static final int KEY_m = 109;
    public static final int KEY_n = 110;
    public static final int KEY_o = 111;
    public static final int KEY_p = 112;
    public static final int KEY_q = 113;
    public static final int KEY_r = 114;
    public static final int KEY_s = 115;
    public static final int KEY_t = 116;
    public static final int KEY_u = 117;
    public static final int KEY_v = 118;
    public static final int KEY_w = 119;
    public static final int KEY_x = 120;
    public static final int KEY_y = 121;
    public static final int KEY_z = 122;
    public static final int KEY_DELETE = 127;

    public static final int KEY_KP0 = 256;
    public static final int KEY_KP1 = 257;
    public static final int KEY_KP2 = 258;
    public static final int KEY_KP3 = 259;
    public static final int KEY_KP4 = 260;
    public static final int KEY_KP5 = 261;
    public static final int KEY_KP6 = 262;
    public static final int KEY_KP7 = 263;
    public static final int KEY_KP8 = 264;
    public static final int KEY_KP9 = 265;
    public static final int KEY_KP_PERIOD = 266;
    public static final int KEY_KP_DIVIDE = 267;
    public static final int KEY_KP_MULTIPLY = 268;
    public static final int KEY_KP_MINUS = 269;
    public static final int KEY_KP_PLUS = 270;
    public static final int KEY_KP_ENTER = 271;
    public static final int KEY_KP_EQUALS = 272;

    public static final int KEY_UP = 273;
    public static final int KEY_DOWN = 274;
    public static final int KEY_RIGHT = 275;
    public static final int KEY_LEFT = 276;
    public static final int KEY_INSERT = 277;
    public static final int KEY_HOME = 278;
    public static final int KEY_END = 279;
    public static final int KEY_PAGEUP = 280;
    public static final int KEY_PAGEDOWN = 281;

    public static final int KEY_F1 = 282;
    public static final int KEY_F2 = 283;
    public static final int KEY_F3 = 284;
    public static final int KEY_F4 = 285;
    public static final int KEY_F5 = 286;
    public static final int KEY_F6 = 287;
    public static final int KEY_F7 = 288;
    public static final int KEY_F8 = 289;
    public static final int KEY_F9 = 290;
    public static final int KEY_F10 = 291;
    public static final int KEY_F11 = 292;
    public static final int KEY_F12 = 293;
    public static final int KEY_F13 = 294;
    public static final int KEY_F14 = 295;
    public static final int KEY_F15 = 296;

    public static final int KEY_NUMLOCK = 300;
    public static final int KEY_CAPSLOCK = 301;
    public static final int KEY_SCROLLOCK = 302;
    public static final int KEY_RSHIFT = 303;
    public static final int KEY_LSHIFT = 304;
    public static final int KEY_RCTRL = 305;
    public static final int KEY_LCTRL = 306;
    public static final int KEY_RALT = 307;
    public static final int KEY_LALT = 308;
    public static final int KEY_RMETA = 309;
    public static final int KEY_LMETA = 310;
    public static final int KEY_LSUPER = 311; /* Left "Windows" key */
    public static final int KEY_RSUPER = 312; /* Right "Windows" key */
    public static final int KEY_MODE = 313; /* "Alt Gr" key */
    public static final int KEY_COMPOSE = 314; /* Multi-key compose key */

    public static final int KEY_HELP = 315;
    public static final int KEY_PRINT = 316;
    public static final int KEY_SYSREQ = 317;
    public static final int KEY_BREAK = 318;
    public static final int KEY_MENU = 319;
    public static final int KEY_POWER = 320; /* Power Macintosh power key */
    public static final int KEY_EURO = 321; /* Some european keyboards */
    public static final int KEY_UNDO = 322; /* Atari keyboard has Undo */

    public static final int KEY_LAST = KEY_UNDO + 1;

    //! Returns the ASCII character associated with the event.
    @CxxMethod
    public byte getChar();

    //! Returns the UTF-32 character associated with the event.
    @CxxMethod
    @CxxUnsigned
    public int getCharUtf32();

    //! Returns the key code associated with the event, which maps into the enum listed below
    @CxxMethod
    int getCode();

    //! Returns whether the Shift key was pressed during the event.
    @CxxMethod
    public boolean isShiftDown();

    //! Returns whether the Alt (or Option) key was pressed during the event.
    @CxxMethod
    public boolean isAltDown();

    //! Returns whether the Control key was pressed during the event.
    @CxxMethod
    public boolean isControlDown();

    //! Returns whether the meta key was pressed during the event. Maps to the Windows key on Windows and the Command key on Mac OS X.
    @CxxMethod
    public boolean isMetaDown();

    //! Returns whether the accelerator key was pressed during the event. Maps to the Control key on Windows and the Command key on Mac OS X.
    @CxxMethod
    public boolean isAccelDown();

    //! Returns the platform-native key-code. Advanced users only.
    @CxxMethod
    public int getNativeKeyCode();
}
