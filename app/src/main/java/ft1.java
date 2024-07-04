package defpackage;

import java.util.Arrays;

/* renamed from: ft1  reason: default package */
public final class ft1 implements qt1 {
    public final et1 a;
    public final kh4 b = new kh4(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public ft1(et1 et1Var) {
        this.a = et1Var;
    }

    @Override // defpackage.qt1
    public final void a(km4 km4Var, nk1 nk1Var, pt1 pt1Var) {
        this.a.a(km4Var, nk1Var, pt1Var);
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
        if (r12.e == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r3 = r12.b.a;
        r6 = 0;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
        if (r6 >= r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        r7 = defpackage.zn4.k[(r7 >>> 24) ^ (r3[r6] & 255)] ^ (r7 << 8);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
        r2 = defpackage.zn4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (r7 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r12.f = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
        r12.b.d(r12.c - 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
        r12.b.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
        r12.b.e(0);
        r12.a.c(r12.b);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x001e -> B:13:0x0020). Please submit an issue!!! */
    @Override // defpackage.qt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, kh4 kh4Var) {
        int i2;
        ft1 ft1Var;
        int i3;
        boolean z;
        int i4 = i & 1;
        if (i4 != 0) {
            i2 = kh4Var.b + kh4Var.n();
        } else {
            i2 = -1;
        }
        if (!this.f) {
            ft1Var = this;
            while (true) {
                i3 = kh4Var.c - kh4Var.b;
                if (i3 > 0) {
                    int i5 = ft1Var.d;
                    if (i5 < 3) {
                        if (i5 == 0) {
                            int n = kh4Var.n();
                            kh4Var.e(kh4Var.b - 1);
                            if (n == 255) {
                                ft1Var.f = true;
                                return;
                            }
                        }
                        int min = Math.min(kh4Var.c - kh4Var.b, 3 - ft1Var.d);
                        kh4Var.a(ft1Var.b.a, ft1Var.d, min);
                        int i6 = ft1Var.d + min;
                        ft1Var.d = i6;
                        if (i6 == 3) {
                            ft1Var.b.e(0);
                            ft1Var.b.d(3);
                            ft1Var.b.f(1);
                            int n2 = ft1Var.b.n();
                            int n3 = ft1Var.b.n();
                            if ((n2 & 128) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ft1Var.e = z;
                            int i7 = (((n2 & 15) << 8) | n3) + 3;
                            ft1Var.c = i7;
                            byte[] bArr = ft1Var.b.a;
                            if (bArr.length < i7) {
                                int length = bArr.length;
                                int min2 = Math.min(4098, Math.max(i7, length + length));
                                kh4 kh4Var2 = ft1Var.b;
                                byte[] bArr2 = kh4Var2.a;
                                if (min2 > bArr2.length) {
                                    kh4Var2.a = Arrays.copyOf(bArr2, min2);
                                }
                            }
                        }
                    } else {
                        int min3 = Math.min(i3, ft1Var.c - i5);
                        kh4Var.a(ft1Var.b.a, ft1Var.d, min3);
                        int i8 = ft1Var.d + min3;
                        ft1Var.d = i8;
                        int i9 = ft1Var.c;
                        if (i8 == i9) {
                            break;
                        }
                    }
                } else {
                    return;
                }
            }
        } else if (i4 == 0) {
        } else {
            this.f = false;
            kh4Var.e(i2);
            ft1Var = this;
            ft1Var.d = 0;
            while (true) {
                i3 = kh4Var.c - kh4Var.b;
                if (i3 > 0) {
                }
            }
        }
    }

    @Override // defpackage.qt1
    public final void d() {
        this.f = true;
    }
}