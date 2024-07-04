package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: qy3  reason: default package */
public final class qy3 implements uf3, vj1, ae3, rd3 {
    public final Context P;
    public final jj4 Q;
    public final hi4 R;
    public final yh4 S;
    public final r04 T;
    public Boolean U;
    public final boolean V = ((Boolean) w82.d.c.a(x92.N5)).booleanValue();
    public final wl4 W;
    public final String X;

    public qy3(Context context, jj4 jj4Var, hi4 hi4Var, yh4 yh4Var, r04 r04Var, wl4 wl4Var, String str) {
        this.P = context;
        this.Q = jj4Var;
        this.R = hi4Var;
        this.S = yh4Var;
        this.T = r04Var;
        this.W = wl4Var;
        this.X = str;
    }

    @Override // defpackage.rd3
    public final void H0(vj3 vj3Var) {
        if (this.V) {
            vl4 a = a("ifts");
            a.a("reason", "exception");
            if (!TextUtils.isEmpty(vj3Var.getMessage())) {
                a.a("msg", vj3Var.getMessage());
            }
            this.W.a(a);
        }
    }

    @Override // defpackage.vj1
    public final void J() {
        if (this.S.i0) {
            d(a("click"));
        }
    }

    public final vl4 a(String str) {
        String str2;
        vl4 b = vl4.b(str);
        b.f(this.R, null);
        b.a.put("aai", this.S.w);
        b.a("request_id", this.X);
        if (!this.S.t.isEmpty()) {
            b.a("ancn", (String) this.S.t.get(0));
        }
        if (this.S.i0) {
            jv5 jv5Var = jv5.A;
            if (true != jv5Var.g.g(this.P)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            b.a("device_connectivity", str2);
            jv5Var.j.getClass();
            b.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            b.a("offline_ad", "1");
        }
        return b;
    }

    @Override // defpackage.uf3
    public final void b() {
        if (e()) {
            this.W.a(a("adapter_impression"));
        }
    }

    @Override // defpackage.rd3
    public final void c() {
        if (this.V) {
            wl4 wl4Var = this.W;
            vl4 a = a("ifts");
            a.a("reason", "blocked");
            wl4Var.a(a);
        }
    }

    public final void d(vl4 vl4Var) {
        if (this.S.i0) {
            String b = this.W.b(vl4Var);
            jv5.A.j.getClass();
            this.T.a(new s04(System.currentTimeMillis(), ((ci4) this.R.b.Q).b, b, 2));
            return;
        }
        this.W.a(vl4Var);
    }

    public final boolean e() {
        if (this.U == null) {
            synchronized (this) {
                if (this.U == null) {
                    String str = (String) w82.d.c.a(x92.d1);
                    cu5 cu5Var = jv5.A.c;
                    String y = cu5.y(this.P);
                    boolean z = false;
                    if (str != null) {
                        try {
                            z = Pattern.matches(str, y);
                        } catch (RuntimeException e) {
                            jv5.A.g.f("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    this.U = Boolean.valueOf(z);
                }
            }
        }
        return this.U.booleanValue();
    }

    @Override // defpackage.uf3
    public final void i() {
        if (e()) {
            this.W.a(a("adapter_shown"));
        }
    }

    @Override // defpackage.ae3
    public final void n() {
        if (e() || this.S.i0) {
            d(a("impression"));
        }
    }

    @Override // defpackage.rd3
    public final void p(tz3 tz3Var) {
        tz3 tz3Var2;
        if (this.V) {
            int i = tz3Var.P;
            String str = tz3Var.Q;
            if (tz3Var.R.equals("com.google.android.gms.ads") && (tz3Var2 = tz3Var.S) != null && !tz3Var2.R.equals("com.google.android.gms.ads")) {
                tz3 tz3Var3 = tz3Var.S;
                i = tz3Var3.P;
                str = tz3Var3.Q;
            }
            String a = this.Q.a(str);
            vl4 a2 = a("ifts");
            a2.a("reason", "adapter");
            if (i >= 0) {
                a2.a("arec", String.valueOf(i));
            }
            if (a != null) {
                a2.a("areec", a);
            }
            this.W.a(a2);
        }
    }
}