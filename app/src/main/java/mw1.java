package defpackage;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: mw1  reason: default package */
public abstract class mw1 implements nw1 {
    public static final Logger b = Logger.getLogger(mw1.class.getName());
    public final lw1 a = new lw1();

    public abstract pw1 a(String str);

    public final pw1 b(yy2 yy2Var, qw1 qw1Var) {
        int a;
        long j;
        long d = yy2Var.d();
        ((ByteBuffer) this.a.get()).rewind().limit(8);
        do {
            a = yy2Var.a((ByteBuffer) this.a.get());
            if (a == 8) {
                ((ByteBuffer) this.a.get()).rewind();
                long x = p5.x((ByteBuffer) this.a.get());
                if (x < 8 && x > 1) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(x);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) this.a.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (x == 1) {
                        ((ByteBuffer) this.a.get()).limit(16);
                        yy2Var.a((ByteBuffer) this.a.get());
                        ((ByteBuffer) this.a.get()).position(8);
                        j = p5.y((ByteBuffer) this.a.get()) - 16;
                    } else if (x == 0) {
                        j = yy2Var.P.limit() - yy2Var.d();
                    } else {
                        j = x - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.a.get()).limit(((ByteBuffer) this.a.get()).limit() + 16);
                        yy2Var.a((ByteBuffer) this.a.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = ((ByteBuffer) this.a.get()).position() - 16; position < ((ByteBuffer) this.a.get()).position(); position++) {
                            bArr2[position - (((ByteBuffer) this.a.get()).position() - 16)] = ((ByteBuffer) this.a.get()).get(position);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    if (qw1Var instanceof pw1) {
                        ((pw1) qw1Var).a();
                    }
                    pw1 a2 = a(str);
                    a2.d();
                    ((ByteBuffer) this.a.get()).rewind();
                    a2.g(yy2Var, (ByteBuffer) this.a.get(), j2, this);
                    return a2;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (a >= 0);
        yy2Var.P.position((int) d);
        throw new EOFException();
    }
}