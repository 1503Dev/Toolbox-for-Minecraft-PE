package defpackage;

import java.io.IOException;

/* renamed from: s7  reason: default package */
public final class s7 implements mt0 {
    public final /* synthetic */ mt0 P;
    public final /* synthetic */ t7 Q;

    public s7(qb0 qb0Var, pb0 pb0Var) {
        this.Q = qb0Var;
        this.P = pb0Var;
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return this.Q;
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Q.j();
        try {
            try {
                this.P.close();
                this.Q.l(true);
            } catch (IOException e) {
                throw this.Q.k(e);
            }
        } catch (Throwable th) {
            this.Q.l(false);
            throw th;
        }
    }

    @Override // defpackage.mt0
    public final long q(za zaVar, long j) {
        this.Q.j();
        try {
            try {
                long q = this.P.q(zaVar, 8192L);
                this.Q.l(true);
                return q;
            } catch (IOException e) {
                throw this.Q.k(e);
            }
        } catch (Throwable th) {
            this.Q.l(false);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder b = e5.b("AsyncTimeout.source(");
        b.append(this.P);
        b.append(")");
        return b.toString();
    }
}