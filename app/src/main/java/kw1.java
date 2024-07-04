package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: kw1  reason: default package */
public final class kw1 extends ByteArrayOutputStream {
    public final vv1 P;

    public kw1(vv1 vv1Var, int i) {
        this.P = vv1Var;
        ((ByteArrayOutputStream) this).buf = vv1Var.b(Math.max(i, 256));
    }

    public final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] b = this.P.b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b, 0, ((ByteArrayOutputStream) this).count);
        this.P.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.P.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.P.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}