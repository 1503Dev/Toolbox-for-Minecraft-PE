package defpackage;

/* renamed from: p43  reason: default package */
public final class p43 implements vc3 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ p43(w33 w33Var) {
        this.a = w33Var;
    }

    public p43(ya3 ya3Var) {
        this.a = ya3Var;
        lv4 lv4Var = nv4.Q;
        this.b = nw4.T;
        this.c = sw4.V;
    }

    public static ov5 d(o73 o73Var, nv4 nv4Var, ov5 ov5Var, ya3 ya3Var) {
        kd3 k = o73Var.k();
        int b = o73Var.b();
        Object f = k.o() ? null : k.f(b);
        if (!o73Var.F() && !k.o()) {
            ya3 d = k.d(b, ya3Var, false);
            o73Var.l();
            int i = zn4.a;
            d.getClass();
        }
        for (int i2 = 0; i2 < nv4Var.size(); i2++) {
            ov5 ov5Var2 = (ov5) nv4Var.get(i2);
            if (h(ov5Var2, f, o73Var.F(), o73Var.c(), o73Var.d())) {
                return ov5Var2;
            }
        }
        if (nv4Var.isEmpty() && ov5Var != null && h(ov5Var, f, o73Var.F(), o73Var.c(), o73Var.d())) {
            return ov5Var;
        }
        return null;
    }

    public static boolean h(ov5 ov5Var, Object obj, boolean z, int i, int i2) {
        if (ov5Var.a.equals(obj)) {
            int i3 = ov5Var.b;
            if (z) {
                if (i3 != i || ov5Var.c != i2) {
                    return false;
                }
            } else if (i3 != -1 || ov5Var.e != -1) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.vc3
    public final /* synthetic */ vc3 a(bg4 bg4Var) {
        this.c = bg4Var;
        return this;
    }

    @Override // defpackage.vc3
    public final /* synthetic */ vc3 b(zg4 zg4Var) {
        this.b = zg4Var;
        return this;
    }

    @Override // defpackage.vc3
    /* renamed from: c */
    public final s43 f() {
        tv2.E(zg3.class, (zg3) this.d);
        tv2.E(yc3.class, (yc3) this.e);
        tv2.E(y54.class, (y54) this.f);
        return new s43((w33) this.a, new xa2(), new zf(), new zf(), new ea2(), (zg3) this.d, (yc3) this.e, (y54) this.f, (zg4) this.b, (bg4) this.c);
    }

    public final void e(pv4 pv4Var, ov5 ov5Var, kd3 kd3Var) {
        if (ov5Var == null) {
            return;
        }
        if (kd3Var.a(ov5Var.a) != -1) {
            pv4Var.a(ov5Var, kd3Var);
            return;
        }
        kd3 kd3Var2 = (kd3) ((qv4) this.c).get(ov5Var);
        if (kd3Var2 != null) {
            pv4Var.a(ov5Var, kd3Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (defpackage.dt4.l((defpackage.ov5) r3.d, (defpackage.ov5) r3.f) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (((defpackage.nv4) r3.b).contains((defpackage.ov5) r3.d) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        e(r0, (defpackage.ov5) r3.d, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(kd3 kd3Var) {
        pv4 pv4Var = new pv4(4);
        if (((nv4) this.b).isEmpty()) {
            e(pv4Var, (ov5) this.e, kd3Var);
            if (!dt4.l((ov5) this.f, (ov5) this.e)) {
                e(pv4Var, (ov5) this.f, kd3Var);
            }
            if (!dt4.l((ov5) this.d, (ov5) this.e)) {
            }
        } else {
            for (int i = 0; i < ((nv4) this.b).size(); i++) {
                e(pv4Var, (ov5) ((nv4) this.b).get(i), kd3Var);
            }
        }
        this.c = pv4Var.b();
    }
}