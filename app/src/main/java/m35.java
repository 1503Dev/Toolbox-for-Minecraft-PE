package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m35  reason: default package */
public final class m35 extends t55 {
    public m35() {
        super(qb5.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        qb5 qb5Var = (qb5) nf5Var;
        ob5 x = pb5.x();
        x.j();
        ((pb5) x.Q).zzd = 0;
        byte[] a = oc5.a(32);
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((pb5) x.Q).zze = G;
        return (pb5) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return qb5.y(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new s55(1, qb5.x()));
        hashMap.put("XCHACHA20_POLY1305_RAW", new s55(3, qb5.x()));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* bridge */ /* synthetic */ void d(nf5 nf5Var) {
        qb5 qb5Var = (qb5) nf5Var;
    }
}