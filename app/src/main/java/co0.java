package defpackage;

import defpackage.wn;

/* renamed from: co0  reason: default package */
public final class co0 extends wn.b {
    public co0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public co0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (defpackage.z61.T(12, r10, defpackage.eg4.Q) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    @Override // defpackage.wn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wn a(wn wnVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        if (j()) {
            return wnVar;
        }
        if (wnVar.j()) {
            return this;
        }
        if (this == wnVar) {
            return w();
        }
        hn hnVar = this.a;
        bo0 bo0Var = (bo0) this.b;
        bo0 bo0Var2 = (bo0) this.c;
        bo0 bo0Var3 = (bo0) wnVar.b;
        bo0 bo0Var4 = (bo0) wnVar.h();
        bo0 bo0Var5 = (bo0) this.d[0];
        bo0 bo0Var6 = (bo0) wnVar.i();
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean h = bo0Var5.h();
        if (h) {
            iArr = bo0Var3.g;
            iArr2 = bo0Var4.g;
        } else {
            eg4.g(bo0Var5.g, iArr7);
            eg4.b(iArr7, bo0Var3.g, iArr6);
            eg4.b(iArr7, bo0Var5.g, iArr7);
            eg4.b(iArr7, bo0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = bo0Var6.h();
        if (h2) {
            iArr3 = bo0Var.g;
            iArr4 = bo0Var2.g;
        } else {
            eg4.g(bo0Var6.g, iArr8);
            eg4.b(iArr8, bo0Var.g, iArr5);
            eg4.b(iArr8, bo0Var6.g, iArr8);
            eg4.b(iArr8, bo0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[6];
        eg4.j(iArr3, iArr, iArr9);
        eg4.j(iArr4, iArr2, iArr6);
        if (z61.p0(iArr9)) {
            if (z61.p0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        eg4.g(iArr9, iArr7);
        int[] iArr10 = new int[6];
        eg4.b(iArr7, iArr9, iArr10);
        eg4.b(iArr7, iArr3, iArr7);
        if (z61.p0(iArr10)) {
            iArr10[0] = 0;
            iArr10[1] = 0;
            iArr10[2] = 0;
            iArr10[3] = 0;
            iArr10[4] = 0;
            iArr10[5] = 0;
        } else {
            z61.m1(eg4.P, iArr10, iArr10);
        }
        z61.B0(iArr4, iArr10, iArr5);
        eg4.d(iArr10, z61.j(iArr7, iArr7, iArr10));
        bo0 bo0Var7 = new bo0(iArr8);
        eg4.g(iArr6, iArr8);
        int[] iArr11 = bo0Var7.g;
        eg4.j(iArr11, iArr10, iArr11);
        bo0 bo0Var8 = new bo0(iArr10);
        eg4.j(iArr7, bo0Var7.g, iArr10);
        if (z61.G0(bo0Var8.g, iArr6, iArr5) == 0) {
            if (iArr5[11] == -1) {
                i = 12;
            }
            eg4.c(iArr5, bo0Var8.g);
            bo0 bo0Var9 = new bo0(iArr9);
            if (!h) {
                eg4.b(iArr9, bo0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = bo0Var9.g;
                eg4.b(iArr12, bo0Var6.g, iArr12);
            }
            return new co0(hnVar, bo0Var7, bo0Var8, new jn[]{bo0Var9}, this.e);
        }
        i = 12;
        if (z61.n(8, eg4.R, iArr5) != 0) {
            z61.b0(i, 8, iArr5);
        }
        eg4.c(iArr5, bo0Var8.g);
        bo0 bo0Var92 = new bo0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new co0(hnVar, bo0Var7, bo0Var8, new jn[]{bo0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new co0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new co0(this.a, this.b, this.c.m(), this.d, this.e);
    }

    @Override // defpackage.wn
    public final wn u() {
        return (j() || this.c.i()) ? this : w().a(this);
    }

    @Override // defpackage.wn
    public final wn w() {
        if (j()) {
            return this;
        }
        hn hnVar = this.a;
        bo0 bo0Var = (bo0) this.c;
        if (bo0Var.i()) {
            return hnVar.k();
        }
        bo0 bo0Var2 = (bo0) this.b;
        bo0 bo0Var3 = (bo0) this.d[0];
        int[] iArr = new int[6];
        eg4.g(bo0Var.g, iArr);
        int[] iArr2 = new int[6];
        eg4.g(iArr, iArr2);
        int[] iArr3 = new int[6];
        eg4.g(bo0Var2.g, iArr3);
        eg4.d(iArr3, z61.j(iArr3, iArr3, iArr3));
        eg4.b(iArr, bo0Var2.g, iArr);
        eg4.d(iArr, z61.Z0(6, iArr));
        int[] iArr4 = new int[6];
        eg4.d(iArr4, z61.a1(6, iArr2, iArr4));
        bo0 bo0Var4 = new bo0(iArr2);
        eg4.g(iArr3, iArr2);
        int[] iArr5 = bo0Var4.g;
        eg4.j(iArr5, iArr, iArr5);
        int[] iArr6 = bo0Var4.g;
        eg4.j(iArr6, iArr, iArr6);
        bo0 bo0Var5 = new bo0(iArr);
        eg4.j(iArr, bo0Var4.g, iArr);
        int[] iArr7 = bo0Var5.g;
        eg4.b(iArr7, iArr3, iArr7);
        int[] iArr8 = bo0Var5.g;
        eg4.j(iArr8, iArr4, iArr8);
        bo0 bo0Var6 = new bo0(iArr3);
        if (z61.Y0(6, 0, bo0Var.g, iArr3) != 0 || (iArr3[5] == -1 && z61.W(iArr3, eg4.P))) {
            z61.f(6, 4553, iArr3);
        }
        if (!bo0Var3.h()) {
            int[] iArr9 = bo0Var6.g;
            eg4.b(iArr9, bo0Var3.g, iArr9);
        }
        return new co0(hnVar, bo0Var4, bo0Var5, new jn[]{bo0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}