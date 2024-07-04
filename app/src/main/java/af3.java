package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: af3  reason: default package */
public final class af3 implements Runnable {
    public final WeakReference P;

    public /* synthetic */ af3(bf3 bf3Var) {
        this.P = new WeakReference(bf3Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf3 bf3Var = (bf3) this.P.get();
        if (bf3Var != null) {
            bf3Var.R0(u92.R);
        }
    }
}