package defpackage;

import java.util.Set;

/* renamed from: hv3  reason: default package */
public final class hv3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;

    public /* synthetic */ hv3(uj5 uj5Var, int i) {
        this.a = i;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                vl4 vl4Var = new vl4();
                vl4Var.a.put("request_id", (String) this.b.c());
                return vl4Var;
            case 1:
                return new g84((Set) this.b.c());
            default:
                return new xh4((kd) this.b.c());
        }
    }
}