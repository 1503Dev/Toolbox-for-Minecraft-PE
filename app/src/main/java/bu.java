package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: bu  reason: default package */
public final class bu implements mt0 {
    public final wj0 Q;
    public final Inflater R;
    public final kx S;
    public int P = 0;
    public final CRC32 T = new CRC32();

    public bu(mt0 mt0Var) {
        if (mt0Var != null) {
            Inflater inflater = new Inflater(true);
            this.R = inflater;
            Logger logger = rb0.a;
            wj0 wj0Var = new wj0(mt0Var);
            this.Q = wj0Var;
            this.S = new kx(wj0Var, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void a(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    @Override // defpackage.mt0
    public final cx0 c() {
        return this.Q.c();
    }

    @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.S.close();
    }

    public final void d(za zaVar, long j, long j2) {
        int i;
        sq0 sq0Var = zaVar.P;
        while (true) {
            int i2 = sq0Var.c;
            int i3 = sq0Var.b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            sq0Var = sq0Var.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(sq0Var.c - i, j2);
            this.T.update(sq0Var.a, (int) (sq0Var.b + j), min);
            j2 -= min;
            sq0Var = sq0Var.f;
            j = 0;
        }
    }

    @Override // defpackage.mt0
    public final long q(za zaVar, long j) {
        boolean z;
        long j2;
        if (this.P == 0) {
            this.Q.u(10L);
            byte G = this.Q.P.G(3L);
            if (((G >> 1) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d(this.Q.P, 0L, 10L);
            }
            a(8075, this.Q.readShort(), "ID1ID2");
            this.Q.skip(8L);
            if (((G >> 2) & 1) == 1) {
                this.Q.u(2L);
                if (z) {
                    d(this.Q.P, 0L, 2L);
                }
                short readShort = this.Q.P.readShort();
                Charset charset = b31.a;
                int i = readShort & 65535;
                long j3 = (short) (((i & 255) << 8) | ((i & 65280) >>> 8));
                this.Q.u(j3);
                if (z) {
                    j2 = j3;
                    d(this.Q.P, 0L, j3);
                } else {
                    j2 = j3;
                }
                this.Q.skip(j2);
            }
            if (((G >> 3) & 1) == 1) {
                long a = this.Q.a((byte) 0, 0L, RecyclerView.FOREVER_NS);
                if (a != -1) {
                    if (z) {
                        d(this.Q.P, 0L, a + 1);
                    }
                    this.Q.skip(a + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (((G >> 4) & 1) == 1) {
                long a2 = this.Q.a((byte) 0, 0L, RecyclerView.FOREVER_NS);
                if (a2 != -1) {
                    if (z) {
                        d(this.Q.P, 0L, a2 + 1);
                    }
                    this.Q.skip(a2 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z) {
                wj0 wj0Var = this.Q;
                wj0Var.u(2L);
                short readShort2 = wj0Var.P.readShort();
                Charset charset2 = b31.a;
                int i2 = readShort2 & 65535;
                a((short) (((i2 & 255) << 8) | ((i2 & 65280) >>> 8)), (short) this.T.getValue(), "FHCRC");
                this.T.reset();
            }
            this.P = 1;
        }
        if (this.P == 1) {
            long j4 = zaVar.Q;
            long q = this.S.q(zaVar, 8192L);
            if (q != -1) {
                d(zaVar, j4, q);
                return q;
            }
            this.P = 2;
        }
        if (this.P == 2) {
            wj0 wj0Var2 = this.Q;
            wj0Var2.u(4L);
            int readInt = wj0Var2.P.readInt();
            Charset charset3 = b31.a;
            a(((readInt & 255) << 24) | ((readInt & (-16777216)) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & 65280) << 8), (int) this.T.getValue(), "CRC");
            wj0 wj0Var3 = this.Q;
            wj0Var3.u(4L);
            int readInt2 = wj0Var3.P.readInt();
            a(((readInt2 & 255) << 24) | ((readInt2 & (-16777216)) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((readInt2 & 65280) << 8), (int) this.R.getBytesWritten(), "ISIZE");
            this.P = 3;
            if (!this.Q.n()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}