package defpackage;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: b42  reason: default package */
public final class b42 extends u6 {
    public final f42 a;
    public final c42 b = new c42();

    public b42(f42 f42Var) {
        this.a = f42Var;
    }

    @Override // defpackage.u6
    public final rl0 a() {
        mq3 mq3Var;
        try {
            mq3Var = this.a.e();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            mq3Var = null;
        }
        return new rl0(mq3Var);
    }

    @Override // defpackage.u6
    public final void c(Activity activity) {
        try {
            this.a.N0(new va0(activity), this.b);
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}