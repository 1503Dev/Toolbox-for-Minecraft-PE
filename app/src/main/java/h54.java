package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: h54  reason: default package */
public final class h54 implements k14 {
    public final Context a;
    public final Executor b;
    public final bq3 c;

    public h54(Context context, Executor executor, bq3 bq3Var) {
        this.a = context;
        this.b = executor;
        this.c = bq3Var;
    }

    public static final void c(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        try {
            mj4 mj4Var = (mj4) h14Var.b;
            pn5 pn5Var = ((li4) hi4Var.a.P).d;
            String jSONObject = yh4Var.v.toString();
            mj4Var.getClass();
            mj4Var.a.I3(pn5Var, jSONObject);
        } catch (Exception e) {
            sv2.h("Fail to load ad from adapter ".concat(String.valueOf(h14Var.a)), e);
        }
    }

    @Override // defpackage.k14
    public final Object a(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        w43 b = this.c.b(new ts1(hi4Var, yh4Var, h14Var.a), new aq3(new si3(h14Var)));
        b.u().Q0(new u63((mj4) h14Var.b), this.b);
        he3 v = b.v();
        ld3 j = b.j();
        xe3 t = b.t();
        wi3 p = b.p();
        x24 x24Var = (x24) h14Var.c;
        g54 g54Var = new g54(t, j, v, p);
        synchronized (x24Var) {
            x24Var.P = g54Var;
        }
        return b.r();
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        if (!((mj4) h14Var.b).a()) {
            f54 f54Var = new f54(this, hi4Var, yh4Var, h14Var);
            x24 x24Var = (x24) h14Var.c;
            synchronized (x24Var) {
                x24Var.R = f54Var;
            }
            mj4 mj4Var = (mj4) h14Var.b;
            Context context = this.a;
            pn5 pn5Var = ((li4) hi4Var.a.P).d;
            pr2 pr2Var = (pr2) h14Var.c;
            String jSONObject = yh4Var.v.toString();
            mj4Var.getClass();
            try {
                mj4Var.a.U3(new va0(context), pn5Var, pr2Var, jSONObject);
                return;
            } catch (Throwable th) {
                throw new ni4(th);
            }
        }
        c(hi4Var, yh4Var, h14Var);
    }
}