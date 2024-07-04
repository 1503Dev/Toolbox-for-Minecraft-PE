package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: wu1  reason: default package */
public final class wu1 extends Thread {
    public final BlockingQueue P;
    public final vu1 Q;
    public final ou1 R;
    public volatile boolean S = false;
    public final d60 T;

    public wu1(PriorityBlockingQueue priorityBlockingQueue, vu1 vu1Var, ou1 ou1Var, d60 d60Var) {
        this.P = priorityBlockingQueue;
        this.Q = vu1Var;
        this.R = ou1Var;
        this.T = d60Var;
    }

    public final void b() {
        sv1 sv1Var;
        gv1 gv1Var = (gv1) this.P.take();
        SystemClock.elapsedRealtime();
        gv1Var.k(3);
        try {
            try {
                gv1Var.g("network-queue-take");
                synchronized (gv1Var.T) {
                }
                TrafficStats.setThreadStatsTag(gv1Var.S);
                yu1 a = this.Q.a(gv1Var);
                gv1Var.g("network-http-complete");
                if (a.e && gv1Var.l()) {
                    gv1Var.i("not-modified");
                    synchronized (gv1Var.T) {
                        sv1Var = gv1Var.Z;
                    }
                    if (sv1Var != null) {
                        sv1Var.a(gv1Var);
                    }
                    gv1Var.k(4);
                    return;
                }
                lv1 b = gv1Var.b(a);
                gv1Var.g("network-parse-complete");
                if (b.b != null) {
                    ((aw1) this.R).c(gv1Var.e(), b.b);
                    gv1Var.g("network-cache-written");
                }
                synchronized (gv1Var.T) {
                    gv1Var.X = true;
                }
                this.T.c(gv1Var, b, null);
                gv1Var.j(b);
                gv1Var.k(4);
            } catch (ov1 e) {
                SystemClock.elapsedRealtime();
                this.T.b(gv1Var, e);
                synchronized (gv1Var.T) {
                    sv1 sv1Var2 = gv1Var.Z;
                    if (sv1Var2 != null) {
                        sv1Var2.a(gv1Var);
                    }
                    gv1Var.k(4);
                }
            } catch (Exception e2) {
                Log.e("Volley", rv1.d("Unhandled exception %s", e2.toString()), e2);
                ov1 ov1Var = new ov1(e2);
                SystemClock.elapsedRealtime();
                this.T.b(gv1Var, ov1Var);
                synchronized (gv1Var.T) {
                    sv1 sv1Var3 = gv1Var.Z;
                    if (sv1Var3 != null) {
                        sv1Var3.a(gv1Var);
                    }
                    gv1Var.k(4);
                }
            }
        } catch (Throwable th) {
            gv1Var.k(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.S) {
                    Thread.currentThread().interrupt();
                    return;
                }
                rv1.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}