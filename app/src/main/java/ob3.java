package defpackage;

import java.math.BigInteger;

/* renamed from: ob3  reason: default package */
public final class ob3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public ob3(uj5 uj5Var, h33 h33Var, uj5 uj5Var2) {
        this.a = uj5Var;
        this.b = h33Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        String bigInteger;
        kd kdVar = (kd) this.a.c();
        hv2 c = ((h33) this.b).c();
        String str = ((ed3) this.c).a().f;
        av2 av2Var = c.c;
        synchronized (av2Var) {
            bigInteger = ((BigInteger) av2Var.Q).toString();
            av2Var.Q = ((BigInteger) av2Var.Q).add(BigInteger.ONE);
            av2Var.R = bigInteger;
        }
        return new ru2(kdVar, c, bigInteger, str);
    }
}