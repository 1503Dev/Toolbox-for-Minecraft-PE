package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: tb5  reason: default package */
public final class tb5 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return (Cipher) gc5.b.a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}