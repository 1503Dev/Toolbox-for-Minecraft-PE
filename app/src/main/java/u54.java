package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: u54  reason: default package */
public final class u54 {
    public static final u54 f = new u54(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public u54() {
        this(0, new int[8], new Object[8], true);
    }

    public u54(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static u54 b() {
        return new u54(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int d0;
        int c0;
        int i;
        int i2 = this.d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.a; i4++) {
                int i5 = this.b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.c[i4]).intValue();
                                    i = hg2.c0(i6 << 3) + 4;
                                } else {
                                    int i8 = p33.P;
                                    throw new IllegalStateException(new y23());
                                }
                            } else {
                                int i9 = i6 << 3;
                                Logger logger = hg2.R;
                                d0 = ((u54) this.c[i4]).a();
                                int c02 = hg2.c0(i9);
                                c0 = c02 + c02;
                            }
                        } else {
                            Logger logger2 = hg2.R;
                            int m = ((y82) this.c[i4]).m();
                            i = hg2.c0(i6 << 3) + hg2.c0(m) + m;
                        }
                    } else {
                        ((Long) this.c[i4]).longValue();
                        i = hg2.c0(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i10 = i6 << 3;
                    d0 = hg2.d0(((Long) this.c[i4]).longValue());
                    c0 = hg2.c0(i10);
                }
                i = c0 + d0;
                i3 += i;
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

    public final void d(eh2 eh2Var) {
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
                                    eh2Var.i(i4, ((Integer) obj).intValue());
                                } else {
                                    int i5 = p33.P;
                                    throw new RuntimeException(new y23());
                                }
                            } else {
                                eh2Var.a.U(i4, 3);
                                ((u54) obj).d(eh2Var);
                                eh2Var.a.U(i4, 4);
                            }
                        } else {
                            eh2Var.f(i4, (y82) obj);
                        }
                    } else {
                        eh2Var.j(((Long) obj).longValue(), i4);
                    }
                } else {
                    eh2Var.n(((Long) obj).longValue(), i4);
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
        if (obj != null && (obj instanceof u54)) {
            u54 u54Var = (u54) obj;
            int i = this.a;
            if (i == u54Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = u54Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = u54Var.c;
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