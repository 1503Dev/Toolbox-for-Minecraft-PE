package defpackage;

import defpackage.jn;
import java.math.BigInteger;

/* renamed from: j81  reason: default package */
public final class j81 extends n {
    public jn P;

    public j81(int i, int i2, int i3, int i4, p pVar) {
        this(new jn.a(i, i2, i3, i4, new BigInteger(1, pVar.x())));
    }

    public j81(BigInteger bigInteger, p pVar) {
        this(new jn.b(bigInteger, jn.b.u(bigInteger), new BigInteger(1, pVar.x())));
    }

    public j81(jn jnVar) {
        this.P = jnVar;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        byte[] bArr;
        int f = (this.P.f() + 7) / 8;
        byte[] byteArray = this.P.t().toByteArray();
        if (f < byteArray.length) {
            bArr = new byte[f];
            System.arraycopy(byteArray, byteArray.length - f, bArr, 0, f);
        } else {
            if (f > byteArray.length) {
                bArr = new byte[f];
                System.arraycopy(byteArray, 0, bArr, f - byteArray.length, byteArray.length);
            }
            return new ii(byteArray);
        }
        byteArray = bArr;
        return new ii(byteArray);
    }
}