package defpackage;

import android.os.SystemClock;

/* renamed from: wy3  reason: default package */
public final class wy3 implements vh3 {
    public final String R;
    public final wl4 S;
    public boolean P = false;
    public boolean Q = false;
    public final nl5 T = jv5.A.g.b();

    public wy3(String str, wl4 wl4Var) {
        this.R = str;
        this.S = wl4Var;
    }

    @Override // defpackage.vh3
    public final void B(String str, String str2) {
        wl4 wl4Var = this.S;
        vl4 a = a("adapter_init_finished");
        a.a("ancn", str);
        a.a("rqe", str2);
        wl4Var.a(a);
    }

    @Override // defpackage.vh3
    public final void H(String str) {
        wl4 wl4Var = this.S;
        vl4 a = a("adapter_init_started");
        a.a("ancn", str);
        wl4Var.a(a);
    }

    @Override // defpackage.vh3
    public final void P(String str) {
        wl4 wl4Var = this.S;
        vl4 a = a("adapter_init_finished");
        a.a("ancn", str);
        wl4Var.a(a);
    }

    public final vl4 a(String str) {
        String str2;
        if (this.T.C()) {
            str2 = "";
        } else {
            str2 = this.R;
        }
        vl4 b = vl4.b(str);
        jv5.A.j.getClass();
        b.a("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        b.a("tid", str2);
        return b;
    }

    @Override // defpackage.vh3
    public final synchronized void b() {
        if (this.Q) {
            return;
        }
        this.S.a(a("init_finished"));
        this.Q = true;
    }

    @Override // defpackage.vh3
    public final synchronized void e() {
        if (this.P) {
            return;
        }
        this.S.a(a("init_started"));
        this.P = true;
    }

    @Override // defpackage.vh3
    public final void m(String str) {
        wl4 wl4Var = this.S;
        vl4 a = a("aaia");
        a.a("aair", "MalformedJson");
        wl4Var.a(a);
    }
}