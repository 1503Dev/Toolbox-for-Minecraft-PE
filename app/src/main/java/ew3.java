package defpackage;

import java.util.Map;

/* renamed from: ew3  reason: default package */
public final class ew3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public ew3(uj5 uj5Var, ef3 ef3Var) {
        zk4 zk4Var = lp5.R;
        this.a = uj5Var;
        this.b = zk4Var;
        this.c = ef3Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Map map = ((qj5) this.a).a;
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new dw3(map, yw2Var, new df3(((sj5) ((ef3) this.c).a).c()));
    }
}