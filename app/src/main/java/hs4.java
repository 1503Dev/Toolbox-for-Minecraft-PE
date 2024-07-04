package defpackage;

/* renamed from: hs4  reason: default package */
public abstract class hs4 implements Runnable {
    public final aw0 P;

    public hs4() {
        this.P = null;
    }

    public hs4(aw0 aw0Var) {
        this.P = aw0Var;
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            aw0 aw0Var = this.P;
            if (aw0Var != null) {
                aw0Var.a(e);
            }
        }
    }
}