package defpackage;

/* renamed from: ks4  reason: default package */
public final class ks4 extends hs4 {
    public final /* synthetic */ ps4 Q;

    public ks4(ps4 ps4Var) {
        this.Q = ps4Var;
    }

    @Override // defpackage.hs4
    public final void b() {
        synchronized (this.Q.f) {
            try {
                if (this.Q.k.get() > 0 && this.Q.k.decrementAndGet() > 0) {
                    this.Q.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                ps4 ps4Var = this.Q;
                if (ps4Var.m != null) {
                    ps4Var.b.c("Unbind from service.", new Object[0]);
                    ps4 ps4Var2 = this.Q;
                    ps4Var2.a.unbindService(ps4Var2.l);
                    ps4 ps4Var3 = this.Q;
                    ps4Var3.g = false;
                    ps4Var3.m = null;
                    ps4Var3.l = null;
                }
                this.Q.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}