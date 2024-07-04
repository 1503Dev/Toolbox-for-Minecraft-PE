package defpackage;

import android.os.RemoteException;

/* renamed from: vh4  reason: default package */
public final class vh4 implements sb0 {
    public final /* synthetic */ wt2 P;
    public final /* synthetic */ wh4 Q;

    public vh4(wh4 wh4Var, wt2 wt2Var) {
        this.Q = wh4Var;
        this.P = wt2Var;
    }

    @Override // defpackage.sb0
    public final void a() {
        if (this.Q.S != null) {
            try {
                this.P.b();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }
}