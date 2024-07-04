package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* renamed from: e55  reason: default package */
public final class e55 extends k65 {
    public e55() {
        super(xz4.class);
    }

    @Override // defpackage.k65
    public final Object a(nf5 nf5Var) {
        boolean z;
        pa5 pa5Var = (pa5) nf5Var;
        if (pa5Var.G()) {
            if (pa5Var.A().H()) {
                int i = 1;
                if (pa5Var.B().o() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    na5 x = pa5Var.A().x();
                    zw4.t(x);
                    zw4.v(x);
                    zw4.o(x);
                    int B = x.B();
                    int i2 = B - 2;
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                        throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zw4.n(B)));
                    }
                    int B2 = pa5Var.A().x().B() - 2;
                    if (B2 != 1) {
                        if (B2 != 2 && B2 != 3 && B2 != 4) {
                            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                        }
                        byte[] g = pa5Var.B().g();
                        byte[] g2 = pa5Var.A().C().g();
                        int B3 = pa5Var.A().x().B();
                        byte[] bArr = j55.a;
                        int i3 = B3 - 2;
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    i = 3;
                                } else {
                                    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                }
                            } else {
                                i = 2;
                            }
                        }
                        ECPublicKey e = cc5.e(cc5.f(i), g2);
                        ECPrivateKey d = cc5.d(g, i);
                        cc5.b(d, e);
                        m55.b(e.getW(), d.getParams().getCurve());
                        sc5.a(g);
                        sc5.a(g2);
                    } else {
                        byte[] g3 = pa5Var.B().g();
                        byte[] s = v32.s(g3);
                        sc5.a(g3);
                        sc5.a(s);
                    }
                    return new b55();
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }
}