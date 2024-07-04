package defpackage;

import android.os.Bundle;

/* renamed from: gz3  reason: default package */
public final class gz3 implements le3, qd3 {
    public static final Object R = new Object();
    public static int S;
    public final f25 P;
    public final f04 Q;

    public gz3(f04 f04Var, nl5 nl5Var) {
        this.Q = f04Var;
        this.P = nl5Var;
    }

    public final void a(boolean z) {
        int i;
        int intValue;
        l92 l92Var = x92.f5;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && !this.P.C()) {
            Object obj = R;
            synchronized (obj) {
                i = S;
                intValue = ((Integer) w82Var.c.a(x92.g5)).intValue();
            }
            if (i >= intValue) {
                return;
            }
            f04 f04Var = this.Q;
            tc3 tc3Var = f04Var.S;
            zw4.J(hl4.a(tc3Var.i.a(new Bundle()), ml4.SIGNALS, tc3Var.a).a(), new e04(f04Var, z), zw2.f);
            synchronized (obj) {
                S++;
            }
        }
    }

    @Override // defpackage.le3
    public final void k() {
        a(true);
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        a(false);
    }
}