package defpackage;

/* renamed from: s81  reason: default package */
public final class s81 extends n {
    public final int P;
    public final byte[] Q;
    public final byte[] R;
    public final byte[] S;
    public final byte[] T;
    public final byte[] U;

    public s81(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.P = i;
        this.Q = j7.c(bArr);
        this.R = j7.c(bArr2);
        this.S = j7.c(bArr3);
        this.T = j7.c(bArr4);
        this.U = j7.c(bArr5);
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