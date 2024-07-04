package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n75  reason: default package */
public final class n75 extends t55 {
    public n75() {
        super(ga5.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        ga5 ga5Var = (ga5) nf5Var;
        da5 x = ea5.x();
        x.j();
        ((ea5) x.Q).zzd = 0;
        ia5 B = ga5Var.B();
        x.j();
        ea5.F((ea5) x.Q, B);
        byte[] a = oc5.a(ga5Var.w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((ea5) x.Q).zzf = G;
        return (ea5) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return ga5.A(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", o75.i(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", o75.i(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", o75.i(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", o75.i(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", o75.i(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", o75.i(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", o75.i(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", o75.i(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", o75.i(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", o75.i(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* bridge */ /* synthetic */ void d(nf5 nf5Var) {
        ga5 ga5Var = (ga5) nf5Var;
        if (ga5Var.w() >= 16) {
            o75.j(ga5Var.B());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}