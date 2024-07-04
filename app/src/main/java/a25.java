package defpackage;

/* renamed from: a25  reason: default package */
public final class a25 implements Runnable {
    public final /* synthetic */ ck5 P;

    public a25(ck5 ck5Var) {
        this.P = ck5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.P.Q) {
            ri4 ri4Var = this.P.R;
            if (ri4Var != null) {
                ay5<TContinuationResult> ay5Var = ri4Var.R;
                synchronized (ay5Var.a) {
                    if (!ay5Var.c) {
                        ay5Var.c = true;
                        ay5Var.d = true;
                        ay5Var.b.b(ay5Var);
                    }
                }
            }
        }
    }
}