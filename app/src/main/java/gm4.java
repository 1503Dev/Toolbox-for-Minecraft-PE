package defpackage;

import android.content.Context;

/* renamed from: gm4  reason: default package */
public final class gm4 implements bi3, yd3, ei3 {
    public final qm4 P;
    public final hm4 Q;

    public gm4(Context context, qm4 qm4Var) {
        this.P = qm4Var;
        this.Q = eb1.t(context, 13);
    }

    @Override // defpackage.ei3
    public final void a() {
    }

    @Override // defpackage.ei3
    public final void c() {
        if (((Boolean) fb2.d.d()).booleanValue()) {
            qm4 qm4Var = this.P;
            hm4 hm4Var = this.Q;
            hm4Var.k0(true);
            qm4Var.b(hm4Var);
        }
    }

    @Override // defpackage.bi3
    public final void e() {
    }

    @Override // defpackage.yd3
    public final void g0(tz3 tz3Var) {
        if (((Boolean) fb2.d.d()).booleanValue()) {
            qm4 qm4Var = this.P;
            hm4 hm4Var = this.Q;
            hm4Var.H(tz3Var.c().toString());
            hm4Var.k0(false);
            qm4Var.b(hm4Var);
        }
    }

    @Override // defpackage.bi3
    public final void h() {
        if (((Boolean) fb2.d.d()).booleanValue()) {
            this.Q.f();
        }
    }
}