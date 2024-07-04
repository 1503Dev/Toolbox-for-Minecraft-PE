package defpackage;

/* renamed from: jj2  reason: default package */
public final class jj2 extends fx2 {
    public final Object R = new Object();
    public final qj2 S;
    public boolean T;

    public jj2(qj2 qj2Var) {
        this.S = qj2Var;
    }

    public final void g() {
        synchronized (this.R) {
            if (this.T) {
                return;
            }
            this.T = true;
            d(new eg4(0), new p5());
            d(new ij2(0, this), new bo5(2, this));
        }
    }
}