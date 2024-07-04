package defpackage;

/* renamed from: h12  reason: default package */
public final class h12 extends c22 {
    public final m02 h;

    public h12(l02 l02Var, gx1 gx1Var, int i, m02 m02Var) {
        super(l02Var, "fyLPA28mp7uPyBOReRADDijv3FZ1tUGnt5ZGr7JsU06e7RVIoG/wHKNRMf3WJSQe", "soiTax1jBnD3649O45Tb84AswyowGJo3bnB66jWq5Kw=", gx1Var, i, 85);
        this.h = m02Var;
    }

    @Override // defpackage.c22
    public final void b() {
        long[] jArr = (long[]) this.e.invoke(null, Long.valueOf(this.h.c), Long.valueOf(this.h.d), Long.valueOf(this.h.e), Long.valueOf(this.h.f));
        synchronized (this.d) {
            gx1 gx1Var = this.d;
            long j = jArr[0];
            gx1Var.j();
            ey1.a0((ey1) gx1Var.Q, j);
            gx1 gx1Var2 = this.d;
            long j2 = jArr[1];
            gx1Var2.j();
            ey1.b0((ey1) gx1Var2.Q, j2);
        }
    }
}