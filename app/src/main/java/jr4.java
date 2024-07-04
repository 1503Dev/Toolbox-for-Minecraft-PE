package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.os.Build;

/* renamed from: jr4  reason: default package */
public final class jr4 {
    public static final int a;
    public static final ClipData b;

    static {
        a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        b = ClipData.newIntent("", new Intent());
    }

    public static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }
}