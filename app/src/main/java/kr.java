package defpackage;

/* renamed from: kr  reason: default package */
public abstract class kr implements mt0 {
    public final mt0 P;

    public kr(mt0 mt0Var) {
        if (mt0Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.P = mt0Var;
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return this.P.c();
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.P.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.P.toString() + ")";
    }
}