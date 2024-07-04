package defpackage;

/* renamed from: zs3  reason: default package */
public final class zs3 extends me2 {
    public final /* synthetic */ vs3 P;
    public final /* synthetic */ at3 Q;

    public zs3(at3 at3Var, vs3 vs3Var) {
        this.Q = at3Var;
        this.P = vs3Var;
    }

    @Override // defpackage.gf2
    public final void d() {
        vs3 vs3Var = this.P;
        long j = this.Q.a;
        vs3Var.getClass();
        us3 us3Var = new us3("interstitial");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onAdClicked";
        vs3Var.a.z(us3.a(us3Var));
    }

    @Override // defpackage.gf2
    public final void f() {
    }

    @Override // defpackage.gf2
    public final void g() {
        vs3 vs3Var = this.P;
        long j = this.Q.a;
        vs3Var.getClass();
        us3 us3Var = new us3("interstitial");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onAdLoaded";
        vs3Var.d(us3Var);
    }

    @Override // defpackage.gf2
    public final void h() {
    }

    @Override // defpackage.gf2
    public final void i() {
        vs3 vs3Var = this.P;
        long j = this.Q.a;
        vs3Var.getClass();
        us3 us3Var = new us3("interstitial");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onAdClosed";
        vs3Var.d(us3Var);
    }

    @Override // defpackage.gf2
    public final void j() {
        vs3 vs3Var = this.P;
        long j = this.Q.a;
        vs3Var.getClass();
        us3 us3Var = new us3("interstitial");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onAdOpened";
        vs3Var.d(us3Var);
    }

    @Override // defpackage.gf2
    public final void l() {
    }

    @Override // defpackage.gf2
    public final void p(tz3 tz3Var) {
        vs3 vs3Var = this.P;
        long j = this.Q.a;
        int i = tz3Var.P;
        vs3Var.getClass();
        us3 us3Var = new us3("interstitial");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onAdFailedToLoad";
        us3Var.d = Integer.valueOf(i);
        vs3Var.d(us3Var);
    }

    @Override // defpackage.gf2
    public final void y(int i) {
        vs3 vs3Var = this.P;
        long j = this.Q.a;
        vs3Var.getClass();
        us3 us3Var = new us3("interstitial");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onAdFailedToLoad";
        us3Var.d = Integer.valueOf(i);
        vs3Var.d(us3Var);
    }
}