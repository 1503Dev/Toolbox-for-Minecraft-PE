package defpackage;

import java.io.File;

/* renamed from: wv1  reason: default package */
public final class wv1 implements zv1, wg3, nf3, i52, ug4, e74, v64 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ wv1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.zv1
    public final File a() {
        return (File) this.Q;
    }

    @Override // defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        synchronized (((th4) this.Q)) {
            ((th4) this.Q).X = null;
        }
    }

    @Override // defpackage.ug4
    public final vc3 b(tg4 tg4Var) {
        return ((df4) this.Q).c(tg4Var);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 1:
                ((rd3) obj).H0((vj3) this.Q);
                return;
            default:
                ((b53) obj).t(((bm5) this.Q).D);
                return;
        }
    }

    @Override // defpackage.e74
    public final void f(Object obj) {
        synchronized (((th4) this.Q)) {
            ((th4) this.Q).X = (yp3) obj;
            if (((Boolean) w82.d.c.a(x92.P2)).booleanValue()) {
                ((yp3) obj).r.a = ((th4) this.Q).T;
            }
            ((th4) this.Q).X.a();
        }
    }

    @Override // defpackage.i52
    public final void j(t62 t62Var) {
        t62Var.k((d62) this.Q);
    }

    public wv1(File file) {
        this.P = 0;
        this.Q = file;
    }
}