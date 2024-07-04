package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: yi5  reason: default package */
public abstract class yi5 implements pw1 {
    public static final fy4 W = fy4.k(yi5.class);
    public final String P;
    public ByteBuffer S;
    public long T;
    public yy2 V;
    public long U = -1;
    public boolean R = true;
    public boolean Q = true;

    public yi5(String str) {
        this.P = str;
    }

    @Override // defpackage.pw1
    public final String a() {
        return this.P;
    }

    public final synchronized void b() {
        if (this.R) {
            return;
        }
        try {
            fy4 fy4Var = W;
            String str = this.P;
            fy4Var.h(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.S = this.V.g(this.T, this.U);
            this.R = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    @Override // defpackage.pw1
    public final void d() {
    }

    public final synchronized void e() {
        b();
        fy4 fy4Var = W;
        String str = this.P;
        fy4Var.h(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.S;
        if (byteBuffer != null) {
            this.Q = true;
            byteBuffer.rewind();
            c(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.S = null;
        }
    }

    @Override // defpackage.pw1
    public final void g(yy2 yy2Var, ByteBuffer byteBuffer, long j, mw1 mw1Var) {
        this.T = yy2Var.d();
        byteBuffer.remaining();
        this.U = j;
        this.V = yy2Var;
        yy2Var.P.position((int) (yy2Var.d() + j));
        this.R = false;
        this.Q = false;
        e();
    }
}