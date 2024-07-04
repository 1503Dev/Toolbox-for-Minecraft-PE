package defpackage;

import java.security.InvalidKeyException;

/* renamed from: g45  reason: default package */
public final class g45 extends u55 {
    public g45() {
        super(l95.class, new e45());
    }

    @Override // defpackage.u55
    public final t55 a() {
        return new f45();
    }

    @Override // defpackage.u55
    public final int b() {
        return 2;
    }

    @Override // defpackage.u55
    public final nf5 c(gd5 gd5Var) {
        return l95.z(gd5Var, ud5.c);
    }

    @Override // defpackage.u55
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.u55
    public final /* bridge */ /* synthetic */ void e(nf5 nf5Var) {
        l95 l95Var = (l95) nf5Var;
        pc5.b(l95Var.w());
        if (l95Var.A().o() == 64) {
            return;
        }
        throw new InvalidKeyException(bp.b("invalid key size: ", l95Var.A().o(), ". Valid keys must have 64 bytes."));
    }
}