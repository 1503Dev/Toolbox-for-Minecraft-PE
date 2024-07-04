package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* renamed from: p75  reason: default package */
public final class p75 {
    @Nullable
    public Integer a = null;
    @Nullable
    public Integer b = null;
    public q75 c = null;
    public r75 d = r75.e;

    public final s75 a() {
        Integer num = this.a;
        if (num != null) {
            if (this.b != null) {
                if (this.c != null) {
                    if (this.d != null) {
                        if (num.intValue() >= 16) {
                            int intValue = this.b.intValue();
                            q75 q75Var = this.c;
                            if (intValue >= 10) {
                                if (q75Var == q75.b) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (q75Var == q75.c) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (q75Var == q75.d) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (q75Var == q75.e) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (q75Var != q75.f) {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                } else {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                }
                                return new s75(this.a.intValue(), this.b.intValue(), this.d, this.c);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }
}