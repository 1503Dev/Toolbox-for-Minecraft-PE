package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: un  reason: default package */
public class un implements AlgorithmParameterSpec {
    public hn a;
    public byte[] b;
    public wn c;
    public BigInteger d;
    public BigInteger e;

    public un(hn hnVar, wn wnVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.a = hnVar;
        this.c = wnVar.n();
        this.d = bigInteger;
        this.e = bigInteger2;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof un)) {
            return false;
        }
        un unVar = (un) obj;
        if (!this.a.h(unVar.a) || !this.c.d(unVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.c.hashCode();
    }
}