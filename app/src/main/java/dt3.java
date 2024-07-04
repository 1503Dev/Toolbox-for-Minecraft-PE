package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: dt3  reason: default package */
public final class dt3 implements ps3 {
    public final long a;
    public final vs3 b;
    public final th4 c;

    public dt3(long j, Context context, vs3 vs3Var, w33 w33Var, String str) {
        this.a = j;
        this.b = vs3Var;
        k94 V = w33Var.V();
        context.getClass();
        V.R = context;
        V.P = str;
        this.c = (th4) V.a().e.c();
    }

    @Override // defpackage.ps3
    public final void a() {
    }

    @Override // defpackage.ps3
    public final void b(pn5 pn5Var) {
        try {
            this.c.h1(pn5Var, new bt3(this));
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.ps3
    public final void d() {
        try {
            this.c.t2(new ct3(this));
            this.c.S(new va0(null));
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}