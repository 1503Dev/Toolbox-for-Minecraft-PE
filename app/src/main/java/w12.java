package defpackage;

/* renamed from: w12  reason: default package */
public final class w12 extends c22 {
    public static volatile Long h;
    public static final Object i = new Object();

    public w12(l02 l02Var, gx1 gx1Var, int i2) {
        super(l02Var, "HiRHV0+7iHel8ouy3rC3Vh6JmfAaV6+B5y9bcOz6v6RtgCUkDJJ1u0Sc7x4KnqIM", "XIDT/tdnEZKwO9t3IF1TXzt4lSi3aThE4MpcZzXzgu8=", gx1Var, i2, 33);
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
            ey1.w((ey1) gx1Var.Q, longValue);
        }
    }
}