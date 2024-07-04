package defpackage;

/* renamed from: nj2  reason: default package */
public final class nj2 implements ex2, lv2, wg3, kg4 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ nj2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.ex2
    public final void e(Object obj) {
        switch (this.P) {
            case 0:
                vz3.k("Getting a new session for JS Engine.");
                ((bx2) ((jj2) this.Q).P).a(((ui2) obj).j());
                return;
            case 1:
            default:
                ((yk3) obj).v1((au5) this.Q);
                return;
            case 2:
                ((yd3) obj).g0(oj4.d(12, ((vj3) this.Q).getMessage(), null));
                return;
        }
    }

    @Override // defpackage.lv2
    public final boolean m(String str) {
        new kv2(str).start();
        return true;
    }

    public nj2(jj2 jj2Var) {
        this.P = 0;
        this.Q = jj2Var;
    }

    public /* synthetic */ nj2(of3 of3Var) {
        this.P = 3;
        this.Q = of3Var;
    }
}