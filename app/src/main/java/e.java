package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: e  reason: default package */
public abstract class e extends t {
    public static final char[] R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] P;
    public final int Q;

    public e(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.P = j7.c(bArr);
        this.Q = i;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return this.Q ^ j7.h(w());
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof e) {
            e eVar = (e) tVar;
            return this.Q == eVar.Q && j7.a(w(), eVar.w());
        }
        return false;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new r(byteArrayOutputStream).g(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = R;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder b = e5.b("Internal error encoding BitString: ");
            b.append(e.getMessage());
            throw new s(0, b.toString(), e);
        }
    }

    @Override // defpackage.t
    public final t u() {
        return new zh(this.P, this.Q);
    }

    @Override // defpackage.t
    public final t v() {
        return new wi(this.P, this.Q);
    }

    public final byte[] w() {
        byte[] bArr = this.P;
        int i = this.Q;
        byte[] c = j7.c(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            c[length] = (byte) ((255 << i) & c[length]);
        }
        return c;
    }
}