package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: qp3  reason: default package */
public final class qp3 {
    public final nv4 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public qp3(nw4 nw4Var) {
        this.a = nw4Var;
        kq3 kq3Var = kq3.e;
        this.d = false;
    }

    public final kq3 a(kq3 kq3Var) {
        if (kq3Var.equals(kq3.e)) {
            throw new br3(kq3Var);
        }
        for (int i = 0; i < this.a.size(); i++) {
            kr3 kr3Var = (kr3) this.a.get(i);
            kq3 a = kr3Var.a(kq3Var);
            if (kr3Var.h()) {
                tv2.I(!a.equals(kq3.e));
                kq3Var = a;
            }
        }
        return kq3Var;
    }

    public final boolean b() {
        if (this.d && ((kr3) this.b.get(this.c.length - 1)).f()) {
            ByteBuffer[] byteBufferArr = this.c;
            if (!byteBufferArr[byteBufferArr.length - 1].hasRemaining()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z2;
        do {
            int i = 0;
            z = false;
            while (true) {
                ByteBuffer[] byteBufferArr = this.c;
                if (i <= byteBufferArr.length - 1) {
                    if (!byteBufferArr[i].hasRemaining()) {
                        kr3 kr3Var = (kr3) this.b.get(i);
                        if (kr3Var.f()) {
                            if (!this.c[i].hasRemaining() && i < this.c.length - 1) {
                                ((kr3) this.b.get(i + 1)).i();
                            }
                        } else {
                            if (i > 0) {
                                byteBuffer2 = this.c[i - 1];
                            } else if (byteBuffer.hasRemaining()) {
                                byteBuffer2 = byteBuffer;
                            } else {
                                byteBuffer2 = kr3.a;
                            }
                            kr3Var.b(byteBuffer2);
                            this.c[i] = kr3Var.c();
                            if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                    i++;
                }
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qp3) {
            qp3 qp3Var = (qp3) obj;
            if (this.a.size() == qp3Var.a.size()) {
                for (int i = 0; i < this.a.size(); i++) {
                    if (this.a.get(i) != qp3Var.a.get(i)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}