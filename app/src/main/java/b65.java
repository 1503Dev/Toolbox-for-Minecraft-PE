package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b65  reason: default package */
public final class b65 {
    public static final b65 b = new b65();
    public final AtomicReference a = new AtomicReference(new v65(new s65()));

    public final ja a(p65 p65Var) {
        v65 v65Var = (v65) this.a.get();
        v65Var.getClass();
        if (!v65Var.b.containsKey(new t65(p65.class, p65Var.b))) {
            try {
                return new w55(p65Var);
            } catch (GeneralSecurityException e) {
                throw new x65("Creating a LegacyProtoKey failed", e);
            }
        }
        v65 v65Var2 = (v65) this.a.get();
        v65Var2.getClass();
        t65 t65Var = new t65(p65.class, p65Var.b);
        if (v65Var2.b.containsKey(t65Var)) {
            return ((p55) v65Var2.b.get(t65Var)).a(p65Var);
        }
        throw new GeneralSecurityException(ij.c("No Key Parser for requested key type ", t65Var.toString(), " available"));
    }

    public final synchronized void b(n55 n55Var) {
        s65 s65Var = new s65((v65) this.a.get());
        s65Var.a(n55Var);
        this.a.set(new v65(s65Var));
    }

    public final synchronized void c(q55 q55Var) {
        s65 s65Var = new s65((v65) this.a.get());
        s65Var.b(q55Var);
        this.a.set(new v65(s65Var));
    }

    public final synchronized void d(c65 c65Var) {
        s65 s65Var = new s65((v65) this.a.get());
        s65Var.c(c65Var);
        this.a.set(new v65(s65Var));
    }

    public final synchronized void e(f65 f65Var) {
        s65 s65Var = new s65((v65) this.a.get());
        s65Var.d(f65Var);
        this.a.set(new v65(s65Var));
    }
}