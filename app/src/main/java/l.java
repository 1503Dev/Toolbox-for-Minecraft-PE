package defpackage;

import java.math.BigInteger;

/* renamed from: l  reason: default package */
public final class l extends t {
    public final byte[] P;

    public l(long j) {
        this.P = BigInteger.valueOf(j).toByteArray();
    }

    public l(BigInteger bigInteger) {
        this.P = bigInteger.toByteArray();
    }

    public l(byte[] bArr) {
        byte b;
        if (!hg0.a("org.spongycastle.asn1.allow_unsafe_integer")) {
            boolean z = false;
            if (bArr.length > 1 && (((b = bArr[0]) == 0 && (bArr[1] & 128) == 0) || (b == -1 && (bArr[1] & 128) != 0))) {
                z = true;
            }
            if (z) {
                throw new IllegalArgumentException("malformed integer");
            }
        }
        this.P = bArr;
    }

    public static l w(g gVar) {
        if (gVar != null && !(gVar instanceof l)) {
            if (gVar instanceof byte[]) {
                try {
                    return (l) t.s((byte[]) gVar);
                } catch (Exception e) {
                    StringBuilder b = e5.b("encoding error in getInstance: ");
                    b.append(e.toString());
                    throw new IllegalArgumentException(b.toString());
                }
            }
            StringBuilder b2 = e5.b("illegal object in getInstance: ");
            b2.append(gVar.getClass().getName());
            throw new IllegalArgumentException(b2.toString());
        }
        return (l) gVar;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.P;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof l) {
            return j7.a(this.P, ((l) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 2);
    }

    @Override // defpackage.t
    public final int r() {
        return eu0.a(this.P.length) + 1 + this.P.length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return x().toString();
    }

    public final BigInteger x() {
        return new BigInteger(this.P);
    }
}