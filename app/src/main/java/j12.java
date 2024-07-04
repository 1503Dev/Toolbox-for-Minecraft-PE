package defpackage;

/* renamed from: j12  reason: default package */
public final class j12 extends c22 {
    public static volatile Long h;
    public static final Object i = new Object();

    public j12(l02 l02Var, gx1 gx1Var, int i2) {
        super(l02Var, "CNH0HFMOMU1Nrmid580u5GwyoVtbweFPAsHIvna6oGuy7GvzbjYQOB8wix+zhJ0t", "afOCxwiNZt1pFw/pjRCeFiRYbGwWcjibO33q64LhR0M=", gx1Var, i2, 22);
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
            ey1.J0((ey1) gx1Var.Q, longValue);
        }
    }
}