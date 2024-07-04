package defpackage;

import java.math.BigInteger;

/* renamed from: yn  reason: default package */
public final class yn extends n {
    public u P;

    public yn(int i, BigInteger bigInteger, zh zhVar, e81 e81Var) {
        byte[] a = y9.a((i + 7) / 8, bigInteger);
        s82 s82Var = new s82(12);
        s82Var.g(new l(1L));
        s82Var.g(new ii(a));
        s82Var.g(new ri(true, 0, e81Var));
        if (zhVar != null) {
            s82Var.g(new ri(true, 1, zhVar));
        }
        this.P = new mi(s82Var);
    }

    public yn(u uVar) {
        this.P = uVar;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        return this.P;
    }
}