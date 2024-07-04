package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: x40  reason: default package */
public final class x40 extends KeyFactorySpi implements n7 {
    @Override // defpackage.n7
    public final PublicKey a(nu0 nu0Var) {
        b50 b50Var;
        t q = nu0Var.q();
        if (q instanceof b50) {
            b50Var = (b50) q;
        } else if (q != null) {
            b50Var = new b50(u.w(q));
        } else {
            b50Var = null;
        }
        return new d8(new c50(b50Var.P, b50Var.Q, new rs(b50Var.R)));
    }

    @Override // defpackage.n7
    public final PrivateKey b(bg0 bg0Var) {
        z40 z40Var;
        t q = bg0Var.q();
        q.getClass();
        if (q instanceof z40) {
            z40Var = (z40) q;
        } else {
            z40Var = new z40(u.w(q));
        }
        return new c8(new a50(z40Var.P, z40Var.Q, new ts(z40Var.R), new gf0(new ts(z40Var.R), z40Var.S), new ge0(z40Var.U), new ge0(z40Var.V), new rs(z40Var.T)));
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        z40 z40Var;
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                bg0 p = bg0.p(t.s(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (hd0.b.equals(p.Q.P)) {
                        t q = p.q();
                        if (q instanceof z40) {
                            z40Var = (z40) q;
                        } else if (q != null) {
                            z40Var = new z40(u.w(q));
                        } else {
                            z40Var = null;
                        }
                        return new c8(new a50(z40Var.P, z40Var.Q, new ts(z40Var.R), new gf0(new ts(z40Var.R), z40Var.S), new ge0(z40Var.U), new ge0(z40Var.V), new rs(z40Var.T)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
            }
        }
        StringBuilder b = e5.b("Unsupported key specification: ");
        b.append(keySpec.getClass());
        b.append(".");
        throw new InvalidKeySpecException(b.toString());
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        b50 b50Var;
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                nu0 p = nu0.p(t.s(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (hd0.b.equals(p.P.P)) {
                        t q = p.q();
                        if (q instanceof b50) {
                            b50Var = (b50) q;
                        } else if (q != null) {
                            b50Var = new b50(u.w(q));
                        } else {
                            b50Var = null;
                        }
                        return new d8(new c50(b50Var.P, b50Var.Q, new rs(b50Var.R)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e) {
                    StringBuilder b = e5.b("Unable to decode X509EncodedKeySpec: ");
                    b.append(e.getMessage());
                    throw new InvalidKeySpecException(b.toString());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        }
        StringBuilder b2 = e5.b("Unsupported key specification: ");
        b2.append(keySpec.getClass());
        b2.append(".");
        throw new InvalidKeySpecException(b2.toString());
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        return null;
    }
}