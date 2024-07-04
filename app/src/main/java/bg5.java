package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bg5  reason: default package */
public final class bg5 implements Iterator {
    public final ArrayDeque P;
    public dd5 Q;

    public bg5(gd5 gd5Var) {
        dd5 dd5Var;
        if (gd5Var instanceof cg5) {
            cg5 cg5Var = (cg5) gd5Var;
            ArrayDeque arrayDeque = new ArrayDeque(cg5Var.V);
            this.P = arrayDeque;
            arrayDeque.push(cg5Var);
            gd5 gd5Var2 = cg5Var.S;
            while (gd5Var2 instanceof cg5) {
                cg5 cg5Var2 = (cg5) gd5Var2;
                this.P.push(cg5Var2);
                gd5Var2 = cg5Var2.S;
            }
            dd5Var = (dd5) gd5Var2;
        } else {
            this.P = null;
            dd5Var = (dd5) gd5Var;
        }
        this.Q = dd5Var;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final dd5 next() {
        dd5 dd5Var;
        boolean z;
        dd5 dd5Var2 = this.Q;
        if (dd5Var2 != null) {
            do {
                ArrayDeque arrayDeque = this.P;
                dd5Var = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                Object obj = ((cg5) this.P.pop()).T;
                while (obj instanceof cg5) {
                    cg5 cg5Var = (cg5) obj;
                    this.P.push(cg5Var);
                    obj = cg5Var.S;
                }
                dd5Var = (dd5) obj;
                if (dd5Var.o() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } while (z);
            this.Q = dd5Var;
            return dd5Var2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Q != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}