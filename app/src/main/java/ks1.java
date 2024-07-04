package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: ks1  reason: default package */
public final class ks1 implements fs1 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final rt1 a;
    public js1 f;
    public long g;
    public String h;
    public pl1 i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final is1 d = new is1();
    public long k = -9223372036854775807L;
    public final ss1 e = new ss1(178);
    public final kh4 b = new kh4();

    public ks1(rt1 rt1Var) {
        this.a = rt1Var;
    }

    @Override // defpackage.fs1
    public final void b() {
        hl1.d(this.c);
        is1 is1Var = this.d;
        is1Var.a = false;
        is1Var.c = 0;
        is1Var.b = 0;
        js1 js1Var = this.f;
        if (js1Var != null) {
            js1Var.b = false;
            js1Var.c = false;
            js1Var.d = false;
            js1Var.e = -1;
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        float f;
        int i3;
        tv2.B(this.f);
        tv2.B(this.i);
        int i4 = kh4Var.b;
        int i5 = kh4Var.c;
        byte[] bArr = kh4Var.a;
        int i6 = i5 - i4;
        this.g += i6;
        this.i.a(i6, kh4Var);
        while (true) {
            int a = hl1.a(bArr, i4, i5, this.c);
            if (a == i5) {
                break;
            }
            int i7 = a + 3;
            int i8 = kh4Var.a[i7] & 255;
            int i9 = a - i4;
            if (!this.j) {
                if (i9 > 0) {
                    this.d.a(bArr, i4, a);
                }
                if (i9 < 0) {
                    i2 = -i9;
                } else {
                    i2 = 0;
                }
                is1 is1Var = this.d;
                int i10 = is1Var.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i8 == 179 || i8 == 181) {
                                    is1Var.c -= i2;
                                    is1Var.a = false;
                                    z3 = true;
                                    if (z3) {
                                        pl1 pl1Var = this.i;
                                        is1 is1Var2 = this.d;
                                        int i11 = is1Var2.d;
                                        String str = this.h;
                                        str.getClass();
                                        byte[] copyOf = Arrays.copyOf(is1Var2.e, is1Var2.c);
                                        eh4 eh4Var = new eh4(copyOf, copyOf.length);
                                        eh4Var.h(i11);
                                        eh4Var.h(4);
                                        eh4Var.f();
                                        eh4Var.g(8);
                                        if (eh4Var.i()) {
                                            eh4Var.g(4);
                                            eh4Var.g(3);
                                        }
                                        int b = eh4Var.b(4);
                                        if (b == 15) {
                                            int b2 = eh4Var.b(8);
                                            int b3 = eh4Var.b(8);
                                            if (b3 != 0) {
                                                f = b2 / b3;
                                                if (eh4Var.i()) {
                                                    eh4Var.g(2);
                                                    eh4Var.g(1);
                                                    if (eh4Var.i()) {
                                                        eh4Var.g(15);
                                                        eh4Var.f();
                                                        eh4Var.g(15);
                                                        eh4Var.f();
                                                        eh4Var.g(15);
                                                        eh4Var.f();
                                                        eh4Var.g(3);
                                                        eh4Var.g(11);
                                                        eh4Var.f();
                                                        eh4Var.g(15);
                                                        eh4Var.f();
                                                    }
                                                }
                                                if (eh4Var.b(2) != 0) {
                                                    lb4.c("H263Reader", "Unhandled video object layer shape");
                                                }
                                                eh4Var.f();
                                                int b4 = eh4Var.b(16);
                                                eh4Var.f();
                                                if (eh4Var.i()) {
                                                    if (b4 == 0) {
                                                        lb4.c("H263Reader", "Invalid vop_increment_time_resolution");
                                                    } else {
                                                        int i12 = b4 - 1;
                                                        int i13 = 0;
                                                        while (i12 > 0) {
                                                            i12 >>= 1;
                                                            i13++;
                                                        }
                                                        eh4Var.g(i13);
                                                    }
                                                }
                                                eh4Var.f();
                                                int b5 = eh4Var.b(13);
                                                eh4Var.f();
                                                int b6 = eh4Var.b(13);
                                                eh4Var.f();
                                                eh4Var.f();
                                                bs1 bs1Var = new bs1();
                                                bs1Var.a = str;
                                                bs1Var.j = "video/mp4v-es";
                                                bs1Var.o = b5;
                                                bs1Var.p = b6;
                                                bs1Var.s = f;
                                                bs1Var.l = Collections.singletonList(copyOf);
                                                pl1Var.e(new cu1(bs1Var));
                                                this.j = true;
                                            }
                                            lb4.c("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                            if (eh4Var.i()) {
                                            }
                                            if (eh4Var.b(2) != 0) {
                                            }
                                            eh4Var.f();
                                            int b42 = eh4Var.b(16);
                                            eh4Var.f();
                                            if (eh4Var.i()) {
                                            }
                                            eh4Var.f();
                                            int b52 = eh4Var.b(13);
                                            eh4Var.f();
                                            int b62 = eh4Var.b(13);
                                            eh4Var.f();
                                            eh4Var.f();
                                            bs1 bs1Var2 = new bs1();
                                            bs1Var2.a = str;
                                            bs1Var2.j = "video/mp4v-es";
                                            bs1Var2.o = b52;
                                            bs1Var2.p = b62;
                                            bs1Var2.s = f;
                                            bs1Var2.l = Collections.singletonList(copyOf);
                                            pl1Var.e(new cu1(bs1Var2));
                                            this.j = true;
                                        } else {
                                            if (b < 7) {
                                                f = l[b];
                                                if (eh4Var.i()) {
                                                }
                                                if (eh4Var.b(2) != 0) {
                                                }
                                                eh4Var.f();
                                                int b422 = eh4Var.b(16);
                                                eh4Var.f();
                                                if (eh4Var.i()) {
                                                }
                                                eh4Var.f();
                                                int b522 = eh4Var.b(13);
                                                eh4Var.f();
                                                int b622 = eh4Var.b(13);
                                                eh4Var.f();
                                                eh4Var.f();
                                                bs1 bs1Var22 = new bs1();
                                                bs1Var22.a = str;
                                                bs1Var22.j = "video/mp4v-es";
                                                bs1Var22.o = b522;
                                                bs1Var22.p = b622;
                                                bs1Var22.s = f;
                                                bs1Var22.l = Collections.singletonList(copyOf);
                                                pl1Var.e(new cu1(bs1Var22));
                                                this.j = true;
                                            }
                                            lb4.c("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                            if (eh4Var.i()) {
                                            }
                                            if (eh4Var.b(2) != 0) {
                                            }
                                            eh4Var.f();
                                            int b4222 = eh4Var.b(16);
                                            eh4Var.f();
                                            if (eh4Var.i()) {
                                            }
                                            eh4Var.f();
                                            int b5222 = eh4Var.b(13);
                                            eh4Var.f();
                                            int b6222 = eh4Var.b(13);
                                            eh4Var.f();
                                            eh4Var.f();
                                            bs1 bs1Var222 = new bs1();
                                            bs1Var222.a = str;
                                            bs1Var222.j = "video/mp4v-es";
                                            bs1Var222.o = b5222;
                                            bs1Var222.p = b6222;
                                            bs1Var222.s = f;
                                            bs1Var222.l = Collections.singletonList(copyOf);
                                            pl1Var.e(new cu1(bs1Var222));
                                            this.j = true;
                                        }
                                    }
                                }
                            } else {
                                if ((i8 & 240) == 32) {
                                    is1Var.d = is1Var.c;
                                    i3 = 4;
                                    is1Var.b = i3;
                                }
                                lb4.c("H263Reader", "Unexpected start code value");
                                is1Var.a = false;
                                is1Var.c = 0;
                                is1Var.b = 0;
                            }
                        } else {
                            if (i8 <= 31) {
                                i3 = 3;
                                is1Var.b = i3;
                            }
                            lb4.c("H263Reader", "Unexpected start code value");
                            is1Var.a = false;
                            is1Var.c = 0;
                            is1Var.b = 0;
                        }
                    } else {
                        if (i8 == 181) {
                            is1Var.b = 2;
                        }
                        lb4.c("H263Reader", "Unexpected start code value");
                        is1Var.a = false;
                        is1Var.c = 0;
                        is1Var.b = 0;
                    }
                } else if (i8 == 176) {
                    is1Var.b = 1;
                    is1Var.a = true;
                }
                is1Var.a(is1.f, 0, 3);
                z3 = false;
                if (z3) {
                }
            }
            this.f.a(bArr, i4, a);
            ss1 ss1Var = this.e;
            if (i9 > 0) {
                ss1Var.a(bArr, i4, a);
                i = 0;
            } else {
                i = -i9;
            }
            if (this.e.d(i)) {
                ss1 ss1Var2 = this.e;
                int b7 = hl1.b(ss1Var2.d, ss1Var2.e);
                kh4 kh4Var2 = this.b;
                int i14 = zn4.a;
                kh4Var2.c(this.e.d, b7);
                this.a.a(this.k, this.b);
            }
            if (i8 == 178) {
                z = true;
                if (kh4Var.a[a + 2] == 1) {
                    this.e.c(178);
                }
                i8 = 178;
            } else {
                z = true;
            }
            int i15 = i5 - a;
            long j = this.g - i15;
            js1 js1Var = this.f;
            boolean z4 = this.j;
            if (js1Var.e == 182 && z4 && js1Var.b) {
                long j2 = js1Var.h;
                if (j2 != -9223372036854775807L) {
                    js1Var.a.b(j2, js1Var.d ? 1 : 0, (int) (j - js1Var.g), i15, null);
                }
            }
            if (js1Var.e != 179) {
                js1Var.g = j;
            }
            js1 js1Var2 = this.f;
            long j3 = this.k;
            js1Var2.e = i8;
            js1Var2.d = false;
            if (i8 != 182) {
                if (i8 == 179) {
                    i8 = 179;
                } else {
                    z2 = false;
                    js1Var2.b = z2;
                    if (i8 == 182) {
                        z = false;
                    }
                    js1Var2.c = z;
                    js1Var2.f = 0;
                    js1Var2.h = j3;
                    i4 = i7;
                }
            }
            z2 = true;
            js1Var2.b = z2;
            if (i8 == 182) {
            }
            js1Var2.c = z;
            js1Var2.f = 0;
            js1Var2.h = j3;
            i4 = i7;
        }
        if (!this.j) {
            this.d.a(bArr, i4, i5);
        }
        this.f.a(bArr, i4, i5);
        this.e.a(bArr, i4, i5);
    }

    @Override // defpackage.fs1
    public final void d() {
    }

    @Override // defpackage.fs1
    public final void e(nk1 nk1Var, pt1 pt1Var) {
        pt1Var.a();
        pt1Var.b();
        this.h = pt1Var.e;
        pt1Var.b();
        pl1 q = nk1Var.q(pt1Var.d, 2);
        this.i = q;
        this.f = new js1(q);
        this.a.b(nk1Var, pt1Var);
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }
}