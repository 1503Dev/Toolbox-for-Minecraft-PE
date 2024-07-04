package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: re5  reason: default package */
public final class re5 {
    public static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        int i = (0 - 0) + 0;
        try {
            if (i >= 0) {
                if (i <= Integer.MAX_VALUE) {
                    return;
                }
                throw te5.f();
            }
            throw te5.e();
        } catch (te5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }
}