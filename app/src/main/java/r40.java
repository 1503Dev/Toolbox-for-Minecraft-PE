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

/* renamed from: r40  reason: default package */
public final class r40 extends KeyFactorySpi implements n7 {
    @Override // defpackage.n7
    public final PublicKey a(nu0 nu0Var) {
        v40 v40Var;
        t q = nu0Var.q();
        if (q instanceof v40) {
            v40Var = (v40) q;
        } else if (q != null) {
            v40Var = new v40(u.w(q));
        } else {
            v40Var = null;
        }
        return new b8(new w40(v40Var.P, v40Var.Q, v40Var.R, s45.f(v40Var.S).b()));
    }

    @Override // defpackage.n7
    public final PrivateKey b(bg0 bg0Var) {
        t40 t40Var;
        t q = bg0Var.q();
        q.getClass();
        if (q instanceof t40) {
            t40Var = (t40) q;
        } else {
            t40Var = new t40(u.w(q));
        }
        return new a8(new u40(t40Var.P, t40Var.Q, new ts(t40Var.R), new gf0(new ts(t40Var.R), t40Var.S), new ge0(t40Var.T), null));
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        t40 t40Var;
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                bg0 p = bg0.p(t.s(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (hd0.c.equals(p.Q.P)) {
                        t q = p.q();
                        if (q instanceof t40) {
                            t40Var = (t40) q;
                        } else if (q != null) {
                            t40Var = new t40(u.w(q));
                        } else {
                            t40Var = null;
                        }
                        return new a8(new u40(t40Var.P, t40Var.Q, new ts(t40Var.R), new gf0(new ts(t40Var.R), t40Var.S), new ge0(t40Var.T), s45.f(t40Var.U).b()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
        v40 v40Var;
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                nu0 p = nu0.p(t.s(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (hd0.c.equals(p.P.P)) {
                        t q = p.q();
                        if (q instanceof v40) {
                            v40Var = (v40) q;
                        } else if (q != null) {
                            v40Var = new v40(u.w(q));
                        } else {
                            v40Var = null;
                        }
                        return new b8(new w40(v40Var.P, v40Var.Q, v40Var.R, s45.f(v40Var.S).b()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
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