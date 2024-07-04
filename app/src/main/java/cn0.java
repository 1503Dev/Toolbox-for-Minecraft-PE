package defpackage;

import defpackage.wn;

/* renamed from: cn0  reason: default package */
public final class cn0 extends wn.b {
    public cn0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public cn0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
        if (defpackage.z61.T(16, r10, defpackage.yf.Q) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
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
        bn0 bn0Var = (bn0) this.b;
        bn0 bn0Var2 = (bn0) this.c;
        bn0 bn0Var3 = (bn0) wnVar.b;
        bn0 bn0Var4 = (bn0) wnVar.h();
        bn0 bn0Var5 = (bn0) this.d[0];
        bn0 bn0Var6 = (bn0) wnVar.i();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean h = bn0Var5.h();
        if (h) {
            iArr = bn0Var3.g;
            iArr2 = bn0Var4.g;
        } else {
            yf.i(bn0Var5.g, iArr7);
            yf.f(iArr7, bn0Var3.g, iArr6);
            yf.f(iArr7, bn0Var5.g, iArr7);
            yf.f(iArr7, bn0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = bn0Var6.h();
        if (h2) {
            iArr3 = bn0Var.g;
            iArr4 = bn0Var2.g;
        } else {
            yf.i(bn0Var6.g, iArr8);
            yf.f(iArr8, bn0Var.g, iArr5);
            yf.f(iArr8, bn0Var6.g, iArr8);
            yf.f(iArr8, bn0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        yf.k(iArr3, iArr, iArr9);
        yf.k(iArr4, iArr2, iArr6);
        if (z61.r0(iArr9)) {
            if (z61.r0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        yf.i(iArr9, iArr7);
        int[] iArr10 = new int[8];
        yf.f(iArr7, iArr9, iArr10);
        yf.f(iArr7, iArr3, iArr7);
        if (z61.r0(iArr10)) {
            z61.C1(iArr10);
        } else {
            z61.o1(yf.P, iArr10, iArr10);
        }
        z61.D0(iArr4, iArr10, iArr5);
        yf.h(iArr10, z61.l(iArr7, iArr7, iArr10));
        bn0 bn0Var7 = new bn0(iArr8);
        yf.i(iArr6, iArr8);
        int[] iArr11 = bn0Var7.g;
        yf.k(iArr11, iArr10, iArr11);
        bn0 bn0Var8 = new bn0(iArr10);
        yf.k(iArr7, bn0Var7.g, iArr10);
        if (z61.I0(bn0Var8.g, iArr6, iArr5) == 0) {
            if ((iArr5[15] >>> 1) >= Integer.MAX_VALUE) {
                i = 16;
            }
            yf.g(iArr5, bn0Var8.g);
            bn0 bn0Var9 = new bn0(iArr9);
            if (!h) {
                yf.f(iArr9, bn0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = bn0Var9.g;
                yf.f(iArr12, bn0Var6.g, iArr12);
            }
            return new cn0(hnVar, bn0Var7, bn0Var8, new jn[]{bn0Var9}, this.e);
        }
        i = 16;
        z61.q1(i, yf.Q, iArr5);
        yf.g(iArr5, bn0Var8.g);
        bn0 bn0Var92 = new bn0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new cn0(hnVar, bn0Var7, bn0Var8, new jn[]{bn0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new cn0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new cn0(this.a, this.b, this.c.m(), this.d, this.e);
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
        bn0 bn0Var = (bn0) this.c;
        if (bn0Var.i()) {
            return hnVar.k();
        }
        bn0 bn0Var2 = (bn0) this.b;
        bn0 bn0Var3 = (bn0) this.d[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        yf.i(bn0Var.g, iArr3);
        int[] iArr4 = new int[8];
        yf.i(iArr3, iArr4);
        boolean h = bn0Var3.h();
        int[] iArr5 = bn0Var3.g;
        if (!h) {
            yf.i(iArr5, iArr2);
            iArr5 = iArr2;
        }
        yf.k(bn0Var2.g, iArr5, iArr);
        if (z61.e(bn0Var2.g, iArr5, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && z61.Y(iArr2, yf.P))) {
            yf.b(iArr2);
        }
        yf.f(iArr2, iArr, iArr2);
        yf.h(iArr2, z61.l(iArr2, iArr2, iArr2));
        yf.f(iArr3, bn0Var2.g, iArr3);
        yf.h(iArr3, z61.Z0(8, iArr3));
        yf.h(iArr, z61.a1(8, iArr4, iArr));
        bn0 bn0Var4 = new bn0(iArr4);
        yf.i(iArr2, iArr4);
        int[] iArr6 = bn0Var4.g;
        yf.k(iArr6, iArr3, iArr6);
        int[] iArr7 = bn0Var4.g;
        yf.k(iArr7, iArr3, iArr7);
        bn0 bn0Var5 = new bn0(iArr3);
        yf.k(iArr3, bn0Var4.g, iArr3);
        int[] iArr8 = bn0Var5.g;
        yf.f(iArr8, iArr2, iArr8);
        int[] iArr9 = bn0Var5.g;
        yf.k(iArr9, iArr, iArr9);
        bn0 bn0Var6 = new bn0(iArr2);
        if (z61.Y0(8, 0, bn0Var.g, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && z61.Y(iArr2, yf.P))) {
            yf.b(iArr2);
        }
        if (!h) {
            int[] iArr10 = bn0Var6.g;
            yf.f(iArr10, bn0Var3.g, iArr10);
        }
        return new cn0(hnVar, bn0Var4, bn0Var5, new jn[]{bn0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}