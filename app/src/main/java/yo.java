package defpackage;

/* renamed from: yo  reason: default package */
public abstract class yo<T> extends qr0 {
    public yo(bm0 bm0Var) {
        super(bm0Var);
    }

    public abstract void d(is isVar, T t);

    public final void e(T t) {
        is a = a();
        try {
            d(a, t);
            a.Q.executeInsert();
        } finally {
            c(a);
        }
    }
}