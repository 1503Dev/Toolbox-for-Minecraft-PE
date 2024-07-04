package defpackage;

import android.os.Build;

/* renamed from: cd  reason: default package */
public final class cd {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 21 ? 2 : 1;
    }
}