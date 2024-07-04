package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: nx0  reason: default package */
public final class nx0 {
    public static final BigInteger a;
    public static final BigInteger b;
    public static final jg1[] c;
    public static final byte[][] d;
    public static final jg1[] e;
    public static final byte[][] f;

    static {
        BigInteger bigInteger = gn.b;
        BigInteger negate = bigInteger.negate();
        a = negate;
        b = gn.c.negate();
        BigInteger negate2 = gn.d.negate();
        BigInteger bigInteger2 = gn.a;
        c = new jg1[]{null, new jg1(bigInteger, bigInteger2), null, new jg1(negate2, negate), null, new jg1(negate, negate), null, new jg1(bigInteger, negate), null};
        d = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        e = new jg1[]{null, new jg1(bigInteger, bigInteger2), null, new jg1(negate2, bigInteger), null, new jg1(negate, bigInteger), null, new jg1(bigInteger, bigInteger), null};
        f = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static ps0 a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b2, int i) {
        int i2 = ((i + 5) / 2) + 10;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i2) - 2) + b2));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i3 = i2 - 10;
        BigInteger shiftRight = add.shiftRight(i3);
        if (add.testBit(i3 - 1)) {
            shiftRight = shiftRight.add(gn.b);
        }
        return new ps0(10, shiftRight);
    }

    public static BigInteger[] b(byte b2, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b2 == 1 || b2 == -1) {
            if (z) {
                bigInteger = gn.c;
                bigInteger2 = BigInteger.valueOf(b2);
            } else {
                bigInteger = gn.a;
                bigInteger2 = gn.b;
            }
            int i2 = 1;
            while (i2 < i) {
                i2++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b2 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static BigInteger[] c(hn.a aVar) {
        int i;
        int i2;
        if (aVar.r()) {
            int j = aVar.j();
            int intValue = aVar.b.t().intValue();
            if (intValue == 0) {
                i = -1;
            } else {
                i = 1;
            }
            byte b2 = (byte) i;
            BigInteger bigInteger = aVar.e;
            if (bigInteger != null) {
                if (bigInteger.equals(gn.c)) {
                    i2 = 1;
                } else {
                    i2 = bigInteger.equals(gn.e) ? 2 : 2;
                }
                BigInteger[] b3 = b(b2, (j + 3) - intValue, false);
                if (b2 == 1) {
                    b3[0] = b3[0].negate();
                    b3[1] = b3[1].negate();
                }
                BigInteger bigInteger2 = gn.b;
                return new BigInteger[]{bigInteger2.add(b3[1]).shiftRight(i2), bigInteger2.add(b3[0]).shiftRight(i2).negate()};
            }
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }
}