package defpackage;

import java.nio.charset.Charset;

/* renamed from: y65  reason: default package */
public final class y65 {
    public static final Charset a = Charset.forName("UTF-8");

    public static final sc5 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new x65("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return sc5.a(bArr);
    }
}