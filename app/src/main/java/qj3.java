package defpackage;

/* renamed from: qj3  reason: default package */
public final class qj3 implements zp5 {
    public final xe3 P;
    public final hi3 Q;

    public qj3(xe3 xe3Var, hi3 hi3Var) {
        this.P = xe3Var;
        this.Q = hi3Var;
    }

    @Override // defpackage.zp5
    public final void A(int i) {
        this.P.A(i);
        this.Q.R0(new wg3() { // from class: gi3
            @Override // defpackage.wg3
            /* renamed from: e */
            public final void mo0e(Object obj) {
                ((ei3) obj).a();
            }
        });
    }

    @Override // defpackage.zp5
    public final void Z() {
        this.P.Z();
    }

    @Override // defpackage.zp5
    public final void b() {
        this.P.b();
    }

    @Override // defpackage.zp5
    public final void c() {
        this.P.c();
        this.Q.R0(new wg3() { // from class: fi3
            @Override // defpackage.wg3
            /* renamed from: e */
            public final void mo0e(Object obj) {
                ((ei3) obj).c();
            }
        });
    }

    @Override // defpackage.zp5
    public final void d3() {
        this.P.d3();
    }

    @Override // defpackage.zp5
    public final void n3() {
        this.P.n3();
    }
}