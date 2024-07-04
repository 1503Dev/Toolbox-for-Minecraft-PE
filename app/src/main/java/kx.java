package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: kx  reason: default package */
public final class kx implements mt0 {
    public final bb P;
    public final Inflater Q;
    public int R;
    public boolean S;

    public kx(wj0 wj0Var, Inflater inflater) {
        this.P = wj0Var;
        this.Q = inflater;
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return this.P.c();
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.S) {
            return;
        }
        this.Q.end();
        this.S = true;
        this.P.close();
    }

    @Override // defpackage.mt0
    public final long q(za zaVar, long j) {
        sq0 Q;
        if (!this.S) {
            while (true) {
                boolean z = false;
                if (this.Q.needsInput()) {
                    int i = this.R;
                    if (i != 0) {
                        int remaining = i - this.Q.getRemaining();
                        this.R -= remaining;
                        this.P.skip(remaining);
                    }
                    if (this.Q.getRemaining() == 0) {
                        if (this.P.n()) {
                            z = true;
                        } else {
                            sq0 sq0Var = this.P.b().P;
                            int i2 = sq0Var.c;
                            int i3 = sq0Var.b;
                            int i4 = i2 - i3;
                            this.R = i4;
                            this.Q.setInput(sq0Var.a, i3, i4);
                        }
                    } else {
                        throw new IllegalStateException("?");
                    }
                }
                try {
                    Q = zaVar.Q(1);
                    int inflate = this.Q.inflate(Q.a, Q.c, (int) Math.min(8192L, 8192 - Q.c));
                    if (inflate > 0) {
                        Q.c += inflate;
                        long j2 = inflate;
                        zaVar.Q += j2;
                        return j2;
                    } else if (this.Q.finished() || this.Q.needsDictionary()) {
                        break;
                    } else if (z) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            int i5 = this.R;
            if (i5 != 0) {
                int remaining2 = i5 - this.Q.getRemaining();
                this.R -= remaining2;
                this.P.skip(remaining2);
            }
            if (Q.b == Q.c) {
                zaVar.P = Q.a();
                tq0.a(Q);
                return -1L;
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }
}