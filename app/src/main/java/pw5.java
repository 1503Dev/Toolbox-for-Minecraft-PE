package defpackage;

import android.net.Uri;
import android.os.Looper;

/* renamed from: pw5  reason: default package */
public final class pw5 extends nu5 {
    public final el2 h;
    public final gg2 i;
    public final iu4 j;
    public final ns5 k;
    public final int l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public bf5 q;
    public final ij2 r;

    public /* synthetic */ pw5(el2 el2Var, iu4 iu4Var, ij2 ij2Var, ea2 ea2Var, int i) {
        ga1 ga1Var = ns5.O;
        gg2 gg2Var = el2Var.b;
        gg2Var.getClass();
        this.i = gg2Var;
        this.h = el2Var;
        this.j = iu4Var;
        this.r = ij2Var;
        this.k = ga1Var;
        this.l = i;
        this.m = true;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.qv5
    public final void Y() {
    }

    @Override // defpackage.qv5
    public final nv5 g(ov5 ov5Var, jz5 jz5Var, long j) {
        fv4 mo4a = this.j.mo4a();
        bf5 bf5Var = this.q;
        if (bf5Var != null) {
            mo4a.c(bf5Var);
        }
        Uri uri = this.i.a;
        ij2 ij2Var = this.r;
        tv2.B(this.g);
        return new mw5(uri, mo4a, new ou5((pk1) ij2Var.Q), this.k, new js5(this.d.b, ov5Var), new sv5(this.c.b, ov5Var), this, jz5Var, this.l);
    }

    @Override // defpackage.qv5
    public final void h(nv5 nv5Var) {
        vw5[] vw5VarArr;
        mw5 mw5Var = (mw5) nv5Var;
        if (mw5Var.g0) {
            for (vw5 vw5Var : mw5Var.d0) {
                vw5Var.i();
                if (vw5Var.A != null) {
                    vw5Var.A = null;
                    vw5Var.f = null;
                }
            }
        }
        rz5 rz5Var = mw5Var.V;
        oz5 oz5Var = rz5Var.b;
        if (oz5Var != null) {
            oz5Var.b(true);
        }
        rz5Var.a.execute(new xj1(6, mw5Var));
        rz5Var.a.shutdown();
        mw5Var.a0.removeCallbacksAndMessages(null);
        mw5Var.b0 = null;
        mw5Var.w0 = true;
    }

    @Override // defpackage.nu5
    public final void m(bf5 bf5Var) {
        this.q = bf5Var;
        Looper.myLooper().getClass();
        tv2.B(this.g);
        q();
    }

    @Override // defpackage.nu5
    public final void o() {
    }

    public final void p(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        if (!this.m && this.n == j && this.o == z && this.p == z2) {
            return;
        }
        this.n = j;
        this.o = z;
        this.p = z2;
        this.m = false;
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [nw5] */
    /* JADX WARN: Type inference failed for: r9v0, types: [pw5, nu5] */
    public final void q() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        el2 el2Var = this.h;
        fx5 fx5Var = new fx5(j, j, z, el2Var, z2 ? el2Var.c : null);
        if (this.m) {
            fx5Var = new nw5(fx5Var);
        }
        n(fx5Var);
    }

    @Override // defpackage.qv5
    public final el2 r() {
        return this.h;
    }
}