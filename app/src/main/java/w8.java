package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: w8  reason: default package */
public final class w8 implements q {
    public kl5 P;

    public w8(kl5 kl5Var) {
        this.P = kl5Var;
    }

    @Override // defpackage.q
    public final InputStream g() {
        return new tf(this.P);
    }

    @Override // defpackage.g
    public final t h() {
        try {
            return m();
        } catch (IOException e) {
            StringBuilder b = e5.b("IOException converting stream to byte array: ");
            b.append(e.getMessage());
            throw new s(0, b.toString(), e);
        }
    }

    @Override // defpackage.ex
    public final t m() {
        InputStream g = g();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = g.read(bArr, 0, 4096);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return new v8(byteArrayOutputStream.toByteArray());
            }
        }
    }
}