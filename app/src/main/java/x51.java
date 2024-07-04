package defpackage;

import defpackage.hn;
import defpackage.wn;
import java.math.BigInteger;

/* renamed from: x51  reason: default package */
public final class x51 extends z61 {
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
        if (r5.b(defpackage.nx0.b) < 0) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a A[LOOP:1: B:111:0x0247->B:113:0x024a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f0  */
    @Override // defpackage.z61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wn K0(wn wnVar, BigInteger bigInteger) {
        int i;
        BigInteger[] bigIntegerArr;
        BigInteger subtract;
        ps0 d;
        ps0 a;
        ps0 d2;
        byte b;
        byte b2;
        int i2;
        byte b3;
        BigInteger subtract2;
        BigInteger subtract3;
        qf0 l;
        jg1[] jg1VarArr;
        long j;
        BigInteger valueOf;
        BigInteger subtract4;
        int bitLength;
        int i3;
        int i4;
        BigInteger bigInteger2;
        BigInteger subtract5;
        byte b4;
        boolean z;
        byte byteValue;
        byte[][] bArr;
        int length;
        int i5;
        wn.a[] aVarArr;
        wn.a aVar;
        int i6;
        int i7;
        int i8;
        wn.a aVar2;
        if (wnVar instanceof wn.a) {
            wn.a aVar3 = (wn.a) wnVar;
            hn.a aVar4 = (hn.a) aVar3.a;
            int j2 = aVar4.j();
            byte byteValue2 = aVar4.b.t().byteValue();
            BigInteger bigInteger3 = nx0.a;
            if (byteValue2 == 0) {
                i = -1;
            } else {
                i = 1;
            }
            byte b5 = (byte) i;
            synchronized (aVar4) {
                if (aVar4.i == null) {
                    aVar4.i = nx0.c(aVar4);
                }
                bigIntegerArr = aVar4.i;
            }
            if (b5 == 1) {
                subtract = bigIntegerArr[0].add(bigIntegerArr[1]);
            } else {
                subtract = bigIntegerArr[0].subtract(bigIntegerArr[1]);
            }
            BigInteger bigInteger4 = nx0.b(b5, j2, true)[1];
            ps0 a2 = nx0.a(bigInteger, bigIntegerArr[0], bigInteger4, byteValue2, j2);
            ps0 a3 = nx0.a(bigInteger, bigIntegerArr[1], bigInteger4, byteValue2, j2);
            if (a3.b == a2.b) {
                if (b5 != 1 && b5 != -1) {
                    throw new IllegalArgumentException("mu must be 1 or -1");
                }
                BigInteger c = a2.c();
                BigInteger c2 = a3.c();
                ps0 ps0Var = new ps0(a2.b, a2.a.subtract(c.shiftLeft(a2.b)));
                ps0 ps0Var2 = new ps0(a3.b, a3.a.subtract(c2.shiftLeft(a3.b)));
                ps0 a4 = ps0Var.a(ps0Var);
                if (b5 == 1) {
                    d = a4.a(ps0Var2);
                } else {
                    d = a4.d(ps0Var2);
                }
                ps0 a5 = ps0Var2.a(ps0Var2).a(ps0Var2);
                ps0 a6 = a5.a(ps0Var2);
                if (b5 == 1) {
                    a = ps0Var.d(a5);
                    d2 = ps0Var.a(a6);
                } else {
                    a = ps0Var.a(a5);
                    d2 = ps0Var.d(a6);
                }
                BigInteger bigInteger5 = gn.b;
                if (d.b(bigInteger5) >= 0) {
                    if (a.b(nx0.a) >= 0) {
                        i2 = 1;
                        b2 = 0;
                        if (d.b(nx0.a) < 0) {
                            if (a.b(bigInteger5) < 0) {
                                b3 = b2;
                                i2 = -1;
                                BigInteger add = c.add(BigInteger.valueOf(i2));
                                BigInteger add2 = c2.add(BigInteger.valueOf(b3));
                                subtract2 = bigInteger.subtract(subtract.multiply(add)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(add2));
                                subtract3 = bigIntegerArr[1].multiply(add).subtract(bigIntegerArr[0].multiply(add2));
                                l = aVar4.l(aVar3, "bc_wtnaf");
                                if (byteValue2 != 0) {
                                    jg1VarArr = nx0.c;
                                } else {
                                    jg1VarArr = nx0.e;
                                }
                                if (b5 != 1) {
                                    j = 6;
                                } else {
                                    j = 10;
                                }
                                BigInteger valueOf2 = BigInteger.valueOf(j);
                                valueOf = BigInteger.valueOf(16L);
                                if (b5 == 1 && b5 != -1) {
                                    throw new IllegalArgumentException("mu must be 1 or -1");
                                }
                                BigInteger multiply = subtract2.multiply(subtract2);
                                BigInteger multiply2 = subtract2.multiply(subtract3);
                                BigInteger shiftLeft = subtract3.multiply(subtract3).shiftLeft(1);
                                if (b5 != 1) {
                                    subtract4 = multiply.add(multiply2);
                                } else if (b5 == -1) {
                                    subtract4 = multiply.subtract(multiply2);
                                } else {
                                    throw new IllegalArgumentException("mu must be 1 or -1");
                                }
                                bitLength = subtract4.add(shiftLeft).bitLength();
                                if (bitLength <= 30) {
                                    i3 = bitLength + 4 + 4;
                                } else {
                                    i3 = 38;
                                }
                                byte[] bArr2 = new byte[i3];
                                BigInteger shiftRight = valueOf.shiftRight(1);
                                i4 = 0;
                                while (true) {
                                    bigInteger2 = gn.a;
                                    if (!subtract2.equals(bigInteger2) && subtract3.equals(bigInteger2)) {
                                        break;
                                    }
                                    if (!subtract2.testBit(0)) {
                                        BigInteger mod = subtract2.add(subtract3.multiply(valueOf2)).mod(valueOf);
                                        if (mod.compareTo(shiftRight) >= 0) {
                                            mod = mod.subtract(valueOf);
                                        }
                                        byte intValue = (byte) mod.intValue();
                                        bArr2[i4] = intValue;
                                        if (intValue < 0) {
                                            b4 = (byte) (-intValue);
                                            z = false;
                                        } else {
                                            b4 = intValue;
                                            z = true;
                                        }
                                        if (z) {
                                            subtract2 = subtract2.subtract((BigInteger) jg1VarArr[b4].P);
                                            subtract3 = subtract3.subtract((BigInteger) jg1VarArr[b4].Q);
                                        } else {
                                            subtract2 = subtract2.add((BigInteger) jg1VarArr[b4].P);
                                            subtract3 = subtract3.add((BigInteger) jg1VarArr[b4].Q);
                                        }
                                    } else {
                                        bArr2[i4] = 0;
                                    }
                                    BigInteger shiftRight2 = subtract2.shiftRight(1);
                                    if (b5 != 1) {
                                        subtract5 = subtract3.add(shiftRight2);
                                    } else {
                                        subtract5 = subtract3.subtract(shiftRight2);
                                    }
                                    i4++;
                                    BigInteger bigInteger6 = subtract5;
                                    subtract3 = subtract2.shiftRight(1).negate();
                                    subtract2 = bigInteger6;
                                }
                                hn.a aVar5 = (hn.a) aVar3.a;
                                byteValue = aVar5.b.t().byteValue();
                                if (l == null && (l instanceof y51)) {
                                    aVarArr = ((y51) l).a;
                                } else {
                                    if (byteValue != 0) {
                                        bArr = nx0.d;
                                    } else {
                                        bArr = nx0.f;
                                    }
                                    int length2 = (bArr.length + 1) >>> 1;
                                    wn.a[] aVarArr2 = new wn.a[length2];
                                    aVarArr2[0] = aVar3;
                                    length = bArr.length;
                                    for (i5 = 3; i5 < length; i5 += 2) {
                                        int i9 = i5 >>> 1;
                                        byte[] bArr3 = bArr[i5];
                                        wn.a aVar6 = (wn.a) aVar3.a.k();
                                        wn.a aVar7 = (wn.a) aVar3.m();
                                        int i10 = 0;
                                        for (int length3 = bArr3.length - 1; length3 >= 0; length3--) {
                                            i10++;
                                            byte b6 = bArr3[length3];
                                            if (b6 != 0) {
                                                wn.a y = aVar6.y(i10);
                                                if (b6 > 0) {
                                                    aVar = aVar3;
                                                } else {
                                                    aVar = aVar7;
                                                }
                                                aVar6 = (wn.a) y.a(aVar);
                                                i10 = 0;
                                            }
                                        }
                                        if (i10 > 0) {
                                            aVar6 = aVar6.y(i10);
                                        }
                                        aVarArr2[i9] = aVar6;
                                    }
                                    hn hnVar = aVar3.a;
                                    hnVar.getClass();
                                    hnVar.o(aVarArr2, 0, length2, null);
                                    y51 y51Var = new y51();
                                    y51Var.a = aVarArr2;
                                    aVar5.p(aVar3, "bc_wtnaf", y51Var);
                                    aVarArr = aVarArr2;
                                }
                                wn.a[] aVarArr3 = new wn.a[aVarArr.length];
                                for (i6 = 0; i6 < aVarArr.length; i6++) {
                                    aVarArr3[i6] = (wn.a) aVarArr[i6].m();
                                }
                                wn.a aVar8 = (wn.a) aVar3.a.k();
                                i8 = 0;
                                for (i7 = i3 - 1; i7 >= 0; i7--) {
                                    i8++;
                                    byte b7 = bArr2[i7];
                                    if (b7 != 0) {
                                        wn.a y2 = aVar8.y(i8);
                                        if (b7 > 0) {
                                            aVar2 = aVarArr[b7 >>> 1];
                                        } else {
                                            aVar2 = aVarArr3[(-b7) >>> 1];
                                        }
                                        aVar8 = (wn.a) y2.a(aVar2);
                                        i8 = 0;
                                    }
                                }
                                if (i8 <= 0) {
                                    return aVar8.y(i8);
                                }
                                return aVar8;
                            }
                        }
                        b2 = (byte) (-b5);
                        b3 = b2;
                        BigInteger add3 = c.add(BigInteger.valueOf(i2));
                        BigInteger add22 = c2.add(BigInteger.valueOf(b3));
                        subtract2 = bigInteger.subtract(subtract.multiply(add3)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(add22));
                        subtract3 = bigIntegerArr[1].multiply(add3).subtract(bigIntegerArr[0].multiply(add22));
                        l = aVar4.l(aVar3, "bc_wtnaf");
                        if (byteValue2 != 0) {
                        }
                        if (b5 != 1) {
                        }
                        BigInteger valueOf22 = BigInteger.valueOf(j);
                        valueOf = BigInteger.valueOf(16L);
                        if (b5 == 1) {
                        }
                        BigInteger multiply3 = subtract2.multiply(subtract2);
                        BigInteger multiply22 = subtract2.multiply(subtract3);
                        BigInteger shiftLeft2 = subtract3.multiply(subtract3).shiftLeft(1);
                        if (b5 != 1) {
                        }
                        bitLength = subtract4.add(shiftLeft2).bitLength();
                        if (bitLength <= 30) {
                        }
                        byte[] bArr22 = new byte[i3];
                        BigInteger shiftRight3 = valueOf.shiftRight(1);
                        i4 = 0;
                        while (true) {
                            bigInteger2 = gn.a;
                            if (!subtract2.equals(bigInteger2)) {
                            }
                            if (!subtract2.testBit(0)) {
                            }
                            BigInteger shiftRight22 = subtract2.shiftRight(1);
                            if (b5 != 1) {
                            }
                            i4++;
                            BigInteger bigInteger62 = subtract5;
                            subtract3 = subtract2.shiftRight(1).negate();
                            subtract2 = bigInteger62;
                        }
                        hn.a aVar52 = (hn.a) aVar3.a;
                        byteValue = aVar52.b.t().byteValue();
                        if (l == null) {
                        }
                        if (byteValue != 0) {
                        }
                        int length22 = (bArr.length + 1) >>> 1;
                        wn.a[] aVarArr22 = new wn.a[length22];
                        aVarArr22[0] = aVar3;
                        length = bArr.length;
                        while (i5 < length) {
                        }
                        hn hnVar2 = aVar3.a;
                        hnVar2.getClass();
                        hnVar2.o(aVarArr22, 0, length22, null);
                        y51 y51Var2 = new y51();
                        y51Var2.a = aVarArr22;
                        aVar52.p(aVar3, "bc_wtnaf", y51Var2);
                        aVarArr = aVarArr22;
                        wn.a[] aVarArr32 = new wn.a[aVarArr.length];
                        while (i6 < aVarArr.length) {
                        }
                        wn.a aVar82 = (wn.a) aVar3.a.k();
                        i8 = 0;
                        while (i7 >= 0) {
                        }
                        if (i8 <= 0) {
                        }
                    }
                } else if (d2.b(gn.c) < 0) {
                    b = 0;
                    b2 = b;
                    i2 = 0;
                    if (d.b(nx0.a) < 0) {
                    }
                    b2 = (byte) (-b5);
                    b3 = b2;
                    BigInteger add32 = c.add(BigInteger.valueOf(i2));
                    BigInteger add222 = c2.add(BigInteger.valueOf(b3));
                    subtract2 = bigInteger.subtract(subtract.multiply(add32)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(add222));
                    subtract3 = bigIntegerArr[1].multiply(add32).subtract(bigIntegerArr[0].multiply(add222));
                    l = aVar4.l(aVar3, "bc_wtnaf");
                    if (byteValue2 != 0) {
                    }
                    if (b5 != 1) {
                    }
                    BigInteger valueOf222 = BigInteger.valueOf(j);
                    valueOf = BigInteger.valueOf(16L);
                    if (b5 == 1) {
                    }
                    BigInteger multiply32 = subtract2.multiply(subtract2);
                    BigInteger multiply222 = subtract2.multiply(subtract3);
                    BigInteger shiftLeft22 = subtract3.multiply(subtract3).shiftLeft(1);
                    if (b5 != 1) {
                    }
                    bitLength = subtract4.add(shiftLeft22).bitLength();
                    if (bitLength <= 30) {
                    }
                    byte[] bArr222 = new byte[i3];
                    BigInteger shiftRight32 = valueOf.shiftRight(1);
                    i4 = 0;
                    while (true) {
                        bigInteger2 = gn.a;
                        if (!subtract2.equals(bigInteger2)) {
                        }
                        if (!subtract2.testBit(0)) {
                        }
                        BigInteger shiftRight222 = subtract2.shiftRight(1);
                        if (b5 != 1) {
                        }
                        i4++;
                        BigInteger bigInteger622 = subtract5;
                        subtract3 = subtract2.shiftRight(1).negate();
                        subtract2 = bigInteger622;
                    }
                    hn.a aVar522 = (hn.a) aVar3.a;
                    byteValue = aVar522.b.t().byteValue();
                    if (l == null) {
                    }
                    if (byteValue != 0) {
                    }
                    int length222 = (bArr.length + 1) >>> 1;
                    wn.a[] aVarArr222 = new wn.a[length222];
                    aVarArr222[0] = aVar3;
                    length = bArr.length;
                    while (i5 < length) {
                    }
                    hn hnVar22 = aVar3.a;
                    hnVar22.getClass();
                    hnVar22.o(aVarArr222, 0, length222, null);
                    y51 y51Var22 = new y51();
                    y51Var22.a = aVarArr222;
                    aVar522.p(aVar3, "bc_wtnaf", y51Var22);
                    aVarArr = aVarArr222;
                    wn.a[] aVarArr322 = new wn.a[aVarArr.length];
                    while (i6 < aVarArr.length) {
                    }
                    wn.a aVar822 = (wn.a) aVar3.a.k();
                    i8 = 0;
                    while (i7 >= 0) {
                    }
                    if (i8 <= 0) {
                    }
                }
                b = b5;
                b2 = b;
                i2 = 0;
                if (d.b(nx0.a) < 0) {
                }
                b2 = (byte) (-b5);
                b3 = b2;
                BigInteger add322 = c.add(BigInteger.valueOf(i2));
                BigInteger add2222 = c2.add(BigInteger.valueOf(b3));
                subtract2 = bigInteger.subtract(subtract.multiply(add322)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(add2222));
                subtract3 = bigIntegerArr[1].multiply(add322).subtract(bigIntegerArr[0].multiply(add2222));
                l = aVar4.l(aVar3, "bc_wtnaf");
                if (byteValue2 != 0) {
                }
                if (b5 != 1) {
                }
                BigInteger valueOf2222 = BigInteger.valueOf(j);
                valueOf = BigInteger.valueOf(16L);
                if (b5 == 1) {
                }
                BigInteger multiply322 = subtract2.multiply(subtract2);
                BigInteger multiply2222 = subtract2.multiply(subtract3);
                BigInteger shiftLeft222 = subtract3.multiply(subtract3).shiftLeft(1);
                if (b5 != 1) {
                }
                bitLength = subtract4.add(shiftLeft222).bitLength();
                if (bitLength <= 30) {
                }
                byte[] bArr2222 = new byte[i3];
                BigInteger shiftRight322 = valueOf.shiftRight(1);
                i4 = 0;
                while (true) {
                    bigInteger2 = gn.a;
                    if (!subtract2.equals(bigInteger2)) {
                    }
                    if (!subtract2.testBit(0)) {
                    }
                    BigInteger shiftRight2222 = subtract2.shiftRight(1);
                    if (b5 != 1) {
                    }
                    i4++;
                    BigInteger bigInteger6222 = subtract5;
                    subtract3 = subtract2.shiftRight(1).negate();
                    subtract2 = bigInteger6222;
                }
                hn.a aVar5222 = (hn.a) aVar3.a;
                byteValue = aVar5222.b.t().byteValue();
                if (l == null) {
                }
                if (byteValue != 0) {
                }
                int length2222 = (bArr.length + 1) >>> 1;
                wn.a[] aVarArr2222 = new wn.a[length2222];
                aVarArr2222[0] = aVar3;
                length = bArr.length;
                while (i5 < length) {
                }
                hn hnVar222 = aVar3.a;
                hnVar222.getClass();
                hnVar222.o(aVarArr2222, 0, length2222, null);
                y51 y51Var222 = new y51();
                y51Var222.a = aVarArr2222;
                aVar5222.p(aVar3, "bc_wtnaf", y51Var222);
                aVarArr = aVarArr2222;
                wn.a[] aVarArr3222 = new wn.a[aVarArr.length];
                while (i6 < aVarArr.length) {
                }
                wn.a aVar8222 = (wn.a) aVar3.a.k();
                i8 = 0;
                while (i7 >= 0) {
                }
                if (i8 <= 0) {
                }
            } else {
                throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
            }
        } else {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
    }
}