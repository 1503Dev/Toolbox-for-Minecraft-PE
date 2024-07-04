package defpackage;

import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: ly0  reason: default package */
public final /* synthetic */ class ly0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ ly0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        switch (this.P) {
            case 0:
                ((iy0) ((ny0) this.Q).c).M0();
                return;
            case 1:
                ((xc0) this.Q).g();
                return;
            default:
                ak0 ak0Var = (ak0) this.Q;
                ThreadPoolExecutor threadPoolExecutor = ak0.g;
                ak0Var.getClass();
                while (true) {
                    long nanoTime = System.nanoTime();
                    synchronized (ak0Var) {
                        Iterator it = ak0Var.d.iterator();
                        zj0 zj0Var = null;
                        long j2 = Long.MIN_VALUE;
                        int i = 0;
                        int i2 = 0;
                        while (it.hasNext()) {
                            zj0 zj0Var2 = (zj0) it.next();
                            if (ak0Var.b(zj0Var2, nanoTime) > 0) {
                                i2++;
                            } else {
                                i++;
                                long j3 = nanoTime - zj0Var2.q;
                                if (j3 > j2) {
                                    zj0Var = zj0Var2;
                                    j2 = j3;
                                }
                            }
                        }
                        j = ak0Var.b;
                        if (j2 < j && i <= ak0Var.a) {
                            if (i > 0) {
                                j -= j2;
                            } else if (i2 <= 0) {
                                ak0Var.f = false;
                                j = -1;
                            }
                        }
                        ak0Var.d.remove(zj0Var);
                        c31.d(zj0Var.e);
                        j = 0;
                    }
                    if (j == -1) {
                        return;
                    }
                    if (j > 0) {
                        long j4 = j / 1000000;
                        long j5 = j - (1000000 * j4);
                        synchronized (ak0Var) {
                            try {
                                ak0Var.wait(j4, (int) j5);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
                break;
        }
    }
}