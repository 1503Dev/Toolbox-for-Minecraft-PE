package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: v25  reason: default package */
public final class v25 extends a15 {
    public static v25 q(z25 z25Var, ee4 ee4Var, @Nullable Integer num) {
        z25 z25Var2 = z25.d;
        if (z25Var != z25Var2 && num == null) {
            throw new GeneralSecurityException(ij.c("For given Variant ", z25Var.a, " the value of idRequirement must be non-null"));
        }
        if (z25Var == z25Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ee4Var.c() == 32) {
            if (z25Var == z25Var2) {
                sc5.a(new byte[0]);
            } else if (z25Var == z25.c) {
                sc5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (z25Var == z25.b) {
                sc5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(z25Var.a));
            }
            return new v25();
        }
        throw new GeneralSecurityException(k6.a("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", ee4Var.c()));
    }
}