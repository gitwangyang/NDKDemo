package com.codekong.ndkdemo;

/**
 * Created by Dota.Wang on 2018/6/13.
 */

public class JNITest {
    static {
        System.loadLibrary("JniLib");
    }

    public native String getString();
}
