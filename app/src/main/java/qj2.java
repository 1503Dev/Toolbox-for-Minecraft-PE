package defpackage;

/* renamed from: qj2  reason: default package */
public final class qj2 extends fx2 {
    public final Object R = new Object();
    public boolean S = false;
    public int T = 0;

    public final jj2 g() {
        jj2 jj2Var = new jj2(this);
        synchronized (this.R) {
            d(new nj2(jj2Var), new fb3(jj2Var));
            uf0.i(this.T >= 0);
            this.T++;
        }
        return jj2Var;
    }

    public final void i() {
        synchronized (this.R) {
            uf0.i(this.T >= 0);
            vz3.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.S = true;
            j();
        }
    }

    public final void j() {
        synchronized (this.R) {
            uf0.i(this.T >= 0);
            if (this.S && this.T == 0) {
                vz3.k("No reference is left (including root). Cleaning up engine.");
                d(new pj2(), new p5());
            } else {
                vz3.k("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final void k() {
        synchronized (this.R) {
            uf0.i(this.T > 0);
            vz3.k("Releasing 1 reference for JS Engine");
            this.T--;
            j();
        }
    }
}