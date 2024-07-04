package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/* renamed from: yv1  reason: default package */
public final class yv1 extends FilterInputStream {
    public final long P;
    public long Q;

    public yv1(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.P = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.Q++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.Q += read;
        }
        return read;
    }
}