package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: j75  reason: default package */
public final class j75 {
    @Nullable
    public s75 a = null;
    @Nullable
    public ee4 b = null;
    @Nullable
    public Integer c = null;

    public final l75 a() {
        ee4 ee4Var;
        boolean z;
        boolean z2;
        sc5 a;
        s75 s75Var = this.a;
        if (s75Var != null && (ee4Var = this.b) != null) {
            if (s75Var.U == ee4Var.c()) {
                r75 r75Var = s75Var.W;
                r75 r75Var2 = r75.e;
                if (r75Var != r75Var2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                r75 r75Var3 = this.a.W;
                if (r75Var3 != r75Var2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (r75Var3 == r75Var2) {
                    a = sc5.a(new byte[0]);
                } else if (r75Var3 != r75.d && r75Var3 != r75.c) {
                    if (r75Var3 == r75.b) {
                        a = sc5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.a.W)));
                    }
                } else {
                    a = sc5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
                }
                return new l75(this.a, a);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}