package defpackage;

import defpackage.pg;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: zt  reason: default package */
public final class zt extends pg.a {
    public final xt a;

    public zt(xt xtVar) {
        this.a = xtVar;
    }

    @Override // defpackage.pg.a
    public final pg a(Type type) {
        return new au(this.a, this.a.f(new u11(type)));
    }

    @Override // defpackage.pg.a
    public final pg<ql0, ?> b(Type type, Annotation[] annotationArr, vl0 vl0Var) {
        return new wq1(this.a, this.a.f(new u11(type)));
    }
}