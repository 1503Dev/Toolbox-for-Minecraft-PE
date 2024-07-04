package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: vj0  reason: default package */
public final class vj0 implements ab {
    public final za P = new za();
    public final dt0 Q;
    public boolean R;

    public vj0(dt0 dt0Var) {
        this.Q = dt0Var;
    }

    @Override // defpackage.ab
    public final ab A(fb fbVar) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.R(fbVar);
        p();
        return this;
    }

    @Override // defpackage.ab
    public final za b() {
        return this.P;
    }

    @Override // defpackage.dt0
    public final cx0 c() {
        return this.Q.c();
    }

    @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            return;
        }
        Throwable th = null;
        try {
            za zaVar = this.P;
            long j = zaVar.Q;
            if (j > 0) {
                this.Q.e(zaVar, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.Q.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.R = true;
        if (th == null) {
            return;
        }
        Charset charset = b31.a;
        throw th;
    }

    @Override // defpackage.dt0
    public final void e(za zaVar, long j) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.e(zaVar, j);
        p();
    }

    @Override // defpackage.ab
    public final ab f(long j) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.U(j);
        p();
        return this;
    }

    @Override // defpackage.ab, defpackage.dt0, java.io.Flushable
    public final void flush() {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        za zaVar = this.P;
        long j = zaVar.Q;
        if (j > 0) {
            this.Q.e(zaVar, j);
        }
        this.Q.flush();
    }

    @Override // defpackage.ab
    public final ab i() {
        if (!this.R) {
            za zaVar = this.P;
            long j = zaVar.Q;
            if (j > 0) {
                this.Q.e(zaVar, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.R;
    }

    @Override // defpackage.ab
    public final long o(mt0 mt0Var) {
        if (mt0Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long q = mt0Var.q(this.P, 8192L);
            if (q == -1) {
                return j;
            }
            j += q;
            p();
        }
    }

    @Override // defpackage.ab
    public final ab p() {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        long E = this.P.E();
        if (E > 0) {
            this.Q.e(this.P, E);
        }
        return this;
    }

    public final String toString() {
        StringBuilder b = e5.b("buffer(");
        b.append(this.Q);
        b.append(")");
        return b.toString();
    }

    @Override // defpackage.ab
    public final ab v(String str) {
        if (!this.R) {
            za zaVar = this.P;
            zaVar.getClass();
            zaVar.X(0, str.length(), str);
            p();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ab
    public final ab w(long j) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.T(j);
        p();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        int write = this.P.write(byteBuffer);
        p();
        return write;
    }

    @Override // defpackage.ab
    public final ab write(byte[] bArr) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.m7write(bArr);
        p();
        return this;
    }

    @Override // defpackage.ab
    public final ab write(byte[] bArr, int i, int i2) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.m8write(bArr, i, i2);
        p();
        return this;
    }

    @Override // defpackage.ab
    public final ab writeByte(int i) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.S(i);
        p();
        return this;
    }

    @Override // defpackage.ab
    public final ab writeInt(int i) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.V(i);
        p();
        return this;
    }

    @Override // defpackage.ab
    public final ab writeShort(int i) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        this.P.W(i);
        p();
        return this;
    }
}