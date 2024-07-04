package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: rb5  reason: default package */
public final class rb5 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return (Cipher) gc5.b.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}