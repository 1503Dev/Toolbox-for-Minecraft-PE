package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: zv3  reason: default package */
public final class zv3 extends wv3 {
    public String g;
    public int h = 1;

    public zv3(Context context) {
        this.f = new op2(context, jv5.A.r.a(), this, this);
    }

    @Override // defpackage.wv3, defpackage.k9.b
    public final void Z(gf gfVar) {
        sv2.b("Cannot connect to remote service, fallback to local instance.");
        this.a.c(new gw3(1));
    }

    @Override // defpackage.k9.a
    public final void c0() {
        bx2 bx2Var;
        gw3 gw3Var;
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    int i = this.h;
                    if (i == 2) {
                        ((aq2) this.f.v()).z3(this.e, new vv3(this));
                    } else if (i == 3) {
                        ((aq2) this.f.v()).l4(this.g, new vv3(this));
                    } else {
                        this.a.c(new gw3(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    bx2Var = this.a;
                    gw3Var = new gw3(1);
                    bx2Var.c(gw3Var);
                } catch (Throwable th) {
                    jv5.A.g.f("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                    bx2Var = this.a;
                    gw3Var = new gw3(1);
                    bx2Var.c(gw3Var);
                }
            }
        }
    }
}