package com.bumptech.photos.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sam
 * Date: 10/11/12
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Log {
    private static final String TAG = "BUMP_PHOTOS";
    private static final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public static void e(String message, Object... args) {
        String formatted = args.length > 0 ? String.format(message, args) : message;
        android.util.Log.e(TAG, formatted);
    }

    public static void e(String message, Throwable t, Object... args){
        String formatted = args.length > 0 ? String.format(message, args) : message;
        android.util.Log.e(TAG, formatted, t);
    }

    public static void w(String message, Object... args) {
        String formatted = args.length > 0 ? String.format(message, args) : message;
        android.util.Log.w(TAG, formatted);
    }

    public static void i(String message, Object... args) {
        String formatted = args.length > 0 ? String.format(message, args) : message;
        android.util.Log.i(TAG, formatted);
    }

    public static void d(String message, Object... args) {
        String formatted = args.length > 0 ? String.format(message, args) : message;
        formatted = "[" + dateFormat.format(new Date()) + "] " + formatted;
        android.util.Log.d(TAG, formatted);
    }

    public static void v(String message, Object... args) {
        String formatted = args.length > 0 ? String.format(message, args) : message;
        android.util.Log.v(TAG, formatted);
    }
}
