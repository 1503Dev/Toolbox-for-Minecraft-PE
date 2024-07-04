package defpackage;

/* renamed from: nj0  reason: default package */
public final class nj0 extends n {
    public l P;
    public o Q;
    public byte[][] R;
    public byte[] S;
    public byte[][] T;
    public byte[] U;
    public byte[] V;
    public t00[] W;

    public nj0(u uVar) {
        int i = 0;
        if (uVar.x(0) instanceof l) {
            this.P = l.w(uVar.x(0));
        } else {
            this.Q = o.z(uVar.x(0));
        }
        u uVar2 = (u) uVar.x(1);
        this.R = new byte[uVar2.size()];
        for (int i2 = 0; i2 < uVar2.size(); i2++) {
            this.R[i2] = ((p) uVar2.x(i2)).x();
        }
        this.S = ((p) ((u) uVar.x(2)).x(0)).x();
        u uVar3 = (u) uVar.x(3);
        this.T = new byte[uVar3.size()];
        for (int i3 = 0; i3 < uVar3.size(); i3++) {
            this.T[i3] = ((p) uVar3.x(i3)).x();
        }
        this.U = ((p) ((u) uVar.x(4)).x(0)).x();
        this.V = ((p) ((u) uVar.x(5)).x(0)).x();
        u uVar4 = (u) uVar.x(6);
        byte[][][][] bArr = new byte[uVar4.size()][][];
        byte[][][][] bArr2 = new byte[uVar4.size()][][];
        byte[][][] bArr3 = new byte[uVar4.size()][];
        byte[][] bArr4 = new byte[uVar4.size()];
        int i4 = 0;
        while (i4 < uVar4.size()) {
            u uVar5 = (u) uVar4.x(i4);
            u uVar6 = (u) uVar5.x(i);
            bArr[i4] = new byte[uVar6.size()][];
            for (int i5 = 0; i5 < uVar6.size(); i5++) {
                u uVar7 = (u) uVar6.x(i5);
                bArr[i4][i5] = new byte[uVar7.size()];
                for (int i6 = 0; i6 < uVar7.size(); i6++) {
                    bArr[i4][i5][i6] = ((p) uVar7.x(i6)).x();
                }
            }
            u uVar8 = (u) uVar5.x(1);
            bArr2[i4] = new byte[uVar8.size()][];
            for (int i7 = 0; i7 < uVar8.size(); i7++) {
                u uVar9 = (u) uVar8.x(i7);
                bArr2[i4][i7] = new byte[uVar9.size()];
                for (int i8 = 0; i8 < uVar9.size(); i8++) {
                    bArr2[i4][i7][i8] = ((p) uVar9.x(i8)).x();
                }
            }
            u uVar10 = (u) uVar5.x(2);
            bArr3[i4] = new byte[uVar10.size()];
            for (int i9 = 0; i9 < uVar10.size(); i9++) {
                bArr3[i4][i9] = ((p) uVar10.x(i9)).x();
            }
            bArr4[i4] = ((p) uVar5.x(3)).x();
            i4++;
            i = 0;
        }
        int length = this.V.length - 1;
        this.W = new t00[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.V;
            int i11 = i10 + 1;
            this.W[i10] = new t00(bArr5[i10], bArr5[i11], ja.h(bArr[i10]), ja.h(bArr2[i10]), ja.f(bArr3[i10]), ja.c(bArr4[i10]));
            i10 = i11;
        }
    }

    public nj0(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, t00[] t00VarArr) {
        this.P = new l(1L);
        this.R = ja.d(sArr);
        this.S = ja.b(sArr2);
        this.T = ja.d(sArr3);
        this.U = ja.b(sArr4);
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        this.V = bArr;
        this.W = t00VarArr;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        g gVar = this.P;
        if (gVar == null) {
            gVar = this.Q;
        }
        s82Var.g(gVar);
        s82 s82Var2 = new s82(12);
        int i = 0;
        while (true) {
            byte[][] bArr = this.R;
            if (i >= bArr.length) {
                break;
            }
            s82Var2.g(new ii(bArr[i]));
            i++;
        }
        s82Var.g(new mi(s82Var2));
        s82 s82Var3 = new s82(12);
        s82Var3.g(new ii(this.S));
        s82Var.g(new mi(s82Var3));
        s82 s82Var4 = new s82(12);
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.T;
            if (i2 >= bArr2.length) {
                break;
            }
            s82Var4.g(new ii(bArr2[i2]));
            i2++;
        }
        s82Var.g(new mi(s82Var4));
        s82 s82Var5 = new s82(12);
        s82Var5.g(new ii(this.U));
        s82Var.g(new mi(s82Var5));
        s82 s82Var6 = new s82(12);
        s82Var6.g(new ii(this.V));
        s82Var.g(new mi(s82Var6));
        s82 s82Var7 = new s82(12);
        for (int i3 = 0; i3 < this.W.length; i3++) {
            s82 s82Var8 = new s82(12);
            byte[][][] g = ja.g(this.W[i3].d);
            s82 s82Var9 = new s82(12);
            for (byte[][] bArr3 : g) {
                s82 s82Var10 = new s82(12);
                int i4 = 0;
                while (true) {
                    if (i4 < bArr3.length) {
                        s82Var10.g(new ii(bArr3[i4]));
                        i4++;
                    }
                }
                s82Var9.g(new mi(s82Var10));
            }
            s82Var8.g(new mi(s82Var9));
            byte[][][] g2 = ja.g(this.W[i3].e);
            s82 s82Var11 = new s82(12);
            for (byte[][] bArr4 : g2) {
                s82 s82Var12 = new s82(12);
                int i5 = 0;
                while (true) {
                    if (i5 < bArr4.length) {
                        s82Var12.g(new ii(bArr4[i5]));
                        i5++;
                    }
                }
                s82Var11.g(new mi(s82Var12));
            }
            s82Var8.g(new mi(s82Var11));
            byte[][] d = ja.d(this.W[i3].f);
            s82 s82Var13 = new s82(12);
            for (byte[] bArr5 : d) {
                s82Var13.g(new ii(bArr5));
            }
            s82Var8.g(new mi(s82Var13));
            s82Var8.g(new ii(ja.b(this.W[i3].g)));
            s82Var7.g(new mi(s82Var8));
        }
        s82Var.g(new mi(s82Var7));
        return new mi(s82Var);
    }
}