package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: c05  reason: default package */
public final class c05 implements e05 {
    public final /* synthetic */ u55 a;

    public c05(u55 u55Var) {
        this.a = u55Var;
    }

    @Override // defpackage.e05
    public final zz4 a(Class cls) {
        try {
            return new a05(this.a, cls);
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
        u55 u55Var = this.a;
        return new a05(u55Var, u55Var.c);
    }

    @Override // defpackage.e05
    public final Class d() {
        return this.a.getClass();
    }

    @Override // defpackage.e05
    public final Class i() {
        return null;
    }
}