package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: zy2  reason: default package */
public final class zy2 {
    public long a;

    public final long a(ByteBuffer byteBuffer) {
        List list;
        sw1 sw1Var;
        rw1 rw1Var;
        List list2;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            ow1 ow1Var = new ow1(new yy2(duplicate), az2.c);
            if (ow1Var.Q != null && ow1Var.R != bj5.V) {
                list = new fj5(ow1Var.U, ow1Var);
            } else {
                list = ow1Var.U;
            }
            Iterator it = list.iterator();
            while (true) {
                sw1Var = null;
                if (it.hasNext()) {
                    pw1 pw1Var = (pw1) it.next();
                    if (pw1Var instanceof rw1) {
                        rw1Var = (rw1) pw1Var;
                        break;
                    }
                } else {
                    rw1Var = null;
                    break;
                }
            }
            if (rw1Var.Q != null && rw1Var.R != bj5.V) {
                list2 = new fj5(rw1Var.U, rw1Var);
            } else {
                list2 = rw1Var.U;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                pw1 pw1Var2 = (pw1) it2.next();
                if (pw1Var2 instanceof sw1) {
                    sw1Var = (sw1) pw1Var2;
                    break;
                }
            }
            long j2 = (sw1Var.b0 * 1000) / sw1Var.a0;
            this.a = j2;
            return j2;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}