package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: w45  reason: default package */
public final class w45 implements ac5 {
    public final String a;
    public final int b;
    public c95 c;
    public l85 d;
    public int e;
    public l95 f;

    public w45(va5 va5Var) {
        String B = va5Var.B();
        this.a = B;
        if (B.equals(z05.b)) {
            try {
                e95 z = e95.z(va5Var.A(), ud5.c);
                this.c = (c95) x05.b(va5Var);
                this.b = z.w();
            } catch (te5 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (B.equals(z05.a)) {
            try {
                n85 y = n85.y(va5Var.A(), ud5.c);
                this.d = (l85) x05.b(va5Var);
                this.e = y.z().w();
                this.b = this.e + y.A().w();
            } catch (te5 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (B.equals(h45.a)) {
            try {
                n95 z2 = n95.z(va5Var.A(), ud5.c);
                this.f = (l95) x05.b(va5Var);
                this.b = z2.w();
            } catch (te5 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(B)));
        }
    }
}