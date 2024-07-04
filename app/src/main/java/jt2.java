package defpackage;

/* renamed from: jt2  reason: default package */
public final /* synthetic */ class jt2 implements pt2, wy4 {
    public final /* synthetic */ String P;

    public jt2(String str, int i) {
        if (i != 1) {
            this.P = str;
        } else {
            this.P = "ActiveViewListener.callActiveViewJs";
        }
    }

    @Override // defpackage.pt2
    public final void c(m23 m23Var) {
        m23Var.I(this.P);
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        jv5.A.g.e(this.P, th);
    }
}