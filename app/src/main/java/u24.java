package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: u24  reason: default package */
public final class u24 implements e14 {
    public final d93 a;
    public final d24 b;
    public final ez4 c;
    public final pd3 d;
    public final ScheduledExecutorService e;

    public u24(d93 d93Var, d24 d24Var, pd3 pd3Var, ScheduledExecutorService scheduledExecutorService, yw2 yw2Var) {
        this.a = d93Var;
        this.b = d24Var;
        this.d = pd3Var;
        this.e = scheduledExecutorService;
        this.c = yw2Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        return ((li4) hi4Var.a.P).a() != null && this.b.a(hi4Var, yh4Var);
    }

    @Override // defpackage.e14
    public final dz4 b(final hi4 hi4Var, final yh4 yh4Var) {
        return this.c.b(new Callable() { // from class: s24
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final u24 u24Var = u24.this;
                final hi4 hi4Var2 = hi4Var;
                final yh4 yh4Var2 = yh4Var;
                n93 n93Var = (n93) u24Var.a.b(new ts1(hi4Var2, yh4Var2, null), new ln1(3, ((li4) hi4Var2.a.P).a(), new Runnable() { // from class: t24
                    @Override // java.lang.Runnable
                    public final void run() {
                        u24 u24Var2 = u24.this;
                        hi4 hi4Var3 = hi4Var2;
                        yh4 yh4Var3 = yh4Var2;
                        zw4.J(zw4.G(u24Var2.b.b(hi4Var3, yh4Var3), yh4Var3.R, TimeUnit.SECONDS, u24Var2.e), new fk(6, u24Var2), u24Var2.c);
                    }
                })).d.c();
                tv2.C(n93Var);
                return n93Var;
            }
        });
    }
}