package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: s35  reason: default package */
public final class s35 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return (Cipher) gc5.b.a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}