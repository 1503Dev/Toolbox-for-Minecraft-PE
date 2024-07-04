package defpackage;

import defpackage.wn;

/* renamed from: fo0  reason: default package */
public final class fo0 extends wn.b {
    public fo0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public fo0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (defpackage.z61.T(12, r10, defpackage.o7.Q) != false) goto L34;
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
        eo0 eo0Var = (eo0) this.b;
        eo0 eo0Var2 = (eo0) this.c;
        eo0 eo0Var3 = (eo0) wnVar.b;
        eo0 eo0Var4 = (eo0) wnVar.h();
        eo0 eo0Var5 = (eo0) this.d[0];
        eo0 eo0Var6 = (eo0) wnVar.i();
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean h = eo0Var5.h();
        if (h) {
            iArr = eo0Var3.g;
            iArr2 = eo0Var4.g;
        } else {
            o7.l(eo0Var5.g, iArr7);
            o7.i(iArr7, eo0Var3.g, iArr6);
            o7.i(iArr7, eo0Var5.g, iArr7);
            o7.i(iArr7, eo0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = eo0Var6.h();
        if (h2) {
            iArr3 = eo0Var.g;
            iArr4 = eo0Var2.g;
        } else {
            o7.l(eo0Var6.g, iArr8);
            o7.i(iArr8, eo0Var.g, iArr5);
            o7.i(iArr8, eo0Var6.g, iArr8);
            o7.i(iArr8, eo0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[6];
        o7.n(iArr3, iArr, iArr9);
        o7.n(iArr4, iArr2, iArr6);
        if (z61.p0(iArr9)) {
            if (z61.p0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        o7.l(iArr9, iArr7);
        int[] iArr10 = new int[6];
        o7.i(iArr7, iArr9, iArr10);
        o7.i(iArr7, iArr3, iArr7);
        if (z61.p0(iArr10)) {
            iArr10[0] = 0;
            iArr10[1] = 0;
            iArr10[2] = 0;
            iArr10[3] = 0;
            iArr10[4] = 0;
            iArr10[5] = 0;
        } else {
            z61.m1(o7.P, iArr10, iArr10);
        }
        z61.B0(iArr4, iArr10, iArr5);
        o7.k(iArr10, z61.j(iArr7, iArr7, iArr10));
        eo0 eo0Var7 = new eo0(iArr8);
        o7.l(iArr6, iArr8);
        int[] iArr11 = eo0Var7.g;
        o7.n(iArr11, iArr10, iArr11);
        eo0 eo0Var8 = new eo0(iArr10);
        o7.n(iArr7, eo0Var7.g, iArr10);
        if (z61.G0(eo0Var8.g, iArr6, iArr5) == 0) {
            if (iArr5[11] == -1) {
                i = 12;
            }
            o7.j(iArr5, eo0Var8.g);
            eo0 eo0Var9 = new eo0(iArr9);
            if (!h) {
                o7.i(iArr9, eo0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = eo0Var9.g;
                o7.i(iArr12, eo0Var6.g, iArr12);
            }
            return new fo0(hnVar, eo0Var7, eo0Var8, new jn[]{eo0Var9}, this.e);
        }
        i = 12;
        if (z61.n(9, o7.R, iArr5) != 0) {
            z61.b0(i, 9, iArr5);
        }
        o7.j(iArr5, eo0Var8.g);
        eo0 eo0Var92 = new eo0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new fo0(hnVar, eo0Var7, eo0Var8, new jn[]{eo0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new fo0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new fo0(this.a, this.b, this.c.m(), this.d, this.e);
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
        eo0 eo0Var = (eo0) this.c;
        if (eo0Var.i()) {
            return hnVar.k();
        }
        eo0 eo0Var2 = (eo0) this.b;
        eo0 eo0Var3 = (eo0) this.d[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        o7.l(eo0Var.g, iArr3);
        int[] iArr4 = new int[6];
        o7.l(iArr3, iArr4);
        boolean h = eo0Var3.h();
        int[] iArr5 = eo0Var3.g;
        if (!h) {
            o7.l(iArr5, iArr2);
            iArr5 = iArr2;
        }
        o7.n(eo0Var2.g, iArr5, iArr);
        if (z61.c(eo0Var2.g, iArr5, iArr2) != 0 || (iArr2[5] == -1 && z61.W(iArr2, o7.P))) {
            o7.h(iArr2);
        }
        o7.i(iArr2, iArr, iArr2);
        o7.k(iArr2, z61.j(iArr2, iArr2, iArr2));
        o7.i(iArr3, eo0Var2.g, iArr3);
        o7.k(iArr3, z61.Z0(6, iArr3));
        o7.k(iArr, z61.a1(6, iArr4, iArr));
        eo0 eo0Var4 = new eo0(iArr4);
        o7.l(iArr2, iArr4);
        int[] iArr6 = eo0Var4.g;
        o7.n(iArr6, iArr3, iArr6);
        int[] iArr7 = eo0Var4.g;
        o7.n(iArr7, iArr3, iArr7);
        eo0 eo0Var5 = new eo0(iArr3);
        o7.n(iArr3, eo0Var4.g, iArr3);
        int[] iArr8 = eo0Var5.g;
        o7.i(iArr8, iArr2, iArr8);
        int[] iArr9 = eo0Var5.g;
        o7.n(iArr9, iArr, iArr9);
        eo0 eo0Var6 = new eo0(iArr2);
        if (z61.Y0(6, 0, eo0Var.g, iArr2) != 0 || (iArr2[5] == -1 && z61.W(iArr2, o7.P))) {
            o7.h(iArr2);
        }
        if (!h) {
            int[] iArr10 = eo0Var6.g;
            o7.i(iArr10, eo0Var3.g, iArr10);
        }
        return new fo0(hnVar, eo0Var4, eo0Var5, new jn[]{eo0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}