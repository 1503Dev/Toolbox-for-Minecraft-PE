package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: k35  reason: default package */
public final class k35 extends a15 {
    public static k35 q(o35 o35Var, ee4 ee4Var, @Nullable Integer num) {
        o35 o35Var2 = o35.d;
        if (o35Var != o35Var2 && num == null) {
            throw new GeneralSecurityException(ij.c("For given Variant ", o35Var.a, " the value of idRequirement must be non-null"));
        }
        if (o35Var == o35Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ee4Var.c() == 32) {
            if (o35Var == o35Var2) {
                sc5.a(new byte[0]);
            } else if (o35Var == o35.c) {
                sc5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (o35Var == o35.b) {
                sc5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(o35Var.a));
            }
            return new k35();
        }
        throw new GeneralSecurityException(k6.a("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", ee4Var.c()));
    }
}