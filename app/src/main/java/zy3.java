package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: zy3  reason: default package */
public final class zy3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ zy3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Object obj;
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((gz3) this.b.c(), yw2Var);
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                r94 r94Var = new r94(yw2Var2);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.c();
                l92 l92Var = x92.p3;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    eb4 eb4Var = new eb4(r94Var, ((Integer) w82Var.c.a(x92.q3)).intValue(), scheduledExecutorService);
                    int i = sv4.R;
                    obj = new ax4(eb4Var);
                } else {
                    int i2 = sv4.R;
                    obj = tw4.Y;
                }
                tv2.C(obj);
                return obj;
        }
    }
}