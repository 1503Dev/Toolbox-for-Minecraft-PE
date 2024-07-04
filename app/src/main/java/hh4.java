package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: hh4  reason: default package */
public final class hh4 implements f74 {
    public final Context a;
    public final Executor b;
    public final q23 c;
    public final t64 d;
    public final mh4 e;
    public sa2 f;
    public final rm4 g;
    public final ki4 h;
    public el4 i;

    public hh4(Context context, Executor executor, q23 q23Var, t64 t64Var, mh4 mh4Var, ki4 ki4Var) {
        this.a = context;
        this.b = executor;
        this.c = q23Var;
        this.d = t64Var;
        this.h = ki4Var;
        this.e = mh4Var;
        this.g = q23Var.q();
    }

    @Override // defpackage.f74
    public final boolean a() {
        el4 el4Var = this.i;
        return (el4Var == null || el4Var.isDone()) ? false : true;
    }

    @Override // defpackage.f74
    public final boolean b(pn5 pn5Var, String str, xa2 xa2Var, e74 e74Var) {
        s43 f;
        qm4 qm4Var;
        if (str == null) {
            sv2.d("Ad unit ID should not be null for interstitial ad.");
            this.b.execute(new rh2(3, this));
            return false;
        } else if (a()) {
            return false;
        } else {
            l92 l92Var = x92.x7;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && pn5Var.U) {
                this.c.j().e(true);
            }
            zr5 zr5Var = ((ah4) xa2Var).P;
            ki4 ki4Var = this.h;
            ki4Var.c = str;
            ki4Var.b = zr5Var;
            ki4Var.a = pn5Var;
            li4 a = ki4Var.a();
            hm4 v = eb1.v(this.a, pm4.b(a), 4, pn5Var);
            if (((Boolean) w82Var.c.a(x92.R6)).booleanValue()) {
                p43 g = this.c.g();
                xc3 xc3Var = new xc3();
                xc3Var.a = this.a;
                xc3Var.b = a;
                g.e = new yc3(xc3Var);
                yg3 yg3Var = new yg3();
                yg3Var.b(this.d, this.b);
                yg3Var.c(this.d, this.b);
                g.d = new zg3(yg3Var);
                g.f = new y54(this.f);
                f = g.f();
            } else {
                yg3 yg3Var2 = new yg3();
                mh4 mh4Var = this.e;
                if (mh4Var != null) {
                    yg3Var2.e.add(new ii3(mh4Var, this.b));
                    yg3Var2.h.add(new ii3(this.e, this.b));
                    yg3Var2.a(this.e, this.b);
                }
                p43 g2 = this.c.g();
                xc3 xc3Var2 = new xc3();
                xc3Var2.a = this.a;
                xc3Var2.b = a;
                g2.e = new yc3(xc3Var2);
                yg3Var2.b(this.d, this.b);
                yg3Var2.e.add(new ii3(this.d, this.b));
                yg3Var2.h.add(new ii3(this.d, this.b));
                yg3Var2.a(this.d, this.b);
                yg3Var2.c.add(new ii3(this.d, this.b));
                yg3Var2.d(this.d, this.b);
                yg3Var2.c(this.d, this.b);
                yg3Var2.m.add(new ii3(this.d, this.b));
                yg3Var2.l.add(new ii3(this.d, this.b));
                g2.d = new zg3(yg3Var2);
                g2.f = new y54(this.f);
                f = g2.f();
            }
            s43 s43Var = f;
            if (((Boolean) fb2.c.d()).booleanValue()) {
                qm4 qm4Var2 = (qm4) s43Var.T.c();
                qm4Var2.i(4);
                qm4Var2.c(pn5Var.e0);
                qm4Var = qm4Var2;
            } else {
                qm4Var = null;
            }
            hb3 a2 = s43Var.a();
            el4 b = a2.b(a2.c());
            this.i = b;
            zw4.J(b, new dh4(this, e74Var, qm4Var, v, s43Var), this.b);
            return true;
        }
    }
}