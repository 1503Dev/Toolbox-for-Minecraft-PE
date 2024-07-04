package defpackage;

import java.util.Map;

/* renamed from: f7  reason: default package */
public final class f7 extends w30<Object, Object> {
    public final /* synthetic */ g7 d;

    public f7(g7 g7Var) {
        this.d = g7Var;
    }

    @Override // defpackage.w30
    public final void a() {
        this.d.clear();
    }

    @Override // defpackage.w30
    public final Object b(int i, int i2) {
        return this.d.Q[i];
    }

    @Override // defpackage.w30
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // defpackage.w30
    public final int d() {
        return this.d.R;
    }

    @Override // defpackage.w30
    public final int e(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // defpackage.w30
    public final int f(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // defpackage.w30
    public final void g(Object obj, Object obj2) {
        this.d.add(obj);
    }

    @Override // defpackage.w30
    public final void h(int i) {
        this.d.o(i);
    }

    @Override // defpackage.w30
    public final Object i(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}