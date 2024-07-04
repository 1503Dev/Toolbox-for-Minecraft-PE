package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: zx3  reason: default package */
public final class zx3 implements Iterator {
    public int P = -1;
    public boolean Q;
    public Iterator R;
    public final /* synthetic */ s14 S;

    public /* synthetic */ zx3(s14 s14Var) {
        this.S = s14Var;
    }

    public final Iterator a() {
        if (this.R == null) {
            this.R = this.S.R.entrySet().iterator();
        }
        return this.R;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.P + 1 < this.S.Q.size()) {
            return true;
        }
        if (!this.S.R.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Object next;
        this.Q = true;
        int i = this.P + 1;
        this.P = i;
        if (i < this.S.Q.size()) {
            next = this.S.Q.get(this.P);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.Q) {
            this.Q = false;
            s14 s14Var = this.S;
            int i = s14.V;
            s14Var.g();
            if (this.P < this.S.Q.size()) {
                s14 s14Var2 = this.S;
                int i2 = this.P;
                this.P = i2 - 1;
                s14Var2.e(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}