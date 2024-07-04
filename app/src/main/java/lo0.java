package defpackage;

import defpackage.wn;

/* renamed from: lo0  reason: default package */
public final class lo0 extends wn.b {
    public lo0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public lo0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
        if (defpackage.z61.T(14, r10, defpackage.v32.Q) != false) goto L34;
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
        ko0 ko0Var = (ko0) this.b;
        ko0 ko0Var2 = (ko0) this.c;
        ko0 ko0Var3 = (ko0) wnVar.b;
        ko0 ko0Var4 = (ko0) wnVar.h();
        ko0 ko0Var5 = (ko0) this.d[0];
        ko0 ko0Var6 = (ko0) wnVar.i();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean h = ko0Var5.h();
        if (h) {
            iArr = ko0Var3.g;
            iArr2 = ko0Var4.g;
        } else {
            v32.i(ko0Var5.g, iArr7);
            v32.f(iArr7, ko0Var3.g, iArr6);
            v32.f(iArr7, ko0Var5.g, iArr7);
            v32.f(iArr7, ko0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = ko0Var6.h();
        if (h2) {
            iArr3 = ko0Var.g;
            iArr4 = ko0Var2.g;
        } else {
            v32.i(ko0Var6.g, iArr8);
            v32.f(iArr8, ko0Var.g, iArr5);
            v32.f(iArr8, ko0Var6.g, iArr8);
            v32.f(iArr8, ko0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[7];
        v32.j(iArr3, iArr, iArr9);
        v32.j(iArr4, iArr2, iArr6);
        if (z61.q0(iArr9)) {
            if (z61.q0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        v32.i(iArr9, iArr7);
        int[] iArr10 = new int[7];
        v32.f(iArr7, iArr9, iArr10);
        v32.f(iArr7, iArr3, iArr7);
        if (z61.q0(iArr10)) {
            iArr10[0] = 0;
            iArr10[1] = 0;
            iArr10[2] = 0;
            iArr10[3] = 0;
            iArr10[4] = 0;
            iArr10[5] = 0;
            iArr10[6] = 0;
        } else {
            z61.n1(v32.P, iArr10, iArr10);
        }
        z61.C0(iArr4, iArr10, iArr5);
        v32.h(iArr10, z61.k(iArr7, iArr7, iArr10));
        ko0 ko0Var7 = new ko0(iArr8);
        v32.i(iArr6, iArr8);
        int[] iArr11 = ko0Var7.g;
        v32.j(iArr11, iArr10, iArr11);
        ko0 ko0Var8 = new ko0(iArr10);
        v32.j(iArr7, ko0Var7.g, iArr10);
        if (z61.H0(ko0Var8.g, iArr6, iArr5) == 0) {
            if (iArr5[13] == -1) {
                i = 14;
            }
            v32.g(iArr5, ko0Var8.g);
            ko0 ko0Var9 = new ko0(iArr9);
            if (!h) {
                v32.f(iArr9, ko0Var5.g, iArr9);
            }
            if (!h2) {
                int[] iArr12 = ko0Var9.g;
                v32.f(iArr12, ko0Var6.g, iArr12);
            }
            return new lo0(hnVar, ko0Var7, ko0Var8, new jn[]{ko0Var9}, this.e);
        }
        i = 14;
        if (z61.n(11, v32.R, iArr5) != 0) {
            z61.b0(i, 11, iArr5);
        }
        v32.g(iArr5, ko0Var8.g);
        ko0 ko0Var92 = new ko0(iArr9);
        if (!h) {
        }
        if (!h2) {
        }
        return new lo0(hnVar, ko0Var7, ko0Var8, new jn[]{ko0Var92}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new lo0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new lo0(this.a, this.b, this.c.m(), this.d, this.e);
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
        ko0 ko0Var = (ko0) this.c;
        if (ko0Var.i()) {
            return hnVar.k();
        }
        ko0 ko0Var2 = (ko0) this.b;
        ko0 ko0Var3 = (ko0) this.d[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        v32.i(ko0Var.g, iArr3);
        int[] iArr4 = new int[7];
        v32.i(iArr3, iArr4);
        boolean h = ko0Var3.h();
        int[] iArr5 = ko0Var3.g;
        if (!h) {
            v32.i(iArr5, iArr2);
            iArr5 = iArr2;
        }
        v32.j(ko0Var2.g, iArr5, iArr);
        v32.a(ko0Var2.g, iArr5, iArr2);
        v32.f(iArr2, iArr, iArr2);
        v32.h(iArr2, z61.k(iArr2, iArr2, iArr2));
        v32.f(iArr3, ko0Var2.g, iArr3);
        v32.h(iArr3, z61.Z0(7, iArr3));
        v32.h(iArr, z61.a1(7, iArr4, iArr));
        ko0 ko0Var4 = new ko0(iArr4);
        v32.i(iArr2, iArr4);
        int[] iArr6 = ko0Var4.g;
        v32.j(iArr6, iArr3, iArr6);
        int[] iArr7 = ko0Var4.g;
        v32.j(iArr7, iArr3, iArr7);
        ko0 ko0Var5 = new ko0(iArr3);
        v32.j(iArr3, ko0Var4.g, iArr3);
        int[] iArr8 = ko0Var5.g;
        v32.f(iArr8, iArr2, iArr8);
        int[] iArr9 = ko0Var5.g;
        v32.j(iArr9, iArr, iArr9);
        ko0 ko0Var6 = new ko0(iArr2);
        if (z61.Y0(7, 0, ko0Var.g, iArr2) != 0 || (iArr2[6] == -1 && z61.X(iArr2, v32.P))) {
            v32.d(iArr2);
        }
        if (!h) {
            int[] iArr10 = ko0Var6.g;
            v32.f(iArr10, ko0Var3.g, iArr10);
        }
        return new lo0(hnVar, ko0Var4, ko0Var5, new jn[]{ko0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}