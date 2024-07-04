package defpackage;

/* renamed from: wm5  reason: default package */
public final /* synthetic */ class wm5 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    public /* synthetic */ wm5(int i, Object obj, Object obj2, Object obj3) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
        this.S = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ov5 ov5Var = (ov5) this.S;
                ho5 ho5Var = ((xm5) this.Q).c;
                nw4 s = ((kv4) this.R).s();
                pp5 pp5Var = (pp5) ho5Var;
                p43 p43Var = pp5Var.S;
                o73 o73Var = pp5Var.V;
                o73Var.getClass();
                p43Var.getClass();
                p43Var.b = nv4.t(s);
                if (!s.isEmpty()) {
                    p43Var.e = (ov5) s.get(0);
                    ov5Var.getClass();
                    p43Var.f = ov5Var;
                }
                if (((ov5) p43Var.d) == null) {
                    p43Var.d = p43.d(o73Var, (nv4) p43Var.b, (ov5) p43Var.e, (ya3) p43Var.a);
                }
                p43Var.g(o73Var.k());
                return;
            default:
                ((tv5) this.R).k(0, ((sv5) this.Q).a, (lv5) this.S);
                return;
        }
    }
}