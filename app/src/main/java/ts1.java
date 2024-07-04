package defpackage;

/* renamed from: ts1  reason: default package */
public final class ts1 implements et1 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ ts1(hi4 hi4Var, yh4 yh4Var, String str) {
        this.a = hi4Var;
        this.b = yh4Var;
        this.c = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public ts1(String str) {
        bs1 bs1Var = new bs1();
        bs1Var.j = str;
        this.a = new cu1(bs1Var);
    }

    @Override // defpackage.et1
    public final void a(km4 km4Var, nk1 nk1Var, pt1 pt1Var) {
        this.b = km4Var;
        pt1Var.a();
        pt1Var.b();
        pl1 q = nk1Var.q(pt1Var.d, 5);
        this.c = q;
        q.e((cu1) this.a);
    }

    public final ci4 b() {
        return (ci4) ((hi4) this.a).b.Q;
    }

    @Override // defpackage.et1
    public final void c(kh4 kh4Var) {
        long c;
        long j;
        long j2;
        tv2.B((km4) this.b);
        int i = zn4.a;
        km4 km4Var = (km4) this.b;
        synchronized (km4Var) {
            long j3 = km4Var.c;
            if (j3 != -9223372036854775807L) {
                c = j3 + km4Var.b;
            } else {
                c = km4Var.c();
            }
            j = c;
        }
        km4 km4Var2 = (km4) this.b;
        synchronized (km4Var2) {
            j2 = km4Var2.b;
        }
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            cu1 cu1Var = (cu1) this.a;
            if (j2 != cu1Var.o) {
                bs1 bs1Var = new bs1(cu1Var);
                bs1Var.n = j2;
                cu1 cu1Var2 = new cu1(bs1Var);
                this.a = cu1Var2;
                ((pl1) this.c).e(cu1Var2);
            }
            int i2 = kh4Var.c - kh4Var.b;
            ((pl1) this.c).a(i2, kh4Var);
            ((pl1) this.c).b(j, 1, i2, 0, null);
        }
    }
}