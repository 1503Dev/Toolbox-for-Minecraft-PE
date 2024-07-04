package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: rq1  reason: default package */
public final class rq1 implements lk1 {
    public static final byte[] E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final cu1 F;
    public boolean D;
    public final byte[] f;
    public final kh4 g;
    public int l;
    public int m;
    public long n;
    public int o;
    public kh4 p;
    public long q;
    public int r;
    public qq1 v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public final List a = Collections.unmodifiableList(Collections.emptyList());
    public final ln1 h = new ln1();
    public final kh4 i = new kh4(16);
    public final kh4 c = new kh4(hl1.a);
    public final kh4 d = new kh4(5);
    public final kh4 e = new kh4();
    public final ArrayDeque j = new ArrayDeque();
    public final ArrayDeque k = new ArrayDeque();
    public final SparseArray b = new SparseArray();
    public long t = -9223372036854775807L;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public nk1 A = nk1.K;
    public pl1[] B = new pl1[0];
    public pl1[] C = new pl1[0];

    static {
        bs1 bs1Var = new bs1();
        bs1Var.j = "application/x-emsg";
        F = new cu1(bs1Var);
    }

    public rq1() {
        byte[] bArr = new byte[16];
        this.f = bArr;
        this.g = new kh4(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static al1 b(ArrayList arrayList) {
        wq1 wq1Var;
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            aq1 aq1Var = (aq1) arrayList.get(i);
            if (aq1Var.a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = aq1Var.b.a;
                kh4 kh4Var = new kh4(bArr);
                if (kh4Var.c >= 32) {
                    kh4Var.e(0);
                    if (kh4Var.i() == (kh4Var.c - kh4Var.b) + 4 && kh4Var.i() == 1886614376) {
                        int i2 = (kh4Var.i() >> 24) & 255;
                        if (i2 > 1) {
                            lb4.c("PsshAtomUtil", "Unsupported pssh version: " + i2);
                        } else {
                            UUID uuid2 = new UUID(kh4Var.t(), kh4Var.t());
                            if (i2 == 1) {
                                kh4Var.f(kh4Var.p() * 16);
                            }
                            int p = kh4Var.p();
                            if (p == kh4Var.c - kh4Var.b) {
                                byte[] bArr2 = new byte[p];
                                kh4Var.a(bArr2, 0, p);
                                wq1Var = new wq1(uuid2, bArr2);
                                if (wq1Var != null) {
                                    uuid = null;
                                } else {
                                    uuid = (UUID) wq1Var.P;
                                }
                                if (uuid != null) {
                                    lb4.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList2.add(new ek1(uuid, "video/mp4", bArr));
                                }
                            }
                        }
                    }
                }
                wq1Var = null;
                if (wq1Var != null) {
                }
                if (uuid != null) {
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new al1(null, false, (ek1[]) arrayList2.toArray(new ek1[0]));
    }

    public static void f(kh4 kh4Var, int i, zq1 zq1Var) {
        boolean z;
        kh4Var.e(i + 8);
        int i2 = kh4Var.i() & 16777215;
        if ((i2 & 1) == 0) {
            if ((i2 & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int p = kh4Var.p();
            if (p == 0) {
                Arrays.fill(zq1Var.l, 0, zq1Var.e, false);
                return;
            }
            int i3 = zq1Var.e;
            if (p == i3) {
                Arrays.fill(zq1Var.l, 0, p, z);
                zq1Var.n.b(kh4Var.c - kh4Var.b);
                zq1Var.k = true;
                zq1Var.o = true;
                kh4 kh4Var2 = zq1Var.n;
                kh4Var.a(kh4Var2.a, 0, kh4Var2.c);
                zq1Var.n.e(0);
                zq1Var.o = false;
                return;
            }
            throw jy2.a("Senc sample count " + p + " is different from fragment sample count" + i3, null);
        }
        throw jy2.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        return vj.H(p16Var, true);
    }

    public final void c() {
        this.l = 0;
        this.o = 0;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.A = nk1Var;
        c();
        pl1[] pl1VarArr = new pl1[2];
        this.B = pl1VarArr;
        int i = 0;
        pl1[] pl1VarArr2 = (pl1[]) zn4.f(0, pl1VarArr);
        this.B = pl1VarArr2;
        for (pl1 pl1Var : pl1VarArr2) {
            pl1Var.e(F);
        }
        this.C = new pl1[this.a.size()];
        int i2 = 100;
        while (i < this.C.length) {
            int i3 = i2 + 1;
            pl1 q = this.A.q(i2, 3);
            q.e((cu1) this.a.get(i));
            this.C[i] = q;
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((qq1) this.b.valueAt(i)).c();
        }
        this.k.clear();
        this.r = 0;
        this.s = j2;
        this.j.clear();
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x034d, code lost:
        if (defpackage.zn4.r(r30 + r7[0], 1000000, r4.d) < r4.e) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j) {
        nq1 nq1Var;
        nq1 nq1Var2;
        rq1 rq1Var;
        byte[] bArr;
        SparseArray sparseArray;
        zp1 zp1Var;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        byte[] bArr4;
        int i5;
        zp1 zp1Var2;
        int i6;
        zq1 zq1Var;
        ArrayList arrayList;
        int i7;
        zp1 zp1Var3;
        int i8;
        int i9;
        boolean z2;
        long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z3;
        nq1 nq1Var3;
        int i17;
        rq1 rq1Var2 = this;
        rq1 rq1Var3 = rq1Var2;
        while (!rq1Var3.j.isEmpty() && ((zp1) rq1Var3.j.peek()).b == j) {
            zp1 zp1Var4 = (zp1) rq1Var3.j.pop();
            int i18 = zp1Var4.a;
            int i19 = 12;
            if (i18 == 1836019574) {
                al1 b = b(zp1Var4.c);
                zp1 c = zp1Var4.c(1836475768);
                c.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = c.c.size();
                long j3 = -9223372036854775807L;
                int i20 = 0;
                while (i20 < size) {
                    aq1 aq1Var = (aq1) c.c.get(i20);
                    int i21 = aq1Var.a;
                    if (i21 == 1953654136) {
                        kh4 kh4Var = aq1Var.b;
                        kh4Var.e(i19);
                        Pair create = Pair.create(Integer.valueOf(kh4Var.i()), new nq1(kh4Var.i() - 1, kh4Var.i(), kh4Var.i(), kh4Var.i()));
                        sparseArray2.put(((Integer) create.first).intValue(), (nq1) create.second);
                    } else if (i21 == 1835362404) {
                        kh4 kh4Var2 = aq1Var.b;
                        kh4Var2.e(8);
                        j3 = ((kh4Var2.i() >> 24) & 255) == 0 ? kh4Var2.u() : kh4Var2.v();
                    }
                    i20++;
                    i19 = 12;
                }
                ArrayList a = mq1.a(zp1Var4, new uk1(), j3, b, false, new oq1(0, rq1Var3));
                int size2 = a.size();
                if (rq1Var3.b.size() == 0) {
                    for (int i22 = 0; i22 < size2; i22++) {
                        ar1 ar1Var = (ar1) a.get(i22);
                        xq1 xq1Var = ar1Var.a;
                        pl1 q = rq1Var3.A.q(i22, xq1Var.b);
                        int i23 = xq1Var.a;
                        if (sparseArray2.size() == 1) {
                            nq1Var = (nq1) sparseArray2.valueAt(0);
                        } else {
                            nq1Var = (nq1) sparseArray2.get(i23);
                            nq1Var.getClass();
                        }
                        rq1Var3.b.put(xq1Var.a, new qq1(q, ar1Var, nq1Var));
                        rq1Var3.t = Math.max(rq1Var3.t, xq1Var.e);
                    }
                    rq1Var3.A.j();
                } else {
                    tv2.I(rq1Var3.b.size() == size2);
                    for (int i24 = 0; i24 < size2; i24++) {
                        ar1 ar1Var2 = (ar1) a.get(i24);
                        xq1 xq1Var2 = ar1Var2.a;
                        qq1 qq1Var = (qq1) rq1Var3.b.get(xq1Var2.a);
                        int i25 = xq1Var2.a;
                        if (sparseArray2.size() == 1) {
                            nq1Var2 = (nq1) sparseArray2.valueAt(0);
                        } else {
                            nq1Var2 = (nq1) sparseArray2.get(i25);
                            nq1Var2.getClass();
                        }
                        qq1Var.d = ar1Var2;
                        qq1Var.e = nq1Var2;
                        qq1Var.a.e(ar1Var2.a.f);
                        qq1Var.c();
                    }
                }
            } else {
                if (i18 == 1836019558) {
                    SparseArray sparseArray3 = rq1Var3.b;
                    byte[] bArr5 = rq1Var3.f;
                    int size3 = zp1Var4.d.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        zp1 zp1Var5 = (zp1) zp1Var4.d.get(i26);
                        if (zp1Var5.a == 1953653094) {
                            aq1 d = zp1Var5.d(1952868452);
                            d.getClass();
                            kh4 kh4Var3 = d.b;
                            kh4Var3.e(8);
                            int i27 = kh4Var3.i() & 16777215;
                            qq1 qq1Var2 = (qq1) sparseArray3.get(kh4Var3.i());
                            if (qq1Var2 == null) {
                                qq1Var2 = null;
                            } else {
                                if ((i27 & 1) != 0) {
                                    long v = kh4Var3.v();
                                    zq1 zq1Var2 = qq1Var2.b;
                                    zq1Var2.b = v;
                                    zq1Var2.c = v;
                                }
                                nq1 nq1Var4 = qq1Var2.e;
                                qq1Var2.b.a = new nq1((i27 & 2) != 0 ? kh4Var3.i() - 1 : nq1Var4.a, (i27 & 8) != 0 ? kh4Var3.i() : nq1Var4.b, (i27 & 16) != 0 ? kh4Var3.i() : nq1Var4.c, (i27 & 32) != 0 ? kh4Var3.i() : nq1Var4.d);
                            }
                            if (qq1Var2 != null) {
                                zq1 zq1Var3 = qq1Var2.b;
                                long j4 = zq1Var3.p;
                                boolean z4 = zq1Var3.q;
                                qq1Var2.c();
                                qq1Var2.l = true;
                                aq1 d2 = zp1Var5.d(1952867444);
                                if (d2 != null) {
                                    kh4 kh4Var4 = d2.b;
                                    kh4Var4.e(8);
                                    zq1Var3.p = ((kh4Var4.i() >> 24) & 255) == 1 ? kh4Var4.v() : kh4Var4.u();
                                    zq1Var3.q = true;
                                } else {
                                    zq1Var3.p = j4;
                                    zq1Var3.q = z4;
                                }
                                ArrayList arrayList2 = zp1Var5.c;
                                int size4 = arrayList2.size();
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i28 >= size4) {
                                        break;
                                    }
                                    aq1 aq1Var2 = (aq1) arrayList2.get(i28);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (aq1Var2.a == 1953658222) {
                                        kh4 kh4Var5 = aq1Var2.b;
                                        kh4Var5.e(12);
                                        int p = kh4Var5.p();
                                        if (p > 0) {
                                            i30 += p;
                                            i29++;
                                        }
                                    }
                                    i28++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                qq1Var2.h = 0;
                                qq1Var2.g = 0;
                                qq1Var2.f = 0;
                                zq1 zq1Var4 = qq1Var2.b;
                                zq1Var4.d = i29;
                                zq1Var4.e = i30;
                                if (zq1Var4.g.length < i29) {
                                    zq1Var4.f = new long[i29];
                                    zq1Var4.g = new int[i29];
                                }
                                if (zq1Var4.h.length < i30) {
                                    int i31 = (i30 * 125) / 100;
                                    zq1Var4.h = new int[i31];
                                    zq1Var4.i = new long[i31];
                                    zq1Var4.j = new boolean[i31];
                                    zq1Var4.l = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (i32 < size4) {
                                    aq1 aq1Var3 = (aq1) arrayList2.get(i32);
                                    if (aq1Var3.a == i3) {
                                        int i35 = i33 + 1;
                                        kh4 kh4Var6 = aq1Var3.b;
                                        kh4Var6.e(8);
                                        int i36 = kh4Var6.i() & 16777215;
                                        i6 = size3;
                                        xq1 xq1Var3 = qq1Var2.d.a;
                                        arrayList = arrayList2;
                                        zq1 zq1Var5 = qq1Var2.b;
                                        i8 = size4;
                                        nq1 nq1Var5 = zq1Var5.a;
                                        int i37 = zn4.a;
                                        zq1Var5.g[i33] = kh4Var6.p();
                                        long[] jArr = zq1Var5.f;
                                        bArr4 = bArr5;
                                        long j5 = zq1Var5.b;
                                        jArr[i33] = j5;
                                        if ((i36 & 1) != 0) {
                                            zp1Var2 = zp1Var4;
                                            i5 = i32;
                                            jArr[i33] = j5 + kh4Var6.i();
                                        } else {
                                            i5 = i32;
                                            zp1Var2 = zp1Var4;
                                        }
                                        boolean z5 = (i36 & 4) != 0;
                                        int i38 = nq1Var5.d;
                                        if (z5) {
                                            i38 = kh4Var6.i();
                                        }
                                        int i39 = i36 & 256;
                                        int i40 = i36 & 512;
                                        int i41 = i36 & 1024;
                                        int i42 = i36 & 2048;
                                        int i43 = i38;
                                        long[] jArr2 = xq1Var3.h;
                                        i7 = i26;
                                        if (jArr2 != null) {
                                            zp1Var3 = zp1Var5;
                                            if (jArr2.length != 1 || (r7 = xq1Var3.i) == null) {
                                                z2 = z5;
                                                i9 = i42;
                                            } else {
                                                long j6 = jArr2[0];
                                                if (j6 == 0) {
                                                    z2 = z5;
                                                    i9 = i42;
                                                } else {
                                                    z2 = z5;
                                                    i9 = i42;
                                                }
                                                j2 = xq1Var3.i[0];
                                                int[] iArr = zq1Var5.h;
                                                long[] jArr3 = zq1Var5.i;
                                                zq1Var = zq1Var3;
                                                boolean[] zArr = zq1Var5.j;
                                                i10 = zq1Var5.g[i33] + i34;
                                                long j7 = xq1Var3.c;
                                                long j8 = zq1Var5.p;
                                                i11 = i34;
                                                while (i11 < i10) {
                                                    if (i39 != 0) {
                                                        i12 = i39;
                                                        i13 = kh4Var6.i();
                                                    } else {
                                                        i12 = i39;
                                                        i13 = nq1Var5.b;
                                                    }
                                                    int i44 = i10;
                                                    if (i13 < 0) {
                                                        throw jy2.a("Unexpected negative value: " + i13, null);
                                                    }
                                                    if (i40 != 0) {
                                                        i14 = i40;
                                                        i15 = kh4Var6.i();
                                                    } else {
                                                        i14 = i40;
                                                        i15 = nq1Var5.c;
                                                    }
                                                    if (i15 < 0) {
                                                        throw jy2.a("Unexpected negative value: " + i15, null);
                                                    }
                                                    if (i41 != 0) {
                                                        i16 = kh4Var6.i();
                                                    } else {
                                                        if (i11 == 0) {
                                                            if (z2) {
                                                                i16 = i43;
                                                                i11 = 0;
                                                            } else {
                                                                i11 = 0;
                                                            }
                                                        }
                                                        i16 = nq1Var5.d;
                                                    }
                                                    if (i9 != 0) {
                                                        z3 = z2;
                                                        nq1Var3 = nq1Var5;
                                                        i17 = kh4Var6.i();
                                                    } else {
                                                        z3 = z2;
                                                        nq1Var3 = nq1Var5;
                                                        i17 = 0;
                                                    }
                                                    long r = zn4.r((i17 + j8) - j2, 1000000L, j7);
                                                    jArr3[i11] = r;
                                                    long j9 = j2;
                                                    if (!zq1Var5.q) {
                                                        jArr3[i11] = r + qq1Var2.d.h;
                                                    }
                                                    iArr[i11] = i15;
                                                    zArr[i11] = 1 == (((i16 >> 16) & 1) ^ 1);
                                                    j8 += i13;
                                                    i11++;
                                                    j2 = j9;
                                                    i39 = i12;
                                                    i10 = i44;
                                                    i40 = i14;
                                                    z2 = z3;
                                                    nq1Var5 = nq1Var3;
                                                }
                                                zq1Var5.p = j8;
                                                i33 = i35;
                                                i34 = i10;
                                            }
                                        } else {
                                            i9 = i42;
                                            zp1Var3 = zp1Var5;
                                            z2 = z5;
                                        }
                                        j2 = 0;
                                        int[] iArr2 = zq1Var5.h;
                                        long[] jArr32 = zq1Var5.i;
                                        zq1Var = zq1Var3;
                                        boolean[] zArr2 = zq1Var5.j;
                                        i10 = zq1Var5.g[i33] + i34;
                                        long j72 = xq1Var3.c;
                                        long j82 = zq1Var5.p;
                                        i11 = i34;
                                        while (i11 < i10) {
                                        }
                                        zq1Var5.p = j82;
                                        i33 = i35;
                                        i34 = i10;
                                    } else {
                                        bArr4 = bArr5;
                                        i5 = i32;
                                        zp1Var2 = zp1Var4;
                                        i6 = size3;
                                        zq1Var = zq1Var3;
                                        arrayList = arrayList2;
                                        i7 = i26;
                                        zp1Var3 = zp1Var5;
                                        i8 = size4;
                                    }
                                    i32 = i5 + 1;
                                    size3 = i6;
                                    arrayList2 = arrayList;
                                    size4 = i8;
                                    bArr5 = bArr4;
                                    zp1Var4 = zp1Var2;
                                    i26 = i7;
                                    zp1Var5 = zp1Var3;
                                    zq1Var3 = zq1Var;
                                    i3 = 1953658222;
                                }
                                byte[] bArr6 = bArr5;
                                zp1Var = zp1Var4;
                                i = size3;
                                zq1 zq1Var6 = zq1Var3;
                                i2 = i26;
                                zp1 zp1Var6 = zp1Var5;
                                xq1 xq1Var4 = qq1Var2.d.a;
                                nq1 nq1Var6 = zq1Var6.a;
                                nq1Var6.getClass();
                                int i45 = nq1Var6.a;
                                yq1[] yq1VarArr = xq1Var4.k;
                                yq1 yq1Var = yq1VarArr == null ? null : yq1VarArr[i45];
                                aq1 d3 = zp1Var6.d(1935763834);
                                if (d3 != null) {
                                    yq1Var.getClass();
                                    kh4 kh4Var7 = d3.b;
                                    int i46 = yq1Var.d;
                                    kh4Var7.e(8);
                                    if ((kh4Var7.i() & 1) == 1) {
                                        kh4Var7.f(8);
                                    }
                                    int n = kh4Var7.n();
                                    int p2 = kh4Var7.p();
                                    int i47 = zq1Var6.e;
                                    if (p2 > i47) {
                                        throw jy2.a("Saiz sample count " + p2 + " is greater than fragment sample count" + i47, null);
                                    }
                                    if (n == 0) {
                                        boolean[] zArr3 = zq1Var6.l;
                                        i4 = 0;
                                        for (int i48 = 0; i48 < p2; i48++) {
                                            int n2 = kh4Var7.n();
                                            i4 += n2;
                                            zArr3[i48] = n2 > i46;
                                        }
                                        z = false;
                                    } else {
                                        boolean z6 = n > i46;
                                        i4 = n * p2;
                                        z = false;
                                        Arrays.fill(zq1Var6.l, 0, p2, z6);
                                    }
                                    Arrays.fill(zq1Var6.l, p2, zq1Var6.e, z);
                                    if (i4 > 0) {
                                        zq1Var6.n.b(i4);
                                        zq1Var6.k = true;
                                        zq1Var6.o = true;
                                    }
                                }
                                aq1 d4 = zp1Var6.d(1935763823);
                                if (d4 != null) {
                                    kh4 kh4Var8 = d4.b;
                                    kh4Var8.e(8);
                                    int i49 = kh4Var8.i();
                                    if ((i49 & 1) == 1) {
                                        kh4Var8.f(8);
                                    }
                                    int p3 = kh4Var8.p();
                                    if (p3 != 1) {
                                        throw jy2.a("Unexpected saio entry count: " + p3, null);
                                    }
                                    zq1Var6.c += ((i49 >> 24) & 255) == 0 ? kh4Var8.u() : kh4Var8.v();
                                }
                                aq1 d5 = zp1Var6.d(1936027235);
                                if (d5 != null) {
                                    f(d5.b, 0, zq1Var6);
                                }
                                String str = yq1Var != null ? yq1Var.b : null;
                                kh4 kh4Var9 = null;
                                kh4 kh4Var10 = null;
                                for (int i50 = 0; i50 < zp1Var6.c.size(); i50++) {
                                    aq1 aq1Var4 = (aq1) zp1Var6.c.get(i50);
                                    kh4 kh4Var11 = aq1Var4.b;
                                    int i51 = aq1Var4.a;
                                    if (i51 == 1935828848) {
                                        kh4Var11.e(12);
                                        if (kh4Var11.i() == 1936025959) {
                                            kh4Var9 = kh4Var11;
                                        }
                                    } else if (i51 == 1936158820) {
                                        kh4Var11.e(12);
                                        if (kh4Var11.i() == 1936025959) {
                                            kh4Var10 = kh4Var11;
                                        }
                                    }
                                }
                                if (kh4Var9 != null && kh4Var10 != null) {
                                    kh4Var9.e(8);
                                    int i52 = (kh4Var9.i() >> 24) & 255;
                                    kh4Var9.f(4);
                                    if (i52 == 1) {
                                        kh4Var9.f(4);
                                    }
                                    if (kh4Var9.i() != 1) {
                                        throw jy2.b("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    kh4Var10.e(8);
                                    int i53 = (kh4Var10.i() >> 24) & 255;
                                    kh4Var10.f(4);
                                    if (i53 == 1) {
                                        if (kh4Var10.u() == 0) {
                                            throw jy2.b("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (i53 >= 2) {
                                        kh4Var10.f(4);
                                    }
                                    if (kh4Var10.u() != 1) {
                                        throw jy2.b("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    kh4Var10.f(1);
                                    int n3 = kh4Var10.n();
                                    int i54 = (n3 & 240) >> 4;
                                    int i55 = n3 & 15;
                                    if (kh4Var10.n() == 1) {
                                        int n4 = kh4Var10.n();
                                        byte[] bArr7 = new byte[16];
                                        kh4Var10.a(bArr7, 0, 16);
                                        if (n4 == 0) {
                                            int n5 = kh4Var10.n();
                                            byte[] bArr8 = new byte[n5];
                                            kh4Var10.a(bArr8, 0, n5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zq1Var6.k = true;
                                        zq1Var6.m = new yq1(true, str, n4, bArr7, i54, i55, bArr3);
                                    }
                                }
                                int size5 = zp1Var6.c.size();
                                int i56 = 0;
                                while (i56 < size5) {
                                    aq1 aq1Var5 = (aq1) zp1Var6.c.get(i56);
                                    if (aq1Var5.a == 1970628964) {
                                        kh4 kh4Var12 = aq1Var5.b;
                                        kh4Var12.e(8);
                                        bArr2 = bArr6;
                                        kh4Var12.a(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, E)) {
                                            f(kh4Var12, 16, zq1Var6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i56++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i26 = i2 + 1;
                                bArr5 = bArr;
                                sparseArray3 = sparseArray;
                                size3 = i;
                                zp1Var4 = zp1Var;
                            }
                        }
                        bArr = bArr5;
                        sparseArray = sparseArray3;
                        zp1Var = zp1Var4;
                        i = size3;
                        i2 = i26;
                        i26 = i2 + 1;
                        bArr5 = bArr;
                        sparseArray3 = sparseArray;
                        size3 = i;
                        zp1Var4 = zp1Var;
                    }
                    al1 b2 = b(zp1Var4.c);
                    rq1Var = this;
                    if (b2 != null) {
                        int size6 = rq1Var.b.size();
                        for (int i57 = 0; i57 < size6; i57++) {
                            qq1 qq1Var3 = (qq1) rq1Var.b.valueAt(i57);
                            xq1 xq1Var5 = qq1Var3.d.a;
                            nq1 nq1Var7 = qq1Var3.b.a;
                            int i58 = zn4.a;
                            int i59 = nq1Var7.a;
                            yq1[] yq1VarArr2 = xq1Var5.k;
                            yq1 yq1Var2 = yq1VarArr2 == null ? null : yq1VarArr2[i59];
                            al1 a2 = b2.a(yq1Var2 != null ? yq1Var2.b : null);
                            cu1 cu1Var = qq1Var3.d.a.f;
                            cu1Var.getClass();
                            bs1 bs1Var = new bs1(cu1Var);
                            bs1Var.m = a2;
                            qq1Var3.a.e(new cu1(bs1Var));
                        }
                    }
                    if (rq1Var.s != -9223372036854775807L) {
                        int size7 = rq1Var.b.size();
                        for (int i60 = 0; i60 < size7; i60++) {
                            qq1 qq1Var4 = (qq1) rq1Var.b.valueAt(i60);
                            long j10 = rq1Var.s;
                            int i61 = qq1Var4.f;
                            while (true) {
                                zq1 zq1Var7 = qq1Var4.b;
                                if (i61 < zq1Var7.e && zq1Var7.i[i61] <= j10) {
                                    if (zq1Var7.j[i61]) {
                                        qq1Var4.i = i61;
                                    }
                                    i61++;
                                }
                            }
                        }
                        rq1Var.s = -9223372036854775807L;
                    }
                    rq1Var3 = rq1Var;
                } else {
                    rq1Var = rq1Var2;
                    if (!rq1Var3.j.isEmpty()) {
                        ((zp1) rq1Var3.j.peek()).d.add(zp1Var4);
                    }
                }
                rq1Var2 = rq1Var;
            }
        }
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
        if ("video/hevc".equals(r5) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fd, code lost:
        if (((r18 & 126) >> r9) != 39) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ff, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0201, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
        r26.z = r5;
        r26.x += 5;
        r26.w += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0216, code lost:
        throw defpackage.jy2.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0219, code lost:
        if (r26.z == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
        r26.e.b(r14);
        ((defpackage.p16) r27).A(r26.e.a, 0, r26.y, false);
        r8.a(r26.y, r26.e);
        r4 = r26.y;
        r5 = r26.e;
        r5 = defpackage.hl1.b(r5.a, r5.c);
        r26.e.e("video/hevc".equals(r7.f.k) ? 1 : 0);
        r26.e.d(r5);
        defpackage.q05.h(r10, r26.e, r26.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x025a, code lost:
        r4 = r8.d(r27, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0260, code lost:
        r26.x += r4;
        r26.y -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026a, code lost:
        r4 = 6;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0271, code lost:
        if (r2.l != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0273, code lost:
        r9 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0284, code lost:
        if (r2.b.j[r2.f] == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0286, code lost:
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0288, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028d, code lost:
        if (r2.b() == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028f, code lost:
        r21 = 1073741824 | r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0295, code lost:
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0297, code lost:
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x029b, code lost:
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029d, code lost:
        r24 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a2, code lost:
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a4, code lost:
        r8.b(r10, r21, r26.w, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b7, code lost:
        if (r26.k.isEmpty() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b9, code lost:
        r0 = (defpackage.pq1) r26.k.removeFirst();
        r26.r -= r0.c;
        r3 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02cc, code lost:
        if (r0.b == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ce, code lost:
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02cf, code lost:
        r5 = r26.B;
        r7 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d3, code lost:
        if (r8 >= r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d5, code lost:
        r5[r8].b(r3, 1, r0.c, r26.r, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ef, code lost:
        if (r2.d() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f1, code lost:
        r26.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f3, code lost:
        r26.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f6, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x05b2, code lost:
        g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0781, code lost:
        r26.l = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r26.l != 3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
        if (r2.l != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
        r26.w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        if (r2.f >= r2.i) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        ((defpackage.p16) r27).k(r3);
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        if (r0 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r3 = r2.b.n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
        if (r0 == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
        r3.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
        r0 = r2.b;
        r7 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
        if (r0.k == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
        if (r0.l[r7] == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fa, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
        if (r9 == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
        r3.f(r3.q() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
        if (r2.d() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
        r26.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
        r26.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
        if (r2.d.a.g != 1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011a, code lost:
        r26.w = r3 - 8;
        ((defpackage.p16) r27).k(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0134, code lost:
        if ("audio/ac4".equals(r2.d.a.f.k) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0136, code lost:
        r26.x = r2.a(r26.w, 7);
        defpackage.vx.z(r26.w, r26.g);
        r2.a.a(7, r26.g);
        r3 = r26.x + 7;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0152, code lost:
        r7 = 0;
        r3 = r2.a(r26.w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
        r26.x = r3;
        r26.w += r3;
        r26.l = 4;
        r26.y = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0165, code lost:
        r3 = r2.d;
        r7 = r3.a;
        r8 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
        if (r2.l != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016f, code lost:
        r10 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0176, code lost:
        r10 = r2.b.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017e, code lost:
        r3 = r7.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0180, code lost:
        if (r3 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
        r3 = r26.x;
        r4 = r26.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0186, code lost:
        if (r3 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0188, code lost:
        r26.x += r8.d(r27, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0194, code lost:
        r13 = r26.d.a;
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r12 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
        if (r26.x >= r26.w) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
        r14 = r26.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
        if (r14 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
        ((defpackage.p16) r27).A(r13, r3, r12, false);
        r26.d.e(0);
        r14 = r26.d.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
        if (r14 <= 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c5, code lost:
        r26.y = r14 - 1;
        r26.c.e(0);
        r8.a(4, r26.c);
        r8.a(r9, r26.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dc, code lost:
        if (r26.C.length <= 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01de, code lost:
        r5 = r7.f.k;
        r18 = r13[4];
        r14 = defpackage.hl1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ec, code lost:
        if ("video/avc".equals(r5) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f0, code lost:
        if ((r18 & 31) == r4) goto L163;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07b5 A[SYNTHETIC] */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        long j;
        long j2;
        long j3;
        int i;
        long j4;
        kh4 kh4Var;
        String x;
        String x2;
        long j5;
        long r;
        long u;
        long j6;
        long j7;
        pl1[] pl1VarArr;
        ArrayDeque arrayDeque;
        pq1 pq1Var;
        long v;
        long v2;
        long j8;
        long j9;
        while (true) {
            while (true) {
                int i2 = this.l;
                int i3 = 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        long j10 = RecyclerView.FOREVER_NS;
                        if (i2 != 2) {
                            qq1 qq1Var = this.v;
                            if (qq1Var != null) {
                                break;
                            }
                            SparseArray sparseArray = this.b;
                            int size = sparseArray.size();
                            long j11 = Long.MAX_VALUE;
                            qq1 qq1Var2 = null;
                            for (int i4 = 0; i4 < size; i4++) {
                                qq1 qq1Var3 = (qq1) sparseArray.valueAt(i4);
                                boolean z = qq1Var3.l;
                                if ((z || qq1Var3.f != qq1Var3.d.b) && (!z || qq1Var3.h != qq1Var3.b.d)) {
                                    if (!z) {
                                        j9 = qq1Var3.d.c[qq1Var3.f];
                                    } else {
                                        j9 = qq1Var3.b.f[qq1Var3.h];
                                    }
                                    if (j9 < j11) {
                                        qq1Var2 = qq1Var3;
                                        j11 = j9;
                                    }
                                }
                            }
                            if (qq1Var2 == null) {
                                int i5 = (int) (this.q - ((p16) mk1Var).d);
                                if (i5 >= 0) {
                                    ((p16) mk1Var).k(i5);
                                } else {
                                    throw jy2.a("Offset to end of mdat was negative.", null);
                                }
                            } else {
                                if (!qq1Var2.l) {
                                    j8 = qq1Var2.d.c[qq1Var2.f];
                                } else {
                                    j8 = qq1Var2.b.f[qq1Var2.h];
                                }
                                int i6 = (int) (j8 - ((p16) mk1Var).d);
                                if (i6 < 0) {
                                    lb4.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i6 = 0;
                                }
                                ((p16) mk1Var).k(i6);
                                this.v = qq1Var2;
                                qq1Var = qq1Var2;
                            }
                        } else {
                            int size2 = this.b.size();
                            qq1 qq1Var4 = null;
                            for (int i7 = 0; i7 < size2; i7++) {
                                zq1 zq1Var = ((qq1) this.b.valueAt(i7)).b;
                                if (zq1Var.o) {
                                    long j12 = zq1Var.c;
                                    if (j12 < j10) {
                                        qq1Var4 = (qq1) this.b.valueAt(i7);
                                        j10 = j12;
                                    }
                                }
                            }
                            if (qq1Var4 == null) {
                                i = 3;
                                break;
                            }
                            int i8 = (int) (j10 - ((p16) mk1Var).d);
                            if (i8 >= 0) {
                                p16 p16Var = (p16) mk1Var;
                                p16Var.k(i8);
                                zq1 zq1Var2 = qq1Var4.b;
                                kh4 kh4Var2 = zq1Var2.n;
                                p16Var.A(kh4Var2.a, 0, kh4Var2.c, false);
                                zq1Var2.n.e(0);
                                zq1Var2.o = false;
                            } else {
                                throw jy2.a("Offset to encryption data was negative.", null);
                            }
                        }
                    } else {
                        int i9 = ((int) this.n) - this.o;
                        kh4 kh4Var3 = this.p;
                        if (kh4Var3 != null) {
                            ((p16) mk1Var).A(kh4Var3.a, 8, i9, false);
                            int i10 = this.m;
                            aq1 aq1Var = new aq1(i10, kh4Var3);
                            long j13 = ((p16) mk1Var).d;
                            if (!this.j.isEmpty()) {
                                ((zp1) this.j.peek()).c.add(aq1Var);
                            } else if (i10 == 1936286840) {
                                kh4Var3.e(8);
                                int i11 = (kh4Var3.i() >> 24) & 255;
                                kh4Var3.f(4);
                                long u2 = kh4Var3.u();
                                if (i11 == 0) {
                                    v = kh4Var3.u();
                                    v2 = kh4Var3.u();
                                } else {
                                    v = kh4Var3.v();
                                    v2 = kh4Var3.v();
                                }
                                long j14 = v;
                                long j15 = j13 + v2;
                                long r2 = zn4.r(j14, 1000000L, u2);
                                kh4Var3.f(2);
                                int q = kh4Var3.q();
                                int[] iArr = new int[q];
                                long[] jArr = new long[q];
                                long[] jArr2 = new long[q];
                                long[] jArr3 = new long[q];
                                long j16 = r2;
                                int i12 = 0;
                                while (i12 < q) {
                                    int i13 = kh4Var3.i();
                                    if ((i13 & RecyclerView.UNDEFINED_DURATION) == 0) {
                                        long u3 = kh4Var3.u();
                                        iArr[i12] = i13 & Integer.MAX_VALUE;
                                        jArr[i12] = j15;
                                        jArr3[i12] = j16;
                                        j14 += u3;
                                        long[] jArr4 = jArr3;
                                        int i14 = i12;
                                        long[] jArr5 = jArr2;
                                        j16 = zn4.r(j14, 1000000L, u2);
                                        jArr5[i14] = j16 - jArr4[i14];
                                        kh4Var3.f(4);
                                        j15 += iArr[i14];
                                        i12 = i14 + 1;
                                        jArr2 = jArr5;
                                        jArr = jArr;
                                        jArr3 = jArr4;
                                        q = q;
                                    } else {
                                        throw jy2.a("Unhandled indirect reference", null);
                                    }
                                }
                                Pair create = Pair.create(Long.valueOf(r2), new o16(iArr, jArr, jArr2, jArr3));
                                this.u = ((Long) create.first).longValue();
                                this.A.n((ml1) create.second);
                                this.D = true;
                            } else if (i10 == 1701671783 && this.B.length != 0) {
                                kh4Var3.e(8);
                                int i15 = (kh4Var3.i() >> 24) & 255;
                                if (i15 != 0) {
                                    if (i15 != 1) {
                                        lb4.c("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + i15);
                                    } else {
                                        long u4 = kh4Var3.u();
                                        long r3 = zn4.r(kh4Var3.v(), 1000000L, u4);
                                        r = zn4.r(kh4Var3.u(), 1000L, u4);
                                        u = kh4Var3.u();
                                        x = kh4Var3.x();
                                        x.getClass();
                                        x2 = kh4Var3.x();
                                        x2.getClass();
                                        j7 = r3;
                                        j6 = -9223372036854775807L;
                                    }
                                } else {
                                    x = kh4Var3.x();
                                    x.getClass();
                                    x2 = kh4Var3.x();
                                    x2.getClass();
                                    long u5 = kh4Var3.u();
                                    long r4 = zn4.r(kh4Var3.u(), 1000000L, u5);
                                    long j17 = this.u;
                                    if (j17 != -9223372036854775807L) {
                                        j5 = j17 + r4;
                                    } else {
                                        j5 = -9223372036854775807L;
                                    }
                                    r = zn4.r(kh4Var3.u(), 1000L, u5);
                                    u = kh4Var3.u();
                                    j6 = r4;
                                    j7 = j5;
                                }
                                int i16 = kh4Var3.c - kh4Var3.b;
                                byte[] bArr = new byte[i16];
                                kh4Var3.a(bArr, 0, i16);
                                ln1 ln1Var = this.h;
                                ((ByteArrayOutputStream) ln1Var.Q).reset();
                                try {
                                    DataOutputStream dataOutputStream = (DataOutputStream) ln1Var.R;
                                    dataOutputStream.writeBytes(x);
                                    dataOutputStream.writeByte(0);
                                    DataOutputStream dataOutputStream2 = (DataOutputStream) ln1Var.R;
                                    dataOutputStream2.writeBytes(x2);
                                    dataOutputStream2.writeByte(0);
                                    ((DataOutputStream) ln1Var.R).writeLong(r);
                                    ((DataOutputStream) ln1Var.R).writeLong(u);
                                    ((DataOutputStream) ln1Var.R).write(bArr);
                                    ((DataOutputStream) ln1Var.R).flush();
                                    kh4 kh4Var4 = new kh4(((ByteArrayOutputStream) ln1Var.Q).toByteArray());
                                    int i17 = kh4Var4.c - kh4Var4.b;
                                    for (pl1 pl1Var : this.B) {
                                        kh4Var4.e(0);
                                        pl1Var.a(i17, kh4Var4);
                                    }
                                    if (j7 == -9223372036854775807L) {
                                        arrayDeque = this.k;
                                        pq1Var = new pq1(i17, j6, true);
                                    } else if (!this.k.isEmpty()) {
                                        arrayDeque = this.k;
                                        pq1Var = new pq1(i17, j7, false);
                                    } else {
                                        pl1[] pl1VarArr2 = this.B;
                                        int length = pl1VarArr2.length;
                                        int i18 = 0;
                                        while (i18 < length) {
                                            pl1VarArr2[i18].b(j7, 1, i17, 0, null);
                                            i18++;
                                            j7 = j7;
                                        }
                                    }
                                    arrayDeque.addLast(pq1Var);
                                    this.r += i17;
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        } else {
                            ((p16) mk1Var).k(i9);
                        }
                        j4 = ((p16) mk1Var).d;
                    }
                } else {
                    if (this.o == 0) {
                        if (!((p16) mk1Var).A(this.i.a, 0, 8, true)) {
                            return -1;
                        }
                        this.o = 8;
                        this.i.e(0);
                        this.n = this.i.u();
                        this.m = this.i.i();
                    }
                    long j18 = this.n;
                    if (j18 == 1) {
                        ((p16) mk1Var).A(this.i.a, 8, 8, false);
                        this.o += 8;
                        j = this.i.v();
                    } else {
                        if (j18 == 0) {
                            p16 p16Var2 = (p16) mk1Var;
                            long j19 = p16Var2.c;
                            if (j19 == -1) {
                                if (!this.j.isEmpty()) {
                                    j19 = ((zp1) this.j.peek()).b;
                                } else {
                                    j19 = -1;
                                }
                            }
                            if (j19 != -1) {
                                j = (j19 - p16Var2.d) + this.o;
                            }
                        }
                        j2 = this.n;
                        j3 = this.o;
                        if (j2 < j3) {
                            p16 p16Var3 = (p16) mk1Var;
                            long j20 = p16Var3.d - j3;
                            int i19 = this.m;
                            if ((i19 == 1836019558 || i19 == 1835295092) && !this.D) {
                                this.A.n(new ll1(this.t, j20));
                                this.D = true;
                            }
                            if (this.m == 1836019558) {
                                int size3 = this.b.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    zq1 zq1Var3 = ((qq1) this.b.valueAt(i20)).b;
                                    zq1Var3.c = j20;
                                    zq1Var3.b = j20;
                                }
                            }
                            int i21 = this.m;
                            if (i21 == 1835295092) {
                                this.v = null;
                                this.q = j20 + this.n;
                                i = 2;
                            } else if (i21 != 1836019574 && i21 != 1953653099 && i21 != 1835297121 && i21 != 1835626086 && i21 != 1937007212 && i21 != 1836019558 && i21 != 1953653094 && i21 != 1836475768 && i21 != 1701082227) {
                                if (i21 != 1751411826 && i21 != 1835296868 && i21 != 1836476516 && i21 != 1936286840 && i21 != 1937011556 && i21 != 1937011827 && i21 != 1668576371 && i21 != 1937011555 && i21 != 1937011578 && i21 != 1937013298 && i21 != 1937007471 && i21 != 1668232756 && i21 != 1937011571 && i21 != 1952867444 && i21 != 1952868452 && i21 != 1953196132 && i21 != 1953654136 && i21 != 1953658222 && i21 != 1886614376 && i21 != 1935763834 && i21 != 1935763823 && i21 != 1936027235 && i21 != 1970628964 && i21 != 1935828848 && i21 != 1936158820 && i21 != 1701606260 && i21 != 1835362404 && i21 != 1701671783) {
                                    if (this.n <= 2147483647L) {
                                        kh4Var = null;
                                    } else {
                                        throw jy2.b("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                } else if (this.o == 8) {
                                    if (this.n <= 2147483647L) {
                                        kh4Var = new kh4((int) this.n);
                                        System.arraycopy(this.i.a, 0, kh4Var.a, 0, 8);
                                    } else {
                                        throw jy2.b("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                } else {
                                    throw jy2.b("Leaf atom defines extended atom size (unsupported).");
                                }
                                this.p = kh4Var;
                                i = 1;
                            } else {
                                j4 = (p16Var3.d + this.n) - 8;
                                this.j.push(new zp1(j4, i21));
                                if (this.n == this.o) {
                                }
                            }
                        } else {
                            throw jy2.b("Atom size less than header length (unsupported).");
                        }
                    }
                    this.n = j;
                    j2 = this.n;
                    j3 = this.o;
                    if (j2 < j3) {
                    }
                }
            }
            c();
        }
    }
}