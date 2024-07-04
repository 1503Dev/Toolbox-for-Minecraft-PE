package defpackage;

import android.content.Context;

/* renamed from: c81  reason: default package */
public final class c81 {
    public static c81 b = new c81();
    public md0 a = null;

    public static md0 a(Context context) {
        md0 md0Var;
        c81 c81Var = b;
        synchronized (c81Var) {
            if (c81Var.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                c81Var.a = new md0(context);
            }
            md0Var = c81Var.a;
        }
        return md0Var;
    }
}