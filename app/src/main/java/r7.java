package defpackage;

import java.io.IOException;

/* renamed from: r7  reason: default package */
public final class r7 implements dt0 {
    public final /* synthetic */ dt0 P;
    public final /* synthetic */ t7 Q;

    public r7(qb0 qb0Var, ob0 ob0Var) {
        this.Q = qb0Var;
        this.P = ob0Var;
    }

    @Override // defpackage.dt0
    public final cx0 c() {
        return this.Q;
    }

    @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.dt0
    public final void e(za zaVar, long j) {
        b31.a(zaVar.Q, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            sq0 sq0Var = zaVar.P;
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += sq0Var.c - sq0Var.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                sq0Var = sq0Var.f;
            }
            this.Q.j();
            try {
                try {
                    this.P.e(zaVar, j2);
                    j -= j2;
                    this.Q.l(true);
                } catch (IOException e) {
                    throw this.Q.k(e);
                }
            } catch (Throwable th) {
                this.Q.l(false);
                throw th;
            }
        }
    }

    @Override // defpackage.dt0, java.io.Flushable
    public final void flush() {
        this.Q.j();
        try {
            try {
                this.P.flush();
                this.Q.l(true);
            } catch (IOException e) {
                throw this.Q.k(e);
            }
        } catch (Throwable th) {
            this.Q.l(false);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder b = e5.b("AsyncTimeout.sink(");
        b.append(this.P);
        b.append(")");
        return b.toString();
    }
}