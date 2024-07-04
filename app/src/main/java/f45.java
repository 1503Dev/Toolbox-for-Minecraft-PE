package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f45  reason: default package */
public final class f45 extends t55 {
    public f45() {
        super(n95.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        k95 x = l95.x();
        byte[] a = oc5.a(((n95) nf5Var).w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((l95) x.Q).zze = G;
        x.j();
        ((l95) x.Q).zzd = 0;
        return (l95) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return n95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        m95 x = n95.x();
        x.j();
        ((n95) x.Q).zzd = 64;
        hashMap.put("AES256_SIV", new s55(1, (n95) x.h()));
        m95 x2 = n95.x();
        x2.j();
        ((n95) x2.Q).zzd = 64;
        hashMap.put("AES256_SIV_RAW", new s55(3, (n95) x2.h()));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* bridge */ /* synthetic */ void d(nf5 nf5Var) {
        n95 n95Var = (n95) nf5Var;
        if (n95Var.w() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException(bp.b("invalid key size: ", n95Var.w(), ". Valid keys must have 64 bytes."));
    }
}