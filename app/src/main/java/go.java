package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: go  reason: default package */
public final class go {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public go(Context context) {
        boolean z;
        int i;
        TypedValue a = y30.a(context, gh0.elevationOverlayEnabled);
        if (a != null && a.type == 18 && a.data != 0) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        TypedValue a2 = y30.a(context, gh0.elevationOverlayColor);
        if (a2 != null) {
            i = a2.data;
        } else {
            i = 0;
        }
        this.b = i;
        TypedValue a3 = y30.a(context, gh0.colorSurface);
        this.c = a3 != null ? a3.data : 0;
        this.d = context.getResources().getDisplayMetrics().density;
    }
}