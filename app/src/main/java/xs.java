package defpackage;

import java.math.BigInteger;

/* renamed from: xs  reason: default package */
public final class xs {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final BigInteger g;
    public final int h;

    public xs(BigInteger bigInteger, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.a = bigInteger;
        this.b = bigIntegerArr[0];
        this.c = bigIntegerArr[1];
        this.d = bigIntegerArr2[0];
        this.e = bigIntegerArr2[1];
        this.f = bigInteger2;
        this.g = bigInteger3;
        this.h = i;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length == 2 && bigIntegerArr[0] != null && bigIntegerArr[1] != null) {
            return;
        }
        throw new IllegalArgumentException(ij.c("'", str, "' must consist of exactly 2 (non-null) values"));
    }
}