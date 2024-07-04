package com.microsoft.xal.androidjava;

import android.os.Build;

public final class DeviceInfo {
    public static String GetOsVersion() {
        return Build.VERSION.RELEASE;
    }
}