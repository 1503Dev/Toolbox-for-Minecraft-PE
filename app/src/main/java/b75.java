package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b75  reason: default package */
public final class b75 extends t55 {
    public b75() {
        super(h85.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        h85 h85Var = (h85) nf5Var;
        e85 x = f85.x();
        x.j();
        ((f85) x.Q).zzd = 0;
        byte[] a = oc5.a(h85Var.w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((f85) x.Q).zze = G;
        j85 A = h85Var.A();
        x.j();
        f85.F((f85) x.Q, A);
        return (f85) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return h85.z(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        g85 x = h85.x();
        x.j();
        ((h85) x.Q).zzd = 32;
        i85 x2 = j85.x();
        x2.j();
        ((j85) x2.Q).zzd = 16;
        x.j();
        ((h85) x.Q).zze = (j85) x2.h();
        hashMap.put("AES_CMAC", new s55(1, (h85) x.h()));
        g85 x3 = h85.x();
        x3.j();
        ((h85) x3.Q).zzd = 32;
        i85 x4 = j85.x();
        x4.j();
        ((j85) x4.Q).zzd = 16;
        x3.j();
        ((h85) x3.Q).zze = (j85) x4.h();
        hashMap.put("AES256_CMAC", new s55(1, (h85) x3.h()));
        g85 x5 = h85.x();
        x5.j();
        ((h85) x5.Q).zzd = 32;
        i85 x6 = j85.x();
        x6.j();
        ((j85) x6.Q).zzd = 16;
        x5.j();
        ((h85) x5.Q).zze = (j85) x6.h();
        hashMap.put("AES256_CMAC_RAW", new s55(3, (h85) x5.h()));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final void d(nf5 nf5Var) {
        h85 h85Var = (h85) nf5Var;
        c75.h(h85Var.A());
        if (h85Var.w() == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}