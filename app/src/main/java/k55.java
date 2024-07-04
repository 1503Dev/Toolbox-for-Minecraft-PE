package defpackage;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;

/* renamed from: k55  reason: default package */
public final class k55 implements d55 {
    public final bm1 P;
    public final int Q;

    public k55(bm1 bm1Var, int i) {
        this.P = bm1Var;
        this.Q = i;
    }

    public static k55 b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new k55(new bm1("HmacSha512"), 3) : new k55(new bm1("HmacSha384"), 2) : new k55(new bm1("HmacSha256"), 1);
    }

    @Override // defpackage.d55
    public final na3 a(byte[] bArr) {
        KeyPair a = cc5.a(cc5.f(this.Q));
        byte[] c = cc5.c((ECPrivateKey) a.getPrivate(), cc5.e(cc5.f(this.Q), bArr));
        byte[] g = cc5.g(cc5.f(this.Q).getCurve(), 1, ((ECPublicKey) a.getPublic()).getW());
        byte[] C = mh.C(g, bArr);
        byte[] C2 = mh.C(j55.m, c());
        bm1 bm1Var = this.P;
        int macLength = Mac.getInstance(bm1Var.a).getMacLength();
        return new na3(3, bm1Var.b(macLength, bm1Var.c(mh.C(j55.o, C2, "eae_prk".getBytes(y65.a), c), null), j55.c("shared_secret", C, C2, macLength)), g);
    }

    @Override // defpackage.d55
    public final byte[] c() {
        int i = this.Q - 1;
        return i != 0 ? i != 1 ? j55.e : j55.d : j55.c;
    }
}