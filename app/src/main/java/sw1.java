package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: sw1  reason: default package */
public final class sw1 extends yi5 {
    public int X;
    public Date Y;
    public Date Z;
    public long a0;
    public long b0;
    public double c0;
    public float d0;
    public gj5 e0;
    public long f0;

    public sw1() {
        super("mvhd");
        this.c0 = 1.0d;
        this.d0 = 1.0f;
        this.e0 = gj5.j;
    }

    @Override // defpackage.yi5
    public final void c(ByteBuffer byteBuffer) {
        long x;
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.X = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.Q) {
            e();
        }
        if (this.X == 1) {
            this.Y = mh.A(p5.y(byteBuffer));
            this.Z = mh.A(p5.y(byteBuffer));
            this.a0 = p5.x(byteBuffer);
            x = p5.y(byteBuffer);
        } else {
            this.Y = mh.A(p5.x(byteBuffer));
            this.Z = mh.A(p5.x(byteBuffer));
            this.a0 = p5.x(byteBuffer);
            x = p5.x(byteBuffer);
        }
        this.b0 = x;
        this.c0 = p5.t(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.d0 = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        p5.x(byteBuffer);
        p5.x(byteBuffer);
        double t = p5.t(byteBuffer);
        double t2 = p5.t(byteBuffer);
        double q = p5.q(byteBuffer);
        this.e0 = new gj5(t, t2, p5.t(byteBuffer), p5.t(byteBuffer), q, p5.q(byteBuffer), p5.q(byteBuffer), p5.t(byteBuffer), p5.t(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f0 = p5.x(byteBuffer);
    }

    public final String toString() {
        StringBuilder b = e5.b("MovieHeaderBox[creationTime=");
        b.append(this.Y);
        b.append(";modificationTime=");
        b.append(this.Z);
        b.append(";timescale=");
        b.append(this.a0);
        b.append(";duration=");
        b.append(this.b0);
        b.append(";rate=");
        b.append(this.c0);
        b.append(";volume=");
        b.append(this.d0);
        b.append(";matrix=");
        b.append(this.e0);
        b.append(";nextTrackId=");
        b.append(this.f0);
        b.append("]");
        return b.toString();
    }
}