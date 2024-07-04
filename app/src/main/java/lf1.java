package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: lf1  reason: default package */
public final class lf1 extends InputStream {
    public InputStream P;
    public int Q;

    public lf1(FileInputStream fileInputStream, int i, int i2) {
        this.P = fileInputStream;
        while (i > 0) {
            i -= (int) fileInputStream.skip(i);
        }
        this.Q = i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        int available = this.P.available();
        int i = this.Q;
        return available <= i ? available : i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.P.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.Q;
        if (i == 0) {
            return -1;
        }
        this.Q = i - 1;
        return this.P.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.Q;
        if (i3 == 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int read = this.P.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.Q -= read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = (int) j;
        if (i <= 0) {
            return 0L;
        }
        int i2 = this.Q;
        if (i > i2) {
            i = i2;
        }
        this.Q = i2 - i;
        while (i > 0) {
            i -= (int) this.P.skip(j);
        }
        return j;
    }
}