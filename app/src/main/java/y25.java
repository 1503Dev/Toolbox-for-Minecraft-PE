package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: y25  reason: default package */
public final class y25 extends u55 {
    public y25() {
        super(p95.class, new w25());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new x25();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return p95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.u55
    public final /* bridge */ /* synthetic */ void e(nf5 nf5Var) {
        p95 p95Var = (p95) nf5Var;
        pc5.b(p95Var.w());
        if (p95Var.A().o() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}