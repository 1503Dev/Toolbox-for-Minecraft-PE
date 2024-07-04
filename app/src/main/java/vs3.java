package defpackage;

/* renamed from: vs3  reason: default package */
public final class vs3 {
    public final gh2 a;

    public vs3(gh2 gh2Var) {
        this.a = gh2Var;
    }

    public final void a(long j) {
        us3 us3Var = new us3("interstitial");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onNativeAdObjectNotAvailable";
        d(us3Var);
    }

    public final void b(long j) {
        us3 us3Var = new us3("creation");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "nativeObjectNotCreated";
        d(us3Var);
    }

    public final void c(long j) {
        us3 us3Var = new us3("rewarded");
        us3Var.a = Long.valueOf(j);
        us3Var.c = "onNativeAdObjectNotAvailable";
        d(us3Var);
    }

    public final void d(us3 us3Var) {
        String a = us3.a(us3Var);
        sv2.f("Dispatching AFMA event on publisher webview: ".concat(a));
        this.a.z(a);
    }
}