package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: i15  reason: default package */
public final class i15 extends t55 {
    public i15(j15 j15Var) {
        super(s85.class);
    }

    public static final q85 e(s85 s85Var) {
        p85 x = q85.x();
        u85 B = s85Var.B();
        x.j();
        q85.F((q85) x.Q, B);
        byte[] a = oc5.a(s85Var.w());
        ed5 G = gd5.G(a, 0, a.length);
        x.j();
        ((q85) x.Q).zzf = G;
        x.j();
        ((q85) x.Q).zzd = 0;
        return (q85) x.h();
    }

    @Override // defpackage.t55
    public final /* bridge */ /* synthetic */ nf5 a(nf5 nf5Var) {
        return e((s85) nf5Var);
    }

    @Override // defpackage.t55
    public final nf5 b(gd5 gd5Var) {
        return s85.A(gd5Var, ud5.c);
    }

    @Override // defpackage.t55
    public final void d(nf5 nf5Var) {
        s85 s85Var = (s85) nf5Var;
        pc5.a(s85Var.w());
        u85 B = s85Var.B();
        if (B.w() >= 12 && B.w() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}