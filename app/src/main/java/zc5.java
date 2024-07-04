package defpackage;

/* renamed from: zc5  reason: default package */
public final class zc5 {
    public static int a(byte[] bArr, int i, yc5 yc5Var) {
        int i2 = i(bArr, i, yc5Var);
        int i3 = yc5Var.a;
        if (i3 >= 0) {
            if (i3 <= bArr.length - i2) {
                if (i3 == 0) {
                    yc5Var.c = gd5.Q;
                    return i2;
                }
                yc5Var.c = gd5.G(bArr, i2, i3);
                return i2 + i3;
            }
            throw te5.f();
        }
        throw te5.d();
    }

    public static int b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(dg5 dg5Var, byte[] bArr, int i, int i2, int i3, yc5 yc5Var) {
        ie5 b = dg5Var.b();
        int m = m(b, dg5Var, bArr, i, i2, i3, yc5Var);
        dg5Var.a(b);
        yc5Var.c = b;
        return m;
    }

    public static int d(dg5 dg5Var, int i, byte[] bArr, int i2, int i3, qe5 qe5Var, yc5 yc5Var) {
        ie5 b = dg5Var.b();
        int n = n(b, dg5Var, bArr, i2, i3, yc5Var);
        dg5Var.a(b);
        yc5Var.c = b;
        while (true) {
            qe5Var.add(yc5Var.c);
            if (n >= i3) {
                break;
            }
            int i4 = i(bArr, n, yc5Var);
            if (i != yc5Var.a) {
                break;
            }
            ie5 b2 = dg5Var.b();
            int n2 = n(b2, dg5Var, bArr, i4, i3, yc5Var);
            dg5Var.a(b2);
            yc5Var.c = b2;
            n = n2;
        }
        return n;
    }

    public static int e(byte[] bArr, int i, qe5 qe5Var, yc5 yc5Var) {
        je5 je5Var = (je5) qe5Var;
        int i2 = i(bArr, i, yc5Var);
        int i3 = yc5Var.a + i2;
        while (i2 < i3) {
            i2 = i(bArr, i2, yc5Var);
            je5Var.h(yc5Var.a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw te5.f();
    }

    public static int f(byte[] bArr, int i, yc5 yc5Var) {
        int i2 = i(bArr, i, yc5Var);
        int i3 = yc5Var.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                yc5Var.c = "";
                return i2;
            }
            yc5Var.c = new String(bArr, i2, i3, re5.a);
            return i2 + i3;
        }
        throw te5.d();
    }

    public static int g(byte[] bArr, int i, yc5 yc5Var) {
        int i2 = i(bArr, i, yc5Var);
        int i3 = yc5Var.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                yc5Var.c = "";
                return i2;
            }
            yc5Var.c = dh5.a.b(bArr, i2, i3);
            return i2 + i3;
        }
        throw te5.d();
    }

    public static int h(int i, byte[] bArr, int i2, int i3, pg5 pg5Var, yc5 yc5Var) {
        Object G;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                pg5Var.c(i, Integer.valueOf(b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw new te5("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        pg5 b = pg5.b();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int i7 = i(bArr, i2, yc5Var);
                            int i8 = yc5Var.a;
                            i6 = i8;
                            if (i8 != i5) {
                                int h = h(i6, bArr, i7, i3, b, yc5Var);
                                i6 = i8;
                                i2 = h;
                            } else {
                                i2 = i7;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            pg5Var.c(i, b);
                            return i2;
                        }
                        throw te5.e();
                    }
                    int i9 = i(bArr, i2, yc5Var);
                    int i10 = yc5Var.a;
                    if (i10 >= 0) {
                        if (i10 <= bArr.length - i9) {
                            if (i10 == 0) {
                                G = gd5.Q;
                            } else {
                                G = gd5.G(bArr, i9, i10);
                            }
                            pg5Var.c(i, G);
                            return i9 + i10;
                        }
                        throw te5.f();
                    }
                    throw te5.d();
                }
                pg5Var.c(i, Long.valueOf(o(bArr, i2)));
                return i2 + 8;
            }
            int l = l(bArr, i2, yc5Var);
            pg5Var.c(i, Long.valueOf(yc5Var.b));
            return l;
        }
        throw new te5("Protocol message contained an invalid tag (zero).");
    }

    public static int i(byte[] bArr, int i, yc5 yc5Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            yc5Var.a = b;
            return i2;
        }
        return j(b, bArr, i2, yc5Var);
    }

    public static int j(int i, byte[] bArr, int i2, yc5 yc5Var) {
        int i3;
        int i4;
        byte b = bArr[i2];
        int i5 = i2 + 1;
        int i6 = i & 127;
        if (b < 0) {
            int i7 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i6 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i5 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i5 + 1;
                    byte b4 = bArr[i5];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                yc5Var.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            yc5Var.a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        yc5Var.a = i6 | i4;
        return i5;
    }

    public static int k(int i, byte[] bArr, int i2, int i3, qe5 qe5Var, yc5 yc5Var) {
        je5 je5Var = (je5) qe5Var;
        int i4 = i(bArr, i2, yc5Var);
        while (true) {
            je5Var.h(yc5Var.a);
            if (i4 >= i3) {
                break;
            }
            int i5 = i(bArr, i4, yc5Var);
            if (i != yc5Var.a) {
                break;
            }
            i4 = i(bArr, i5, yc5Var);
        }
        return i4;
    }

    public static int l(byte[] bArr, int i, yc5 yc5Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            yc5Var.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            i3 = i5;
            b = b2;
        }
        yc5Var.b = j2;
        return i3;
    }

    public static int m(Object obj, dg5 dg5Var, byte[] bArr, int i, int i2, int i3, yc5 yc5Var) {
        int F = ((qf5) dg5Var).F(obj, bArr, i, i2, i3, yc5Var);
        yc5Var.c = obj;
        return F;
    }

    public static int n(Object obj, dg5 dg5Var, byte[] bArr, int i, int i2, yc5 yc5Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = j(i4, bArr, i3, yc5Var);
            i4 = yc5Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw te5.f();
        }
        int i6 = i4 + i5;
        dg5Var.h(obj, bArr, i5, i6, yc5Var);
        yc5Var.c = obj;
        return i6;
    }

    public static long o(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}