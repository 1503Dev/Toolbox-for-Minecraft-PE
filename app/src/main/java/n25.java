package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: n25  reason: default package */
public final class n25 {
    @Nullable
    public t25 a = null;
    @Nullable
    public ee4 b = null;
    @Nullable
    public Integer c = null;

    public final o25 a() {
        ee4 ee4Var;
        boolean z;
        boolean z2;
        t25 t25Var = this.a;
        if (t25Var != null && (ee4Var = this.b) != null) {
            if (t25Var.U == ee4Var.c()) {
                s25 s25Var = t25Var.V;
                s25 s25Var2 = s25.d;
                if (s25Var != s25Var2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                s25 s25Var3 = this.a.V;
                if (s25Var3 != s25Var2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (s25Var3 == s25Var2) {
                    sc5.a(new byte[0]);
                } else if (s25Var3 == s25.c) {
                    sc5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
                } else if (s25Var3 == s25.b) {
                    sc5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.a.V)));
                }
                return new o25();
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}