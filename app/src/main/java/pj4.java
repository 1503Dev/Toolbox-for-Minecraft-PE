package defpackage;

import android.content.Context;

/* renamed from: pj4  reason: default package */
public final class pj4 {
    public static yv0 a;
    public static et5 b;
    public static final Object c = new Object();

    public static void a(Context context, boolean z) {
        synchronized (c) {
            try {
                if (b == null) {
                    b = new et5(context);
                }
                yv0 yv0Var = a;
                if (yv0Var == null || ((yv0Var.k() && !a.l()) || (z && a.k()))) {
                    et5 et5Var = b;
                    uf0.g(et5Var, "the appSetIdClient shouldn't be null");
                    a = et5Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}