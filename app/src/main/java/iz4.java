package defpackage;

/* renamed from: iz4  reason: default package */
public final class iz4 extends sx4 implements Runnable {
    public final Runnable W;

    public iz4(Runnable runnable) {
        runnable.getClass();
        this.W = runnable;
    }

    @Override // defpackage.vx4
    public final String f() {
        return ij.c("task=[", this.W.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.W.run();
        } catch (Error | RuntimeException e) {
            i(e);
            throw e;
        }
    }
}