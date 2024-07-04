package defpackage;

import defpackage.wn;

/* renamed from: tn0  reason: default package */
public final class tn0 extends wn.b {
    public tn0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public tn0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
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
        yn0 yn0Var = (yn0) this.b;
        yn0 yn0Var2 = (yn0) this.c;
        yn0 yn0Var3 = (yn0) wnVar.b;
        yn0 yn0Var4 = (yn0) wnVar.h();
        yn0 yn0Var5 = (yn0) this.d[0];
        yn0 yn0Var6 = (yn0) wnVar.i();
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean h = yn0Var5.h();
        if (h) {
            iArr = yn0Var3.g;
            iArr2 = yn0Var4.g;
        } else {
            h50.o(yn0Var5.g, iArr7);
            h50.k(iArr7, yn0Var3.g, iArr6);
            h50.k(iArr7, yn0Var5.g, iArr7);
            h50.k(iArr7, yn0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = yn0Var6.h();
        if (h2) {
            iArr3 = yn0Var.g;
            iArr4 = yn0Var2.g;
        } else {
            h50.o(yn0Var6.g, iArr8);
            h50.k(iArr8, yn0Var.g, iArr5);
            h50.k(iArr8, yn0Var6.g, iArr8);
            h50.k(iArr8, yn0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[5];
        h50.q(iArr3, iArr, iArr9);
        h50.q(iArr4, iArr2, iArr6);
        if (z61.o0(iArr9)) {
            if (z61.o0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        h50.o(iArr9, iArr7);
        int[] iArr10 = new int[5];
        h50.k(iArr7, iArr9, iArr10);
        h50.k(iArr7, iArr3, iArr7);
        if (z61.o0(iArr10)) {
            iArr10[0] = 0;
            iArr10[1] = 0;
            iArr10[2] = 0;
            iArr10[3] = 0;
            iArr10[4] = 0;
        } else {
            z61.k1(h50.P, iArr10, iArr10);
        }
        z61.A0(iArr4, iArr10, iArr5);
        h50.n(iArr10, z61.i(iArr7, iArr7, iArr10));
        yn0 yn0Var7 = new yn0(iArr8);
        h50.o(iArr6, iArr8);
        int[] iArr11 = yn0Var7.g;
        h50.q(iArr11, iArr10, iArr11);
        yn0 yn0Var8 = new yn0(iArr10);
        h50.q(iArr7, yn0Var7.g, iArr10);
        h50.l(yn0Var8.g, iArr6, iArr5);
        h50.m(iArr5, yn0Var8.g);
        yn0 yn0Var9 = new yn0(iArr9);
        if (!h) {
            h50.k(iArr9, yn0Var5.g, iArr9);
        }
        if (!h2) {
            int[] iArr12 = yn0Var9.g;
            h50.k(iArr12, yn0Var6.g, iArr12);
        }
        return new tn0(hnVar, yn0Var7, yn0Var8, new jn[]{yn0Var9}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new tn0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new tn0(this.a, this.b, this.c.m(), this.d, this.e);
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
        yn0 yn0Var = (yn0) this.c;
        if (yn0Var.i()) {
            return hnVar.k();
        }
        yn0 yn0Var2 = (yn0) this.b;
        yn0 yn0Var3 = (yn0) this.d[0];
        int[] iArr = new int[5];
        h50.o(yn0Var.g, iArr);
        int[] iArr2 = new int[5];
        h50.o(iArr, iArr2);
        int[] iArr3 = new int[5];
        h50.o(yn0Var2.g, iArr3);
        h50.n(iArr3, z61.i(iArr3, iArr3, iArr3));
        h50.k(iArr, yn0Var2.g, iArr);
        h50.n(iArr, z61.Z0(5, iArr));
        int[] iArr4 = new int[5];
        h50.n(iArr4, z61.a1(5, iArr2, iArr4));
        yn0 yn0Var4 = new yn0(iArr2);
        h50.o(iArr3, iArr2);
        int[] iArr5 = yn0Var4.g;
        h50.q(iArr5, iArr, iArr5);
        int[] iArr6 = yn0Var4.g;
        h50.q(iArr6, iArr, iArr6);
        yn0 yn0Var5 = new yn0(iArr);
        h50.q(iArr, yn0Var4.g, iArr);
        int[] iArr7 = yn0Var5.g;
        h50.k(iArr7, iArr3, iArr7);
        int[] iArr8 = yn0Var5.g;
        h50.q(iArr8, iArr4, iArr8);
        yn0 yn0Var6 = new yn0(iArr3);
        if (z61.Y0(5, 0, yn0Var.g, iArr3) != 0 || (iArr3[4] == -1 && z61.V(iArr3, h50.P))) {
            z61.f(5, 21389, iArr3);
        }
        if (!yn0Var3.h()) {
            int[] iArr9 = yn0Var6.g;
            h50.k(iArr9, yn0Var3.g, iArr9);
        }
        return new tn0(hnVar, yn0Var4, yn0Var5, new jn[]{yn0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}