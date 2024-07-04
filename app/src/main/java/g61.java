package defpackage;

import defpackage.za;
import java.io.IOException;
import java.util.Random;

/* renamed from: g61  reason: default package */
public final class g61 {
    public final boolean a;
    public final Random b;
    public final ab c;
    public final za d;
    public boolean e;
    public final za f = new za();
    public final a g = new a();
    public boolean h;
    public final byte[] i;
    public final za.b j;

    /* renamed from: g61$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a implements dt0 {
        public int P;
        public long Q;
        public boolean R;
        public boolean S;

        public a() {
        }

        @Override // defpackage.dt0
        public final cx0 c() {
            return g61.this.c.c();
        }

        @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.S) {
                g61 g61Var = g61.this;
                g61Var.b(this.P, g61Var.f.Q, this.R, true);
                this.S = true;
                g61.this.h = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // defpackage.dt0
        public final void e(za zaVar, long j) {
            boolean z;
            long E;
            if (!this.S) {
                g61.this.f.e(zaVar, j);
                if (this.R) {
                    long j2 = this.Q;
                    if (j2 != -1 && g61.this.f.Q > j2 - 8192) {
                        z = true;
                        E = g61.this.f.E();
                        if (E <= 0 && !z) {
                            g61.this.b(this.P, E, this.R, false);
                            this.R = false;
                            return;
                        }
                        return;
                    }
                }
                z = false;
                E = g61.this.f.E();
                if (E <= 0) {
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        @Override // defpackage.dt0, java.io.Flushable
        public final void flush() {
            if (!this.S) {
                g61 g61Var = g61.this;
                g61Var.b(this.P, g61Var.f.Q, this.R, false);
                this.R = false;
                return;
            }
            throw new IOException("closed");
        }
    }

    public g61(boolean z, ab abVar, Random random) {
        if (abVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.a = z;
        this.c = abVar;
        this.d = abVar.b();
        this.b = random;
        this.i = z ? new byte[4] : null;
        this.j = z ? new za.b() : null;
    }

    public final void a(int i, fb fbVar) {
        if (!this.e) {
            int n = fbVar.n();
            if (n <= 125) {
                this.d.S(i | 128);
                if (this.a) {
                    this.d.S(n | 128);
                    this.b.nextBytes(this.i);
                    this.d.m7write(this.i);
                    if (n > 0) {
                        za zaVar = this.d;
                        long j = zaVar.Q;
                        zaVar.R(fbVar);
                        this.d.I(this.j);
                        this.j.a(j);
                        e61.b(this.j, this.i);
                        this.j.close();
                    }
                } else {
                    this.d.S(n);
                    this.d.R(fbVar);
                }
                this.c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public final void b(int i, long j, boolean z, boolean z2) {
        if (!this.e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.d.S(i);
            if (this.a) {
                i2 = 128;
            }
            if (j <= 125) {
                this.d.S(((int) j) | i2);
            } else if (j <= 65535) {
                this.d.S(i2 | 126);
                this.d.W((int) j);
            } else {
                this.d.S(i2 | 127);
                za zaVar = this.d;
                sq0 Q = zaVar.Q(8);
                byte[] bArr = Q.a;
                int i3 = Q.c;
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((j >>> 56) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((j >>> 48) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((j >>> 40) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((j >>> 32) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((j >>> 24) & 255);
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((j >>> 16) & 255);
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((j >>> 8) & 255);
                bArr[i10] = (byte) (j & 255);
                Q.c = i10 + 1;
                zaVar.Q += 8;
            }
            if (this.a) {
                this.b.nextBytes(this.i);
                this.d.m7write(this.i);
                if (j > 0) {
                    za zaVar2 = this.d;
                    long j2 = zaVar2.Q;
                    zaVar2.e(this.f, j);
                    this.d.I(this.j);
                    this.j.a(j2);
                    e61.b(this.j, this.i);
                    this.j.close();
                }
            } else {
                this.d.e(this.f, j);
            }
            this.c.i();
            return;
        }
        throw new IOException("closed");
    }
}