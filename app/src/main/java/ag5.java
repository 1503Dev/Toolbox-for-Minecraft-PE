package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: ag5  reason: default package */
public final class ag5 {
    public final ArrayDeque a = new ArrayDeque();

    public final void a(gd5 gd5Var) {
        if (gd5Var.r()) {
            int binarySearch = Arrays.binarySearch(cg5.W, gd5Var.o());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int I = cg5.I(binarySearch + 1);
            if (!this.a.isEmpty() && ((gd5) this.a.peek()).o() < I) {
                int I2 = cg5.I(binarySearch);
                gd5 gd5Var2 = (gd5) this.a.pop();
                while (!this.a.isEmpty() && ((gd5) this.a.peek()).o() < I2) {
                    gd5Var2 = new cg5((gd5) this.a.pop(), gd5Var2);
                }
                cg5 cg5Var = new cg5(gd5Var2, gd5Var);
                while (!this.a.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(cg5.W, cg5Var.R);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((gd5) this.a.peek()).o() >= cg5.I(binarySearch2 + 1)) {
                        break;
                    }
                    cg5Var = new cg5((gd5) this.a.pop(), cg5Var);
                }
                this.a.push(cg5Var);
                return;
            }
            this.a.push(gd5Var);
        } else if (gd5Var instanceof cg5) {
            cg5 cg5Var2 = (cg5) gd5Var;
            a(cg5Var2.S);
            a(cg5Var2.T);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(gd5Var.getClass())));
        }
    }
}