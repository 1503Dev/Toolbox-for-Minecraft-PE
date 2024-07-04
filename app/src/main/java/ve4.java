package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ve4  reason: default package */
public final class ve4 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public ve4(uj5 uj5Var, pe4 pe4Var, qe4 qe4Var, me4 me4Var, uj5 uj5Var2) {
        this.a = uj5Var;
        this.b = pe4Var;
        this.c = qe4Var;
        this.d = me4Var;
        this.e = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        yu2 yu2Var = (yu2) this.a.c();
        boolean booleanValue = Boolean.valueOf(((pe4) this.b).a.a.P.getBoolean("is_gbid")).booleanValue();
        boolean booleanValue2 = Boolean.valueOf(((qe4) this.c).a.a.Z).booleanValue();
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        tv2.C(((me4) this.d).a.a.S);
        return new ue4(yu2Var, booleanValue, booleanValue2, yw2Var, (ScheduledExecutorService) this.e.c());
    }
}