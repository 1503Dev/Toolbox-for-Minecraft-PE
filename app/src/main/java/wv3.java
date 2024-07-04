package defpackage;

import android.os.Binder;
import defpackage.k9;

/* renamed from: wv3  reason: default package */
public abstract class wv3 implements k9.a, k9.b {
    public final bx2 a = new bx2();
    public final Object b = new Object();
    public boolean c = false;
    public boolean d = false;
    public rq2 e;
    public op2 f;

    @Override // defpackage.k9.a
    public final void A(int i) {
        sv2.b("Cannot connect to remote service, fallback to local instance.");
    }

    public void Z(gf gfVar) {
        sv2.b("Disconnected from remote ad request service.");
        this.a.c(new gw3(1));
    }

    public final void a() {
        synchronized (this.b) {
            this.d = true;
            if (this.f.a() || this.f.g()) {
                this.f.p();
            }
            Binder.flushPendingCommands();
        }
    }
}