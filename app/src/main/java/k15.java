package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: k15  reason: default package */
public final class k15 {
    @Nullable
    public r15 a = null;
    @Nullable
    public ee4 b = null;
    @Nullable
    public Integer c = null;

    public final l15 a() {
        ee4 ee4Var;
        boolean z;
        boolean z2;
        r15 r15Var = this.a;
        if (r15Var != null && (ee4Var = this.b) != null) {
            if (r15Var.U == ee4Var.c()) {
                q15 q15Var = r15Var.W;
                q15 q15Var2 = q15.d;
                if (q15Var != q15Var2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                q15 q15Var3 = this.a.W;
                if (q15Var3 != q15Var2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (q15Var3 == q15Var2) {
                    sc5.a(new byte[0]);
                } else if (q15Var3 == q15.c) {
                    sc5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
                } else if (q15Var3 == q15.b) {
                    sc5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.a.W)));
                }
                return new l15();
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}