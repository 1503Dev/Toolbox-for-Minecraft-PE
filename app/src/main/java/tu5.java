package defpackage;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: tu5  reason: default package */
public abstract class tu5 extends nu5 {
    public final HashMap h = new HashMap();
    public Handler i;
    public bf5 j;

    @Override // defpackage.nu5
    public final void k() {
        for (su5 su5Var : this.h.values()) {
            su5Var.a.j(su5Var.b);
        }
    }

    @Override // defpackage.nu5
    public final void l() {
        for (su5 su5Var : this.h.values()) {
            su5Var.a.c(su5Var.b);
        }
    }

    @Override // defpackage.nu5
    public void o() {
        for (su5 su5Var : this.h.values()) {
            su5Var.a.f(su5Var.b);
            su5Var.a.d(su5Var.c);
            su5Var.a.a(su5Var.c);
        }
        this.h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ru5, pv5] */
    public final void p(final Integer num, qv5 qv5Var) {
        tv2.G(!this.h.containsKey(num));
        ?? r0 = new pv5() { // from class: ru5
            @Override // defpackage.pv5
            public final void a(qv5 qv5Var2, kd3 kd3Var) {
                tu5.this.v(num, qv5Var2, kd3Var);
            }
        };
        ak2 ak2Var = new ak2(this, num);
        this.h.put(num, new su5(qv5Var, r0, ak2Var));
        Handler handler = this.i;
        handler.getClass();
        qv5Var.i(handler, ak2Var);
        Handler handler2 = this.i;
        handler2.getClass();
        qv5Var.b(handler2, ak2Var);
        bf5 bf5Var = this.j;
        wp5 wp5Var = this.g;
        tv2.B(wp5Var);
        qv5Var.e(r0, bf5Var, wp5Var);
        if (!(!this.b.isEmpty())) {
            qv5Var.j(r0);
        }
    }

    public void q(Object obj) {
    }

    public void s(long j, Object obj) {
    }

    public abstract ov5 t(Object obj, ov5 ov5Var);

    public abstract void v(Object obj, qv5 qv5Var, kd3 kd3Var);
}