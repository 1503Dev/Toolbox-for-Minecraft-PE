package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: a05  reason: default package */
public class a05 implements zz4 {
    public final u55 a;
    public final Class b;

    public a05(u55 u55Var, Class cls) {
        if (!u55Var.b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", u55Var.toString(), cls.getName()));
        }
        this.a = u55Var;
        this.b = cls;
    }

    public final ta5 a(gd5 gd5Var) {
        try {
            t55 a = this.a.a();
            nf5 b = a.b(gd5Var);
            a.d(b);
            nf5 a2 = a.a(b);
            sa5 w = ta5.w();
            String d = this.a.d();
            w.j();
            ((ta5) w.Q).zzd = d;
            ed5 c = a2.c();
            w.j();
            ((ta5) w.Q).zze = c;
            int b2 = this.a.b();
            w.j();
            ta5.F((ta5) w.Q, b2);
            return (ta5) w.h();
        } catch (te5 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final Object b(nf5 nf5Var) {
        if (Void.class.equals(this.b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.e(nf5Var);
        return this.a.g(nf5Var, this.b);
    }
}