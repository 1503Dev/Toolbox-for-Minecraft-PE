package defpackage;

import defpackage.kk0;
import java.lang.reflect.Field;

/* renamed from: jk0  reason: default package */
public final class jk0 extends kk0.b {
    public final /* synthetic */ Field d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ l11 f;
    public final /* synthetic */ xt g;
    public final /* synthetic */ u11 h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk0(String str, boolean z, boolean z2, Field field, boolean z3, l11 l11Var, xt xtVar, u11 u11Var, boolean z4) {
        super(str, z, z2);
        this.d = field;
        this.e = z3;
        this.f = l11Var;
        this.g = xtVar;
        this.h = u11Var;
        this.i = z4;
    }

    @Override // defpackage.kk0.b
    public final void a(c00 c00Var, Object obj) {
        Object a = this.f.a(c00Var);
        if (a == null && this.i) {
            return;
        }
        this.d.set(obj, a);
    }

    @Override // defpackage.kk0.b
    public final void b(i00 i00Var, Object obj) {
        l11 n11Var;
        Object obj2 = this.d.get(obj);
        if (this.e) {
            n11Var = this.f;
        } else {
            n11Var = new n11(this.g, this.f, this.h.b);
        }
        n11Var.b(i00Var, obj2);
    }

    @Override // defpackage.kk0.b
    public final boolean c(Object obj) {
        return this.b && this.d.get(obj) != obj;
    }
}