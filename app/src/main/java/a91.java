package defpackage;

import java.math.BigInteger;

/* renamed from: a91  reason: default package */
public final class a91 extends n {
    public final byte[] P;
    public final byte[] Q;

    public a91(u uVar) {
        if (!l.w(uVar.x(0)).x().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.P = j7.c(p.w(uVar.x(1)).x());
        this.Q = j7.c(p.w(uVar.x(2)).x());
    }

    public a91(byte[] bArr, byte[] bArr2) {
        this.P = j7.c(bArr);
        this.Q = j7.c(bArr2);
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(new l(0L));
        s82Var.g(new ii(this.P));
        s82Var.g(new ii(this.Q));
        return new mi(s82Var);
    }
}