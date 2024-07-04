package defpackage;

import java.io.OutputStream;

/* renamed from: ob0  reason: default package */
public final class ob0 implements dt0 {
    public final /* synthetic */ cx0 P;
    public final /* synthetic */ OutputStream Q;

    public ob0(OutputStream outputStream, cx0 cx0Var) {
        this.P = cx0Var;
        this.Q = outputStream;
    }

    @Override // defpackage.dt0
    public final cx0 c() {
        return this.P;
    }

    @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Q.close();
    }

    @Override // defpackage.dt0
    public final void e(za zaVar, long j) {
        b31.a(zaVar.Q, 0L, j);
        while (j > 0) {
            this.P.f();
            sq0 sq0Var = zaVar.P;
            int min = (int) Math.min(j, sq0Var.c - sq0Var.b);
            this.Q.write(sq0Var.a, sq0Var.b, min);
            int i = sq0Var.b + min;
            sq0Var.b = i;
            long j2 = min;
            j -= j2;
            zaVar.Q -= j2;
            if (i == sq0Var.c) {
                zaVar.P = sq0Var.a();
                tq0.a(sq0Var);
            }
        }
    }

    @Override // defpackage.dt0, java.io.Flushable
    public final void flush() {
        this.Q.flush();
    }

    public final String toString() {
        StringBuilder b = e5.b("sink(");
        b.append(this.Q);
        b.append(")");
        return b.toString();
    }
}