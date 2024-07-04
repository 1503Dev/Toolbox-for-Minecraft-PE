package defpackage;

import android.os.RemoteException;

/* renamed from: uy3  reason: default package */
public final class uy3 extends q2 {
    public final Object P = new Object();
    public q2 Q;
    public final /* synthetic */ c04 R;

    public uy3(c04 c04Var) {
        this.R = c04Var;
    }

    @Override // defpackage.q2
    public final void J() {
        synchronized (this.P) {
            q2 q2Var = this.Q;
            if (q2Var != null) {
                q2Var.J();
            }
        }
    }

    @Override // defpackage.q2
    public final void a() {
        synchronized (this.P) {
            q2 q2Var = this.Q;
            if (q2Var != null) {
                q2Var.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(l20 l20Var) {
        cs3 n;
        c04 c04Var = this.R;
        p31 p31Var = c04Var.c;
        pq2 pq2Var = c04Var.i;
        if (pq2Var != null) {
            try {
                n = pq2Var.n();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
            p31Var.a(n);
            synchronized (this.P) {
                q2 q2Var = this.Q;
                if (q2Var != null) {
                    q2Var.b(l20Var);
                }
            }
            return;
        }
        n = null;
        p31Var.a(n);
        synchronized (this.P) {
        }
    }

    @Override // defpackage.q2
    public final void c() {
        synchronized (this.P) {
            q2 q2Var = this.Q;
            if (q2Var != null) {
                q2Var.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        cs3 n;
        c04 c04Var = this.R;
        p31 p31Var = c04Var.c;
        pq2 pq2Var = c04Var.i;
        if (pq2Var != null) {
            try {
                n = pq2Var.n();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
            p31Var.a(n);
            synchronized (this.P) {
                q2 q2Var = this.Q;
                if (q2Var != null) {
                    q2Var.d();
                }
            }
            return;
        }
        n = null;
        p31Var.a(n);
        synchronized (this.P) {
        }
    }

    @Override // defpackage.q2
    public final void e() {
        synchronized (this.P) {
            q2 q2Var = this.Q;
            if (q2Var != null) {
                q2Var.e();
            }
        }
    }
}