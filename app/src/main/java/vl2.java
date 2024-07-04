package defpackage;

import android.os.RemoteException;

/* renamed from: vl2  reason: default package */
public final class vl2 implements i50 {
    public final /* synthetic */ cl2 P;
    public final /* synthetic */ zl2 Q;

    public vl2(zl2 zl2Var, cl2 cl2Var) {
        this.Q = zl2Var;
        this.P = cl2Var;
    }

    @Override // defpackage.i50
    public final void c(n2 n2Var) {
        try {
            String canonicalName = this.Q.P.getClass().getCanonicalName();
            int i = n2Var.a;
            String str = n2Var.b;
            String str2 = n2Var.c;
            sv2.b(canonicalName + "failed to load mediation ad: ErrorCode = " + i + ". ErrorMessage = " + str + ". ErrorDomain = " + str2);
            this.P.P2(n2Var.a());
            this.P.x1(n2Var.a, n2Var.b);
            this.P.v(n2Var.a);
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }
}