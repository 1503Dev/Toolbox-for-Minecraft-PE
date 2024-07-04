package defpackage;

import android.os.RemoteException;

/* renamed from: gn2  reason: default package */
public final class gn2 implements i50 {
    public final /* synthetic */ km2 P;
    public final /* synthetic */ cl2 Q;

    public gn2(km2 km2Var, cl2 cl2Var) {
        this.P = km2Var;
        this.Q = cl2Var;
    }

    @Override // defpackage.i50
    public final void c(n2 n2Var) {
        try {
            this.P.p(n2Var.a());
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }
}