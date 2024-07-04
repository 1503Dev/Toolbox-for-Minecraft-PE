package defpackage;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: a55  reason: default package */
public final class a55 {
    public static final byte[] d = new byte[0];
    public final z45 a;
    public final BigInteger b;
    @GuardedBy("this")
    public BigInteger c = BigInteger.ZERO;

    public a55(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, z45 z45Var) {
        this.b = bigInteger;
        this.a = z45Var;
    }
}