package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: z65  reason: default package */
public final class z65 {
    @Nullable
    public f75 a = null;
    @Nullable
    public ee4 b = null;
    @Nullable
    public Integer c = null;

    public final a75 a() {
        ee4 ee4Var;
        boolean z;
        boolean z2;
        sc5 a;
        f75 f75Var = this.a;
        if (f75Var != null && (ee4Var = this.b) != null) {
            if (f75Var.U == ee4Var.c()) {
                e75 e75Var = f75Var.W;
                e75 e75Var2 = e75.e;
                if (e75Var != e75Var2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                e75 e75Var3 = this.a.W;
                if (e75Var3 != e75Var2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (e75Var3 == e75Var2) {
                    a = sc5.a(new byte[0]);
                } else if (e75Var3 != e75.d && e75Var3 != e75.c) {
                    if (e75Var3 == e75.b) {
                        a = sc5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.a.W)));
                    }
                } else {
                    a = sc5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
                }
                return new a75(this.a, a);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}