package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: o00  reason: default package */
public final class o00 extends FilterInputStream implements DataInput {
    public o00(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
    }

    public final byte a() {
        int read = ((FilterInputStream) this).in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int read = read(bArr, i, i2);
            if (read < 0) {
                throw new EOFException();
            }
            i += read;
            i2 -= read;
        }
    }

    @Override // java.io.DataInput
    public final int readInt() {
        byte a = a();
        byte a2 = a();
        return (a & 255) | ((a2 & 255) << 8) | ((a() & 255) << 16) | (a() << 24);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final long readLong() {
        byte a = a();
        byte a2 = a();
        byte a3 = a();
        byte a4 = a();
        byte a5 = a();
        byte a6 = a();
        return ((a2 & 255) << 8) | ((a4 & 255) << 24) | ((a6 & 255) << 40) | ((a() & 255) << 56) | ((a() & 255) << 48) | ((a5 & 255) << 32) | ((a3 & 255) << 16) | (a & 255);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        int readUnsignedShort = readUnsignedShort();
        byte[] bArr = new byte[readUnsignedShort];
        readFully(bArr, 0, readUnsignedShort);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return (a() & 255) | ((a() & 255) << 8);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) ((FilterInputStream) this).in.skip(i);
    }
}