package com.example.demo01;

import android.util.Log;

public class Demo01 {
    private static final String TAG = "log_debug";

    public static void logTest(String msg){
        Log.d(TAG,"log is printed :" + msg);
    }

    public static String getString(){
        return "本次版本是v1.5";
    }

    public static void log(String msg){
        Log.d(TAG,"log is printed :" + msg);
    }
}
