package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ms1  reason: default package */
public final class ms1 implements fs1 {
    public final gt1 a;
    public long e;
    public String g;
    public pl1 h;
    public ls1 i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final ss1 b = new ss1(7);
    public final ss1 c = new ss1(8);
    public final ss1 d = new ss1(6);
    public long k = -9223372036854775807L;
    public final kh4 m = new kh4();

    public ms1(gt1 gt1Var) {
        this.a = gt1Var;
    }

    @Override // defpackage.fs1
    public final void b() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        hl1.d(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        ls1 ls1Var = this.i;
        if (ls1Var != null) {
            ls1Var.g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f7 A[SYNTHETIC] */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        ss1 ss1Var;
        ls1 ls1Var;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        tv2.B(this.h);
        int i7 = zn4.a;
        int i8 = kh4Var.b;
        int i9 = kh4Var.c;
        byte[] bArr3 = kh4Var.a;
        int i10 = i9 - i8;
        this.e += i10;
        this.h.a(i10, kh4Var);
        while (true) {
            int a = hl1.a(bArr3, i8, i9, this.f);
            if (a == i9) {
                break;
            }
            int i11 = a + 3;
            int i12 = bArr3[i11] & 31;
            int i13 = a - i8;
            if (i13 > 0) {
                if (!this.j) {
                    this.b.a(bArr3, i8, a);
                    this.c.a(bArr3, i8, a);
                }
                this.d.a(bArr3, i8, a);
            }
            int i14 = i9 - a;
            long j = this.e - i14;
            if (i13 < 0) {
                i2 = -i13;
            } else {
                i2 = 0;
            }
            long j2 = this.k;
            if (!this.j) {
                this.b.d(i2);
                this.c.d(i2);
                if (!this.j) {
                    if (this.b.c && this.c.c) {
                        ArrayList arrayList = new ArrayList();
                        ss1 ss1Var2 = this.b;
                        arrayList.add(Arrays.copyOf(ss1Var2.d, ss1Var2.e));
                        ss1 ss1Var3 = this.c;
                        arrayList.add(Arrays.copyOf(ss1Var3.d, ss1Var3.e));
                        ss1 ss1Var4 = this.b;
                        gl1 c = hl1.c(ss1Var4.d, 4, ss1Var4.e);
                        ss1 ss1Var5 = this.c;
                        i4 = i11;
                        il1 il1Var = new il1(ss1Var5.d, 4, ss1Var5.e);
                        int f = il1Var.f();
                        il1Var.f();
                        il1Var.c();
                        il1Var.e();
                        fl1 fl1Var = new fl1(f);
                        i3 = i9;
                        String c2 = g9.c(c.a, c.b, c.c);
                        pl1 pl1Var = this.h;
                        bs1 bs1Var = new bs1();
                        bArr2 = bArr3;
                        bs1Var.a = this.g;
                        bs1Var.j = "video/avc";
                        bs1Var.g = c2;
                        bs1Var.o = c.e;
                        bs1Var.p = c.f;
                        bs1Var.s = c.g;
                        bs1Var.l = arrayList;
                        pl1Var.e(new cu1(bs1Var));
                        this.j = true;
                        this.i.b.append(c.d, c);
                        this.i.c.append(f, fl1Var);
                        this.b.b();
                    }
                } else {
                    i3 = i9;
                    bArr2 = bArr3;
                    i4 = i11;
                    ss1 ss1Var6 = this.b;
                    if (ss1Var6.c) {
                        gl1 c3 = hl1.c(ss1Var6.d, 4, ss1Var6.e);
                        this.i.b.append(c3.d, c3);
                        ss1Var = this.b;
                        ss1Var.b();
                        if (this.d.d(i2)) {
                            ss1 ss1Var7 = this.d;
                            this.m.c(this.d.d, hl1.b(ss1Var7.d, ss1Var7.e));
                            this.m.e(4);
                            q05.h(j2, this.m, this.a.b);
                        }
                        ls1Var = this.i;
                        boolean z3 = this.j;
                        boolean z4 = this.l;
                        if (ls1Var.d == 9) {
                            i5 = 1;
                        } else {
                            if (z3 && ls1Var.g) {
                                long j3 = ls1Var.e;
                                int i15 = i14 + ((int) (j - j3));
                                long j4 = ls1Var.i;
                                if (j4 != -9223372036854775807L) {
                                    ls1Var.a.b(j4, ls1Var.j ? 1 : 0, (int) (j3 - ls1Var.h), i15, null);
                                }
                            }
                            ls1Var.h = ls1Var.e;
                            ls1Var.i = ls1Var.f;
                            ls1Var.j = false;
                            i5 = 1;
                            ls1Var.g = true;
                        }
                        boolean z5 = ls1Var.j;
                        i6 = ls1Var.d;
                        if (i6 == 5 && (!z4 || i6 != i5)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = z5 | z;
                        ls1Var.j = z2;
                        if (z2) {
                            this.l = false;
                        }
                        long j5 = this.k;
                        if (this.j) {
                            this.b.c(i12);
                            this.c.c(i12);
                        }
                        this.d.c(i12);
                        ls1 ls1Var2 = this.i;
                        ls1Var2.d = i12;
                        ls1Var2.f = j5;
                        ls1Var2.e = j;
                        i8 = i4;
                        i9 = i3;
                        bArr3 = bArr2;
                    } else {
                        ss1 ss1Var8 = this.c;
                        if (ss1Var8.c) {
                            il1 il1Var2 = new il1(ss1Var8.d, 4, ss1Var8.e);
                            int f2 = il1Var2.f();
                            il1Var2.f();
                            il1Var2.c();
                            il1Var2.e();
                            this.i.c.append(f2, new fl1(f2));
                        }
                        if (this.d.d(i2)) {
                        }
                        ls1Var = this.i;
                        boolean z32 = this.j;
                        boolean z42 = this.l;
                        if (ls1Var.d == 9) {
                        }
                        boolean z52 = ls1Var.j;
                        i6 = ls1Var.d;
                        if (i6 == 5) {
                        }
                        z = true;
                        z2 = z52 | z;
                        ls1Var.j = z2;
                        if (z2) {
                        }
                        long j52 = this.k;
                        if (this.j) {
                        }
                        this.d.c(i12);
                        ls1 ls1Var22 = this.i;
                        ls1Var22.d = i12;
                        ls1Var22.f = j52;
                        ls1Var22.e = j;
                        i8 = i4;
                        i9 = i3;
                        bArr3 = bArr2;
                    }
                }
                ss1Var = this.c;
                ss1Var.b();
                if (this.d.d(i2)) {
                }
                ls1Var = this.i;
                boolean z322 = this.j;
                boolean z422 = this.l;
                if (ls1Var.d == 9) {
                }
                boolean z522 = ls1Var.j;
                i6 = ls1Var.d;
                if (i6 == 5) {
                }
                z = true;
                z2 = z522 | z;
                ls1Var.j = z2;
                if (z2) {
                }
                long j522 = this.k;
                if (this.j) {
                }
                this.d.c(i12);
                ls1 ls1Var222 = this.i;
                ls1Var222.d = i12;
                ls1Var222.f = j522;
                ls1Var222.e = j;
                i8 = i4;
                i9 = i3;
                bArr3 = bArr2;
            }
            i3 = i9;
            bArr2 = bArr3;
            i4 = i11;
            if (this.d.d(i2)) {
            }
            ls1Var = this.i;
            boolean z3222 = this.j;
            boolean z4222 = this.l;
            if (ls1Var.d == 9) {
            }
            boolean z5222 = ls1Var.j;
            i6 = ls1Var.d;
            if (i6 == 5) {
            }
            z = true;
            z2 = z5222 | z;
            ls1Var.j = z2;
            if (z2) {
            }
            long j5222 = this.k;
            if (this.j) {
            }
            this.d.c(i12);
            ls1 ls1Var2222 = this.i;
            ls1Var2222.d = i12;
            ls1Var2222.f = j5222;
            ls1Var2222.e = j;
            i8 = i4;
            i9 = i3;
            bArr3 = bArr2;
        }
        int i16 = i9;
        byte[] bArr4 = bArr3;
        if (!this.j) {
            i = i16;
            bArr = bArr4;
            this.b.a(bArr, i8, i);
            this.c.a(bArr, i8, i);
        } else {
            i = i16;
            bArr = bArr4;
        }
        this.d.a(bArr, i8, i);
    }

    @Override // defpackage.fs1
    public final void d() {
    }

    @Override // defpackage.fs1
    public final void e(nk1 nk1Var, pt1 pt1Var) {
        pt1Var.a();
        pt1Var.b();
        this.g = pt1Var.e;
        pt1Var.b();
        pl1 q = nk1Var.q(pt1Var.d, 2);
        this.h = q;
        this.i = new ls1(q);
        this.a.a(nk1Var, pt1Var);
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
        this.l |= (i & 2) != 0;
    }
}