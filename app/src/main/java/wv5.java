package defpackage;

/* renamed from: wv5  reason: default package */
public final class wv5 implements ww5 {
    public final ww5 a;
    public final long b;

    public wv5(ww5 ww5Var, long j) {
        this.a = ww5Var;
        this.b = j;
    }

    @Override // defpackage.ww5
    public final int a(vi1 vi1Var, gk5 gk5Var, int i) {
        int a = this.a.a(vi1Var, gk5Var, i);
        if (a == -4) {
            gk5Var.e = Math.max(0L, gk5Var.e + this.b);
            return -4;
        }
        return a;
    }

    @Override // defpackage.ww5
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.ww5
    public final int c(long j) {
        return this.a.c(j - this.b);
    }

    @Override // defpackage.ww5
    public final void i() {
        this.a.i();
    }
}