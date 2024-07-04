package defpackage;

/* renamed from: bt3  reason: default package */
public final class bt3 extends cs2 {
    public final /* synthetic */ dt3 P;

    public bt3(dt3 dt3Var) {
        this.P = dt3Var;
    }

    @Override // defpackage.ds2
    public final void h() {
        dt3 dt3Var = this.P;
        vs3 vs3Var = dt3Var.b;
        long j = dt3Var.a;
        vs3Var.getClass();
        us3 us3Var = new us3("rewarded");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onRewardedAdLoaded";
        vs3Var.d(us3Var);
    }

    @Override // defpackage.ds2
    public final void p(tz3 tz3Var) {
        dt3 dt3Var = this.P;
        vs3 vs3Var = dt3Var.b;
        long j = dt3Var.a;
        int i = tz3Var.P;
        vs3Var.getClass();
        us3 us3Var = new us3("rewarded");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onRewardedAdFailedToLoad";
        us3Var.d = Integer.valueOf(i);
        vs3Var.d(us3Var);
    }

    @Override // defpackage.ds2
    public final void y(int i) {
        dt3 dt3Var = this.P;
        vs3 vs3Var = dt3Var.b;
        long j = dt3Var.a;
        vs3Var.getClass();
        us3 us3Var = new us3("rewarded");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onRewardedAdFailedToLoad";
        us3Var.d = Integer.valueOf(i);
        vs3Var.d(us3Var);
    }
}