package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: b05  reason: default package */
public final class b05 implements e05 {
    public final /* synthetic */ zz4 a;

    public b05(zz4 zz4Var) {
        this.a = zz4Var;
    }

    @Override // defpackage.e05
    public final zz4 a(Class cls) {
        if (((a05) this.a).b.equals(cls)) {
            return this.a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // defpackage.e05
    public final Set b() {
        return Collections.singleton(((a05) this.a).b);
    }

    @Override // defpackage.e05
    public final zz4 c() {
        return this.a;
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