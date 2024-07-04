package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: eq5  reason: default package */
public final class eq5 implements i50 {
    public final Object P;
    public final Object Q;

    public /* synthetic */ eq5(Context context, ug0 ug0Var) {
        this.P = context;
        this.Q = new mp5(this, ug0Var);
    }

    public /* synthetic */ eq5(nm2 nm2Var, cl2 cl2Var) {
        this.P = nm2Var;
        this.Q = cl2Var;
    }

    @Override // defpackage.i50
    public final void c(n2 n2Var) {
        try {
            ((nm2) this.P).p(n2Var.a());
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }
}