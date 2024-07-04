package defpackage;

import java.util.Map;

/* renamed from: fk2  reason: default package */
public final class fk2 extends gv1 {
    public final bx2 b0;
    public final rv2 c0;

    public fk2(String str, bx2 bx2Var) {
        super(0, str, new u04(1, bx2Var));
        this.b0 = bx2Var;
        rv2 rv2Var = new rv2();
        this.c0 = rv2Var;
        if (rv2.c()) {
            rv2Var.d("onNetworkRequest", new pv2(str, "GET", null, null));
        }
    }

    @Override // defpackage.gv1
    public final lv1 b(yu1 yu1Var) {
        return new lv1(yu1Var, bw1.b(yu1Var));
    }

    @Override // defpackage.gv1
    public final void h(Object obj) {
        yu1 yu1Var = (yu1) obj;
        rv2 rv2Var = this.c0;
        Map map = yu1Var.c;
        int i = yu1Var.a;
        rv2Var.getClass();
        if (rv2.c()) {
            rv2Var.d("onNetworkResponse", new nv2(i, map));
            if (i < 200 || i >= 300) {
                rv2Var.d("onNetworkRequestError", new ov2(null));
            }
        }
        rv2 rv2Var2 = this.c0;
        byte[] bArr = yu1Var.b;
        if (rv2.c() && bArr != null) {
            rv2Var2.getClass();
            rv2Var2.d("onNetworkResponseBody", new a53(bArr));
        }
        this.b0.a(yu1Var);
    }
}