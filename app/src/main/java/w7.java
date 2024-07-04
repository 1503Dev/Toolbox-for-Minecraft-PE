package defpackage;

import android.os.Build;

/* renamed from: w7  reason: default package */
public interface w7 {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 27;
    }
}