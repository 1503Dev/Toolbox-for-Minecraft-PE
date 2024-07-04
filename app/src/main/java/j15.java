package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: j15  reason: default package */
public final class j15 extends u55 {
    public j15() {
        super(q85.class, new h15());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new i15(this);
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return q85.A(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.u55
    public final void e(nf5 nf5Var) {
        q85 q85Var = (q85) nf5Var;
        pc5.b(q85Var.w());
        pc5.a(q85Var.C().o());
        u85 B = q85Var.B();
        if (B.w() >= 12 && B.w() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}