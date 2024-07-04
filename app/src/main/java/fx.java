package defpackage;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: fx  reason: default package */
public final class fx extends f10 {
    public int R;
    public int S;
    public boolean T;
    public boolean U;

    public fx(int i, InputStream inputStream) {
        super(i, inputStream);
        this.T = false;
        this.U = true;
        this.R = inputStream.read();
        int read = inputStream.read();
        this.S = read;
        if (read < 0) {
            throw new EOFException();
        }
        g();
    }

    public final boolean g() {
        if (!this.T && this.U && this.R == 0 && this.S == 0) {
            this.T = true;
            d();
        }
        return this.T;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (g()) {
            return -1;
        }
        int read = this.P.read();
        if (read >= 0) {
            int i = this.R;
            this.R = this.S;
            this.S = read;
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.U || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.T) {
            return -1;
        }
        int read = this.P.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.R;
            bArr[i + 1] = (byte) this.S;
            this.R = this.P.read();
            int read2 = this.P.read();
            this.S = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final void t(boolean z) {
        this.U = z;
        g();
    }
}