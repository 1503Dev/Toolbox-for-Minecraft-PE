package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zr1  reason: default package */
public final class zr1 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final Object d;

    public zr1(ea2 ea2Var, uj5 uj5Var) {
        zk4 zk4Var = lp5.R;
        this.a = 3;
        this.d = ea2Var;
        this.b = uj5Var;
        this.c = zk4Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                cv1 cv1Var = (cv1) this.c;
                cv1Var.getClass();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                bu1 bu1Var = new bu1(yw2Var, ((kv3) cv1Var.b).c());
                tc3 c = ((uc3) ((uj5) this.d)).c();
                return ((ol4) this.b.c()).b(c.a(), ml4.GENERATE_SIGNALS).d(bu1Var).e(((Integer) w82.d.c.a(x92.y4)).intValue(), TimeUnit.SECONDS).a();
            case 1:
                qr3 qr3Var = (qr3) this.b.c();
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                qy3 qy3Var = (qy3) ((uj5) this.d).c();
                if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
                    return new ii3(qy3Var, yw2Var2);
                }
                return new ii3(qr3Var, yw2Var2);
            case 2:
                return new vy3((vl4) this.b.c(), (wl4) this.c.c(), ((h33) ((uj5) this.d)).c());
            default:
                yw2 yw2Var3 = zw2.a;
                tv2.C(yw2Var3);
                Set L = ea2.L((os3) this.b.c(), yw2Var3);
                tv2.C(L);
                return L;
        }
    }

    public /* synthetic */ zr1(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }
}