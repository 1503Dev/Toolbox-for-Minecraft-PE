package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: qf5  reason: default package */
public final class qf5<T> implements dg5<T> {
    public static final int[] o = new int[0];
    public static final Unsafe p = zg5.n();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final nf5 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final cf5 l;
    public final og5 m;
    public final vd5 n;

    public qf5(int[] iArr, Object[] objArr, int i, int i2, nf5 nf5Var, boolean z, int[] iArr2, int i3, int i4, cf5 cf5Var, og5 og5Var, vd5 vd5Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = nf5Var instanceof ie5;
        this.h = z;
        this.f = vd5Var != null && vd5Var.h(nf5Var);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = cf5Var;
        this.m = og5Var;
        this.n = vd5Var;
        this.e = nf5Var;
    }

    public static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ie5) {
            return ((ie5) obj).r();
        }
        return true;
    }

    public static final void E(int i, Object obj, rd5 rd5Var) {
        if (obj instanceof String) {
            rd5Var.a.C(i, (String) obj);
            return;
        }
        rd5Var.f(i, (gd5) obj);
    }

    public static pg5 G(Object obj) {
        ie5 ie5Var = (ie5) obj;
        pg5 pg5Var = ie5Var.zzc;
        if (pg5Var == pg5.f) {
            pg5 b = pg5.b();
            ie5Var.zzc = b;
            return b;
        }
        return pg5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qf5 H(lf5 lf5Var, cf5 cf5Var, og5 og5Var, vd5 vd5Var) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt4;
        int i8;
        char charAt5;
        int i9;
        char charAt6;
        int i10;
        char charAt7;
        int i11;
        char charAt8;
        int i12;
        char charAt9;
        int i13;
        char charAt10;
        int i14;
        char charAt11;
        int i15;
        int i16;
        int i17;
        int objectFieldOffset;
        String str;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field r;
        int i23;
        char charAt12;
        int i24;
        int i25;
        Object obj;
        Field r2;
        Object obj2;
        Field r3;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        char charAt16;
        if (!(lf5Var instanceof xf5)) {
            mg5 mg5Var = (mg5) lf5Var;
            throw null;
        }
        xf5 xf5Var = (xf5) lf5Var;
        int d = xf5Var.d();
        String b = xf5Var.b();
        int length = b.length();
        char c = 55296;
        if (b.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (b.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt17 = b.charAt(i);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt16 = b.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt17 = i32 | (charAt16 << i33);
            i31 = i29;
        }
        if (charAt17 == 0) {
            i2 = i31;
            iArr = o;
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        } else {
            int i34 = i31 + 1;
            charAt = b.charAt(i31);
            if (charAt >= 55296) {
                int i35 = charAt & 8191;
                int i36 = 13;
                while (true) {
                    i14 = i34 + 1;
                    charAt11 = b.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i35 |= (charAt11 & 8191) << i36;
                    i36 += 13;
                    i34 = i14;
                }
                charAt = i35 | (charAt11 << i36);
                i34 = i14;
            }
            int i37 = i34 + 1;
            int charAt18 = b.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt10 = b.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                charAt18 = i38 | (charAt10 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int charAt19 = b.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt9 = b.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                charAt19 = i41 | (charAt9 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int charAt20 = b.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt8 = b.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                charAt20 = i44 | (charAt8 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            charAt2 = b.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt7 = b.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                charAt2 = i47 | (charAt7 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            charAt3 = b.charAt(i46);
            if (charAt3 >= 55296) {
                int i50 = charAt3 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt6 = b.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                charAt3 = i50 | (charAt6 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            int charAt21 = b.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt5 = b.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                charAt21 = i53 | (charAt5 << i54);
                i52 = i8;
            }
            i2 = i52 + 1;
            int charAt22 = b.charAt(i52);
            if (charAt22 >= 55296) {
                int i55 = charAt22 & 8191;
                int i56 = i2;
                int i57 = 13;
                while (true) {
                    i7 = i56 + 1;
                    charAt4 = b.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i56 = i7;
                }
                charAt22 = i55 | (charAt4 << i57);
                i2 = i7;
            }
            int i58 = charAt22 + charAt3 + charAt21;
            i3 = charAt + charAt + charAt18;
            iArr = new int[i58];
            i4 = charAt19;
            i5 = charAt20;
            i6 = charAt22;
        }
        Unsafe unsafe = p;
        Object[] e = xf5Var.e();
        Class<?> cls = xf5Var.a().getClass();
        int i59 = i6 + charAt3;
        int i60 = charAt2 + charAt2;
        int[] iArr2 = new int[charAt2 * 3];
        Object[] objArr = new Object[i60];
        int i61 = i2;
        int i62 = i6;
        int i63 = i59;
        int i64 = 0;
        int i65 = 0;
        while (true) {
            boolean z = d == 2;
            if (i61 >= length) {
                return new qf5(iArr2, objArr, i4, i5, xf5Var.a(), z, iArr, i6, i59, cf5Var, og5Var, vd5Var);
            }
            int i66 = i61 + 1;
            int charAt23 = b.charAt(i61);
            if (charAt23 >= c) {
                int i67 = charAt23 & 8191;
                int i68 = 13;
                while (true) {
                    i28 = i66 + 1;
                    charAt15 = b.charAt(i66);
                    if (charAt15 < c) {
                        break;
                    }
                    i67 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i66 = i28;
                }
                charAt23 = i67 | (charAt15 << i68);
                i66 = i28;
            }
            int i69 = i66 + 1;
            int charAt24 = b.charAt(i66);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i27 = i71 + 1;
                    charAt14 = b.charAt(i71);
                    if (charAt14 < c) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i27;
                }
                charAt24 = i70 | (charAt14 << i72);
                i15 = i27;
            } else {
                i15 = i69;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            int i73 = charAt24 & 255;
            int i74 = d;
            if (i73 >= 51) {
                int i75 = i15 + 1;
                int charAt25 = b.charAt(i15);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i76 = 13;
                    int i77 = charAt25 & 8191;
                    int i78 = i75;
                    while (true) {
                        i26 = i78 + 1;
                        charAt13 = b.charAt(i78);
                        if (charAt13 < c2) {
                            break;
                        }
                        i77 |= (charAt13 & 8191) << i76;
                        i76 += 13;
                        i78 = i26;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt13 << i76);
                    i24 = i26;
                } else {
                    i24 = i75;
                }
                i22 = i24;
                int i79 = i73 - 51;
                i16 = length;
                if (i79 == 9 || i79 == 17) {
                    int i80 = i65 / 3;
                    i25 = i3 + 1;
                    objArr[i80 + i80 + 1] = e[i3];
                } else {
                    if (i79 == 12 && !z) {
                        int i81 = i65 / 3;
                        i25 = i3 + 1;
                        objArr[i81 + i81 + 1] = e[i3];
                    }
                    int i82 = charAt25 + charAt25;
                    obj = e[i82];
                    if (obj instanceof Field) {
                        r2 = r(cls, (String) obj);
                        e[i82] = r2;
                    } else {
                        r2 = (Field) obj;
                    }
                    int i83 = i3;
                    int i84 = i64;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(r2);
                    int i85 = i82 + 1;
                    obj2 = e[i85];
                    if (obj2 instanceof Field) {
                        r3 = r(cls, (String) obj2);
                        e[i85] = r3;
                    } else {
                        r3 = (Field) obj2;
                    }
                    i21 = (int) unsafe.objectFieldOffset(r3);
                    str = b;
                    i18 = i84;
                    i3 = i83;
                    i20 = 0;
                }
                i3 = i25;
                int i822 = charAt25 + charAt25;
                obj = e[i822];
                if (obj instanceof Field) {
                }
                int i832 = i3;
                int i842 = i64;
                objectFieldOffset = (int) unsafe.objectFieldOffset(r2);
                int i852 = i822 + 1;
                obj2 = e[i852];
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(r3);
                str = b;
                i18 = i842;
                i3 = i832;
                i20 = 0;
            } else {
                i16 = length;
                int i86 = i64;
                int i87 = i3 + 1;
                Field r4 = r(cls, (String) e[i3]);
                if (i73 == 9 || i73 == 17) {
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = r4.getType();
                } else if (i73 == 27 || i73 == 49) {
                    int i89 = i65 / 3;
                    objArr[i89 + i89 + 1] = e[i87];
                    i87++;
                } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                    if (!z) {
                        int i90 = i65 / 3;
                        objArr[i90 + i90 + 1] = e[i87];
                        i87++;
                    }
                } else if (i73 == 50) {
                    int i91 = i62 + 1;
                    iArr[i62] = i65;
                    int i92 = i65 / 3;
                    i17 = i87 + 1;
                    int i93 = i92 + i92;
                    objArr[i93] = e[i87];
                    if ((charAt24 & 2048) != 0) {
                        i87 = i17 + 1;
                        objArr[i93 + 1] = e[i17];
                        i62 = i91;
                    } else {
                        i62 = i91;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(r4);
                        if ((charAt24 & 4096) == 4096 || i73 > 17) {
                            str = b;
                            i18 = i86;
                            i19 = i15;
                            i20 = 0;
                            i21 = 1048575;
                        } else {
                            i19 = i15 + 1;
                            int charAt26 = b.charAt(i15);
                            if (charAt26 >= 55296) {
                                int i94 = charAt26 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i23 = i19 + 1;
                                    charAt12 = b.charAt(i19);
                                    if (charAt12 < 55296) {
                                        break;
                                    }
                                    i94 |= (charAt12 & 8191) << i95;
                                    i95 += 13;
                                    i19 = i23;
                                }
                                charAt26 = i94 | (charAt12 << i95);
                                i19 = i23;
                            }
                            int i96 = (charAt26 / 32) + charAt + charAt;
                            Object obj3 = e[i96];
                            str = b;
                            if (obj3 instanceof Field) {
                                r = (Field) obj3;
                            } else {
                                r = r(cls, (String) obj3);
                                e[i96] = r;
                            }
                            i18 = i86;
                            i20 = charAt26 % 32;
                            i21 = (int) unsafe.objectFieldOffset(r);
                        }
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i63] = objectFieldOffset;
                            i63++;
                        }
                        i22 = i19;
                        i3 = i17;
                    }
                }
                i17 = i87;
                objectFieldOffset = (int) unsafe.objectFieldOffset(r4);
                if ((charAt24 & 4096) == 4096) {
                }
                str = b;
                i18 = i86;
                i19 = i15;
                i20 = 0;
                i21 = 1048575;
                if (i73 >= 18) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i22 = i19;
                i3 = i17;
            }
            int i97 = i65 + 1;
            iArr2[i65] = charAt23;
            int i98 = i97 + 1;
            iArr2[i97] = objectFieldOffset | (i73 << 20) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0);
            i65 = i98 + 1;
            iArr2[i98] = (i20 << 20) | i21;
            d = i74;
            i61 = i22;
            b = str;
            i64 = i18;
            length = i16;
            c = 55296;
        }
    }

    public static int J(long j, Object obj) {
        return ((Integer) zg5.m(j, obj)).intValue();
    }

    public static long k(long j, Object obj) {
        return ((Long) zg5.m(j, obj)).longValue();
    }

    public static Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder b = sd1.b("Field ", str, " for ", name, " not found. Known fields are ");
            b.append(arrays);
            throw new RuntimeException(b.toString());
        }
    }

    public static void s(Object obj) {
        if (!C(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public final boolean A(int i, Object obj, Object obj2) {
        return B(i, obj) == B(i, obj2);
    }

    public final boolean B(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int O = O(i);
            long j2 = O & 1048575;
            switch ((O >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(zg5.g(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zg5.h(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zg5.k(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zg5.k(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zg5.i(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zg5.k(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zg5.i(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zg5.z(j2, obj);
                case 8:
                    Object m = zg5.m(j2, obj);
                    if (m instanceof String) {
                        if (((String) m).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m instanceof gd5) {
                        if (gd5.Q.equals(m)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zg5.m(j2, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (gd5.Q.equals(zg5.m(j2, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zg5.i(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zg5.i(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zg5.i(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zg5.k(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zg5.i(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zg5.k(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zg5.m(j2, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & zg5.i(j, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean D(int i, int i2, Object obj) {
        if (zg5.i(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x032a, code lost:
        if (r0 != r2) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0373, code lost:
        if (r0 != r14) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0375, code lost:
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r1 = r34;
        r5 = r35;
        r6 = r16;
        r4 = r18;
        r2 = r24;
        r7 = r25;
        r3 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x038e, code lost:
        r6 = r34;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0402, code lost:
        if (r6 == 1048575) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0404, code lost:
        r27.putInt(r11, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x040a, code lost:
        r4 = r29.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x040e, code lost:
        if (r4 >= r29.k) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0410, code lost:
        n(r11, r29.i[r4], null);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x041c, code lost:
        if (r1 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x041e, code lost:
        if (r0 != r33) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0425, code lost:
        throw defpackage.te5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0426, code lost:
        if (r0 > r33) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0428, code lost:
        if (r2 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x042a, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0430, code lost:
        throw defpackage.te5.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(Object obj, byte[] bArr, int i, int i2, int i3, yc5 yc5Var) {
        Unsafe unsafe;
        Object obj2;
        int i4;
        int i5;
        int N;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj3;
        yc5 yc5Var2;
        int i13;
        byte[] bArr2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        yc5 yc5Var3;
        yc5 yc5Var4;
        long j;
        int l;
        long j2;
        long j3;
        int i26;
        int i27;
        int i28;
        boolean z;
        long j4;
        long j5;
        int i29;
        Object obj4 = obj;
        byte[] bArr3 = bArr;
        int i30 = i2;
        s(obj);
        Unsafe unsafe2 = p;
        int i31 = 0;
        int i32 = i;
        int i33 = i3;
        yc5 yc5Var5 = yc5Var;
        int i34 = 0;
        int i35 = -1;
        int i36 = 0;
        int i37 = 1048575;
        int i38 = 0;
        while (true) {
            if (i32 < i30) {
                int i39 = i32 + 1;
                byte b = bArr3[i32];
                if (b < 0) {
                    i5 = zc5.j(b, bArr3, i39, yc5Var5);
                    i4 = yc5Var5.a;
                } else {
                    i4 = b;
                    i5 = i39;
                }
                int i40 = i4 >>> 3;
                if (i40 > i35) {
                    int i41 = i36 / 3;
                    if (i40 >= this.c && i40 <= this.d) {
                        N = N(i40, i41);
                        i6 = N;
                        if (i6 != -1) {
                            i7 = i4;
                            i8 = i37;
                            i9 = i40;
                            unsafe = unsafe2;
                            i10 = 0;
                            i11 = i5;
                            i12 = i33;
                        } else {
                            int i42 = i4 & 7;
                            int[] iArr = this.a;
                            int i43 = iArr[i6 + 1];
                            int i44 = (i43 >>> 20) & 255;
                            long j6 = i43 & 1048575;
                            if (i44 <= 17) {
                                int i45 = iArr[i6 + 2];
                                int i46 = 1 << (i45 >>> 20);
                                int i47 = i45 & 1048575;
                                if (i47 != i37) {
                                    if (i37 != 1048575) {
                                        unsafe2.putInt(obj4, i37, i38);
                                    }
                                    i21 = unsafe2.getInt(obj4, i47);
                                    i22 = i47;
                                } else {
                                    i21 = i38;
                                    i22 = i37;
                                }
                                bArr2 = bArr;
                                switch (i44) {
                                    case 0:
                                        i23 = i5;
                                        i7 = i4;
                                        i24 = i6;
                                        i25 = i22;
                                        yc5Var3 = yc5Var5;
                                        if (i42 == 1) {
                                            zg5.r(obj4, j6, Double.longBitsToDouble(zc5.o(bArr2, i23)));
                                            i32 = i23 + 8;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 1:
                                        i23 = i5;
                                        i7 = i4;
                                        i24 = i6;
                                        i25 = i22;
                                        yc5Var3 = yc5Var5;
                                        if (i42 == 5) {
                                            zg5.s(obj4, j6, Float.intBitsToFloat(zc5.b(bArr2, i23)));
                                            i32 = i23 + 4;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                        i23 = i5;
                                        i7 = i4;
                                        i24 = i6;
                                        i25 = i22;
                                        yc5Var4 = yc5Var5;
                                        j = j6;
                                        if (i42 == 0) {
                                            l = zc5.l(bArr2, i23, yc5Var4);
                                            j2 = yc5Var4.b;
                                            unsafe2.putLong(obj, j, j2);
                                            i21 |= i46;
                                            yc5Var5 = yc5Var4;
                                            i32 = l;
                                            i29 = i24;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 4:
                                    case 11:
                                        i23 = i5;
                                        i7 = i4;
                                        i24 = i6;
                                        i25 = i22;
                                        yc5Var3 = yc5Var5;
                                        j3 = j6;
                                        if (i42 == 0) {
                                            i32 = zc5.i(bArr2, i23, yc5Var3);
                                            i26 = yc5Var3.a;
                                            unsafe2.putInt(obj4, j3, i26);
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 5:
                                    case 14:
                                        i23 = i5;
                                        i24 = i6;
                                        i25 = i22;
                                        yc5Var3 = yc5Var5;
                                        int i48 = i4;
                                        if (i42 == 1) {
                                            i7 = i48;
                                            unsafe2.putLong(obj, j6, zc5.o(bArr2, i23));
                                            i32 = i23 + 8;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i7 = i48;
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 6:
                                    case 13:
                                        i23 = i5;
                                        i24 = i6;
                                        i25 = i22;
                                        yc5Var3 = yc5Var5;
                                        int i49 = i4;
                                        if (i42 == 5) {
                                            unsafe2.putInt(obj4, j6, zc5.b(bArr2, i23));
                                            i7 = i49;
                                            i32 = i23 + 4;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i27 = i24;
                                            i7 = i49;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 7:
                                        i23 = i5;
                                        i24 = i6;
                                        i25 = i22;
                                        i28 = i4;
                                        yc5Var3 = yc5Var5;
                                        if (i42 == 0) {
                                            i32 = zc5.l(bArr2, i23, yc5Var3);
                                            if (yc5Var3.b != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            zg5.p(obj4, j6, z);
                                            i7 = i28;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i7 = i28;
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 8:
                                        i23 = i5;
                                        i24 = i6;
                                        i25 = i22;
                                        i28 = i4;
                                        yc5Var3 = yc5Var5;
                                        j4 = j6;
                                        if (i42 == 2) {
                                            if ((536870912 & i43) == 0) {
                                                i32 = zc5.f(bArr2, i23, yc5Var3);
                                            } else {
                                                i32 = zc5.g(bArr2, i23, yc5Var3);
                                            }
                                            unsafe2.putObject(obj4, j4, yc5Var3.c);
                                            i7 = i28;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i7 = i28;
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 9:
                                        if (i42 == 2) {
                                            Object p2 = p(i6, obj4);
                                            i7 = i4;
                                            i25 = i22;
                                            yc5Var3 = yc5Var5;
                                            i32 = zc5.n(p2, m(i6), bArr, i5, i2, yc5Var);
                                            y(i6, obj4, p2);
                                            i24 = i6;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i23 = i5;
                                            i25 = i22;
                                            i7 = i4;
                                            i27 = i6;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 10:
                                        if (i42 == 2) {
                                            i32 = zc5.a(bArr2, i5, yc5Var5);
                                            i24 = i6;
                                            i25 = i22;
                                            i28 = i4;
                                            yc5Var3 = yc5Var5;
                                            j4 = j6;
                                            unsafe2.putObject(obj4, j4, yc5Var3.c);
                                            i7 = i28;
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i23 = i5;
                                            i7 = i4;
                                            i27 = i6;
                                            i25 = i22;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 12:
                                        j5 = j6;
                                        if (i42 == 0) {
                                            i32 = zc5.i(bArr2, i5, yc5Var5);
                                            i26 = yc5Var5.a;
                                            le5 l2 = l(i6);
                                            if (l2 != null && !l2.a(i26)) {
                                                G(obj).c(i4, Long.valueOf(i26));
                                                i7 = i4;
                                                i29 = i6;
                                                i25 = i22;
                                                i38 = i21;
                                                i37 = i25;
                                                i14 = i7;
                                                i19 = i29;
                                                break;
                                            }
                                            i24 = i6;
                                            i25 = i22;
                                            yc5Var3 = yc5Var5;
                                            j3 = j5;
                                            i7 = i4;
                                            unsafe2.putInt(obj4, j3, i26);
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                        } else {
                                            i23 = i5;
                                            i7 = i4;
                                            i27 = i6;
                                            i25 = i22;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                        break;
                                    case 15:
                                        j5 = j6;
                                        if (i42 == 0) {
                                            i32 = zc5.i(bArr2, i5, yc5Var5);
                                            i26 = ld5.e(yc5Var5.a);
                                            i24 = i6;
                                            i25 = i22;
                                            yc5Var3 = yc5Var5;
                                            j3 = j5;
                                            i7 = i4;
                                            unsafe2.putInt(obj4, j3, i26);
                                            i21 |= i46;
                                            i29 = i24;
                                            yc5Var5 = yc5Var3;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i23 = i5;
                                            i7 = i4;
                                            i27 = i6;
                                            i25 = i22;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    case 16:
                                        if (i42 == 0) {
                                            int l3 = zc5.l(bArr2, i5, yc5Var5);
                                            j2 = ld5.f(yc5Var5.b);
                                            i24 = i6;
                                            i25 = i22;
                                            yc5Var4 = yc5Var5;
                                            j = j6;
                                            l = l3;
                                            i7 = i4;
                                            unsafe2.putLong(obj, j, j2);
                                            i21 |= i46;
                                            yc5Var5 = yc5Var4;
                                            i32 = l;
                                            i29 = i24;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i23 = i5;
                                            i7 = i4;
                                            i27 = i6;
                                            i25 = i22;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                    default:
                                        i23 = i5;
                                        i7 = i4;
                                        i24 = i6;
                                        i25 = i22;
                                        if (i42 == 3) {
                                            Object p3 = p(i24, obj4);
                                            i29 = i24;
                                            i32 = zc5.m(p3, m(i24), bArr, i23, i2, (i40 << 3) | 4, yc5Var);
                                            y(i29, obj4, p3);
                                            i21 |= i46;
                                            yc5Var5 = yc5Var;
                                            i38 = i21;
                                            i37 = i25;
                                            i14 = i7;
                                            i19 = i29;
                                            break;
                                        } else {
                                            i27 = i24;
                                            i12 = i3;
                                            i11 = i23;
                                            i9 = i40;
                                            unsafe = unsafe2;
                                            i38 = i21;
                                            i8 = i25;
                                            i10 = i27;
                                            break;
                                        }
                                }
                                i33 = i3;
                                i36 = i19;
                                i35 = i40;
                                i34 = i14;
                                bArr3 = bArr2;
                                i31 = 0;
                                i30 = i2;
                            } else {
                                bArr2 = bArr;
                                i14 = i4;
                                int i50 = i5;
                                if (i44 == 27) {
                                    if (i42 == 2) {
                                        qe5 qe5Var = (qe5) unsafe2.getObject(obj4, j6);
                                        if (!qe5Var.d()) {
                                            int size = qe5Var.size();
                                            if (size == 0) {
                                                i20 = 10;
                                            } else {
                                                i20 = size + size;
                                            }
                                            qe5Var = qe5Var.e(i20);
                                            unsafe2.putObject(obj4, j6, qe5Var);
                                        }
                                        i19 = i6;
                                        i32 = zc5.d(m(i6), i14, bArr, i50, i2, qe5Var, yc5Var);
                                        yc5Var5 = yc5Var;
                                        i37 = i37;
                                        i33 = i3;
                                        i36 = i19;
                                        i35 = i40;
                                        i34 = i14;
                                        bArr3 = bArr2;
                                        i31 = 0;
                                        i30 = i2;
                                    } else {
                                        i8 = i37;
                                        i15 = i50;
                                        i16 = i6;
                                        i17 = i38;
                                        i9 = i40;
                                        unsafe = unsafe2;
                                        i18 = i14;
                                    }
                                } else {
                                    i8 = i37;
                                    if (i44 <= 49) {
                                        i17 = i38;
                                        i9 = i40;
                                        i18 = i14;
                                        unsafe = unsafe2;
                                        i32 = M(obj, bArr, i50, i2, i14, i40, i42, i6, i43, i44, j6, yc5Var);
                                        i10 = i6;
                                    } else {
                                        i15 = i50;
                                        i16 = i6;
                                        i17 = i38;
                                        i9 = i40;
                                        unsafe = unsafe2;
                                        i18 = i14;
                                        if (i44 == 50) {
                                            if (i42 == 2) {
                                                K(obj, i16, j6);
                                                throw null;
                                            }
                                        } else {
                                            i10 = i16;
                                            i32 = L(obj, bArr, i15, i2, i18, i9, i42, i43, i44, j6, i16, yc5Var);
                                        }
                                    }
                                }
                                i12 = i3;
                                i11 = i15;
                                i10 = i16;
                                i7 = i18;
                                i38 = i17;
                            }
                        }
                        if (i7 != i12 && i12 != 0) {
                            obj2 = obj;
                            i32 = i11;
                            i33 = i12;
                            i34 = i7;
                            i37 = i8;
                        } else {
                            if (!this.f) {
                                yc5Var2 = yc5Var;
                                ud5 ud5Var = yc5Var2.d;
                                if (ud5Var != ud5.c) {
                                    i13 = i9;
                                    if (ud5Var.b(this.e, i13) == null) {
                                        i32 = zc5.h(i7, bArr, i11, i2, G(obj), yc5Var);
                                        obj3 = obj;
                                        bArr3 = bArr;
                                        i30 = i2;
                                        i33 = i12;
                                        i34 = i7;
                                        yc5Var5 = yc5Var2;
                                        i35 = i13;
                                        obj4 = obj3;
                                        i37 = i8;
                                        i36 = i10;
                                        unsafe2 = unsafe;
                                        i31 = 0;
                                    } else {
                                        ge5 ge5Var = (ge5) obj;
                                        throw null;
                                    }
                                } else {
                                    obj3 = obj;
                                }
                            } else {
                                obj3 = obj;
                                yc5Var2 = yc5Var;
                            }
                            i13 = i9;
                            i32 = zc5.h(i7, bArr, i11, i2, G(obj), yc5Var);
                            bArr3 = bArr;
                            i30 = i2;
                            i33 = i12;
                            i34 = i7;
                            yc5Var5 = yc5Var2;
                            i35 = i13;
                            obj4 = obj3;
                            i37 = i8;
                            i36 = i10;
                            unsafe2 = unsafe;
                            i31 = 0;
                        }
                    }
                    N = -1;
                    i6 = N;
                    if (i6 != -1) {
                    }
                    if (i7 != i12) {
                    }
                    if (!this.f) {
                    }
                    i13 = i9;
                    i32 = zc5.h(i7, bArr, i11, i2, G(obj), yc5Var);
                    bArr3 = bArr;
                    i30 = i2;
                    i33 = i12;
                    i34 = i7;
                    yc5Var5 = yc5Var2;
                    i35 = i13;
                    obj4 = obj3;
                    i37 = i8;
                    i36 = i10;
                    unsafe2 = unsafe;
                    i31 = 0;
                } else {
                    if (i40 >= this.c && i40 <= this.d) {
                        N = N(i40, i31);
                        i6 = N;
                        if (i6 != -1) {
                        }
                        if (i7 != i12) {
                        }
                        if (!this.f) {
                        }
                        i13 = i9;
                        i32 = zc5.h(i7, bArr, i11, i2, G(obj), yc5Var);
                        bArr3 = bArr;
                        i30 = i2;
                        i33 = i12;
                        i34 = i7;
                        yc5Var5 = yc5Var2;
                        i35 = i13;
                        obj4 = obj3;
                        i37 = i8;
                        i36 = i10;
                        unsafe2 = unsafe;
                        i31 = 0;
                    }
                    N = -1;
                    i6 = N;
                    if (i6 != -1) {
                    }
                    if (i7 != i12) {
                    }
                    if (!this.f) {
                    }
                    i13 = i9;
                    i32 = zc5.h(i7, bArr, i11, i2, G(obj), yc5Var);
                    bArr3 = bArr;
                    i30 = i2;
                    i33 = i12;
                    i34 = i7;
                    yc5Var5 = yc5Var2;
                    i35 = i13;
                    obj4 = obj3;
                    i37 = i8;
                    i36 = i10;
                    unsafe2 = unsafe;
                    i31 = 0;
                }
            } else {
                unsafe = unsafe2;
                obj2 = obj4;
            }
        }
    }

    public final int I(Object obj) {
        int i;
        int q;
        int p2;
        Object object;
        int i2;
        int p3;
        int p4;
        int i3;
        int B;
        int C;
        int p5;
        Object object2;
        int i4;
        Unsafe unsafe = p;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        int i9 = 0;
        while (i6 < this.a.length) {
            int O = O(i6);
            int[] iArr = this.a;
            int i10 = iArr[i6];
            int i11 = (O >>> 20) & 255;
            if (i11 <= 17) {
                int i12 = iArr[i6 + 2];
                int i13 = i12 & i5;
                int i14 = i12 >>> 20;
                if (i13 != i8) {
                    i9 = unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i = 1 << i14;
            } else {
                i = 0;
            }
            long j = O & i5;
            switch (i11) {
                case 0:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 8;
                    break;
                case 1:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 4;
                    break;
                case 2:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    q = qd5.q(unsafe.getLong(obj, j));
                    p2 = qd5.p(i10 << 3);
                    i7 += p2 + q;
                    i6 += 3;
                    i5 = 1048575;
                case 3:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    q = qd5.q(unsafe.getLong(obj, j));
                    p2 = qd5.p(i10 << 3);
                    i7 += p2 + q;
                    i6 += 3;
                    i5 = 1048575;
                case 4:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i2 = i10 << 3;
                    q = qd5.J(unsafe.getInt(obj, j));
                    p2 = qd5.p(i2);
                    i7 += p2 + q;
                    i6 += 3;
                    i5 = 1048575;
                case 5:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 8;
                    break;
                case 6:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 4;
                    break;
                case 7:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 1;
                    break;
                case 8:
                    if ((i9 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof gd5)) {
                            i2 = i10 << 3;
                            q = qd5.K((String) object);
                            p2 = qd5.p(i2);
                            i7 += p2 + q;
                            i6 += 3;
                            i5 = 1048575;
                        }
                        Logger logger = qd5.R;
                        int o2 = ((gd5) object).o();
                        p3 = qd5.p(o2) + o2;
                        p4 = qd5.p(i10 << 3);
                        B = p4 + p3;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = eg5.I(i10, m(i6), unsafe.getObject(obj, j));
                    break;
                case 10:
                    if ((i9 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        Logger logger2 = qd5.R;
                        int o22 = ((gd5) object).o();
                        p3 = qd5.p(o22) + o22;
                        p4 = qd5.p(i10 << 3);
                        B = p4 + p3;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 11:
                    if ((i9 & i) != 0) {
                        i2 = i10 << 3;
                        q = qd5.p(unsafe.getInt(obj, j));
                        p2 = qd5.p(i2);
                        i7 += p2 + q;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i2 = i10 << 3;
                    q = qd5.J(unsafe.getInt(obj, j));
                    p2 = qd5.p(i2);
                    i7 += p2 + q;
                    i6 += 3;
                    i5 = 1048575;
                case 13:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 4;
                    break;
                case 14:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 8;
                    break;
                case 15:
                    if ((i9 & i) != 0) {
                        i3 = unsafe.getInt(obj, j);
                        B = qd5.p((i3 >> 31) ^ (i3 + i3)) + qd5.p(i10 << 3);
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 16:
                    if ((i & i9) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        p3 = qd5.p(i10 << 3);
                        p4 = qd5.q((j2 >> 63) ^ (j2 + j2));
                        B = p4 + p3;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.I(i10, (nf5) unsafe.getObject(obj, j), m(i6));
                    break;
                case 18:
                case 23:
                case 32:
                    B = eg5.B(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 19:
                case 24:
                case 31:
                    B = eg5.z(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 20:
                    B = eg5.G(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 21:
                    B = eg5.R(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 22:
                    B = eg5.E(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 25:
                    B = eg5.v(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 26:
                    B = eg5.O(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 27:
                    B = eg5.J(i10, (List) unsafe.getObject(obj, j), m(i6));
                    break;
                case 28:
                    B = eg5.w(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 29:
                    B = eg5.P(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 30:
                    B = eg5.x(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 33:
                    B = eg5.K(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 34:
                    B = eg5.M(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 35:
                    C = eg5.C((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 36:
                    C = eg5.A((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 37:
                    C = eg5.H((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 38:
                    C = eg5.S((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 39:
                    C = eg5.F((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 40:
                    C = eg5.C((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 41:
                    C = eg5.A((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 42:
                    Class cls = eg5.a;
                    C = ((List) unsafe.getObject(obj, j)).size();
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 43:
                    C = eg5.Q((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 44:
                    C = eg5.y((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 45:
                    C = eg5.A((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 46:
                    C = eg5.C((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 47:
                    C = eg5.L((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 48:
                    C = eg5.N((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    p5 = qd5.p(i10 << 3) + qd5.p(C);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 49:
                    B = eg5.D(i10, (List) unsafe.getObject(obj, j), m(i6));
                    break;
                case 50:
                    jf5.a(unsafe.getObject(obj, j), o(i6));
                    continue;
                    i6 += 3;
                    i5 = 1048575;
                case 51:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 8;
                    break;
                case 52:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 4;
                    break;
                case 53:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    C = qd5.q(k(j, obj));
                    p5 = qd5.p(i10 << 3);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 54:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    C = qd5.q(k(j, obj));
                    p5 = qd5.p(i10 << 3);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 55:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i4 = i10 << 3;
                    C = qd5.J(J(j, obj));
                    p5 = qd5.p(i4);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 56:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 8;
                    break;
                case 57:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 4;
                    break;
                case 58:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 1;
                    break;
                case 59:
                    if (D(i10, i6, obj)) {
                        object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof gd5)) {
                            i4 = i10 << 3;
                            C = qd5.K((String) object2);
                            p5 = qd5.p(i4);
                            i7 = p5 + C + i7;
                            i6 += 3;
                            i5 = 1048575;
                        }
                        Logger logger3 = qd5.R;
                        int o3 = ((gd5) object2).o();
                        p3 = qd5.p(o3) + o3;
                        p4 = qd5.p(i10 << 3);
                        B = p4 + p3;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 60:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = eg5.I(i10, m(i6), unsafe.getObject(obj, j));
                    break;
                case 61:
                    if (D(i10, i6, obj)) {
                        object2 = unsafe.getObject(obj, j);
                        Logger logger32 = qd5.R;
                        int o32 = ((gd5) object2).o();
                        p3 = qd5.p(o32) + o32;
                        p4 = qd5.p(i10 << 3);
                        B = p4 + p3;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 62:
                    if (D(i10, i6, obj)) {
                        i4 = i10 << 3;
                        C = qd5.p(J(j, obj));
                        p5 = qd5.p(i4);
                        i7 = p5 + C + i7;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 63:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i4 = i10 << 3;
                    C = qd5.J(J(j, obj));
                    p5 = qd5.p(i4);
                    i7 = p5 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 64:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 4;
                    break;
                case 65:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.p(i10 << 3) + 8;
                    break;
                case 66:
                    if (D(i10, i6, obj)) {
                        i3 = J(j, obj);
                        B = qd5.p((i3 >> 31) ^ (i3 + i3)) + qd5.p(i10 << 3);
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 67:
                    if (D(i10, i6, obj)) {
                        long k = k(j, obj);
                        p3 = qd5.p(i10 << 3);
                        p4 = qd5.q((k >> 63) ^ (k + k));
                        B = p4 + p3;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 68:
                    if (!D(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = qd5.I(i10, (nf5) unsafe.getObject(obj, j), m(i6));
                    break;
                default:
                    i6 += 3;
                    i5 = 1048575;
            }
            i7 += B;
            i6 += 3;
            i5 = 1048575;
        }
        og5 og5Var = this.m;
        int a = og5Var.a(og5Var.d(obj)) + i7;
        if (this.f) {
            this.n.a(obj);
            throw null;
        }
        return a;
    }

    public final void K(Object obj, int i, long j) {
        Unsafe unsafe = p;
        Object o2 = o(i);
        Object object = unsafe.getObject(obj, j);
        if (jf5.b(object)) {
            if5 b = if5.a().b();
            jf5.c(b, object);
            unsafe.putObject(obj, j, b);
        }
        hf5 hf5Var = (hf5) o2;
        throw null;
    }

    public final int L(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, yc5 yc5Var) {
        Unsafe unsafe = p;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zc5.o(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zc5.b(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int l = zc5.l(bArr, i, yc5Var);
                    unsafe.putObject(obj, j, Long.valueOf(yc5Var.b));
                    unsafe.putInt(obj, j2, i4);
                    return l;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int i11 = zc5.i(bArr, i, yc5Var);
                    unsafe.putObject(obj, j, Integer.valueOf(yc5Var.a));
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zc5.o(bArr, i)));
                    int i12 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zc5.b(bArr, i)));
                    int i13 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i13;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int l2 = zc5.l(bArr, i, yc5Var);
                    unsafe.putObject(obj, j, Boolean.valueOf(yc5Var.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return l2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int i14 = zc5.i(bArr, i, yc5Var);
                    int i15 = yc5Var.a;
                    if (i15 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !dh5.d(bArr, i14, i14 + i15)) {
                        throw te5.b();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, i14, i15, re5.a));
                        i14 += i15;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return i14;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object q = q(i4, i8, obj);
                    int n = zc5.n(q, m(i8), bArr, i, i2, yc5Var);
                    z(i4, i8, obj, q);
                    return n;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int a = zc5.a(bArr, i, yc5Var);
                    unsafe.putObject(obj, j, yc5Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int i16 = zc5.i(bArr, i, yc5Var);
                    int i17 = yc5Var.a;
                    le5 l3 = l(i8);
                    if (l3 == null || l3.a(i17)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i17));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        G(obj).c(i3, Long.valueOf(i17));
                    }
                    return i16;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int i18 = zc5.i(bArr, i, yc5Var);
                    unsafe.putObject(obj, j, Integer.valueOf(ld5.e(yc5Var.a)));
                    unsafe.putInt(obj, j2, i4);
                    return i18;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int l4 = zc5.l(bArr, i, yc5Var);
                    unsafe.putObject(obj, j, Long.valueOf(ld5.f(yc5Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return l4;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object q2 = q(i4, i8, obj);
                    int m = zc5.m(q2, m(i8), bArr, i, i2, (i3 & (-8)) | 4, yc5Var);
                    z(i4, i8, obj, q2);
                    return m;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x024a, code lost:
        if (r30.b != 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x024d, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x024e, code lost:
        r12.h(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0251, code lost:
        if (r4 >= r20) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0253, code lost:
        r6 = defpackage.zc5.i(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0259, code lost:
        if (r21 == r30.a) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x025c, code lost:
        r4 = defpackage.zc5.l(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0264, code lost:
        if (r30.b == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0266, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0268, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
        if (r4 == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011a, code lost:
        r12.add(defpackage.gd5.G(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
        if (r1 >= r20) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
        r4 = defpackage.zc5.i(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
        if (r21 == r30.a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
        r1 = defpackage.zc5.i(r18, r4, r30);
        r4 = r30.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
        if (r4 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
        if (r4 > (r18.length - r1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r4 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
        r12.add(defpackage.gd5.Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0145, code lost:
        throw defpackage.te5.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014a, code lost:
        throw defpackage.te5.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014b, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01d3 -> B:109:0x01d6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01e8 -> B:104:0x01c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0264 -> B:146:0x024d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0266 -> B:147:0x024e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0139 -> B:57:0x011a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x013b -> B:58:0x0122). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01a6 -> B:89:0x0192). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01aa -> B:88:0x018e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, yc5 yc5Var) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i;
        Unsafe unsafe = p;
        qe5 qe5Var = (qe5) unsafe.getObject(obj, j2);
        if (!qe5Var.d()) {
            int size = qe5Var.size();
            qe5Var = qe5Var.e(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, qe5Var);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    sd5 sd5Var = (sd5) qe5Var;
                    int i15 = zc5.i(bArr, i14, yc5Var);
                    int i16 = yc5Var.a + i15;
                    while (i15 < i16) {
                        sd5Var.h(Double.longBitsToDouble(zc5.o(bArr, i15)));
                        i15 += 8;
                    }
                    if (i15 == i16) {
                        return i15;
                    }
                    throw te5.f();
                }
                if (i5 == 1) {
                    sd5 sd5Var2 = (sd5) qe5Var;
                    long o2 = zc5.o(bArr, i);
                    while (true) {
                        sd5Var2.h(Double.longBitsToDouble(o2));
                        i8 = i14 + 8;
                        if (i8 < i2) {
                            int i17 = zc5.i(bArr, i8, yc5Var);
                            if (i3 == yc5Var.a) {
                                o2 = zc5.o(bArr, i17);
                                i14 = i17;
                            }
                        }
                    }
                    return i8;
                }
                return i14;
            case 19:
            case 36:
                if (i5 == 2) {
                    be5 be5Var = (be5) qe5Var;
                    int i18 = zc5.i(bArr, i14, yc5Var);
                    int i19 = yc5Var.a + i18;
                    while (i18 < i19) {
                        be5Var.h(Float.intBitsToFloat(zc5.b(bArr, i18)));
                        i18 += 4;
                    }
                    if (i18 == i19) {
                        return i18;
                    }
                    throw te5.f();
                }
                if (i5 == 5) {
                    be5 be5Var2 = (be5) qe5Var;
                    int b = zc5.b(bArr, i);
                    while (true) {
                        be5Var2.h(Float.intBitsToFloat(b));
                        i9 = i14 + 4;
                        if (i9 < i2) {
                            int i20 = zc5.i(bArr, i9, yc5Var);
                            if (i3 == yc5Var.a) {
                                i14 = i20;
                                b = zc5.b(bArr, i20);
                            }
                        }
                    }
                    return i9;
                }
                return i14;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    df5 df5Var = (df5) qe5Var;
                    int i21 = zc5.i(bArr, i14, yc5Var);
                    int i22 = yc5Var.a + i21;
                    while (i21 < i22) {
                        i21 = zc5.l(bArr, i21, yc5Var);
                        df5Var.h(yc5Var.b);
                    }
                    if (i21 == i22) {
                        return i21;
                    }
                    throw te5.f();
                }
                if (i5 == 0) {
                    df5 df5Var2 = (df5) qe5Var;
                    do {
                        int l = zc5.l(bArr, i14, yc5Var);
                        df5Var2.h(yc5Var.b);
                        if (l < i2) {
                            i14 = zc5.i(bArr, l, yc5Var);
                        }
                        return l;
                    } while (i3 == yc5Var.a);
                    return l;
                }
                return i14;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zc5.e(bArr, i14, qe5Var, yc5Var);
                }
                if (i5 == 0) {
                    return zc5.k(i3, bArr, i, i2, qe5Var, yc5Var);
                }
                return i14;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    df5 df5Var3 = (df5) qe5Var;
                    int i23 = zc5.i(bArr, i14, yc5Var);
                    int i24 = yc5Var.a + i23;
                    while (i23 < i24) {
                        df5Var3.h(zc5.o(bArr, i23));
                        i23 += 8;
                    }
                    if (i23 == i24) {
                        return i23;
                    }
                    throw te5.f();
                }
                if (i5 == 1) {
                    df5 df5Var4 = (df5) qe5Var;
                    long o3 = zc5.o(bArr, i);
                    while (true) {
                        df5Var4.h(o3);
                        i10 = i14 + 8;
                        if (i10 < i2) {
                            int i25 = zc5.i(bArr, i10, yc5Var);
                            if (i3 == yc5Var.a) {
                                o3 = zc5.o(bArr, i25);
                                i14 = i25;
                            }
                        }
                    }
                    return i10;
                }
                return i14;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    je5 je5Var = (je5) qe5Var;
                    int i26 = zc5.i(bArr, i14, yc5Var);
                    int i27 = yc5Var.a + i26;
                    while (i26 < i27) {
                        je5Var.h(zc5.b(bArr, i26));
                        i26 += 4;
                    }
                    if (i26 == i27) {
                        return i26;
                    }
                    throw te5.f();
                }
                if (i5 == 5) {
                    je5 je5Var2 = (je5) qe5Var;
                    int b2 = zc5.b(bArr, i);
                    while (true) {
                        je5Var2.h(b2);
                        i11 = i14 + 4;
                        if (i11 < i2) {
                            int i28 = zc5.i(bArr, i11, yc5Var);
                            if (i3 == yc5Var.a) {
                                i14 = i28;
                                b2 = zc5.b(bArr, i28);
                            }
                        }
                    }
                    return i11;
                }
                return i14;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        ad5 ad5Var = (ad5) qe5Var;
                        int l2 = zc5.l(bArr, i14, yc5Var);
                        break;
                    }
                    return i14;
                }
                ad5 ad5Var2 = (ad5) qe5Var;
                i12 = zc5.i(bArr, i14, yc5Var);
                int i29 = yc5Var.a + i12;
                while (i12 < i29) {
                    i12 = zc5.l(bArr, i12, yc5Var);
                    ad5Var2.h(yc5Var.b != 0);
                }
                if (i12 != i29) {
                    throw te5.f();
                }
                return i12;
            case 26:
                if (i5 == 2) {
                    int i30 = ((j & 536870912) > 0L ? 1 : ((j & 536870912) == 0L ? 0 : -1));
                    i14 = zc5.i(bArr, i14, yc5Var);
                    if (i30 == 0) {
                        int i31 = yc5Var.a;
                        if (i31 < 0) {
                            throw te5.d();
                        }
                        if (i31 != 0) {
                            String str = new String(bArr, i14, i31, re5.a);
                            qe5Var.add(str);
                            i14 += i31;
                            if (i14 < i2) {
                                int i32 = zc5.i(bArr, i14, yc5Var);
                                if (i3 == yc5Var.a) {
                                    i14 = zc5.i(bArr, i32, yc5Var);
                                    i31 = yc5Var.a;
                                    if (i31 < 0) {
                                        throw te5.d();
                                    }
                                    if (i31 != 0) {
                                        str = new String(bArr, i14, i31, re5.a);
                                        qe5Var.add(str);
                                        i14 += i31;
                                        if (i14 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        qe5Var.add("");
                        if (i14 < i2) {
                        }
                    } else {
                        int i33 = yc5Var.a;
                        if (i33 < 0) {
                            throw te5.d();
                        }
                        if (i33 != 0) {
                            i13 = i14 + i33;
                            if (!dh5.d(bArr, i14, i13)) {
                                throw te5.b();
                            }
                            String str2 = new String(bArr, i14, i33, re5.a);
                            qe5Var.add(str2);
                            if (i13 < i2) {
                                int i34 = zc5.i(bArr, i13, yc5Var);
                                if (i3 == yc5Var.a) {
                                    i14 = zc5.i(bArr, i34, yc5Var);
                                    int i35 = yc5Var.a;
                                    if (i35 < 0) {
                                        throw te5.d();
                                    }
                                    if (i35 != 0) {
                                        i13 = i14 + i35;
                                        if (!dh5.d(bArr, i14, i13)) {
                                            throw te5.b();
                                        }
                                        str2 = new String(bArr, i14, i35, re5.a);
                                        qe5Var.add(str2);
                                        if (i13 < i2) {
                                        }
                                    }
                                }
                            }
                            i14 = i13;
                        }
                        i13 = i14;
                        qe5Var.add("");
                        if (i13 < i2) {
                        }
                        i14 = i13;
                    }
                }
                return i14;
            case 27:
                if (i5 == 2) {
                    return zc5.d(m(i6), i3, bArr, i, i2, qe5Var, yc5Var);
                }
                return i14;
            case 28:
                if (i5 == 2) {
                    int i36 = zc5.i(bArr, i14, yc5Var);
                    int i37 = yc5Var.a;
                    if (i37 < 0) {
                        throw te5.d();
                    }
                    if (i37 > bArr.length - i36) {
                        throw te5.f();
                    }
                }
                return i14;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        i12 = zc5.k(i3, bArr, i, i2, qe5Var, yc5Var);
                    }
                    return i14;
                }
                i12 = zc5.e(bArr, i14, qe5Var, yc5Var);
                eg5.a(obj, i4, qe5Var, l(i6), null, this.m);
                return i12;
            case 33:
            case 47:
                if (i5 == 2) {
                    je5 je5Var3 = (je5) qe5Var;
                    int i38 = zc5.i(bArr, i14, yc5Var);
                    int i39 = yc5Var.a + i38;
                    while (i38 < i39) {
                        i38 = zc5.i(bArr, i38, yc5Var);
                        je5Var3.h(ld5.e(yc5Var.a));
                    }
                    if (i38 == i39) {
                        return i38;
                    }
                    throw te5.f();
                }
                if (i5 == 0) {
                    je5 je5Var4 = (je5) qe5Var;
                    do {
                        int i40 = zc5.i(bArr, i14, yc5Var);
                        je5Var4.h(ld5.e(yc5Var.a));
                        if (i40 < i2) {
                            i14 = zc5.i(bArr, i40, yc5Var);
                        }
                        return i40;
                    } while (i3 == yc5Var.a);
                    return i40;
                }
                return i14;
            case 34:
            case 48:
                if (i5 == 2) {
                    df5 df5Var5 = (df5) qe5Var;
                    int i41 = zc5.i(bArr, i14, yc5Var);
                    int i42 = yc5Var.a + i41;
                    while (i41 < i42) {
                        i41 = zc5.l(bArr, i41, yc5Var);
                        df5Var5.h(ld5.f(yc5Var.b));
                    }
                    if (i41 == i42) {
                        return i41;
                    }
                    throw te5.f();
                }
                if (i5 == 0) {
                    df5 df5Var6 = (df5) qe5Var;
                    do {
                        int l3 = zc5.l(bArr, i14, yc5Var);
                        df5Var6.h(ld5.f(yc5Var.b));
                        if (l3 < i2) {
                            i14 = zc5.i(bArr, l3, yc5Var);
                        }
                        return l3;
                    } while (i3 == yc5Var.a);
                    return l3;
                }
                return i14;
            default:
                if (i5 == 3) {
                    dg5 m = m(i6);
                    int i43 = (i3 & (-8)) | 4;
                    int c = zc5.c(m, bArr, i, i2, i43, yc5Var);
                    while (true) {
                        qe5Var.add(yc5Var.c);
                        if (c < i2) {
                            int i44 = zc5.i(bArr, c, yc5Var);
                            if (i3 == yc5Var.a) {
                                c = zc5.c(m, bArr, i44, i2, i43, yc5Var);
                            }
                        }
                    }
                    return c;
                }
                return i14;
        }
    }

    public final int N(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int O(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.dg5
    public final void a(Object obj) {
        int i;
        if (C(obj)) {
            if (obj instanceof ie5) {
                ie5 ie5Var = (ie5) obj;
                ie5Var.o();
                ie5Var.zza = 0;
                ie5Var.m();
            }
            int length = this.a.length;
            while (i < length) {
                int O = O(i);
                int i2 = 1048575 & O;
                int i3 = (O >>> 20) & 255;
                long j = i2;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.l.b(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = p;
                                Object object = unsafe.getObject(obj, j);
                                if (object == null) {
                                    break;
                                } else {
                                    ((if5) object).c();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                }
                        }
                    } else {
                        if (!D(this.a[i], i, obj)) {
                        }
                        m(i).a(p.getObject(obj, j));
                    }
                }
                i = B(i, obj) ? 0 : i + 3;
                m(i).a(p.getObject(obj, j));
            }
            this.m.m(obj);
            if (this.f) {
                this.n.e(obj);
            }
        }
    }

    @Override // defpackage.dg5
    public final ie5 b() {
        return ((ie5) this.e).i();
    }

    @Override // defpackage.dg5
    public final void c(Object obj, Object obj2) {
        s(obj);
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int O = O(i);
            int i2 = this.a[i];
            long j = 1048575 & O;
            switch ((O >>> 20) & 255) {
                case 0:
                    if (B(i, obj2)) {
                        zg5.r(obj, j, zg5.g(j, obj2));
                        w(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (B(i, obj2)) {
                        zg5.s(obj, j, zg5.h(j, obj2));
                        w(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.u(obj, j, zg5.k(j, obj2));
                    w(i, obj);
                    break;
                case 3:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.u(obj, j, zg5.k(j, obj2));
                    w(i, obj);
                    break;
                case 4:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.t(zg5.i(j, obj2), j, obj);
                    w(i, obj);
                    break;
                case 5:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.u(obj, j, zg5.k(j, obj2));
                    w(i, obj);
                    break;
                case 6:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.t(zg5.i(j, obj2), j, obj);
                    w(i, obj);
                    break;
                case 7:
                    if (B(i, obj2)) {
                        zg5.p(obj, j, zg5.z(j, obj2));
                        w(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.v(j, obj, zg5.m(j, obj2));
                    w(i, obj);
                    break;
                case 9:
                case 17:
                    t(i, obj, obj2);
                    break;
                case 10:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.v(j, obj, zg5.m(j, obj2));
                    w(i, obj);
                    break;
                case 11:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.t(zg5.i(j, obj2), j, obj);
                    w(i, obj);
                    break;
                case 12:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.t(zg5.i(j, obj2), j, obj);
                    w(i, obj);
                    break;
                case 13:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.t(zg5.i(j, obj2), j, obj);
                    w(i, obj);
                    break;
                case 14:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.u(obj, j, zg5.k(j, obj2));
                    w(i, obj);
                    break;
                case 15:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.t(zg5.i(j, obj2), j, obj);
                    w(i, obj);
                    break;
                case 16:
                    if (!B(i, obj2)) {
                        break;
                    }
                    zg5.u(obj, j, zg5.k(j, obj2));
                    w(i, obj);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.l.c(j, obj, obj2);
                    break;
                case 50:
                    Class cls = eg5.a;
                    zg5.v(j, obj, jf5.c(zg5.m(j, obj), zg5.m(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!D(i2, i, obj2)) {
                        break;
                    }
                    zg5.v(j, obj, zg5.m(j, obj2));
                    x(i2, i, obj);
                    break;
                case 60:
                case 68:
                    u(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!D(i2, i, obj2)) {
                        break;
                    }
                    zg5.v(j, obj, zg5.m(j, obj2));
                    x(i2, i, obj);
                    break;
            }
        }
        og5 og5Var = this.m;
        Class cls2 = eg5.a;
        og5Var.o(obj, og5Var.e(og5Var.d(obj), og5Var.d(obj2)));
        if (!this.f) {
            return;
        }
        this.n.a(obj2);
        throw null;
    }

    @Override // defpackage.dg5
    public final boolean d(Object obj, Object obj2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int O = O(i);
            long j = O & 1048575;
            switch ((O >>> 20) & 255) {
                case 0:
                    if (A(i, obj, obj2) && Double.doubleToLongBits(zg5.g(j, obj)) == Double.doubleToLongBits(zg5.g(j, obj2))) {
                        break;
                    }
                    return false;
                case 1:
                    if (A(i, obj, obj2) && Float.floatToIntBits(zg5.h(j, obj)) == Float.floatToIntBits(zg5.h(j, obj2))) {
                        break;
                    }
                    return false;
                case 2:
                    if (A(i, obj, obj2) && zg5.k(j, obj) == zg5.k(j, obj2)) {
                        break;
                    }
                    return false;
                case 3:
                    if (A(i, obj, obj2) && zg5.k(j, obj) == zg5.k(j, obj2)) {
                        break;
                    }
                    return false;
                case 4:
                    if (A(i, obj, obj2) && zg5.i(j, obj) == zg5.i(j, obj2)) {
                        break;
                    }
                    return false;
                case 5:
                    if (A(i, obj, obj2) && zg5.k(j, obj) == zg5.k(j, obj2)) {
                        break;
                    }
                    return false;
                case 6:
                    if (A(i, obj, obj2) && zg5.i(j, obj) == zg5.i(j, obj2)) {
                        break;
                    }
                    return false;
                case 7:
                    if (A(i, obj, obj2) && zg5.z(j, obj) == zg5.z(j, obj2)) {
                        break;
                    }
                    return false;
                case 8:
                    if (A(i, obj, obj2) && eg5.b(zg5.m(j, obj), zg5.m(j, obj2))) {
                        break;
                    }
                    return false;
                case 9:
                    if (A(i, obj, obj2) && eg5.b(zg5.m(j, obj), zg5.m(j, obj2))) {
                        break;
                    }
                    return false;
                case 10:
                    if (A(i, obj, obj2) && eg5.b(zg5.m(j, obj), zg5.m(j, obj2))) {
                        break;
                    }
                    return false;
                case 11:
                    if (A(i, obj, obj2) && zg5.i(j, obj) == zg5.i(j, obj2)) {
                        break;
                    }
                    return false;
                case 12:
                    if (A(i, obj, obj2) && zg5.i(j, obj) == zg5.i(j, obj2)) {
                        break;
                    }
                    return false;
                case 13:
                    if (A(i, obj, obj2) && zg5.i(j, obj) == zg5.i(j, obj2)) {
                        break;
                    }
                    return false;
                case 14:
                    if (A(i, obj, obj2) && zg5.k(j, obj) == zg5.k(j, obj2)) {
                        break;
                    }
                    return false;
                case 15:
                    if (A(i, obj, obj2) && zg5.i(j, obj) == zg5.i(j, obj2)) {
                        break;
                    }
                    return false;
                case 16:
                    if (A(i, obj, obj2) && zg5.k(j, obj) == zg5.k(j, obj2)) {
                        break;
                    }
                    return false;
                case 17:
                    if (A(i, obj, obj2) && eg5.b(zg5.m(j, obj), zg5.m(j, obj2))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (eg5.b(zg5.m(j, obj), zg5.m(j, obj2))) {
                        break;
                    } else {
                        return false;
                    }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = this.a[i + 2] & 1048575;
                    if (zg5.i(j2, obj) == zg5.i(j2, obj2) && eg5.b(zg5.m(j, obj), zg5.m(j, obj2))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.m.d(obj).equals(this.m.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.n.a(obj);
        this.n.a(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x030e, code lost:
        if ((r3 instanceof defpackage.gd5) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0326, code lost:
        r4 = r5 << 3;
        r3 = defpackage.qd5.K((java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
        if ((r3 instanceof defpackage.gd5) != false) goto L54;
     */
    @Override // defpackage.dg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(Object obj) {
        long k;
        Object m;
        int i;
        int i2;
        int i3;
        long k2;
        int B;
        int C;
        int p2;
        int i4;
        if (this.h) {
            Unsafe unsafe = p;
            int i5 = 0;
            for (int i6 = 0; i6 < this.a.length; i6 += 3) {
                int O = O(i6);
                int i7 = (O >>> 20) & 255;
                int i8 = this.a[i6];
                int i9 = O & 1048575;
                if (i7 >= ae5.Q.a() && i7 <= ae5.R.a()) {
                    int i10 = this.a[i6 + 2];
                }
                long j = i9;
                switch (i7) {
                    case 0:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 8;
                        break;
                    case 1:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 4;
                        break;
                    case 2:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        k = zg5.k(j, obj);
                        C = qd5.q(k);
                        p2 = qd5.p(i8 << 3);
                        i5 = p2 + C + i5;
                    case 3:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        k = zg5.k(j, obj);
                        C = qd5.q(k);
                        p2 = qd5.p(i8 << 3);
                        i5 = p2 + C + i5;
                    case 4:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        i2 = zg5.i(j, obj);
                        i4 = i8 << 3;
                        C = qd5.J(i2);
                        p2 = qd5.p(i4);
                        i5 = p2 + C + i5;
                    case 5:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 8;
                        break;
                    case 6:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 4;
                        break;
                    case 7:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 1;
                        break;
                    case 8:
                        if (B(i6, obj)) {
                            m = zg5.m(j, obj);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = eg5.I(i8, m(i6), zg5.m(j, obj));
                        break;
                    case 10:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        m = zg5.m(j, obj);
                        int i11 = i8 << 3;
                        Logger logger = qd5.R;
                        int o2 = ((gd5) m).o();
                        B = qd5.p(i11) + qd5.p(o2) + o2;
                        break;
                    case 11:
                        if (B(i6, obj)) {
                            i = zg5.i(j, obj);
                            i4 = i8 << 3;
                            C = qd5.p(i);
                            p2 = qd5.p(i4);
                            i5 = p2 + C + i5;
                        } else {
                            continue;
                        }
                    case 12:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        i2 = zg5.i(j, obj);
                        i4 = i8 << 3;
                        C = qd5.J(i2);
                        p2 = qd5.p(i4);
                        i5 = p2 + C + i5;
                    case 13:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 4;
                        break;
                    case 14:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 8;
                        break;
                    case 15:
                        if (B(i6, obj)) {
                            i3 = zg5.i(j, obj);
                            B = qd5.p((i3 >> 31) ^ (i3 + i3)) + qd5.p(i8 << 3);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (B(i6, obj)) {
                            k2 = zg5.k(j, obj);
                            C = qd5.p(i8 << 3);
                            p2 = qd5.q((k2 >> 63) ^ (k2 + k2));
                            i5 = p2 + C + i5;
                        } else {
                            continue;
                        }
                    case 17:
                        if (!B(i6, obj)) {
                            continue;
                        }
                        B = qd5.I(i8, (nf5) zg5.m(j, obj), m(i6));
                        break;
                    case 18:
                    case 23:
                    case 32:
                        B = eg5.B(i8, (List) zg5.m(j, obj));
                        break;
                    case 19:
                    case 24:
                    case 31:
                        B = eg5.z(i8, (List) zg5.m(j, obj));
                        break;
                    case 20:
                        B = eg5.G(i8, (List) zg5.m(j, obj));
                        break;
                    case 21:
                        B = eg5.R(i8, (List) zg5.m(j, obj));
                        break;
                    case 22:
                        B = eg5.E(i8, (List) zg5.m(j, obj));
                        break;
                    case 25:
                        B = eg5.v(i8, (List) zg5.m(j, obj));
                        break;
                    case 26:
                        B = eg5.O(i8, (List) zg5.m(j, obj));
                        break;
                    case 27:
                        B = eg5.J(i8, (List) zg5.m(j, obj), m(i6));
                        break;
                    case 28:
                        B = eg5.w(i8, (List) zg5.m(j, obj));
                        break;
                    case 29:
                        B = eg5.P(i8, (List) zg5.m(j, obj));
                        break;
                    case 30:
                        B = eg5.x(i8, (List) zg5.m(j, obj));
                        break;
                    case 33:
                        B = eg5.K(i8, (List) zg5.m(j, obj));
                        break;
                    case 34:
                        B = eg5.M(i8, (List) zg5.m(j, obj));
                        break;
                    case 35:
                        C = eg5.C((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 36:
                        C = eg5.A((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 37:
                        C = eg5.H((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 38:
                        C = eg5.S((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 39:
                        C = eg5.F((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 40:
                        C = eg5.C((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 41:
                        C = eg5.A((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 42:
                        Class cls = eg5.a;
                        C = ((List) unsafe.getObject(obj, j)).size();
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 43:
                        C = eg5.Q((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 44:
                        C = eg5.y((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 45:
                        C = eg5.A((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 46:
                        C = eg5.C((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 47:
                        C = eg5.L((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 48:
                        C = eg5.N((List) unsafe.getObject(obj, j));
                        if (C <= 0) {
                            continue;
                        }
                        p2 = qd5.p(i8 << 3) + qd5.p(C);
                        i5 = p2 + C + i5;
                    case 49:
                        B = eg5.D(i8, (List) zg5.m(j, obj), m(i6));
                        break;
                    case 50:
                        jf5.a(zg5.m(j, obj), o(i6));
                        continue;
                    case 51:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 8;
                        break;
                    case 52:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 4;
                        break;
                    case 53:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        k = k(j, obj);
                        C = qd5.q(k);
                        p2 = qd5.p(i8 << 3);
                        i5 = p2 + C + i5;
                    case 54:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        k = k(j, obj);
                        C = qd5.q(k);
                        p2 = qd5.p(i8 << 3);
                        i5 = p2 + C + i5;
                    case 55:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        i2 = J(j, obj);
                        i4 = i8 << 3;
                        C = qd5.J(i2);
                        p2 = qd5.p(i4);
                        i5 = p2 + C + i5;
                    case 56:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 8;
                        break;
                    case 57:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 4;
                        break;
                    case 58:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 1;
                        break;
                    case 59:
                        if (D(i8, i6, obj)) {
                            m = zg5.m(j, obj);
                            break;
                        } else {
                            continue;
                        }
                    case 60:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = eg5.I(i8, m(i6), zg5.m(j, obj));
                        break;
                    case 61:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        m = zg5.m(j, obj);
                        int i112 = i8 << 3;
                        Logger logger2 = qd5.R;
                        int o22 = ((gd5) m).o();
                        B = qd5.p(i112) + qd5.p(o22) + o22;
                        break;
                    case 62:
                        if (D(i8, i6, obj)) {
                            i = J(j, obj);
                            i4 = i8 << 3;
                            C = qd5.p(i);
                            p2 = qd5.p(i4);
                            i5 = p2 + C + i5;
                        } else {
                            continue;
                        }
                    case 63:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        i2 = J(j, obj);
                        i4 = i8 << 3;
                        C = qd5.J(i2);
                        p2 = qd5.p(i4);
                        i5 = p2 + C + i5;
                    case 64:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 4;
                        break;
                    case 65:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.p(i8 << 3) + 8;
                        break;
                    case 66:
                        if (D(i8, i6, obj)) {
                            i3 = J(j, obj);
                            B = qd5.p((i3 >> 31) ^ (i3 + i3)) + qd5.p(i8 << 3);
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (D(i8, i6, obj)) {
                            k2 = k(j, obj);
                            C = qd5.p(i8 << 3);
                            p2 = qd5.q((k2 >> 63) ^ (k2 + k2));
                            i5 = p2 + C + i5;
                        } else {
                            continue;
                        }
                    case 68:
                        if (!D(i8, i6, obj)) {
                            continue;
                        }
                        B = qd5.I(i8, (nf5) zg5.m(j, obj), m(i6));
                        break;
                    default:
                }
                i5 += B;
            }
            og5 og5Var = this.m;
            return og5Var.a(og5Var.d(obj)) + i5;
        }
        return I(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f6, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // defpackage.dg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(Object obj) {
        int i;
        double g;
        int i2;
        float h;
        long k;
        int i3;
        boolean z;
        Object m;
        Object m2;
        int length = this.a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int O = O(i5);
            int i6 = this.a[i5];
            long j = 1048575 & O;
            int i7 = 37;
            switch ((O >>> 20) & 255) {
                case 0:
                    i = i4 * 53;
                    g = zg5.g(j, obj);
                    k = Double.doubleToLongBits(g);
                    Charset charset = re5.a;
                    i4 = i + ((int) (k ^ (k >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    h = zg5.h(j, obj);
                    i3 = Float.floatToIntBits(h);
                    i4 = i3 + i2;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i4 * 53;
                    k = zg5.k(j, obj);
                    Charset charset2 = re5.a;
                    i4 = i + ((int) (k ^ (k >>> 32)));
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i2 = i4 * 53;
                    i3 = zg5.i(j, obj);
                    i4 = i3 + i2;
                    break;
                case 7:
                    i2 = i4 * 53;
                    z = zg5.z(j, obj);
                    i3 = re5.a(z);
                    i4 = i3 + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    i3 = ((String) zg5.m(j, obj)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 9:
                    m = zg5.m(j, obj);
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i2 = i4 * 53;
                    m2 = zg5.m(j, obj);
                    i3 = m2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 17:
                    m = zg5.m(j, obj);
                    break;
                case 51:
                    if (D(i6, i5, obj)) {
                        i = i4 * 53;
                        g = ((Double) zg5.m(j, obj)).doubleValue();
                        k = Double.doubleToLongBits(g);
                        Charset charset22 = re5.a;
                        i4 = i + ((int) (k ^ (k >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(i6, i5, obj)) {
                        i2 = i4 * 53;
                        h = ((Float) zg5.m(j, obj)).floatValue();
                        i3 = Float.floatToIntBits(h);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i = i4 * 53;
                    k = k(j, obj);
                    Charset charset222 = re5.a;
                    i4 = i + ((int) (k ^ (k >>> 32)));
                    break;
                case 54:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i = i4 * 53;
                    k = k(j, obj);
                    Charset charset2222 = re5.a;
                    i4 = i + ((int) (k ^ (k >>> 32)));
                    break;
                case 55:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    i3 = J(j, obj);
                    i4 = i3 + i2;
                    break;
                case 56:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i = i4 * 53;
                    k = k(j, obj);
                    Charset charset22222 = re5.a;
                    i4 = i + ((int) (k ^ (k >>> 32)));
                    break;
                case 57:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    i3 = J(j, obj);
                    i4 = i3 + i2;
                    break;
                case 58:
                    if (D(i6, i5, obj)) {
                        i2 = i4 * 53;
                        z = ((Boolean) zg5.m(j, obj)).booleanValue();
                        i3 = re5.a(z);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    i3 = ((String) zg5.m(j, obj)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 60:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    m2 = zg5.m(j, obj);
                    i2 = i4 * 53;
                    i3 = m2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 61:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    m2 = zg5.m(j, obj);
                    i3 = m2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 62:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    i3 = J(j, obj);
                    i4 = i3 + i2;
                    break;
                case 63:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    i3 = J(j, obj);
                    i4 = i3 + i2;
                    break;
                case 64:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    i3 = J(j, obj);
                    i4 = i3 + i2;
                    break;
                case 65:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i = i4 * 53;
                    k = k(j, obj);
                    Charset charset222222 = re5.a;
                    i4 = i + ((int) (k ^ (k >>> 32)));
                    break;
                case 66:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i2 = i4 * 53;
                    i3 = J(j, obj);
                    i4 = i3 + i2;
                    break;
                case 67:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    i = i4 * 53;
                    k = k(j, obj);
                    Charset charset2222222 = re5.a;
                    i4 = i + ((int) (k ^ (k >>> 32)));
                    break;
                case 68:
                    if (!D(i6, i5, obj)) {
                        break;
                    }
                    m2 = zg5.m(j, obj);
                    i2 = i4 * 53;
                    i3 = m2.hashCode();
                    i4 = i3 + i2;
                    break;
            }
        }
        int hashCode = this.m.d(obj).hashCode() + (i4 * 53);
        if (!this.f) {
            return hashCode;
        }
        this.n.a(obj);
        throw null;
    }

    @Override // defpackage.dg5
    public final boolean g(Object obj) {
        boolean z;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i < this.j) {
                int i4 = this.i[i];
                int i5 = this.a[i4];
                int O = O(i4);
                int i6 = this.a[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    if (i7 != 1048575) {
                        i3 = p.getInt(obj, i7);
                    }
                    i2 = i7;
                }
                if ((268435456 & O) != 0) {
                    if (i2 == 1048575) {
                        z = B(i4, obj);
                    } else if ((i3 & i8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                }
                int i9 = (O >>> 20) & 255;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 != 60 && i9 != 68) {
                            if (i9 != 49) {
                                if (i9 == 50 && !((if5) zg5.m(O & 1048575, obj)).isEmpty()) {
                                    hf5 hf5Var = (hf5) o(i4);
                                    throw null;
                                }
                            }
                        } else if (D(i5, i4, obj) && !m(i4).g(zg5.m(O & 1048575, obj))) {
                            return false;
                        }
                    }
                    List list = (List) zg5.m(O & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        dg5 m = m(i4);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (!m.g(list.get(i10))) {
                                return false;
                            }
                        }
                        continue;
                    }
                } else {
                    if (i2 == 1048575) {
                        z2 = B(i4, obj);
                    } else if ((i3 & i8) == 0) {
                        z2 = false;
                    }
                    if (z2 && !m(i4).g(zg5.m(O & 1048575, obj))) {
                        return false;
                    }
                }
                i++;
            } else if (!this.f) {
                return true;
            } else {
                this.n.a(obj);
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18, types: [int] */
    @Override // defpackage.dg5
    public final void h(Object obj, byte[] bArr, int i, int i2, yc5 yc5Var) {
        byte b;
        int N;
        int i3;
        Unsafe unsafe;
        int i4;
        int i5;
        Object obj2;
        yc5 yc5Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        qf5<T> qf5Var;
        byte[] bArr2;
        int i11;
        Object obj4;
        yc5 yc5Var3;
        qf5<T> qf5Var2;
        boolean z;
        qf5<T> qf5Var3;
        int i12;
        int l;
        int i13;
        int i14;
        int i15;
        Object obj5 = obj;
        int i16 = i2;
        if (this.h) {
            s(obj);
            Unsafe unsafe2 = p;
            int i17 = -1;
            int i18 = 0;
            byte[] bArr3 = bArr;
            int i19 = i;
            yc5 yc5Var4 = yc5Var;
            Object obj6 = obj5;
            qf5<T> qf5Var4 = this;
            int i20 = -1;
            int i21 = 0;
            int i22 = 1048575;
            int i23 = 0;
            while (i19 < i16) {
                int i24 = i19 + 1;
                byte b2 = bArr3[i19];
                if (b2 < 0) {
                    int j = zc5.j(b2, bArr3, i24, yc5Var4);
                    b = yc5Var4.a;
                    i24 = j;
                } else {
                    b = b2;
                }
                int i25 = b >>> 3;
                if (i25 > i20) {
                    int i26 = i21 / 3;
                    if (i25 >= qf5Var4.c && i25 <= qf5Var4.d) {
                        N = qf5Var4.N(i25, i26);
                    }
                    N = -1;
                } else {
                    if (i25 >= qf5Var4.c && i25 <= qf5Var4.d) {
                        N = qf5Var4.N(i25, i18);
                    }
                    N = -1;
                }
                int i27 = N;
                if (i27 == i17) {
                    i3 = i25;
                } else {
                    int i28 = b & 7;
                    int[] iArr = qf5Var4.a;
                    int i29 = iArr[i27 + 1];
                    int i30 = (i29 >>> 20) & 255;
                    qf5<T> qf5Var5 = qf5Var4;
                    long j2 = i29 & 1048575;
                    if (i30 <= 17) {
                        int i31 = iArr[i27 + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        if (i33 != i22) {
                            if (i22 != 1048575) {
                                unsafe2.putInt(obj6, i22, i23);
                            }
                            if (i33 != 1048575) {
                                i23 = unsafe2.getInt(obj6, i33);
                            }
                            i22 = i33;
                        }
                        switch (i30) {
                            case 0:
                                i3 = i25;
                                i5 = i27;
                                obj4 = obj6;
                                yc5Var3 = yc5Var4;
                                qf5Var2 = qf5Var5;
                                if (i28 == 1) {
                                    zg5.r(obj4, j2, Double.longBitsToDouble(zc5.o(bArr3, i24)));
                                    i19 = i24 + 8;
                                    obj5 = obj;
                                    i23 |= i32;
                                    qf5Var4 = qf5Var2;
                                    i21 = i5;
                                    yc5Var4 = yc5Var3;
                                    obj6 = obj4;
                                    unsafe = unsafe2;
                                    i16 = i2;
                                    i20 = i3;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    i18 = 0;
                                }
                                obj5 = obj;
                                i18 = i5;
                                break;
                            case 1:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                qf5Var3 = qf5Var5;
                                if (i28 == 5) {
                                    zg5.s(obj2, j2, Float.intBitsToFloat(zc5.b(bArr3, i24)));
                                    i12 = i24 + 4;
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 2:
                            case 3:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                if (i28 == 0) {
                                    l = zc5.l(bArr3, i24, yc5Var2);
                                    unsafe2.putLong(obj, j2, yc5Var2.b);
                                    i23 |= i32;
                                    qf5Var3 = qf5Var5;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 4:
                            case 11:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                qf5Var3 = qf5Var5;
                                if (i28 == 0) {
                                    i12 = zc5.i(bArr3, i24, yc5Var2);
                                    i13 = yc5Var2.a;
                                    unsafe2.putInt(obj2, j2, i13);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 5:
                            case 14:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                if (i28 == 1) {
                                    unsafe2.putLong(obj, j2, zc5.o(bArr3, i24));
                                    i12 = i24 + 8;
                                    qf5Var3 = qf5Var5;
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 6:
                            case 13:
                                i3 = i25;
                                i5 = i27;
                                obj4 = obj6;
                                yc5Var3 = yc5Var4;
                                qf5Var2 = qf5Var5;
                                if (i28 == 5) {
                                    unsafe2.putInt(obj4, j2, zc5.b(bArr3, i24));
                                    i19 = i24 + 4;
                                    obj5 = obj;
                                    i23 |= i32;
                                    qf5Var4 = qf5Var2;
                                    i21 = i5;
                                    yc5Var4 = yc5Var3;
                                    obj6 = obj4;
                                    unsafe = unsafe2;
                                    i16 = i2;
                                    i20 = i3;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    i18 = 0;
                                }
                                obj5 = obj;
                                i18 = i5;
                                break;
                            case 7:
                                i3 = i25;
                                i5 = i27;
                                obj4 = obj6;
                                yc5Var3 = yc5Var4;
                                qf5Var2 = qf5Var5;
                                if (i28 == 0) {
                                    i19 = zc5.l(bArr3, i24, yc5Var3);
                                    if (yc5Var3.b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zg5.p(obj4, j2, z);
                                    obj5 = obj;
                                    i23 |= i32;
                                    qf5Var4 = qf5Var2;
                                    i21 = i5;
                                    yc5Var4 = yc5Var3;
                                    obj6 = obj4;
                                    unsafe = unsafe2;
                                    i16 = i2;
                                    i20 = i3;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    i18 = 0;
                                }
                                obj5 = obj;
                                i18 = i5;
                                break;
                            case 8:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                qf5Var3 = qf5Var5;
                                if (i28 == 2) {
                                    if ((i29 & 536870912) == 0) {
                                        i12 = zc5.f(bArr3, i24, yc5Var2);
                                    } else {
                                        i12 = zc5.g(bArr3, i24, yc5Var2);
                                    }
                                    unsafe2.putObject(obj2, j2, yc5Var2.c);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 9:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                if (i28 == 2) {
                                    Object p2 = qf5Var5.p(i5, obj2);
                                    i12 = zc5.n(p2, qf5Var5.m(i5), bArr, i24, i2, yc5Var);
                                    qf5Var5.y(i5, obj2, p2);
                                    qf5Var3 = qf5Var5;
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 10:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                if (i28 == 2) {
                                    i12 = zc5.a(bArr3, i24, yc5Var2);
                                    qf5Var3 = qf5Var5;
                                    unsafe2.putObject(obj2, j2, yc5Var2.c);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 12:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                if (i28 == 0) {
                                    i12 = zc5.i(bArr3, i24, yc5Var2);
                                    qf5Var3 = qf5Var5;
                                    i13 = yc5Var2.a;
                                    unsafe2.putInt(obj2, j2, i13);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 15:
                                i3 = i25;
                                i5 = i27;
                                obj2 = obj6;
                                yc5Var2 = yc5Var4;
                                if (i28 == 0) {
                                    i12 = zc5.i(bArr3, i24, yc5Var2);
                                    i13 = ld5.e(yc5Var2.a);
                                    qf5Var3 = qf5Var5;
                                    unsafe2.putInt(obj2, j2, i13);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                } else {
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                }
                            case 16:
                                if (i28 != 0) {
                                    i3 = i25;
                                    i5 = i27;
                                    obj5 = obj;
                                    i18 = i5;
                                    break;
                                } else {
                                    i3 = i25;
                                    obj2 = obj6;
                                    i14 = zc5.l(bArr3, i24, yc5Var4);
                                    i5 = i27;
                                    unsafe2.putLong(obj, j2, ld5.f(yc5Var4.b));
                                    i15 = i23 | i32;
                                    yc5Var2 = yc5Var4;
                                    qf5Var3 = qf5Var5;
                                    i23 = i15;
                                    l = i14;
                                    qf5Var = qf5Var3;
                                    i19 = l;
                                    bArr2 = bArr3;
                                    break;
                                }
                            default:
                                i3 = i25;
                                i5 = i27;
                                obj5 = obj;
                                i18 = i5;
                                break;
                        }
                    } else {
                        i3 = i25;
                        i5 = i27;
                        obj2 = obj6;
                        yc5Var2 = yc5Var4;
                        if (i30 == 27) {
                            if (i28 == 2) {
                                qe5 qe5Var = (qe5) unsafe2.getObject(obj2, j2);
                                if (!qe5Var.d()) {
                                    int size = qe5Var.size();
                                    if (size == 0) {
                                        i11 = 10;
                                    } else {
                                        i11 = size + size;
                                    }
                                    qe5Var = qe5Var.e(i11);
                                    unsafe2.putObject(obj2, j2, qe5Var);
                                }
                                int i34 = i24;
                                qf5Var = qf5Var5;
                                bArr2 = bArr3;
                                i19 = zc5.d(qf5Var5.m(i5), b, bArr, i34, i2, qe5Var, yc5Var);
                            } else {
                                i6 = i22;
                                i7 = i23;
                                i8 = i5;
                                unsafe = unsafe2;
                                i9 = i24;
                                obj3 = obj;
                            }
                        } else {
                            if (i30 <= 49) {
                                i6 = i22;
                                i8 = i5;
                                i7 = i23;
                                int i35 = i24;
                                unsafe = unsafe2;
                                i19 = M(obj, bArr, i24, i2, b, i3, i28, i5, i29, i30, j2, yc5Var);
                                if (i19 != i35) {
                                    obj5 = obj;
                                    i22 = i6;
                                    i23 = i7;
                                    i21 = i8;
                                    qf5Var4 = this;
                                    bArr3 = bArr;
                                    yc5Var4 = yc5Var;
                                    obj6 = obj5;
                                } else {
                                    i10 = i19;
                                    obj5 = obj;
                                    i4 = i10;
                                    i22 = i6;
                                    i23 = i7;
                                    i18 = i8;
                                    i19 = zc5.h(b, bArr, i4, i2, G(obj), yc5Var);
                                    i21 = i18;
                                    qf5Var4 = this;
                                    bArr3 = bArr;
                                    yc5Var4 = yc5Var;
                                    obj6 = obj5;
                                }
                            } else {
                                i6 = i22;
                                i7 = i23;
                                i8 = i5;
                                unsafe = unsafe2;
                                i9 = i24;
                                obj3 = obj;
                                if (i30 == 50) {
                                    if (i28 == 2) {
                                        K(obj3, i8, j2);
                                        throw null;
                                    }
                                } else {
                                    obj5 = obj3;
                                    i19 = L(obj, bArr, i9, i2, b, i3, i28, i29, i30, j2, i8, yc5Var);
                                    if (i19 == i9) {
                                        i10 = i19;
                                        i4 = i10;
                                        i22 = i6;
                                        i23 = i7;
                                        i18 = i8;
                                        i19 = zc5.h(b, bArr, i4, i2, G(obj), yc5Var);
                                        i21 = i18;
                                        qf5Var4 = this;
                                        bArr3 = bArr;
                                        yc5Var4 = yc5Var;
                                        obj6 = obj5;
                                    }
                                    i22 = i6;
                                    i23 = i7;
                                    i21 = i8;
                                    qf5Var4 = this;
                                    bArr3 = bArr;
                                    yc5Var4 = yc5Var;
                                    obj6 = obj5;
                                }
                            }
                            i16 = i2;
                            i20 = i3;
                            unsafe2 = unsafe;
                            i17 = -1;
                            i18 = 0;
                        }
                        obj5 = obj3;
                        i10 = i9;
                        i4 = i10;
                        i22 = i6;
                        i23 = i7;
                        i18 = i8;
                        i19 = zc5.h(b, bArr, i4, i2, G(obj), yc5Var);
                        i21 = i18;
                        qf5Var4 = this;
                        bArr3 = bArr;
                        yc5Var4 = yc5Var;
                        obj6 = obj5;
                        i16 = i2;
                        i20 = i3;
                        unsafe2 = unsafe;
                        i17 = -1;
                        i18 = 0;
                    }
                    obj5 = obj;
                    i21 = i5;
                    yc5Var4 = yc5Var2;
                    bArr3 = bArr2;
                    obj6 = obj2;
                    qf5Var4 = qf5Var;
                    i20 = i3;
                    i17 = -1;
                    i18 = 0;
                    i16 = i2;
                }
                i4 = i24;
                unsafe = unsafe2;
                i19 = zc5.h(b, bArr, i4, i2, G(obj), yc5Var);
                i21 = i18;
                qf5Var4 = this;
                bArr3 = bArr;
                yc5Var4 = yc5Var;
                obj6 = obj5;
                i16 = i2;
                i20 = i3;
                unsafe2 = unsafe;
                i17 = -1;
                i18 = 0;
            }
            int i36 = i23;
            Unsafe unsafe3 = unsafe2;
            if (i22 != 1048575) {
                unsafe3.putInt(obj5, i22, i36);
            }
            if (i19 == i2) {
                return;
            }
            throw te5.e();
        }
        F(obj, bArr, i, i2, 0, yc5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0565 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0014, B:5:0x001d, B:7:0x0021, B:22:0x0047, B:28:0x0057, B:29:0x005c, B:31:0x0062, B:33:0x0067, B:34:0x006c, B:25:0x004d, B:43:0x0088, B:48:0x009c, B:187:0x0544, B:196:0x0560, B:198:0x0565, B:199:0x056a, B:50:0x00a2, B:71:0x0151, B:51:0x00b4, B:52:0x00c2, B:81:0x01e1, B:53:0x00c8, B:54:0x00d7, B:55:0x00e6, B:56:0x00ec, B:57:0x00fd, B:59:0x010c, B:62:0x0113, B:64:0x0117, B:66:0x011d, B:67:0x0124, B:68:0x012a, B:69:0x0139, B:70:0x0140, B:72:0x0156, B:73:0x015b, B:74:0x016b, B:75:0x017d, B:76:0x018e, B:77:0x019e, B:78:0x01ae, B:79:0x01be, B:80:0x01d0, B:83:0x01e8, B:85:0x01f8, B:87:0x01fe, B:89:0x0215, B:91:0x021b, B:88:0x020c, B:93:0x0220, B:94:0x0234, B:95:0x023f, B:96:0x0244, B:97:0x024f, B:98:0x0254, B:99:0x025f, B:100:0x0264, B:101:0x026f, B:102:0x0274, B:103:0x0285, B:104:0x028f, B:105:0x0293, B:128:0x0351, B:106:0x029c, B:107:0x02a0, B:139:0x03a8, B:108:0x02a9, B:109:0x02ad, B:141:0x03b3, B:110:0x02b6, B:111:0x02ba, B:143:0x03be, B:112:0x02c3, B:113:0x02c7, B:145:0x03c9, B:114:0x02d0, B:115:0x02d4, B:147:0x03d4, B:116:0x02dd, B:117:0x02e1, B:149:0x03df, B:118:0x02ea, B:119:0x02ee, B:151:0x03ea, B:120:0x02f7, B:121:0x02fb, B:153:0x03f5, B:122:0x0304, B:123:0x0311, B:124:0x031e, B:125:0x032b, B:126:0x0338, B:127:0x034b, B:129:0x0356, B:130:0x0366, B:131:0x037a, B:136:0x0386, B:137:0x0394, B:138:0x03a2, B:140:0x03ad, B:142:0x03b8, B:144:0x03c3, B:146:0x03ce, B:148:0x03d9, B:150:0x03e4, B:152:0x03ef, B:154:0x03fa, B:175:0x04b0, B:155:0x040e, B:156:0x041b, B:185:0x053e, B:157:0x0421, B:158:0x042e, B:159:0x0434, B:160:0x0442, B:161:0x0451, B:163:0x0462, B:166:0x0469, B:168:0x046d, B:170:0x0473, B:171:0x0479, B:172:0x0481, B:173:0x048f, B:174:0x049d, B:176:0x04b5, B:177:0x04bc, B:178:0x04ce, B:179:0x04de, B:180:0x04ed, B:181:0x04fc, B:182:0x050b, B:183:0x051a, B:184:0x052d), top: B:218:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0014 A[SYNTHETIC] */
    @Override // defpackage.dg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, md5 md5Var, ud5 ud5Var) {
        int i;
        he5 c;
        Object d;
        int i2;
        long s;
        int i3;
        int m;
        nf5 nf5Var;
        cf5 cf5Var;
        cf5 cf5Var2;
        cf5 cf5Var3;
        cf5 cf5Var4;
        cf5 cf5Var5;
        cf5 cf5Var6;
        cf5 cf5Var7;
        cf5 cf5Var8;
        boolean z;
        cf5 cf5Var9;
        List a;
        le5 l;
        List a2;
        List a3;
        List a4;
        List a5;
        int i4;
        Object valueOf;
        int i5;
        Object valueOf2;
        nf5 nf5Var2;
        Object obj2;
        ud5Var.getClass();
        s(obj);
        og5 og5Var = this.m;
        vd5 vd5Var = this.n;
        Object obj3 = null;
        zd5 zd5Var = null;
        while (true) {
            try {
                int t = md5Var.t();
                if (t >= this.c && t <= this.d) {
                    i = N(t, 0);
                } else {
                    i = -1;
                }
                if (i < 0) {
                    if (t == Integer.MAX_VALUE) {
                        for (int i6 = this.j; i6 < this.k; i6++) {
                            n(obj, this.i[i6], obj3);
                        }
                        if (obj3 != null) {
                            og5Var.n(obj, obj3);
                            return;
                        }
                        return;
                    }
                    if (!this.f) {
                        c = null;
                    } else {
                        c = vd5Var.c(ud5Var, this.e, t);
                    }
                    if (c != null) {
                        if (zd5Var == null) {
                            zd5Var = vd5Var.b(obj);
                        }
                        d = vd5Var.d();
                        obj3 = d;
                    } else {
                        og5Var.q();
                        if (obj3 == null) {
                            obj3 = og5Var.c(obj);
                        }
                        if (!og5Var.p(obj3, md5Var)) {
                            for (int i7 = this.j; i7 < this.k; i7++) {
                                n(obj, this.i[i7], obj3);
                            }
                            if (obj3 != null) {
                                og5Var.n(obj, obj3);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int O = O(i);
                    switch ((O >>> 20) & 255) {
                        case 0:
                            md5Var.q(1);
                            zg5.r(obj, O & 1048575, md5Var.a.g());
                            w(i, obj);
                            break;
                        case 1:
                            md5Var.q(5);
                            zg5.s(obj, O & 1048575, md5Var.a.h());
                            w(i, obj);
                            break;
                        case 2:
                            i2 = O & 1048575;
                            md5Var.q(0);
                            s = md5Var.a.s();
                            zg5.u(obj, i2, s);
                            w(i, obj);
                            break;
                        case 3:
                            i2 = O & 1048575;
                            md5Var.q(0);
                            s = md5Var.a.v();
                            zg5.u(obj, i2, s);
                            w(i, obj);
                            break;
                        case 4:
                            i3 = O & 1048575;
                            md5Var.q(0);
                            m = md5Var.a.m();
                            zg5.t(m, i3, obj);
                            w(i, obj);
                            break;
                        case 5:
                            i2 = O & 1048575;
                            md5Var.q(1);
                            s = md5Var.a.r();
                            zg5.u(obj, i2, s);
                            w(i, obj);
                            break;
                        case 6:
                            i3 = O & 1048575;
                            md5Var.q(5);
                            m = md5Var.a.l();
                            zg5.t(m, i3, obj);
                            w(i, obj);
                            break;
                        case 7:
                            md5Var.q(0);
                            zg5.p(obj, O & 1048575, md5Var.a.c());
                            w(i, obj);
                            break;
                        case 8:
                            v(obj, O, md5Var);
                            w(i, obj);
                            break;
                        case 9:
                            nf5Var = (nf5) p(i, obj);
                            dg5 m2 = m(i);
                            md5Var.q(2);
                            md5Var.o(nf5Var, m2, ud5Var);
                            y(i, obj, nf5Var);
                            break;
                        case 10:
                            zg5.v(O & 1048575, obj, md5Var.u());
                            w(i, obj);
                            break;
                        case 11:
                            i3 = O & 1048575;
                            md5Var.q(0);
                            m = md5Var.a.q();
                            zg5.t(m, i3, obj);
                            w(i, obj);
                            break;
                        case 12:
                            md5Var.q(0);
                            int k = md5Var.a.k();
                            le5 l2 = l(i);
                            if (l2 != null && !l2.a(k)) {
                                Class cls = eg5.a;
                                if (obj3 == null) {
                                    d = og5Var.c(obj);
                                } else {
                                    d = obj3;
                                }
                                og5Var.l(t, k, d);
                                obj3 = d;
                                break;
                            }
                            zg5.t(k, O & 1048575, obj);
                            w(i, obj);
                            break;
                        case 13:
                            i3 = O & 1048575;
                            md5Var.q(5);
                            m = md5Var.a.n();
                            zg5.t(m, i3, obj);
                            w(i, obj);
                            break;
                        case 14:
                            i2 = O & 1048575;
                            md5Var.q(1);
                            s = md5Var.a.t();
                            zg5.u(obj, i2, s);
                            w(i, obj);
                            break;
                        case 15:
                            i3 = O & 1048575;
                            md5Var.q(0);
                            m = md5Var.a.o();
                            zg5.t(m, i3, obj);
                            w(i, obj);
                            break;
                        case 16:
                            i2 = O & 1048575;
                            md5Var.q(0);
                            s = md5Var.a.u();
                            zg5.u(obj, i2, s);
                            w(i, obj);
                            break;
                        case 17:
                            nf5Var = (nf5) p(i, obj);
                            dg5 m3 = m(i);
                            md5Var.q(3);
                            md5Var.n(nf5Var, m3, ud5Var);
                            y(i, obj, nf5Var);
                            break;
                        case 18:
                            cf5Var = this.l;
                            md5Var.x(cf5Var.a(O & 1048575, obj));
                            break;
                        case 19:
                            cf5Var2 = this.l;
                            md5Var.b(cf5Var2.a(O & 1048575, obj));
                            break;
                        case 20:
                            cf5Var3 = this.l;
                            md5Var.e(cf5Var3.a(O & 1048575, obj));
                            break;
                        case 21:
                            cf5Var4 = this.l;
                            md5Var.m(cf5Var4.a(O & 1048575, obj));
                            break;
                        case 22:
                            cf5Var5 = this.l;
                            md5Var.d(cf5Var5.a(O & 1048575, obj));
                            break;
                        case 23:
                            cf5Var6 = this.l;
                            md5Var.a(cf5Var6.a(O & 1048575, obj));
                            break;
                        case 24:
                            cf5Var7 = this.l;
                            md5Var.z(cf5Var7.a(O & 1048575, obj));
                            break;
                        case 25:
                            cf5Var8 = this.l;
                            md5Var.v(cf5Var8.a(O & 1048575, obj));
                            break;
                        case 26:
                            if ((536870912 & O) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                md5Var.k(this.l.a(O & 1048575, obj), true);
                                break;
                            } else {
                                md5Var.k(this.l.a(O & 1048575, obj), false);
                                break;
                            }
                        case 27:
                            md5Var.f(this.l.a(O & 1048575, obj), m(i), ud5Var);
                            break;
                        case 28:
                            md5Var.w(this.l.a(O & 1048575, obj));
                            break;
                        case 29:
                            cf5Var9 = this.l;
                            md5Var.l(cf5Var9.a(O & 1048575, obj));
                            break;
                        case 30:
                            a = this.l.a(O & 1048575, obj);
                            md5Var.y(a);
                            l = l(i);
                            obj3 = eg5.a(obj, t, a, l, obj3, og5Var);
                            break;
                        case 31:
                            a2 = this.l.a(O & 1048575, obj);
                            md5Var.g(a2);
                            break;
                        case 32:
                            a3 = this.l.a(O & 1048575, obj);
                            md5Var.h(a3);
                            break;
                        case 33:
                            a4 = this.l.a(O & 1048575, obj);
                            md5Var.i(a4);
                            break;
                        case 34:
                            a5 = this.l.a(O & 1048575, obj);
                            md5Var.j(a5);
                            break;
                        case 35:
                            cf5Var = this.l;
                            md5Var.x(cf5Var.a(O & 1048575, obj));
                            break;
                        case 36:
                            cf5Var2 = this.l;
                            md5Var.b(cf5Var2.a(O & 1048575, obj));
                            break;
                        case 37:
                            cf5Var3 = this.l;
                            md5Var.e(cf5Var3.a(O & 1048575, obj));
                            break;
                        case 38:
                            cf5Var4 = this.l;
                            md5Var.m(cf5Var4.a(O & 1048575, obj));
                            break;
                        case 39:
                            cf5Var5 = this.l;
                            md5Var.d(cf5Var5.a(O & 1048575, obj));
                            break;
                        case 40:
                            cf5Var6 = this.l;
                            md5Var.a(cf5Var6.a(O & 1048575, obj));
                            break;
                        case 41:
                            cf5Var7 = this.l;
                            md5Var.z(cf5Var7.a(O & 1048575, obj));
                            break;
                        case 42:
                            cf5Var8 = this.l;
                            md5Var.v(cf5Var8.a(O & 1048575, obj));
                            break;
                        case 43:
                            cf5Var9 = this.l;
                            md5Var.l(cf5Var9.a(O & 1048575, obj));
                            break;
                        case 44:
                            a = this.l.a(O & 1048575, obj);
                            md5Var.y(a);
                            l = l(i);
                            obj3 = eg5.a(obj, t, a, l, obj3, og5Var);
                            break;
                        case 45:
                            a2 = this.l.a(O & 1048575, obj);
                            md5Var.g(a2);
                            break;
                        case 46:
                            a3 = this.l.a(O & 1048575, obj);
                            md5Var.h(a3);
                            break;
                        case 47:
                            a4 = this.l.a(O & 1048575, obj);
                            md5Var.i(a4);
                            break;
                        case 48:
                            a5 = this.l.a(O & 1048575, obj);
                            md5Var.j(a5);
                            break;
                        case 49:
                            md5Var.c(this.l.a(O & 1048575, obj), m(i), ud5Var);
                            break;
                        case 50:
                            Object o2 = o(i);
                            long O2 = O(i) & 1048575;
                            Object m4 = zg5.m(O2, obj);
                            if (m4 != null) {
                                if (jf5.b(m4)) {
                                    Object b = if5.Q.b();
                                    jf5.c(b, m4);
                                    zg5.v(O2, obj, b);
                                    m4 = b;
                                }
                            } else {
                                m4 = if5.Q.b();
                                zg5.v(O2, obj, m4);
                            }
                            if5 if5Var = (if5) m4;
                            hf5 hf5Var = (hf5) o2;
                            throw null;
                            break;
                        case 51:
                            i4 = O & 1048575;
                            md5Var.q(1);
                            valueOf = Double.valueOf(md5Var.a.g());
                            zg5.v(i4, obj, valueOf);
                            x(t, i, obj);
                            break;
                        case 52:
                            i4 = O & 1048575;
                            md5Var.q(5);
                            valueOf = Float.valueOf(md5Var.a.h());
                            zg5.v(i4, obj, valueOf);
                            x(t, i, obj);
                            break;
                        case 53:
                            i5 = O & 1048575;
                            md5Var.q(0);
                            valueOf2 = Long.valueOf(md5Var.a.s());
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 54:
                            i5 = O & 1048575;
                            md5Var.q(0);
                            valueOf2 = Long.valueOf(md5Var.a.v());
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 55:
                            i5 = O & 1048575;
                            md5Var.q(0);
                            valueOf2 = Integer.valueOf(md5Var.a.m());
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 56:
                            i4 = O & 1048575;
                            md5Var.q(1);
                            valueOf = Long.valueOf(md5Var.a.r());
                            zg5.v(i4, obj, valueOf);
                            x(t, i, obj);
                            break;
                        case 57:
                            i4 = O & 1048575;
                            md5Var.q(5);
                            valueOf = Integer.valueOf(md5Var.a.l());
                            zg5.v(i4, obj, valueOf);
                            x(t, i, obj);
                            break;
                        case 58:
                            i5 = O & 1048575;
                            md5Var.q(0);
                            valueOf2 = Boolean.valueOf(md5Var.a.c());
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 59:
                            v(obj, O, md5Var);
                            x(t, i, obj);
                            break;
                        case 60:
                            nf5Var2 = (nf5) q(t, i, obj);
                            dg5 m5 = m(i);
                            md5Var.q(2);
                            md5Var.o(nf5Var2, m5, ud5Var);
                            z(t, i, obj, nf5Var2);
                            break;
                        case 61:
                            i4 = O & 1048575;
                            valueOf = md5Var.u();
                            zg5.v(i4, obj, valueOf);
                            x(t, i, obj);
                            break;
                        case 62:
                            i5 = O & 1048575;
                            md5Var.q(0);
                            valueOf2 = Integer.valueOf(md5Var.a.q());
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 63:
                            md5Var.q(0);
                            int k2 = md5Var.a.k();
                            le5 l3 = l(i);
                            if (l3 != null && !l3.a(k2)) {
                                Class cls2 = eg5.a;
                                if (obj3 == null) {
                                    obj2 = og5Var.c(obj);
                                } else {
                                    obj2 = obj3;
                                }
                                og5Var.l(t, k2, obj2);
                                obj3 = obj2;
                                break;
                            }
                            i5 = O & 1048575;
                            valueOf2 = Integer.valueOf(k2);
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 64:
                            i4 = O & 1048575;
                            md5Var.q(5);
                            valueOf = Integer.valueOf(md5Var.a.n());
                            zg5.v(i4, obj, valueOf);
                            x(t, i, obj);
                            break;
                        case 65:
                            i4 = O & 1048575;
                            md5Var.q(1);
                            valueOf = Long.valueOf(md5Var.a.t());
                            zg5.v(i4, obj, valueOf);
                            x(t, i, obj);
                            break;
                        case 66:
                            i5 = O & 1048575;
                            md5Var.q(0);
                            valueOf2 = Integer.valueOf(md5Var.a.o());
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 67:
                            i5 = O & 1048575;
                            md5Var.q(0);
                            valueOf2 = Long.valueOf(md5Var.a.u());
                            zg5.v(i5, obj, valueOf2);
                            x(t, i, obj);
                            break;
                        case 68:
                            try {
                                nf5Var2 = (nf5) q(t, i, obj);
                                dg5 m6 = m(i);
                                md5Var.q(3);
                                md5Var.n(nf5Var2, m6, ud5Var);
                                z(t, i, obj, nf5Var2);
                                break;
                            } catch (se5 unused) {
                                og5Var.q();
                                if (obj3 == null) {
                                }
                                if (og5Var.p(obj3, md5Var)) {
                                }
                            }
                            break;
                        default:
                            if (obj3 == null) {
                                try {
                                    obj3 = og5Var.c(obj);
                                } catch (se5 unused2) {
                                    og5Var.q();
                                    if (obj3 == null) {
                                        obj3 = og5Var.c(obj);
                                    }
                                    if (og5Var.p(obj3, md5Var)) {
                                        if (obj3 != null) {
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            if (!og5Var.p(obj3, md5Var)) {
                                for (int i8 = this.j; i8 < this.k; i8++) {
                                    n(obj, this.i[i8], obj3);
                                }
                                if (obj3 != null) {
                                    og5Var.n(obj, obj3);
                                    return;
                                }
                                return;
                            }
                    }
                }
            } finally {
                for (int i9 = this.j; i9 < this.k; i9++) {
                    n(obj, this.i[i9], obj3);
                }
                if (obj3 != null) {
                    og5Var.n(obj, obj3);
                }
            }
        }
    }

    @Override // defpackage.dg5
    public final void j(Object obj, rd5 rd5Var) {
        int i;
        double g;
        float h;
        long k;
        long k2;
        int i2;
        long k3;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        long k4;
        int i7;
        long k5;
        if (this.h) {
            if (!this.f) {
                int length = this.a.length;
                for (int i8 = 0; i8 < length; i8 += 3) {
                    int O = O(i8);
                    int i9 = this.a[i8];
                    switch ((O >>> 20) & 255) {
                        case 0:
                            if (B(i8, obj)) {
                                g = zg5.g(O & 1048575, obj);
                                rd5Var.g(g, i9);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (B(i8, obj)) {
                                h = zg5.h(O & 1048575, obj);
                                rd5Var.k(i9, h);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (B(i8, obj)) {
                                k = zg5.k(O & 1048575, obj);
                                rd5Var.n(k, i9);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (B(i8, obj)) {
                                k2 = zg5.k(O & 1048575, obj);
                                rd5Var.d(k2, i9);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (B(i8, obj)) {
                                i2 = zg5.i(O & 1048575, obj);
                                rd5Var.m(i9, i2);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (B(i8, obj)) {
                                k3 = zg5.k(O & 1048575, obj);
                                rd5Var.j(k3, i9);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (B(i8, obj)) {
                                i3 = zg5.i(O & 1048575, obj);
                                rd5Var.i(i9, i3);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (B(i8, obj)) {
                                z = zg5.z(O & 1048575, obj);
                                rd5Var.e(i9, z);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!B(i8, obj)) {
                                break;
                            }
                            E(i9, zg5.m(O & 1048575, obj), rd5Var);
                            break;
                        case 9:
                            if (!B(i8, obj)) {
                                break;
                            }
                            rd5Var.o(i9, m(i8), zg5.m(O & 1048575, obj));
                            break;
                        case 10:
                            if (!B(i8, obj)) {
                                break;
                            }
                            rd5Var.f(i9, (gd5) zg5.m(O & 1048575, obj));
                            break;
                        case 11:
                            if (B(i8, obj)) {
                                i4 = zg5.i(O & 1048575, obj);
                                rd5Var.c(i9, i4);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (B(i8, obj)) {
                                i5 = zg5.i(O & 1048575, obj);
                                rd5Var.h(i9, i5);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (B(i8, obj)) {
                                i6 = zg5.i(O & 1048575, obj);
                                rd5Var.p(i9, i6);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (B(i8, obj)) {
                                k4 = zg5.k(O & 1048575, obj);
                                rd5Var.q(k4, i9);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (B(i8, obj)) {
                                i7 = zg5.i(O & 1048575, obj);
                                rd5Var.a(i9, i7);
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (B(i8, obj)) {
                                k5 = zg5.k(O & 1048575, obj);
                                rd5Var.b(k5, i9);
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (!B(i8, obj)) {
                                break;
                            }
                            rd5Var.l(i9, m(i8), zg5.m(O & 1048575, obj));
                            break;
                        case 18:
                            eg5.e(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 19:
                            eg5.i(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 20:
                            eg5.l(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 21:
                            eg5.t(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 22:
                            eg5.k(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 23:
                            eg5.h(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 24:
                            eg5.g(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 25:
                            eg5.c(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 26:
                            eg5.r(i9, (List) zg5.m(O & 1048575, obj), rd5Var);
                            break;
                        case 27:
                            eg5.m(i9, (List) zg5.m(O & 1048575, obj), rd5Var, m(i8));
                            break;
                        case 28:
                            eg5.d(i9, (List) zg5.m(O & 1048575, obj), rd5Var);
                            break;
                        case 29:
                            eg5.s(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 30:
                            eg5.f(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 31:
                            eg5.n(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 32:
                            eg5.o(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 33:
                            eg5.p(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 34:
                            eg5.q(i9, (List) zg5.m(O & 1048575, obj), rd5Var, false);
                            break;
                        case 35:
                            eg5.e(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 36:
                            eg5.i(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 37:
                            eg5.l(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 38:
                            eg5.t(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 39:
                            eg5.k(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 40:
                            eg5.h(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 41:
                            eg5.g(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 42:
                            eg5.c(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 43:
                            eg5.s(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 44:
                            eg5.f(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 45:
                            eg5.n(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 46:
                            eg5.o(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 47:
                            eg5.p(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 48:
                            eg5.q(i9, (List) zg5.m(O & 1048575, obj), rd5Var, true);
                            break;
                        case 49:
                            eg5.j(i9, (List) zg5.m(O & 1048575, obj), rd5Var, m(i8));
                            break;
                        case 50:
                            if (zg5.m(O & 1048575, obj) != null) {
                                hf5 hf5Var = (hf5) o(i8);
                                throw null;
                            }
                            break;
                        case 51:
                            if (D(i9, i8, obj)) {
                                g = ((Double) zg5.m(O & 1048575, obj)).doubleValue();
                                rd5Var.g(g, i9);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (D(i9, i8, obj)) {
                                h = ((Float) zg5.m(O & 1048575, obj)).floatValue();
                                rd5Var.k(i9, h);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (D(i9, i8, obj)) {
                                k = k(O & 1048575, obj);
                                rd5Var.n(k, i9);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (D(i9, i8, obj)) {
                                k2 = k(O & 1048575, obj);
                                rd5Var.d(k2, i9);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (D(i9, i8, obj)) {
                                i2 = J(O & 1048575, obj);
                                rd5Var.m(i9, i2);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (D(i9, i8, obj)) {
                                k3 = k(O & 1048575, obj);
                                rd5Var.j(k3, i9);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (D(i9, i8, obj)) {
                                i3 = J(O & 1048575, obj);
                                rd5Var.i(i9, i3);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (D(i9, i8, obj)) {
                                z = ((Boolean) zg5.m(O & 1048575, obj)).booleanValue();
                                rd5Var.e(i9, z);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!D(i9, i8, obj)) {
                                break;
                            }
                            E(i9, zg5.m(O & 1048575, obj), rd5Var);
                            break;
                        case 60:
                            if (!D(i9, i8, obj)) {
                                break;
                            }
                            rd5Var.o(i9, m(i8), zg5.m(O & 1048575, obj));
                            break;
                        case 61:
                            if (!D(i9, i8, obj)) {
                                break;
                            }
                            rd5Var.f(i9, (gd5) zg5.m(O & 1048575, obj));
                            break;
                        case 62:
                            if (D(i9, i8, obj)) {
                                i4 = J(O & 1048575, obj);
                                rd5Var.c(i9, i4);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (D(i9, i8, obj)) {
                                i5 = J(O & 1048575, obj);
                                rd5Var.h(i9, i5);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (D(i9, i8, obj)) {
                                i6 = J(O & 1048575, obj);
                                rd5Var.p(i9, i6);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (D(i9, i8, obj)) {
                                k4 = k(O & 1048575, obj);
                                rd5Var.q(k4, i9);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (D(i9, i8, obj)) {
                                i7 = J(O & 1048575, obj);
                                rd5Var.a(i9, i7);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (D(i9, i8, obj)) {
                                k5 = k(O & 1048575, obj);
                                rd5Var.b(k5, i9);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!D(i9, i8, obj)) {
                                break;
                            }
                            rd5Var.l(i9, m(i8), zg5.m(O & 1048575, obj));
                            break;
                    }
                }
            } else {
                this.n.a(obj);
                throw null;
            }
        } else if (!this.f) {
            int length2 = this.a.length;
            Unsafe unsafe = p;
            int i10 = 1048575;
            int i11 = 0;
            for (int i12 = 0; i12 < length2; i12 += 3) {
                int O2 = O(i12);
                int[] iArr = this.a;
                int i13 = iArr[i12];
                int i14 = (O2 >>> 20) & 255;
                if (i14 <= 17) {
                    int i15 = iArr[i12 + 2];
                    int i16 = i15 & 1048575;
                    if (i16 != i10) {
                        i11 = unsafe.getInt(obj, i16);
                        i10 = i16;
                    }
                    i = 1 << (i15 >>> 20);
                } else {
                    i = 0;
                }
                long j = O2 & 1048575;
                switch (i14) {
                    case 0:
                        if ((i & i11) != 0) {
                            rd5Var.g(zg5.g(j, obj), i13);
                            continue;
                        }
                    case 1:
                        if ((i & i11) != 0) {
                            rd5Var.k(i13, zg5.h(j, obj));
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i & i11) != 0) {
                            rd5Var.n(unsafe.getLong(obj, j), i13);
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i & i11) != 0) {
                            rd5Var.d(unsafe.getLong(obj, j), i13);
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i & i11) != 0) {
                            rd5Var.m(i13, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i & i11) != 0) {
                            rd5Var.j(unsafe.getLong(obj, j), i13);
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i & i11) != 0) {
                            rd5Var.i(i13, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i & i11) != 0) {
                            rd5Var.e(i13, zg5.z(j, obj));
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i & i11) != 0) {
                            E(i13, unsafe.getObject(obj, j), rd5Var);
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i & i11) != 0) {
                            rd5Var.o(i13, m(i12), unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i & i11) != 0) {
                            rd5Var.f(i13, (gd5) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i & i11) != 0) {
                            rd5Var.c(i13, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i & i11) != 0) {
                            rd5Var.h(i13, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i & i11) != 0) {
                            rd5Var.p(i13, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i & i11) != 0) {
                            rd5Var.q(unsafe.getLong(obj, j), i13);
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i & i11) != 0) {
                            rd5Var.a(i13, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i & i11) != 0) {
                            rd5Var.b(unsafe.getLong(obj, j), i13);
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i & i11) != 0) {
                            rd5Var.l(i13, m(i12), unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                    case 18:
                        eg5.e(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 19:
                        eg5.i(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 20:
                        eg5.l(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 21:
                        eg5.t(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 22:
                        eg5.k(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 23:
                        eg5.h(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 24:
                        eg5.g(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 25:
                        eg5.c(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        continue;
                    case 26:
                        eg5.r(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var);
                        break;
                    case 27:
                        eg5.m(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, m(i12));
                        break;
                    case 28:
                        eg5.d(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var);
                        break;
                    case 29:
                        eg5.s(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        break;
                    case 30:
                        eg5.f(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        break;
                    case 31:
                        eg5.n(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        break;
                    case 32:
                        eg5.o(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        break;
                    case 33:
                        eg5.p(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        break;
                    case 34:
                        eg5.q(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, false);
                        break;
                    case 35:
                        eg5.e(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 36:
                        eg5.i(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 37:
                        eg5.l(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 38:
                        eg5.t(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 39:
                        eg5.k(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 40:
                        eg5.h(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 41:
                        eg5.g(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 42:
                        eg5.c(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 43:
                        eg5.s(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 44:
                        eg5.f(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 45:
                        eg5.n(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 46:
                        eg5.o(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 47:
                        eg5.p(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 48:
                        eg5.q(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, true);
                        break;
                    case 49:
                        eg5.j(this.a[i12], (List) unsafe.getObject(obj, j), rd5Var, m(i12));
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            hf5 hf5Var2 = (hf5) o(i12);
                            throw null;
                        }
                        break;
                    case 51:
                        if (D(i13, i12, obj)) {
                            rd5Var.g(((Double) zg5.m(j, obj)).doubleValue(), i13);
                            break;
                        }
                        break;
                    case 52:
                        if (D(i13, i12, obj)) {
                            rd5Var.k(i13, ((Float) zg5.m(j, obj)).floatValue());
                            break;
                        }
                        break;
                    case 53:
                        if (D(i13, i12, obj)) {
                            rd5Var.n(k(j, obj), i13);
                            break;
                        }
                        break;
                    case 54:
                        if (D(i13, i12, obj)) {
                            rd5Var.d(k(j, obj), i13);
                            break;
                        }
                        break;
                    case 55:
                        if (D(i13, i12, obj)) {
                            rd5Var.m(i13, J(j, obj));
                            break;
                        }
                        break;
                    case 56:
                        if (D(i13, i12, obj)) {
                            rd5Var.j(k(j, obj), i13);
                            break;
                        }
                        break;
                    case 57:
                        if (D(i13, i12, obj)) {
                            rd5Var.i(i13, J(j, obj));
                            break;
                        }
                        break;
                    case 58:
                        if (D(i13, i12, obj)) {
                            rd5Var.e(i13, ((Boolean) zg5.m(j, obj)).booleanValue());
                            break;
                        }
                        break;
                    case 59:
                        if (D(i13, i12, obj)) {
                            E(i13, unsafe.getObject(obj, j), rd5Var);
                            break;
                        }
                        break;
                    case 60:
                        if (D(i13, i12, obj)) {
                            rd5Var.o(i13, m(i12), unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 61:
                        if (D(i13, i12, obj)) {
                            rd5Var.f(i13, (gd5) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (D(i13, i12, obj)) {
                            rd5Var.c(i13, J(j, obj));
                            break;
                        }
                        break;
                    case 63:
                        if (D(i13, i12, obj)) {
                            rd5Var.h(i13, J(j, obj));
                            break;
                        }
                        break;
                    case 64:
                        if (D(i13, i12, obj)) {
                            rd5Var.p(i13, J(j, obj));
                            break;
                        }
                        break;
                    case 65:
                        if (D(i13, i12, obj)) {
                            rd5Var.q(k(j, obj), i13);
                            break;
                        }
                        break;
                    case 66:
                        if (D(i13, i12, obj)) {
                            rd5Var.a(i13, J(j, obj));
                            break;
                        }
                        break;
                    case 67:
                        if (D(i13, i12, obj)) {
                            rd5Var.b(k(j, obj), i13);
                            break;
                        }
                        break;
                    case 68:
                        if (D(i13, i12, obj)) {
                            rd5Var.l(i13, m(i12), unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                }
            }
        } else {
            this.n.a(obj);
            throw null;
        }
        og5 og5Var = this.m;
        og5Var.r(og5Var.d(obj), rd5Var);
    }

    public final le5 l(int i) {
        int i2 = i / 3;
        return (le5) this.b[i2 + i2 + 1];
    }

    public final dg5 m(int i) {
        Object[] objArr = this.b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        dg5 dg5Var = (dg5) objArr[i3];
        if (dg5Var != null) {
            return dg5Var;
        }
        dg5 a = vf5.c.a((Class) objArr[i3 + 1]);
        this.b[i3] = a;
        return a;
    }

    public final void n(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        Object m = zg5.m(O(i) & 1048575, obj);
        if (m == null || l(i) == null) {
            return;
        }
        if5 if5Var = (if5) m;
        hf5 hf5Var = (hf5) o(i);
        throw null;
    }

    public final Object o(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final Object p(int i, Object obj) {
        dg5 m = m(i);
        int O = O(i) & 1048575;
        if (B(i, obj)) {
            Object object = p.getObject(obj, O);
            if (C(object)) {
                return object;
            }
            ie5 b = m.b();
            if (object != null) {
                m.c(b, object);
            }
            return b;
        }
        return m.b();
    }

    public final Object q(int i, int i2, Object obj) {
        dg5 m = m(i2);
        if (D(i, i2, obj)) {
            Object object = p.getObject(obj, O(i2) & 1048575);
            if (C(object)) {
                return object;
            }
            ie5 b = m.b();
            if (object != null) {
                m.c(b, object);
            }
            return b;
        }
        return m.b();
    }

    public final void t(int i, Object obj, Object obj2) {
        if (B(i, obj2)) {
            Unsafe unsafe = p;
            long O = O(i) & 1048575;
            Object object = unsafe.getObject(obj2, O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            dg5 m = m(i);
            if (!B(i, obj)) {
                if (C(object)) {
                    ie5 b = m.b();
                    m.c(b, object);
                    unsafe.putObject(obj, O, b);
                } else {
                    unsafe.putObject(obj, O, object);
                }
                w(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, O);
            if (!C(object2)) {
                ie5 b2 = m.b();
                m.c(b2, object2);
                unsafe.putObject(obj, O, b2);
                object2 = b2;
            }
            m.c(object2, object);
        }
    }

    public final void u(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (D(i2, i, obj2)) {
            Unsafe unsafe = p;
            long O = O(i) & 1048575;
            Object object = unsafe.getObject(obj2, O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            dg5 m = m(i);
            if (!D(i2, i, obj)) {
                if (C(object)) {
                    ie5 b = m.b();
                    m.c(b, object);
                    unsafe.putObject(obj, O, b);
                } else {
                    unsafe.putObject(obj, O, object);
                }
                x(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, O);
            if (!C(object2)) {
                ie5 b2 = m.b();
                m.c(b2, object2);
                unsafe.putObject(obj, O, b2);
                object2 = b2;
            }
            m.c(object2, object);
        }
    }

    public final void v(Object obj, int i, md5 md5Var) {
        boolean z;
        int i2;
        Object u;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = i & 1048575;
            md5Var.q(2);
            u = md5Var.a.y();
        } else {
            i2 = i & 1048575;
            if (this.g) {
                md5Var.q(2);
                u = md5Var.a.x();
            } else {
                u = md5Var.u();
            }
        }
        zg5.v(i2, obj, u);
    }

    public final void w(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        zg5.t((1 << (i2 >>> 20)) | zg5.i(j, obj), j, obj);
    }

    public final void x(int i, int i2, Object obj) {
        zg5.t(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final void y(int i, Object obj, Object obj2) {
        p.putObject(obj, O(i) & 1048575, obj2);
        w(i, obj);
    }

    public final void z(int i, int i2, Object obj, Object obj2) {
        p.putObject(obj, O(i2) & 1048575, obj2);
        x(i, i2, obj);
    }
}