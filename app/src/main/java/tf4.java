package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* renamed from: tf4  reason: default package */
public final class tf4 implements f74 {
    public final Context a;
    public final Executor b;
    public final q23 c;
    public final t64 d;
    public final y64 e;
    public final FrameLayout f;
    public sa2 g;
    public final bf3 h;
    public final rm4 i;
    public final xf3 j;
    public final ki4 k;
    public el4 l;

    public tf4(Context context, Executor executor, zr5 zr5Var, q23 q23Var, t64 t64Var, y64 y64Var, ki4 ki4Var, xf3 xf3Var) {
        this.a = context;
        this.b = executor;
        this.c = q23Var;
        this.d = t64Var;
        this.e = y64Var;
        this.k = ki4Var;
        this.h = q23Var.f();
        this.i = q23Var.q();
        this.f = new FrameLayout(context);
        this.j = xf3Var;
        ki4Var.b = zr5Var;
    }

    @Override // defpackage.f74
    public final boolean a() {
        el4 el4Var = this.l;
        return (el4Var == null || el4Var.isDone()) ? false : true;
    }

    @Override // defpackage.f74
    public final boolean b(pn5 pn5Var, String str, xa2 xa2Var, e74 e74Var) {
        f43 e;
        e83 e83Var;
        qm4 qm4Var;
        if (str == null) {
            sv2.d("Ad unit ID should not be null for banner ad.");
            this.b.execute(new p22(3, this));
            return false;
        } else if (a()) {
            return false;
        } else {
            l92 l92Var = x92.x7;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && pn5Var.U) {
                this.c.j().e(true);
            }
            ki4 ki4Var = this.k;
            ki4Var.c = str;
            ki4Var.a = pn5Var;
            li4 a = ki4Var.a();
            hm4 v = eb1.v(this.a, pm4.b(a), 3, pn5Var);
            if (((Boolean) tb2.c.d()).booleanValue() && this.k.b.Z) {
                t64 t64Var = this.d;
                if (t64Var != null) {
                    t64Var.p(oj4.d(7, null, null));
                }
                return false;
            }
            if (((Boolean) w82Var.c.a(x92.P6)).booleanValue()) {
                e = this.c.e();
                xc3 xc3Var = new xc3();
                xc3Var.a = this.a;
                xc3Var.b = a;
                e.e = new yc3(xc3Var);
                yg3 yg3Var = new yg3();
                yg3Var.b(this.d, this.b);
                yg3Var.c(this.d, this.b);
                e.d = new zg3(yg3Var);
                e.f = new y54(this.g);
                e.i = new jk3(wl3.h, (Object) null);
                e.g = new x93(this.h, this.j);
                e83Var = new e83(0, this.f);
            } else {
                e = this.c.e();
                xc3 xc3Var2 = new xc3();
                xc3Var2.a = this.a;
                xc3Var2.b = a;
                e.e = new yc3(xc3Var2);
                yg3 yg3Var2 = new yg3();
                yg3Var2.b(this.d, this.b);
                yg3Var2.c.add(new ii3(this.d, this.b));
                yg3Var2.c.add(new ii3(this.e, this.b));
                yg3Var2.d(this.d, this.b);
                yg3Var2.f.add(new ii3(this.d, this.b));
                yg3Var2.e.add(new ii3(this.d, this.b));
                yg3Var2.h.add(new ii3(this.d, this.b));
                yg3Var2.a(this.d, this.b);
                yg3Var2.c(this.d, this.b);
                yg3Var2.m.add(new ii3(this.d, this.b));
                e.d = new zg3(yg3Var2);
                e.f = new y54(this.g);
                e.i = new jk3(wl3.h, (Object) null);
                e.g = new x93(this.h, this.j);
                e83Var = new e83(0, this.f);
            }
            e.h = e83Var;
            g43 f = e.f();
            if (((Boolean) fb2.c.d()).booleanValue()) {
                qm4 qm4Var2 = (qm4) f.G0.c();
                qm4Var2.i(3);
                qm4Var2.c(pn5Var.e0);
                qm4Var = qm4Var2;
            } else {
                qm4Var = null;
            }
            hb3 c = f.c();
            el4 b = c.b(c.c());
            this.l = b;
            zw4.J(b, new sf4(this, e74Var, qm4Var, v, f), this.b);
            return true;
        }
    }
}