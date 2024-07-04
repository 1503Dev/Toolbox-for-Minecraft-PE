package defpackage;

/* renamed from: uv5  reason: default package */
public final class uv5 implements qy5 {
    public final qy5 a;
    public final qe3 b;

    public uv5(qy5 qy5Var, qe3 qe3Var) {
        this.a = qy5Var;
        this.b = qe3Var;
    }

    @Override // defpackage.uy5
    public final int B(int i) {
        return this.a.B(i);
    }

    @Override // defpackage.uy5
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.uy5
    public final qe3 b() {
        return this.b;
    }

    @Override // defpackage.uy5
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.uy5
    public final cu1 e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uv5) {
            uv5 uv5Var = (uv5) obj;
            return this.a.equals(uv5Var.a) && this.b.equals(uv5Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }
}