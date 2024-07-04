package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: ef0  reason: default package */
public final class ef0 {
    public Object a;

    public ef0(Object obj) {
        this.a = obj;
    }

    public static ef0 a(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? new ef0(PointerIcon.getSystemIcon(context, 1002)) : new ef0(null);
    }
}