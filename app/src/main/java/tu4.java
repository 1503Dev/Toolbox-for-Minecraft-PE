package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: tu4  reason: default package */
public abstract class tu4 implements Iterator {
    public int P;
    public int Q;
    public int R;
    public final /* synthetic */ xu4 S;

    public tu4(xu4 xu4Var) {
        int i;
        this.S = xu4Var;
        this.P = xu4Var.T;
        if (xu4Var.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.Q = i;
        this.R = -1;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Q >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.S.T == this.P) {
            if (hasNext()) {
                int i = this.Q;
                this.R = i;
                Object a = a(i);
                xu4 xu4Var = this.S;
                int i2 = this.Q + 1;
                if (i2 >= xu4Var.U) {
                    i2 = -1;
                }
                this.Q = i2;
                return a;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.S.T == this.P) {
            if (this.R >= 0) {
                z = true;
            } else {
                z = false;
            }
            gt4.g("no calls to next() since the last call to remove()", z);
            this.P += 32;
            xu4 xu4Var = this.S;
            int i = this.R;
            Object[] objArr = xu4Var.R;
            objArr.getClass();
            xu4Var.remove(objArr[i]);
            this.Q--;
            this.R = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}