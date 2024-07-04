package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: c75  reason: default package */
public final class c75 extends u55 {
    public static final h65 d = new h65(gv4.Z, a75.class);

    public c75() {
        super(f85.class, new h55(p05.class, 1));
    }

    public static void h(j85 j85Var) {
        if (j85Var.w() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (j85Var.w() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new b75();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return f85.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.u55
    public final void e(nf5 nf5Var) {
        f85 f85Var = (f85) nf5Var;
        pc5.b(f85Var.w());
        if (f85Var.B().o() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        h(f85Var.A());
    }
}