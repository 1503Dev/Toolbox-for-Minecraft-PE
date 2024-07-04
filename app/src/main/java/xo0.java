package defpackage;

import defpackage.wn;

/* renamed from: xo0  reason: default package */
public final class xo0 extends wn.b {
    public xo0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public xo0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    @Override // defpackage.wn
    public final wn a(wn wnVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
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
        wo0 wo0Var = (wo0) this.b;
        wo0 wo0Var2 = (wo0) this.c;
        wo0 wo0Var3 = (wo0) wnVar.b;
        wo0 wo0Var4 = (wo0) wnVar.h();
        wo0 wo0Var5 = (wo0) this.d[0];
        wo0 wo0Var6 = (wo0) wnVar.i();
        int[] iArr5 = new int[17];
        int[] iArr6 = new int[17];
        int[] iArr7 = new int[17];
        int[] iArr8 = new int[17];
        boolean h = wo0Var5.h();
        if (h) {
            iArr = wo0Var3.g;
            iArr2 = wo0Var4.g;
        } else {
            da2.i(wo0Var5.g, iArr7);
            da2.f(iArr7, wo0Var3.g, iArr6);
            da2.f(iArr7, wo0Var5.g, iArr7);
            da2.f(iArr7, wo0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = wo0Var6.h();
        if (h2) {
            iArr3 = wo0Var.g;
            iArr4 = wo0Var2.g;
        } else {
            da2.i(wo0Var6.g, iArr8);
            da2.f(iArr8, wo0Var.g, iArr5);
            da2.f(iArr8, wo0Var6.g, iArr8);
            da2.f(iArr8, wo0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[17];
        da2.j(iArr3, iArr, iArr9);
        da2.j(iArr4, iArr2, iArr6);
        if (z61.n0(iArr9, 17)) {
            if (z61.n0(iArr6, 17)) {
                return w();
            }
            return hnVar.k();
        }
        da2.i(iArr9, iArr7);
        int[] iArr10 = new int[17];
        da2.f(iArr7, iArr9, iArr10);
        da2.f(iArr7, iArr3, iArr7);
        da2.f(iArr4, iArr10, iArr5);
        wo0 wo0Var7 = new wo0(iArr8);
        da2.i(iArr6, iArr8);
        int[] iArr11 = wo0Var7.g;
        da2.a(iArr11, iArr10, iArr11);
        int[] iArr12 = wo0Var7.g;
        da2.j(iArr12, iArr7, iArr12);
        int[] iArr13 = wo0Var7.g;
        da2.j(iArr13, iArr7, iArr13);
        wo0 wo0Var8 = new wo0(iArr10);
        da2.j(iArr7, wo0Var7.g, iArr10);
        da2.f(wo0Var8.g, iArr6, iArr6);
        da2.j(iArr6, iArr5, wo0Var8.g);
        wo0 wo0Var9 = new wo0(iArr9);
        if (!h) {
            da2.f(iArr9, wo0Var5.g, iArr9);
        }
        if (!h2) {
            int[] iArr14 = wo0Var9.g;
            da2.f(iArr14, wo0Var6.g, iArr14);
        }
        return new xo0(hnVar, wo0Var7, wo0Var8, new jn[]{wo0Var9}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new xo0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new xo0(this.a, this.b, this.c.m(), this.d, this.e);
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
        wo0 wo0Var = (wo0) this.c;
        if (wo0Var.i()) {
            return hnVar.k();
        }
        wo0 wo0Var2 = (wo0) this.b;
        wo0 wo0Var3 = (wo0) this.d[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        da2.i(wo0Var.g, iArr3);
        int[] iArr4 = new int[17];
        da2.i(iArr3, iArr4);
        boolean h = wo0Var3.h();
        int[] iArr5 = wo0Var3.g;
        if (!h) {
            da2.i(iArr5, iArr2);
            iArr5 = iArr2;
        }
        da2.j(wo0Var2.g, iArr5, iArr);
        da2.a(wo0Var2.g, iArr5, iArr2);
        da2.f(iArr2, iArr, iArr2);
        z61.g(17, iArr2, iArr2, iArr2);
        da2.h(iArr2);
        da2.f(iArr3, wo0Var2.g, iArr3);
        z61.Z0(17, iArr3);
        da2.h(iArr3);
        z61.a1(17, iArr4, iArr);
        da2.h(iArr);
        wo0 wo0Var4 = new wo0(iArr4);
        da2.i(iArr2, iArr4);
        int[] iArr6 = wo0Var4.g;
        da2.j(iArr6, iArr3, iArr6);
        int[] iArr7 = wo0Var4.g;
        da2.j(iArr7, iArr3, iArr7);
        wo0 wo0Var5 = new wo0(iArr3);
        da2.j(iArr3, wo0Var4.g, iArr3);
        int[] iArr8 = wo0Var5.g;
        da2.f(iArr8, iArr2, iArr8);
        int[] iArr9 = wo0Var5.g;
        da2.j(iArr9, iArr, iArr9);
        wo0 wo0Var6 = new wo0(iArr2);
        int[] iArr10 = wo0Var.g;
        int i = iArr10[16];
        iArr2[16] = (z61.Y0(16, i << 23, iArr10, iArr2) | (i << 1)) & 511;
        if (!h) {
            int[] iArr11 = wo0Var6.g;
            da2.f(iArr11, wo0Var3.g, iArr11);
        }
        return new xo0(hnVar, wo0Var4, wo0Var5, new jn[]{wo0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}