package defpackage;

import android.os.Build;

/* renamed from: b11  reason: default package */
public final class b11 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        a = true;
        b = true;
        c = i >= 28;
    }
}