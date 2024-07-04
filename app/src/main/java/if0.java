package defpackage;

/* renamed from: if0  reason: default package */
public final class if0<T> extends hf0<T> {
    public final Object c;

    public if0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.hf0
    public final T a() {
        T t;
        synchronized (this.c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // defpackage.hf0
    public final boolean b(T t) {
        boolean b;
        synchronized (this.c) {
            b = super.b(t);
        }
        return b;
    }
}