package defpackage;

/* renamed from: d12  reason: default package */
public final class d12 extends c22 {
    public static volatile Long h;
    public static final Object i = new Object();

    public d12(l02 l02Var, gx1 gx1Var, int i2) {
        super(l02Var, "kqx1em1yk7MpX3m25KaHLmM/cmSaigSw7EiXU2reD6DVU/yG3Bj+ID2Om7QFkYwd", "7E6XPHHgJYFzxm7py5uavXz1wvEMAaDOWzYZ4RGmH8Q=", gx1Var, i2, 44);
    }

    @Override // defpackage.c22
    public final void b() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.d) {
            gx1 gx1Var = this.d;
            long longValue = h.longValue();
            gx1Var.j();
            ey1.G((ey1) gx1Var.Q, longValue);
        }
    }
}