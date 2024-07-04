package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: n82  reason: default package */
public final class n82 extends Thread {
    public final WeakReference<o3> P;
    public final long Q;
    public final CountDownLatch R = new CountDownLatch(1);
    public boolean S = false;

    public n82(o3 o3Var, long j) {
        this.P = new WeakReference<>(o3Var);
        this.Q = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        o3 o3Var;
        try {
            if (this.R.await(this.Q, TimeUnit.MILLISECONDS) || (o3Var = this.P.get()) == null) {
                return;
            }
            o3Var.c();
            this.S = true;
        } catch (InterruptedException unused) {
            o3 o3Var2 = this.P.get();
            if (o3Var2 != null) {
                o3Var2.c();
                this.S = true;
            }
        }
    }
}