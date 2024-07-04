package com.microsoft.xal.androidjava;

public class PresenceManager {
    public static void attach() {
    }

    private static native void pausePresence();

    private static native void resumePresence();
}