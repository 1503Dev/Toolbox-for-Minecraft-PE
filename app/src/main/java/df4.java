package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: df4  reason: default package */
public abstract class df4 implements f74 {
    public final Context a;
    public final Executor b;
    public final q23 c;
    public final if4 d;
    public final vg4 e;
    public final xv2 f;
    public final FrameLayout g;
    public final rm4 h;
    public final ki4 i;
    @Nullable
    public dz4 j;

    public df4(Context context, Executor executor, q23 q23Var, vg4 vg4Var, if4 if4Var, ki4 ki4Var, xv2 xv2Var) {
        this.a = context;
        this.b = executor;
        this.c = q23Var;
        this.e = vg4Var;
        this.d = if4Var;
        this.i = ki4Var;
        this.f = xv2Var;
        this.g = new FrameLayout(context);
        this.h = q23Var.q();
    }

    @Override // defpackage.f74
    public final boolean a() {
        dz4 dz4Var = this.j;
        return (dz4Var == null || dz4Var.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:15:0x0046, B:18:0x0057, B:22:0x005d, B:24:0x006d, B:26:0x0075, B:28:0x008a, B:30:0x00a1, B:32:0x00a5, B:33:0x00ae, B:12:0x003e), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[Catch: all -> 0x00f3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:15:0x0046, B:18:0x0057, B:22:0x005d, B:24:0x006d, B:26:0x0075, B:28:0x008a, B:30:0x00a1, B:32:0x00a5, B:33:0x00ae, B:12:0x003e), top: B:39:0x0001 }] */
    @Override // defpackage.f74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean b(pn5 pn5Var, String str, xa2 xa2Var, e74 e74Var) {
        boolean z;
        int i;
        m92 m92Var;
        w82 w82Var;
        qm4 qm4Var;
        if (((Boolean) kb2.d.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                z = true;
                i = this.f.R;
                m92Var = x92.L8;
                w82Var = w82.d;
                if (i >= ((Integer) w82Var.c.a(m92Var)).intValue() || !z) {
                    uf0.b("loadAd must be called on the main UI thread.");
                }
                if (str != null) {
                    sv2.d("Ad unit ID should not be null for app open ad.");
                    this.b.execute(new dd4(4, this));
                    return false;
                } else if (this.j != null) {
                    return false;
                } else {
                    if (((Boolean) fb2.c.d()).booleanValue()) {
                        vg4 vg4Var = this.e;
                        if (vg4Var.i() != null) {
                            qm4 f = ((v73) vg4Var.i()).f();
                            f.i(7);
                            f.c(pn5Var.e0);
                            qm4Var = f;
                            lj4.a(this.a, pn5Var.U);
                            if (((Boolean) w82Var.c.a(x92.x7)).booleanValue() && pn5Var.U) {
                                this.c.j().e(true);
                            }
                            ki4 ki4Var = this.i;
                            ki4Var.c = str;
                            ki4Var.b = zr5.c();
                            ki4Var.a = pn5Var;
                            li4 a = ki4Var.a();
                            hm4 v = eb1.v(this.a, pm4.b(a), 7, pn5Var);
                            cf4 cf4Var = new cf4(0);
                            cf4Var.a = a;
                            dz4 a2 = this.e.a(new wg4(cf4Var, null), new wv1(4, this));
                            this.j = a2;
                            zw4.J(a2, new bf4(this, e74Var, qm4Var, v, cf4Var), this.b);
                            return true;
                        }
                    }
                    qm4Var = null;
                    lj4.a(this.a, pn5Var.U);
                    if (((Boolean) w82Var.c.a(x92.x7)).booleanValue()) {
                        this.c.j().e(true);
                    }
                    ki4 ki4Var2 = this.i;
                    ki4Var2.c = str;
                    ki4Var2.b = zr5.c();
                    ki4Var2.a = pn5Var;
                    li4 a3 = ki4Var2.a();
                    hm4 v2 = eb1.v(this.a, pm4.b(a3), 7, pn5Var);
                    cf4 cf4Var2 = new cf4(0);
                    cf4Var2.a = a3;
                    dz4 a22 = this.e.a(new wg4(cf4Var2, null), new wv1(4, this));
                    this.j = a22;
                    zw4.J(a22, new bf4(this, e74Var, qm4Var, v2, cf4Var2), this.b);
                    return true;
                }
            }
        }
        z = false;
        i = this.f.R;
        m92Var = x92.L8;
        w82Var = w82.d;
        if (i >= ((Integer) w82Var.c.a(m92Var)).intValue()) {
        }
        uf0.b("loadAd must be called on the main UI thread.");
        if (str != null) {
        }
    }

    public final synchronized y33 c(tg4 tg4Var) {
        cf4 cf4Var = (cf4) tg4Var;
        if (((Boolean) w82.d.c.a(x92.Q6)).booleanValue()) {
            xc3 xc3Var = new xc3();
            xc3Var.a = this.a;
            xc3Var.b = cf4Var.a;
            yc3 yc3Var = new yc3(xc3Var);
            yg3 yg3Var = new yg3();
            yg3Var.l.add(new ii3(this.d, this.b));
            yg3Var.d(this.d, this.b);
            zg3 zg3Var = new zg3(yg3Var);
            y33 d = ((jf4) this).c.d();
            d.e = yc3Var;
            d.d = zg3Var;
            return d;
        }
        if4 if4Var = this.d;
        if4 if4Var2 = new if4(if4Var.P);
        if4Var2.W = if4Var;
        yg3 yg3Var2 = new yg3();
        yg3Var2.a(if4Var2, this.b);
        yg3Var2.g.add(new ii3(if4Var2, this.b));
        yg3Var2.n.add(new ii3(if4Var2, this.b));
        yg3Var2.m.add(new ii3(if4Var2, this.b));
        yg3Var2.l.add(new ii3(if4Var2, this.b));
        yg3Var2.d(if4Var2, this.b);
        yg3Var2.o = if4Var2;
        xc3 xc3Var2 = new xc3();
        xc3Var2.a = this.a;
        xc3Var2.b = cf4Var.a;
        yc3 yc3Var2 = new yc3(xc3Var2);
        zg3 zg3Var2 = new zg3(yg3Var2);
        y33 d2 = ((jf4) this).c.d();
        d2.e = yc3Var2;
        d2.d = zg3Var2;
        return d2;
    }
}