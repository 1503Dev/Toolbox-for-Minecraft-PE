package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ye3  reason: default package */
public final class ye3 extends xg3 implements ae3, ve3 {
    public final yh4 Q;
    public final AtomicBoolean R;

    public ye3(Set set, yh4 yh4Var) {
        super(set);
        this.R = new AtomicBoolean();
        this.Q = yh4Var;
    }

    public final void c() {
        au5 au5Var;
        if (((Boolean) w82.d.c.a(x92.z6)).booleanValue() && this.R.compareAndSet(false, true) && (au5Var = this.Q.e0) != null && au5Var.P == 3) {
            R0(new d60(4, this));
        }
    }

    @Override // defpackage.ve3
    public final void h() {
        if (this.Q.b == 1) {
            c();
        }
    }

    @Override // defpackage.ae3
    public final void n() {
        int i = this.Q.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            c();
        }
    }
}