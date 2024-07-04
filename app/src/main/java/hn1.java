package defpackage;

/* renamed from: hn1  reason: default package */
public final class hn1 implements nk1 {
    public final long P;
    public final nk1 Q;

    public hn1(long j, nk1 nk1Var) {
        this.P = j;
        this.Q = nk1Var;
    }

    @Override // defpackage.nk1
    public final void j() {
        this.Q.j();
    }

    @Override // defpackage.nk1
    public final void n(ml1 ml1Var) {
        this.Q.n(new gn1(this, ml1Var));
    }

    @Override // defpackage.nk1
    public final pl1 q(int i, int i2) {
        return this.Q.q(i, i2);
    }
}