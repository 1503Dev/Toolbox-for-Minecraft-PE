package defpackage;

/* renamed from: mj5  reason: default package */
public final class mj5 implements lj5, hj5 {
    public static final mj5 b = new mj5(null);
    public final Object a;

    public mj5(Object obj) {
        this.a = obj;
    }

    public static mj5 a(Object obj) {
        if (obj != null) {
            return new mj5(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static mj5 b(Object obj) {
        return obj == null ? b : new mj5(obj);
    }

    @Override // defpackage.uj5
    public final Object c() {
        return this.a;
    }
}