package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: i05  reason: default package */
public final class i05 {
    public static h05 a(String str) {
        Map unmodifiableMap;
        AtomicReference atomicReference = x05.a;
        synchronized (x05.class) {
            unmodifiableMap = Collections.unmodifiableMap(x05.e);
        }
        h05 h05Var = (h05) unmodifiableMap.get(str);
        if (h05Var != null) {
            return h05Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}