package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q25  reason: default package */
public final class q25 extends t55 {
    public q25() {
        super(j95.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        f95 x = h95.x();
        byte[] a = oc5.a(((j95) nf5Var).w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((h95) x.Q).zze = G;
        x.j();
        ((h95) x.Q).zzd = 0;
        return (h95) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return j95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", r25.h(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", r25.h(16, 3));
        hashMap.put("AES256_GCM_SIV", r25.h(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", r25.h(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* synthetic */ void d(nf5 nf5Var) {
        pc5.a(((j95) nf5Var).w());
    }
}