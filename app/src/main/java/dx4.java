package defpackage;

import java.io.OutputStream;

/* renamed from: dx4  reason: default package */
public final class dx4 extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        gt4.f(i, i2 + i, bArr.length);
    }
}