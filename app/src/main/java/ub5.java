package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: ub5  reason: default package */
public final class ub5 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return (Cipher) gc5.b.a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}