package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ko1  reason: default package */
public final class ko1 {
    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static int b(byte[] bArr, int i, int i2) {
        int c = c(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return c;
        }
        while (true) {
            int length = bArr.length;
            if (c >= length - 1) {
                return length;
            }
            if ((c - i) % 2 == 0 && bArr[c + 1] == 0) {
                return c;
            }
            c = c(bArr, c + 1);
        }
    }

    public static int c(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static int d(int i, kh4 kh4Var) {
        byte[] bArr = kh4Var.a;
        int i2 = kh4Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2 + i) {
                if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                    System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                    i--;
                }
                i3 = i4;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x026c, code lost:
        if (r9 == 67) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04f0 A[Catch: all -> 0x0515, TRY_LEAVE, TryCatch #1 {all -> 0x0515, blocks: (B:238:0x04f0, B:127:0x0210, B:129:0x0233, B:131:0x023a, B:130:0x0236, B:148:0x026e, B:151:0x0282, B:158:0x02c3, B:160:0x02df, B:162:0x02e6, B:161:0x02e2, B:155:0x02a4, B:157:0x02bf, B:174:0x0309, B:181:0x034d, B:185:0x0381, B:189:0x038e, B:190:0x0394, B:192:0x0398, B:194:0x039f, B:195:0x03a3, B:204:0x03c9, B:208:0x03ee, B:210:0x03f8, B:211:0x0425, B:212:0x0431, B:214:0x0435, B:216:0x043c, B:217:0x0440, B:221:0x0455, B:230:0x047e, B:232:0x04b9, B:233:0x04c8, B:236:0x04df), top: B:250:0x00e7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lo1 e(int i, kh4 kh4Var, boolean z, int i2, v32 v32Var) {
        int i3;
        int o;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        boolean z6;
        boolean z7;
        long j;
        long j2;
        lo1 xn1Var;
        int c;
        String c2;
        byte[] copyOfRange;
        byte[] copyOfRange2;
        byte[] copyOfRange3;
        boolean z8;
        int n = kh4Var.n();
        int n2 = kh4Var.n();
        int n3 = kh4Var.n();
        if (i >= 3) {
            i3 = kh4Var.n();
        } else {
            i3 = 0;
        }
        if (i == 4) {
            o = kh4Var.p();
            if (!z) {
                o = ((o >> 24) << 21) | (o & 255) | (((o >> 8) & 255) << 7) | (((o >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            o = kh4Var.p();
        } else {
            o = kh4Var.o();
        }
        if (i >= 3) {
            i4 = kh4Var.q();
        } else {
            i4 = 0;
        }
        lo1 lo1Var = null;
        if (n != 0 || n2 != 0 || n3 != 0 || i3 != 0 || o != 0 || i4 != 0) {
            int i13 = kh4Var.b + o;
            if (i13 > kh4Var.c) {
                lb4.c("Id3Decoder", "Frame size exceeds remaining tag data");
            } else if (v32Var == null) {
                if (i == 3) {
                    if ((i4 & 128) != 0) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    if ((i4 & 64) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if ((i4 & 32) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z8;
                    z4 = false;
                    i6 = i5;
                } else if (i == 4) {
                    if ((i4 & 64) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i4 & 8) != 0) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    if ((i4 & 4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i4 & 2) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i14 = i4 & 1;
                    z2 = z5;
                    i5 = i14;
                } else {
                    i5 = 0;
                    z2 = false;
                    i6 = 0;
                    z3 = false;
                    z4 = false;
                }
                if (i6 == 0 && !z3) {
                    if (z2) {
                        kh4Var.f(1);
                        o--;
                    }
                    if (i5 != 0) {
                        kh4Var.f(4);
                        o -= 4;
                    }
                    if (z4) {
                        o = d(o, kh4Var);
                    }
                    try {
                        try {
                            if (n == 84 && n2 == 88 && n3 == 88 && (i == 2 || i3 == 88)) {
                                if (o > 0) {
                                    int n4 = kh4Var.n();
                                    int i15 = o - 1;
                                    byte[] bArr = new byte[i15];
                                    kh4Var.a(bArr, 0, i15);
                                    int b = b(bArr, 0, n4);
                                    lo1Var = new to1("TXXX", new String(bArr, 0, b, i(n4)), f(bArr, n4, b + a(n4)));
                                }
                            } else if (n == 84) {
                                String h = h(i, 84, n2, n3, i3);
                                if (o > 0) {
                                    int n5 = kh4Var.n();
                                    int i16 = o - 1;
                                    byte[] bArr2 = new byte[i16];
                                    kh4Var.a(bArr2, 0, i16);
                                    lo1Var = new to1(h, null, f(bArr2, n5, 0));
                                }
                            } else {
                                if (n == 87) {
                                    if (n2 == 88 && n3 == 88 && (i == 2 || i3 == 88)) {
                                        if (o > 0) {
                                            int n6 = kh4Var.n();
                                            int i17 = o - 1;
                                            byte[] bArr3 = new byte[i17];
                                            kh4Var.a(bArr3, 0, i17);
                                            int b2 = b(bArr3, 0, n6);
                                            String str2 = new String(bArr3, 0, b2, i(n6));
                                            int a = b2 + a(n6);
                                            lo1Var = new vo1("WXXX", str2, g(bArr3, a, c(bArr3, a), zs4.b));
                                        }
                                    } else {
                                        i8 = 87;
                                    }
                                } else {
                                    i8 = n;
                                }
                                if (i8 == 87) {
                                    String h2 = h(i, 87, n2, n3, i3);
                                    byte[] bArr4 = new byte[o];
                                    kh4Var.a(bArr4, 0, o);
                                    lo1Var = new vo1(h2, null, new String(bArr4, 0, c(bArr4, 0), zs4.b));
                                } else {
                                    if (i8 == 80) {
                                        if (n2 == 82 && n3 == 73 && i3 == 86) {
                                            byte[] bArr5 = new byte[o];
                                            kh4Var.a(bArr5, 0, o);
                                            int c3 = c(bArr5, 0);
                                            String str3 = new String(bArr5, 0, c3, zs4.b);
                                            int i18 = c3 + 1;
                                            if (o <= i18) {
                                                copyOfRange3 = zn4.f;
                                            } else {
                                                copyOfRange3 = Arrays.copyOfRange(bArr5, i18, o);
                                            }
                                            lo1Var = new ro1(str3, copyOfRange3);
                                        } else {
                                            i8 = 80;
                                        }
                                    }
                                    if (i8 == 71) {
                                        if (n2 == 69 && n3 == 79 && (i3 == 66 || i == 2)) {
                                            int n7 = kh4Var.n();
                                            Charset i19 = i(n7);
                                            int i20 = o - 1;
                                            byte[] bArr6 = new byte[i20];
                                            kh4Var.a(bArr6, 0, i20);
                                            int c4 = c(bArr6, 0);
                                            i7 = i13;
                                            String str4 = new String(bArr6, 0, c4, zs4.b);
                                            int i21 = c4 + 1;
                                            int b3 = b(bArr6, i21, n7);
                                            String g = g(bArr6, i21, b3, i19);
                                            int a2 = b3 + a(n7);
                                            int b4 = b(bArr6, a2, n7);
                                            String g2 = g(bArr6, a2, b4, i19);
                                            int a3 = b4 + a(n7);
                                            if (i20 <= a3) {
                                                copyOfRange2 = zn4.f;
                                            } else {
                                                copyOfRange2 = Arrays.copyOfRange(bArr6, a3, i20);
                                            }
                                            i9 = n;
                                            lo1Var = new do1(str4, g, g2, copyOfRange2);
                                            str = "Id3Decoder";
                                            i12 = n2;
                                            i11 = n3;
                                            i10 = i3;
                                            if (lo1Var == null) {
                                                lb4.c(str, "Failed to decode frame: id=" + h(i, i9, i12, i11, i10) + ", frameSize=" + o);
                                            }
                                            kh4Var.e(i7);
                                            return lo1Var;
                                        }
                                        i7 = i13;
                                        i8 = 71;
                                    } else {
                                        i7 = i13;
                                    }
                                    if (i == 2) {
                                        if (i8 == 80 && n2 == 73 && n3 == 67) {
                                            int n8 = kh4Var.n();
                                            Charset i22 = i(n8);
                                            int i23 = o - 1;
                                            byte[] bArr7 = new byte[i23];
                                            kh4Var.a(bArr7, 0, i23);
                                            if (i == 2) {
                                                str = "Id3Decoder";
                                                c2 = "image/".concat(String.valueOf(q05.c(new String(bArr7, 0, 3, zs4.b))));
                                                if ("image/jpg".equals(c2)) {
                                                    c2 = "image/jpeg";
                                                }
                                                c = 2;
                                            } else {
                                                str = "Id3Decoder";
                                                c = c(bArr7, 0);
                                                c2 = q05.c(new String(bArr7, 0, c, zs4.b));
                                                if (c2.indexOf(47) == -1) {
                                                    c2 = "image/".concat(c2);
                                                }
                                            }
                                            int i24 = bArr7[c + 1] & 255;
                                            int i25 = c + 2;
                                            int b5 = b(bArr7, i25, n8);
                                            i9 = n;
                                            String str5 = new String(bArr7, i25, b5 - i25, i22);
                                            int a4 = b5 + a(n8);
                                            if (i23 <= a4) {
                                                copyOfRange = zn4.f;
                                            } else {
                                                copyOfRange = Arrays.copyOfRange(bArr7, a4, i23);
                                            }
                                            xn1Var = new tn1(c2, str5, i24, copyOfRange);
                                            lo1Var = xn1Var;
                                            i12 = n2;
                                            i11 = n3;
                                            i10 = i3;
                                        }
                                        i9 = n;
                                        str = "Id3Decoder";
                                        if (i8 != 67 && n2 == 79 && n3 == 77 && (i3 == 77 || i == 2)) {
                                            if (o < 4) {
                                                i12 = n2;
                                                i11 = n3;
                                                i10 = i3;
                                                lo1Var = null;
                                            } else {
                                                int n9 = kh4Var.n();
                                                Charset i26 = i(n9);
                                                byte[] bArr8 = new byte[3];
                                                kh4Var.a(bArr8, 0, 3);
                                                String str6 = new String(bArr8, 0, 3);
                                                int i27 = o - 4;
                                                byte[] bArr9 = new byte[i27];
                                                kh4Var.a(bArr9, 0, i27);
                                                int b6 = b(bArr9, 0, n9);
                                                String str7 = new String(bArr9, 0, b6, i26);
                                                int a5 = b6 + a(n9);
                                                xn1Var = new bo1(str6, str7, g(bArr9, a5, b(bArr9, a5, n9), i26));
                                                lo1Var = xn1Var;
                                                i12 = n2;
                                                i11 = n3;
                                                i10 = i3;
                                            }
                                        } else if (i8 != 67 && n2 == 72 && n3 == 65 && i3 == 80) {
                                            int i28 = kh4Var.b;
                                            int c5 = c(kh4Var.a, i28);
                                            String str8 = new String(kh4Var.a, i28, c5 - i28, zs4.b);
                                            kh4Var.e(c5 + 1);
                                            int i29 = kh4Var.i();
                                            int i30 = kh4Var.i();
                                            long u = kh4Var.u();
                                            if (u == 4294967295L) {
                                                j = -1;
                                            } else {
                                                j = u;
                                            }
                                            long u2 = kh4Var.u();
                                            if (u2 == 4294967295L) {
                                                j2 = -1;
                                            } else {
                                                j2 = u2;
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            int i31 = i28 + o;
                                            while (kh4Var.b < i31) {
                                                lo1 e = e(i, kh4Var, z, i2, null);
                                                if (e != null) {
                                                    arrayList.add(e);
                                                }
                                            }
                                            xn1Var = new xn1(str8, i29, i30, j, j2, (lo1[]) arrayList.toArray(new lo1[0]));
                                            lo1Var = xn1Var;
                                            i12 = n2;
                                            i11 = n3;
                                            i10 = i3;
                                        } else if (i8 != 67 && n2 == 84 && n3 == 79 && i3 == 67) {
                                            int i32 = kh4Var.b;
                                            int c6 = c(kh4Var.a, i32);
                                            String str9 = new String(kh4Var.a, i32, c6 - i32, zs4.b);
                                            kh4Var.e(c6 + 1);
                                            int n10 = kh4Var.n();
                                            if ((n10 & 2) != 0) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            int i33 = n10 & 1;
                                            int n11 = kh4Var.n();
                                            String[] strArr = new String[n11];
                                            int i34 = 0;
                                            while (i34 < n11) {
                                                int i35 = kh4Var.b;
                                                int c7 = c(kh4Var.a, i35);
                                                strArr[i34] = new String(kh4Var.a, i35, c7 - i35, zs4.b);
                                                kh4Var.e(c7 + 1);
                                                i34++;
                                                n11 = n11;
                                                i3 = i3;
                                                n3 = n3;
                                                n2 = n2;
                                            }
                                            int i36 = n2;
                                            int i37 = n3;
                                            int i38 = i3;
                                            ArrayList arrayList2 = new ArrayList();
                                            int i39 = i32 + o;
                                            while (kh4Var.b < i39) {
                                                lo1 e2 = e(i, kh4Var, z, i2, null);
                                                if (e2 != null) {
                                                    arrayList2.add(e2);
                                                }
                                            }
                                            lo1[] lo1VarArr = (lo1[]) arrayList2.toArray(new lo1[0]);
                                            if (1 != i33) {
                                                z7 = false;
                                            } else {
                                                z7 = true;
                                            }
                                            lo1Var = new zn1(str9, z6, z7, strArr, lo1VarArr);
                                            i10 = i38;
                                            i11 = i37;
                                            i12 = i36;
                                        } else {
                                            int i40 = i3;
                                            if (i8 != 77) {
                                                i12 = n2;
                                                if (i12 == 76) {
                                                    i11 = n3;
                                                    i10 = i40;
                                                    if (i11 == 76 && i10 == 84) {
                                                        int q = kh4Var.q();
                                                        int o2 = kh4Var.o();
                                                        int o3 = kh4Var.o();
                                                        int n12 = kh4Var.n();
                                                        int n13 = kh4Var.n();
                                                        eh4 eh4Var = new eh4();
                                                        byte[] bArr10 = kh4Var.a;
                                                        int i41 = kh4Var.c;
                                                        eh4Var.a = bArr10;
                                                        eh4Var.b = 0;
                                                        eh4Var.c = 0;
                                                        eh4Var.d = i41;
                                                        eh4Var.e(kh4Var.b * 8);
                                                        int i42 = ((o - 10) * 8) / (n12 + n13);
                                                        int[] iArr = new int[i42];
                                                        int[] iArr2 = new int[i42];
                                                        for (int i43 = 0; i43 < i42; i43++) {
                                                            int b7 = eh4Var.b(n12);
                                                            int b8 = eh4Var.b(n13);
                                                            iArr[i43] = b7;
                                                            iArr2[i43] = b8;
                                                        }
                                                        lo1Var = new po1(q, o2, iArr, iArr2, o3);
                                                    }
                                                } else {
                                                    i10 = i40;
                                                    i11 = n3;
                                                }
                                            } else {
                                                i10 = i40;
                                                i11 = n3;
                                                i12 = n2;
                                            }
                                            String h3 = h(i, i8, i12, i11, i10);
                                            byte[] bArr11 = new byte[o];
                                            kh4Var.a(bArr11, 0, o);
                                            lo1Var = new vn1(h3, bArr11);
                                        }
                                    } else {
                                        if (i8 == 65) {
                                            if (n2 == 80) {
                                                if (n3 == 73) {
                                                }
                                            }
                                        }
                                        i9 = n;
                                        str = "Id3Decoder";
                                        if (i8 != 67) {
                                        }
                                        if (i8 != 67) {
                                        }
                                        if (i8 != 67) {
                                        }
                                        int i402 = i3;
                                        if (i8 != 77) {
                                        }
                                        String h32 = h(i, i8, i12, i11, i10);
                                        byte[] bArr112 = new byte[o];
                                        kh4Var.a(bArr112, 0, o);
                                        lo1Var = new vn1(h32, bArr112);
                                    }
                                    if (lo1Var == null) {
                                    }
                                    kh4Var.e(i7);
                                    return lo1Var;
                                }
                            }
                            i9 = n;
                            i12 = n2;
                            i11 = n3;
                            str = "Id3Decoder";
                            i10 = i3;
                            i7 = i13;
                            if (lo1Var == null) {
                            }
                            kh4Var.e(i7);
                            return lo1Var;
                        } catch (Throwable th) {
                            th = th;
                            i7 = i13;
                            kh4Var.e(i7);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        kh4Var.e(i7);
                        throw th;
                    }
                }
                lb4.c("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                kh4Var.e(i13);
                return null;
            } else {
                kh4Var.e(i13);
                return null;
            }
        }
        kh4Var.e(kh4Var.c);
        return null;
    }

    public static nw4 f(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return nv4.v("");
        }
        kv4 kv4Var = new kv4();
        while (true) {
            int b = b(bArr, i2, i);
            if (i2 >= b) {
                break;
            }
            kv4Var.p(new String(bArr, i2, b - i2, i(i)));
            i2 = a(i) + b;
        }
        nw4 s = kv4Var.s();
        if (s.isEmpty()) {
            return nv4.v("");
        }
        return s;
    }

    public static String g(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static String h(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static Charset i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zs4.b : zs4.c : zs4.d : zs4.f;
    }

    public static boolean j(kh4 kh4Var, int i, int i2, boolean z) {
        int o;
        long o2;
        int i3;
        int i4;
        int i5;
        int i6 = kh4Var.b;
        while (true) {
            try {
                int i7 = 1;
                if (kh4Var.c - kh4Var.b < i2) {
                    return true;
                }
                if (i >= 3) {
                    o = kh4Var.i();
                    o2 = kh4Var.u();
                    i3 = kh4Var.q();
                } else {
                    o = kh4Var.o();
                    o2 = kh4Var.o();
                    i3 = 0;
                }
                if (o == 0 && o2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & o2) != 0) {
                        return false;
                    }
                    long j = o2 & 255;
                    long j2 = o2 >> 8;
                    o2 = ((o2 >> 24) << 21) | (((o2 >> 16) & 255) << 14) | j | ((j2 & 255) << 7);
                }
                if (i == 4) {
                    if ((i3 & 64) == 0) {
                        i7 = 0;
                    }
                    int i8 = i7;
                    i7 = i3 & 1;
                    i5 = i8;
                } else {
                    if (i == 3) {
                        if ((i3 & 32) != 0) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        if ((i3 & 128) == 0) {
                            i4 = i5;
                        }
                    } else {
                        i4 = 0;
                    }
                    i5 = i4;
                    i7 = 0;
                }
                if (i7 != 0) {
                    i5 += 4;
                }
                if (o2 < i5) {
                    return false;
                }
                if (kh4Var.c - kh4Var.b < o2) {
                    return false;
                }
                kh4Var.f((int) o2);
            } finally {
                kh4Var.e(i6);
            }
        }
    }
}