package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: t15  reason: default package */
public final class t15 {
    @Nullable
    public z15 a = null;
    @Nullable
    public ee4 b = null;
    @Nullable
    public Integer c = null;

    public final u15 a() {
        ee4 ee4Var;
        boolean z;
        boolean z2;
        z15 z15Var = this.a;
        if (z15Var != null && (ee4Var = this.b) != null) {
            if (z15Var.U == ee4Var.c()) {
                y15 y15Var = z15Var.V;
                y15 y15Var2 = y15.d;
                if (y15Var != y15Var2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                y15 y15Var3 = this.a.V;
                if (y15Var3 != y15Var2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (y15Var3 == y15Var2) {
                    sc5.a(new byte[0]);
                } else if (y15Var3 == y15.c) {
                    sc5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
                } else if (y15Var3 == y15.b) {
                    sc5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.a.V)));
                }
                return new u15();
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}