package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: eo  reason: default package */
public final class eo {
    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            n0.e(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}