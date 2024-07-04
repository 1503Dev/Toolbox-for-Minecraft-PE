package defpackage;

import java.math.BigInteger;

/* renamed from: s51  reason: default package */
public final class s51 extends z61 {
    @Override // defpackage.z61
    public final wn K0(wn wnVar, BigInteger bigInteger) {
        int[] iArr;
        wn[] wnVarArr;
        wn[] wnVarArr2;
        wn wnVar2;
        int i;
        BigInteger bigInteger2 = bigInteger;
        int max = Math.max(2, Math.min(16, z61.S(bigInteger.bitLength())));
        t51 X0 = z61.X0(wnVar, max);
        wn[] wnVarArr3 = X0.a;
        wn[] wnVarArr4 = X0.b;
        if (max == 2) {
            if ((bigInteger.bitLength() >>> 16) == 0) {
                if (bigInteger.signum() == 0) {
                    iArr = z61.d;
                } else {
                    BigInteger add = bigInteger2.shiftLeft(1).add(bigInteger2);
                    int bitLength = add.bitLength();
                    int i2 = bitLength >> 1;
                    int[] iArr2 = new int[i2];
                    BigInteger xor = add.xor(bigInteger2);
                    int i3 = bitLength - 1;
                    int i4 = 1;
                    int i5 = 0;
                    int i6 = 0;
                    while (i4 < i3) {
                        if (!xor.testBit(i4)) {
                            i6++;
                        } else {
                            if (bigInteger2.testBit(i4)) {
                                i = -1;
                            } else {
                                i = 1;
                            }
                            iArr2[i5] = i6 | (i << 16);
                            i4++;
                            i5++;
                            i6 = 1;
                        }
                        i4++;
                    }
                    int i7 = i5 + 1;
                    iArr2[i5] = 65536 | i6;
                    if (i2 > i7) {
                        int[] iArr3 = new int[i7];
                        System.arraycopy(iArr2, 0, iArr3, 0, i7);
                        iArr = iArr3;
                    } else {
                        iArr = iArr2;
                    }
                }
            } else {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
        } else if (max >= 2 && max <= 16) {
            if ((bigInteger.bitLength() >>> 16) == 0) {
                if (bigInteger.signum() == 0) {
                    iArr = z61.d;
                } else {
                    int bitLength2 = (bigInteger.bitLength() / max) + 1;
                    int[] iArr4 = new int[bitLength2];
                    int i8 = 1 << max;
                    int i9 = i8 - 1;
                    int i10 = i8 >>> 1;
                    int i11 = 0;
                    int i12 = 0;
                    boolean z = false;
                    while (i11 <= bigInteger2.bitLength()) {
                        if (bigInteger2.testBit(i11) == z) {
                            i11++;
                        } else {
                            bigInteger2 = bigInteger2.shiftRight(i11);
                            int intValue = bigInteger2.intValue() & i9;
                            if (z) {
                                intValue++;
                            }
                            if ((intValue & i10) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                intValue -= i8;
                            }
                            if (i12 > 0) {
                                i11--;
                            }
                            iArr4[i12] = (intValue << 16) | i11;
                            i11 = max;
                            i12++;
                        }
                    }
                    if (bitLength2 > i12) {
                        iArr = new int[i12];
                        System.arraycopy(iArr4, 0, iArr, 0, i12);
                    } else {
                        iArr = iArr4;
                    }
                }
            } else {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
        } else {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        wn k = wnVar.a.k();
        int length = iArr.length;
        if (length > 1) {
            length--;
            int i13 = iArr[length];
            int i14 = i13 >> 16;
            int i15 = i13 & 65535;
            int abs = Math.abs(i14);
            if (i14 < 0) {
                wnVarArr2 = wnVarArr4;
            } else {
                wnVarArr2 = wnVarArr3;
            }
            if ((abs << 2) < (1 << max)) {
                byte b = a30.R[abs];
                int i16 = max - b;
                wnVar2 = wnVarArr2[((1 << (max - 1)) - 1) >>> 1].a(wnVarArr2[(((abs ^ (1 << (b - 1))) << i16) + 1) >>> 1]);
                i15 -= i16;
            } else {
                wnVar2 = wnVarArr2[abs >>> 1];
            }
            k = wnVar2.v(i15);
        }
        while (length > 0) {
            length--;
            int i17 = iArr[length];
            int i18 = i17 >> 16;
            int i19 = i17 & 65535;
            int abs2 = Math.abs(i18);
            if (i18 < 0) {
                wnVarArr = wnVarArr4;
            } else {
                wnVarArr = wnVarArr3;
            }
            k = k.x(wnVarArr[abs2 >>> 1]).v(i19);
        }
        return k;
    }
}