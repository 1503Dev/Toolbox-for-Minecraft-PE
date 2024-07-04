package defpackage;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: f51  reason: default package */
public class f51 extends ja {
    public static boolean V = true;

    @SuppressLint({"NewApi"})
    public float q(View view) {
        if (V) {
            try {
                return e51.a(view);
            } catch (NoSuchMethodError unused) {
                V = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void r(View view, float f) {
        if (V) {
            try {
                d51.a(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                V = false;
            }
        }
        view.setAlpha(f);
    }
}