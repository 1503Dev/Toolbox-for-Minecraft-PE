package defpackage;

import java.security.interfaces.ECPrivateKey;

/* renamed from: k45  reason: default package */
public final class k45 extends k65 {
    public k45() {
        super(xz4.class);
    }

    @Override // defpackage.k65
    public final /* bridge */ /* synthetic */ Object a(nf5 nf5Var) {
        y95 y95Var = (y95) nf5Var;
        w95 x = y95Var.A().x();
        ca5 A = x.A();
        ECPrivateKey d = cc5.d(y95Var.B().g(), v45.c(A.B()));
        w45 w45Var = new w45(x.w().z());
        byte[] g = A.z().g();
        String b = v45.b(A.C());
        v45.d(x.E());
        return new y33(d, g, b, w45Var);
    }
}