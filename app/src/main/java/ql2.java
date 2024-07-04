package defpackage;

import android.os.RemoteException;

/* renamed from: ql2  reason: default package */
public final class ql2 extends mr3 {
    public final Object P = new Object();
    public volatile iu3 Q;

    @Override // defpackage.cs3
    public final float b() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final float e() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final int f() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final iu3 g() {
        iu3 iu3Var;
        synchronized (this.P) {
            iu3Var = this.Q;
        }
        return iu3Var;
    }

    @Override // defpackage.cs3
    public final float h() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final void h0(boolean z) {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final void k() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final void l() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final boolean m() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final void m3(iu3 iu3Var) {
        synchronized (this.P) {
            this.Q = iu3Var;
        }
    }

    @Override // defpackage.cs3
    public final void n() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final boolean q() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final boolean t() {
        throw new RemoteException();
    }
}