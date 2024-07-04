package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: ti  reason: default package */
public final class ti extends t {
    public static final char[] Q = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] P;

    public ti(byte[] bArr) {
        this.P = j7.c(bArr);
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof ti) {
            return j7.a(this.P, ((ti) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(j7.c(this.P), 28);
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
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new r(byteArrayOutputStream).g(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = Q;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new s("internal error encoding BitString");
        }
    }
}