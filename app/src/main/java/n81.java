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

/* renamed from: n81  reason: default package */
public final class n81 extends KeyFactorySpi implements n7 {
    @Override // defpackage.n7
    public final PublicKey a(nu0 nu0Var) {
        return new o8(nu0Var);
    }

    @Override // defpackage.n7
    public final PrivateKey b(bg0 bg0Var) {
        return new n8(bg0Var);
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return new n8(bg0.p(t.s(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        StringBuilder b = e5.b("unsupported key specification: ");
        b.append(keySpec.getClass());
        b.append(".");
        throw new InvalidKeySpecException(b.toString());
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return new o8(nu0.p(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof n8) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (key instanceof o8) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        } else {
            StringBuilder b = e5.b("unsupported key type: ");
            b.append(key.getClass());
            b.append(".");
            throw new InvalidKeySpecException(b.toString());
        }
        throw new InvalidKeySpecException("unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof n8) || (key instanceof o8)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}