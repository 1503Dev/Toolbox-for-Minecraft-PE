package defpackage;

import defpackage.wn;

/* renamed from: uo0  reason: default package */
public final class uo0 extends wn.b {
    public uo0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public uo0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
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
        to0 to0Var = (to0) this.b;
        to0 to0Var2 = (to0) this.c;
        to0 to0Var3 = (to0) wnVar.b;
        to0 to0Var4 = (to0) wnVar.h();
        to0 to0Var5 = (to0) this.d[0];
        to0 to0Var6 = (to0) wnVar.i();
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[12];
        int[] iArr8 = new int[12];
        boolean h = to0Var5.h();
        if (h) {
            iArr = to0Var3.g;
            iArr2 = to0Var4.g;
        } else {
            dt4.g(to0Var5.g, iArr7);
            dt4.b(iArr7, to0Var3.g, iArr6);
            dt4.b(iArr7, to0Var5.g, iArr7);
            dt4.b(iArr7, to0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = to0Var6.h();
        if (h2) {
            iArr3 = to0Var.g;
            iArr4 = to0Var2.g;
        } else {
            dt4.g(to0Var6.g, iArr8);
            dt4.b(iArr8, to0Var.g, iArr5);
            dt4.b(iArr8, to0Var6.g, iArr8);
            dt4.b(iArr8, to0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[12];
        dt4.i(iArr3, iArr, iArr9);
        int[] iArr10 = new int[12];
        dt4.i(iArr4, iArr2, iArr10);
        if (z61.n0(iArr9, 12)) {
            if (z61.n0(iArr10, 12)) {
                return w();
            }
            return hnVar.k();
        }
        dt4.g(iArr9, iArr7);
        int[] iArr11 = new int[12];
        dt4.b(iArr7, iArr9, iArr11);
        dt4.b(iArr7, iArr3, iArr7);
        if (z61.n0(iArr11, 12)) {
            for (int i = 0; i < 12; i++) {
                iArr11[i] = 0;
            }
        } else {
            z61.h1(12, dt4.P, iArr11, iArr11);
        }
        z61.E0(iArr4, iArr11, iArr5);
        dt4.d(iArr11, z61.g(12, iArr7, iArr7, iArr11));
        to0 to0Var7 = new to0(iArr8);
        dt4.g(iArr10, iArr8);
        int[] iArr12 = to0Var7.g;
        dt4.i(iArr12, iArr11, iArr12);
        to0 to0Var8 = new to0(iArr11);
        dt4.i(iArr7, to0Var7.g, iArr11);
        z61.E0(to0Var8.g, iArr10, iArr6);
        if ((z61.a(24, iArr5, iArr6, iArr5) != 0 || (iArr5[23] == -1 && z61.T(24, iArr5, dt4.Q))) && z61.n(17, dt4.R, iArr5) != 0) {
            z61.b0(24, 17, iArr5);
        }
        dt4.c(iArr5, to0Var8.g);
        to0 to0Var9 = new to0(iArr9);
        if (!h) {
            dt4.b(iArr9, to0Var5.g, iArr9);
        }
        if (!h2) {
            int[] iArr13 = to0Var9.g;
            dt4.b(iArr13, to0Var6.g, iArr13);
        }
        return new uo0(hnVar, to0Var7, to0Var8, new jn[]{to0Var9}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new uo0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new uo0(this.a, this.b, this.c.m(), this.d, this.e);
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
        to0 to0Var = (to0) this.c;
        if (to0Var.i()) {
            return hnVar.k();
        }
        to0 to0Var2 = (to0) this.b;
        to0 to0Var3 = (to0) this.d[0];
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        dt4.g(to0Var.g, iArr3);
        int[] iArr4 = new int[12];
        dt4.g(iArr3, iArr4);
        boolean h = to0Var3.h();
        int[] iArr5 = to0Var3.g;
        if (!h) {
            dt4.g(iArr5, iArr2);
            iArr5 = iArr2;
        }
        dt4.i(to0Var2.g, iArr5, iArr);
        if (z61.a(12, to0Var2.g, iArr5, iArr2) != 0 || (iArr2[11] == -1 && z61.T(12, iArr2, dt4.P))) {
            dt4.a(iArr2);
        }
        dt4.b(iArr2, iArr, iArr2);
        dt4.d(iArr2, z61.g(12, iArr2, iArr2, iArr2));
        dt4.b(iArr3, to0Var2.g, iArr3);
        dt4.d(iArr3, z61.Z0(12, iArr3));
        dt4.d(iArr, z61.a1(12, iArr4, iArr));
        to0 to0Var4 = new to0(iArr4);
        dt4.g(iArr2, iArr4);
        int[] iArr6 = to0Var4.g;
        dt4.i(iArr6, iArr3, iArr6);
        int[] iArr7 = to0Var4.g;
        dt4.i(iArr7, iArr3, iArr7);
        to0 to0Var5 = new to0(iArr3);
        dt4.i(iArr3, to0Var4.g, iArr3);
        int[] iArr8 = to0Var5.g;
        dt4.b(iArr8, iArr2, iArr8);
        int[] iArr9 = to0Var5.g;
        dt4.i(iArr9, iArr, iArr9);
        to0 to0Var6 = new to0(iArr2);
        if (z61.Y0(12, 0, to0Var.g, iArr2) != 0 || (iArr2[11] == -1 && z61.T(12, iArr2, dt4.P))) {
            dt4.a(iArr2);
        }
        if (!h) {
            int[] iArr10 = to0Var6.g;
            dt4.b(iArr10, to0Var3.g, iArr10);
        }
        return new uo0(hnVar, to0Var4, to0Var5, new jn[]{to0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}