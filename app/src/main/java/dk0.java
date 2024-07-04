package defpackage;

import java.io.IOException;

/* renamed from: dk0  reason: default package */
public final class dk0 implements tb {
    public final /* synthetic */ uk0 a;
    public final /* synthetic */ ek0 b;

    public dk0(ek0 ek0Var, uk0 uk0Var) {
        this.b = ek0Var;
        this.a = uk0Var;
    }

    @Override // defpackage.tb
    public final void onFailure(ob obVar, IOException iOException) {
        this.b.c(iOException, null);
    }

    @Override // defpackage.tb
    public final void onResponse(ob obVar, nl0 nl0Var) {
        dy.a.getClass();
        hp hpVar = nl0Var.b0;
        try {
            this.b.a(nl0Var, hpVar);
            d11 d11Var = hpVar.a;
            if (!d11Var.n) {
                d11Var.n = true;
                d11Var.e.m();
                zj0 h = hpVar.d.h();
                h.e.setSoTimeout(0);
                h.h();
                yj0 yj0Var = new yj0(h.i, h.j, hpVar);
                try {
                    this.b.d("OkHttp WebSocket " + this.a.a.o(), yj0Var);
                    ek0 ek0Var = this.b;
                    ek0Var.b.onOpen(ek0Var, nl0Var);
                    this.b.e();
                    return;
                } catch (Exception e) {
                    this.b.c(e, null);
                    return;
                }
            }
            throw new IllegalStateException();
        } catch (IOException e2) {
            if (hpVar != null) {
                hpVar.a(true, true, null);
            }
            this.b.c(e2, nl0Var);
            c31.c(nl0Var);
        }
    }
}