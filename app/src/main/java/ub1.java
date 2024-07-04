package defpackage;

/* renamed from: ub1  reason: default package */
public final class ub1 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ long R;
    public final /* synthetic */ pb1 S;

    public ub1(pb1 pb1Var, String str, String str2, long j) {
        this.S = pb1Var;
        this.P = str;
        this.Q = str2;
        this.R = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z61 z61Var;
        this.S.a.remove(this.P);
        i2 remove = this.S.c.remove(this.P);
        if (remove == null) {
            z61Var = null;
        } else {
            z61Var = remove.a;
        }
        if (z61Var != null) {
            w1.a(this.Q);
            z61Var.V0();
            ic1 ic1Var = new ic1();
            eb1.j(ic1Var, "id", this.P);
            eb1.j(ic1Var, "zone_id", this.Q);
            eb1.l(0, ic1Var, "type");
            eb1.l(26, ic1Var, "request_fail_reason");
            new rc1(1, ic1Var, "AdSession.on_request_failure").b();
            StringBuilder sb = new StringBuilder();
            sb.append("RequestNotFilled called due to a native timeout. ");
            StringBuilder b = e5.b("Timeout set to: ");
            b.append(ga1.h().S);
            b.append(" ms. ");
            sb.append(b.toString());
            sb.append("Interstitial request time allowed: " + this.R + " ms. ");
            sb.append("Interstitial with adSessionId(" + this.P + ") - request failed.");
            t1.b(0, 0, sb.toString(), true);
        }
    }
}