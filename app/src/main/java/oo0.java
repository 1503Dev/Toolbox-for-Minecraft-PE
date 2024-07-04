package defpackage;

import defpackage.wn;

/* renamed from: oo0  reason: default package */
public final class oo0 extends wn.b {
    public oo0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public oo0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
        if (defpackage.z61.T(16, r10, defpackage.ar.Q) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
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
        no0 no0Var = (no0) this.b;
        no0 no0Var2 = (no0) this.c;
        no0 no0Var3 = (no0) wnVar.b;
        no0 no0Var4 = (no0) wnVar.h();
        no0 no0Var5 = (no0) this.d[0];
        no0 no0Var6 = (no0) wnVar.i();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean h = no0Var5.h();
        if (h) {
            iArr = no0Var3.g;
            iArr2 = no0Var4.g;
        } else {
            ar.j(no0Var5.g, iArr7);
            ar.g(iArr7, no0Var3.g, iArr6);
            ar.g(iArr7, no0Var5.g, iArr7);
            ar.g(iArr7, no0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = no0Var6.h();
        if (h2) {
            iArr3 = no0Var.g;
            iArr4 = no0Var2.g;
        } else {
            ar.j(no0Var6.g, iArr8);
            ar.g(iArr8, no0Var.g, iArr5);
            ar.g(iArr8, no0Var6.g, iArr8);
            ar.g(iArr8, no0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        ar.l(iArr3, iArr, iArr9);
        ar.l(iArr4, iArr2, iArr6);
        if (z61.r0(iArr9)) {
            if (z61.r0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        ar.j(iArr9, iArr7);
        int[] iArr10 = new int[8];
        ar.g(iArr7, iArr9, iArr10);
        ar.g(iArr7, iArr3, iArr7);
        if (z61.r0(iArr10)) {
            z61.C1(iArr10);
        } else {
            z61.o1(ar.P, iArr10, iArr10);
        }
        z61.D0(iArr4, iArr10, iArr5);
        ar.i(iArr10, z61.l(iArr7, iArr7, iArr10));
        no0 no0Var7 = new no0(iArr8);
        ar.j(iArr6, iArr8);
        int[] iArr11 = no0Var7.g;
        ar.l(iArr11, iArr10, iArr11);
        no0 no0Var8 = new no0(iArr10);
        ar.l(iArr7, no0Var7.g, iArr10);
        if (z61.I0(no0Var8.g, iArr6, iArr5) == 0) {
            if (iArr5[15] == -1) {
                i = 16;
            }
            ar.h(iArr5, no0Var8.g);
            no0 no0Var9 = new no0(iArr9);
            if (!h) {
                ar.g(iArr9, no0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = no0Var9.g;
                ar.g(iArr12, no0Var6.g, iArr12);
            }
            return new oo0(hnVar, no0Var7, no0Var8, new jn[]{no0Var9}, this.e);
        }
        i = 16;
        if (z61.n(10, ar.R, iArr5) != 0) {
            z61.b0(i, 10, iArr5);
        }
        ar.h(iArr5, no0Var8.g);
        no0 no0Var92 = new no0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new oo0(hnVar, no0Var7, no0Var8, new jn[]{no0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new oo0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new oo0(this.a, this.b, this.c.m(), this.d, this.e);
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
        no0 no0Var = (no0) this.c;
        if (no0Var.i()) {
            return hnVar.k();
        }
        no0 no0Var2 = (no0) this.b;
        no0 no0Var3 = (no0) this.d[0];
        int[] iArr = new int[8];
        ar.j(no0Var.g, iArr);
        int[] iArr2 = new int[8];
        ar.j(iArr, iArr2);
        int[] iArr3 = new int[8];
        ar.j(no0Var2.g, iArr3);
        ar.i(iArr3, z61.l(iArr3, iArr3, iArr3));
        ar.g(iArr, no0Var2.g, iArr);
        ar.i(iArr, z61.Z0(8, iArr));
        int[] iArr4 = new int[8];
        ar.i(iArr4, z61.a1(8, iArr2, iArr4));
        no0 no0Var4 = new no0(iArr2);
        ar.j(iArr3, iArr2);
        int[] iArr5 = no0Var4.g;
        ar.l(iArr5, iArr, iArr5);
        int[] iArr6 = no0Var4.g;
        ar.l(iArr6, iArr, iArr6);
        no0 no0Var5 = new no0(iArr);
        ar.l(iArr, no0Var4.g, iArr);
        int[] iArr7 = no0Var5.g;
        ar.g(iArr7, iArr3, iArr7);
        int[] iArr8 = no0Var5.g;
        ar.l(iArr8, iArr4, iArr8);
        no0 no0Var6 = new no0(iArr3);
        if (z61.Y0(8, 0, no0Var.g, iArr3) != 0 || (iArr3[7] == -1 && z61.Y(iArr3, ar.P))) {
            z61.f(8, 977, iArr3);
        }
        if (!no0Var3.h()) {
            int[] iArr9 = no0Var6.g;
            ar.g(iArr9, no0Var3.g, iArr9);
        }
        return new oo0(hnVar, no0Var4, no0Var5, new jn[]{no0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}