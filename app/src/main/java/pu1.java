package defpackage;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: pu1  reason: default package */
public final class pu1 extends Thread {
    public static final boolean V = rv1.a;
    public final BlockingQueue P;
    public final BlockingQueue Q;
    public final ou1 R;
    public volatile boolean S = false;
    public final sv1 T;
    public final d60 U;

    public pu1(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, ou1 ou1Var, d60 d60Var) {
        this.P = priorityBlockingQueue;
        this.Q = priorityBlockingQueue2;
        this.R = ou1Var;
        this.U = d60Var;
        this.T = new sv1(this, priorityBlockingQueue2, d60Var);
    }

    public final void b() {
        boolean z;
        gv1 gv1Var = (gv1) this.P.take();
        gv1Var.g("cache-queue-take");
        gv1Var.k(1);
        try {
            synchronized (gv1Var.T) {
            }
            nu1 a = ((aw1) this.R).a(gv1Var.e());
            if (a == null) {
                gv1Var.g("cache-miss");
                if (!this.T.b(gv1Var)) {
                    this.Q.put(gv1Var);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean z2 = false;
            if (a.e < currentTimeMillis) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                gv1Var.g("cache-hit-expired");
                gv1Var.Y = a;
                if (!this.T.b(gv1Var)) {
                    this.Q.put(gv1Var);
                }
                return;
            }
            gv1Var.g("cache-hit");
            byte[] bArr = a.a;
            Map map = a.g;
            lv1 b = gv1Var.b(new yu1(200, bArr, map, yu1.a(map), false));
            gv1Var.g("cache-hit-parsed");
            if (b.c == null) {
                z2 = true;
            }
            if (!z2) {
                gv1Var.g("cache-parsing-failed");
                ou1 ou1Var = this.R;
                String e = gv1Var.e();
                aw1 aw1Var = (aw1) ou1Var;
                synchronized (aw1Var) {
                    nu1 a2 = aw1Var.a(e);
                    if (a2 != null) {
                        a2.f = 0L;
                        a2.e = 0L;
                        aw1Var.c(e, a2);
                    }
                }
                gv1Var.Y = null;
                if (!this.T.b(gv1Var)) {
                    this.Q.put(gv1Var);
                }
                return;
            }
            if (a.f < currentTimeMillis) {
                gv1Var.g("cache-hit-refresh-needed");
                gv1Var.Y = a;
                b.d = true;
                if (!this.T.b(gv1Var)) {
                    this.U.c(gv1Var, b, new qh1(1, this, gv1Var));
                }
            }
            this.U.c(gv1Var, b, null);
        } finally {
            gv1Var.k(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (V) {
            rv1.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        ((aw1) this.R).b();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.S) {
                    Thread.currentThread().interrupt();
                    return;
                }
                rv1.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}