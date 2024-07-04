package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ib  reason: default package */
public final class ib implements mt0 {
    public boolean P;
    public final /* synthetic */ bb Q;
    public final /* synthetic */ ab R;

    public ib(bb bbVar, kb kbVar, vj0 vj0Var) {
        this.Q = bbVar;
        this.R = vj0Var;
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return this.Q.c();
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.P || c31.i(this, TimeUnit.MILLISECONDS)) {
            this.Q.close();
        } else {
            this.P = true;
            throw null;
        }
    }

    @Override // defpackage.mt0
    public final long q(za zaVar, long j) {
        try {
            long q = this.Q.q(zaVar, 8192L);
            if (q == -1) {
                if (!this.P) {
                    this.P = true;
                    this.R.close();
                }
                return -1L;
            }
            zaVar.F(this.R.b(), zaVar.Q - q, q);
            this.R.p();
            return q;
        } catch (IOException e) {
            if (!this.P) {
                this.P = true;
                throw null;
            }
            throw e;
        }
    }
}