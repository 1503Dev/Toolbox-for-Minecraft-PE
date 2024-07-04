package defpackage;

/* renamed from: d53  reason: default package */
public class d53 {
    public volatile fk3 a;
    public volatile y82 b;

    static {
        hk2 hk2Var = hk2.b;
    }

    public final y82 a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? y82.Q : this.a.c();
            return this.b;
        }
    }

    public final void b(fk3 fk3Var) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = fk3Var;
                    this.b = y82.Q;
                } catch (p33 unused) {
                    this.a = fk3Var;
                    this.b = y82.Q;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d53) {
            d53 d53Var = (d53) obj;
            fk3 fk3Var = this.a;
            fk3 fk3Var2 = d53Var.a;
            if (fk3Var == null && fk3Var2 == null) {
                return a().equals(d53Var.a());
            }
            if (fk3Var == null || fk3Var2 == null) {
                if (fk3Var != null) {
                    d53Var.b(fk3Var.e());
                    return fk3Var.equals(d53Var.a);
                }
                b(fk3Var2.e());
                return this.a.equals(fk3Var2);
            }
            return fk3Var.equals(fk3Var2);
        }
        return false;
    }

    public final int hashCode() {
        return 1;
    }
}