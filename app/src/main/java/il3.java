package defpackage;

/* renamed from: il3  reason: default package */
public final class il3 implements s22 {
    public final /* synthetic */ String P;
    public final /* synthetic */ jl3 Q;

    public il3(jl3 jl3Var, String str) {
        this.Q = jl3Var;
        this.P = str;
    }

    @Override // defpackage.s22
    public final void h0(r22 r22Var) {
        if (((Boolean) w82.d.c.a(x92.r1)).booleanValue()) {
            synchronized (this) {
                if (r22Var.j) {
                    jl3 jl3Var = this.Q;
                    if (jl3Var.t != null) {
                        jl3Var.D.put(this.P, Boolean.TRUE);
                        jl3 jl3Var2 = this.Q;
                        jl3Var2.b(jl3Var2.t.e(), this.Q.t.n(), this.Q.t.o(), true);
                    }
                }
            }
        } else if (r22Var.j) {
            this.Q.D.put(this.P, Boolean.TRUE);
            jl3 jl3Var3 = this.Q;
            jl3Var3.b(jl3Var3.t.e(), this.Q.t.n(), this.Q.t.o(), true);
        }
    }
}