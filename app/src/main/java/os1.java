package defpackage;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: os1  reason: default package */
public final class os1 implements fs1 {
    public final gt1 a;
    public String b;
    public pl1 c;
    public ns1 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final ss1 g = new ss1(32);
    public final ss1 h = new ss1(33);
    public final ss1 i = new ss1(34);
    public final ss1 j = new ss1(39);
    public final ss1 k = new ss1(40);
    public long m = -9223372036854775807L;
    public final kh4 n = new kh4();

    public os1(gt1 gt1Var) {
        this.a = gt1Var;
    }

    @RequiresNonNull({"sampleReader"})
    public final void a(byte[] bArr, int i, int i2) {
        boolean z;
        ns1 ns1Var = this.d;
        if (ns1Var.f) {
            int i3 = ns1Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ns1Var.g = z;
                ns1Var.f = false;
            } else {
                ns1Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // defpackage.fs1
    public final void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        hl1.d(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        ns1 ns1Var = this.d;
        if (ns1Var != null) {
            ns1Var.f = false;
            ns1Var.g = false;
            ns1Var.h = false;
            ns1Var.i = false;
            ns1Var.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0458 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        kh4 kh4Var2 = kh4Var;
        tv2.B(this.c);
        int i13 = zn4.a;
        while (true) {
            int i14 = kh4Var2.c;
            int i15 = kh4Var2.b;
            int i16 = i14 - i15;
            if (i16 > 0) {
                byte[] bArr2 = kh4Var2.a;
                this.l += i16;
                this.c.a(i16, kh4Var2);
                while (i15 < i14) {
                    int a = hl1.a(bArr2, i15, i14, this.f);
                    if (a != i14) {
                        int i17 = a + 3;
                        int i18 = bArr2[i17] & 126;
                        int i19 = a - i15;
                        if (i19 > 0) {
                            a(bArr2, i15, a);
                        }
                        int i20 = i14 - a;
                        long j2 = this.l - i20;
                        if (i19 < 0) {
                            i = -i19;
                        } else {
                            i = 0;
                        }
                        long j3 = this.m;
                        ns1 ns1Var = this.d;
                        boolean z5 = this.e;
                        if (ns1Var.j && ns1Var.g) {
                            ns1Var.m = ns1Var.c;
                            ns1Var.j = false;
                        } else if (ns1Var.h || ns1Var.g) {
                            if (z5 && ns1Var.i) {
                                long j4 = ns1Var.b;
                                i2 = i14;
                                int i21 = ((int) (j2 - j4)) + i20;
                                long j5 = ns1Var.l;
                                if (j5 != -9223372036854775807L) {
                                    bArr = bArr2;
                                    i3 = i17;
                                    ns1Var.a.b(j5, ns1Var.m ? 1 : 0, (int) (j4 - ns1Var.k), i21, null);
                                    ns1Var.k = ns1Var.b;
                                    ns1Var.l = ns1Var.e;
                                    ns1Var.m = ns1Var.c;
                                    ns1Var.i = true;
                                    if (!this.e) {
                                        this.g.d(i);
                                        this.h.d(i);
                                        this.i.d(i);
                                        ss1 ss1Var = this.g;
                                        if (ss1Var.c) {
                                            ss1 ss1Var2 = this.h;
                                            if (ss1Var2.c) {
                                                ss1 ss1Var3 = this.i;
                                                if (ss1Var3.c) {
                                                    pl1 pl1Var = this.c;
                                                    String str = this.b;
                                                    int i22 = ss1Var.e;
                                                    byte[] bArr3 = new byte[ss1Var2.e + i22 + ss1Var3.e];
                                                    i5 = i20;
                                                    System.arraycopy(ss1Var.d, 0, bArr3, 0, i22);
                                                    j = j2;
                                                    System.arraycopy(ss1Var2.d, 0, bArr3, ss1Var.e, ss1Var2.e);
                                                    System.arraycopy(ss1Var3.d, 0, bArr3, ss1Var.e + ss1Var2.e, ss1Var3.e);
                                                    il1 il1Var = new il1(ss1Var2.d, 0, ss1Var2.e);
                                                    il1Var.d(44);
                                                    int a2 = il1Var.a(3);
                                                    il1Var.c();
                                                    int a3 = il1Var.a(2);
                                                    boolean e = il1Var.e();
                                                    int a4 = il1Var.a(5);
                                                    int i23 = 0;
                                                    int i24 = 0;
                                                    for (int i25 = 32; i23 < i25; i25 = 32) {
                                                        if (il1Var.e()) {
                                                            i24 |= 1 << i23;
                                                        }
                                                        i23++;
                                                    }
                                                    int i26 = 6;
                                                    int[] iArr = new int[6];
                                                    for (int i27 = 0; i27 < 6; i27++) {
                                                        iArr[i27] = il1Var.a(8);
                                                    }
                                                    int a5 = il1Var.a(8);
                                                    int i28 = 0;
                                                    for (int i29 = 0; i29 < a2; i29++) {
                                                        if (il1Var.e()) {
                                                            i28 += 89;
                                                        }
                                                        if (il1Var.e()) {
                                                            i28 += 8;
                                                        }
                                                    }
                                                    il1Var.d(i28);
                                                    if (a2 > 0) {
                                                        int i30 = 8 - a2;
                                                        il1Var.d(i30 + i30);
                                                    }
                                                    il1Var.f();
                                                    int f2 = il1Var.f();
                                                    if (f2 == 3) {
                                                        il1Var.c();
                                                        f2 = 3;
                                                    }
                                                    int f3 = il1Var.f();
                                                    int f4 = il1Var.f();
                                                    if (il1Var.e()) {
                                                        int f5 = il1Var.f();
                                                        int f6 = il1Var.f();
                                                        int f7 = il1Var.f();
                                                        int f8 = il1Var.f();
                                                        if (f2 != 1) {
                                                            if (f2 == 2) {
                                                                f2 = 2;
                                                            } else {
                                                                i11 = 1;
                                                                if (f2 != 1) {
                                                                    i12 = 2;
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                                f3 -= (f5 + f6) * i11;
                                                                f4 -= (f7 + f8) * i12;
                                                            }
                                                        }
                                                        i11 = 2;
                                                        if (f2 != 1) {
                                                        }
                                                        f3 -= (f5 + f6) * i11;
                                                        f4 -= (f7 + f8) * i12;
                                                    }
                                                    il1Var.f();
                                                    il1Var.f();
                                                    int f9 = il1Var.f();
                                                    if (true != il1Var.e()) {
                                                        i7 = a2;
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    while (i7 <= a2) {
                                                        il1Var.f();
                                                        il1Var.f();
                                                        il1Var.f();
                                                        i7++;
                                                    }
                                                    il1Var.f();
                                                    il1Var.f();
                                                    il1Var.f();
                                                    il1Var.f();
                                                    il1Var.f();
                                                    il1Var.f();
                                                    if (il1Var.e() && il1Var.e()) {
                                                        int i31 = 0;
                                                        for (int i32 = 4; i31 < i32; i32 = 4) {
                                                            int i33 = 0;
                                                            while (i33 < i26) {
                                                                if (!il1Var.e()) {
                                                                    il1Var.f();
                                                                    i9 = i18;
                                                                } else {
                                                                    i9 = i18;
                                                                    int min = Math.min(64, 1 << ((i31 + i31) + 4));
                                                                    if (i31 > 1) {
                                                                        il1Var.b();
                                                                    }
                                                                    for (int i34 = 0; i34 < min; i34++) {
                                                                        il1Var.b();
                                                                    }
                                                                }
                                                                if (i31 == 3) {
                                                                    i10 = 3;
                                                                } else {
                                                                    i10 = 1;
                                                                }
                                                                i33 += i10;
                                                                i18 = i9;
                                                                i26 = 6;
                                                            }
                                                            i31++;
                                                            i26 = 6;
                                                        }
                                                    }
                                                    i4 = i18;
                                                    il1Var.d(2);
                                                    if (il1Var.e()) {
                                                        il1Var.d(8);
                                                        il1Var.f();
                                                        il1Var.f();
                                                        il1Var.c();
                                                    }
                                                    int f10 = il1Var.f();
                                                    boolean z6 = false;
                                                    int i35 = 0;
                                                    int i36 = 0;
                                                    while (i36 < f10) {
                                                        if (i36 != 0) {
                                                            z6 = il1Var.e();
                                                        }
                                                        if (z6) {
                                                            il1Var.c();
                                                            il1Var.f();
                                                            for (int i37 = 0; i37 <= i35; i37++) {
                                                                if (il1Var.e()) {
                                                                    il1Var.c();
                                                                }
                                                            }
                                                            i8 = f10;
                                                        } else {
                                                            int f11 = il1Var.f();
                                                            int f12 = il1Var.f();
                                                            int i38 = f11 + f12;
                                                            i8 = f10;
                                                            for (int i39 = 0; i39 < f11; i39++) {
                                                                il1Var.f();
                                                                il1Var.c();
                                                            }
                                                            for (int i40 = 0; i40 < f12; i40++) {
                                                                il1Var.f();
                                                                il1Var.c();
                                                            }
                                                            i35 = i38;
                                                        }
                                                        i36++;
                                                        f10 = i8;
                                                    }
                                                    if (il1Var.e()) {
                                                        for (int i41 = 0; i41 < il1Var.f(); i41++) {
                                                            il1Var.d(f9 + 5);
                                                        }
                                                    }
                                                    il1Var.d(2);
                                                    float f13 = 1.0f;
                                                    if (il1Var.e()) {
                                                        if (il1Var.e()) {
                                                            int a6 = il1Var.a(8);
                                                            if (a6 == 255) {
                                                                int a7 = il1Var.a(16);
                                                                int a8 = il1Var.a(16);
                                                                if (a7 != 0 && a8 != 0) {
                                                                    f = a7 / a8;
                                                                    f13 = f;
                                                                }
                                                            } else if (a6 < 17) {
                                                                f = hl1.b[a6];
                                                                f13 = f;
                                                            } else {
                                                                lb4.c("H265Reader", "Unexpected aspect_ratio_idc value: " + a6);
                                                            }
                                                        }
                                                        if (il1Var.e()) {
                                                            il1Var.c();
                                                        }
                                                        if (il1Var.e()) {
                                                            il1Var.d(4);
                                                            if (il1Var.e()) {
                                                                il1Var.d(24);
                                                            }
                                                        }
                                                        if (il1Var.e()) {
                                                            il1Var.f();
                                                            il1Var.f();
                                                        }
                                                        il1Var.c();
                                                        if (il1Var.e()) {
                                                            f4 += f4;
                                                        }
                                                    }
                                                    String d = g9.d(a3, e, a4, i24, iArr, a5);
                                                    bs1 bs1Var = new bs1();
                                                    bs1Var.a = str;
                                                    bs1Var.j = "video/hevc";
                                                    bs1Var.g = d;
                                                    bs1Var.o = f3;
                                                    bs1Var.p = f4;
                                                    bs1Var.s = f13;
                                                    bs1Var.l = Collections.singletonList(bArr3);
                                                    pl1Var.e(new cu1(bs1Var));
                                                    this.e = true;
                                                    if (this.j.d(i)) {
                                                        ss1 ss1Var4 = this.j;
                                                        this.n.c(this.j.d, hl1.b(ss1Var4.d, ss1Var4.e));
                                                        this.n.f(5);
                                                        q05.h(j3, this.n, this.a.b);
                                                    }
                                                    if (this.k.d(i)) {
                                                        ss1 ss1Var5 = this.k;
                                                        this.n.c(this.k.d, hl1.b(ss1Var5.d, ss1Var5.e));
                                                        this.n.f(5);
                                                        q05.h(j3, this.n, this.a.b);
                                                    }
                                                    i6 = i4 >> 1;
                                                    long j6 = this.m;
                                                    ns1 ns1Var2 = this.d;
                                                    boolean z7 = this.e;
                                                    ns1Var2.g = false;
                                                    ns1Var2.h = false;
                                                    ns1Var2.e = j6;
                                                    ns1Var2.d = 0;
                                                    long j7 = j;
                                                    ns1Var2.b = j7;
                                                    if (i6 < 32 && i6 != 40) {
                                                        if (ns1Var2.i && !ns1Var2.j) {
                                                            if (z7) {
                                                                long j8 = ns1Var2.l;
                                                                if (j8 != -9223372036854775807L) {
                                                                    z4 = false;
                                                                    z3 = true;
                                                                    ns1Var2.a.b(j8, ns1Var2.m ? 1 : 0, (int) (j7 - ns1Var2.k), i5, null);
                                                                    ns1Var2.i = z4;
                                                                }
                                                            }
                                                            z4 = false;
                                                            z3 = true;
                                                            ns1Var2.i = z4;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        if (i6 <= 35 || i6 == 39) {
                                                            ns1Var2.h = ns1Var2.j ^ z3;
                                                            ns1Var2.j = z3;
                                                        }
                                                    }
                                                    if (i6 < 16 && i6 <= 21) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    ns1Var2.c = z;
                                                    if (z && i6 > 9) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    ns1Var2.f = z2;
                                                    if (this.e) {
                                                        this.g.c(i6);
                                                        this.h.c(i6);
                                                        this.i.c(i6);
                                                    }
                                                    this.j.c(i6);
                                                    this.k.c(i6);
                                                    i14 = i2;
                                                    bArr2 = bArr;
                                                    i15 = i3;
                                                }
                                            }
                                        }
                                    }
                                    j = j2;
                                    i4 = i18;
                                    i5 = i20;
                                    if (this.j.d(i)) {
                                    }
                                    if (this.k.d(i)) {
                                    }
                                    i6 = i4 >> 1;
                                    long j62 = this.m;
                                    ns1 ns1Var22 = this.d;
                                    boolean z72 = this.e;
                                    ns1Var22.g = false;
                                    ns1Var22.h = false;
                                    ns1Var22.e = j62;
                                    ns1Var22.d = 0;
                                    long j72 = j;
                                    ns1Var22.b = j72;
                                    if (i6 < 32) {
                                    }
                                    if (i6 < 16) {
                                    }
                                    z = false;
                                    ns1Var22.c = z;
                                    if (z) {
                                    }
                                    z2 = true;
                                    ns1Var22.f = z2;
                                    if (this.e) {
                                    }
                                    this.j.c(i6);
                                    this.k.c(i6);
                                    i14 = i2;
                                    bArr2 = bArr;
                                    i15 = i3;
                                }
                            } else {
                                i2 = i14;
                            }
                            bArr = bArr2;
                            i3 = i17;
                            ns1Var.k = ns1Var.b;
                            ns1Var.l = ns1Var.e;
                            ns1Var.m = ns1Var.c;
                            ns1Var.i = true;
                            if (!this.e) {
                            }
                            j = j2;
                            i4 = i18;
                            i5 = i20;
                            if (this.j.d(i)) {
                            }
                            if (this.k.d(i)) {
                            }
                            i6 = i4 >> 1;
                            long j622 = this.m;
                            ns1 ns1Var222 = this.d;
                            boolean z722 = this.e;
                            ns1Var222.g = false;
                            ns1Var222.h = false;
                            ns1Var222.e = j622;
                            ns1Var222.d = 0;
                            long j722 = j;
                            ns1Var222.b = j722;
                            if (i6 < 32) {
                            }
                            if (i6 < 16) {
                            }
                            z = false;
                            ns1Var222.c = z;
                            if (z) {
                            }
                            z2 = true;
                            ns1Var222.f = z2;
                            if (this.e) {
                            }
                            this.j.c(i6);
                            this.k.c(i6);
                            i14 = i2;
                            bArr2 = bArr;
                            i15 = i3;
                        }
                        i2 = i14;
                        bArr = bArr2;
                        i3 = i17;
                        if (!this.e) {
                        }
                        j = j2;
                        i4 = i18;
                        i5 = i20;
                        if (this.j.d(i)) {
                        }
                        if (this.k.d(i)) {
                        }
                        i6 = i4 >> 1;
                        long j6222 = this.m;
                        ns1 ns1Var2222 = this.d;
                        boolean z7222 = this.e;
                        ns1Var2222.g = false;
                        ns1Var2222.h = false;
                        ns1Var2222.e = j6222;
                        ns1Var2222.d = 0;
                        long j7222 = j;
                        ns1Var2222.b = j7222;
                        if (i6 < 32) {
                        }
                        if (i6 < 16) {
                        }
                        z = false;
                        ns1Var2222.c = z;
                        if (z) {
                        }
                        z2 = true;
                        ns1Var2222.f = z2;
                        if (this.e) {
                        }
                        this.j.c(i6);
                        this.k.c(i6);
                        i14 = i2;
                        bArr2 = bArr;
                        i15 = i3;
                    } else {
                        a(bArr2, i15, i14);
                        return;
                    }
                }
                kh4Var2 = kh4Var;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.fs1
    public final void d() {
    }

    @Override // defpackage.fs1
    public final void e(nk1 nk1Var, pt1 pt1Var) {
        pt1Var.a();
        pt1Var.b();
        this.b = pt1Var.e;
        pt1Var.b();
        pl1 q = nk1Var.q(pt1Var.d, 2);
        this.c = q;
        this.d = new ns1(q);
        this.a.a(nk1Var, pt1Var);
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }
}