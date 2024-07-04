package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* renamed from: sf4  reason: default package */
public final class sf4 implements wy4 {
    public final /* synthetic */ e74 P;
    public final /* synthetic */ qm4 Q;
    public final /* synthetic */ hm4 R;
    public final /* synthetic */ d93 S;
    public final /* synthetic */ tf4 T;

    public sf4(tf4 tf4Var, e74 e74Var, qm4 qm4Var, hm4 hm4Var, g43 g43Var) {
        this.T = tf4Var;
        this.P = e74Var;
        this.Q = qm4Var;
        this.R = hm4Var;
        this.S = g43Var;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        qm4 qm4Var;
        h83 h83Var = (h83) obj;
        synchronized (this.T) {
            try {
                tf4 tf4Var = this.T;
                tf4Var.l = null;
                tf4Var.f.removeAllViews();
                if (h83Var.c() != null) {
                    ViewParent parent = h83Var.c().getParent();
                    if (parent instanceof ViewGroup) {
                        String str = "";
                        gd3 gd3Var = h83Var.f;
                        if (gd3Var != null) {
                            str = gd3Var.P;
                        }
                        sv2.g("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(h83Var.c());
                    }
                }
                l92 l92Var = x92.P6;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    nj2 nj2Var = h83Var.g.P;
                    tf4 tf4Var2 = this.T;
                    t64 t64Var = tf4Var2.d;
                    Object obj2 = nj2Var.Q;
                    ((of3) obj2).Q = t64Var;
                    ((of3) obj2).R = tf4Var2.e;
                }
                this.T.f.addView(h83Var.c());
                this.P.f(h83Var);
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    tf4 tf4Var3 = this.T;
                    Executor executor = tf4Var3.b;
                    t64 t64Var2 = tf4Var3.d;
                    t64Var2.getClass();
                    executor.execute(new ty2(2, t64Var2));
                }
                this.T.h.S0(h83Var.b());
                if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                    qm4Var.g(h83Var.a.b);
                    qm4Var.f(h83Var.f.P);
                    hm4 hm4Var = this.R;
                    hm4Var.k0(true);
                    qm4Var.b(hm4Var);
                    qm4Var.h();
                } else {
                    rm4 rm4Var = this.T.i;
                    hm4 hm4Var2 = this.R;
                    hm4Var2.c(h83Var.a.b);
                    hm4Var2.P(h83Var.f.P);
                    hm4Var2.k0(true);
                    rm4Var.c(hm4Var2.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        int i;
        qm4 qm4Var;
        tz3 a = this.S.c().a(th);
        synchronized (this.T) {
            this.T.l = null;
            this.S.d().p(a);
            if (((Boolean) w82.d.c.a(x92.P6)).booleanValue()) {
                this.T.b.execute(new ow2(2, this, a));
            }
            tf4 tf4Var = this.T;
            bf3 bf3Var = tf4Var.h;
            xf3 xf3Var = tf4Var.j;
            synchronized (xf3Var) {
                i = xf3Var.P;
            }
            bf3Var.S0(i);
            lj4.b(a.P, "BannerAdLoader.onFailure", th);
            this.P.mo1a();
            if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                qm4Var.d(a);
                hm4 hm4Var = this.R;
                hm4Var.b(th);
                hm4Var.k0(false);
                qm4Var.b(hm4Var);
                qm4Var.h();
            } else {
                rm4 rm4Var = this.T.i;
                hm4 hm4Var2 = this.R;
                hm4Var2.p(a);
                hm4Var2.b(th);
                hm4Var2.k0(false);
                rm4Var.c(hm4Var2.n());
            }
        }
    }
}