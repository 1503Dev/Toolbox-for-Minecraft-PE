package defpackage;

import javax.annotation.ParametersAreNonnullByDefault;

/* renamed from: xp3  reason: default package */
public final class xp3 implements zg2 {
    public final he3 P;
    public final qr2 Q;
    public final String R;
    public final String S;

    public xp3(he3 he3Var, yh4 yh4Var) {
        this.P = he3Var;
        this.Q = yh4Var.l;
        this.R = yh4Var.j;
        this.S = yh4Var.k;
    }

    @Override // defpackage.zg2
    @ParametersAreNonnullByDefault
    public final void E(qr2 qr2Var) {
        int i;
        String str;
        qr2 qr2Var2 = this.Q;
        if (qr2Var2 != null) {
            qr2Var = qr2Var2;
        }
        if (qr2Var != null) {
            str = qr2Var.P;
            i = qr2Var.Q;
        } else {
            i = 1;
            str = "";
        }
        ar2 ar2Var = new ar2(str, i);
        he3 he3Var = this.P;
        String str2 = this.R;
        String str3 = this.S;
        he3Var.getClass();
        he3Var.R0(new fe3(ar2Var, str2, str3));
    }

    @Override // defpackage.zg2
    public final void c() {
        this.P.R0(dt4.S);
    }

    @Override // defpackage.zg2
    public final void d() {
        this.P.R0(new wg3() { // from class: ge3
            @Override // defpackage.wg3
            /* renamed from: e */
            public final void mo0e(Object obj) {
                ((nd3) obj).m();
            }
        });
    }
}