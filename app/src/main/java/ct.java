package defpackage;

import java.math.BigInteger;

/* renamed from: ct  reason: default package */
public final class ct implements ff0 {
    public final cq a;
    public final ss b;

    public ct(ag0 ag0Var, ss ssVar) {
        this.a = ag0Var;
        this.b = ssVar;
    }

    @Override // defpackage.ff0
    public final ss a() {
        return this.b;
    }

    @Override // defpackage.cq
    public final int b() {
        int b = this.a.b();
        int[] iArr = this.b.a;
        return iArr[iArr.length - 1] * b;
    }

    @Override // defpackage.cq
    public final BigInteger c() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ct) {
            ct ctVar = (ct) obj;
            return this.a.equals(ctVar.a) && this.b.equals(ctVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 16);
    }
}