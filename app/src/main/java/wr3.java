package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wr3  reason: default package */
public final class wr3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ wr3(uj5 uj5Var, lj5 lj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = lj5Var;
        this.d = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Object obj;
        switch (this.a) {
            case 0:
                ds3 ds3Var = (ds3) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                yy3 yy3Var = (yy3) this.d.c();
                if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
                    return new ii3(yy3Var, yw2Var);
                }
                return new ii3(ds3Var, yw2Var);
            case 1:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                tv2.C(((me4) this.d).a.a.S);
                return new ae4(yw2Var2);
            default:
                hj5 a = kj5.a(this.b);
                hj5 a2 = kj5.a(this.c);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.c();
                if (((Boolean) w82.d.c.a(x92.l7)).booleanValue()) {
                    obj = new xl4((wl4) a.c(), scheduledExecutorService);
                } else {
                    obj = (wl4) a2.c();
                }
                tv2.C(obj);
                return obj;
        }
    }
}