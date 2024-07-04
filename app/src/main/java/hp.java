package defpackage;

import defpackage.nl0;
import java.io.IOException;
import java.net.ProtocolException;
import javax.annotation.Nullable;

/* renamed from: hp  reason: default package */
public final class hp {
    public final d11 a;
    public final fp b;
    public final jp c;
    public final ip d;
    public boolean e;

    /* renamed from: hp$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a extends jr {
        public boolean Q;
        public long R;
        public long S;
        public boolean T;

        public a(dt0 dt0Var, long j) {
            super(dt0Var);
            this.R = j;
        }

        @Nullable
        public final IOException a(@Nullable IOException iOException) {
            if (this.Q) {
                return iOException;
            }
            this.Q = true;
            return hp.this.a(false, true, iOException);
        }

        @Override // defpackage.jr, defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.T) {
                return;
            }
            this.T = true;
            long j = this.R;
            if (j != -1 && this.S != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.dt0
        public final void e(za zaVar, long j) {
            if (!this.T) {
                long j2 = this.R;
                if (j2 != -1 && this.S + j > j2) {
                    StringBuilder b = e5.b("expected ");
                    b.append(this.R);
                    b.append(" bytes but received ");
                    b.append(this.S + j);
                    throw new ProtocolException(b.toString());
                }
                try {
                    this.P.e(zaVar, j);
                    this.S += j;
                    return;
                } catch (IOException e) {
                    throw a(e);
                }
            }
            throw new IllegalStateException("closed");
        }

        @Override // defpackage.jr, defpackage.dt0, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }
    }

    /* renamed from: hp$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b extends kr {
        public final long Q;
        public long R;
        public boolean S;
        public boolean T;

        public b(mt0 mt0Var, long j) {
            super(mt0Var);
            this.Q = j;
            if (j == 0) {
                a(null);
            }
        }

        @Nullable
        public final IOException a(@Nullable IOException iOException) {
            if (this.S) {
                return iOException;
            }
            this.S = true;
            return hp.this.a(true, false, iOException);
        }

        @Override // defpackage.kr, defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.T) {
                return;
            }
            this.T = true;
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.mt0
        public final long q(za zaVar, long j) {
            if (!this.T) {
                try {
                    long q = this.P.q(zaVar, 8192L);
                    if (q == -1) {
                        a(null);
                        return -1L;
                    }
                    long j2 = this.R + q;
                    long j3 = this.Q;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.Q + " bytes but received " + j2);
                    }
                    this.R = j2;
                    if (j2 == j3) {
                        a(null);
                    }
                    return q;
                } catch (IOException e) {
                    throw a(e);
                }
            }
            throw new IllegalStateException("closed");
        }
    }

    public hp(d11 d11Var, ob obVar, fp fpVar, jp jpVar, ip ipVar) {
        this.a = d11Var;
        this.b = fpVar;
        this.c = jpVar;
        this.d = ipVar;
    }

    @Nullable
    public final IOException a(boolean z, boolean z2, @Nullable IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        if (z2) {
            this.b.getClass();
        }
        if (z) {
            this.b.getClass();
        }
        return this.a.c(this, z2, z, iOException);
    }

    public final zj0 b() {
        return this.d.h();
    }

    @Nullable
    public final nl0.a c(boolean z) {
        try {
            nl0.a g = this.d.g(z);
            if (g != null) {
                dy.a.getClass();
                g.m = this;
            }
            return g;
        } catch (IOException e) {
            this.b.getClass();
            d(e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6 > 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(IOException iOException) {
        boolean z;
        jp jpVar = this.c;
        synchronized (jpVar.c) {
            jpVar.h = true;
        }
        zj0 h = this.d.h();
        synchronized (h.b) {
            if (iOException instanceof du0) {
                int i = ((du0) iOException).P;
                if (i == 5) {
                    int i2 = h.n + 1;
                    h.n = i2;
                } else if (i != 6) {
                    h.k = true;
                    h.l++;
                }
            } else {
                if (h.h != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (iOException instanceof hf)) {
                    h.k = true;
                    if (h.m == 0) {
                        if (iOException != null) {
                            h.b.a(h.c, iOException);
                        }
                        h.l++;
                    }
                }
            }
        }
    }
}