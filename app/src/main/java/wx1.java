package defpackage;

/* renamed from: wx1  reason: default package */
public final class wx1 {
    public static int a(byte[] bArr, int i, bx1 bx1Var) {
        int i2 = i(bArr, i, bx1Var);
        int i3 = bx1Var.a;
        if (i3 >= 0) {
            if (i3 <= bArr.length - i2) {
                if (i3 == 0) {
                    bx1Var.c = y82.Q;
                    return i2;
                }
                bx1Var.c = y82.t(bArr, i2, i3);
                return i2 + i3;
            }
            throw p33.d();
        }
        throw p33.b();
    }

    public static int b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(lr3 lr3Var, byte[] bArr, int i, int i2, int i3, bx1 bx1Var) {
        ox2 b = lr3Var.b();
        int m = m(b, lr3Var, bArr, i, i2, i3, bx1Var);
        lr3Var.a(b);
        bx1Var.c = b;
        return m;
    }

    public static int d(lr3 lr3Var, int i, byte[] bArr, int i2, int i3, b13 b13Var, bx1 bx1Var) {
        ox2 b = lr3Var.b();
        int n = n(b, lr3Var, bArr, i2, i3, bx1Var);
        lr3Var.a(b);
        bx1Var.c = b;
        while (true) {
            b13Var.add(bx1Var.c);
            if (n >= i3) {
                break;
            }
            int i4 = i(bArr, n, bx1Var);
            if (i != bx1Var.a) {
                break;
            }
            ox2 b2 = lr3Var.b();
            int n2 = n(b2, lr3Var, bArr, i4, i3, bx1Var);
            lr3Var.a(b2);
            bx1Var.c = b2;
            n = n2;
        }
        return n;
    }

    public static int e(byte[] bArr, int i, b13 b13Var, bx1 bx1Var) {
        ly2 ly2Var = (ly2) b13Var;
        int i2 = i(bArr, i, bx1Var);
        int i3 = bx1Var.a + i2;
        while (i2 < i3) {
            i2 = i(bArr, i2, bx1Var);
            ly2Var.h(bx1Var.a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw p33.d();
    }

    public static int f(byte[] bArr, int i, bx1 bx1Var) {
        int i2 = i(bArr, i, bx1Var);
        int i3 = bx1Var.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                bx1Var.c = "";
                return i2;
            }
            bx1Var.c = new String(bArr, i2, i3, z13.a);
            return i2 + i3;
        }
        throw p33.b();
    }

    public static int g(byte[] bArr, int i, bx1 bx1Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = i(bArr, i, bx1Var);
        int i3 = bx1Var.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                bx1Var.c = "";
                return i2;
            }
            ie4 ie4Var = nf4.a;
            int length = bArr.length;
            if ((((length - i2) - i3) | i2 | i3) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (i2 < i4) {
                    byte b = bArr[i2];
                    if (b >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        break;
                    }
                    i2++;
                    cArr[i5] = (char) b;
                    i5++;
                }
                while (i2 < i4) {
                    int i6 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (b2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        i2 = i6;
                        while (true) {
                            i5 = i7;
                            if (i2 >= i4) {
                                break;
                            }
                            byte b3 = bArr[i2];
                            if (b3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                i2++;
                                i7 = i5 + 1;
                                cArr[i5] = (char) b3;
                            }
                        }
                    } else if (b2 < -32) {
                        if (i6 < i4) {
                            int i8 = i6 + 1;
                            byte b4 = bArr[i6];
                            int i9 = i5 + 1;
                            if (b2 >= -62 && !ea2.K(b4)) {
                                cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                                i2 = i8;
                                i5 = i9;
                            } else {
                                throw p33.a();
                            }
                        } else {
                            throw p33.a();
                        }
                    } else if (b2 < -16) {
                        if (i6 < i4 - 1) {
                            int i10 = i6 + 1;
                            byte b5 = bArr[i6];
                            int i11 = i10 + 1;
                            byte b6 = bArr[i10];
                            int i12 = i5 + 1;
                            if (!ea2.K(b5)) {
                                if (b2 == -32) {
                                    if (b5 >= -96) {
                                        b2 = -32;
                                    }
                                }
                                if (b2 == -19) {
                                    if (b5 < -96) {
                                        b2 = -19;
                                    }
                                }
                                if (!ea2.K(b6)) {
                                    cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i2 = i11;
                                    i5 = i12;
                                }
                            }
                            throw p33.a();
                        }
                        throw p33.a();
                    } else if (i6 < i4 - 2) {
                        int i13 = i6 + 1;
                        byte b7 = bArr[i6];
                        int i14 = i13 + 1;
                        byte b8 = bArr[i13];
                        int i15 = i14 + 1;
                        byte b9 = bArr[i14];
                        if (!ea2.K(b7) && (((b7 + 112) + (b2 << 28)) >> 30) == 0 && !ea2.K(b8) && !ea2.K(b9)) {
                            int i16 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                            cArr[i5] = (char) ((i16 >>> 10) + 55232);
                            cArr[i5 + 1] = (char) ((i16 & 1023) + 56320);
                            i5 += 2;
                            i2 = i15;
                        } else {
                            throw p33.a();
                        }
                    } else {
                        throw p33.a();
                    }
                }
                bx1Var.c = new String(cArr, 0, i5);
                return i4;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw p33.b();
    }

    public static int h(int i, byte[] bArr, int i2, int i3, u54 u54Var, bx1 bx1Var) {
        Object t;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                u54Var.c(i, Integer.valueOf(b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw new p33("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        u54 b = u54.b();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int i7 = i(bArr, i2, bx1Var);
                            int i8 = bx1Var.a;
                            i6 = i8;
                            if (i8 != i5) {
                                int h = h(i6, bArr, i7, i3, b, bx1Var);
                                i6 = i8;
                                i2 = h;
                            } else {
                                i2 = i7;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            u54Var.c(i, b);
                            return i2;
                        }
                        throw p33.c();
                    }
                    int i9 = i(bArr, i2, bx1Var);
                    int i10 = bx1Var.a;
                    if (i10 >= 0) {
                        if (i10 <= bArr.length - i9) {
                            if (i10 == 0) {
                                t = y82.Q;
                            } else {
                                t = y82.t(bArr, i9, i10);
                            }
                            u54Var.c(i, t);
                            return i9 + i10;
                        }
                        throw p33.d();
                    }
                    throw p33.b();
                }
                u54Var.c(i, Long.valueOf(o(bArr, i2)));
                return i2 + 8;
            }
            int l = l(bArr, i2, bx1Var);
            u54Var.c(i, Long.valueOf(bx1Var.b));
            return l;
        }
        throw new p33("Protocol message contained an invalid tag (zero).");
    }

    public static int i(byte[] bArr, int i, bx1 bx1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            bx1Var.a = b;
            return i2;
        }
        return j(b, bArr, i2, bx1Var);
    }

    public static int j(int i, byte[] bArr, int i2, bx1 bx1Var) {
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
                                bx1Var.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            bx1Var.a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        bx1Var.a = i6 | i4;
        return i5;
    }

    public static int k(int i, byte[] bArr, int i2, int i3, b13 b13Var, bx1 bx1Var) {
        ly2 ly2Var = (ly2) b13Var;
        int i4 = i(bArr, i2, bx1Var);
        while (true) {
            ly2Var.h(bx1Var.a);
            if (i4 >= i3) {
                break;
            }
            int i5 = i(bArr, i4, bx1Var);
            if (i != bx1Var.a) {
                break;
            }
            i4 = i(bArr, i5, bx1Var);
        }
        return i4;
    }

    public static int l(byte[] bArr, int i, bx1 bx1Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            bx1Var.b = j;
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
        bx1Var.b = j2;
        return i3;
    }

    public static int m(Object obj, lr3 lr3Var, byte[] bArr, int i, int i2, int i3, bx1 bx1Var) {
        int A = ((hm3) lr3Var).A(obj, bArr, i, i2, i3, bx1Var);
        bx1Var.c = obj;
        return A;
    }

    public static int n(Object obj, lr3 lr3Var, byte[] bArr, int i, int i2, bx1 bx1Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = j(i4, bArr, i3, bx1Var);
            i4 = bx1Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw p33.d();
        }
        int i6 = i4 + i5;
        lr3Var.i(obj, bArr, i5, i6, bx1Var);
        bx1Var.c = obj;
        return i6;
    }

    public static long o(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}