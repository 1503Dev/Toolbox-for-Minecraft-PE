package defpackage;

import android.os.RemoteException;

/* renamed from: kn2  reason: default package */
public final class kn2 implements i50 {
    public Object P;
    public Object Q;
    public Object R;

    public /* synthetic */ kn2() {
    }

    public /* synthetic */ kn2(ln2 ln2Var, wm2 wm2Var, cl2 cl2Var) {
        this.R = ln2Var;
        this.P = wm2Var;
        this.Q = cl2Var;
    }

    public /* synthetic */ kn2(w33 w33Var) {
        this.P = w33Var;
    }

    @Override // defpackage.i50
    public final void c(n2 n2Var) {
        try {
            ((wm2) this.P).p(n2Var.a());
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }
}