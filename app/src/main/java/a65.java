package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a65  reason: default package */
public final class a65 {
    public static final a65 b = new a65();
    public final AtomicReference a = new AtomicReference(new n65(new l65()));

    public final Class a(Class cls) {
        n65 n65Var = (n65) this.a.get();
        if (n65Var.b.containsKey(cls)) {
            return ((v05) n65Var.b.get(cls)).a();
        }
        throw new GeneralSecurityException(ij.c("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object b(ja jaVar, Class cls) {
        n65 n65Var = (n65) this.a.get();
        n65Var.getClass();
        m65 m65Var = new m65(jaVar.getClass(), cls);
        if (n65Var.a.containsKey(m65Var)) {
            return ((j65) n65Var.a.get(m65Var)).a(jaVar);
        }
        throw new GeneralSecurityException(ij.c("No PrimitiveConstructor for ", m65Var.toString(), " available"));
    }

    public final synchronized void c(h65 h65Var) {
        l65 l65Var = new l65((n65) this.a.get());
        l65Var.a(h65Var);
        this.a.set(new n65(l65Var));
    }
}