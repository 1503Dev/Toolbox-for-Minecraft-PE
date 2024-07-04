package defpackage;

import java.nio.channels.WritableByteChannel;

/* renamed from: ab  reason: default package */
public interface ab extends dt0, WritableByteChannel {
    ab A(fb fbVar);

    za b();

    ab f(long j);

    @Override // defpackage.dt0, java.io.Flushable
    void flush();

    ab i();

    long o(mt0 mt0Var);

    ab p();

    ab v(String str);

    ab w(long j);

    ab write(byte[] bArr);

    ab write(byte[] bArr, int i, int i2);

    ab writeByte(int i);

    ab writeInt(int i);

    ab writeShort(int i);
}