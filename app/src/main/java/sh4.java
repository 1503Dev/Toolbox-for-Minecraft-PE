package defpackage;

import android.os.RemoteException;

/* renamed from: sh4  reason: default package */
public final class sh4 implements sb0 {
    public final /* synthetic */ vi3 P;
    public final /* synthetic */ th4 Q;

    public sh4(th4 th4Var, vi3 vi3Var) {
        this.Q = th4Var;
        this.P = vi3Var;
    }

    @Override // defpackage.sb0
    public final void a() {
        if (this.Q.X != null) {
            try {
                this.P.b();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }
}