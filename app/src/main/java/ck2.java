package defpackage;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: ck2  reason: default package */
public final class ck2 implements ky4 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ck2(rj2 rj2Var, String str, xj2 xj2Var, wj2 wj2Var) {
        this.d = rj2Var;
        this.e = str;
        this.c = xj2Var;
        this.b = wj2Var;
    }

    public final dz4 a(Object obj) {
        bx2 bx2Var = new bx2();
        jj2 a = ((rj2) this.d).a();
        a.d(new ak2(this, a, obj, bx2Var), new x93(bx2Var, a, 0));
        return bx2Var;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        switch (this.a) {
            case 0:
                return a(obj);
            default:
                ow3 ow3Var = (ow3) this.b;
                gw3 gw3Var = (gw3) obj;
                ow3Var.getClass();
                return zw4.F(((nw3) this.c).d((rq2) this.d), (ky4) this.e, ow3Var.a);
        }
    }

    public /* synthetic */ ck2(ow3 ow3Var, nw3 nw3Var, rq2 rq2Var, ky4 ky4Var) {
        this.b = ow3Var;
        this.c = nw3Var;
        this.d = rq2Var;
        this.e = ky4Var;
    }
}