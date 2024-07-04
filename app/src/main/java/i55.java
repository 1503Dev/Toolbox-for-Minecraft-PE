package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: i55  reason: default package */
public final class i55 extends u55 {
    public i55() {
        super(ra5.class, new h55(yz4.class, 0));
    }

    @Override // defpackage.u55
    public final int b() {
        return 4;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return ra5.B(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // defpackage.u55
    public final /* bridge */ /* synthetic */ void e(nf5 nf5Var) {
        ra5 ra5Var = (ra5) nf5Var;
        pc5.b(ra5Var.w());
        if (!ra5Var.H()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        j55.a(ra5Var.x());
    }
}