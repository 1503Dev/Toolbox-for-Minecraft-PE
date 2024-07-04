package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ue5  reason: default package */
public final class ue5 extends InputStream {
    public Iterator P;
    public ByteBuffer Q;
    public int R = 0;
    public int S;
    public int T;
    public boolean U;
    public byte[] V;
    public int W;
    public long X;

    public ue5(ArrayList arrayList) {
        this.P = arrayList.iterator();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.R++;
        }
        this.S = -1;
        if (d()) {
            return;
        }
        this.Q = re5.c;
        this.S = 0;
        this.T = 0;
        this.X = 0L;
    }

    public final void a(int i) {
        int i2 = this.T + i;
        this.T = i2;
        if (i2 == this.Q.limit()) {
            d();
        }
    }

    public final boolean d() {
        this.S++;
        if (this.P.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.P.next();
            this.Q = byteBuffer;
            this.T = byteBuffer.position();
            if (this.Q.hasArray()) {
                this.U = true;
                this.V = this.Q.array();
                this.W = this.Q.arrayOffset();
            } else {
                this.U = false;
                this.X = zg5.j(this.Q);
                this.V = null;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.S == this.R) {
            return -1;
        }
        int f = (this.U ? this.V[this.T + this.W] : zg5.f(this.T + this.X)) & 255;
        a(1);
        return f;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.S == this.R) {
            return -1;
        }
        int limit = this.Q.limit();
        int i3 = this.T;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.U) {
            System.arraycopy(this.V, i3 + this.W, bArr, i, i2);
        } else {
            int position = this.Q.position();
            this.Q.position(this.T);
            this.Q.get(bArr, i, i2);
            this.Q.position(position);
        }
        a(i2);
        return i2;
    }
}