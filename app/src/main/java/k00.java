package defpackage;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/* renamed from: k00  reason: default package */
public class k00 extends l9 {
    public String a;
    public jg0 b;

    /* renamed from: k00$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends k00 {
        public a() {
            super("EC", ua.P);
        }
    }

    /* renamed from: k00$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends k00 {
        public b() {
            super("ECMQV", ua.P);
        }
    }

    public k00(String str, va vaVar) {
        this.a = str;
        this.b = vaVar;
    }

    @Override // defpackage.n7
    public final PublicKey a(nu0 nu0Var) {
        o oVar = nu0Var.P.P;
        if (oVar.equals(l81.f)) {
            return new z7(this.a, nu0Var, this.b);
        }
        throw new IOException("algorithm identifier " + oVar + " in key not recognised");
    }

    @Override // defpackage.n7
    public final PrivateKey b(bg0 bg0Var) {
        o oVar = bg0Var.Q.P;
        if (oVar.equals(l81.f)) {
            return new y7(this.a, bg0Var, this.b);
        }
        throw new IOException("algorithm identifier " + oVar + " in key not recognised");
    }

    @Override // defpackage.l9, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof ao ? new y7(this.a, (ao) keySpec, this.b) : keySpec instanceof ECPrivateKeySpec ? new y7(this.a, (ECPrivateKeySpec) keySpec, this.b) : super.engineGeneratePrivate(keySpec);
    }

    @Override // defpackage.l9, java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        try {
            if (keySpec instanceof Cdo) {
                return new z7(this.a, (Cdo) keySpec, this.b);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new z7(this.a, (ECPublicKeySpec) keySpec, this.b);
            }
            return super.engineGeneratePublic(keySpec);
        } catch (Exception e) {
            StringBuilder b2 = e5.b("invalid KeySpec: ");
            b2.append(e.getMessage());
            throw new InvalidKeySpecException(b2.toString(), e);
        }
    }

    @Override // defpackage.l9, java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            un a2 = ua.P.a();
            return new ECPublicKeySpec(eCPublicKey.getW(), en.f(en.b(a2.a), a2));
        } else if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            un a3 = ua.P.a();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), en.f(en.b(a3.a), a3));
        } else if (cls.isAssignableFrom(Cdo.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new Cdo(en.d(eCPublicKey2.getParams(), eCPublicKey2.getW()), en.e(eCPublicKey2.getParams()));
            }
            return new Cdo(en.d(eCPublicKey2.getParams(), eCPublicKey2.getW()), ua.P.a());
        } else if (cls.isAssignableFrom(ao.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new ao(eCPrivateKey2.getS(), en.e(eCPrivateKey2.getParams()));
            }
            return new ao(eCPrivateKey2.getS(), ua.P.a());
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (key instanceof ECPublicKey) {
            return new z7((ECPublicKey) key, this.b);
        }
        if (key instanceof ECPrivateKey) {
            return new y7((ECPrivateKey) key, this.b);
        }
        throw new InvalidKeyException("key type unknown");
    }
}