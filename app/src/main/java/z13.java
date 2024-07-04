package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: z13  reason: default package */
public final class z13 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }
}