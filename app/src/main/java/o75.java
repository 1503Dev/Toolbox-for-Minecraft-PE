package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: o75  reason: default package */
public final class o75 extends u55 {
    public static final h65 d = new h65(ga1.f0, l75.class);

    public o75() {
        super(ea5.class, new m75());
    }

    public static final void h(ea5 ea5Var) {
        pc5.b(ea5Var.w());
        if (ea5Var.C().o() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        j(ea5Var.B());
    }

    public static s55 i(int i, int i2, int i3, int i4) {
        fa5 x = ga5.x();
        ha5 x2 = ia5.x();
        x2.j();
        ((ia5) x2.Q).zzd = j82.j(i3);
        x2.j();
        ((ia5) x2.Q).zze = i2;
        x.j();
        ga5.C((ga5) x.Q, (ia5) x2.h());
        x.j();
        ga5.E((ga5) x.Q, i);
        return new s55(i4, (ga5) x.h());
    }

    public static void j(ia5 ia5Var) {
        if (ia5Var.w() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int B = ia5Var.B() - 2;
        if (B == 1) {
            if (ia5Var.w() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (B == 2) {
            if (ia5Var.w() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (B == 3) {
            if (ia5Var.w() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (B == 4) {
            if (ia5Var.w() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (B != 5) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (ia5Var.w() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new n75();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return ea5.A(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.u55
    public final /* bridge */ /* synthetic */ void e(nf5 nf5Var) {
        h((ea5) nf5Var);
    }

    @Override // defpackage.u55
    public final int f() {
        return 2;
    }
}