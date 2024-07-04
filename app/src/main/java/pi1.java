package defpackage;

import android.os.Build;

/* renamed from: pi1  reason: default package */
public final class pi1 {
    public static final int a;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L12;
     */
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() == 1) {
                    if (str.charAt(0) >= 'S') {
                    }
                }
            }
            i2 = 0;
        }
        a = i2;
    }
}