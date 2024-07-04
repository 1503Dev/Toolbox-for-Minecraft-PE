package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: pb0  reason: default package */
public final class pb0 implements mt0 {
    public final /* synthetic */ cx0 P;
    public final /* synthetic */ InputStream Q;

    public pb0(InputStream inputStream, cx0 cx0Var) {
        this.P = cx0Var;
        this.Q = inputStream;
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return this.P;
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Q.close();
    }

    @Override // defpackage.mt0
    public final long q(za zaVar, long j) {
        boolean z = true;
        try {
            this.P.f();
            sq0 Q = zaVar.Q(1);
            int read = this.Q.read(Q.a, Q.c, (int) Math.min(8192L, 8192 - Q.c));
            if (read == -1) {
                return -1L;
            }
            Q.c += read;
            long j2 = read;
            zaVar.Q += j2;
            return j2;
        } catch (AssertionError e) {
            if ((e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) ? false : false) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        StringBuilder b = e5.b("source(");
        b.append(this.Q);
        b.append(")");
        return b.toString();
    }
}