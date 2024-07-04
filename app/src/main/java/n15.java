package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n15  reason: default package */
public final class n15 extends t55 {
    public n15() {
        super(y85.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        y85 y85Var = (y85) nf5Var;
        v85 x = w85.x();
        byte[] a = oc5.a(y85Var.w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((w85) x.Q).zzf = G;
        a95 A = y85Var.A();
        x.j();
        w85.E((w85) x.Q, A);
        x.j();
        ((w85) x.Q).zzd = 0;
        return (w85) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return y85.z(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", p15.h(16, 1));
        hashMap.put("AES128_EAX_RAW", p15.h(16, 3));
        hashMap.put("AES256_EAX", p15.h(32, 1));
        hashMap.put("AES256_EAX_RAW", p15.h(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.t55
    public final /* bridge */ /* synthetic */ void d(nf5 nf5Var) {
        y85 y85Var = (y85) nf5Var;
        pc5.a(y85Var.w());
        if (y85Var.A().w() != 12 && y85Var.A().w() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}