package defpackage;

/* renamed from: bt2  reason: default package */
public final class bt2 {
    public final kd a;
    public final f25 b;
    public final qt2 c;

    public bt2(kd kdVar, f25 f25Var, qt2 qt2Var) {
        this.a = kdVar;
        this.b = f25Var;
        this.c = qt2Var;
    }

    public final void a(long j, int i) {
        l92 l92Var = x92.j0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return;
        }
        if (j - this.b.e() < 0) {
            vz3.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        l92 l92Var2 = x92.k0;
        if (!((Boolean) w82Var.c.a(l92Var2)).booleanValue()) {
            this.b.g(-1);
        } else {
            this.b.g(i);
        }
        this.b.n(j);
        if (((Boolean) w82Var.c.a(l92Var2)).booleanValue()) {
            synchronized (this.c.l) {
            }
        }
    }
}