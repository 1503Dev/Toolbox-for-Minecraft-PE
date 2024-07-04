package defpackage;

import defpackage.wn;

/* renamed from: io0  reason: default package */
public final class io0 extends wn.b {
    public io0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public io0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
        if (defpackage.z61.T(14, r10, defpackage.ga1.V) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
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
        ho0 ho0Var = (ho0) this.b;
        ho0 ho0Var2 = (ho0) this.c;
        ho0 ho0Var3 = (ho0) wnVar.b;
        ho0 ho0Var4 = (ho0) wnVar.h();
        ho0 ho0Var5 = (ho0) this.d[0];
        ho0 ho0Var6 = (ho0) wnVar.i();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean h = ho0Var5.h();
        if (h) {
            iArr = ho0Var3.g;
            iArr2 = ho0Var4.g;
        } else {
            ga1.p(ho0Var5.g, iArr7);
            ga1.m(iArr7, ho0Var3.g, iArr6);
            ga1.m(iArr7, ho0Var5.g, iArr7);
            ga1.m(iArr7, ho0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = ho0Var6.h();
        if (h2) {
            iArr3 = ho0Var.g;
            iArr4 = ho0Var2.g;
        } else {
            ga1.p(ho0Var6.g, iArr8);
            ga1.m(iArr8, ho0Var.g, iArr5);
            ga1.m(iArr8, ho0Var6.g, iArr8);
            ga1.m(iArr8, ho0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[7];
        ga1.r(iArr3, iArr, iArr9);
        ga1.r(iArr4, iArr2, iArr6);
        if (z61.q0(iArr9)) {
            if (z61.q0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        ga1.p(iArr9, iArr7);
        int[] iArr10 = new int[7];
        ga1.m(iArr7, iArr9, iArr10);
        ga1.m(iArr7, iArr3, iArr7);
        if (z61.q0(iArr10)) {
            iArr10[0] = 0;
            iArr10[1] = 0;
            iArr10[2] = 0;
            iArr10[3] = 0;
            iArr10[4] = 0;
            iArr10[5] = 0;
            iArr10[6] = 0;
        } else {
            z61.n1(ga1.U, iArr10, iArr10);
        }
        z61.C0(iArr4, iArr10, iArr5);
        ga1.o(iArr10, z61.k(iArr7, iArr7, iArr10));
        ho0 ho0Var7 = new ho0(iArr8);
        ga1.p(iArr6, iArr8);
        int[] iArr11 = ho0Var7.g;
        ga1.r(iArr11, iArr10, iArr11);
        ho0 ho0Var8 = new ho0(iArr10);
        ga1.r(iArr7, ho0Var7.g, iArr10);
        if (z61.H0(ho0Var8.g, iArr6, iArr5) == 0) {
            if (iArr5[13] == -1) {
                i = 14;
            }
            ga1.n(iArr5, ho0Var8.g);
            ho0 ho0Var9 = new ho0(iArr9);
            if (!h) {
                ga1.m(iArr9, ho0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = ho0Var9.g;
                ga1.m(iArr12, ho0Var6.g, iArr12);
            }
            return new io0(hnVar, ho0Var7, ho0Var8, new jn[]{ho0Var9}, this.e);
        }
        i = 14;
        if (z61.n(9, ga1.W, iArr5) != 0) {
            z61.b0(i, 9, iArr5);
        }
        ga1.n(iArr5, ho0Var8.g);
        ho0 ho0Var92 = new ho0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new io0(hnVar, ho0Var7, ho0Var8, new jn[]{ho0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new io0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new io0(this.a, this.b, this.c.m(), this.d, this.e);
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
        ho0 ho0Var = (ho0) this.c;
        if (ho0Var.i()) {
            return hnVar.k();
        }
        ho0 ho0Var2 = (ho0) this.b;
        ho0 ho0Var3 = (ho0) this.d[0];
        int[] iArr = new int[7];
        ga1.p(ho0Var.g, iArr);
        int[] iArr2 = new int[7];
        ga1.p(iArr, iArr2);
        int[] iArr3 = new int[7];
        ga1.p(ho0Var2.g, iArr3);
        ga1.o(iArr3, z61.k(iArr3, iArr3, iArr3));
        ga1.m(iArr, ho0Var2.g, iArr);
        ga1.o(iArr, z61.Z0(7, iArr));
        int[] iArr4 = new int[7];
        ga1.o(iArr4, z61.a1(7, iArr2, iArr4));
        ho0 ho0Var4 = new ho0(iArr2);
        ga1.p(iArr3, iArr2);
        int[] iArr5 = ho0Var4.g;
        ga1.r(iArr5, iArr, iArr5);
        int[] iArr6 = ho0Var4.g;
        ga1.r(iArr6, iArr, iArr6);
        ho0 ho0Var5 = new ho0(iArr);
        ga1.r(iArr, ho0Var4.g, iArr);
        int[] iArr7 = ho0Var5.g;
        ga1.m(iArr7, iArr3, iArr7);
        int[] iArr8 = ho0Var5.g;
        ga1.r(iArr8, iArr4, iArr8);
        ho0 ho0Var6 = new ho0(iArr3);
        if (z61.Y0(7, 0, ho0Var.g, iArr3) != 0 || (iArr3[6] == -1 && z61.X(iArr3, ga1.U))) {
            z61.f(7, 6803, iArr3);
        }
        if (!ho0Var3.h()) {
            int[] iArr9 = ho0Var6.g;
            ga1.m(iArr9, ho0Var3.g, iArr9);
        }
        return new io0(hnVar, ho0Var4, ho0Var5, new jn[]{ho0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}