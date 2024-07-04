package defpackage;

/* renamed from: ja0  reason: default package */
public final /* synthetic */ class ja0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ ja0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((ka0) this.Q).b();
                return;
            default:
                w20 w20Var = (w20) this.Q;
                w20Var.getClass();
                try {
                    w20Var.c.waitFor();
                    Thread.sleep(1000L);
                    h21.a(new mc0(2, w20Var));
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}