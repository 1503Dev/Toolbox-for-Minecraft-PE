package defpackage;

/* renamed from: ej4  reason: default package */
public final class ej4 implements wy4 {
    public final /* synthetic */ y03 P;
    public final /* synthetic */ gn4 Q;
    public final /* synthetic */ r04 R;

    public ej4(y03 y03Var, gn4 gn4Var, r04 r04Var) {
        this.P = y03Var;
        this.Q = gn4Var;
        this.R = r04Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r7.P.z().S != false) goto L14;
     */
    @Override // defpackage.wy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj) {
        String str = (String) obj;
        if (!this.P.z().i0) {
            this.Q.a(str, null);
            return;
        }
        jv5 jv5Var = jv5.A;
        jv5Var.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.P.C().b;
        int i = 1;
        if (!jv5Var.g.g(this.P.getContext())) {
            if (((Boolean) w82.d.c.a(x92.k5)).booleanValue()) {
            }
            this.R.a(new s04(currentTimeMillis, str2, str, i));
        }
        i = 2;
        this.R.a(new s04(currentTimeMillis, str2, str, i));
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }
}