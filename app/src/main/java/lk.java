package defpackage;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: lk  reason: default package */
public final class lk extends f10 {
    public static final byte[] T = new byte[0];
    public final int R;
    public int S;

    public lk(int i, InputStream inputStream) {
        super(i, inputStream);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.R = i;
        this.S = i;
        if (i == 0) {
            d();
        }
    }

    @Override // defpackage.f10
    public final int a() {
        return this.S;
    }

    public final byte[] g() {
        int i = this.S;
        if (i == 0) {
            return T;
        }
        byte[] bArr = new byte[i];
        int b = i - g9.b(this.P, bArr);
        this.S = b;
        if (b == 0) {
            d();
            return bArr;
        }
        StringBuilder b2 = e5.b("DEF length ");
        b2.append(this.R);
        b2.append(" object truncated by ");
        b2.append(this.S);
        throw new EOFException(b2.toString());
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.S == 0) {
            return -1;
        }
        int read = this.P.read();
        if (read >= 0) {
            int i = this.S - 1;
            this.S = i;
            if (i == 0) {
                d();
            }
            return read;
        }
        StringBuilder b = e5.b("DEF length ");
        b.append(this.R);
        b.append(" object truncated by ");
        b.append(this.S);
        throw new EOFException(b.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.S;
        if (i3 == 0) {
            return -1;
        }
        int read = this.P.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.S - read;
            this.S = i4;
            if (i4 == 0) {
                d();
            }
            return read;
        }
        StringBuilder b = e5.b("DEF length ");
        b.append(this.R);
        b.append(" object truncated by ");
        b.append(this.S);
        throw new EOFException(b.toString());
    }
}