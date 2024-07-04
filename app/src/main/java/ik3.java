package defpackage;

import java.util.Map;

/* renamed from: ik3  reason: default package */
public final class ik3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public ik3(uj5 uj5Var, uj5 uj5Var2, oj5 oj5Var, uj5 uj5Var3, mk3 mk3Var) {
        this.a = uj5Var;
        this.b = uj5Var2;
        this.c = oj5Var;
        this.d = uj5Var3;
        this.e = mk3Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Map c = ((oj5) this.a).c();
        Map c2 = ((oj5) this.b).c();
        Map c3 = ((oj5) this.c).c();
        uj5 uj5Var = this.d;
        wl3 wl3Var = (wl3) ((mk3) this.e).a.P;
        tv2.C(wl3Var);
        return new hk3(c, c2, c3, uj5Var, wl3Var);
    }
}