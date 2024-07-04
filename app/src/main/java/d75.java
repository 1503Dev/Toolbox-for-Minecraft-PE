package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* renamed from: d75  reason: default package */
public final class d75 {
    @Nullable
    public Integer a = null;
    @Nullable
    public Integer b = null;
    public e75 c = e75.e;

    public final void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i >= 10 && i <= 16) {
            this.b = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(k6.a("Invalid tag size for AesCmacParameters: ", i));
    }

    public final f75 c() {
        Integer num = this.a;
        if (num != null) {
            if (this.b != null) {
                if (this.c != null) {
                    return new f75(num.intValue(), this.b.intValue(), this.c);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }
}