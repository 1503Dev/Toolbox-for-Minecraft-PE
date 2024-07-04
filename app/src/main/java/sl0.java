package defpackage;

import java.io.Serializable;

/* renamed from: sl0  reason: default package */
public final class sl0 implements Serializable {
    public final Throwable P;

    public sl0(Throwable th) {
        hy.e("exception", th);
        this.P = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sl0) && hy.a(this.P, ((sl0) obj).P);
    }

    public final int hashCode() {
        return this.P.hashCode();
    }

    public final String toString() {
        StringBuilder b = e5.b("Failure(");
        b.append(this.P);
        b.append(')');
        return b.toString();
    }
}