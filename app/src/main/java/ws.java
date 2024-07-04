package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: ws  reason: default package */
public final class ws implements us {
    public final xs a;
    public final nj2 b;

    public ws(hn.b bVar, xs xsVar) {
        this.a = xsVar;
        this.b = new nj2(6, bVar.i(xsVar.a));
    }

    public static BigInteger d(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(gn.b);
        }
        return z ? shiftRight.negate() : shiftRight;
    }

    @Override // defpackage.us
    public final nj2 a() {
        return this.b;
    }

    @Override // defpackage.us
    public final void b() {
    }

    @Override // defpackage.us
    public final BigInteger[] c(BigInteger bigInteger) {
        xs xsVar = this.a;
        int i = xsVar.h;
        BigInteger d = d(bigInteger, xsVar.f, i);
        BigInteger d2 = d(bigInteger, this.a.g, i);
        xs xsVar2 = this.a;
        return new BigInteger[]{bigInteger.subtract(d.multiply(xsVar2.b).add(d2.multiply(xsVar2.d))), d.multiply(xsVar2.c).add(d2.multiply(xsVar2.e)).negate()};
    }
}