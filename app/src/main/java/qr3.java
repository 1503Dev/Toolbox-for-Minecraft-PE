package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: qr3  reason: default package */
public final class qr3 implements uf3, vj1, ae3, rd3 {
    public final Context P;
    public final jj4 Q;
    public final zr3 R;
    public final hi4 S;
    public final yh4 T;
    public final r04 U;
    public Boolean V;
    public final boolean W = ((Boolean) w82.d.c.a(x92.N5)).booleanValue();

    public qr3(Context context, jj4 jj4Var, zr3 zr3Var, hi4 hi4Var, yh4 yh4Var, r04 r04Var) {
        this.P = context;
        this.Q = jj4Var;
        this.R = zr3Var;
        this.S = hi4Var;
        this.T = yh4Var;
        this.U = r04Var;
    }

    @Override // defpackage.rd3
    public final void H0(vj3 vj3Var) {
        if (this.W) {
            yr3 a = a("ifts");
            a.a("reason", "exception");
            if (!TextUtils.isEmpty(vj3Var.getMessage())) {
                a.a("msg", vj3Var.getMessage());
            }
            a.c();
        }
    }

    @Override // defpackage.vj1
    public final void J() {
        if (this.T.i0) {
            d(a("click"));
        }
    }

    public final yr3 a(String str) {
        String str2;
        yr3 a = this.R.a();
        a.a.put("gqi", ((ci4) this.S.b.Q).b);
        a.b(this.T);
        a.a("action", str);
        boolean z = false;
        if (!this.T.t.isEmpty()) {
            a.a("ancn", (String) this.T.t.get(0));
        }
        if (this.T.i0) {
            jv5 jv5Var = jv5.A;
            if (true != jv5Var.g.g(this.P)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            a.a("device_connectivity", str2);
            jv5Var.j.getClass();
            a.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a.a("offline_ad", "1");
        }
        if (((Boolean) w82.d.c.a(x92.W5)).booleanValue()) {
            if (xi4.d((li4) this.S.a.P) != 1) {
                z = true;
            }
            a.a("scar", String.valueOf(z));
            if (z) {
                pn5 pn5Var = ((li4) this.S.a.P).d;
                String str3 = pn5Var.e0;
                if (!TextUtils.isEmpty(str3)) {
                    a.a.put("ragent", str3);
                }
                String a2 = xi4.a(xi4.b(pn5Var));
                if (!TextUtils.isEmpty(a2)) {
                    a.a.put("rtype", a2);
                }
            }
        }
        return a;
    }

    @Override // defpackage.uf3
    public final void b() {
        if (e()) {
            a("adapter_impression").c();
        }
    }

    @Override // defpackage.rd3
    public final void c() {
        if (this.W) {
            yr3 a = a("ifts");
            a.a("reason", "blocked");
            a.c();
        }
    }

    public final void d(yr3 yr3Var) {
        if (this.T.i0) {
            fs3 fs3Var = yr3Var.b.a;
            String a = fs3Var.e.a(yr3Var.a);
            jv5.A.j.getClass();
            this.U.a(new s04(System.currentTimeMillis(), ((ci4) this.S.b.Q).b, a, 2));
            return;
        }
        yr3Var.c();
    }

    public final boolean e() {
        if (this.V == null) {
            synchronized (this) {
                if (this.V == null) {
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
                    this.V = Boolean.valueOf(z);
                }
            }
        }
        return this.V.booleanValue();
    }

    @Override // defpackage.uf3
    public final void i() {
        if (e()) {
            a("adapter_shown").c();
        }
    }

    @Override // defpackage.ae3
    public final void n() {
        if (e() || this.T.i0) {
            d(a("impression"));
        }
    }

    @Override // defpackage.rd3
    public final void p(tz3 tz3Var) {
        tz3 tz3Var2;
        if (this.W) {
            yr3 a = a("ifts");
            a.a("reason", "adapter");
            int i = tz3Var.P;
            String str = tz3Var.Q;
            if (tz3Var.R.equals("com.google.android.gms.ads") && (tz3Var2 = tz3Var.S) != null && !tz3Var2.R.equals("com.google.android.gms.ads")) {
                tz3 tz3Var3 = tz3Var.S;
                i = tz3Var3.P;
                str = tz3Var3.Q;
            }
            if (i >= 0) {
                a.a("arec", String.valueOf(i));
            }
            String a2 = this.Q.a(str);
            if (a2 != null) {
                a.a("areec", a2);
            }
            a.c();
        }
    }
}