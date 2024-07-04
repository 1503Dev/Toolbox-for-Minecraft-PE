package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: xv3  reason: default package */
public final class xv3 extends wv3 {
    public xv3(Context context) {
        this.f = new op2(context, jv5.A.r.a(), this, this);
    }

    public final dz4 b(rq2 rq2Var) {
        synchronized (this.b) {
            if (this.c) {
                return this.a;
            }
            this.c = true;
            this.e = rq2Var;
            this.f.n();
            this.a.b(new j02(2, this), zw2.f);
            return this.a;
        }
    }

    @Override // defpackage.k9.a
    public final void c0() {
        bx2 bx2Var;
        gw3 gw3Var;
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    ((aq2) this.f.v()).C2(this.e, new vv3(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    bx2Var = this.a;
                    gw3Var = new gw3(1);
                    bx2Var.c(gw3Var);
                } catch (Throwable th) {
                    jv5.A.g.f("RemoteSignalsClientTask.onConnected", th);
                    bx2Var = this.a;
                    gw3Var = new gw3(1);
                    bx2Var.c(gw3Var);
                }
            }
        }
    }
}