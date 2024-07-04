package defpackage;

import java.io.OutputStream;

/* renamed from: ya  reason: default package */
public final class ya extends OutputStream {
    public final /* synthetic */ za P;

    public ya(za zaVar) {
        this.P = zaVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.P + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.P.S((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.P.m8write(bArr, i, i2);
    }
}