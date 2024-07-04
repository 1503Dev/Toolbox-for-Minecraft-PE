package defpackage;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l45  reason: default package */
public final class l45 extends t55 {
    public l45() {
        super(u95.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        u95 u95Var = (u95) nf5Var;
        KeyPair a = cc5.a(cc5.f(v45.c(u95Var.z().A().B())));
        ECPoint w = ((ECPublicKey) a.getPublic()).getW();
        z95 y = aa5.y();
        y.j();
        ((aa5) y.Q).zzd = 0;
        w95 z = u95Var.z();
        y.j();
        aa5.G((aa5) y.Q, z);
        byte[] byteArray = w.getAffineX().toByteArray();
        ed5 ed5Var = gd5.Q;
        ed5 G = gd5.G(byteArray, 0, byteArray.length);
        y.j();
        ((aa5) y.Q).zzf = G;
        byte[] byteArray2 = w.getAffineY().toByteArray();
        ed5 G2 = gd5.G(byteArray2, 0, byteArray2.length);
        y.j();
        ((aa5) y.Q).zzg = G2;
        x95 x = y95.x();
        x.j();
        ((y95) x.Q).zzd = 0;
        x.j();
        ((y95) x.Q).zze = (aa5) y.h();
        byte[] byteArray3 = ((ECPrivateKey) a.getPrivate()).getS().toByteArray();
        ed5 G3 = gd5.G(byteArray3, 0, byteArray3.length);
        x.j();
        ((y95) x.Q).zzf = G3;
        return (y95) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return u95.y(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        h05 a = i05.a("AES128_GCM");
        byte[] bArr = m45.d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", m45.h(3, a, bArr, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", m45.h(3, i05.a("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", m45.h(4, i05.a("AES128_GCM"), bArr, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", m45.h(4, i05.a("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", m45.h(4, i05.a("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", m45.h(3, i05.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", m45.h(3, i05.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", m45.h(4, i05.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", m45.h(4, i05.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* synthetic */ void d(nf5 nf5Var) {
        v45.a(((u95) nf5Var).z());
    }
}