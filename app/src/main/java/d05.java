package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: d05  reason: default package */
public final class d05 implements e05 {
    public final /* synthetic */ o65 a;
    public final /* synthetic */ u55 b;

    public d05(o65 o65Var, u55 u55Var) {
        this.a = o65Var;
        this.b = u55Var;
    }

    @Override // defpackage.e05
    public final zz4 a(Class cls) {
        try {
            return new w05(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.e05
    public final Set b() {
        return this.a.b.keySet();
    }

    @Override // defpackage.e05
    public final zz4 c() {
        o65 o65Var = this.a;
        return new w05(o65Var, o65Var.c);
    }

    @Override // defpackage.e05
    public final Class d() {
        return this.a.getClass();
    }

    @Override // defpackage.e05
    public final Class i() {
        return this.b.getClass();
    }
}