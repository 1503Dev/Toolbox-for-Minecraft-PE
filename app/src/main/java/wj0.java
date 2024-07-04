package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: wj0  reason: default package */
public final class wj0 implements bb {
    public final za P = new za();
    public final mt0 Q;
    public boolean R;

    /* renamed from: wj0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            wj0 wj0Var = wj0.this;
            if (wj0Var.R) {
                throw new IOException("closed");
            }
            return (int) Math.min(wj0Var.P.Q, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            wj0.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            wj0 wj0Var = wj0.this;
            if (wj0Var.R) {
                throw new IOException("closed");
            }
            za zaVar = wj0Var.P;
            if (zaVar.Q == 0 && wj0Var.Q.q(zaVar, 8192L) == -1) {
                return -1;
            }
            return wj0.this.P.readByte() & 255;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            if (wj0.this.R) {
                throw new IOException("closed");
            }
            b31.a(bArr.length, i, i2);
            wj0 wj0Var = wj0.this;
            za zaVar = wj0Var.P;
            if (zaVar.Q == 0 && wj0Var.Q.q(zaVar, 8192L) == -1) {
                return -1;
            }
            return wj0.this.P.read(bArr, i, i2);
        }

        public final String toString() {
            return wj0.this + ".inputStream()";
        }
    }

    public wj0(mt0 mt0Var) {
        if (mt0Var == null) {
            throw new NullPointerException("source == null");
        }
        this.Q = mt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // defpackage.bb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long B() {
        u(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!j(i2)) {
                break;
            }
            byte G = this.P.G(i);
            if ((G < 48 || G > 57) && ((G < 97 || G > 102) && (G < 65 || G > 70))) {
                break;
            }
            i = i2;
        }
        return this.P.B();
    }

    @Override // defpackage.bb
    public final String C(Charset charset) {
        if (charset != null) {
            this.P.o(this.Q);
            return this.P.C(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // defpackage.bb
    public final InputStream D() {
        return new a();
    }

    public final long a(byte b, long j, long j2) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        long j3 = 0;
        if (j2 >= 0) {
            while (j3 < j2) {
                long H = this.P.H(b, j3, j2);
                if (H == -1) {
                    za zaVar = this.P;
                    long j4 = zaVar.Q;
                    if (j4 >= j2 || this.Q.q(zaVar, 8192L) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j4);
                } else {
                    return H;
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j2)));
    }

    @Override // defpackage.bb
    public final za b() {
        return this.P;
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return this.Q.c();
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            return;
        }
        this.R = true;
        this.Q.close();
        this.P.a();
    }

    @Override // defpackage.bb
    public final fb h(long j) {
        u(j);
        return this.P.h(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.R;
    }

    @Override // defpackage.bb
    public final boolean j(long j) {
        za zaVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.R) {
            throw new IllegalStateException("closed");
        } else {
            do {
                zaVar = this.P;
                if (zaVar.Q >= j) {
                    return true;
                }
            } while (this.Q.q(zaVar, 8192L) != -1);
            return false;
        }
    }

    @Override // defpackage.bb
    public final long k(za zaVar) {
        za zaVar2;
        long j = 0;
        while (true) {
            int i = (this.Q.q(this.P, 8192L) > (-1L) ? 1 : (this.Q.q(this.P, 8192L) == (-1L) ? 0 : -1));
            zaVar2 = this.P;
            if (i == 0) {
                break;
            }
            long E = zaVar2.E();
            if (E > 0) {
                j += E;
                zaVar.e(this.P, E);
            }
        }
        long j2 = zaVar2.Q;
        if (j2 > 0) {
            long j3 = j + j2;
            zaVar.e(zaVar2, j2);
            return j3;
        }
        return j;
    }

    @Override // defpackage.bb
    public final String l() {
        return r(RecyclerView.FOREVER_NS);
    }

    @Override // defpackage.bb
    public final byte[] m() {
        this.P.o(this.Q);
        return this.P.m();
    }

    @Override // defpackage.bb
    public final boolean n() {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        return this.P.n() && this.Q.q(this.P, 8192L) == -1;
    }

    @Override // defpackage.mt0
    public final long q(za zaVar, long j) {
        if (zaVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.R) {
                throw new IllegalStateException("closed");
            } else {
                za zaVar2 = this.P;
                if (zaVar2.Q == 0 && this.Q.q(zaVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.P.q(zaVar, Math.min(j, this.P.Q));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // defpackage.bb
    public final String r(long j) {
        long j2;
        if (j >= 0) {
            if (j == RecyclerView.FOREVER_NS) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long a2 = a((byte) 10, 0L, j2);
            if (a2 != -1) {
                return this.P.O(a2);
            }
            if (j2 < RecyclerView.FOREVER_NS && j(j2) && this.P.G(j2 - 1) == 13 && j(1 + j2) && this.P.G(j2) == 10) {
                return this.P.O(j2);
            }
            za zaVar = new za();
            za zaVar2 = this.P;
            zaVar2.F(zaVar, 0L, Math.min(32L, zaVar2.Q));
            StringBuilder b = e5.b("\\n not found: limit=");
            b.append(Math.min(this.P.Q, j));
            b.append(" content=");
            b.append(zaVar.K().j());
            b.append((char) 8230);
            throw new EOFException(b.toString());
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        za zaVar = this.P;
        if (zaVar.Q == 0 && this.Q.q(zaVar, 8192L) == -1) {
            return -1;
        }
        return this.P.read(byteBuffer);
    }

    @Override // defpackage.bb
    public final int read(byte[] bArr) {
        long length = bArr.length;
        b31.a(bArr.length, 0, length);
        za zaVar = this.P;
        if (zaVar.Q == 0 && this.Q.q(zaVar, 8192L) == -1) {
            return -1;
        }
        return this.P.read(bArr, 0, (int) Math.min(length, this.P.Q));
    }

    @Override // defpackage.bb
    public final byte readByte() {
        u(1L);
        return this.P.readByte();
    }

    @Override // defpackage.bb
    public final void readFully(byte[] bArr) {
        try {
            u(bArr.length);
            this.P.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                za zaVar = this.P;
                long j = zaVar.Q;
                if (j <= 0) {
                    throw e;
                }
                int read = zaVar.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // defpackage.bb
    public final int readInt() {
        u(4L);
        return this.P.readInt();
    }

    @Override // defpackage.bb
    public final long readLong() {
        u(8L);
        return this.P.readLong();
    }

    @Override // defpackage.bb
    public final short readShort() {
        u(2L);
        return this.P.readShort();
    }

    @Override // defpackage.bb
    public final int s(cd0 cd0Var) {
        if (this.R) {
            throw new IllegalStateException("closed");
        }
        do {
            int P = this.P.P(cd0Var, true);
            if (P == -1) {
                return -1;
            }
            if (P != -2) {
                this.P.skip(cd0Var.P[P].n());
                return P;
            }
        } while (this.Q.q(this.P, 8192L) != -1);
        return -1;
    }

    @Override // defpackage.bb
    public final void skip(long j) {
        if (!this.R) {
            while (j > 0) {
                za zaVar = this.P;
                if (zaVar.Q == 0 && this.Q.q(zaVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.P.Q);
                this.P.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        StringBuilder b = e5.b("buffer(");
        b.append(this.Q);
        b.append(")");
        return b.toString();
    }

    @Override // defpackage.bb
    public final void u(long j) {
        if (!j(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.bb
    public final void z(za zaVar, long j) {
        try {
            u(j);
            this.P.z(zaVar, j);
        } catch (EOFException e) {
            zaVar.o(this.P);
            throw e;
        }
    }
}