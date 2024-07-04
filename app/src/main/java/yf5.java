package defpackage;

import java.util.NoSuchElementException;

/* renamed from: yf5  reason: default package */
public final class yf5 extends cx4 {
    public final bg5 Q;
    public cx4 R;

    public yf5(cg5 cg5Var) {
        super(1);
        this.Q = new bg5(cg5Var);
        this.R = b();
    }

    @Override // defpackage.cx4
    public final byte a() {
        cx4 cx4Var = this.R;
        if (cx4Var != null) {
            byte a = cx4Var.a();
            if (!this.R.hasNext()) {
                this.R = b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    public final bd5 b() {
        bg5 bg5Var = this.Q;
        if (bg5Var.hasNext()) {
            return new bd5(bg5Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.R != null;
    }
}