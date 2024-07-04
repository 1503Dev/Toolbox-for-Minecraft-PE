package com.microsoft.xboxtcui;

import android.app.Activity;
import android.content.Context;

public class Interop {
    public static void ShowFriendFinder(Activity activity, String str, String str2) {
        tcui_completed_callback(0);
    }

    public static void ShowUserProfile(Context context, String str) {
        tcui_completed_callback(0);
    }

    public static void ShowUserSettings(Context context) {
        tcui_completed_callback(0);
    }

    private static native void tcui_completed_callback(int i);
}