package defpackage;

import java.util.Map;

/* renamed from: dw3  reason: default package */
public final class dw3 implements fw3 {
    public final Map a;
    public final ez4 b;
    public final df3 c;

    public dw3(Map map, yw2 yw2Var, df3 df3Var) {
        this.a = map;
        this.b = yw2Var;
        this.c = df3Var;
    }

    @Override // defpackage.fw3
    public final dz4 a(rq2 rq2Var) {
        this.c.q0(rq2Var);
        vx4 yy4Var = new yy4(new vu3(3));
        for (String str : ((String) w82.d.c.a(x92.S6)).split(",")) {
            uj5 uj5Var = (uj5) this.a.get(str.trim());
            if (uj5Var != null) {
                yy4Var = zw4.B(yy4Var, vu3.class, new dk2(1, uj5Var, rq2Var), this.b);
            }
        }
        zw4.J(yy4Var, new ee4(6, this), zw2.f);
        return yy4Var;
    }
}