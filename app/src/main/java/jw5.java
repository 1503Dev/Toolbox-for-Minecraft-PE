package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* renamed from: jw5  reason: default package */
public final class jw5 implements ww5 {
    public final int a;
    public final /* synthetic */ mw5 b;

    public jw5(mw5 mw5Var, int i) {
        this.b = mw5Var;
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x012c, code lost:
        if (r7 != 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7 A[Catch: all -> 0x013e, TryCatch #0 {, blocks: (B:11:0x0028, B:18:0x003a, B:21:0x003f, B:24:0x0045, B:47:0x00ab, B:55:0x00b9, B:59:0x00cb, B:61:0x00df, B:63:0x00e5, B:67:0x00fb, B:66:0x00ea, B:54:0x00b7, B:27:0x004a, B:28:0x004d, B:30:0x005c, B:33:0x0061, B:35:0x006b, B:38:0x0079, B:41:0x007f, B:43:0x0091, B:44:0x0096), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea A[Catch: all -> 0x013e, TryCatch #0 {, blocks: (B:11:0x0028, B:18:0x003a, B:21:0x003f, B:24:0x0045, B:47:0x00ab, B:55:0x00b9, B:59:0x00cb, B:61:0x00df, B:63:0x00e5, B:67:0x00fb, B:66:0x00ea, B:54:0x00b7, B:27:0x004a, B:28:0x004d, B:30:0x005c, B:33:0x0061, B:35:0x006b, B:38:0x0079, B:41:0x007f, B:43:0x0091, B:44:0x0096), top: B:88:0x0028 }] */
    @Override // defpackage.ww5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(vi1 vi1Var, gk5 gk5Var, int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        cu1 cu1Var;
        boolean z3;
        cu1 cu1Var2;
        boolean z4;
        fb3 fb3Var;
        al1 al1Var;
        int i4;
        mw5 mw5Var = this.b;
        int i5 = this.a;
        if (mw5Var.A()) {
            return -3;
        }
        mw5Var.w(i5);
        vw5 vw5Var = mw5Var.d0[i5];
        boolean z5 = mw5Var.v0;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        sw5 sw5Var = vw5Var.b;
        synchronized (vw5Var) {
            gk5Var.d = false;
            int i6 = vw5Var.q;
            if (i6 != vw5Var.n) {
                z2 = true;
            } else {
                z2 = false;
            }
            i2 = -5;
            i3 = -4;
            if (!z2) {
                if (!z5 && !vw5Var.u) {
                    cu1Var = vw5Var.x;
                    if (cu1Var != null) {
                        if (!z) {
                            if (cu1Var != vw5Var.f) {
                            }
                        }
                        cu1Var2 = vw5Var.f;
                        if (cu1Var2 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        fb3Var = null;
                        if (!z4) {
                            al1Var = null;
                        } else {
                            al1Var = cu1Var2.n;
                        }
                        vw5Var.f = cu1Var;
                        al1 al1Var2 = cu1Var.n;
                        ((ga1) vw5Var.d).getClass();
                        if (cu1Var.n == null) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        bs1 bs1Var = new bs1(cu1Var);
                        bs1Var.C = i4;
                        vi1Var.Q = new cu1(bs1Var);
                        vi1Var.R = vw5Var.A;
                        if (!z4 || !zn4.b(al1Var, al1Var2)) {
                            if (cu1Var.n == null) {
                                fb3Var = new fb3(9, new hs5(new ps5()));
                            }
                            vw5Var.A = fb3Var;
                            vi1Var.R = fb3Var;
                        }
                    }
                    i2 = -3;
                }
                gk5Var.a = 4;
                i2 = -4;
            } else {
                cu1Var = ((tw5) vw5Var.c.a(vw5Var.o + i6)).a;
                if (!z && cu1Var == vw5Var.f) {
                    int g = vw5Var.g(vw5Var.q);
                    if (vw5Var.A != null) {
                        int i7 = vw5Var.k[g] & 1073741824;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        gk5Var.d = true;
                        i2 = -3;
                    } else {
                        int i8 = vw5Var.k[g];
                        gk5Var.a = i8;
                        long j = vw5Var.l[g];
                        gk5Var.e = j;
                        if (j < vw5Var.r) {
                            gk5Var.a = i8 | RecyclerView.UNDEFINED_DURATION;
                        }
                        sw5Var.a = vw5Var.j[g];
                        sw5Var.b = vw5Var.i[g];
                        sw5Var.c = vw5Var.m[g];
                        i2 = -4;
                    }
                }
                cu1Var2 = vw5Var.f;
                if (cu1Var2 != null) {
                }
                fb3Var = null;
                if (!z4) {
                }
                vw5Var.f = cu1Var;
                al1 al1Var22 = cu1Var.n;
                ((ga1) vw5Var.d).getClass();
                if (cu1Var.n == null) {
                }
                bs1 bs1Var2 = new bs1(cu1Var);
                bs1Var2.C = i4;
                vi1Var.Q = new cu1(bs1Var2);
                vi1Var.R = vw5Var.A;
                if (!z4) {
                }
                if (cu1Var.n == null) {
                }
                vw5Var.A = fb3Var;
                vi1Var.R = fb3Var;
            }
        }
        if (i2 == -4) {
            if (!gk5Var.a(4)) {
                int i9 = i & 1;
                if ((i & 4) == 0) {
                    if (i9 != 0) {
                        rw5 rw5Var = vw5Var.a;
                        rw5.e(rw5Var.c, gk5Var, vw5Var.b, rw5Var.a);
                    } else {
                        rw5 rw5Var2 = vw5Var.a;
                        rw5Var2.c = rw5.e(rw5Var2.c, gk5Var, vw5Var.b, rw5Var2.a);
                        vw5Var.q++;
                    }
                }
            }
        } else {
            i3 = i2;
        }
        if (i3 == -3) {
            mw5Var.x(i5);
        }
        return i3;
    }

    @Override // defpackage.ww5
    public final boolean b() {
        mw5 mw5Var = this.b;
        int i = this.a;
        if (!mw5Var.A() && mw5Var.d0[i].k(mw5Var.v0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r8 == (-1)) goto L43;
     */
    @Override // defpackage.ww5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(long j) {
        boolean z;
        boolean z2;
        int i;
        mw5 mw5Var = this.b;
        int i2 = this.a;
        if (mw5Var.A()) {
            return 0;
        }
        mw5Var.w(i2);
        vw5 vw5Var = mw5Var.d0[i2];
        boolean z3 = mw5Var.v0;
        synchronized (vw5Var) {
            int i3 = vw5Var.q;
            int g = vw5Var.g(i3);
            int i4 = vw5Var.q;
            int i5 = vw5Var.n;
            z = true;
            if (i4 != i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && j >= vw5Var.l[g]) {
                if (j > vw5Var.t && z3) {
                    i = i5 - i3;
                } else {
                    i = vw5Var.m(g, i5 - i3, j, true);
                }
            }
            i = 0;
        }
        synchronized (vw5Var) {
            if (i >= 0) {
                try {
                    if (vw5Var.q + i <= vw5Var.n) {
                        tv2.G(z);
                        vw5Var.q += i;
                    }
                } finally {
                }
            }
            z = false;
            tv2.G(z);
            vw5Var.q += i;
        }
        if (i == 0) {
            mw5Var.x(i2);
            return 0;
        }
        return i;
    }

    @Override // defpackage.ww5
    public final void i() {
        int i;
        IOException iOException;
        mw5 mw5Var = this.b;
        fb3 fb3Var = mw5Var.d0[this.a].A;
        if (fb3Var == null) {
            rz5 rz5Var = mw5Var.V;
            if (mw5Var.m0 == 7) {
                i = 6;
            } else {
                i = 3;
            }
            IOException iOException2 = rz5Var.c;
            if (iOException2 == null) {
                oz5 oz5Var = rz5Var.b;
                if (oz5Var != null && (iOException = oz5Var.S) != null && oz5Var.T > i) {
                    throw iOException;
                }
                return;
            }
            throw iOException2;
        }
        throw ((hs5) fb3Var.Q);
    }
}