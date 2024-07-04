package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: p00  reason: default package */
public final class p00 extends FilterOutputStream implements DataOutput {
    public p00(ByteArrayOutputStream byteArrayOutputStream) {
        super(new DataOutputStream(byteArrayOutputStream));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public final void writeBytes(String str) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) {
        writeShort(i);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            writeShort(str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) {
        ((FilterOutputStream) this).out.write(i & 255);
        ((FilterOutputStream) this).out.write((i >> 8) & 255);
        ((FilterOutputStream) this).out.write((i >> 16) & 255);
        ((FilterOutputStream) this).out.write((i >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) {
        ((FilterOutputStream) this).out.write((int) (j & 255));
        ((FilterOutputStream) this).out.write((int) ((j >> 8) & 255));
        ((FilterOutputStream) this).out.write((int) ((j >> 16) & 255));
        ((FilterOutputStream) this).out.write((int) ((j >> 24) & 255));
        ((FilterOutputStream) this).out.write((int) ((j >> 32) & 255));
        ((FilterOutputStream) this).out.write((int) ((j >> 40) & 255));
        ((FilterOutputStream) this).out.write((int) ((j >> 48) & 255));
        ((FilterOutputStream) this).out.write((int) ((j >> 54) & 255));
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) {
        ((FilterOutputStream) this).out.write(i & 255);
        ((FilterOutputStream) this).out.write((i >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) {
        writeShort((short) str.length());
        ((FilterOutputStream) this).out.write(str.getBytes(StandardCharsets.UTF_8));
    }
}