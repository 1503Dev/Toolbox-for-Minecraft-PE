package defpackage;

/* renamed from: wk3  reason: default package */
public final class wk3 extends gu3 {
    public final /* synthetic */ String T = "Error with data collection. Data lost.";
    public final /* synthetic */ Object U;
    public final /* synthetic */ h34 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk3(h34 h34Var, Object obj) {
        super(h34Var, false);
        this.V = h34Var;
        this.U = obj;
    }

    @Override // defpackage.gu3
    public final void b() {
        ky2 ky2Var = this.V.h;
        uf0.f(ky2Var);
        ky2Var.e3(this.T, new va0(this.U), new va0(null), new va0(null));
    }
}