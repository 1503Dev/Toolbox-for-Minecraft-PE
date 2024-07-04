package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: in  reason: default package */
public class in implements gn {
    public hn g;
    public byte[] h;
    public wn i;
    public BigInteger j;
    public BigInteger k;

    public in(hn.d dVar, wn wnVar, BigInteger bigInteger) {
        this(dVar, wnVar, bigInteger, gn.b, null);
    }

    public in(hn hnVar, wn wnVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(hnVar, wnVar, bigInteger, bigInteger2, null);
    }

    public in(hn hnVar, wn wnVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.g = hnVar;
        this.i = wnVar.n();
        this.j = bigInteger;
        this.k = bigInteger2;
        this.h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof in) {
            in inVar = (in) obj;
            return this.g.h(inVar.g) && this.i.d(inVar.i) && this.j.equals(inVar.j) && this.k.equals(inVar.k);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.g.hashCode() * 37) ^ this.i.hashCode()) * 37) ^ this.j.hashCode()) * 37) ^ this.k.hashCode();
    }
}