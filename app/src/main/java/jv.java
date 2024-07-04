package defpackage;

import defpackage.su;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: jv  reason: default package */
public final class jv implements Closeable {
    public static final Logger V = Logger.getLogger(uu.class.getName());
    public final ab P;
    public final boolean Q;
    public final za R;
    public int S;
    public boolean T;
    public final su.b U;

    public jv(ab abVar, boolean z) {
        this.P = abVar;
        this.Q = z;
        za zaVar = new za();
        this.R = zaVar;
        this.U = new su.b(zaVar);
        this.S = 16384;
    }

    public final synchronized void E(int i, int i2) {
        if (this.T) {
            throw new IOException("closed");
        }
        if (bp.a(i2) == -1) {
            throw new IllegalArgumentException();
        }
        g(i, 4, (byte) 3, (byte) 0);
        this.P.writeInt(bp.a(i2));
        this.P.flush();
    }

    public final synchronized void F(long j, int i) {
        if (!this.T) {
            if (j != 0 && j <= 2147483647L) {
                g(i, 4, (byte) 8, (byte) 0);
                this.P.writeInt((int) j);
                this.P.flush();
            } else {
                Object[] objArr = {Long.valueOf(j)};
                fb fbVar = uu.a;
                throw new IllegalArgumentException(c31.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void G(long j, int i) {
        while (j > 0) {
            int min = (int) Math.min(this.S, j);
            long j2 = min;
            j -= j2;
            g(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.P.e(this.R, j2);
        }
    }

    public final synchronized void a(bp5 bp5Var) {
        int i;
        int i2;
        if (!this.T) {
            int i3 = this.S;
            int i4 = bp5Var.P;
            if ((i4 & 32) != 0) {
                i3 = ((int[]) bp5Var.Q)[5];
            }
            this.S = i3;
            if ((i4 & 2) != 0) {
                i = ((int[]) bp5Var.Q)[1];
            } else {
                i = -1;
            }
            if (i != -1) {
                su.b bVar = this.U;
                if ((i4 & 2) != 0) {
                    i2 = ((int[]) bp5Var.Q)[1];
                } else {
                    i2 = -1;
                }
                bVar.getClass();
                int min = Math.min(i2, 16384);
                int i5 = bVar.d;
                if (i5 != min) {
                    if (min < i5) {
                        bVar.b = Math.min(bVar.b, min);
                    }
                    bVar.c = true;
                    bVar.d = min;
                    int i6 = bVar.h;
                    if (min < i6) {
                        if (min == 0) {
                            Arrays.fill(bVar.e, (Object) null);
                            bVar.f = bVar.e.length - 1;
                            bVar.g = 0;
                            bVar.h = 0;
                        } else {
                            bVar.a(i6 - min);
                        }
                    }
                }
            }
            g(0, 0, (byte) 4, (byte) 1);
            this.P.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.T = true;
        this.P.close();
    }

    public final synchronized void d(boolean z, int i, za zaVar, int i2) {
        byte b;
        if (!this.T) {
            if (z) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            g(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.P.e(zaVar, i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void g(int i, int i2, byte b, byte b2) {
        Logger logger = V;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(uu.a(false, i, i2, b, b2));
        }
        int i3 = this.S;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                ab abVar = this.P;
                abVar.writeByte((i2 >>> 16) & 255);
                abVar.writeByte((i2 >>> 8) & 255);
                abVar.writeByte(i2 & 255);
                this.P.writeByte(b & 255);
                this.P.writeByte(b2 & 255);
                this.P.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            Object[] objArr = {Integer.valueOf(i)};
            fb fbVar = uu.a;
            throw new IllegalArgumentException(c31.j("reserved bit set: %s", objArr));
        }
        Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(i2)};
        fb fbVar2 = uu.a;
        throw new IllegalArgumentException(c31.j("FRAME_SIZE_ERROR length > %d: %d", objArr2));
    }

    public final synchronized void t(int i, int i2, byte[] bArr) {
        if (!this.T) {
            if (bp.a(i2) != -1) {
                g(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.P.writeInt(i);
                this.P.writeInt(bp.a(i2));
                if (bArr.length > 0) {
                    this.P.write(bArr);
                }
                this.P.flush();
            } else {
                fb fbVar = uu.a;
                throw new IllegalArgumentException(c31.j("errorCode.httpCode == -1", new Object[0]));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void y(int i, int i2, boolean z) {
        if (this.T) {
            throw new IOException("closed");
        }
        g(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.P.writeInt(i);
        this.P.writeInt(i2);
        this.P.flush();
    }
}