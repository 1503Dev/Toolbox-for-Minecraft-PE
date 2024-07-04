package defpackage;

/* renamed from: rz2  reason: default package */
public final class rz2 extends oz2 {
    public rz2(gy2 gy2Var) {
        super(gy2Var);
    }

    @Override // defpackage.oz2
    public final void l() {
    }

    @Override // defpackage.oz2
    public final boolean t(String str) {
        String m = mv2.m(str, "MD5");
        gy2 gy2Var = (gy2) this.R.get();
        if (gy2Var != null && m != null) {
            gy2Var.v(m, this);
        }
        sv2.g("VideoStreamNoopCache is doing nothing.");
        m(str, m, "noop", "Noop cache is a noop.");
        return false;
    }
}