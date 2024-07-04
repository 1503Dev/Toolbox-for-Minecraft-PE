package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: pr1  reason: default package */
public final class pr1 extends nr1 {
    public or1 n;
    public int o;
    public boolean p;
    public tl1 q;
    public q65 r;

    @Override // defpackage.nr1
    public final long a(kh4 kh4Var) {
        int i;
        int i2 = 0;
        byte b = kh4Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        or1 or1Var = this.n;
        tv2.B(or1Var);
        if (!or1Var.d[(b >> 1) & (255 >>> (8 - or1Var.e))].a) {
            i = or1Var.a.e;
        } else {
            i = or1Var.a.f;
        }
        if (this.p) {
            i2 = (this.o + i) / 4;
        }
        byte[] bArr = kh4Var.a;
        int length = bArr.length;
        int i3 = kh4Var.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            kh4Var.c(copyOf, copyOf.length);
        } else {
            kh4Var.d(i3);
        }
        long j = i2;
        byte[] bArr2 = kh4Var.a;
        int i4 = kh4Var.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.nr1
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // defpackage.nr1
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(kh4 kh4Var, long j, mr1 mr1Var) {
        boolean c;
        or1 or1Var;
        int i;
        int i2;
        int i3;
        long j2;
        int i4;
        int i5;
        if (this.n != null) {
            ((cu1) mr1Var.P).getClass();
            return false;
        }
        tl1 tl1Var = this.q;
        int i6 = 4;
        if (tl1Var == null) {
            ul1.c(1, kh4Var, false);
            kh4Var.k();
            int n = kh4Var.n();
            int k = kh4Var.k();
            int j3 = kh4Var.j();
            if (j3 <= 0) {
                i4 = -1;
            } else {
                i4 = j3;
            }
            int j4 = kh4Var.j();
            if (j4 <= 0) {
                i5 = -1;
            } else {
                i5 = j4;
            }
            kh4Var.j();
            int n2 = kh4Var.n();
            kh4Var.n();
            this.q = new tl1(n, k, i4, i5, (int) Math.pow(2.0d, n2 & 15), (int) Math.pow(2.0d, (n2 & 240) >> 4), Arrays.copyOf(kh4Var.a, kh4Var.c));
        } else {
            q65 q65Var = this.r;
            if (q65Var == null) {
                this.r = ul1.b(kh4Var, true, true);
            } else {
                int i7 = kh4Var.c;
                byte[] bArr = new byte[i7];
                System.arraycopy(kh4Var.a, 0, bArr, 0, i7);
                int i8 = tl1Var.a;
                int i9 = 5;
                ul1.c(5, kh4Var, false);
                int n3 = kh4Var.n() + 1;
                rl1 rl1Var = new rl1(kh4Var.a);
                rl1Var.b(kh4Var.b * 8);
                int i10 = 0;
                while (true) {
                    int i11 = 2;
                    int i12 = 16;
                    if (i10 < n3) {
                        if (rl1Var.a(24) == 5653314) {
                            int a = rl1Var.a(16);
                            int a2 = rl1Var.a(24);
                            if (!rl1Var.c()) {
                                boolean c2 = rl1Var.c();
                                for (int i13 = 0; i13 < a2; i13++) {
                                    if (!c2 || rl1Var.c()) {
                                        rl1Var.b(i9);
                                    }
                                }
                            } else {
                                rl1Var.b(i9);
                                int i14 = 0;
                                while (i14 < a2) {
                                    int i15 = a2 - i14;
                                    int i16 = 0;
                                    while (i15 > 0) {
                                        i15 >>>= 1;
                                        i16++;
                                    }
                                    i14 += rl1Var.a(i16);
                                }
                            }
                            int a3 = rl1Var.a(4);
                            if (a3 <= 2) {
                                if (a3 != 1) {
                                    if (a3 != 2) {
                                        i10++;
                                        i9 = 5;
                                    }
                                } else {
                                    i11 = a3;
                                }
                                rl1Var.b(32);
                                rl1Var.b(32);
                                int a4 = rl1Var.a(4) + 1;
                                rl1Var.b(1);
                                if (i11 == 1) {
                                    if (a != 0) {
                                        double d = a;
                                        Double.isNaN(d);
                                        Double.isNaN(d);
                                        j2 = (long) Math.floor(Math.pow(a2, 1.0d / d));
                                    } else {
                                        j2 = 0;
                                    }
                                } else {
                                    j2 = a * a2;
                                }
                                rl1Var.b((int) (j2 * a4));
                                i10++;
                                i9 = 5;
                            } else {
                                throw jy2.a("lookup type greater than 2 not decodable: " + a3, null);
                            }
                        } else {
                            throw jy2.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((rl1Var.c * 8) + rl1Var.d), null);
                        }
                    } else {
                        int i17 = 6;
                        int a5 = rl1Var.a(6) + 1;
                        for (int i18 = 0; i18 < a5; i18++) {
                            if (rl1Var.a(16) != 0) {
                                throw jy2.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i19 = 1;
                        int a6 = rl1Var.a(6) + 1;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 < a6) {
                                int a7 = rl1Var.a(i12);
                                if (a7 != 0) {
                                    if (a7 == i19) {
                                        int a8 = rl1Var.a(5);
                                        int[] iArr = new int[a8];
                                        int i22 = -1;
                                        for (int i23 = 0; i23 < a8; i23++) {
                                            int a9 = rl1Var.a(i6);
                                            iArr[i23] = a9;
                                            if (a9 > i22) {
                                                i22 = a9;
                                            }
                                        }
                                        int i24 = i22 + 1;
                                        int[] iArr2 = new int[i24];
                                        int i25 = 0;
                                        while (i25 < i24) {
                                            iArr2[i25] = rl1Var.a(i21) + 1;
                                            int a10 = rl1Var.a(2);
                                            int i26 = 8;
                                            if (a10 > 0) {
                                                rl1Var.b(8);
                                            }
                                            int i27 = i24;
                                            int i28 = 0;
                                            for (int i29 = 1; i28 < (i29 << a10); i29 = 1) {
                                                rl1Var.b(i26);
                                                i28++;
                                                i26 = 8;
                                            }
                                            i25++;
                                            i24 = i27;
                                            i21 = 3;
                                        }
                                        rl1Var.b(2);
                                        int a11 = rl1Var.a(4);
                                        int i30 = 0;
                                        int i31 = 0;
                                        for (int i32 = 0; i32 < a8; i32++) {
                                            i30 += iArr2[iArr[i32]];
                                            while (i31 < i30) {
                                                rl1Var.b(a11);
                                                i31++;
                                            }
                                        }
                                    } else {
                                        throw jy2.a("floor type greater than 1 not decodable: " + a7, null);
                                    }
                                } else {
                                    int i33 = 8;
                                    rl1Var.b(8);
                                    rl1Var.b(16);
                                    rl1Var.b(16);
                                    rl1Var.b(6);
                                    rl1Var.b(8);
                                    int a12 = rl1Var.a(4) + 1;
                                    int i34 = 0;
                                    while (i34 < a12) {
                                        rl1Var.b(i33);
                                        i34++;
                                        i33 = 8;
                                    }
                                }
                                i20++;
                                i17 = 6;
                                i12 = 16;
                                i6 = 4;
                                i19 = 1;
                            } else {
                                int i35 = 1;
                                int a13 = rl1Var.a(i17) + 1;
                                int i36 = 0;
                                while (i36 < a13) {
                                    if (rl1Var.a(16) <= 2) {
                                        rl1Var.b(24);
                                        rl1Var.b(24);
                                        rl1Var.b(24);
                                        int a14 = rl1Var.a(i17) + i35;
                                        int i37 = 8;
                                        rl1Var.b(8);
                                        int[] iArr3 = new int[a14];
                                        for (int i38 = 0; i38 < a14; i38++) {
                                            int a15 = rl1Var.a(3);
                                            if (rl1Var.c()) {
                                                i3 = rl1Var.a(5);
                                            } else {
                                                i3 = 0;
                                            }
                                            iArr3[i38] = (i3 * 8) + a15;
                                        }
                                        int i39 = 0;
                                        while (i39 < a14) {
                                            int i40 = 0;
                                            while (i40 < i37) {
                                                if ((iArr3[i39] & (1 << i40)) != 0) {
                                                    rl1Var.b(i37);
                                                }
                                                i40++;
                                                i37 = 8;
                                            }
                                            i39++;
                                            i37 = 8;
                                        }
                                        i36++;
                                        i17 = 6;
                                        i35 = 1;
                                    } else {
                                        throw jy2.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int a16 = rl1Var.a(i17) + 1;
                                for (int i41 = 0; i41 < a16; i41++) {
                                    int a17 = rl1Var.a(16);
                                    if (a17 != 0) {
                                        lb4.a("VorbisUtil", "mapping type other than 0 not supported: " + a17);
                                    } else {
                                        if (rl1Var.c()) {
                                            i = 1;
                                            i2 = rl1Var.a(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (rl1Var.c()) {
                                            int a18 = rl1Var.a(8) + i;
                                            for (int i42 = 0; i42 < a18; i42++) {
                                                int i43 = i8 - 1;
                                                int i44 = i43;
                                                int i45 = 0;
                                                while (i44 > 0) {
                                                    i44 >>>= 1;
                                                    i45++;
                                                }
                                                rl1Var.b(i45);
                                                int i46 = 0;
                                                while (i43 > 0) {
                                                    i43 >>>= 1;
                                                    i46++;
                                                }
                                                rl1Var.b(i46);
                                            }
                                        }
                                        if (rl1Var.a(2) == 0) {
                                            if (i2 > 1) {
                                                for (int i47 = 0; i47 < i8; i47++) {
                                                    rl1Var.b(4);
                                                }
                                            }
                                            for (int i48 = 0; i48 < i2; i48++) {
                                                rl1Var.b(8);
                                                rl1Var.b(8);
                                                rl1Var.b(8);
                                            }
                                        } else {
                                            throw jy2.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int a19 = rl1Var.a(6) + 1;
                                sl1[] sl1VarArr = new sl1[a19];
                                int i49 = 0;
                                while (true) {
                                    c = rl1Var.c();
                                    if (i49 >= a19) {
                                        break;
                                    }
                                    rl1Var.a(16);
                                    rl1Var.a(16);
                                    rl1Var.a(8);
                                    sl1VarArr[i49] = new sl1(c);
                                    i49++;
                                }
                                if (c) {
                                    int i50 = a19 - 1;
                                    int i51 = 0;
                                    while (i50 > 0) {
                                        i50 >>>= 1;
                                        i51++;
                                    }
                                    or1Var = new or1(tl1Var, q65Var, bArr, sl1VarArr, i51);
                                } else {
                                    throw jy2.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        or1Var = null;
        this.n = or1Var;
        if (or1Var == null) {
            return true;
        }
        tl1 tl1Var2 = or1Var.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tl1Var2.g);
        arrayList.add(or1Var.c);
        yt2 a20 = ul1.a(nv4.u((String[]) or1Var.b.b));
        bs1 bs1Var = new bs1();
        bs1Var.j = "audio/vorbis";
        bs1Var.e = tl1Var2.d;
        bs1Var.f = tl1Var2.c;
        bs1Var.w = tl1Var2.a;
        bs1Var.x = tl1Var2.b;
        bs1Var.l = arrayList;
        bs1Var.h = a20;
        mr1Var.P = new cu1(bs1Var);
        return true;
    }

    @Override // defpackage.nr1
    public final void d(long j) {
        boolean z;
        this.g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        tl1 tl1Var = this.q;
        if (tl1Var != null) {
            i = tl1Var.e;
        }
        this.o = i;
    }
}