package defpackage;

import defpackage.wn;

/* renamed from: wn0  reason: default package */
public final class wn0 extends wn.b {
    public wn0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public wn0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
        if (defpackage.z61.T(10, r10, defpackage.vj.Q) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
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
        vn0 vn0Var = (vn0) this.b;
        vn0 vn0Var2 = (vn0) this.c;
        vn0 vn0Var3 = (vn0) wnVar.b;
        vn0 vn0Var4 = (vn0) wnVar.h();
        vn0 vn0Var5 = (vn0) this.d[0];
        vn0 vn0Var6 = (vn0) wnVar.i();
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean h = vn0Var5.h();
        if (h) {
            iArr = vn0Var3.g;
            iArr2 = vn0Var4.g;
        } else {
            vj.C(vn0Var5.g, iArr7);
            vj.v(iArr7, vn0Var3.g, iArr6);
            vj.v(iArr7, vn0Var5.g, iArr7);
            vj.v(iArr7, vn0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = vn0Var6.h();
        if (h2) {
            iArr3 = vn0Var.g;
            iArr4 = vn0Var2.g;
        } else {
            vj.C(vn0Var6.g, iArr8);
            vj.v(iArr8, vn0Var.g, iArr5);
            vj.v(iArr8, vn0Var6.g, iArr8);
            vj.v(iArr8, vn0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[5];
        vj.F(iArr3, iArr, iArr9);
        vj.F(iArr4, iArr2, iArr6);
        if (z61.o0(iArr9)) {
            if (z61.o0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        vj.C(iArr9, iArr7);
        int[] iArr10 = new int[5];
        vj.v(iArr7, iArr9, iArr10);
        vj.v(iArr7, iArr3, iArr7);
        if (z61.o0(iArr10)) {
            iArr10[0] = 0;
            iArr10[1] = 0;
            iArr10[2] = 0;
            iArr10[3] = 0;
            iArr10[4] = 0;
        } else {
            z61.k1(vj.P, iArr10, iArr10);
        }
        z61.A0(iArr4, iArr10, iArr5);
        vj.A(iArr10, z61.i(iArr7, iArr7, iArr10));
        vn0 vn0Var7 = new vn0(iArr8);
        vj.C(iArr6, iArr8);
        int[] iArr11 = vn0Var7.g;
        vj.F(iArr11, iArr10, iArr11);
        vn0 vn0Var8 = new vn0(iArr10);
        vj.F(iArr7, vn0Var7.g, iArr10);
        if (z61.F0(vn0Var8.g, iArr6, iArr5) == 0) {
            if (iArr5[9] == -1) {
                i = 10;
            }
            vj.y(iArr5, vn0Var8.g);
            vn0 vn0Var9 = new vn0(iArr9);
            if (!h) {
                vj.v(iArr9, vn0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = vn0Var9.g;
                vj.v(iArr12, vn0Var6.g, iArr12);
            }
            return new wn0(hnVar, vn0Var7, vn0Var8, new jn[]{vn0Var9}, this.e);
        }
        i = 10;
        if (z61.n(7, vj.R, iArr5) != 0) {
            z61.b0(i, 7, iArr5);
        }
        vj.y(iArr5, vn0Var8.g);
        vn0 vn0Var92 = new vn0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new wn0(hnVar, vn0Var7, vn0Var8, new jn[]{vn0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new wn0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new wn0(this.a, this.b, this.c.m(), this.d, this.e);
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
        vn0 vn0Var = (vn0) this.c;
        if (vn0Var.i()) {
            return hnVar.k();
        }
        vn0 vn0Var2 = (vn0) this.b;
        vn0 vn0Var3 = (vn0) this.d[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        vj.C(vn0Var.g, iArr3);
        int[] iArr4 = new int[5];
        vj.C(iArr3, iArr4);
        boolean h = vn0Var3.h();
        int[] iArr5 = vn0Var3.g;
        if (!h) {
            vj.C(iArr5, iArr2);
            iArr5 = iArr2;
        }
        vj.F(vn0Var2.g, iArr5, iArr);
        if (z61.b(vn0Var2.g, iArr5, iArr2) != 0 || (iArr2[4] == -1 && z61.V(iArr2, vj.P))) {
            z61.u(5, -2147483647, iArr2);
        }
        vj.v(iArr2, iArr, iArr2);
        vj.A(iArr2, z61.i(iArr2, iArr2, iArr2));
        vj.v(iArr3, vn0Var2.g, iArr3);
        vj.A(iArr3, z61.Z0(5, iArr3));
        vj.A(iArr, z61.a1(5, iArr4, iArr));
        vn0 vn0Var4 = new vn0(iArr4);
        vj.C(iArr2, iArr4);
        int[] iArr6 = vn0Var4.g;
        vj.F(iArr6, iArr3, iArr6);
        int[] iArr7 = vn0Var4.g;
        vj.F(iArr7, iArr3, iArr7);
        vn0 vn0Var5 = new vn0(iArr3);
        vj.F(iArr3, vn0Var4.g, iArr3);
        int[] iArr8 = vn0Var5.g;
        vj.v(iArr8, iArr2, iArr8);
        int[] iArr9 = vn0Var5.g;
        vj.F(iArr9, iArr, iArr9);
        vn0 vn0Var6 = new vn0(iArr2);
        if (z61.Y0(5, 0, vn0Var.g, iArr2) != 0 || (iArr2[4] == -1 && z61.V(iArr2, vj.P))) {
            z61.u(5, -2147483647, iArr2);
        }
        if (!h) {
            int[] iArr10 = vn0Var6.g;
            vj.v(iArr10, vn0Var3.g, iArr10);
        }
        return new wn0(hnVar, vn0Var4, vn0Var5, new jn[]{vn0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}