package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: ql0  reason: default package */
public abstract class ql0 implements Closeable {
    @Nullable
    public a P;

    /* renamed from: ql0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends Reader {
        public final bb P;
        public final Charset Q;
        public boolean R;
        @Nullable
        public InputStreamReader S;

        public a(bb bbVar, Charset charset) {
            this.P = bbVar;
            this.Q = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.R = true;
            InputStreamReader inputStreamReader = this.S;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.P.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            if (this.R) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.S;
            if (inputStreamReader == null) {
                InputStreamReader inputStreamReader2 = new InputStreamReader(this.P.D(), c31.a(this.P, this.Q));
                this.S = inputStreamReader2;
                inputStreamReader = inputStreamReader2;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    public static /* synthetic */ void a(Throwable th, bb bbVar) {
        if (th == null) {
            bbVar.close();
            return;
        }
        try {
            bbVar.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c31.c(y());
    }

    public final byte[] d() {
        long g = g();
        if (g > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + g);
        }
        bb y = y();
        try {
            byte[] m = y.m();
            a(null, y);
            if (g == -1 || g == m.length) {
                return m;
            }
            throw new IOException("Content-Length (" + g + ") and stream length (" + m.length + ") disagree");
        } finally {
        }
    }

    public abstract long g();

    @Nullable
    public abstract e50 t();

    public abstract bb y();
}