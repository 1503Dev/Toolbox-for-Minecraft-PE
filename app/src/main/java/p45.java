package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: p45  reason: default package */
public final class p45 {
    @Deprecated
    public static final mb5 a;

    static {
        new o45();
        new m45();
        a = mb5.x();
        try {
            x05.g(r45.a);
            x05.g(u45.a);
            z05.a();
            if (d45.a()) {
                return;
            }
            x05.e(new m45(), new o45());
            x05.e(new g55(), new i55());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}