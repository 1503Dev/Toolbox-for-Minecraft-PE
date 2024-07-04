package defpackage;

import android.os.Handler;

/* renamed from: nq5  reason: default package */
public final class nq5 {
    public final Handler a;
    public final oq5 b;

    public nq5(Handler handler, xl5 xl5Var) {
        this.a = handler;
        this.b = xl5Var;
    }

    public final void a(final nk5 nk5Var) {
        synchronized (nk5Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: hq5
                @Override // java.lang.Runnable
                public final void run() {
                    nq5 nq5Var = nq5.this;
                    nk5 nk5Var2 = nk5Var;
                    nq5Var.getClass();
                    synchronized (nk5Var2) {
                    }
                    oq5 oq5Var = nq5Var.b;
                    int i = zn4.a;
                    xl5 xl5Var = (xl5) oq5Var;
                    pp5 pp5Var = xl5Var.P.p;
                    io5 E = pp5Var.E((ov5) pp5Var.S.e);
                    pp5Var.D(E, 1013, new en2(3, E, nk5Var2));
                    xl5Var.P.getClass();
                    xl5Var.P.getClass();
                }
            });
        }
    }
}