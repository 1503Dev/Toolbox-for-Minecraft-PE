package defpackage;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: d83  reason: default package */
public final class d83 extends e42 {
    public final c83 P;
    public final pq2 Q;
    public final if4 R;
    public boolean S = false;

    public d83(c83 c83Var, qf4 qf4Var, if4 if4Var) {
        this.P = c83Var;
        this.Q = qf4Var;
        this.R = if4Var;
    }

    @Override // defpackage.f42
    public final void N0(hw hwVar, m42 m42Var) {
        try {
            this.R.S.set(m42Var);
            this.P.c((Activity) va0.c0(hwVar), this.S);
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.f42
    public final mq3 e() {
        if (!((Boolean) w82.d.c.a(x92.J5)).booleanValue()) {
            return null;
        }
        return this.P.f;
    }
}