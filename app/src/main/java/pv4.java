package defpackage;

import java.util.Arrays;

/* renamed from: pv4  reason: default package */
public final class pv4 {
    public Object[] a;
    public int b = 0;
    public ov4 c;

    public pv4(int i) {
        this.a = new Object[i + i];
    }

    public final void a(Object obj, Object obj2) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i3);
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = this.a;
                int i4 = this.b;
                int i5 = i4 + i4;
                objArr2[i5] = obj;
                objArr2[i5 + 1] = obj2;
                this.b = i4 + 1;
                return;
            }
            throw new NullPointerException(ij.c("null value in entry: ", obj.toString(), "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sw4 b() {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr;
        Object[] objArr2;
        boolean z;
        sw4 sw4Var;
        ov4 ov4Var = this.c;
        if (ov4Var == null) {
            int i = this.b;
            Object[] objArr3 = this.a;
            if (i == 0) {
                sw4Var = sw4.V;
            } else {
                sw4 sw4Var2 = sw4.V;
                Object obj = null;
                int i2 = 1;
                if (i == 1) {
                    objArr3[0].getClass();
                    objArr3[1].getClass();
                    sw4Var = new sw4(1, null, objArr3);
                } else {
                    gt4.b(i, objArr3.length >> 1);
                    int r = sv4.r(i);
                    if (i == 1) {
                        objArr3[0].getClass();
                        objArr3[1].getClass();
                    } else {
                        int i3 = r - 1;
                        char c3 = 65535;
                        if (r <= 128) {
                            byte[] bArr = new byte[r];
                            Arrays.fill(bArr, (byte) -1);
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < i) {
                                int i6 = i5 + i5;
                                int i7 = i4 + i4;
                                Object obj2 = objArr3[i7];
                                obj2.getClass();
                                Object obj3 = objArr3[i7 ^ i2];
                                obj3.getClass();
                                int c4 = gv4.c(obj2.hashCode());
                                while (true) {
                                    int i8 = c4 & i3;
                                    int i9 = bArr[i8] & 255;
                                    if (i9 == 255) {
                                        bArr[i8] = (byte) i6;
                                        if (i5 < i4) {
                                            objArr3[i6] = obj2;
                                            objArr3[i6 ^ 1] = obj3;
                                        }
                                        i5++;
                                    } else if (obj2.equals(objArr3[i9])) {
                                        int i10 = i9 ^ 1;
                                        Object obj4 = objArr3[i10];
                                        obj4.getClass();
                                        ov4 ov4Var2 = new ov4(obj2, obj3, obj4);
                                        objArr3[i10] = obj3;
                                        obj = ov4Var2;
                                        break;
                                    } else {
                                        c4 = i8 + 1;
                                    }
                                }
                                i4++;
                                i2 = 1;
                            }
                            if (i5 == i) {
                                obj = bArr;
                            } else {
                                objArr = new Object[]{bArr, Integer.valueOf(i5), obj};
                                c2 = 2;
                                c = 1;
                                objArr2 = objArr;
                            }
                        } else if (r <= 32768) {
                            sArr = new short[r];
                            Arrays.fill(sArr, (short) -1);
                            int i11 = 0;
                            for (int i12 = 0; i12 < i; i12++) {
                                int i13 = i11 + i11;
                                int i14 = i12 + i12;
                                Object obj5 = objArr3[i14];
                                obj5.getClass();
                                Object obj6 = objArr3[i14 ^ 1];
                                obj6.getClass();
                                int c5 = gv4.c(obj5.hashCode());
                                while (true) {
                                    int i15 = c5 & i3;
                                    char c6 = (char) sArr[i15];
                                    if (c6 == 65535) {
                                        sArr[i15] = (short) i13;
                                        if (i11 < i12) {
                                            objArr3[i13] = obj5;
                                            objArr3[i13 ^ 1] = obj6;
                                        }
                                        i11++;
                                    } else if (obj5.equals(objArr3[c6])) {
                                        int i16 = c6 ^ 1;
                                        Object obj7 = objArr3[i16];
                                        obj7.getClass();
                                        ov4 ov4Var3 = new ov4(obj5, obj6, obj7);
                                        objArr3[i16] = obj6;
                                        obj = ov4Var3;
                                        break;
                                    } else {
                                        c5 = i15 + 1;
                                    }
                                }
                            }
                            if (i11 != i) {
                                Integer valueOf = Integer.valueOf(i11);
                                c = 1;
                                c2 = 2;
                                objArr = new Object[]{sArr, valueOf, obj};
                                objArr2 = objArr;
                            }
                            obj = sArr;
                        } else {
                            int i17 = 1;
                            sArr = new int[r];
                            Arrays.fill((int[]) sArr, -1);
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < i) {
                                int i20 = i19 + i19;
                                int i21 = i18 + i18;
                                Object obj8 = objArr3[i21];
                                obj8.getClass();
                                Object obj9 = objArr3[i21 ^ i17];
                                obj9.getClass();
                                int c7 = gv4.c(obj8.hashCode());
                                while (true) {
                                    int i22 = c7 & i3;
                                    ?? r15 = sArr[i22];
                                    if (r15 == c3) {
                                        sArr[i22] = i20;
                                        if (i19 < i18) {
                                            objArr3[i20] = obj8;
                                            objArr3[i20 ^ 1] = obj9;
                                        }
                                        i19++;
                                    } else if (obj8.equals(objArr3[r15])) {
                                        int i23 = r15 ^ 1;
                                        Object obj10 = objArr3[i23];
                                        obj10.getClass();
                                        ov4 ov4Var4 = new ov4(obj8, obj9, obj10);
                                        objArr3[i23] = obj9;
                                        obj = ov4Var4;
                                        break;
                                    } else {
                                        c7 = i22 + 1;
                                        c3 = 65535;
                                    }
                                }
                                i18++;
                                i17 = 1;
                                c3 = 65535;
                            }
                            if (i19 != i) {
                                c = 1;
                                c2 = 2;
                                objArr = new Object[]{sArr, Integer.valueOf(i19), obj};
                                objArr2 = objArr;
                            }
                            obj = sArr;
                        }
                        z = objArr2 instanceof Object[];
                        Object obj11 = objArr2;
                        if (z) {
                            Object[] objArr4 = (Object[]) objArr2;
                            this.c = (ov4) objArr4[c2];
                            Object obj12 = objArr4[0];
                            int intValue = ((Integer) objArr4[c]).intValue();
                            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
                            obj11 = obj12;
                            i = intValue;
                        }
                        sw4Var = new sw4(i, obj11, objArr3);
                    }
                    c2 = 2;
                    c = 1;
                    objArr2 = obj;
                    z = objArr2 instanceof Object[];
                    Object obj112 = objArr2;
                    if (z) {
                    }
                    sw4Var = new sw4(i, obj112, objArr3);
                }
            }
            ov4 ov4Var5 = this.c;
            if (ov4Var5 == null) {
                return sw4Var;
            }
            throw ov4Var5.a();
        }
        throw ov4Var.a();
    }
}