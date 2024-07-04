package defpackage;

import java.math.BigInteger;

/* renamed from: fn  reason: default package */
public final class fn {
    public static wn a(wn wnVar, BigInteger bigInteger, wn wnVar2, BigInteger bigInteger2) {
        boolean z;
        wn[] wnVarArr;
        wn[] wnVarArr2;
        wn[] wnVarArr3;
        wn[] wnVarArr4;
        boolean z2 = true;
        if (bigInteger.signum() < 0) {
            z = true;
        } else {
            z = false;
        }
        if (bigInteger2.signum() >= 0) {
            z2 = false;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, z61.S(abs.bitLength())));
        int max2 = Math.max(2, Math.min(16, z61.S(abs2.bitLength())));
        t51 X0 = z61.X0(wnVar, max);
        t51 X02 = z61.X0(wnVar2, max2);
        if (z) {
            wnVarArr = X0.b;
        } else {
            wnVarArr = X0.a;
        }
        wn[] wnVarArr5 = wnVarArr;
        if (z2) {
            wnVarArr2 = X02.b;
        } else {
            wnVarArr2 = X02.a;
        }
        wn[] wnVarArr6 = wnVarArr2;
        if (z) {
            wnVarArr3 = X0.a;
        } else {
            wnVarArr3 = X0.b;
        }
        wn[] wnVarArr7 = wnVarArr3;
        if (z2) {
            wnVarArr4 = X02.a;
        } else {
            wnVarArr4 = X02.b;
        }
        return b(wnVarArr5, wnVarArr7, z61.P(max, abs), wnVarArr6, wnVarArr4, z61.P(max2, abs2));
    }

    public static wn b(wn[] wnVarArr, wn[] wnVarArr2, byte[] bArr, wn[] wnVarArr3, wn[] wnVarArr4, byte[] bArr2) {
        byte b;
        byte b2;
        wn wnVar;
        wn[] wnVarArr5;
        wn[] wnVarArr6;
        int max = Math.max(bArr.length, bArr2.length);
        wn k = wnVarArr[0].a.k();
        wn wnVar2 = k;
        int i = 0;
        for (int i2 = max - 1; i2 >= 0; i2--) {
            if (i2 < bArr.length) {
                b = bArr[i2];
            } else {
                b = 0;
            }
            if (i2 < bArr2.length) {
                b2 = bArr2[i2];
            } else {
                b2 = 0;
            }
            if ((b | b2) == 0) {
                i++;
            } else {
                if (b != 0) {
                    int abs = Math.abs((int) b);
                    if (b < 0) {
                        wnVarArr6 = wnVarArr2;
                    } else {
                        wnVarArr6 = wnVarArr;
                    }
                    wnVar = k.a(wnVarArr6[abs >>> 1]);
                } else {
                    wnVar = k;
                }
                if (b2 != 0) {
                    int abs2 = Math.abs((int) b2);
                    if (b2 < 0) {
                        wnVarArr5 = wnVarArr4;
                    } else {
                        wnVarArr5 = wnVarArr3;
                    }
                    wnVar = wnVar.a(wnVarArr5[abs2 >>> 1]);
                }
                if (i > 0) {
                    wnVar2 = wnVar2.v(i);
                    i = 0;
                }
                wnVar2 = wnVar2.x(wnVar);
            }
        }
        if (i > 0) {
            return wnVar2.v(i);
        }
        return wnVar2;
    }

    public static wn c(boolean[] zArr, t51[] t51VarArr, byte[][] bArr) {
        byte b;
        boolean z;
        wn[] wnVarArr;
        int length = bArr.length;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i = Math.max(i, bArr2.length);
        }
        wn k = t51VarArr[0].a[0].a.k();
        wn wnVar = k;
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            wn wnVar2 = k;
            for (int i4 = 0; i4 < length; i4++) {
                byte[] bArr3 = bArr[i4];
                if (i3 < bArr3.length) {
                    b = bArr3[i3];
                } else {
                    b = 0;
                }
                if (b != 0) {
                    int abs = Math.abs((int) b);
                    t51 t51Var = t51VarArr[i4];
                    if (b < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z == zArr[i4]) {
                        wnVarArr = t51Var.a;
                    } else {
                        wnVarArr = t51Var.b;
                    }
                    wnVar2 = wnVar2.a(wnVarArr[abs >>> 1]);
                }
            }
            if (wnVar2 == k) {
                i2++;
            } else {
                if (i2 > 0) {
                    wnVar = wnVar.v(i2);
                    i2 = 0;
                }
                wnVar = wnVar.x(wnVar2);
            }
        }
        if (i2 > 0) {
            return wnVar.v(i2);
        }
        return wnVar;
    }
}