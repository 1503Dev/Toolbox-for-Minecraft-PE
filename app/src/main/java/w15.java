package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w15  reason: default package */
public final class w15 extends t55 {
    public w15() {
        super(e95.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        b95 x = c95.x();
        byte[] a = oc5.a(((e95) nf5Var).w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((c95) x.Q).zze = G;
        x.j();
        ((c95) x.Q).zzd = 0;
        return (c95) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return e95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", x15.h(16, 1));
        hashMap.put("AES128_GCM_RAW", x15.h(16, 3));
        hashMap.put("AES256_GCM", x15.h(32, 1));
        hashMap.put("AES256_GCM_RAW", x15.h(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* synthetic */ void d(nf5 nf5Var) {
        pc5.a(((e95) nf5Var).w());
    }
}