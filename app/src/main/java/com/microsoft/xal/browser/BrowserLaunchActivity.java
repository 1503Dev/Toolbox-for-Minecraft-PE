package com.microsoft.xal.browser;

import android.content.Context;

public class BrowserLaunchActivity {
    public static void showUrl(long j, Context context, String str, String str2, int i, String[] strArr, String[] strArr2, boolean z) {
        WebView.showUrlInternal(j, context, str, str2, i, strArr, strArr2, true);
    }

    public static void showUrl(long j, Context context, String str, String str2, int i, String[] strArr, String[] strArr2, boolean z, long j2) {
        WebView.showUrlInternal(j, context, str, str2, i, strArr, strArr2, true);
    }

    public static native void urlOperationCanceled(long j, boolean z, String str);

    public static native void urlOperationFailed(long j, boolean z, String str);

    public static native void urlOperationSucceeded(long j, String str, boolean z, String str2);
}