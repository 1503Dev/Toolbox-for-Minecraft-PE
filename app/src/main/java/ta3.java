package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ta3  reason: default package */
public final class ta3 implements zp5 {
    public final he3 P;
    public final AtomicBoolean Q = new AtomicBoolean(false);
    public final AtomicBoolean R = new AtomicBoolean(false);

    public ta3(he3 he3Var) {
        this.P = he3Var;
    }

    @Override // defpackage.zp5
    public final void A(int i) {
        this.Q.set(true);
        if (!this.R.get()) {
            this.R.set(true);
            this.P.R0(da2.R);
        }
    }

    @Override // defpackage.zp5
    public final void Z() {
    }

    @Override // defpackage.zp5
    public final void b() {
    }

    @Override // defpackage.zp5
    public final void c() {
        this.P.R0(n42.S);
    }

    @Override // defpackage.zp5
    public final void d3() {
    }

    @Override // defpackage.zp5
    public final void n3() {
        if (!this.R.get()) {
            this.R.set(true);
            this.P.R0(da2.R);
        }
    }
}