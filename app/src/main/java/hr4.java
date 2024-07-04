package defpackage;

/* renamed from: hr4  reason: default package */
public final class hr4 extends vx4 {
    public Object W;

    public hr4(Object obj) {
        this.W = obj;
    }

    @Override // defpackage.vx4
    public final String f() {
        Object obj = this.W;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.vx4
    public final void g() {
        this.W = null;
    }

    @Override // defpackage.vx4
    public final boolean h(Object obj) {
        return super.h(obj);
    }

    @Override // defpackage.vx4
    public final boolean i(Throwable th) {
        return super.i(th);
    }
}