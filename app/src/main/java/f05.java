package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f05  reason: default package */
public final class f05 {
    public static final Logger b = Logger.getLogger(f05.class.getName());
    public final ConcurrentHashMap a;

    public f05() {
        this.a = new ConcurrentHashMap();
    }

    public f05(f05 f05Var) {
        this.a = new ConcurrentHashMap(f05Var.a);
    }

    public final zz4 a(Class cls, String str) {
        e05 d = d(str);
        if (d.b().contains(cls)) {
            return d.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d.d());
        Set<Class> b2 = d.b();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : b2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder b3 = sd1.b("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        b3.append(sb2);
        throw new GeneralSecurityException(b3.toString());
    }

    public final synchronized void b(o65 o65Var, u55 u55Var) {
        Class i;
        if (!ea2.C(1)) {
            String valueOf = String.valueOf(o65Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (!ea2.C(u55Var.f())) {
            String valueOf2 = String.valueOf(u55Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        } else {
            String d = o65Var.d();
            String d2 = u55Var.d();
            if (this.a.containsKey(d) && ((e05) this.a.get(d)).i() != null && (i = ((e05) this.a.get(d)).i()) != null && !i.getName().equals(u55Var.getClass().getName())) {
                Logger logger = b;
                Level level = Level.WARNING;
                logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d + " with inconsistent public key type " + d2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", o65Var.getClass().getName(), i.getName(), u55Var.getClass().getName()));
            }
            e(new d05(o65Var, u55Var), true);
            e(new c05(u55Var), false);
        }
    }

    public final synchronized void c(u55 u55Var) {
        if (!ea2.C(u55Var.f())) {
            String valueOf = String.valueOf(u55Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
        e(new c05(u55Var), false);
    }

    public final synchronized e05 d(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (e05) this.a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
        r6.a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(e05 e05Var, boolean z) {
        String d = ((a05) e05Var.c()).a.d();
        e05 e05Var2 = (e05) this.a.get(d);
        if (e05Var2 != null && !e05Var2.d().equals(e05Var.d())) {
            b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(d));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", d, e05Var2.d().getName(), e05Var.d().getName()));
        }
        this.a.put(d, e05Var);
    }
}