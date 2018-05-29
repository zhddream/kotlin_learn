package com.zhd.admin.kotlin.java;

import android.text.TextUtils;

public class MyTextUtils {

    public static boolean isEmpty(String string) {
        if (string != null) {
            return TextUtils.isEmpty(string.trim());
        } else {
            return true;
        }
    }
}
