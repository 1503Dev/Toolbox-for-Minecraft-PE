package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: pg5  reason: default package */
public final class pg5 {
    public static final pg5 f = new pg5(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public pg5() {
        this(0, new int[8], new Object[8], true);
    }

    public pg5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static pg5 b() {
        return new pg5(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int q;
        int p;
        int i;
        int i2 = this.d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.a; i4++) {
                int i5 = this.b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.c[i4]).longValue();
                        i = qd5.p(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        Logger logger = qd5.R;
                        int o = ((gd5) this.c[i4]).o();
                        i = qd5.p(i6 << 3) + qd5.p(o) + o;
                    } else if (i7 == 3) {
                        int i8 = i6 << 3;
                        Logger logger2 = qd5.R;
                        q = ((pg5) this.c[i4]).a();
                        int p2 = qd5.p(i8);
                        p = p2 + p2;
                    } else if (i7 != 5) {
                        throw new IllegalStateException(te5.a());
                    } else {
                        ((Integer) this.c[i4]).intValue();
                        i = qd5.p(i6 << 3) + 4;
                    }
                    i3 = i + i3;
                } else {
                    int i9 = i6 << 3;
                    q = qd5.q(((Long) this.c[i4]).longValue());
                    p = qd5.p(i9);
                }
                i = p + q;
                i3 = i + i3;
            }
            this.d = i3;
            return i3;
        }
        return i2;
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            e(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(rd5 rd5Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    rd5Var.i(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(te5.a());
                                }
                            } else {
                                rd5Var.a.D(i4, 3);
                                ((pg5) obj).d(rd5Var);
                                rd5Var.a.D(i4, 4);
                            }
                        } else {
                            rd5Var.f(i4, (gd5) obj);
                        }
                    } else {
                        rd5Var.j(((Long) obj).longValue(), i4);
                    }
                } else {
                    rd5Var.n(((Long) obj).longValue(), i4);
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof pg5)) {
            pg5 pg5Var = (pg5) obj;
            int i = this.a;
            if (i == pg5Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = pg5Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = pg5Var.c;
                        int i3 = this.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }
}