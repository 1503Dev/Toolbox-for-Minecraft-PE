package defpackage;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* renamed from: ml3  reason: default package */
public final class ml3 extends mr3 {
    public final Object P = new Object();
    @Nullable
    public final cs3 Q;
    @Nullable
    public final pl2 R;

    public ml3(@Nullable cs3 cs3Var, @Nullable pl2 pl2Var) {
        this.Q = cs3Var;
        this.R = pl2Var;
    }

    @Override // defpackage.cs3
    public final float b() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    public final float e() {
        pl2 pl2Var = this.R;
        if (pl2Var != null) {
            return pl2Var.h();
        }
        return 0.0f;
    }

    @Override // defpackage.cs3
    public final int f() {
        throw new RemoteException();
    }

    @Override // defpackage.cs3
    @Nullable
    public final iu3 g() {
        synchronized (this.P) {
            cs3 cs3Var = this.Q;
            if (cs3Var != null) {
                return cs3Var.g();
            }
            return null;
        }
    }

    @Override // defpackage.cs3
    public final float h() {
        pl2 pl2Var = this.R;
        if (pl2Var != null) {
            return pl2Var.f();
        }
        return 0.0f;
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
    public final void m3(@Nullable iu3 iu3Var) {
        synchronized (this.P) {
            cs3 cs3Var = this.Q;
            if (cs3Var != null) {
                cs3Var.m3(iu3Var);
            }
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