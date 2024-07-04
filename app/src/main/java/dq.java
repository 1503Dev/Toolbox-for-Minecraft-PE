package defpackage;

import java.math.BigInteger;

/* renamed from: dq  reason: default package */
public abstract class dq {
    public static final ag0 a = new ag0(BigInteger.valueOf(2));
    public static final ag0 b = new ag0(BigInteger.valueOf(3));

    public static ct a(int[] iArr) {
        if (iArr[0] == 0) {
            for (int i = 1; i < iArr.length; i++) {
                if (iArr[i] <= iArr[i - 1]) {
                    throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
                }
            }
            return new ct(a, new ss(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }
}