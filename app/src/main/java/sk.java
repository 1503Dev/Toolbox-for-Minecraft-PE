package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: sk  reason: default package */
public final class sk {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;

    public static boolean a(Context context) {
        if (c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            boolean z2 = true;
            if (Build.VERSION.SDK_INT >= 20) {
                z = true;
            } else {
                z = false;
            }
            a = Boolean.valueOf((z && packageManager.hasSystemFeature("android.hardware.type.watch")) ? false : false);
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        boolean z;
        if (b(context)) {
            if (Build.VERSION.SDK_INT >= 24) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            if (d(context) && !qe0.a()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        boolean z;
        if (b == null) {
            boolean z2 = true;
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
            } else {
                z = false;
            }
            b = Boolean.valueOf((z && context.getPackageManager().hasSystemFeature("cn.google")) ? false : false);
        }
        return b.booleanValue();
    }
}