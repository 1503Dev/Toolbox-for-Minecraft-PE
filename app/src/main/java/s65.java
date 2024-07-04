package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: s65  reason: default package */
public final class s65 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public s65() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public s65(v65 v65Var) {
        this.a = new HashMap(v65Var.a);
        this.b = new HashMap(v65Var.b);
        this.c = new HashMap(v65Var.c);
        this.d = new HashMap(v65Var.d);
    }

    public final void a(n55 n55Var) {
        t65 t65Var = new t65(n55Var.b, n55Var.a);
        if (this.b.containsKey(t65Var)) {
            p55 p55Var = (p55) this.b.get(t65Var);
            if (!p55Var.equals(n55Var) || !n55Var.equals(p55Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(t65Var.toString()));
            }
            return;
        }
        this.b.put(t65Var, n55Var);
    }

    public final void b(q55 q55Var) {
        u65 u65Var = new u65(q55Var.a, q55Var.b);
        if (this.a.containsKey(u65Var)) {
            r55 r55Var = (r55) this.a.get(u65Var);
            if (!r55Var.equals(q55Var) || !q55Var.equals(r55Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(u65Var.toString()));
            }
            return;
        }
        this.a.put(u65Var, q55Var);
    }

    public final void c(c65 c65Var) {
        t65 t65Var = new t65(c65Var.b, c65Var.a);
        if (this.d.containsKey(t65Var)) {
            e65 e65Var = (e65) this.d.get(t65Var);
            if (!e65Var.equals(c65Var) || !c65Var.equals(e65Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(t65Var.toString()));
            }
            return;
        }
        this.d.put(t65Var, c65Var);
    }

    public final void d(f65 f65Var) {
        u65 u65Var = new u65(f65Var.a, f65Var.b);
        if (this.c.containsKey(u65Var)) {
            g65 g65Var = (g65) this.c.get(u65Var);
            if (!g65Var.equals(f65Var) || !f65Var.equals(g65Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(u65Var.toString()));
            }
            return;
        }
        this.c.put(u65Var, f65Var);
    }
}