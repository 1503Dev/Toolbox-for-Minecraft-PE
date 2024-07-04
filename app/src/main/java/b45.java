package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: b45  reason: default package */
public final class b45 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return (Cipher) gc5.b.a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}