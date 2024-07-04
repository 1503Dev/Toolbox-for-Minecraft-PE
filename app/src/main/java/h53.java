package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;

/* renamed from: h53  reason: default package */
public final class h53 extends t63 {
    public final Context P;
    public final xv2 Q;
    public final zq3 R;
    public final g14 S;
    public final f64 T;
    public final jt3 U;
    public final qt2 V;
    public final ar3 W;
    public final cu3 X;
    public final gc2 Y;
    public final rm4 Z;
    public final kj4 a0;
    public final y92 b0;
    public boolean c0 = false;

    public h53(Context context, xv2 xv2Var, zq3 zq3Var, g14 g14Var, f64 f64Var, jt3 jt3Var, qt2 qt2Var, ar3 ar3Var, cu3 cu3Var, gc2 gc2Var, rm4 rm4Var, kj4 kj4Var, y92 y92Var) {
        this.P = context;
        this.Q = xv2Var;
        this.R = zq3Var;
        this.S = g14Var;
        this.T = f64Var;
        this.U = jt3Var;
        this.V = qt2Var;
        this.W = ar3Var;
        this.X = cu3Var;
        this.Y = gc2Var;
        this.Z = rm4Var;
        this.a0 = kj4Var;
        this.b0 = y92Var;
    }

    @Override // defpackage.q73
    public final synchronized void I0(float f) {
        xk1 xk1Var = jv5.A.h;
        synchronized (xk1Var) {
            xk1Var.b = f;
        }
    }

    @Override // defpackage.q73
    public final void I2(mm4 mm4Var) {
        qt2 qt2Var = this.V;
        Context context = this.P;
        qt2Var.getClass();
        ln1 a = ht2.b(context).a();
        ((bt2) a.R).a(((kd) a.Q).a(), -1);
        if (((Boolean) w82.d.c.a(x92.g0)).booleanValue() && qt2Var.j(context) && qt2.k(context)) {
            synchronized (qt2Var.l) {
            }
        }
    }

    @Override // defpackage.q73
    public final void O0(String str) {
        if (((Boolean) w82.d.c.a(x92.V7)).booleanValue()) {
            jv5.A.g.g = str;
        }
    }

    @Override // defpackage.q73
    public final void Q1(di2 di2Var) {
        jt3 jt3Var = this.U;
        jt3Var.e.b(new hq1(4, jt3Var, di2Var), jt3Var.j);
    }

    @Override // defpackage.q73
    public final void W(String str) {
        this.T.a(str);
    }

    @Override // defpackage.q73
    public final void Z3(hw hwVar, String str) {
        String str2;
        if (hwVar == null) {
            str2 = "Wrapped context is null. Failed to open debug menu.";
        } else {
            Context context = (Context) va0.c0(hwVar);
            if (context == null) {
                str2 = "Context is null. Failed to open debug menu.";
            } else {
                y02 y02Var = new y02(context);
                y02Var.d = str;
                y02Var.e = this.Q.P;
                y02Var.b();
                return;
            }
        }
        sv2.d(str2);
    }

    @Override // defpackage.q73
    public final synchronized float b() {
        return jv5.A.h.a();
    }

    @Override // defpackage.q73
    public final String e() {
        return this.Q.P;
    }

    @Override // defpackage.q73
    public final void f2(hw hwVar, String str) {
        String str2;
        String str3;
        yk5 yk5Var;
        x92.a(this.P);
        l92 l92Var = x92.r3;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            cu5 cu5Var = jv5.A.c;
            str2 = cu5.y(this.P);
        } else {
            str2 = "";
        }
        boolean z = true;
        if (true == TextUtils.isEmpty(str2)) {
            str3 = str;
        } else {
            str3 = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) w82Var.c.a(x92.m3)).booleanValue();
        l92 l92Var2 = x92.C0;
        boolean booleanValue2 = booleanValue | ((Boolean) w82Var.c.a(l92Var2)).booleanValue();
        if (((Boolean) w82Var.c.a(l92Var2)).booleanValue()) {
            yk5Var = new yk5(4, this, (Runnable) va0.c0(hwVar));
        } else {
            yk5Var = null;
            z = booleanValue2;
        }
        if (z) {
            jv5.A.k.a(this.P, this.Q, true, null, str3, null, yk5Var, this.Z);
        }
    }

    @Override // defpackage.q73
    public final void g() {
        this.U.q = false;
    }

    @Override // defpackage.q73
    public final List h() {
        return this.U.a();
    }

    @Override // defpackage.q73
    public final void h0(boolean z) {
        try {
            gr4 f = gr4.f(this.P);
            f.f.a("paidv2_publisher_option", Boolean.valueOf(z));
            if (!z) {
                f.g();
            }
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // defpackage.q73
    public final void i2(wk2 wk2Var) {
        this.a0.c(wk2Var);
    }

    @Override // defpackage.q73
    public final synchronized void l() {
        if (this.c0) {
            sv2.g("Mobile ads is initialized already.");
            return;
        }
        x92.a(this.P);
        y92 y92Var = this.b0;
        synchronized (y92Var) {
            if (((Boolean) nb2.a.d()).booleanValue() && !y92Var.a) {
                y92Var.a = true;
            }
        }
        jv5 jv5Var = jv5.A;
        jv5Var.g.d(this.P, this.Q);
        jv5Var.i.c(this.P);
        this.c0 = true;
        this.U.b();
        f64 f64Var = this.T;
        f64Var.getClass();
        nl5 b = jv5Var.g.b();
        b.c.add(new d06(3, f64Var));
        f64Var.d.execute(new qy2(5, f64Var));
        l92 l92Var = x92.n3;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            ar3 ar3Var = this.W;
            ar3Var.getClass();
            nl5 b2 = jv5Var.g.b();
            b2.c.add(new gz1(4, ar3Var));
            ar3Var.c.execute(new b02(3, ar3Var));
        }
        this.X.c();
        if (((Boolean) w82Var.c.a(x92.M7)).booleanValue()) {
            zw2.a.execute(new g53(0, this));
        }
        if (((Boolean) w82Var.c.a(x92.y8)).booleanValue()) {
            zw2.a.execute(new qy2(1, this));
        }
        if (((Boolean) w82Var.c.a(x92.j2)).booleanValue()) {
            zw2.a.execute(new sy2(1, this));
        }
    }

    @Override // defpackage.q73
    public final void n1(og3 og3Var) {
        this.X.d(og3Var, bu3.API);
    }

    @Override // defpackage.q73
    public final synchronized void o4(boolean z) {
        xk1 xk1Var = jv5.A.h;
        synchronized (xk1Var) {
            xk1Var.a = z;
        }
    }

    @Override // defpackage.q73
    public final synchronized boolean r() {
        boolean z;
        xk1 xk1Var = jv5.A.h;
        synchronized (xk1Var) {
            z = xk1Var.a;
        }
        return z;
    }

    @Override // defpackage.q73
    public final synchronized void x2(String str) {
        x92.a(this.P);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) w82.d.c.a(x92.m3)).booleanValue()) {
                jv5.A.k.a(this.P, this.Q, true, null, str, null, null, this.Z);
            }
        }
    }
}