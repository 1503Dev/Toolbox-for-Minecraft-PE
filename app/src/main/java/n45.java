package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* renamed from: n45  reason: default package */
public final class n45 extends k65 {
    public n45() {
        super(yz4.class);
    }

    @Override // defpackage.k65
    public final /* bridge */ /* synthetic */ Object a(nf5 nf5Var) {
        aa5 aa5Var = (aa5) nf5Var;
        w95 x = aa5Var.x();
        ca5 A = x.A();
        int c = v45.c(A.B());
        byte[] g = aa5Var.C().g();
        byte[] g2 = aa5Var.E().g();
        ECParameterSpec f = cc5.f(c);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, g), new BigInteger(1, g2));
        m55.b(eCPoint, f.getCurve());
        return new bc5((ECPublicKey) ((KeyFactory) gc5.f.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, f)), A.z().g(), v45.b(A.C()), v45.d(x.E()), new w45(x.w().z()));
    }
}