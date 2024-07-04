package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: bw3  reason: default package */
public final class bw3 implements ff3 {
    public final Context P;
    public final qt2 Q;

    public bw3(Context context, qt2 qt2Var) {
        this.P = context;
        this.Q = qt2Var;
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
        if (!TextUtils.isEmpty(((ci4) hi4Var.b.Q).d)) {
            qt2 qt2Var = this.Q;
            Context context = this.P;
            pn5 pn5Var = ((li4) hi4Var.a.P).d;
            qt2Var.getClass();
            if (((Boolean) w82.d.c.a(x92.g0)).booleanValue() && qt2Var.j(context) && qt2.k(context)) {
                synchronized (qt2Var.l) {
                }
            }
            this.Q.b(this.P, "_aq", ((ci4) hi4Var.b.Q).d, null);
        }
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
    }
}