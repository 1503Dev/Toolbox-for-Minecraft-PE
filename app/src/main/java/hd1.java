package defpackage;

import defpackage.tv;

/* renamed from: hd1  reason: default package */
public final class hd1 implements Runnable {
    public final /* synthetic */ rc1 P;
    public final /* synthetic */ ad1 Q;

    public hd1(ad1 ad1Var, rc1 rc1Var) {
        this.Q = ad1Var;
        this.P = rc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r10 r10Var = this.Q.p;
        ic1 ic1Var = this.P.b;
        ic1Var.l("reward_amount");
        ic1Var.q("reward_name");
        ic1Var.j("success");
        ic1Var.q("zone_id");
        ((tv.a) r10Var.a).d();
    }
}