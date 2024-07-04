package defpackage;

/* renamed from: we5  reason: default package */
public class we5 {
    public volatile nf5 a;
    public volatile gd5 b;

    static {
        ud5 ud5Var = ud5.b;
    }

    public final gd5 a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? gd5.Q : this.a.c();
            return this.b;
        }
    }

    public final void b(nf5 nf5Var) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = nf5Var;
                    this.b = gd5.Q;
                } catch (te5 unused) {
                    this.a = nf5Var;
                    this.b = gd5.Q;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof we5) {
            we5 we5Var = (we5) obj;
            nf5 nf5Var = this.a;
            nf5 nf5Var2 = we5Var.a;
            if (nf5Var == null && nf5Var2 == null) {
                return a().equals(we5Var.a());
            }
            if (nf5Var == null || nf5Var2 == null) {
                if (nf5Var != null) {
                    we5Var.b(nf5Var.b());
                    return nf5Var.equals(we5Var.a);
                }
                b(nf5Var2.b());
                return this.a.equals(nf5Var2);
            }
            return nf5Var.equals(nf5Var2);
        }
        return false;
    }

    public final int hashCode() {
        return 1;
    }
}