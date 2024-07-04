package defpackage;

/* renamed from: m12  reason: default package */
public final class m12 extends c22 {
    public final vz1 h;
    public final long i;
    public final long j;

    public m12(l02 l02Var, gx1 gx1Var, int i, vz1 vz1Var, long j, long j2) {
        super(l02Var, "2wtcCTLoT7a0RzNv8L+mVKR+6NVfukO9BpKgsaOGTiHGeYqcI7vlZYOTUtiUYK5a", "PuuRKBgJ4ot1aOnWjIUdGlqyRoZ6ZOMOeX7ZmvGezGg=", gx1Var, i, 11);
        this.h = vz1Var;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.c22
    public final void b() {
        vz1 vz1Var = this.h;
        if (vz1Var != null) {
            tz1 tz1Var = new tz1((String) this.e.invoke(null, vz1Var.a, Long.valueOf(this.i), Long.valueOf(this.j)));
            synchronized (this.d) {
                try {
                    gx1 gx1Var = this.d;
                    long longValue = tz1Var.a.longValue();
                    gx1Var.j();
                    ey1.C0((ey1) gx1Var.Q, longValue);
                    if (tz1Var.b.longValue() >= 0) {
                        gx1 gx1Var2 = this.d;
                        long longValue2 = tz1Var.b.longValue();
                        gx1Var2.j();
                        ey1.Y((ey1) gx1Var2.Q, longValue2);
                    }
                    if (tz1Var.c.longValue() >= 0) {
                        gx1 gx1Var3 = this.d;
                        long longValue3 = tz1Var.c.longValue();
                        gx1Var3.j();
                        ey1.Z((ey1) gx1Var3.Q, longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}