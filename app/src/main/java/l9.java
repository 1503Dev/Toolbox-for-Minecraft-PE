package defpackage;

import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: l9  reason: default package */
public abstract class l9 extends KeyFactorySpi implements n7 {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return ((k00) this).b(bg0.p(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                StringBuilder b = e5.b("encoded key spec not recognized: ");
                b.append(e.getMessage());
                throw new InvalidKeySpecException(b.toString());
            }
        }
        throw new InvalidKeySpecException("key spec not recognized");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return ((k00) this).a(nu0.p(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                StringBuilder b = e5.b("encoded key spec not recognized: ");
                b.append(e.getMessage());
                throw new InvalidKeySpecException(b.toString());
            }
        }
        throw new InvalidKeySpecException("key spec not recognized");
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + cls);
    }
}