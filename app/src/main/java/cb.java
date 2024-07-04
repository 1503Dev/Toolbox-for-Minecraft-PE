package defpackage;

import android.os.Build;

/* renamed from: cb  reason: default package */
public final class cb {
    public static boolean a() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if (!(!"REL".equals(str) && str.compareTo("S") >= 0)) {
                return false;
            }
        }
        return true;
    }
}