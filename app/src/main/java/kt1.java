package defpackage;

/* renamed from: kt1  reason: default package */
public final class kt1 implements et1 {
    public final Object a;
    public final Object b;

    public /* synthetic */ kt1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ kt1(mt1 mt1Var) {
        this.b = mt1Var;
        this.a = new eh4(new byte[4], 4);
    }

    public /* synthetic */ kt1(uz4 uz4Var) {
        this.a = uz4Var;
        this.b = null;
    }

    public /* synthetic */ kt1(wz4 wz4Var) {
        this.a = null;
        this.b = wz4Var;
    }

    @Override // defpackage.et1
    public final void a(km4 km4Var, nk1 nk1Var, pt1 pt1Var) {
    }

    @Override // defpackage.et1
    public final void c(kh4 kh4Var) {
        if (kh4Var.n() != 0 || (kh4Var.n() & 128) == 0) {
            return;
        }
        kh4Var.f(6);
        int i = (kh4Var.c - kh4Var.b) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            eh4 eh4Var = (eh4) this.a;
            kh4Var.a(eh4Var.a, 0, 4);
            eh4Var.e(0);
            int b = ((eh4) this.a).b(16);
            ((eh4) this.a).g(3);
            if (b == 0) {
                ((eh4) this.a).g(13);
            } else {
                int b2 = ((eh4) this.a).b(13);
                if (((mt1) this.b).e.get(b2) == null) {
                    mt1 mt1Var = (mt1) this.b;
                    mt1Var.e.put(b2, new ft1(new lt1(mt1Var, b2)));
                    ((mt1) this.b).getClass();
                }
            }
        }
        ((mt1) this.b).e.remove(0);
    }
}