package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: hm3  reason: default package */
public final class hm3<T> implements lr3<T> {
    public static final int[] n = new int[0];
    public static final Unsafe o = hc4.k();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final fk3 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final wb3 k;
    public final z44 l;
    public final gl2 m;

    public hm3(int[] iArr, Object[] objArr, int i, int i2, fk3 fk3Var, boolean z, int[] iArr2, int i3, int i4, wb3 wb3Var, z44 z44Var, gl2 gl2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = z;
        this.f = gl2Var != null && gl2Var.c(fk3Var);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = wb3Var;
        this.l = z44Var;
        this.m = gl2Var;
        this.e = fk3Var;
    }

    public static u54 B(Object obj) {
        ox2 ox2Var = (ox2) obj;
        u54 u54Var = ox2Var.zzc;
        if (u54Var == u54.f) {
            u54 b = u54.b();
            ox2Var.zzc = b;
            return b;
        }
        return u54Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hm3 C(zh3 zh3Var, wb3 wb3Var, z44 z44Var, gl2 gl2Var) {
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
        Field n2;
        int i23;
        char charAt12;
        int i24;
        int i25;
        Object obj;
        Field n3;
        Object obj2;
        Field n4;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        char charAt16;
        if (!(zh3Var instanceof cr3)) {
            n24 n24Var = (n24) zh3Var;
            throw null;
        }
        cr3 cr3Var = (cr3) zh3Var;
        int d = cr3Var.d();
        String b = cr3Var.b();
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
            iArr = n;
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
        Unsafe unsafe = o;
        Object[] e = cr3Var.e();
        Class<?> cls = cr3Var.a().getClass();
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
                return new hm3(iArr2, objArr, i4, i5, cr3Var.a(), z, iArr, i6, i59, wb3Var, z44Var, gl2Var);
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
                        n3 = n(cls, (String) obj);
                        e[i82] = n3;
                    } else {
                        n3 = (Field) obj;
                    }
                    int i83 = i3;
                    int i84 = i64;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(n3);
                    int i85 = i82 + 1;
                    obj2 = e[i85];
                    if (obj2 instanceof Field) {
                        n4 = n(cls, (String) obj2);
                        e[i85] = n4;
                    } else {
                        n4 = (Field) obj2;
                    }
                    i21 = (int) unsafe.objectFieldOffset(n4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(n3);
                int i852 = i822 + 1;
                obj2 = e[i852];
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(n4);
                str = b;
                i18 = i842;
                i3 = i832;
                i20 = 0;
            } else {
                i16 = length;
                int i86 = i64;
                int i87 = i3 + 1;
                Field n5 = n(cls, (String) e[i3]);
                if (i73 == 9 || i73 == 17) {
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = n5.getType();
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(n5);
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
                                n2 = (Field) obj3;
                            } else {
                                n2 = n(cls, (String) obj3);
                                e[i96] = n2;
                            }
                            i18 = i86;
                            i20 = charAt26 % 32;
                            i21 = (int) unsafe.objectFieldOffset(n2);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(n5);
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

    public static int E(long j, Object obj) {
        return ((Integer) hc4.j(j, obj)).intValue();
    }

    public static long K(long j, Object obj) {
        return ((Long) hc4.j(j, obj)).longValue();
    }

    public static Field n(Class cls, String str) {
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

    public static void o(Object obj) {
        if (!x(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ox2) {
            return ((ox2) obj).l();
        }
        return true;
    }

    public static final void z(int i, Object obj, eh2 eh2Var) {
        if (obj instanceof String) {
            eh2Var.a.T(i, (String) obj);
            return;
        }
        eh2Var.f(i, (y82) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x042f, code lost:
        if (r6 == 1048575) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0431, code lost:
        r29.putInt(r12, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0437, code lost:
        r3 = r31.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x043b, code lost:
        if (r3 >= r31.j) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x043d, code lost:
        r5 = r31.h[r3];
        r6 = r31.a[r5];
        r6 = defpackage.hc4.j(J(r5) & 1048575, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x044f, code lost:
        if (r6 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0452, code lost:
        r7 = r5 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x045d, code lost:
        if (((defpackage.g03) r31.b[(r7 + r7) + 1]) != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x045f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0462, code lost:
        r6 = (defpackage.lf3) r6;
        r0 = (defpackage.hf3) k(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x046a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x046d, code lost:
        if (r1 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x046f, code lost:
        if (r0 != r35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0476, code lost:
        throw defpackage.p33.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0477, code lost:
        if (r0 > r35) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0479, code lost:
        if (r4 != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x047b, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0481, code lost:
        throw defpackage.p33.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A(Object obj, byte[] bArr, int i, int i2, int i3, bx1 bx1Var) {
        Unsafe unsafe;
        Object obj2;
        int I;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj3;
        bx1 bx1Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        bx1 bx1Var3;
        bx1 bx1Var4;
        long j2;
        int l;
        long j3;
        long j4;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z;
        int i29;
        Object obj4;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i30 = i2;
        o(obj);
        Unsafe unsafe2 = o;
        int i31 = 0;
        int i32 = i;
        int i33 = i3;
        bx1 bx1Var5 = bx1Var;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 1048575;
        int i38 = 0;
        while (true) {
            if (i32 < i30) {
                int i39 = i32 + 1;
                byte b = bArr2[i32];
                if (b < 0) {
                    i39 = wx1.j(b, bArr2, i39, bx1Var5);
                    b = bx1Var5.a;
                }
                int i40 = b >>> 3;
                if (i40 > i34) {
                    int i41 = i35 / 3;
                    if (i40 >= this.c && i40 <= this.d) {
                        I = I(i40, i41);
                        i4 = I;
                        if (i4 != -1) {
                            i5 = b;
                            i6 = i39;
                            i7 = i37;
                            i8 = i40;
                            unsafe = unsafe2;
                            i9 = 0;
                            i10 = i33;
                        } else {
                            int i42 = b & 7;
                            int[] iArr = this.a;
                            int i43 = iArr[i4 + 1];
                            int i44 = (i43 >>> 20) & 255;
                            long j5 = i43 & 1048575;
                            if (i44 <= 17) {
                                int i45 = iArr[i4 + 2];
                                int i46 = 1 << (i45 >>> 20);
                                int i47 = i45 & 1048575;
                                if (i47 != i37) {
                                    if (i37 != 1048575) {
                                        long j6 = i37;
                                        obj4 = obj;
                                        j = j5;
                                        unsafe2.putInt(obj4, j6, i38);
                                    } else {
                                        obj4 = obj;
                                        j = j5;
                                    }
                                    obj5 = obj4;
                                    i20 = unsafe2.getInt(obj4, i47);
                                    i21 = i47;
                                } else {
                                    obj5 = obj;
                                    j = j5;
                                    i20 = i38;
                                    i21 = i37;
                                }
                                switch (i44) {
                                    case 0:
                                        i22 = b;
                                        i23 = i4;
                                        i24 = i39;
                                        i7 = i21;
                                        bx1Var3 = bx1Var5;
                                        long j7 = j;
                                        if (i42 == 1) {
                                            hc4.n(obj5, j7, Double.longBitsToDouble(wx1.o(bArr2, i24)));
                                            i27 = i24 + 8;
                                            i25 = i27;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i9 = i23;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 1:
                                        i22 = b;
                                        i23 = i4;
                                        i24 = i39;
                                        i7 = i21;
                                        bx1Var3 = bx1Var5;
                                        long j8 = j;
                                        if (i42 == 5) {
                                            hc4.o(obj5, j8, Float.intBitsToFloat(wx1.b(bArr2, i24)));
                                            i27 = i24 + 4;
                                            i25 = i27;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i9 = i23;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                        i22 = b;
                                        i23 = i4;
                                        i24 = i39;
                                        i7 = i21;
                                        bx1Var4 = bx1Var5;
                                        j2 = j;
                                        if (i42 == 0) {
                                            l = wx1.l(bArr2, i24, bx1Var4);
                                            j3 = bx1Var4.b;
                                            unsafe2.putLong(obj, j2, j3);
                                            i20 |= i46;
                                            bx1Var5 = bx1Var4;
                                            i25 = l;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i9 = i23;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 4:
                                    case 11:
                                        i22 = b;
                                        i23 = i4;
                                        i24 = i39;
                                        i7 = i21;
                                        bx1Var3 = bx1Var5;
                                        j4 = j;
                                        if (i42 == 0) {
                                            i25 = wx1.i(bArr2, i24, bx1Var3);
                                            i26 = bx1Var3.a;
                                            unsafe2.putInt(obj5, j4, i26);
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i9 = i23;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 5:
                                    case 14:
                                        i22 = b;
                                        i23 = i4;
                                        i7 = i21;
                                        bx1Var3 = bx1Var5;
                                        long j9 = j;
                                        if (i42 == 1) {
                                            i24 = i39;
                                            unsafe2.putLong(obj, j9, wx1.o(bArr2, i39));
                                            i27 = i24 + 8;
                                            i25 = i27;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i24 = i39;
                                            i9 = i23;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 6:
                                    case 13:
                                        i22 = b;
                                        i23 = i4;
                                        i7 = i21;
                                        bx1Var3 = bx1Var5;
                                        long j10 = j;
                                        if (i42 == 5) {
                                            unsafe2.putInt(obj5, j10, wx1.b(bArr2, i39));
                                            i24 = i39;
                                            i27 = i24 + 4;
                                            i25 = i27;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i24 = i39;
                                            i9 = i23;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 7:
                                        i22 = b;
                                        i28 = i4;
                                        i7 = i21;
                                        long j11 = j;
                                        bx1Var3 = bx1Var5;
                                        if (i42 == 0) {
                                            int l2 = wx1.l(bArr2, i39, bx1Var3);
                                            if (bx1Var3.b != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            hc4.m(obj5, j11, z);
                                            i25 = l2;
                                            i23 = i28;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i24 = i39;
                                            i9 = i28;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 8:
                                        i22 = b;
                                        i28 = i4;
                                        i7 = i21;
                                        bx1Var3 = bx1Var5;
                                        if (i42 == 2) {
                                            if ((536870912 & i43) == 0) {
                                                i25 = wx1.f(bArr2, i39, bx1Var3);
                                            } else {
                                                i25 = wx1.g(bArr2, i39, bx1Var3);
                                            }
                                            unsafe2.putObject(obj5, j, bx1Var3.c);
                                            i23 = i28;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i24 = i39;
                                            i9 = i28;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 9:
                                        if (i42 == 2) {
                                            Object l3 = l(i4, obj5);
                                            i22 = b;
                                            i7 = i21;
                                            bx1Var3 = bx1Var5;
                                            int n2 = wx1.n(l3, j(i4), bArr, i39, i2, bx1Var);
                                            t(i4, obj5, l3);
                                            i25 = n2;
                                            i23 = i4;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i22 = b;
                                            i7 = i21;
                                            i9 = i4;
                                            i24 = i39;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 10:
                                        if (i42 == 2) {
                                            i25 = wx1.a(bArr2, i39, bx1Var5);
                                            i22 = b;
                                            i28 = i4;
                                            i7 = i21;
                                            bx1Var3 = bx1Var5;
                                            unsafe2.putObject(obj5, j, bx1Var3.c);
                                            i23 = i28;
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i22 = b;
                                            i9 = i4;
                                            i24 = i39;
                                            i7 = i21;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 12:
                                        if (i42 == 0) {
                                            i25 = wx1.i(bArr2, i39, bx1Var5);
                                            i26 = bx1Var5.a;
                                            int i48 = i4 / 3;
                                            g03 g03Var = (g03) this.b[i48 + i48 + 1];
                                            if (g03Var != null && !g03Var.a(i26)) {
                                                B(obj).c(b, Long.valueOf(i26));
                                                i22 = b;
                                                i29 = i4;
                                                i7 = i21;
                                                i32 = i25;
                                                i12 = i29;
                                                i18 = i22;
                                                i38 = i20;
                                                i37 = i7;
                                                i30 = i2;
                                                i33 = i3;
                                                i36 = i18;
                                                i35 = i12;
                                                i34 = i40;
                                                i31 = 0;
                                            }
                                            i22 = b;
                                            i23 = i4;
                                            i7 = i21;
                                            bx1Var3 = bx1Var5;
                                            j4 = j;
                                            unsafe2.putInt(obj5, j4, i26);
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i22 = b;
                                            i9 = i4;
                                            i24 = i39;
                                            i7 = i21;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (i42 == 0) {
                                            i25 = wx1.i(bArr2, i39, bx1Var5);
                                            i26 = pc2.a(bx1Var5.a);
                                            i22 = b;
                                            i23 = i4;
                                            i7 = i21;
                                            bx1Var3 = bx1Var5;
                                            j4 = j;
                                            unsafe2.putInt(obj5, j4, i26);
                                            i20 |= i46;
                                            bx1Var5 = bx1Var3;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i22 = b;
                                            i9 = i4;
                                            i24 = i39;
                                            i7 = i21;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    case 16:
                                        if (i42 == 0) {
                                            l = wx1.l(bArr2, i39, bx1Var5);
                                            i22 = b;
                                            j3 = pc2.b(bx1Var5.b);
                                            i23 = i4;
                                            i7 = i21;
                                            bx1Var4 = bx1Var5;
                                            j2 = j;
                                            unsafe2.putLong(obj, j2, j3);
                                            i20 |= i46;
                                            bx1Var5 = bx1Var4;
                                            i25 = l;
                                            i29 = i23;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i22 = b;
                                            i9 = i4;
                                            i24 = i39;
                                            i7 = i21;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                    default:
                                        i22 = b;
                                        i23 = i4;
                                        i24 = i39;
                                        i7 = i21;
                                        if (i42 == 3) {
                                            Object l4 = l(i23, obj5);
                                            i29 = i23;
                                            i25 = wx1.m(l4, j(i23), bArr, i24, i2, (i40 << 3) | 4, bx1Var);
                                            t(i29, obj5, l4);
                                            i20 |= i46;
                                            bx1Var5 = bx1Var;
                                            i32 = i25;
                                            i12 = i29;
                                            i18 = i22;
                                            i38 = i20;
                                            i37 = i7;
                                            i30 = i2;
                                            i33 = i3;
                                            i36 = i18;
                                            i35 = i12;
                                            i34 = i40;
                                            i31 = 0;
                                        } else {
                                            i9 = i23;
                                            i10 = i3;
                                            i6 = i24;
                                            i5 = i22;
                                            unsafe = unsafe2;
                                            i38 = i20;
                                            i8 = i40;
                                            break;
                                        }
                                }
                            } else {
                                obj5 = obj;
                                i12 = i4;
                                int i49 = i39;
                                int i50 = i37;
                                int i51 = b;
                                if (i44 == 27) {
                                    if (i42 == 2) {
                                        b13 b13Var = (b13) unsafe2.getObject(obj5, j5);
                                        if (!b13Var.d()) {
                                            int size = b13Var.size();
                                            if (size == 0) {
                                                i19 = 10;
                                            } else {
                                                i19 = size + size;
                                            }
                                            b13Var = b13Var.e(i19);
                                            unsafe2.putObject(obj5, j5, b13Var);
                                        }
                                        i18 = i51;
                                        i7 = i50;
                                        i32 = wx1.d(j(i12), i51, bArr, i49, i2, b13Var, bx1Var);
                                        bx1Var5 = bx1Var;
                                        i37 = i7;
                                        i30 = i2;
                                        i33 = i3;
                                        i36 = i18;
                                        i35 = i12;
                                        i34 = i40;
                                        i31 = 0;
                                    } else {
                                        i7 = i50;
                                        i13 = i49;
                                        i16 = i51;
                                        i14 = i38;
                                        i15 = i12;
                                        unsafe = unsafe2;
                                        i8 = i40;
                                    }
                                } else {
                                    i7 = i50;
                                    if (i44 <= 49) {
                                        i14 = i38;
                                        i8 = i40;
                                        unsafe = unsafe2;
                                        i16 = i51;
                                        i32 = H(obj, bArr, i49, i2, i51, i40, i42, i12, i43, i44, j5, bx1Var);
                                        i17 = i12;
                                        if (i32 != i49) {
                                            obj5 = obj;
                                            bArr2 = bArr;
                                            i30 = i2;
                                            i33 = i3;
                                            bx1Var5 = bx1Var;
                                            i37 = i7;
                                            i35 = i17;
                                            i36 = i16;
                                            i38 = i14;
                                            i34 = i8;
                                            unsafe2 = unsafe;
                                            i31 = 0;
                                        } else {
                                            i10 = i3;
                                            i6 = i32;
                                            i9 = i17;
                                            i5 = i16;
                                            i38 = i14;
                                        }
                                    } else {
                                        i13 = i49;
                                        i14 = i38;
                                        i15 = i12;
                                        unsafe = unsafe2;
                                        i16 = i51;
                                        i8 = i40;
                                        if (i44 == 50) {
                                            if (i42 == 2) {
                                                F(obj, i15, j5);
                                                throw null;
                                            }
                                        } else {
                                            i17 = i15;
                                            i32 = G(obj, bArr, i13, i2, i16, i8, i42, i43, i44, j5, i15, bx1Var);
                                            if (i32 != i13) {
                                                obj5 = obj;
                                                bArr2 = bArr;
                                                i30 = i2;
                                                i33 = i3;
                                                bx1Var5 = bx1Var;
                                                i37 = i7;
                                                i35 = i17;
                                                i36 = i16;
                                                i38 = i14;
                                                i34 = i8;
                                                unsafe2 = unsafe;
                                                i31 = 0;
                                            } else {
                                                i10 = i3;
                                                i6 = i32;
                                                i9 = i17;
                                                i5 = i16;
                                                i38 = i14;
                                            }
                                        }
                                    }
                                }
                                i10 = i3;
                                i6 = i13;
                                i5 = i16;
                                i38 = i14;
                                i9 = i15;
                            }
                        }
                        if (i5 != i10 && i10 != 0) {
                            obj2 = obj;
                            i32 = i6;
                            i33 = i10;
                            i36 = i5;
                            i37 = i7;
                        } else {
                            if (!this.f) {
                                bx1Var2 = bx1Var;
                                hk2 hk2Var = bx1Var2.d;
                                if (hk2Var != hk2.c) {
                                    i11 = i8;
                                    if (hk2Var.a(this.e, i11) == null) {
                                        i32 = wx1.h(i5, bArr, i6, i2, B(obj), bx1Var);
                                        obj3 = obj;
                                        i30 = i2;
                                        i33 = i10;
                                        i36 = i5;
                                        i35 = i9;
                                        bx1Var5 = bx1Var2;
                                        i34 = i11;
                                        obj5 = obj3;
                                        i37 = i7;
                                        unsafe2 = unsafe;
                                        i31 = 0;
                                        bArr2 = bArr;
                                    } else {
                                        zt2 zt2Var = (zt2) obj;
                                        throw null;
                                    }
                                } else {
                                    obj3 = obj;
                                }
                            } else {
                                obj3 = obj;
                                bx1Var2 = bx1Var;
                            }
                            i11 = i8;
                            i32 = wx1.h(i5, bArr, i6, i2, B(obj), bx1Var);
                            i30 = i2;
                            i33 = i10;
                            i36 = i5;
                            i35 = i9;
                            bx1Var5 = bx1Var2;
                            i34 = i11;
                            obj5 = obj3;
                            i37 = i7;
                            unsafe2 = unsafe;
                            i31 = 0;
                            bArr2 = bArr;
                        }
                    }
                    I = -1;
                    i4 = I;
                    if (i4 != -1) {
                    }
                    if (i5 != i10) {
                    }
                    if (!this.f) {
                    }
                    i11 = i8;
                    i32 = wx1.h(i5, bArr, i6, i2, B(obj), bx1Var);
                    i30 = i2;
                    i33 = i10;
                    i36 = i5;
                    i35 = i9;
                    bx1Var5 = bx1Var2;
                    i34 = i11;
                    obj5 = obj3;
                    i37 = i7;
                    unsafe2 = unsafe;
                    i31 = 0;
                    bArr2 = bArr;
                } else {
                    if (i40 >= this.c && i40 <= this.d) {
                        I = I(i40, i31);
                        i4 = I;
                        if (i4 != -1) {
                        }
                        if (i5 != i10) {
                        }
                        if (!this.f) {
                        }
                        i11 = i8;
                        i32 = wx1.h(i5, bArr, i6, i2, B(obj), bx1Var);
                        i30 = i2;
                        i33 = i10;
                        i36 = i5;
                        i35 = i9;
                        bx1Var5 = bx1Var2;
                        i34 = i11;
                        obj5 = obj3;
                        i37 = i7;
                        unsafe2 = unsafe;
                        i31 = 0;
                        bArr2 = bArr;
                    }
                    I = -1;
                    i4 = I;
                    if (i4 != -1) {
                    }
                    if (i5 != i10) {
                    }
                    if (!this.f) {
                    }
                    i11 = i8;
                    i32 = wx1.h(i5, bArr, i6, i2, B(obj), bx1Var);
                    i30 = i2;
                    i33 = i10;
                    i36 = i5;
                    i35 = i9;
                    bx1Var5 = bx1Var2;
                    i34 = i11;
                    obj5 = obj3;
                    i37 = i7;
                    unsafe2 = unsafe;
                    i31 = 0;
                    bArr2 = bArr;
                }
            } else {
                unsafe = unsafe2;
                obj2 = obj5;
            }
        }
    }

    public final int D(Object obj) {
        int i;
        int d0;
        int c0;
        Object object;
        int i2;
        int c02;
        int c03;
        int i3;
        int B;
        int C;
        int c04;
        Object object2;
        int i4;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        int i9 = 0;
        while (i6 < this.a.length) {
            int J = J(i6);
            int[] iArr = this.a;
            int i10 = iArr[i6];
            int i11 = (J >>> 20) & 255;
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
            long j = J & i5;
            switch (i11) {
                case 0:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 8;
                    break;
                case 1:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 4;
                    break;
                case 2:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    d0 = hg2.d0(unsafe.getLong(obj, j));
                    c0 = hg2.c0(i10 << 3);
                    i7 += c0 + d0;
                    i6 += 3;
                    i5 = 1048575;
                case 3:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    d0 = hg2.d0(unsafe.getLong(obj, j));
                    c0 = hg2.c0(i10 << 3);
                    i7 += c0 + d0;
                    i6 += 3;
                    i5 = 1048575;
                case 4:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i2 = i10 << 3;
                    d0 = hg2.a0(unsafe.getInt(obj, j));
                    c0 = hg2.c0(i2);
                    i7 += c0 + d0;
                    i6 += 3;
                    i5 = 1048575;
                case 5:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 8;
                    break;
                case 6:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 4;
                    break;
                case 7:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 1;
                    break;
                case 8:
                    if ((i9 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof y82)) {
                            i2 = i10 << 3;
                            d0 = hg2.b0((String) object);
                            c0 = hg2.c0(i2);
                            i7 += c0 + d0;
                            i6 += 3;
                            i5 = 1048575;
                        }
                        Logger logger = hg2.R;
                        int m = ((y82) object).m();
                        c02 = hg2.c0(m) + m;
                        c03 = hg2.c0(i10 << 3);
                        B = c03 + c02;
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
                    B = ss3.I(i10, j(i6), unsafe.getObject(obj, j));
                    break;
                case 10:
                    if ((i9 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        Logger logger2 = hg2.R;
                        int m2 = ((y82) object).m();
                        c02 = hg2.c0(m2) + m2;
                        c03 = hg2.c0(i10 << 3);
                        B = c03 + c02;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 11:
                    if ((i9 & i) != 0) {
                        i2 = i10 << 3;
                        d0 = hg2.c0(unsafe.getInt(obj, j));
                        c0 = hg2.c0(i2);
                        i7 += c0 + d0;
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
                    d0 = hg2.a0(unsafe.getInt(obj, j));
                    c0 = hg2.c0(i2);
                    i7 += c0 + d0;
                    i6 += 3;
                    i5 = 1048575;
                case 13:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 4;
                    break;
                case 14:
                    if ((i9 & i) == 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 8;
                    break;
                case 15:
                    if ((i9 & i) != 0) {
                        i3 = unsafe.getInt(obj, j);
                        B = hg2.c0((i3 >> 31) ^ (i3 + i3)) + hg2.c0(i10 << 3);
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 16:
                    if ((i & i9) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        c02 = hg2.c0(i10 << 3);
                        c03 = hg2.d0((j2 >> 63) ^ (j2 + j2));
                        B = c03 + c02;
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
                    B = hg2.Z(i10, (fk3) unsafe.getObject(obj, j), j(i6));
                    break;
                case 18:
                case 23:
                case 32:
                    B = ss3.B(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 19:
                case 24:
                case 31:
                    B = ss3.z(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 20:
                    B = ss3.G(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 21:
                    B = ss3.R(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 22:
                    B = ss3.E(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 25:
                    B = ss3.v(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 26:
                    B = ss3.O(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 27:
                    B = ss3.J(i10, (List) unsafe.getObject(obj, j), j(i6));
                    break;
                case 28:
                    B = ss3.w(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 29:
                    B = ss3.P(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 30:
                    B = ss3.x(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 33:
                    B = ss3.K(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 34:
                    B = ss3.M(i10, (List) unsafe.getObject(obj, j));
                    break;
                case 35:
                    C = ss3.C((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 36:
                    C = ss3.A((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 37:
                    C = ss3.H((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 38:
                    C = ss3.S((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 39:
                    C = ss3.F((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 40:
                    C = ss3.C((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 41:
                    C = ss3.A((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 42:
                    Class cls = ss3.a;
                    C = ((List) unsafe.getObject(obj, j)).size();
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 43:
                    C = ss3.Q((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 44:
                    C = ss3.y((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 45:
                    C = ss3.A((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 46:
                    C = ss3.C((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 47:
                    C = ss3.L((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 48:
                    C = ss3.N((List) unsafe.getObject(obj, j));
                    if (C <= 0) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    c04 = hg2.c0(i10 << 3) + hg2.c0(C);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 49:
                    B = ss3.D(i10, (List) unsafe.getObject(obj, j), j(i6));
                    break;
                case 50:
                    ng3.a(unsafe.getObject(obj, j), k(i6));
                    continue;
                    i6 += 3;
                    i5 = 1048575;
                case 51:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 8;
                    break;
                case 52:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 4;
                    break;
                case 53:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    C = hg2.d0(K(j, obj));
                    c04 = hg2.c0(i10 << 3);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 54:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    C = hg2.d0(K(j, obj));
                    c04 = hg2.c0(i10 << 3);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 55:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i4 = i10 << 3;
                    C = hg2.a0(E(j, obj));
                    c04 = hg2.c0(i4);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 56:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 8;
                    break;
                case 57:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 4;
                    break;
                case 58:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 1;
                    break;
                case 59:
                    if (y(i10, i6, obj)) {
                        object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof y82)) {
                            i4 = i10 << 3;
                            C = hg2.b0((String) object2);
                            c04 = hg2.c0(i4);
                            i7 = c04 + C + i7;
                            i6 += 3;
                            i5 = 1048575;
                        }
                        Logger logger3 = hg2.R;
                        int m3 = ((y82) object2).m();
                        c02 = hg2.c0(m3) + m3;
                        c03 = hg2.c0(i10 << 3);
                        B = c03 + c02;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 60:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = ss3.I(i10, j(i6), unsafe.getObject(obj, j));
                    break;
                case 61:
                    if (y(i10, i6, obj)) {
                        object2 = unsafe.getObject(obj, j);
                        Logger logger32 = hg2.R;
                        int m32 = ((y82) object2).m();
                        c02 = hg2.c0(m32) + m32;
                        c03 = hg2.c0(i10 << 3);
                        B = c03 + c02;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 62:
                    if (y(i10, i6, obj)) {
                        i4 = i10 << 3;
                        C = hg2.c0(E(j, obj));
                        c04 = hg2.c0(i4);
                        i7 = c04 + C + i7;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 63:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i4 = i10 << 3;
                    C = hg2.a0(E(j, obj));
                    c04 = hg2.c0(i4);
                    i7 = c04 + C + i7;
                    i6 += 3;
                    i5 = 1048575;
                case 64:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 4;
                    break;
                case 65:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.c0(i10 << 3) + 8;
                    break;
                case 66:
                    if (y(i10, i6, obj)) {
                        i3 = E(j, obj);
                        B = hg2.c0((i3 >> 31) ^ (i3 + i3)) + hg2.c0(i10 << 3);
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 67:
                    if (y(i10, i6, obj)) {
                        long K = K(j, obj);
                        c02 = hg2.c0(i10 << 3);
                        c03 = hg2.d0((K >> 63) ^ (K + K));
                        B = c03 + c02;
                        break;
                    } else {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 68:
                    if (!y(i10, i6, obj)) {
                        continue;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    B = hg2.Z(i10, (fk3) unsafe.getObject(obj, j), j(i6));
                    break;
                default:
                    i6 += 3;
                    i5 = 1048575;
            }
            i7 += B;
            i6 += 3;
            i5 = 1048575;
        }
        z44 z44Var = this.l;
        int a = z44Var.a(z44Var.d(obj)) + i7;
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        return a;
    }

    public final void F(Object obj, int i, long j) {
        Unsafe unsafe = o;
        Object k = k(i);
        Object object = unsafe.getObject(obj, j);
        if (!((lf3) object).d()) {
            lf3 b = lf3.a().b();
            ng3.b(b, object);
            unsafe.putObject(obj, j, b);
        }
        hf3 hf3Var = (hf3) k;
        throw null;
    }

    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, bx1 bx1Var) {
        Unsafe unsafe = o;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(wx1.o(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(wx1.b(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int l = wx1.l(bArr, i, bx1Var);
                    unsafe.putObject(obj, j, Long.valueOf(bx1Var.b));
                    unsafe.putInt(obj, j2, i4);
                    return l;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int i11 = wx1.i(bArr, i, bx1Var);
                    unsafe.putObject(obj, j, Integer.valueOf(bx1Var.a));
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(wx1.o(bArr, i)));
                    int i12 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(wx1.b(bArr, i)));
                    int i13 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i13;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int l2 = wx1.l(bArr, i, bx1Var);
                    unsafe.putObject(obj, j, Boolean.valueOf(bx1Var.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return l2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int i14 = wx1.i(bArr, i, bx1Var);
                    int i15 = bx1Var.a;
                    if (i15 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !nf4.c(bArr, i14, i14 + i15)) {
                        throw p33.a();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, i14, i15, z13.a));
                        i14 += i15;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return i14;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m = m(i4, i8, obj);
                    int n2 = wx1.n(m, j(i8), bArr, i, i2, bx1Var);
                    u(i4, i8, obj, m);
                    return n2;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int a = wx1.a(bArr, i, bx1Var);
                    unsafe.putObject(obj, j, bx1Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int i16 = wx1.i(bArr, i, bx1Var);
                    int i17 = bx1Var.a;
                    int i18 = i8 / 3;
                    g03 g03Var = (g03) this.b[i18 + i18 + 1];
                    if (g03Var == null || g03Var.a(i17)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i17));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        B(obj).c(i3, Long.valueOf(i17));
                    }
                    return i16;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int i19 = wx1.i(bArr, i, bx1Var);
                    unsafe.putObject(obj, j, Integer.valueOf(pc2.a(bx1Var.a)));
                    unsafe.putInt(obj, j2, i4);
                    return i19;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int l3 = wx1.l(bArr, i, bx1Var);
                    unsafe.putObject(obj, j, Long.valueOf(pc2.b(bx1Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return l3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object m2 = m(i4, i8, obj);
                    int m3 = wx1.m(m2, j(i8), bArr, i, i2, (i3 & (-8)) | 4, bx1Var);
                    u(i4, i8, obj, m2);
                    return m3;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02a2, code lost:
        if (r32.b != 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02a5, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02a6, code lost:
        r13.h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a9, code lost:
        if (r1 >= r22) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02ab, code lost:
        r4 = defpackage.wx1.i(r20, r1, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02b1, code lost:
        if (r23 == r32.a) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b4, code lost:
        r1 = defpackage.wx1.l(r20, r4, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02bc, code lost:
        if (r32.b == 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02be, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02c0, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
        if (r4 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
        r13.add(defpackage.y82.t(r20, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
        if (r1 >= r22) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
        r4 = defpackage.wx1.i(r20, r1, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
        if (r23 == r32.a) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
        r1 = defpackage.wx1.i(r20, r4, r32);
        r4 = r32.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
        if (r4 < 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0190, code lost:
        if (r4 > (r20.length - r1)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0192, code lost:
        if (r4 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
        r13.add(defpackage.y82.Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019e, code lost:
        throw defpackage.p33.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
        throw defpackage.p33.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a4, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0231  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01ff -> B:109:0x01eb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0203 -> B:108:0x01e7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x022c -> B:129:0x022f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0241 -> B:124:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x02bc -> B:165:0x02a5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x02be -> B:166:0x02a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0192 -> B:77:0x0173). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0194 -> B:78:0x017b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, bx1 bx1Var) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int k;
        int i13 = i;
        Unsafe unsafe = o;
        b13 b13Var = (b13) unsafe.getObject(obj, j2);
        if (!b13Var.d()) {
            int size = b13Var.size();
            b13Var = b13Var.e(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, b13Var);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    wh2 wh2Var = (wh2) b13Var;
                    int i14 = wx1.i(bArr, i13, bx1Var);
                    int i15 = bx1Var.a + i14;
                    while (i14 < i15) {
                        wh2Var.h(Double.longBitsToDouble(wx1.o(bArr, i14)));
                        i14 += 8;
                    }
                    if (i14 == i15) {
                        return i14;
                    }
                    throw p33.d();
                } else if (i5 == 1) {
                    wh2 wh2Var2 = (wh2) b13Var;
                    long o2 = wx1.o(bArr, i);
                    while (true) {
                        wh2Var2.h(Double.longBitsToDouble(o2));
                        i8 = i13 + 8;
                        if (i8 < i2) {
                            int i16 = wx1.i(bArr, i8, bx1Var);
                            if (i3 == bx1Var.a) {
                                o2 = wx1.o(bArr, i16);
                                i13 = i16;
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    oq2 oq2Var = (oq2) b13Var;
                    int i17 = wx1.i(bArr, i13, bx1Var);
                    int i18 = bx1Var.a + i17;
                    while (i17 < i18) {
                        oq2Var.h(Float.intBitsToFloat(wx1.b(bArr, i17)));
                        i17 += 4;
                    }
                    if (i17 == i18) {
                        return i17;
                    }
                    throw p33.d();
                } else if (i5 == 5) {
                    oq2 oq2Var2 = (oq2) b13Var;
                    int b = wx1.b(bArr, i);
                    while (true) {
                        oq2Var2.h(Float.intBitsToFloat(b));
                        i9 = i13 + 4;
                        if (i9 < i2) {
                            int i19 = wx1.i(bArr, i9, bx1Var);
                            if (i3 == bx1Var.a) {
                                i13 = i19;
                                b = wx1.b(bArr, i19);
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    mc3 mc3Var = (mc3) b13Var;
                    int i20 = wx1.i(bArr, i13, bx1Var);
                    int i21 = bx1Var.a + i20;
                    while (i20 < i21) {
                        i20 = wx1.l(bArr, i20, bx1Var);
                        mc3Var.h(bx1Var.b);
                    }
                    if (i20 == i21) {
                        return i20;
                    }
                    throw p33.d();
                } else if (i5 == 0) {
                    mc3 mc3Var2 = (mc3) b13Var;
                    do {
                        int l = wx1.l(bArr, i13, bx1Var);
                        mc3Var2.h(bx1Var.b);
                        if (l < i2) {
                            i13 = wx1.i(bArr, l, bx1Var);
                        }
                        return l;
                    } while (i3 == bx1Var.a);
                    return l;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return wx1.e(bArr, i13, b13Var, bx1Var);
                }
                if (i5 == 0) {
                    return wx1.k(i3, bArr, i, i2, b13Var, bx1Var);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    mc3 mc3Var3 = (mc3) b13Var;
                    int i22 = wx1.i(bArr, i13, bx1Var);
                    int i23 = bx1Var.a + i22;
                    while (i22 < i23) {
                        mc3Var3.h(wx1.o(bArr, i22));
                        i22 += 8;
                    }
                    if (i22 == i23) {
                        return i22;
                    }
                    throw p33.d();
                } else if (i5 == 1) {
                    mc3 mc3Var4 = (mc3) b13Var;
                    long o3 = wx1.o(bArr, i);
                    while (true) {
                        mc3Var4.h(o3);
                        i10 = i13 + 8;
                        if (i10 < i2) {
                            int i24 = wx1.i(bArr, i10, bx1Var);
                            if (i3 == bx1Var.a) {
                                o3 = wx1.o(bArr, i24);
                                i13 = i24;
                            }
                        }
                    }
                    return i10;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    ly2 ly2Var = (ly2) b13Var;
                    int i25 = wx1.i(bArr, i13, bx1Var);
                    int i26 = bx1Var.a + i25;
                    while (i25 < i26) {
                        ly2Var.h(wx1.b(bArr, i25));
                        i25 += 4;
                    }
                    if (i25 == i26) {
                        return i25;
                    }
                    throw p33.d();
                } else if (i5 == 5) {
                    ly2 ly2Var2 = (ly2) b13Var;
                    int b2 = wx1.b(bArr, i);
                    while (true) {
                        ly2Var2.h(b2);
                        i11 = i13 + 4;
                        if (i11 < i2) {
                            int i27 = wx1.i(bArr, i11, bx1Var);
                            if (i3 == bx1Var.a) {
                                i13 = i27;
                                b2 = wx1.b(bArr, i27);
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    zy1 zy1Var = (zy1) b13Var;
                    int i28 = wx1.i(bArr, i13, bx1Var);
                    int i29 = bx1Var.a + i28;
                    while (i28 < i29) {
                        i28 = wx1.l(bArr, i28, bx1Var);
                        zy1Var.h(bx1Var.b != 0);
                    }
                    if (i28 == i29) {
                        return i28;
                    }
                    throw p33.d();
                } else if (i5 == 0) {
                    zy1 zy1Var2 = (zy1) b13Var;
                    int l2 = wx1.l(bArr, i13, bx1Var);
                    break;
                }
                break;
            case 26:
                if (i5 == 2) {
                    int i30 = ((j & 536870912) > 0L ? 1 : ((j & 536870912) == 0L ? 0 : -1));
                    i13 = wx1.i(bArr, i13, bx1Var);
                    if (i30 == 0) {
                        int i31 = bx1Var.a;
                        if (i31 < 0) {
                            throw p33.b();
                        }
                        if (i31 != 0) {
                            String str = new String(bArr, i13, i31, z13.a);
                            b13Var.add(str);
                            i13 += i31;
                            if (i13 < i2) {
                                int i32 = wx1.i(bArr, i13, bx1Var);
                                if (i3 == bx1Var.a) {
                                    i13 = wx1.i(bArr, i32, bx1Var);
                                    i31 = bx1Var.a;
                                    if (i31 < 0) {
                                        throw p33.b();
                                    }
                                    if (i31 != 0) {
                                        str = new String(bArr, i13, i31, z13.a);
                                        b13Var.add(str);
                                        i13 += i31;
                                        if (i13 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        b13Var.add("");
                        if (i13 < i2) {
                        }
                    } else {
                        int i33 = bx1Var.a;
                        if (i33 < 0) {
                            throw p33.b();
                        }
                        if (i33 != 0) {
                            i12 = i13 + i33;
                            if (nf4.c(bArr, i13, i12)) {
                                String str2 = new String(bArr, i13, i33, z13.a);
                                b13Var.add(str2);
                                if (i12 < i2) {
                                    int i34 = wx1.i(bArr, i12, bx1Var);
                                    if (i3 == bx1Var.a) {
                                        i13 = wx1.i(bArr, i34, bx1Var);
                                        int i35 = bx1Var.a;
                                        if (i35 < 0) {
                                            throw p33.b();
                                        }
                                        if (i35 != 0) {
                                            i12 = i13 + i35;
                                            if (!nf4.c(bArr, i13, i12)) {
                                                throw p33.a();
                                            }
                                            str2 = new String(bArr, i13, i35, z13.a);
                                            b13Var.add(str2);
                                            if (i12 < i2) {
                                            }
                                        }
                                    }
                                }
                                i13 = i12;
                                break;
                            } else {
                                throw p33.a();
                            }
                        }
                        i12 = i13;
                        b13Var.add("");
                        if (i12 < i2) {
                        }
                        i13 = i12;
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return wx1.d(j(i6), i3, bArr, i, i2, b13Var, bx1Var);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int i36 = wx1.i(bArr, i13, bx1Var);
                    int i37 = bx1Var.a;
                    if (i37 < 0) {
                        throw p33.b();
                    }
                    if (i37 > bArr.length - i36) {
                        throw p33.d();
                    }
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    k = wx1.e(bArr, i13, b13Var, bx1Var);
                } else if (i5 == 0) {
                    k = wx1.k(i3, bArr, i, i2, b13Var, bx1Var);
                }
                int i38 = i6 / 3;
                g03 g03Var = (g03) this.b[i38 + i38 + 1];
                z44 z44Var = this.l;
                Class cls = ss3.a;
                if (g03Var != null) {
                    Object obj2 = null;
                    if (b13Var instanceof RandomAccess) {
                        int size2 = b13Var.size();
                        int i39 = 0;
                        for (int i40 = 0; i40 < size2; i40++) {
                            int intValue = ((Integer) b13Var.get(i40)).intValue();
                            if (g03Var.a(intValue)) {
                                if (i40 != i39) {
                                    b13Var.set(i39, Integer.valueOf(intValue));
                                }
                                i39++;
                            } else {
                                obj2 = ss3.a(obj, i4, intValue, obj2, z44Var);
                            }
                        }
                        if (i39 != size2) {
                            b13Var.subList(i39, size2).clear();
                            return k;
                        }
                    } else {
                        Iterator it = b13Var.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!g03Var.a(intValue2)) {
                                obj2 = ss3.a(obj, i4, intValue2, obj2, z44Var);
                                it.remove();
                            }
                        }
                    }
                }
                return k;
            case 33:
            case 47:
                if (i5 == 2) {
                    ly2 ly2Var3 = (ly2) b13Var;
                    int i41 = wx1.i(bArr, i13, bx1Var);
                    int i42 = bx1Var.a + i41;
                    while (i41 < i42) {
                        i41 = wx1.i(bArr, i41, bx1Var);
                        ly2Var3.h(pc2.a(bx1Var.a));
                    }
                    if (i41 == i42) {
                        return i41;
                    }
                    throw p33.d();
                } else if (i5 == 0) {
                    ly2 ly2Var4 = (ly2) b13Var;
                    do {
                        int i43 = wx1.i(bArr, i13, bx1Var);
                        ly2Var4.h(pc2.a(bx1Var.a));
                        if (i43 < i2) {
                            i13 = wx1.i(bArr, i43, bx1Var);
                        }
                        return i43;
                    } while (i3 == bx1Var.a);
                    return i43;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    mc3 mc3Var5 = (mc3) b13Var;
                    int i44 = wx1.i(bArr, i13, bx1Var);
                    int i45 = bx1Var.a + i44;
                    while (i44 < i45) {
                        i44 = wx1.l(bArr, i44, bx1Var);
                        mc3Var5.h(pc2.b(bx1Var.b));
                    }
                    if (i44 == i45) {
                        return i44;
                    }
                    throw p33.d();
                } else if (i5 == 0) {
                    mc3 mc3Var6 = (mc3) b13Var;
                    do {
                        int l3 = wx1.l(bArr, i13, bx1Var);
                        mc3Var6.h(pc2.b(bx1Var.b));
                        if (l3 < i2) {
                            i13 = wx1.i(bArr, l3, bx1Var);
                        }
                        return l3;
                    } while (i3 == bx1Var.a);
                    return l3;
                }
                break;
            default:
                if (i5 == 3) {
                    lr3 j3 = j(i6);
                    int i46 = (i3 & (-8)) | 4;
                    int c = wx1.c(j3, bArr, i, i2, i46, bx1Var);
                    while (true) {
                        b13Var.add(bx1Var.c);
                        if (c < i2) {
                            int i47 = wx1.i(bArr, c, bx1Var);
                            if (i3 == bx1Var.a) {
                                c = wx1.c(j3, bArr, i47, i2, i46, bx1Var);
                            }
                        }
                    }
                    return c;
                }
                break;
        }
        return i13;
    }

    public final int I(int i, int i2) {
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

    public final int J(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.lr3
    public final void a(Object obj) {
        int i;
        if (x(obj)) {
            if (obj instanceof ox2) {
                ox2 ox2Var = (ox2) obj;
                ox2Var.h();
                ox2Var.zza = 0;
                ox2Var.f();
            }
            int length = this.a.length;
            while (i < length) {
                int J = J(i);
                int i2 = 1048575 & J;
                int i3 = (J >>> 20) & 255;
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
                                this.k.a(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object == null) {
                                    break;
                                } else {
                                    ((lf3) object).c();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                }
                        }
                    } else {
                        if (!y(this.a[i], i, obj)) {
                        }
                        j(i).a(o.getObject(obj, j));
                    }
                }
                i = w(i, obj) ? 0 : i + 3;
                j(i).a(o.getObject(obj, j));
            }
            this.l.g(obj);
            if (this.f) {
                this.m.b(obj);
            }
        }
    }

    @Override // defpackage.lr3
    public final ox2 b() {
        return (ox2) ((ox2) this.e).m(4);
    }

    @Override // defpackage.lr3
    public final void c(Object obj, Object obj2) {
        o(obj);
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int J = J(i);
            int i2 = this.a[i];
            long j = 1048575 & J;
            switch ((J >>> 20) & 255) {
                case 0:
                    if (w(i, obj2)) {
                        hc4.n(obj, j, hc4.e(j, obj2));
                        r(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (w(i, obj2)) {
                        hc4.o(obj, j, hc4.f(j, obj2));
                        r(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.q(obj, j, hc4.h(j, obj2));
                    r(i, obj);
                    break;
                case 3:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.q(obj, j, hc4.h(j, obj2));
                    r(i, obj);
                    break;
                case 4:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.p(hc4.g(j, obj2), j, obj);
                    r(i, obj);
                    break;
                case 5:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.q(obj, j, hc4.h(j, obj2));
                    r(i, obj);
                    break;
                case 6:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.p(hc4.g(j, obj2), j, obj);
                    r(i, obj);
                    break;
                case 7:
                    if (w(i, obj2)) {
                        hc4.m(obj, j, hc4.v(j, obj2));
                        r(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.r(j, obj, hc4.j(j, obj2));
                    r(i, obj);
                    break;
                case 9:
                case 17:
                    p(i, obj, obj2);
                    break;
                case 10:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.r(j, obj, hc4.j(j, obj2));
                    r(i, obj);
                    break;
                case 11:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.p(hc4.g(j, obj2), j, obj);
                    r(i, obj);
                    break;
                case 12:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.p(hc4.g(j, obj2), j, obj);
                    r(i, obj);
                    break;
                case 13:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.p(hc4.g(j, obj2), j, obj);
                    r(i, obj);
                    break;
                case 14:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.q(obj, j, hc4.h(j, obj2));
                    r(i, obj);
                    break;
                case 15:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.p(hc4.g(j, obj2), j, obj);
                    r(i, obj);
                    break;
                case 16:
                    if (!w(i, obj2)) {
                        break;
                    }
                    hc4.q(obj, j, hc4.h(j, obj2));
                    r(i, obj);
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
                    this.k.b(j, obj, obj2);
                    break;
                case 50:
                    Class cls = ss3.a;
                    hc4.r(j, obj, ng3.b(hc4.j(j, obj), hc4.j(j, obj2)));
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
                    if (!y(i2, i, obj2)) {
                        break;
                    }
                    hc4.r(j, obj, hc4.j(j, obj2));
                    s(i2, i, obj);
                    break;
                case 60:
                case 68:
                    q(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!y(i2, i, obj2)) {
                        break;
                    }
                    hc4.r(j, obj, hc4.j(j, obj2));
                    s(i2, i, obj);
                    break;
            }
        }
        z44 z44Var = this.l;
        Class cls2 = ss3.a;
        z44Var.h(obj, z44Var.e(z44Var.d(obj), z44Var.d(obj2)));
        if (!this.f) {
            return;
        }
        this.m.a(obj2);
        throw null;
    }

    @Override // defpackage.lr3
    public final boolean d(Object obj, Object obj2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int J = J(i);
            long j = J & 1048575;
            switch ((J >>> 20) & 255) {
                case 0:
                    if (v(i, obj, obj2) && Double.doubleToLongBits(hc4.e(j, obj)) == Double.doubleToLongBits(hc4.e(j, obj2))) {
                        break;
                    }
                    return false;
                case 1:
                    if (v(i, obj, obj2) && Float.floatToIntBits(hc4.f(j, obj)) == Float.floatToIntBits(hc4.f(j, obj2))) {
                        break;
                    }
                    return false;
                case 2:
                    if (v(i, obj, obj2) && hc4.h(j, obj) == hc4.h(j, obj2)) {
                        break;
                    }
                    return false;
                case 3:
                    if (v(i, obj, obj2) && hc4.h(j, obj) == hc4.h(j, obj2)) {
                        break;
                    }
                    return false;
                case 4:
                    if (v(i, obj, obj2) && hc4.g(j, obj) == hc4.g(j, obj2)) {
                        break;
                    }
                    return false;
                case 5:
                    if (v(i, obj, obj2) && hc4.h(j, obj) == hc4.h(j, obj2)) {
                        break;
                    }
                    return false;
                case 6:
                    if (v(i, obj, obj2) && hc4.g(j, obj) == hc4.g(j, obj2)) {
                        break;
                    }
                    return false;
                case 7:
                    if (v(i, obj, obj2) && hc4.v(j, obj) == hc4.v(j, obj2)) {
                        break;
                    }
                    return false;
                case 8:
                    if (v(i, obj, obj2) && ss3.t(hc4.j(j, obj), hc4.j(j, obj2))) {
                        break;
                    }
                    return false;
                case 9:
                    if (v(i, obj, obj2) && ss3.t(hc4.j(j, obj), hc4.j(j, obj2))) {
                        break;
                    }
                    return false;
                case 10:
                    if (v(i, obj, obj2) && ss3.t(hc4.j(j, obj), hc4.j(j, obj2))) {
                        break;
                    }
                    return false;
                case 11:
                    if (v(i, obj, obj2) && hc4.g(j, obj) == hc4.g(j, obj2)) {
                        break;
                    }
                    return false;
                case 12:
                    if (v(i, obj, obj2) && hc4.g(j, obj) == hc4.g(j, obj2)) {
                        break;
                    }
                    return false;
                case 13:
                    if (v(i, obj, obj2) && hc4.g(j, obj) == hc4.g(j, obj2)) {
                        break;
                    }
                    return false;
                case 14:
                    if (v(i, obj, obj2) && hc4.h(j, obj) == hc4.h(j, obj2)) {
                        break;
                    }
                    return false;
                case 15:
                    if (v(i, obj, obj2) && hc4.g(j, obj) == hc4.g(j, obj2)) {
                        break;
                    }
                    return false;
                case 16:
                    if (v(i, obj, obj2) && hc4.h(j, obj) == hc4.h(j, obj2)) {
                        break;
                    }
                    return false;
                case 17:
                    if (v(i, obj, obj2) && ss3.t(hc4.j(j, obj), hc4.j(j, obj2))) {
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
                    if (ss3.t(hc4.j(j, obj), hc4.j(j, obj2))) {
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
                    if (hc4.g(j2, obj) == hc4.g(j2, obj2) && ss3.t(hc4.j(j, obj), hc4.j(j, obj2))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.l.d(obj).equals(this.l.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(obj);
        this.m.a(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x030e, code lost:
        if ((r3 instanceof defpackage.y82) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0326, code lost:
        r4 = r5 << 3;
        r3 = defpackage.hg2.b0((java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
        if ((r3 instanceof defpackage.y82) != false) goto L54;
     */
    @Override // defpackage.lr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(Object obj) {
        long h;
        Object j;
        int g;
        int g2;
        int g3;
        long h2;
        int B;
        int C;
        int c0;
        int i;
        if (this.g) {
            Unsafe unsafe = o;
            int i2 = 0;
            for (int i3 = 0; i3 < this.a.length; i3 += 3) {
                int J = J(i3);
                int i4 = (J >>> 20) & 255;
                int i5 = this.a[i3];
                int i6 = J & 1048575;
                if (i4 >= np2.Q.a() && i4 <= np2.R.a()) {
                    int i7 = this.a[i3 + 2];
                }
                long j2 = i6;
                switch (i4) {
                    case 0:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 8;
                        break;
                    case 1:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 4;
                        break;
                    case 2:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        h = hc4.h(j2, obj);
                        C = hg2.d0(h);
                        c0 = hg2.c0(i5 << 3);
                        i2 = c0 + C + i2;
                    case 3:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        h = hc4.h(j2, obj);
                        C = hg2.d0(h);
                        c0 = hg2.c0(i5 << 3);
                        i2 = c0 + C + i2;
                    case 4:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        g2 = hc4.g(j2, obj);
                        i = i5 << 3;
                        C = hg2.a0(g2);
                        c0 = hg2.c0(i);
                        i2 = c0 + C + i2;
                    case 5:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 8;
                        break;
                    case 6:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 4;
                        break;
                    case 7:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 1;
                        break;
                    case 8:
                        if (w(i3, obj)) {
                            j = hc4.j(j2, obj);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = ss3.I(i5, j(i3), hc4.j(j2, obj));
                        break;
                    case 10:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        j = hc4.j(j2, obj);
                        int i8 = i5 << 3;
                        Logger logger = hg2.R;
                        int m = ((y82) j).m();
                        B = hg2.c0(i8) + hg2.c0(m) + m;
                        break;
                    case 11:
                        if (w(i3, obj)) {
                            g = hc4.g(j2, obj);
                            i = i5 << 3;
                            C = hg2.c0(g);
                            c0 = hg2.c0(i);
                            i2 = c0 + C + i2;
                        } else {
                            continue;
                        }
                    case 12:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        g2 = hc4.g(j2, obj);
                        i = i5 << 3;
                        C = hg2.a0(g2);
                        c0 = hg2.c0(i);
                        i2 = c0 + C + i2;
                    case 13:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 4;
                        break;
                    case 14:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 8;
                        break;
                    case 15:
                        if (w(i3, obj)) {
                            g3 = hc4.g(j2, obj);
                            B = hg2.c0((g3 >> 31) ^ (g3 + g3)) + hg2.c0(i5 << 3);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (w(i3, obj)) {
                            h2 = hc4.h(j2, obj);
                            C = hg2.c0(i5 << 3);
                            c0 = hg2.d0((h2 >> 63) ^ (h2 + h2));
                            i2 = c0 + C + i2;
                        } else {
                            continue;
                        }
                    case 17:
                        if (!w(i3, obj)) {
                            continue;
                        }
                        B = hg2.Z(i5, (fk3) hc4.j(j2, obj), j(i3));
                        break;
                    case 18:
                    case 23:
                    case 32:
                        B = ss3.B(i5, (List) hc4.j(j2, obj));
                        break;
                    case 19:
                    case 24:
                    case 31:
                        B = ss3.z(i5, (List) hc4.j(j2, obj));
                        break;
                    case 20:
                        B = ss3.G(i5, (List) hc4.j(j2, obj));
                        break;
                    case 21:
                        B = ss3.R(i5, (List) hc4.j(j2, obj));
                        break;
                    case 22:
                        B = ss3.E(i5, (List) hc4.j(j2, obj));
                        break;
                    case 25:
                        B = ss3.v(i5, (List) hc4.j(j2, obj));
                        break;
                    case 26:
                        B = ss3.O(i5, (List) hc4.j(j2, obj));
                        break;
                    case 27:
                        B = ss3.J(i5, (List) hc4.j(j2, obj), j(i3));
                        break;
                    case 28:
                        B = ss3.w(i5, (List) hc4.j(j2, obj));
                        break;
                    case 29:
                        B = ss3.P(i5, (List) hc4.j(j2, obj));
                        break;
                    case 30:
                        B = ss3.x(i5, (List) hc4.j(j2, obj));
                        break;
                    case 33:
                        B = ss3.K(i5, (List) hc4.j(j2, obj));
                        break;
                    case 34:
                        B = ss3.M(i5, (List) hc4.j(j2, obj));
                        break;
                    case 35:
                        C = ss3.C((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 36:
                        C = ss3.A((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 37:
                        C = ss3.H((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 38:
                        C = ss3.S((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 39:
                        C = ss3.F((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 40:
                        C = ss3.C((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 41:
                        C = ss3.A((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 42:
                        Class cls = ss3.a;
                        C = ((List) unsafe.getObject(obj, j2)).size();
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 43:
                        C = ss3.Q((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 44:
                        C = ss3.y((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 45:
                        C = ss3.A((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 46:
                        C = ss3.C((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 47:
                        C = ss3.L((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 48:
                        C = ss3.N((List) unsafe.getObject(obj, j2));
                        if (C <= 0) {
                            continue;
                        }
                        c0 = hg2.c0(i5 << 3) + hg2.c0(C);
                        i2 = c0 + C + i2;
                    case 49:
                        B = ss3.D(i5, (List) hc4.j(j2, obj), j(i3));
                        break;
                    case 50:
                        ng3.a(hc4.j(j2, obj), k(i3));
                        continue;
                    case 51:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 8;
                        break;
                    case 52:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 4;
                        break;
                    case 53:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        h = K(j2, obj);
                        C = hg2.d0(h);
                        c0 = hg2.c0(i5 << 3);
                        i2 = c0 + C + i2;
                    case 54:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        h = K(j2, obj);
                        C = hg2.d0(h);
                        c0 = hg2.c0(i5 << 3);
                        i2 = c0 + C + i2;
                    case 55:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        g2 = E(j2, obj);
                        i = i5 << 3;
                        C = hg2.a0(g2);
                        c0 = hg2.c0(i);
                        i2 = c0 + C + i2;
                    case 56:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 8;
                        break;
                    case 57:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 4;
                        break;
                    case 58:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 1;
                        break;
                    case 59:
                        if (y(i5, i3, obj)) {
                            j = hc4.j(j2, obj);
                            break;
                        } else {
                            continue;
                        }
                    case 60:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = ss3.I(i5, j(i3), hc4.j(j2, obj));
                        break;
                    case 61:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        j = hc4.j(j2, obj);
                        int i82 = i5 << 3;
                        Logger logger2 = hg2.R;
                        int m2 = ((y82) j).m();
                        B = hg2.c0(i82) + hg2.c0(m2) + m2;
                        break;
                    case 62:
                        if (y(i5, i3, obj)) {
                            g = E(j2, obj);
                            i = i5 << 3;
                            C = hg2.c0(g);
                            c0 = hg2.c0(i);
                            i2 = c0 + C + i2;
                        } else {
                            continue;
                        }
                    case 63:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        g2 = E(j2, obj);
                        i = i5 << 3;
                        C = hg2.a0(g2);
                        c0 = hg2.c0(i);
                        i2 = c0 + C + i2;
                    case 64:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 4;
                        break;
                    case 65:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.c0(i5 << 3) + 8;
                        break;
                    case 66:
                        if (y(i5, i3, obj)) {
                            g3 = E(j2, obj);
                            B = hg2.c0((g3 >> 31) ^ (g3 + g3)) + hg2.c0(i5 << 3);
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (y(i5, i3, obj)) {
                            h2 = K(j2, obj);
                            C = hg2.c0(i5 << 3);
                            c0 = hg2.d0((h2 >> 63) ^ (h2 + h2));
                            i2 = c0 + C + i2;
                        } else {
                            continue;
                        }
                    case 68:
                        if (!y(i5, i3, obj)) {
                            continue;
                        }
                        B = hg2.Z(i5, (fk3) hc4.j(j2, obj), j(i3));
                        break;
                    default:
                }
                i2 += B;
            }
            z44 z44Var = this.l;
            return z44Var.a(z44Var.d(obj)) + i2;
        }
        return D(obj);
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
    @Override // defpackage.lr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(Object obj) {
        int i;
        double e;
        int i2;
        float f;
        long h;
        int g;
        boolean v;
        Object j;
        Object j2;
        int length = this.a.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int J = J(i4);
            int i5 = this.a[i4];
            long j3 = 1048575 & J;
            int i6 = 37;
            switch ((J >>> 20) & 255) {
                case 0:
                    i = i3 * 53;
                    e = hc4.e(j3, obj);
                    h = Double.doubleToLongBits(e);
                    Charset charset = z13.a;
                    i3 = i + ((int) (h ^ (h >>> 32)));
                    break;
                case 1:
                    i2 = i3 * 53;
                    f = hc4.f(j3, obj);
                    g = Float.floatToIntBits(f);
                    i3 = g + i2;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i3 * 53;
                    h = hc4.h(j3, obj);
                    Charset charset2 = z13.a;
                    i3 = i + ((int) (h ^ (h >>> 32)));
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i2 = i3 * 53;
                    g = hc4.g(j3, obj);
                    i3 = g + i2;
                    break;
                case 7:
                    i2 = i3 * 53;
                    v = hc4.v(j3, obj);
                    g = z13.a(v);
                    i3 = g + i2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    g = ((String) hc4.j(j3, obj)).hashCode();
                    i3 = g + i2;
                    break;
                case 9:
                    j = hc4.j(j3, obj);
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
                    i2 = i3 * 53;
                    j2 = hc4.j(j3, obj);
                    g = j2.hashCode();
                    i3 = g + i2;
                    break;
                case 17:
                    j = hc4.j(j3, obj);
                    break;
                case 51:
                    if (y(i5, i4, obj)) {
                        i = i3 * 53;
                        e = ((Double) hc4.j(j3, obj)).doubleValue();
                        h = Double.doubleToLongBits(e);
                        Charset charset22 = z13.a;
                        i3 = i + ((int) (h ^ (h >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(i5, i4, obj)) {
                        i2 = i3 * 53;
                        f = ((Float) hc4.j(j3, obj)).floatValue();
                        g = Float.floatToIntBits(f);
                        i3 = g + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i = i3 * 53;
                    h = K(j3, obj);
                    Charset charset222 = z13.a;
                    i3 = i + ((int) (h ^ (h >>> 32)));
                    break;
                case 54:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i = i3 * 53;
                    h = K(j3, obj);
                    Charset charset2222 = z13.a;
                    i3 = i + ((int) (h ^ (h >>> 32)));
                    break;
                case 55:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    g = E(j3, obj);
                    i3 = g + i2;
                    break;
                case 56:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i = i3 * 53;
                    h = K(j3, obj);
                    Charset charset22222 = z13.a;
                    i3 = i + ((int) (h ^ (h >>> 32)));
                    break;
                case 57:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    g = E(j3, obj);
                    i3 = g + i2;
                    break;
                case 58:
                    if (y(i5, i4, obj)) {
                        i2 = i3 * 53;
                        v = ((Boolean) hc4.j(j3, obj)).booleanValue();
                        g = z13.a(v);
                        i3 = g + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    g = ((String) hc4.j(j3, obj)).hashCode();
                    i3 = g + i2;
                    break;
                case 60:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    j2 = hc4.j(j3, obj);
                    i2 = i3 * 53;
                    g = j2.hashCode();
                    i3 = g + i2;
                    break;
                case 61:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    j2 = hc4.j(j3, obj);
                    g = j2.hashCode();
                    i3 = g + i2;
                    break;
                case 62:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    g = E(j3, obj);
                    i3 = g + i2;
                    break;
                case 63:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    g = E(j3, obj);
                    i3 = g + i2;
                    break;
                case 64:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    g = E(j3, obj);
                    i3 = g + i2;
                    break;
                case 65:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i = i3 * 53;
                    h = K(j3, obj);
                    Charset charset222222 = z13.a;
                    i3 = i + ((int) (h ^ (h >>> 32)));
                    break;
                case 66:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i2 = i3 * 53;
                    g = E(j3, obj);
                    i3 = g + i2;
                    break;
                case 67:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    i = i3 * 53;
                    h = K(j3, obj);
                    Charset charset2222222 = z13.a;
                    i3 = i + ((int) (h ^ (h >>> 32)));
                    break;
                case 68:
                    if (!y(i5, i4, obj)) {
                        break;
                    }
                    j2 = hc4.j(j3, obj);
                    i2 = i3 * 53;
                    g = j2.hashCode();
                    i3 = g + i2;
                    break;
            }
        }
        int hashCode = this.l.d(obj).hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        this.m.a(obj);
        throw null;
    }

    @Override // defpackage.lr3
    public final boolean g(Object obj) {
        boolean z;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i < this.i) {
                int i4 = this.h[i];
                int i5 = this.a[i4];
                int J = J(i4);
                int i6 = this.a[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    if (i7 != 1048575) {
                        i3 = o.getInt(obj, i7);
                    }
                    i2 = i7;
                }
                if ((268435456 & J) != 0) {
                    if (i2 == 1048575) {
                        z = w(i4, obj);
                    } else if ((i3 & i8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                }
                int i9 = (J >>> 20) & 255;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 != 60 && i9 != 68) {
                            if (i9 != 49) {
                                if (i9 == 50 && !((lf3) hc4.j(J & 1048575, obj)).isEmpty()) {
                                    hf3 hf3Var = (hf3) k(i4);
                                    throw null;
                                }
                            }
                        } else if (y(i5, i4, obj) && !j(i4).g(hc4.j(J & 1048575, obj))) {
                            return false;
                        }
                    }
                    List list = (List) hc4.j(J & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        lr3 j = j(i4);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (!j.g(list.get(i10))) {
                                return false;
                            }
                        }
                        continue;
                    }
                } else {
                    if (i2 == 1048575) {
                        z2 = w(i4, obj);
                    } else if ((i3 & i8) == 0) {
                        z2 = false;
                    }
                    if (z2 && !j(i4).g(hc4.j(J & 1048575, obj))) {
                        return false;
                    }
                }
                i++;
            } else if (!this.f) {
                return true;
            } else {
                this.m.a(obj);
                throw null;
            }
        }
    }

    @Override // defpackage.lr3
    public final void h(Object obj, eh2 eh2Var) {
        int i;
        double e;
        float f;
        long h;
        long h2;
        int g;
        long h3;
        int g2;
        boolean v;
        int g3;
        int g4;
        int g5;
        long h4;
        int g6;
        long h5;
        if (this.g) {
            if (!this.f) {
                int length = this.a.length;
                for (int i2 = 0; i2 < length; i2 += 3) {
                    int J = J(i2);
                    int i3 = this.a[i2];
                    switch ((J >>> 20) & 255) {
                        case 0:
                            if (w(i2, obj)) {
                                e = hc4.e(J & 1048575, obj);
                                eh2Var.g(e, i3);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (w(i2, obj)) {
                                f = hc4.f(J & 1048575, obj);
                                eh2Var.k(i3, f);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (w(i2, obj)) {
                                h = hc4.h(J & 1048575, obj);
                                eh2Var.n(h, i3);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (w(i2, obj)) {
                                h2 = hc4.h(J & 1048575, obj);
                                eh2Var.d(h2, i3);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (w(i2, obj)) {
                                g = hc4.g(J & 1048575, obj);
                                eh2Var.m(i3, g);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (w(i2, obj)) {
                                h3 = hc4.h(J & 1048575, obj);
                                eh2Var.j(h3, i3);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (w(i2, obj)) {
                                g2 = hc4.g(J & 1048575, obj);
                                eh2Var.i(i3, g2);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (w(i2, obj)) {
                                v = hc4.v(J & 1048575, obj);
                                eh2Var.e(i3, v);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!w(i2, obj)) {
                                break;
                            }
                            z(i3, hc4.j(J & 1048575, obj), eh2Var);
                            break;
                        case 9:
                            if (!w(i2, obj)) {
                                break;
                            }
                            eh2Var.o(i3, j(i2), hc4.j(J & 1048575, obj));
                            break;
                        case 10:
                            if (!w(i2, obj)) {
                                break;
                            }
                            eh2Var.f(i3, (y82) hc4.j(J & 1048575, obj));
                            break;
                        case 11:
                            if (w(i2, obj)) {
                                g3 = hc4.g(J & 1048575, obj);
                                eh2Var.c(i3, g3);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (w(i2, obj)) {
                                g4 = hc4.g(J & 1048575, obj);
                                eh2Var.h(i3, g4);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (w(i2, obj)) {
                                g5 = hc4.g(J & 1048575, obj);
                                eh2Var.p(i3, g5);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (w(i2, obj)) {
                                h4 = hc4.h(J & 1048575, obj);
                                eh2Var.q(h4, i3);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (w(i2, obj)) {
                                g6 = hc4.g(J & 1048575, obj);
                                eh2Var.a(i3, g6);
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (w(i2, obj)) {
                                h5 = hc4.h(J & 1048575, obj);
                                eh2Var.b(h5, i3);
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (!w(i2, obj)) {
                                break;
                            }
                            eh2Var.l(i3, j(i2), hc4.j(J & 1048575, obj));
                            break;
                        case 18:
                            ss3.d(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 19:
                            ss3.h(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 20:
                            ss3.k(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 21:
                            ss3.s(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 22:
                            ss3.j(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 23:
                            ss3.g(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 24:
                            ss3.f(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 25:
                            ss3.b(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 26:
                            ss3.q(i3, (List) hc4.j(J & 1048575, obj), eh2Var);
                            break;
                        case 27:
                            ss3.l(i3, (List) hc4.j(J & 1048575, obj), eh2Var, j(i2));
                            break;
                        case 28:
                            ss3.c(i3, (List) hc4.j(J & 1048575, obj), eh2Var);
                            break;
                        case 29:
                            ss3.r(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 30:
                            ss3.e(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 31:
                            ss3.m(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 32:
                            ss3.n(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 33:
                            ss3.o(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 34:
                            ss3.p(i3, (List) hc4.j(J & 1048575, obj), eh2Var, false);
                            break;
                        case 35:
                            ss3.d(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 36:
                            ss3.h(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 37:
                            ss3.k(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 38:
                            ss3.s(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 39:
                            ss3.j(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 40:
                            ss3.g(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 41:
                            ss3.f(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 42:
                            ss3.b(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 43:
                            ss3.r(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 44:
                            ss3.e(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 45:
                            ss3.m(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 46:
                            ss3.n(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 47:
                            ss3.o(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 48:
                            ss3.p(i3, (List) hc4.j(J & 1048575, obj), eh2Var, true);
                            break;
                        case 49:
                            ss3.i(i3, (List) hc4.j(J & 1048575, obj), eh2Var, j(i2));
                            break;
                        case 50:
                            if (hc4.j(J & 1048575, obj) != null) {
                                hf3 hf3Var = (hf3) k(i2);
                                throw null;
                            }
                            break;
                        case 51:
                            if (y(i3, i2, obj)) {
                                e = ((Double) hc4.j(J & 1048575, obj)).doubleValue();
                                eh2Var.g(e, i3);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (y(i3, i2, obj)) {
                                f = ((Float) hc4.j(J & 1048575, obj)).floatValue();
                                eh2Var.k(i3, f);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (y(i3, i2, obj)) {
                                h = K(J & 1048575, obj);
                                eh2Var.n(h, i3);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (y(i3, i2, obj)) {
                                h2 = K(J & 1048575, obj);
                                eh2Var.d(h2, i3);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (y(i3, i2, obj)) {
                                g = E(J & 1048575, obj);
                                eh2Var.m(i3, g);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (y(i3, i2, obj)) {
                                h3 = K(J & 1048575, obj);
                                eh2Var.j(h3, i3);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (y(i3, i2, obj)) {
                                g2 = E(J & 1048575, obj);
                                eh2Var.i(i3, g2);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (y(i3, i2, obj)) {
                                v = ((Boolean) hc4.j(J & 1048575, obj)).booleanValue();
                                eh2Var.e(i3, v);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!y(i3, i2, obj)) {
                                break;
                            }
                            z(i3, hc4.j(J & 1048575, obj), eh2Var);
                            break;
                        case 60:
                            if (!y(i3, i2, obj)) {
                                break;
                            }
                            eh2Var.o(i3, j(i2), hc4.j(J & 1048575, obj));
                            break;
                        case 61:
                            if (!y(i3, i2, obj)) {
                                break;
                            }
                            eh2Var.f(i3, (y82) hc4.j(J & 1048575, obj));
                            break;
                        case 62:
                            if (y(i3, i2, obj)) {
                                g3 = E(J & 1048575, obj);
                                eh2Var.c(i3, g3);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (y(i3, i2, obj)) {
                                g4 = E(J & 1048575, obj);
                                eh2Var.h(i3, g4);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (y(i3, i2, obj)) {
                                g5 = E(J & 1048575, obj);
                                eh2Var.p(i3, g5);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (y(i3, i2, obj)) {
                                h4 = K(J & 1048575, obj);
                                eh2Var.q(h4, i3);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (y(i3, i2, obj)) {
                                g6 = E(J & 1048575, obj);
                                eh2Var.a(i3, g6);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (y(i3, i2, obj)) {
                                h5 = K(J & 1048575, obj);
                                eh2Var.b(h5, i3);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!y(i3, i2, obj)) {
                                break;
                            }
                            eh2Var.l(i3, j(i2), hc4.j(J & 1048575, obj));
                            break;
                    }
                }
            } else {
                this.m.a(obj);
                throw null;
            }
        } else if (!this.f) {
            int length2 = this.a.length;
            Unsafe unsafe = o;
            int i4 = 1048575;
            int i5 = 0;
            for (int i6 = 0; i6 < length2; i6 += 3) {
                int J2 = J(i6);
                int[] iArr = this.a;
                int i7 = iArr[i6];
                int i8 = (J2 >>> 20) & 255;
                if (i8 <= 17) {
                    int i9 = iArr[i6 + 2];
                    int i10 = i9 & 1048575;
                    if (i10 != i4) {
                        i5 = unsafe.getInt(obj, i10);
                        i4 = i10;
                    }
                    i = 1 << (i9 >>> 20);
                } else {
                    i = 0;
                }
                long j = J2 & 1048575;
                switch (i8) {
                    case 0:
                        if ((i & i5) != 0) {
                            eh2Var.g(hc4.e(j, obj), i7);
                            continue;
                        }
                    case 1:
                        if ((i & i5) != 0) {
                            eh2Var.k(i7, hc4.f(j, obj));
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i & i5) != 0) {
                            eh2Var.n(unsafe.getLong(obj, j), i7);
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i & i5) != 0) {
                            eh2Var.d(unsafe.getLong(obj, j), i7);
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i & i5) != 0) {
                            eh2Var.m(i7, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i & i5) != 0) {
                            eh2Var.j(unsafe.getLong(obj, j), i7);
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i & i5) != 0) {
                            eh2Var.i(i7, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i & i5) != 0) {
                            eh2Var.e(i7, hc4.v(j, obj));
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i & i5) != 0) {
                            z(i7, unsafe.getObject(obj, j), eh2Var);
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i & i5) != 0) {
                            eh2Var.o(i7, j(i6), unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i & i5) != 0) {
                            eh2Var.f(i7, (y82) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i & i5) != 0) {
                            eh2Var.c(i7, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i & i5) != 0) {
                            eh2Var.h(i7, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i & i5) != 0) {
                            eh2Var.p(i7, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i & i5) != 0) {
                            eh2Var.q(unsafe.getLong(obj, j), i7);
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i & i5) != 0) {
                            eh2Var.a(i7, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i & i5) != 0) {
                            eh2Var.b(unsafe.getLong(obj, j), i7);
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i & i5) != 0) {
                            eh2Var.l(i7, j(i6), unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                    case 18:
                        ss3.d(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 19:
                        ss3.h(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 20:
                        ss3.k(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 21:
                        ss3.s(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 22:
                        ss3.j(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 23:
                        ss3.g(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 24:
                        ss3.f(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 25:
                        ss3.b(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        continue;
                    case 26:
                        ss3.q(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var);
                        break;
                    case 27:
                        ss3.l(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, j(i6));
                        break;
                    case 28:
                        ss3.c(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var);
                        break;
                    case 29:
                        ss3.r(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        break;
                    case 30:
                        ss3.e(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        break;
                    case 31:
                        ss3.m(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        break;
                    case 32:
                        ss3.n(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        break;
                    case 33:
                        ss3.o(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        break;
                    case 34:
                        ss3.p(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, false);
                        break;
                    case 35:
                        ss3.d(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 36:
                        ss3.h(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 37:
                        ss3.k(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 38:
                        ss3.s(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 39:
                        ss3.j(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 40:
                        ss3.g(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 41:
                        ss3.f(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 42:
                        ss3.b(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 43:
                        ss3.r(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 44:
                        ss3.e(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 45:
                        ss3.m(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 46:
                        ss3.n(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 47:
                        ss3.o(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 48:
                        ss3.p(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, true);
                        break;
                    case 49:
                        ss3.i(this.a[i6], (List) unsafe.getObject(obj, j), eh2Var, j(i6));
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            hf3 hf3Var2 = (hf3) k(i6);
                            throw null;
                        }
                        break;
                    case 51:
                        if (y(i7, i6, obj)) {
                            eh2Var.g(((Double) hc4.j(j, obj)).doubleValue(), i7);
                            break;
                        }
                        break;
                    case 52:
                        if (y(i7, i6, obj)) {
                            eh2Var.k(i7, ((Float) hc4.j(j, obj)).floatValue());
                            break;
                        }
                        break;
                    case 53:
                        if (y(i7, i6, obj)) {
                            eh2Var.n(K(j, obj), i7);
                            break;
                        }
                        break;
                    case 54:
                        if (y(i7, i6, obj)) {
                            eh2Var.d(K(j, obj), i7);
                            break;
                        }
                        break;
                    case 55:
                        if (y(i7, i6, obj)) {
                            eh2Var.m(i7, E(j, obj));
                            break;
                        }
                        break;
                    case 56:
                        if (y(i7, i6, obj)) {
                            eh2Var.j(K(j, obj), i7);
                            break;
                        }
                        break;
                    case 57:
                        if (y(i7, i6, obj)) {
                            eh2Var.i(i7, E(j, obj));
                            break;
                        }
                        break;
                    case 58:
                        if (y(i7, i6, obj)) {
                            eh2Var.e(i7, ((Boolean) hc4.j(j, obj)).booleanValue());
                            break;
                        }
                        break;
                    case 59:
                        if (y(i7, i6, obj)) {
                            z(i7, unsafe.getObject(obj, j), eh2Var);
                            break;
                        }
                        break;
                    case 60:
                        if (y(i7, i6, obj)) {
                            eh2Var.o(i7, j(i6), unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 61:
                        if (y(i7, i6, obj)) {
                            eh2Var.f(i7, (y82) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (y(i7, i6, obj)) {
                            eh2Var.c(i7, E(j, obj));
                            break;
                        }
                        break;
                    case 63:
                        if (y(i7, i6, obj)) {
                            eh2Var.h(i7, E(j, obj));
                            break;
                        }
                        break;
                    case 64:
                        if (y(i7, i6, obj)) {
                            eh2Var.p(i7, E(j, obj));
                            break;
                        }
                        break;
                    case 65:
                        if (y(i7, i6, obj)) {
                            eh2Var.q(K(j, obj), i7);
                            break;
                        }
                        break;
                    case 66:
                        if (y(i7, i6, obj)) {
                            eh2Var.a(i7, E(j, obj));
                            break;
                        }
                        break;
                    case 67:
                        if (y(i7, i6, obj)) {
                            eh2Var.b(K(j, obj), i7);
                            break;
                        }
                        break;
                    case 68:
                        if (y(i7, i6, obj)) {
                            eh2Var.l(i7, j(i6), unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                }
            }
        } else {
            this.m.a(obj);
            throw null;
        }
        z44 z44Var = this.l;
        z44Var.i(z44Var.d(obj), eh2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18, types: [int] */
    @Override // defpackage.lr3
    public final void i(Object obj, byte[] bArr, int i, int i2, bx1 bx1Var) {
        byte b;
        int I;
        int i3;
        Unsafe unsafe;
        int i4;
        int i5;
        Object obj2;
        bx1 bx1Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        hm3<T> hm3Var;
        byte[] bArr2;
        int i11;
        Object obj4;
        bx1 bx1Var3;
        hm3<T> hm3Var2;
        boolean z;
        hm3<T> hm3Var3;
        int i12;
        int l;
        int i13;
        int i14;
        int i15;
        Object obj5 = obj;
        int i16 = i2;
        if (this.g) {
            o(obj);
            Unsafe unsafe2 = o;
            int i17 = -1;
            int i18 = 0;
            byte[] bArr3 = bArr;
            int i19 = i;
            bx1 bx1Var4 = bx1Var;
            Object obj6 = obj5;
            hm3<T> hm3Var4 = this;
            int i20 = -1;
            int i21 = 0;
            int i22 = 1048575;
            int i23 = 0;
            while (i19 < i16) {
                int i24 = i19 + 1;
                byte b2 = bArr3[i19];
                if (b2 < 0) {
                    int j = wx1.j(b2, bArr3, i24, bx1Var4);
                    b = bx1Var4.a;
                    i24 = j;
                } else {
                    b = b2;
                }
                int i25 = b >>> 3;
                if (i25 > i20) {
                    int i26 = i21 / 3;
                    if (i25 >= hm3Var4.c && i25 <= hm3Var4.d) {
                        I = hm3Var4.I(i25, i26);
                    }
                    I = -1;
                } else {
                    if (i25 >= hm3Var4.c && i25 <= hm3Var4.d) {
                        I = hm3Var4.I(i25, i18);
                    }
                    I = -1;
                }
                int i27 = I;
                if (i27 == i17) {
                    i3 = i25;
                } else {
                    int i28 = b & 7;
                    int[] iArr = hm3Var4.a;
                    int i29 = iArr[i27 + 1];
                    int i30 = (i29 >>> 20) & 255;
                    hm3<T> hm3Var5 = hm3Var4;
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
                                bx1Var3 = bx1Var4;
                                hm3Var2 = hm3Var5;
                                if (i28 == 1) {
                                    hc4.n(obj4, j2, Double.longBitsToDouble(wx1.o(bArr3, i24)));
                                    i19 = i24 + 8;
                                    obj5 = obj;
                                    i23 |= i32;
                                    hm3Var4 = hm3Var2;
                                    i21 = i5;
                                    bx1Var4 = bx1Var3;
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
                                bx1Var2 = bx1Var4;
                                hm3Var3 = hm3Var5;
                                if (i28 == 5) {
                                    hc4.o(obj2, j2, Float.intBitsToFloat(wx1.b(bArr3, i24)));
                                    i12 = i24 + 4;
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                bx1Var2 = bx1Var4;
                                if (i28 == 0) {
                                    l = wx1.l(bArr3, i24, bx1Var2);
                                    unsafe2.putLong(obj, j2, bx1Var2.b);
                                    i23 |= i32;
                                    hm3Var3 = hm3Var5;
                                    hm3Var = hm3Var3;
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
                                bx1Var2 = bx1Var4;
                                hm3Var3 = hm3Var5;
                                if (i28 == 0) {
                                    i12 = wx1.i(bArr3, i24, bx1Var2);
                                    i13 = bx1Var2.a;
                                    unsafe2.putInt(obj2, j2, i13);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                bx1Var2 = bx1Var4;
                                if (i28 == 1) {
                                    unsafe2.putLong(obj, j2, wx1.o(bArr3, i24));
                                    i12 = i24 + 8;
                                    hm3Var3 = hm3Var5;
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                bx1Var3 = bx1Var4;
                                hm3Var2 = hm3Var5;
                                if (i28 == 5) {
                                    unsafe2.putInt(obj4, j2, wx1.b(bArr3, i24));
                                    i19 = i24 + 4;
                                    obj5 = obj;
                                    i23 |= i32;
                                    hm3Var4 = hm3Var2;
                                    i21 = i5;
                                    bx1Var4 = bx1Var3;
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
                                bx1Var3 = bx1Var4;
                                hm3Var2 = hm3Var5;
                                if (i28 == 0) {
                                    i19 = wx1.l(bArr3, i24, bx1Var3);
                                    if (bx1Var3.b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    hc4.m(obj4, j2, z);
                                    obj5 = obj;
                                    i23 |= i32;
                                    hm3Var4 = hm3Var2;
                                    i21 = i5;
                                    bx1Var4 = bx1Var3;
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
                                bx1Var2 = bx1Var4;
                                hm3Var3 = hm3Var5;
                                if (i28 == 2) {
                                    if ((i29 & 536870912) == 0) {
                                        i12 = wx1.f(bArr3, i24, bx1Var2);
                                    } else {
                                        i12 = wx1.g(bArr3, i24, bx1Var2);
                                    }
                                    unsafe2.putObject(obj2, j2, bx1Var2.c);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                bx1Var2 = bx1Var4;
                                if (i28 == 2) {
                                    Object l2 = hm3Var5.l(i5, obj2);
                                    i12 = wx1.n(l2, hm3Var5.j(i5), bArr, i24, i2, bx1Var);
                                    hm3Var5.t(i5, obj2, l2);
                                    hm3Var3 = hm3Var5;
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                bx1Var2 = bx1Var4;
                                if (i28 == 2) {
                                    i12 = wx1.a(bArr3, i24, bx1Var2);
                                    hm3Var3 = hm3Var5;
                                    unsafe2.putObject(obj2, j2, bx1Var2.c);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                bx1Var2 = bx1Var4;
                                if (i28 == 0) {
                                    i12 = wx1.i(bArr3, i24, bx1Var2);
                                    hm3Var3 = hm3Var5;
                                    i13 = bx1Var2.a;
                                    unsafe2.putInt(obj2, j2, i13);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                bx1Var2 = bx1Var4;
                                if (i28 == 0) {
                                    i12 = wx1.i(bArr3, i24, bx1Var2);
                                    i13 = pc2.a(bx1Var2.a);
                                    hm3Var3 = hm3Var5;
                                    unsafe2.putInt(obj2, j2, i13);
                                    i14 = i12;
                                    i15 = i23 | i32;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                                    i14 = wx1.l(bArr3, i24, bx1Var4);
                                    i5 = i27;
                                    unsafe2.putLong(obj, j2, pc2.b(bx1Var4.b));
                                    i15 = i23 | i32;
                                    bx1Var2 = bx1Var4;
                                    hm3Var3 = hm3Var5;
                                    i23 = i15;
                                    l = i14;
                                    hm3Var = hm3Var3;
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
                        bx1Var2 = bx1Var4;
                        if (i30 == 27) {
                            if (i28 == 2) {
                                b13 b13Var = (b13) unsafe2.getObject(obj2, j2);
                                if (!b13Var.d()) {
                                    int size = b13Var.size();
                                    if (size == 0) {
                                        i11 = 10;
                                    } else {
                                        i11 = size + size;
                                    }
                                    b13Var = b13Var.e(i11);
                                    unsafe2.putObject(obj2, j2, b13Var);
                                }
                                int i34 = i24;
                                hm3Var = hm3Var5;
                                bArr2 = bArr3;
                                i19 = wx1.d(hm3Var5.j(i5), b, bArr, i34, i2, b13Var, bx1Var);
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
                                i19 = H(obj, bArr, i24, i2, b, i3, i28, i5, i29, i30, j2, bx1Var);
                                if (i19 != i35) {
                                    obj5 = obj;
                                    i22 = i6;
                                    i23 = i7;
                                    i21 = i8;
                                    hm3Var4 = this;
                                    bArr3 = bArr;
                                    bx1Var4 = bx1Var;
                                    obj6 = obj5;
                                } else {
                                    i10 = i19;
                                    obj5 = obj;
                                    i4 = i10;
                                    i22 = i6;
                                    i23 = i7;
                                    i18 = i8;
                                    i19 = wx1.h(b, bArr, i4, i2, B(obj), bx1Var);
                                    i21 = i18;
                                    hm3Var4 = this;
                                    bArr3 = bArr;
                                    bx1Var4 = bx1Var;
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
                                        F(obj3, i8, j2);
                                        throw null;
                                    }
                                } else {
                                    obj5 = obj3;
                                    i19 = G(obj, bArr, i9, i2, b, i3, i28, i29, i30, j2, i8, bx1Var);
                                    if (i19 == i9) {
                                        i10 = i19;
                                        i4 = i10;
                                        i22 = i6;
                                        i23 = i7;
                                        i18 = i8;
                                        i19 = wx1.h(b, bArr, i4, i2, B(obj), bx1Var);
                                        i21 = i18;
                                        hm3Var4 = this;
                                        bArr3 = bArr;
                                        bx1Var4 = bx1Var;
                                        obj6 = obj5;
                                    }
                                    i22 = i6;
                                    i23 = i7;
                                    i21 = i8;
                                    hm3Var4 = this;
                                    bArr3 = bArr;
                                    bx1Var4 = bx1Var;
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
                        i19 = wx1.h(b, bArr, i4, i2, B(obj), bx1Var);
                        i21 = i18;
                        hm3Var4 = this;
                        bArr3 = bArr;
                        bx1Var4 = bx1Var;
                        obj6 = obj5;
                        i16 = i2;
                        i20 = i3;
                        unsafe2 = unsafe;
                        i17 = -1;
                        i18 = 0;
                    }
                    obj5 = obj;
                    i21 = i5;
                    bx1Var4 = bx1Var2;
                    bArr3 = bArr2;
                    obj6 = obj2;
                    hm3Var4 = hm3Var;
                    i20 = i3;
                    i17 = -1;
                    i18 = 0;
                    i16 = i2;
                }
                i4 = i24;
                unsafe = unsafe2;
                i19 = wx1.h(b, bArr, i4, i2, B(obj), bx1Var);
                i21 = i18;
                hm3Var4 = this;
                bArr3 = bArr;
                bx1Var4 = bx1Var;
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
            throw p33.c();
        }
        A(obj, bArr, i, i2, 0, bx1Var);
    }

    public final lr3 j(int i) {
        Object[] objArr = this.b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        lr3 lr3Var = (lr3) objArr[i3];
        if (lr3Var != null) {
            return lr3Var;
        }
        lr3 a = lq3.c.a((Class) objArr[i3 + 1]);
        this.b[i3] = a;
        return a;
    }

    public final Object k(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final Object l(int i, Object obj) {
        lr3 j = j(i);
        int J = J(i) & 1048575;
        if (w(i, obj)) {
            Object object = o.getObject(obj, J);
            if (x(object)) {
                return object;
            }
            ox2 b = j.b();
            if (object != null) {
                j.c(b, object);
            }
            return b;
        }
        return j.b();
    }

    public final Object m(int i, int i2, Object obj) {
        lr3 j = j(i2);
        if (y(i, i2, obj)) {
            Object object = o.getObject(obj, J(i2) & 1048575);
            if (x(object)) {
                return object;
            }
            ox2 b = j.b();
            if (object != null) {
                j.c(b, object);
            }
            return b;
        }
        return j.b();
    }

    public final void p(int i, Object obj, Object obj2) {
        if (w(i, obj2)) {
            Unsafe unsafe = o;
            long J = J(i) & 1048575;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            lr3 j = j(i);
            if (!w(i, obj)) {
                if (x(object)) {
                    ox2 b = j.b();
                    j.c(b, object);
                    unsafe.putObject(obj, J, b);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                r(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!x(object2)) {
                ox2 b2 = j.b();
                j.c(b2, object2);
                unsafe.putObject(obj, J, b2);
                object2 = b2;
            }
            j.c(object2, object);
        }
    }

    public final void q(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (y(i2, i, obj2)) {
            Unsafe unsafe = o;
            long J = J(i) & 1048575;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            lr3 j = j(i);
            if (!y(i2, i, obj)) {
                if (x(object)) {
                    ox2 b = j.b();
                    j.c(b, object);
                    unsafe.putObject(obj, J, b);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                s(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!x(object2)) {
                ox2 b2 = j.b();
                j.c(b2, object2);
                unsafe.putObject(obj, J, b2);
                object2 = b2;
            }
            j.c(object2, object);
        }
    }

    public final void r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        hc4.p((1 << (i2 >>> 20)) | hc4.g(j, obj), j, obj);
    }

    public final void s(int i, int i2, Object obj) {
        hc4.p(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final void t(int i, Object obj, Object obj2) {
        o.putObject(obj, J(i) & 1048575, obj2);
        r(i, obj);
    }

    public final void u(int i, int i2, Object obj, Object obj2) {
        o.putObject(obj, J(i2) & 1048575, obj2);
        s(i, i2, obj);
    }

    public final boolean v(int i, Object obj, Object obj2) {
        return w(i, obj) == w(i, obj2);
    }

    public final boolean w(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int J = J(i);
            long j2 = J & 1048575;
            switch ((J >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(hc4.e(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(hc4.f(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (hc4.h(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (hc4.h(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (hc4.g(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (hc4.h(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (hc4.g(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return hc4.v(j2, obj);
                case 8:
                    Object j3 = hc4.j(j2, obj);
                    if (j3 instanceof String) {
                        if (((String) j3).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (j3 instanceof y82) {
                        if (y82.Q.equals(j3)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (hc4.j(j2, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (y82.Q.equals(hc4.j(j2, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (hc4.g(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (hc4.g(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (hc4.g(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (hc4.h(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (hc4.g(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (hc4.h(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (hc4.j(j2, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & hc4.g(j, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean y(int i, int i2, Object obj) {
        if (hc4.g(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }
}