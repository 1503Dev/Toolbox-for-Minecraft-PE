package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: x25  reason: default package */
public final class x25 extends t55 {
    public x25() {
        super(q95.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        q95 q95Var = (q95) nf5Var;
        o95 x = p95.x();
        x.j();
        ((p95) x.Q).zzd = 0;
        byte[] a = oc5.a(32);
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((p95) x.Q).zze = G;
        return (p95) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return q95.y(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new s55(1, q95.x()));
        hashMap.put("CHACHA20_POLY1305_RAW", new s55(3, q95.x()));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* bridge */ /* synthetic */ void d(nf5 nf5Var) {
        q95 q95Var = (q95) nf5Var;
    }
}