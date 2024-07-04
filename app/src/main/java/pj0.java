package defpackage;

/* renamed from: pj0  reason: default package */
public final class pj0 extends n {
    public l P;
    public o Q;
    public l R;
    public byte[][] S;
    public byte[][] T;
    public byte[] U;

    public pj0(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.P = new l(0L);
        this.R = new l(i);
        this.S = ja.d(sArr);
        this.T = ja.d(sArr2);
        this.U = ja.b(sArr3);
    }

    public pj0(u uVar) {
        if (uVar.x(0) instanceof l) {
            this.P = l.w(uVar.x(0));
        } else {
            this.Q = o.z(uVar.x(0));
        }
        this.R = l.w(uVar.x(1));
        u w = u.w(uVar.x(2));
        this.S = new byte[w.size()];
        for (int i = 0; i < w.size(); i++) {
            this.S[i] = p.w(w.x(i)).x();
        }
        u uVar2 = (u) uVar.x(3);
        this.T = new byte[uVar2.size()];
        for (int i2 = 0; i2 < uVar2.size(); i2++) {
            this.T[i2] = p.w(uVar2.x(i2)).x();
        }
        this.U = p.w(((u) uVar.x(4)).x(0)).x();
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        g gVar = this.P;
        if (gVar == null) {
            gVar = this.Q;
        }
        s82Var.g(gVar);
        s82Var.g(this.R);
        s82 s82Var2 = new s82(12);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.S;
            if (i2 >= bArr.length) {
                break;
            }
            s82Var2.g(new ii(bArr[i2]));
            i2++;
        }
        s82Var.g(new mi(s82Var2));
        s82 s82Var3 = new s82(12);
        while (true) {
            byte[][] bArr2 = this.T;
            if (i >= bArr2.length) {
                s82Var.g(new mi(s82Var3));
                s82 s82Var4 = new s82(12);
                s82Var4.g(new ii(this.U));
                s82Var.g(new mi(s82Var4));
                return new mi(s82Var);
            }
            s82Var3.g(new ii(bArr2[i]));
            i++;
        }
    }
}