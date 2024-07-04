package defpackage;

import android.content.Context;

/* renamed from: zu3  reason: default package */
public final class zu3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public zu3(gv3 gv3Var, dy3 dy3Var) {
        v22 v22Var = gw.Z;
        zk4 zk4Var = lp5.R;
        this.a = v22Var;
        this.b = zk4Var;
        this.c = gv3Var;
        this.d = dy3Var;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final yu3 c() {
        yw2 yw2Var = zw2.b;
        tv2.C(yw2Var);
        yw2 yw2Var2 = zw2.a;
        tv2.C(yw2Var2);
        return new yu3(yw2Var, yw2Var2, new uv3((Context) ((gv3) this.c).a.c()), kj5.a(this.d));
    }
}