package defpackage;

import android.os.DeadObjectException;
import defpackage.k9;

/* renamed from: p42  reason: default package */
public final class p42 implements k9.a {
    public final /* synthetic */ u42 a;

    public p42(u42 u42Var) {
        this.a = u42Var;
    }

    @Override // defpackage.k9.a
    public final void A(int i) {
        synchronized (this.a.c) {
            u42 u42Var = this.a;
            u42Var.f = null;
            u42Var.c.notifyAll();
        }
    }

    @Override // defpackage.k9.a
    public final void c0() {
        synchronized (this.a.c) {
            try {
                u42 u42Var = this.a;
                x42 x42Var = u42Var.d;
                if (x42Var != null) {
                    u42Var.f = (a52) x42Var.v();
                }
            } catch (DeadObjectException e) {
                sv2.e("Unable to obtain a cache service instance.", e);
                u42.b(this.a);
            }
            this.a.c.notifyAll();
        }
    }
}