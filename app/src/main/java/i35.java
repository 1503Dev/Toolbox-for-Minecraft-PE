package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: i35  reason: default package */
public final class i35 extends t55 {
    public i35() {
        super(lb5.class);
    }

    @Override // defpackage.t55
    public final nf5 a(nf5 nf5Var) {
        jb5 x = kb5.x();
        x.j();
        kb5.C((kb5) x.Q, (lb5) nf5Var);
        x.j();
        ((kb5) x.Q).zzd = 0;
        return (kb5) x.h();
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return lb5.z(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final /* bridge */ /* synthetic */ void d(nf5 nf5Var) {
        lb5 lb5Var = (lb5) nf5Var;
        if (lb5Var.A().isEmpty() || !lb5Var.B()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}