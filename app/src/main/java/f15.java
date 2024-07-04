package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f15  reason: default package */
public final class f15 extends t55 {
    public f15() {
        super(n85.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        n85 n85Var = (n85) nf5Var;
        new j15();
        q85 e = i15.e(n85Var.z());
        new o75();
        ga5 A = n85Var.A();
        da5 x = ea5.x();
        x.j();
        ((ea5) x.Q).zzd = 0;
        ia5 B = A.B();
        x.j();
        ea5.F((ea5) x.Q, B);
        byte[] a = oc5.a(A.w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((ea5) x.Q).zzf = G;
        k85 x2 = l85.x();
        x2.j();
        ((l85) x2.Q).zze = e;
        x2.j();
        l85.F((l85) x2.Q, (ea5) x.h());
        x2.j();
        ((l85) x2.Q).zzd = 0;
        return (l85) x2.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return n85.y(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", g15.h(16, 16, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", g15.h(16, 16, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", g15.h(32, 32, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", g15.h(32, 32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final void d(nf5 nf5Var) {
        n85 n85Var = (n85) nf5Var;
        new j15();
        s85 z = n85Var.z();
        pc5.a(z.w());
        u85 B = z.B();
        if (B.w() >= 12 && B.w() <= 16) {
            new o75();
            ga5 A = n85Var.A();
            if (A.w() >= 16) {
                o75.j(A.B());
                pc5.a(n85Var.z().w());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}