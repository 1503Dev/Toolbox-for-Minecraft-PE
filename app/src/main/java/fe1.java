package defpackage;

import android.util.Log;
import defpackage.ad1;

/* renamed from: fe1  reason: default package */
public final class fe1 implements yb0<z6> {
    public final /* synthetic */ zf1 P = null;
    public final /* synthetic */ he1 Q;

    public fe1(he1 he1Var) {
        this.Q = he1Var;
    }

    @Override // defpackage.yb0
    public final void c(yv0<z6> yv0Var) {
        Throwable th;
        if (yv0Var.l()) {
            this.Q.e = yv0Var.i().a;
            zf1 zf1Var = this.P;
            if (zf1Var != null) {
                ((ad1.e.a) zf1Var).a(this.Q.e);
            }
        } else {
            if (yv0Var.h() != null) {
                th = yv0Var.h();
            } else {
                th = new Throwable("Task failed with unknown exception.");
            }
            StringBuilder b = e5.b("App Set ID is not available. Unexpected exception occurred: ");
            b.append(Log.getStackTraceString(th));
            t1.b(0, 1, b.toString(), true);
            zf1 zf1Var2 = this.P;
            if (zf1Var2 != null) {
                ((ad1.e.a) zf1Var2).b(th);
            }
        }
        this.Q.b.b(true);
    }
}