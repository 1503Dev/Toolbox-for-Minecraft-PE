package defpackage;

/* renamed from: iy2  reason: default package */
public final class iy2 implements Runnable {
    public final vx2 P;
    public boolean Q = false;

    public iy2(vx2 vx2Var) {
        this.P = vx2Var;
    }

    public final void b() {
        this.Q = true;
        this.P.j();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.Q) {
            return;
        }
        this.P.j();
        wi4 wi4Var = cu5.i;
        wi4Var.removeCallbacks(this);
        wi4Var.postDelayed(this, 250L);
    }
}