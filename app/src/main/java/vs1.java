package defpackage;

/* renamed from: vs1  reason: default package */
public final class vs1 implements m16, v64 {
    public final Object P;
    public final Object Q;

    public /* synthetic */ vs1(io5 io5Var, tk5 tk5Var) {
        this.P = io5Var;
        this.Q = tk5Var;
    }

    public /* synthetic */ vs1(km4 km4Var) {
        this.P = km4Var;
        this.Q = new kh4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return defpackage.l16.a(r5 + r1);
     */
    @Override // defpackage.m16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l16 a(p16 p16Var, long j) {
        int d;
        long j2;
        long j3 = p16Var.d;
        int min = (int) Math.min(20000L, p16Var.c - j3);
        ((kh4) this.Q).b(min);
        p16Var.B(((kh4) this.Q).a, 0, min, false);
        kh4 kh4Var = (kh4) this.Q;
        int i = -1;
        long j4 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            int i3 = kh4Var.c;
            int i4 = kh4Var.b;
            if (i3 - i4 >= 4) {
                if (ws1.d(kh4Var.a, i4) != 442) {
                    kh4Var.f(1);
                } else {
                    kh4Var.f(4);
                    long a = xs1.a(kh4Var);
                    if (a != -9223372036854775807L) {
                        long b = ((km4) this.P).b(a);
                        if (b > j) {
                            if (j4 == -9223372036854775807L) {
                                return new l16(b, -1, j3);
                            }
                            j2 = i2;
                        } else if (100000 + b > j) {
                            j2 = kh4Var.b;
                            break;
                        } else {
                            i2 = kh4Var.b;
                            j4 = b;
                        }
                    }
                    int i5 = kh4Var.c;
                    if (i5 - kh4Var.b >= 10) {
                        kh4Var.f(9);
                        int n = kh4Var.n() & 7;
                        if (kh4Var.c - kh4Var.b >= n) {
                            kh4Var.f(n);
                            int i6 = kh4Var.c;
                            int i7 = kh4Var.b;
                            if (i6 - i7 >= 4) {
                                if (ws1.d(kh4Var.a, i7) == 443) {
                                    kh4Var.f(4);
                                    int q = kh4Var.q();
                                    if (kh4Var.c - kh4Var.b >= q) {
                                        kh4Var.f(q);
                                    }
                                }
                                while (true) {
                                    int i8 = kh4Var.c;
                                    int i9 = kh4Var.b;
                                    if (i8 - i9 < 4 || (d = ws1.d(kh4Var.a, i9)) == 442 || d == 441 || (d >>> 8) != 1) {
                                        break;
                                    }
                                    kh4Var.f(4);
                                    if (kh4Var.c - kh4Var.b < 2) {
                                        break;
                                    }
                                    kh4Var.e(Math.min(kh4Var.c, kh4Var.b + kh4Var.q()));
                                }
                                i = kh4Var.b;
                            }
                        }
                    }
                    kh4Var.e(i5);
                    i = kh4Var.b;
                }
            } else if (j4 != -9223372036854775807L) {
                return new l16(j4, -2, j3 + i);
            } else {
                return l16.d;
            }
        }
    }

    @Override // defpackage.m16
    public final void c() {
        byte[] bArr = zn4.f;
        int length = bArr.length;
        ((kh4) this.Q).c(bArr, 0);
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        ((jo5) obj).j((e03) this.Q);
    }
}