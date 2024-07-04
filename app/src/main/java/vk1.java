package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: vk1  reason: default package */
public final class vk1 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public vk1(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0347 A[Catch: ArrayIndexOutOfBoundsException -> 0x03d7, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x03d7, blocks: (B:3:0x0004, B:6:0x0019, B:8:0x0023, B:9:0x0030, B:10:0x0033, B:12:0x0040, B:14:0x004d, B:17:0x0068, B:20:0x0091, B:22:0x0097, B:23:0x009c, B:24:0x009f, B:27:0x00a6, B:28:0x00af, B:30:0x00b7, B:32:0x00bd, B:33:0x00bf, B:35:0x00c5, B:36:0x00c7, B:37:0x00ca, B:39:0x00cf, B:40:0x00d5, B:42:0x00df, B:43:0x00e3, B:45:0x00ef, B:46:0x00fc, B:51:0x0112, B:52:0x011e, B:54:0x0136, B:62:0x0144, B:64:0x014a, B:75:0x0179, B:65:0x0152, B:67:0x0167, B:70:0x016d, B:76:0x017f, B:77:0x0189, B:79:0x0198, B:80:0x01a6, B:83:0x01ba, B:85:0x01c0, B:87:0x01e1, B:89:0x01e7, B:91:0x01f2, B:90:0x01ee, B:92:0x01f5, B:93:0x01ff, B:95:0x0203, B:97:0x0209, B:99:0x020f, B:100:0x0215, B:102:0x021a, B:104:0x021e, B:107:0x022b, B:109:0x0231, B:111:0x0235, B:112:0x023b, B:113:0x023e, B:115:0x0248, B:117:0x024e, B:119:0x0252, B:120:0x0258, B:122:0x025d, B:124:0x0261, B:127:0x026c, B:129:0x0272, B:131:0x0278, B:132:0x027e, B:133:0x0281, B:141:0x02c6, B:134:0x028a, B:136:0x02a1, B:137:0x02af, B:139:0x02b4, B:142:0x02d6, B:145:0x02e5, B:147:0x02eb, B:148:0x02f4, B:150:0x02fe, B:152:0x0304, B:154:0x030e, B:157:0x031c, B:163:0x0341, B:165:0x0347, B:166:0x034a, B:168:0x0350, B:170:0x035a, B:171:0x035f, B:173:0x0365, B:174:0x036b, B:176:0x0374, B:178:0x038d, B:160:0x0324, B:161:0x0329, B:179:0x03ac, B:182:0x03c5, B:184:0x03ce, B:183:0x03ca), top: B:190:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0350 A[Catch: ArrayIndexOutOfBoundsException -> 0x03d7, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x03d7, blocks: (B:3:0x0004, B:6:0x0019, B:8:0x0023, B:9:0x0030, B:10:0x0033, B:12:0x0040, B:14:0x004d, B:17:0x0068, B:20:0x0091, B:22:0x0097, B:23:0x009c, B:24:0x009f, B:27:0x00a6, B:28:0x00af, B:30:0x00b7, B:32:0x00bd, B:33:0x00bf, B:35:0x00c5, B:36:0x00c7, B:37:0x00ca, B:39:0x00cf, B:40:0x00d5, B:42:0x00df, B:43:0x00e3, B:45:0x00ef, B:46:0x00fc, B:51:0x0112, B:52:0x011e, B:54:0x0136, B:62:0x0144, B:64:0x014a, B:75:0x0179, B:65:0x0152, B:67:0x0167, B:70:0x016d, B:76:0x017f, B:77:0x0189, B:79:0x0198, B:80:0x01a6, B:83:0x01ba, B:85:0x01c0, B:87:0x01e1, B:89:0x01e7, B:91:0x01f2, B:90:0x01ee, B:92:0x01f5, B:93:0x01ff, B:95:0x0203, B:97:0x0209, B:99:0x020f, B:100:0x0215, B:102:0x021a, B:104:0x021e, B:107:0x022b, B:109:0x0231, B:111:0x0235, B:112:0x023b, B:113:0x023e, B:115:0x0248, B:117:0x024e, B:119:0x0252, B:120:0x0258, B:122:0x025d, B:124:0x0261, B:127:0x026c, B:129:0x0272, B:131:0x0278, B:132:0x027e, B:133:0x0281, B:141:0x02c6, B:134:0x028a, B:136:0x02a1, B:137:0x02af, B:139:0x02b4, B:142:0x02d6, B:145:0x02e5, B:147:0x02eb, B:148:0x02f4, B:150:0x02fe, B:152:0x0304, B:154:0x030e, B:157:0x031c, B:163:0x0341, B:165:0x0347, B:166:0x034a, B:168:0x0350, B:170:0x035a, B:171:0x035f, B:173:0x0365, B:174:0x036b, B:176:0x0374, B:178:0x038d, B:160:0x0324, B:161:0x0329, B:179:0x03ac, B:182:0x03c5, B:184:0x03ce, B:183:0x03ca), top: B:190:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0365 A[Catch: ArrayIndexOutOfBoundsException -> 0x03d7, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x03d7, blocks: (B:3:0x0004, B:6:0x0019, B:8:0x0023, B:9:0x0030, B:10:0x0033, B:12:0x0040, B:14:0x004d, B:17:0x0068, B:20:0x0091, B:22:0x0097, B:23:0x009c, B:24:0x009f, B:27:0x00a6, B:28:0x00af, B:30:0x00b7, B:32:0x00bd, B:33:0x00bf, B:35:0x00c5, B:36:0x00c7, B:37:0x00ca, B:39:0x00cf, B:40:0x00d5, B:42:0x00df, B:43:0x00e3, B:45:0x00ef, B:46:0x00fc, B:51:0x0112, B:52:0x011e, B:54:0x0136, B:62:0x0144, B:64:0x014a, B:75:0x0179, B:65:0x0152, B:67:0x0167, B:70:0x016d, B:76:0x017f, B:77:0x0189, B:79:0x0198, B:80:0x01a6, B:83:0x01ba, B:85:0x01c0, B:87:0x01e1, B:89:0x01e7, B:91:0x01f2, B:90:0x01ee, B:92:0x01f5, B:93:0x01ff, B:95:0x0203, B:97:0x0209, B:99:0x020f, B:100:0x0215, B:102:0x021a, B:104:0x021e, B:107:0x022b, B:109:0x0231, B:111:0x0235, B:112:0x023b, B:113:0x023e, B:115:0x0248, B:117:0x024e, B:119:0x0252, B:120:0x0258, B:122:0x025d, B:124:0x0261, B:127:0x026c, B:129:0x0272, B:131:0x0278, B:132:0x027e, B:133:0x0281, B:141:0x02c6, B:134:0x028a, B:136:0x02a1, B:137:0x02af, B:139:0x02b4, B:142:0x02d6, B:145:0x02e5, B:147:0x02eb, B:148:0x02f4, B:150:0x02fe, B:152:0x0304, B:154:0x030e, B:157:0x031c, B:163:0x0341, B:165:0x0347, B:166:0x034a, B:168:0x0350, B:170:0x035a, B:171:0x035f, B:173:0x0365, B:174:0x036b, B:176:0x0374, B:178:0x038d, B:160:0x0324, B:161:0x0329, B:179:0x03ac, B:182:0x03c5, B:184:0x03ce, B:183:0x03ca), top: B:190:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vk1 a(kh4 kh4Var) {
        List singletonList;
        int i;
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            kh4Var.f(21);
            int n = kh4Var.n() & 3;
            int n2 = kh4Var.n();
            int i16 = kh4Var.b;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < n2; i19++) {
                kh4Var.f(1);
                int q = kh4Var.q();
                for (int i20 = 0; i20 < q; i20++) {
                    int q2 = kh4Var.q();
                    i18 += q2 + 4;
                    kh4Var.f(q2);
                }
            }
            kh4Var.e(i16);
            byte[] bArr3 = new byte[i18];
            String str = null;
            kh4 kh4Var2 = kh4Var;
            int i21 = 0;
            float f2 = 1.0f;
            int i22 = 0;
            while (i21 < n2) {
                int n3 = kh4Var.n() & 63;
                int q3 = kh4Var.q();
                int i23 = 0;
                while (i23 < q3) {
                    int q4 = kh4Var.q();
                    int i24 = n2;
                    System.arraycopy(hl1.a, i17, bArr3, i22, 4);
                    int i25 = i22 + 4;
                    System.arraycopy(kh4Var2.a, kh4Var2.b, bArr3, i25, q4);
                    if (n3 == 33 && i23 == 0) {
                        il1 il1Var = new il1(bArr3, i25 + 2, i25 + q4);
                        il1Var.d(4);
                        int a = il1Var.a(3);
                        il1Var.c();
                        int a2 = il1Var.a(2);
                        boolean e = il1Var.e();
                        int a3 = il1Var.a(5);
                        int i26 = 0;
                        for (int i27 = 0; i27 < 32; i27++) {
                            if (il1Var.e()) {
                                i26 |= 1 << i27;
                            }
                        }
                        int[] iArr = new int[6];
                        while (i17 < 6) {
                            iArr[i17] = il1Var.a(8);
                            i17++;
                        }
                        int a4 = il1Var.a(8);
                        int i28 = 0;
                        for (int i29 = 0; i29 < a; i29++) {
                            if (il1Var.e()) {
                                i28 += 89;
                            }
                            if (il1Var.e()) {
                                i28 += 8;
                            }
                        }
                        il1Var.d(i28);
                        if (a > 0) {
                            int i30 = 8 - a;
                            il1Var.d(i30 + i30);
                        }
                        il1Var.f();
                        if (il1Var.f() == 3) {
                            il1Var.c();
                        }
                        il1Var.f();
                        il1Var.f();
                        if (il1Var.e()) {
                            il1Var.f();
                            il1Var.f();
                            il1Var.f();
                            il1Var.f();
                        }
                        il1Var.f();
                        il1Var.f();
                        int f3 = il1Var.f();
                        if (true != il1Var.e()) {
                            i7 = a;
                        } else {
                            i7 = 0;
                        }
                        while (i7 <= a) {
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
                            while (i31 < 4) {
                                int i32 = 0;
                                while (i32 < 6) {
                                    if (!il1Var.e()) {
                                        il1Var.f();
                                        i13 = n3;
                                        i14 = q3;
                                    } else {
                                        i13 = n3;
                                        i14 = q3;
                                        int min = Math.min(64, 1 << ((i31 + i31) + 4));
                                        if (i31 > 1) {
                                            il1Var.b();
                                        }
                                        for (int i33 = 0; i33 < min; i33++) {
                                            il1Var.b();
                                        }
                                    }
                                    if (i31 == 3) {
                                        i15 = 3;
                                    } else {
                                        i15 = 1;
                                    }
                                    i32 += i15;
                                    n3 = i13;
                                    q3 = i14;
                                }
                                i31++;
                                n3 = n3;
                            }
                        }
                        i5 = n3;
                        i6 = q3;
                        il1Var.d(2);
                        if (il1Var.e()) {
                            il1Var.d(8);
                            il1Var.f();
                            il1Var.f();
                            il1Var.c();
                        }
                        int f4 = il1Var.f();
                        int[] iArr2 = new int[0];
                        int[] iArr3 = new int[0];
                        i = n;
                        int i34 = 0;
                        int i35 = -1;
                        int i36 = -1;
                        while (i34 < f4) {
                            if (i34 != 0 && il1Var.e()) {
                                i8 = f4;
                                int i37 = i35 + i36;
                                boolean e2 = il1Var.e();
                                int f5 = il1Var.f() + 1;
                                int i38 = 1 - ((e2 ? 1 : 0) + (e2 ? 1 : 0));
                                bArr2 = bArr3;
                                int i39 = i37 + 1;
                                i9 = i18;
                                boolean[] zArr = new boolean[i39];
                                i11 = i21;
                                for (int i40 = 0; i40 <= i37; i40++) {
                                    if (!il1Var.e()) {
                                        zArr[i40] = il1Var.e();
                                    } else {
                                        zArr[i40] = true;
                                    }
                                }
                                int i41 = i36 - 1;
                                int[] iArr4 = new int[i39];
                                int[] iArr5 = new int[i39];
                                int i42 = 0;
                                while (true) {
                                    i12 = i38 * f5;
                                    if (i41 < 0) {
                                        break;
                                    }
                                    int i43 = iArr3[i41] + i12;
                                    if (i43 < 0 && zArr[i35 + i41]) {
                                        iArr4[i42] = i43;
                                        i42++;
                                    }
                                    i41--;
                                }
                                if (i12 < 0 && zArr[i37]) {
                                    iArr4[i42] = i12;
                                    i42++;
                                }
                                i10 = q4;
                                int i44 = i42;
                                for (int i45 = 0; i45 < i35; i45++) {
                                    int i46 = iArr2[i45] + i12;
                                    if (i46 < 0 && zArr[i45]) {
                                        iArr4[i44] = i46;
                                        i44++;
                                    }
                                }
                                int[] copyOf = Arrays.copyOf(iArr4, i44);
                                int i47 = 0;
                                for (int i48 = i35 - 1; i48 >= 0; i48--) {
                                    int i49 = iArr2[i48] + i12;
                                    if (i49 > 0 && zArr[i48]) {
                                        iArr5[i47] = i49;
                                        i47++;
                                    }
                                }
                                if (i12 > 0 && zArr[i37]) {
                                    iArr5[i47] = i12;
                                    i47++;
                                }
                                int i50 = i47;
                                for (int i51 = 0; i51 < i36; i51++) {
                                    int i52 = iArr3[i51] + i12;
                                    if (i52 > 0 && zArr[i35 + i51]) {
                                        iArr5[i50] = i52;
                                        i50++;
                                    }
                                }
                                i35 = i44;
                                i36 = i50;
                                iArr3 = Arrays.copyOf(iArr5, i50);
                                iArr2 = copyOf;
                            } else {
                                i8 = f4;
                                bArr2 = bArr3;
                                i9 = i18;
                                i10 = q4;
                                i11 = i21;
                                int f6 = il1Var.f();
                                int f7 = il1Var.f();
                                int[] iArr6 = new int[f6];
                                for (int i53 = 0; i53 < f6; i53++) {
                                    iArr6[i53] = il1Var.f() + 1;
                                    il1Var.c();
                                }
                                int[] iArr7 = new int[f7];
                                for (int i54 = 0; i54 < f7; i54++) {
                                    iArr7[i54] = il1Var.f() + 1;
                                    il1Var.c();
                                }
                                i35 = f6;
                                i36 = f7;
                                iArr3 = iArr7;
                                iArr2 = iArr6;
                            }
                            i34++;
                            f4 = i8;
                            q4 = i10;
                            bArr3 = bArr2;
                            i18 = i9;
                            i21 = i11;
                        }
                        bArr = bArr3;
                        i2 = i18;
                        i3 = q4;
                        i4 = i21;
                        if (il1Var.e()) {
                            for (int i55 = 0; i55 < il1Var.f(); i55++) {
                                il1Var.d(f3 + 5);
                            }
                        }
                        il1Var.d(2);
                        if (il1Var.e()) {
                            if (il1Var.e()) {
                                int a5 = il1Var.a(8);
                                if (a5 == 255) {
                                    int a6 = il1Var.a(16);
                                    int a7 = il1Var.a(16);
                                    if (a6 != 0 && a7 != 0) {
                                        f = a6 / a7;
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
                                        il1Var.e();
                                    }
                                } else if (a5 < 17) {
                                    f = hl1.b[a5];
                                    if (il1Var.e()) {
                                    }
                                    if (il1Var.e()) {
                                    }
                                    if (il1Var.e()) {
                                    }
                                    il1Var.c();
                                    il1Var.e();
                                } else {
                                    lb4.c("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + a5);
                                }
                            }
                            f = 1.0f;
                            if (il1Var.e()) {
                            }
                            if (il1Var.e()) {
                            }
                            if (il1Var.e()) {
                            }
                            il1Var.c();
                            il1Var.e();
                        } else {
                            f = 1.0f;
                        }
                        str = g9.d(a2, e, a3, i26, iArr, a4);
                        f2 = f;
                        i23 = 0;
                    } else {
                        i = n;
                        bArr = bArr3;
                        i2 = i18;
                        i3 = q4;
                        i4 = i21;
                        i5 = n3;
                        i6 = q3;
                    }
                    i22 = i25 + i3;
                    kh4Var.f(i3);
                    i23++;
                    kh4Var2 = kh4Var;
                    n2 = i24;
                    n = i;
                    n3 = i5;
                    q3 = i6;
                    bArr3 = bArr;
                    i18 = i2;
                    i21 = i4;
                    i17 = 0;
                }
                i21++;
                i17 = 0;
            }
            int i56 = n;
            byte[] bArr4 = bArr3;
            if (i18 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr4);
            }
            return new vk1(singletonList, i56 + 1, f2, str);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw jy2.a("Error parsing HEVC config", e3);
        }
    }
}