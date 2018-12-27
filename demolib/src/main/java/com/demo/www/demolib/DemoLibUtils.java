package com.demo.www.demolib;

import android.util.Log;

public class DemoLibUtils {

    private static String sTag = DemoLibUtils.class.getSimpleName();

    public static void sayHello() {
        Log.e(sTag, "The module uploading to Jcenter is successful ");
    }

    public void hahha() {
        Log.e(sTag, "hhh ");
    }
}
