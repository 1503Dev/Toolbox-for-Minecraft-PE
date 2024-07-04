package defpackage;

import java.util.Map;

/* renamed from: d7  reason: default package */
public final class d7 extends w30<Object, Object> {
    public final /* synthetic */ e7 d;

    public d7(e7 e7Var) {
        this.d = e7Var;
    }

    @Override // defpackage.w30
    public final void a() {
        this.d.clear();
    }

    @Override // defpackage.w30
    public final Object b(int i, int i2) {
        return this.d.Q[(i << 1) + i2];
    }

    @Override // defpackage.w30
    public final Map<Object, Object> c() {
        return this.d;
    }

    @Override // defpackage.w30
    public final int d() {
        return this.d.R;
    }

    @Override // defpackage.w30
    public final int e(Object obj) {
        return this.d.e(obj);
    }

    @Override // defpackage.w30
    public final int f(Object obj) {
        return this.d.g(obj);
    }

    @Override // defpackage.w30
    public final void g(Object obj, Object obj2) {
        this.d.put(obj, obj2);
    }

    @Override // defpackage.w30
    public final void h(int i) {
        this.d.i(i);
    }

    @Override // defpackage.w30
    public final Object i(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.d.Q;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}