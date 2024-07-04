package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: l65  reason: default package */
public final class l65 {
    public final HashMap a;
    public final HashMap b;

    public l65() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public l65(n65 n65Var) {
        this.a = new HashMap(n65Var.a);
        this.b = new HashMap(n65Var.b);
    }

    public final void a(h65 h65Var) {
        m65 m65Var = new m65(h65Var.a, h65Var.b);
        if (this.a.containsKey(m65Var)) {
            j65 j65Var = (j65) this.a.get(m65Var);
            if (!j65Var.equals(h65Var) || !h65Var.equals(j65Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(m65Var.toString()));
            }
            return;
        }
        this.a.put(m65Var, h65Var);
    }

    public final void b(v05 v05Var) {
        if (v05Var == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        HashMap hashMap = this.b;
        Class c = v05Var.c();
        if (!hashMap.containsKey(c)) {
            this.b.put(c, v05Var);
            return;
        }
        v05 v05Var2 = (v05) this.b.get(c);
        if (!v05Var2.equals(v05Var) || !v05Var.equals(v05Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(c.toString()));
        }
    }
}