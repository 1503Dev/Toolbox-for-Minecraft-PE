package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: qu  reason: default package */
public final class qu {
    public static final jk3 a = new jk3();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.b(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder b = e5.b("exception decoding Hex string: ");
            b.append(e.getMessage());
            throw new wj(b.toString(), e);
        }
    }

    public static byte[] b(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            jk3 jk3Var = a;
            jk3Var.getClass();
            for (int i2 = 0; i2 < 0 + i; i2++) {
                int i3 = bArr[i2] & 255;
                byteArrayOutputStream.write(((byte[]) jk3Var.P)[i3 >>> 4]);
                byteArrayOutputStream.write(((byte[]) jk3Var.P)[i3 & 15]);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder b = e5.b("exception encoding Hex string: ");
            b.append(e.getMessage());
            throw new s(1, b.toString(), e);
        }
    }
}