package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: h45  reason: default package */
public final class h45 {
    public static final String a;

    static {
        new g45();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        int i = mb5.P;
        try {
            x05.g(j45.a);
            if (d45.a()) {
                return;
            }
            x05.f(new g45());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}