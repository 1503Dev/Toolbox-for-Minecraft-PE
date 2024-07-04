package defpackage;

/* renamed from: zu5  reason: default package */
public final class zu5 extends vu5 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public zu5(kd3 kd3Var, Object obj, Object obj2) {
        super(kd3Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.vu5, defpackage.kd3
    public final int a(Object obj) {
        Object obj2;
        kd3 kd3Var = this.b;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return kd3Var.a(obj);
    }

    @Override // defpackage.kd3
    public final ya3 d(int i, ya3 ya3Var, boolean z) {
        this.b.d(i, ya3Var, z);
        if (zn4.b(ya3Var.b, this.d) && z) {
            ya3Var.b = e;
        }
        return ya3Var;
    }

    @Override // defpackage.kd3
    public final lc3 e(int i, lc3 lc3Var, long j) {
        this.b.e(i, lc3Var, j);
        if (zn4.b(lc3Var.a, this.c)) {
            lc3Var.a = lc3.n;
        }
        return lc3Var;
    }

    @Override // defpackage.vu5, defpackage.kd3
    public final Object f(int i) {
        Object f = this.b.f(i);
        return zn4.b(f, this.d) ? e : f;
    }
}