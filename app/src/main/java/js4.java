package defpackage;

/* renamed from: js4  reason: default package */
public final class js4 extends hs4 {
    public final /* synthetic */ aw0 Q;
    public final /* synthetic */ hs4 R;
    public final /* synthetic */ ps4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js4(ps4 ps4Var, aw0 aw0Var, aw0 aw0Var2, hs4 hs4Var) {
        super(aw0Var);
        this.S = ps4Var;
        this.Q = aw0Var2;
        this.R = hs4Var;
    }

    @Override // defpackage.hs4
    public final void b() {
        synchronized (this.S.f) {
            ps4 ps4Var = this.S;
            aw0 aw0Var = this.Q;
            ps4Var.e.add(aw0Var);
            aw0Var.a.b(new jk3(ps4Var, aw0Var));
            if (this.S.k.getAndIncrement() > 0) {
                this.S.b.c("Already connected to the service.", new Object[0]);
            }
            ps4.b(this.S, this.R);
        }
    }
}