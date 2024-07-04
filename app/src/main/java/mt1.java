package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: mt1  reason: default package */
public final class mt1 implements lk1 {
    public final List a;
    public final kh4 b = new kh4(new byte[9400], 0);
    public final SparseIntArray c;
    public final wr1 d;
    public final SparseArray e;
    public final SparseBooleanArray f;
    public final SparseBooleanArray g;
    public final jt1 h;
    public it1 i;
    public nk1 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;

    public mt1(km4 km4Var, wr1 wr1Var) {
        this.d = wr1Var;
        this.a = Collections.singletonList(km4Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f = sparseBooleanArray;
        this.g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.e = sparseArray;
        this.c = new SparseIntArray();
        this.h = new jt1();
        this.j = nk1.K;
        this.n = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.e.put(sparseArray2.keyAt(i), (qt1) sparseArray2.valueAt(i));
        }
        this.e.put(0, new ft1(new kt1(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = r2 + 1;
     */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(p16 p16Var) {
        byte[] bArr = this.b.a;
        p16Var.B(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            p16Var.k(i);
            return true;
        }
        return false;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.j = nk1Var;
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        it1 it1Var;
        long j3;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            km4 km4Var = (km4) this.a.get(i);
            synchronized (km4Var) {
                j3 = km4Var.b;
            }
            if (j3 != -9223372036854775807L) {
                long c = km4Var.c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            km4Var.d(j2);
        }
        if (j2 != 0 && (it1Var = this.i) != null) {
            it1Var.b(j2);
        }
        this.b.b(0);
        this.c.clear();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((qt1) this.e.valueAt(i2)).d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0247, code lost:
        if (r1 == false) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        ?? r3;
        int i;
        qt1 qt1Var;
        int i2;
        long j;
        boolean z;
        nk1 nk1Var;
        ml1 ll1Var;
        long j2;
        p16 p16Var = (p16) mk1Var;
        long j3 = p16Var.c;
        int i3 = 1;
        if (this.k) {
            long j4 = -9223372036854775807L;
            if (j3 != -1) {
                jt1 jt1Var = this.h;
                if (!jt1Var.c) {
                    int i4 = this.n;
                    if (i4 > 0) {
                        if (!jt1Var.e) {
                            int min = (int) Math.min(112800L, j3);
                            long j5 = j3 - min;
                            if (p16Var.d != j5) {
                                j2 = j5;
                                jl1Var.a = j2;
                            } else {
                                jt1Var.b.b(min);
                                p16Var.f = 0;
                                ((p16) mk1Var).B(jt1Var.b.a, 0, min, false);
                                kh4 kh4Var = jt1Var.b;
                                int i5 = kh4Var.b;
                                int i6 = kh4Var.c;
                                int i7 = i6 - 188;
                                while (true) {
                                    if (i7 < i5) {
                                        break;
                                    }
                                    byte[] bArr = kh4Var.a;
                                    int i8 = -4;
                                    int i9 = 0;
                                    while (true) {
                                        if (i8 > 4) {
                                            break;
                                        }
                                        int i10 = (i8 * 188) + i7;
                                        if (i10 >= i5 && i10 < i6 && bArr[i10] == 71) {
                                            i9++;
                                            if (i9 == 5) {
                                                long m = dt4.m(kh4Var, i7, i4);
                                                if (m != -9223372036854775807L) {
                                                    j4 = m;
                                                    break;
                                                }
                                            }
                                        } else {
                                            i9 = 0;
                                        }
                                        i8++;
                                    }
                                    i7--;
                                }
                                jt1Var.g = j4;
                                jt1Var.e = true;
                                i3 = 0;
                            }
                        } else if (jt1Var.g != -9223372036854775807L) {
                            if (!jt1Var.d) {
                                int min2 = (int) Math.min(112800L, j3);
                                if (p16Var.d != 0) {
                                    j2 = 0;
                                    jl1Var.a = j2;
                                } else {
                                    jt1Var.b.b(min2);
                                    p16Var.f = 0;
                                    ((p16) mk1Var).B(jt1Var.b.a, 0, min2, false);
                                    kh4 kh4Var2 = jt1Var.b;
                                    int i11 = kh4Var2.b;
                                    int i12 = kh4Var2.c;
                                    while (true) {
                                        if (i11 >= i12) {
                                            break;
                                        }
                                        if (kh4Var2.a[i11] == 71) {
                                            long m2 = dt4.m(kh4Var2, i11, i4);
                                            if (m2 != -9223372036854775807L) {
                                                j4 = m2;
                                                break;
                                            }
                                        }
                                        i11++;
                                    }
                                    jt1Var.f = j4;
                                    jt1Var.d = true;
                                    i3 = 0;
                                }
                            } else {
                                long j6 = jt1Var.f;
                                if (j6 != -9223372036854775807L) {
                                    long b = jt1Var.a.b(jt1Var.g) - jt1Var.a.b(j6);
                                    jt1Var.h = b;
                                    if (b < 0) {
                                        lb4.c("TsDurationReader", "Invalid duration: " + b + ". Using TIME_UNSET instead.");
                                        jt1Var.h = -9223372036854775807L;
                                    }
                                }
                            }
                        }
                        return i3;
                    }
                    jt1Var.a(p16Var);
                    return 0;
                }
            }
            if (!this.l) {
                this.l = true;
                jt1 jt1Var2 = this.h;
                long j7 = jt1Var2.h;
                if (j7 != -9223372036854775807L) {
                    j = 0;
                    it1 it1Var = new it1(jt1Var2.a, j7, j3, this.n);
                    this.i = it1Var;
                    nk1Var = this.j;
                    ll1Var = it1Var.a;
                } else {
                    j = 0;
                    nk1Var = this.j;
                    ll1Var = new ll1(j7, 0L);
                }
                nk1Var.n(ll1Var);
            } else {
                j = 0;
            }
            if (this.m) {
                r3 = 0;
                this.m = false;
                e(j, j);
                if (p16Var.d != j) {
                    jl1Var.a = j;
                    return 1;
                }
            } else {
                r3 = 0;
            }
            it1 it1Var2 = this.i;
            if (it1Var2 != null) {
                if (it1Var2.c != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return it1Var2.a(p16Var, jl1Var);
                }
            }
        } else {
            r3 = 0;
        }
        kh4 kh4Var3 = this.b;
        byte[] bArr2 = kh4Var3.a;
        int i13 = kh4Var3.b;
        if (9400 - i13 < 188) {
            int i14 = kh4Var3.c - i13;
            if (i14 > 0) {
                System.arraycopy(bArr2, i13, bArr2, r3, i14);
            }
            this.b.c(bArr2, i14);
        }
        while (true) {
            kh4 kh4Var4 = this.b;
            int i15 = kh4Var4.c;
            int i16 = kh4Var4.b;
            if (i15 - i16 < 188) {
                int x = p16Var.x(bArr2, i15, 9400 - i15);
                if (x == -1) {
                    return -1;
                }
                this.b.d(i15 + x);
            } else {
                byte[] bArr3 = kh4Var4.a;
                while (i16 < i15 && bArr3[i16] != 71) {
                    i16++;
                }
                this.b.e(i16);
                int i17 = i16 + 188;
                kh4 kh4Var5 = this.b;
                int i18 = kh4Var5.c;
                if (i17 > i18) {
                    return r3;
                }
                int i19 = kh4Var5.i();
                if ((8388608 & i19) == 0) {
                    if ((4194304 & i19) != 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i20 = i19 & 32;
                    int i21 = (i19 >> 8) & 8191;
                    if ((i19 & 16) != 0) {
                        qt1Var = (qt1) this.e.get(i21);
                    } else {
                        qt1Var = null;
                    }
                    if (qt1Var != null) {
                        int i22 = i19 & 15;
                        int i23 = this.c.get(i21, i22 - 1);
                        this.c.put(i21, i22);
                        if (i23 != i22) {
                            if (i22 != ((i23 + 1) & 15)) {
                                qt1Var.d();
                            }
                            if (i20 != 0) {
                                int n = this.b.n();
                                if ((this.b.n() & 64) != 0) {
                                    i2 = 2;
                                } else {
                                    i2 = 0;
                                }
                                i |= i2;
                                this.b.f(n - 1);
                            }
                            boolean z2 = this.k;
                            if (z2 || !this.g.get(i21, r3)) {
                                this.b.d(i17);
                                qt1Var.b(i, this.b);
                                this.b.d(i18);
                            }
                            if (this.k && j3 != -1) {
                                this.m = true;
                            }
                        }
                    }
                }
                this.b.e(i17);
                return r3;
            }
        }
    }
}