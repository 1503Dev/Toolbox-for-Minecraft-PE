package defpackage;

import defpackage.wn;

/* renamed from: ro0  reason: default package */
public final class ro0 extends wn.b {
    public ro0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public ro0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
        if (defpackage.z61.T(16, r10, defpackage.n42.Q) != false) goto L34;
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
        qo0 qo0Var = (qo0) this.b;
        qo0 qo0Var2 = (qo0) this.c;
        qo0 qo0Var3 = (qo0) wnVar.b;
        qo0 qo0Var4 = (qo0) wnVar.h();
        qo0 qo0Var5 = (qo0) this.d[0];
        qo0 qo0Var6 = (qo0) wnVar.i();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean h = qo0Var5.h();
        if (h) {
            iArr = qo0Var3.g;
            iArr2 = qo0Var4.g;
        } else {
            n42.m(qo0Var5.g, iArr7);
            n42.i(iArr7, qo0Var3.g, iArr6);
            n42.i(iArr7, qo0Var5.g, iArr7);
            n42.i(iArr7, qo0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = qo0Var6.h();
        if (h2) {
            iArr3 = qo0Var.g;
            iArr4 = qo0Var2.g;
        } else {
            n42.m(qo0Var6.g, iArr8);
            n42.i(iArr8, qo0Var.g, iArr5);
            n42.i(iArr8, qo0Var6.g, iArr8);
            n42.i(iArr8, qo0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        n42.o(iArr3, iArr, iArr9);
        n42.o(iArr4, iArr2, iArr6);
        if (z61.r0(iArr9)) {
            if (z61.r0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        n42.m(iArr9, iArr7);
        int[] iArr10 = new int[8];
        n42.i(iArr7, iArr9, iArr10);
        n42.i(iArr7, iArr3, iArr7);
        if (z61.r0(iArr10)) {
            z61.C1(iArr10);
        } else {
            z61.o1(n42.P, iArr10, iArr10);
        }
        z61.D0(iArr4, iArr10, iArr5);
        n42.k(iArr10, z61.l(iArr7, iArr7, iArr10));
        qo0 qo0Var7 = new qo0(iArr8);
        n42.m(iArr6, iArr8);
        int[] iArr11 = qo0Var7.g;
        n42.o(iArr11, iArr10, iArr11);
        qo0 qo0Var8 = new qo0(iArr10);
        n42.o(iArr7, qo0Var7.g, iArr10);
        if (z61.I0(qo0Var8.g, iArr6, iArr5) == 0) {
            if ((iArr5[15] >>> 1) >= Integer.MAX_VALUE) {
                i = 16;
            }
            n42.j(iArr5, qo0Var8.g);
            qo0 qo0Var9 = new qo0(iArr9);
            if (!h) {
                n42.i(iArr9, qo0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = qo0Var9.g;
                n42.i(iArr12, qo0Var6.g, iArr12);
            }
            return new ro0(hnVar, qo0Var7, qo0Var8, new jn[]{qo0Var9}, this.e);
        }
        i = 16;
        z61.q1(i, n42.Q, iArr5);
        n42.j(iArr5, qo0Var8.g);
        qo0 qo0Var92 = new qo0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new ro0(hnVar, qo0Var7, qo0Var8, new jn[]{qo0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new ro0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new ro0(this.a, this.b, this.c.m(), this.d, this.e);
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
        qo0 qo0Var = (qo0) this.c;
        if (qo0Var.i()) {
            return hnVar.k();
        }
        qo0 qo0Var2 = (qo0) this.b;
        qo0 qo0Var3 = (qo0) this.d[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        n42.m(qo0Var.g, iArr3);
        int[] iArr4 = new int[8];
        n42.m(iArr3, iArr4);
        boolean h = qo0Var3.h();
        int[] iArr5 = qo0Var3.g;
        if (!h) {
            n42.m(iArr5, iArr2);
            iArr5 = iArr2;
        }
        n42.o(qo0Var2.g, iArr5, iArr);
        if (z61.e(qo0Var2.g, iArr5, iArr2) != 0 || (iArr2[7] == -1 && z61.Y(iArr2, n42.P))) {
            n42.a(iArr2);
        }
        n42.i(iArr2, iArr, iArr2);
        n42.k(iArr2, z61.l(iArr2, iArr2, iArr2));
        n42.i(iArr3, qo0Var2.g, iArr3);
        n42.k(iArr3, z61.Z0(8, iArr3));
        n42.k(iArr, z61.a1(8, iArr4, iArr));
        qo0 qo0Var4 = new qo0(iArr4);
        n42.m(iArr2, iArr4);
        int[] iArr6 = qo0Var4.g;
        n42.o(iArr6, iArr3, iArr6);
        int[] iArr7 = qo0Var4.g;
        n42.o(iArr7, iArr3, iArr7);
        qo0 qo0Var5 = new qo0(iArr3);
        n42.o(iArr3, qo0Var4.g, iArr3);
        int[] iArr8 = qo0Var5.g;
        n42.i(iArr8, iArr2, iArr8);
        int[] iArr9 = qo0Var5.g;
        n42.o(iArr9, iArr, iArr9);
        qo0 qo0Var6 = new qo0(iArr2);
        if (z61.Y0(8, 0, qo0Var.g, iArr2) != 0 || (iArr2[7] == -1 && z61.Y(iArr2, n42.P))) {
            n42.a(iArr2);
        }
        if (!h) {
            int[] iArr10 = qo0Var6.g;
            n42.i(iArr10, qo0Var3.g, iArr10);
        }
        return new ro0(hnVar, qo0Var4, qo0Var5, new jn[]{qo0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}