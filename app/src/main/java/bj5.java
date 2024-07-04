package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bj5  reason: default package */
public class bj5 implements Iterator, Closeable, qw1 {
    public static final zi5 V = new zi5();
    public nw1 P;
    public yy2 Q;
    public pw1 R = null;
    public long S = 0;
    public long T = 0;
    public final ArrayList U = new ArrayList();

    static {
        fy4.k(bj5.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        pw1 pw1Var = this.R;
        if (pw1Var == V) {
            return false;
        }
        if (pw1Var != null) {
            return true;
        }
        try {
            this.R = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.R = V;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: t */
    public final pw1 next() {
        pw1 b;
        pw1 pw1Var = this.R;
        if (pw1Var != null && pw1Var != V) {
            this.R = null;
            return pw1Var;
        }
        yy2 yy2Var = this.Q;
        if (yy2Var != null && this.S < this.T) {
            try {
                synchronized (yy2Var) {
                    this.Q.P.position((int) this.S);
                    b = ((mw1) this.P).b(this.Q, this);
                    this.S = this.Q.d();
                }
                return b;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.R = V;
        throw new NoSuchElementException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.U.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((pw1) this.U.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}