package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: mj0  reason: default package */
public final class mj0 extends KeyFactorySpi implements n7 {
    @Override // defpackage.n7
    public final PublicKey a(nu0 nu0Var) {
        pj0 pj0Var;
        t q = nu0Var.q();
        if (q instanceof pj0) {
            pj0Var = (pj0) q;
        } else if (q != null) {
            pj0Var = new pj0(u.w(q));
        } else {
            pj0Var = null;
        }
        return new i8(pj0Var.R.x().intValue(), ja.f(pj0Var.S), ja.f(pj0Var.T), ja.c(pj0Var.U));
    }

    @Override // defpackage.n7
    public final PrivateKey b(bg0 bg0Var) {
        nj0 nj0Var;
        t q = bg0Var.q();
        if (q instanceof nj0) {
            nj0Var = (nj0) q;
        } else if (q != null) {
            nj0Var = new nj0(u.w(q));
        } else {
            nj0Var = null;
        }
        short[][] f = ja.f(nj0Var.R);
        short[] c = ja.c(nj0Var.S);
        short[][] f2 = ja.f(nj0Var.T);
        short[] c2 = ja.c(nj0Var.U);
        byte[] bArr = nj0Var.V;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return new h8(f, c, f2, c2, iArr, nj0Var.W);
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof oj0) {
            oj0 oj0Var = (oj0) keySpec;
            return new h8(oj0Var.P, oj0Var.Q, oj0Var.R, oj0Var.S, oj0Var.T, oj0Var.U);
        } else if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return b(bg0.p(t.s(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder b = e5.b("Unsupported key specification: ");
            b.append(keySpec.getClass());
            b.append(".");
            throw new InvalidKeySpecException(b.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof qj0) {
            qj0 qj0Var = (qj0) keySpec;
            return new i8(qj0Var.S, qj0Var.P, qj0Var.Q, qj0Var.R);
        } else if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return a(nu0.p(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof h8) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (oj0.class.isAssignableFrom(cls)) {
                h8 h8Var = (h8) key;
                return new oj0(h8Var.P, h8Var.Q, h8Var.R, h8Var.S, h8Var.U, h8Var.T);
            }
        } else if (key instanceof i8) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (qj0.class.isAssignableFrom(cls)) {
                i8 i8Var = (i8) key;
                int i = i8Var.S;
                short[][] sArr = i8Var.P;
                short[][] sArr2 = new short[i8Var.Q.length];
                int i2 = 0;
                while (true) {
                    short[][] sArr3 = i8Var.Q;
                    if (i2 != sArr3.length) {
                        sArr2[i2] = j7.d(sArr3[i2]);
                        i2++;
                    } else {
                        return new qj0(i, sArr, sArr2, j7.d(i8Var.R));
                    }
                }
            }
        } else {
            StringBuilder b = e5.b("Unsupported key type: ");
            b.append(key.getClass());
            b.append(".");
            throw new InvalidKeySpecException(b.toString());
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof h8) || (key instanceof i8)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}