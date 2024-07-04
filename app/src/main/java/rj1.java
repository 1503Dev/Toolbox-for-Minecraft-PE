package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: rj1  reason: default package */
public enum rj1 {
    Q("RESPONSE_CODE_UNSPECIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("SERVICE_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("FEATURE_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF36("SERVICE_DISCONNECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF44("OK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF52("USER_CANCELED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF60("SERVICE_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF68("BILLING_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("ITEM_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF86("DEVELOPER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF95("ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF104("ITEM_ALREADY_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF113("ITEM_NOT_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF126("EXPIRED_OFFER_TOKEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF139("NETWORK_ERROR");
    
    public static final ip1 R;
    public final int P;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d4  */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v31 */
    static {
        Object[] objArr;
        char c;
        char c2;
        char c3;
        byte[] bArr;
        ip1 ip1Var;
        ip1 ip1Var2;
        Object[] objArr2 = new Object[8];
        rj1[] values = values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            rj1 rj1Var = values[i];
            Integer valueOf = Integer.valueOf(rj1Var.P);
            int i3 = i2 + 1;
            int length2 = objArr2.length;
            int i4 = i3 + i3;
            if (i4 > length2) {
                int i5 = length2 + (length2 >> 1) + 1;
                if (i5 < i4) {
                    int highestOneBit = Integer.highestOneBit(i4 - 1);
                    i5 = highestOneBit + highestOneBit;
                }
                objArr2 = Arrays.copyOf(objArr2, i5 < 0 ? Integer.MAX_VALUE : i5);
            }
            if (valueOf != null) {
                int i6 = i2 + i2;
                objArr2[i6] = valueOf;
                objArr2[i6 + 1] = rj1Var;
                i++;
                i2 = i3;
            } else {
                Objects.toString(rj1Var);
                throw new NullPointerException("null key in entry: null=".concat(String.valueOf(rj1Var)));
            }
        }
        dx5 dx5Var = null;
        if (i2 == 0) {
            ip1Var2 = ip1.V;
        } else {
            if (i2 == 1) {
                objArr2[0].getClass();
                objArr2[1].getClass();
                ip1Var = new ip1(1, null, objArr2);
            } else {
                nu2.i(i2, objArr2.length >> 1);
                int max = Math.max(i2, 2);
                int i7 = 1073741824;
                if (max < 751619276) {
                    int highestOneBit2 = Integer.highestOneBit(max - 1);
                    i7 = highestOneBit2 + highestOneBit2;
                    while (true) {
                        double d = i7;
                        Double.isNaN(d);
                        Double.isNaN(d);
                        Double.isNaN(d);
                        Double.isNaN(d);
                        Double.isNaN(d);
                        if (d * 0.7d >= max) {
                            break;
                        }
                        i7 += i7;
                    }
                } else if (max >= 1073741824) {
                    throw new IllegalArgumentException("collection too large");
                }
                if (i2 == 1) {
                    objArr2[0].getClass();
                    objArr2[1].getClass();
                    bArr = 0;
                } else {
                    int i8 = i7 - 1;
                    if (i7 <= 128) {
                        bArr = new byte[i7];
                        Arrays.fill(bArr, (byte) -1);
                        int i9 = 0;
                        dx5 dx5Var2 = null;
                        for (int i10 = 0; i10 < i2; i10++) {
                            int i11 = i9 + i9;
                            int i12 = i10 + i10;
                            Object obj = objArr2[i12];
                            obj.getClass();
                            Object obj2 = objArr2[i12 ^ 1];
                            obj2.getClass();
                            int a = u92.a(obj.hashCode());
                            while (true) {
                                int i13 = a & i8;
                                int i14 = bArr[i13] & 255;
                                if (i14 == 255) {
                                    bArr[i13] = (byte) i11;
                                    if (i9 < i10) {
                                        objArr2[i11] = obj;
                                        objArr2[i11 ^ 1] = obj2;
                                    }
                                    i9++;
                                } else if (obj.equals(objArr2[i14])) {
                                    int i15 = i14 ^ 1;
                                    Object obj3 = objArr2[i15];
                                    obj3.getClass();
                                    dx5 dx5Var3 = new dx5(obj, obj2, obj3);
                                    objArr2[i15] = obj2;
                                    dx5Var2 = dx5Var3;
                                    break;
                                } else {
                                    a = i13 + 1;
                                }
                            }
                        }
                        if (i9 != i2) {
                            bArr = new Object[]{bArr, Integer.valueOf(i9), dx5Var2};
                        }
                    } else if (i7 <= 32768) {
                        bArr = new short[i7];
                        Arrays.fill(bArr, (short) -1);
                        int i16 = 0;
                        dx5 dx5Var4 = null;
                        for (int i17 = 0; i17 < i2; i17++) {
                            int i18 = i16 + i16;
                            int i19 = i17 + i17;
                            Object obj4 = objArr2[i19];
                            obj4.getClass();
                            Object obj5 = objArr2[i19 ^ 1];
                            obj5.getClass();
                            int a2 = u92.a(obj4.hashCode());
                            while (true) {
                                int i20 = a2 & i8;
                                char c4 = (char) bArr[i20];
                                if (c4 == 65535) {
                                    bArr[i20] = (short) i18;
                                    if (i16 < i17) {
                                        objArr2[i18] = obj4;
                                        objArr2[i18 ^ 1] = obj5;
                                    }
                                    i16++;
                                } else if (obj4.equals(objArr2[c4])) {
                                    int i21 = c4 ^ 1;
                                    Object obj6 = objArr2[i21];
                                    obj6.getClass();
                                    dx5 dx5Var5 = new dx5(obj4, obj5, obj6);
                                    objArr2[i21] = obj5;
                                    dx5Var4 = dx5Var5;
                                    break;
                                } else {
                                    a2 = i20 + 1;
                                }
                            }
                        }
                        if (i16 != i2) {
                            objArr = new Object[]{bArr, Integer.valueOf(i16), dx5Var4};
                            c2 = 2;
                            c3 = 0;
                            c = 1;
                            if (objArr instanceof Object[]) {
                                Object[] objArr3 = objArr;
                                dx5Var = (dx5) objArr3[c2];
                                Object obj7 = objArr3[c3];
                                i2 = ((Integer) objArr3[c]).intValue();
                                objArr2 = Arrays.copyOf(objArr2, i2 + i2);
                                objArr = obj7;
                            }
                            ip1Var = new ip1(i2, objArr, objArr2);
                        }
                    } else {
                        int i22 = 1;
                        int[] iArr = new int[i7];
                        Arrays.fill(iArr, -1);
                        int i23 = 0;
                        int i24 = 0;
                        dx5 dx5Var6 = null;
                        while (i23 < i2) {
                            int i25 = i24 + i24;
                            int i26 = i23 + i23;
                            Object obj8 = objArr2[i26];
                            obj8.getClass();
                            Object obj9 = objArr2[i22 ^ i26];
                            obj9.getClass();
                            int a3 = u92.a(obj8.hashCode());
                            while (true) {
                                int i27 = a3 & i8;
                                int i28 = iArr[i27];
                                if (i28 == -1) {
                                    iArr[i27] = i25;
                                    if (i24 < i23) {
                                        objArr2[i25] = obj8;
                                        objArr2[i25 ^ 1] = obj9;
                                    }
                                    i24++;
                                } else if (obj8.equals(objArr2[i28])) {
                                    int i29 = i28 ^ 1;
                                    Object obj10 = objArr2[i29];
                                    obj10.getClass();
                                    dx5 dx5Var7 = new dx5(obj8, obj9, obj10);
                                    objArr2[i29] = obj9;
                                    dx5Var6 = dx5Var7;
                                    break;
                                } else {
                                    a3 = i27 + 1;
                                }
                            }
                            i23++;
                            i22 = 1;
                        }
                        if (i24 == i2) {
                            bArr = iArr;
                        } else {
                            c = 1;
                            objArr = new Object[]{iArr, Integer.valueOf(i24), dx5Var6};
                            c2 = 2;
                            c3 = 0;
                            if (objArr instanceof Object[]) {
                            }
                            ip1Var = new ip1(i2, objArr, objArr2);
                        }
                    }
                }
                objArr = bArr;
                c2 = 2;
                c3 = 0;
                c = 1;
                if (objArr instanceof Object[]) {
                }
                ip1Var = new ip1(i2, objArr, objArr2);
            }
            ip1Var2 = ip1Var;
        }
        if (dx5Var == null) {
            R = ip1Var2;
            return;
        }
        StringBuilder b = e5.b("Multiple entries with same key: ");
        b.append(dx5Var.a);
        b.append("=");
        b.append(dx5Var.b);
        b.append(" and ");
        b.append(dx5Var.a);
        b.append("=");
        b.append(dx5Var.c);
        throw new IllegalArgumentException(b.toString());
    }

    rj1(String str) {
        this.P = r2;
    }
}