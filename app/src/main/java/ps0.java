package defpackage;

import java.math.BigInteger;

/* renamed from: ps0  reason: default package */
public final class ps0 {
    public final BigInteger a;
    public final int b;

    public ps0(int i, BigInteger bigInteger) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.a = bigInteger;
        this.b = i;
    }

    public final ps0 a(ps0 ps0Var) {
        if (this.b == ps0Var.b) {
            return new ps0(this.b, this.a.add(ps0Var.a));
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final int b(BigInteger bigInteger) {
        return this.a.compareTo(bigInteger.shiftLeft(this.b));
    }

    public final BigInteger c() {
        BigInteger bigInteger = gn.b;
        ps0 ps0Var = new ps0(1, bigInteger);
        int i = this.b;
        if (i >= 0) {
            if (i != 1) {
                ps0Var = new ps0(i, bigInteger.shiftLeft(i - 1));
            }
            ps0 a = a(ps0Var);
            return a.a.shiftRight(a.b);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public final ps0 d(ps0 ps0Var) {
        return a(new ps0(ps0Var.b, ps0Var.a.negate()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ps0) {
            ps0 ps0Var = (ps0) obj;
            return this.a.equals(ps0Var.a) && this.b == ps0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return this.a.toString();
        }
        BigInteger shiftRight = this.a.shiftRight(i);
        BigInteger subtract = this.a.subtract(shiftRight.shiftLeft(this.b));
        if (this.a.signum() == -1) {
            subtract = gn.b.shiftLeft(this.b).subtract(subtract);
        }
        if (shiftRight.signum() == -1 && !subtract.equals(gn.a)) {
            shiftRight = shiftRight.add(gn.b);
        }
        String bigInteger = shiftRight.toString();
        char[] cArr = new char[this.b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i2 = this.b - length;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = '0';
        }
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i2 + i4] = bigInteger2.charAt(i4);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}