package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f55  reason: default package */
public final class f55 extends t55 {
    public f55() {
        super(la5.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        byte[] q;
        byte[] s;
        la5 la5Var = (la5) nf5Var;
        int B = la5Var.z().B() - 2;
        if (B != 1) {
            int i = 3;
            if (B != 2 && B != 3 && B != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            int B2 = la5Var.z().B();
            byte[] bArr = j55.a;
            int i2 = B2 - 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            KeyPair a = cc5.a(cc5.f(i));
            s = cc5.g(cc5.f(i).getCurve(), 1, ((ECPublicKey) a.getPublic()).getW());
            q = ((ECPrivateKey) a.getPrivate()).getS().toByteArray();
        } else {
            q = v32.q();
            s = v32.s(q);
        }
        qa5 y = ra5.y();
        y.j();
        ((ra5) y.Q).zzd = 0;
        na5 z = la5Var.z();
        y.j();
        ra5.F((ra5) y.Q, z);
        ed5 G = gd5.G(s, 0, s.length);
        y.j();
        ((ra5) y.Q).zzf = G;
        oa5 x = pa5.x();
        x.j();
        ((pa5) x.Q).zzd = 0;
        x.j();
        ((pa5) x.Q).zze = (ra5) y.h();
        ed5 G2 = gd5.G(q, 0, q.length);
        x.j();
        ((pa5) x.Q).zzf = G2;
        return (pa5) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return la5.y(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", g55.h(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", g55.h(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", g55.h(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", g55.h(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", g55.h(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", g55.h(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", g55.h(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", g55.h(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", g55.h(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", g55.h(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", g55.h(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", g55.h(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", g55.h(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", g55.h(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", g55.h(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", g55.h(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", g55.h(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", g55.h(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* synthetic */ void d(nf5 nf5Var) {
        j55.a(((la5) nf5Var).z());
    }
}