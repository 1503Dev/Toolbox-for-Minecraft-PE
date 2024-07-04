package defpackage;

import java.math.BigInteger;

/* renamed from: ag0  reason: default package */
public final class ag0 implements cq {
    public final BigInteger a;

    public ag0(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.cq
    public final int b() {
        return 1;
    }

    @Override // defpackage.cq
    public final BigInteger c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ag0) {
            return this.a.equals(((ag0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}