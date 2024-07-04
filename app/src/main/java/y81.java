package defpackage;

import java.math.BigInteger;

/* renamed from: y81  reason: default package */
public final class y81 extends n {
    public final int P;
    public final byte[] Q;
    public final byte[] R;
    public final byte[] S;
    public final byte[] T;
    public final byte[] U;

    public y81(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.P = i;
        this.Q = j7.c(bArr);
        this.R = j7.c(bArr2);
        this.S = j7.c(bArr3);
        this.T = j7.c(bArr4);
        this.U = j7.c(bArr5);
    }

    public y81(u uVar) {
        if (!l.w(uVar.x(0)).x().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        if (uVar.size() != 2 && uVar.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        u w = u.w(uVar.x(1));
        this.P = l.w(w.x(0)).x().intValue();
        this.Q = j7.c(p.w(w.x(1)).x());
        this.R = j7.c(p.w(w.x(2)).x());
        this.S = j7.c(p.w(w.x(3)).x());
        this.T = j7.c(p.w(w.x(4)).x());
        if (uVar.size() == 3) {
            this.U = j7.c(p.w(x.w(uVar.x(2)).x()).x());
        } else {
            this.U = null;
        }
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(new l(0L));
        s82 s82Var2 = new s82(12);
        s82Var2.g(new l(this.P));
        s82Var2.g(new ii(this.Q));
        s82Var2.g(new ii(this.R));
        s82Var2.g(new ii(this.S));
        s82Var2.g(new ii(this.T));
        s82Var.g(new mi(s82Var2));
        s82Var.g(new ri(true, 0, new ii(this.U)));
        return new mi(s82Var);
    }
}