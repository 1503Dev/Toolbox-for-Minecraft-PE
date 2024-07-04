package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: bb  reason: default package */
public interface bb extends mt0, ReadableByteChannel {
    long B();

    String C(Charset charset);

    InputStream D();

    @Deprecated
    za b();

    fb h(long j);

    boolean j(long j);

    long k(za zaVar);

    String l();

    byte[] m();

    boolean n();

    String r(long j);

    int read(byte[] bArr);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    int s(cd0 cd0Var);

    void skip(long j);

    void u(long j);

    void z(za zaVar, long j);
}