package defpackage;

import android.content.Context;
import android.os.Binder;

/* renamed from: g52 */
public final class g52 {
    public x42 a;
    public boolean b;
    public final Object c = new Object();

    public g52(Context context) {
    }

    public static /* bridge */ /* synthetic */ void a(g52 g52Var) {
        synchronized (g52Var.c) {
            x42 x42Var = g52Var.a;
            if (x42Var == null) {
                return;
            }
            x42Var.p();
            g52Var.a = null;
            Binder.flushPendingCommands();
        }
    }
}