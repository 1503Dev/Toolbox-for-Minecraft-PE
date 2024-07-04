package defpackage;

/* renamed from: fn3  reason: default package */
public final class fn3 implements lr3 {
    public final fk3 a;
    public final z44 b;
    public final boolean c;
    public final gl2 d;

    public fn3(z44 z44Var, gl2 gl2Var, fk3 fk3Var) {
        this.b = z44Var;
        this.c = gl2Var.c(fk3Var);
        this.d = gl2Var;
        this.a = fk3Var;
    }

    @Override // defpackage.lr3
    public final void a(Object obj) {
        this.b.g(obj);
        this.d.b(obj);
    }

    @Override // defpackage.lr3
    public final ox2 b() {
        fk3 fk3Var = this.a;
        if (fk3Var instanceof ox2) {
            return (ox2) ((ox2) fk3Var).m(4);
        }
        return fk3Var.j().b();
    }

    @Override // defpackage.lr3
    public final void c(Object obj, Object obj2) {
        z44 z44Var = this.b;
        Class cls = ss3.a;
        z44Var.h(obj, z44Var.e(z44Var.d(obj), z44Var.d(obj2)));
        if (!this.c) {
            return;
        }
        this.d.a(obj2);
        throw null;
    }

    @Override // defpackage.lr3
    public final boolean d(Object obj, Object obj2) {
        if (this.b.d(obj).equals(this.b.d(obj2))) {
            if (this.c) {
                this.d.a(obj);
                this.d.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lr3
    public final int e(Object obj) {
        z44 z44Var = this.b;
        int b = z44Var.b(z44Var.d(obj));
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return b;
    }

    @Override // defpackage.lr3
    public final int f(Object obj) {
        int hashCode = this.b.d(obj).hashCode();
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // defpackage.lr3
    public final boolean g(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.lr3
    public final void h(Object obj, eh2 eh2Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.lr3
    public final void i(Object obj, byte[] bArr, int i, int i2, bx1 bx1Var) {
        ox2 ox2Var = (ox2) obj;
        if (ox2Var.zzc == u54.f) {
            ox2Var.zzc = u54.b();
        }
        zt2 zt2Var = (zt2) obj;
        throw null;
    }
}