package defpackage;

/* renamed from: jr  reason: default package */
public abstract class jr implements dt0 {
    public final dt0 P;

    public jr(dt0 dt0Var) {
        if (dt0Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.P = dt0Var;
    }

    @Override // defpackage.dt0
    public final cx0 c() {
        return this.P.c();
    }

    @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.P.close();
    }

    @Override // defpackage.dt0, java.io.Flushable
    public void flush() {
        this.P.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.P.toString() + ")";
    }
}