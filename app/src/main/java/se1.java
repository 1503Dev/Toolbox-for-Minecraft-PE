package defpackage;

import defpackage.ke1;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: se1  reason: default package */
public final class se1 implements ke1.a {
    public LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue<>();
    public int b = 4;
    public int c = 16;
    public double d = 1.0d;
    public ThreadPoolExecutor e = new ThreadPoolExecutor(this.b, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, this.a);

    @Override // defpackage.ke1.a
    public final void a(ke1 ke1Var, rc1 rc1Var, Map<String, List<String>> map) {
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "url", ke1Var.a0);
        eb1.m(ic1Var, "success", ke1Var.c0);
        eb1.l(ke1Var.e0, ic1Var, "status");
        eb1.j(ic1Var, "body", ke1Var.b0);
        eb1.l(ke1Var.d0, ic1Var, "size");
        if (map != null) {
            ic1 ic1Var2 = new ic1();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String obj = entry.getValue().toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (entry.getKey() != null) {
                    eb1.j(ic1Var2, entry.getKey(), substring);
                }
            }
            eb1.i(ic1Var, "headers", ic1Var2);
        }
        rc1Var.a(ic1Var).b();
    }

    public final void b(ke1 ke1Var) {
        int corePoolSize = this.e.getCorePoolSize();
        int size = this.a.size();
        int i = this.b;
        double d = size;
        double d2 = this.d;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d);
        if (d * d2 > (corePoolSize - i) + 1 && corePoolSize < this.c) {
            this.e.setCorePoolSize(corePoolSize + 1);
        } else if (size == 0 && corePoolSize > i) {
            this.e.setCorePoolSize(i);
        }
        try {
            this.e.execute(ke1Var);
        } catch (RejectedExecutionException unused) {
            StringBuilder b = e5.b("RejectedExecutionException: ThreadPoolExecutor unable to ");
            StringBuilder b2 = e5.b("execute download for url ");
            b2.append(ke1Var.a0);
            b.append(b2.toString());
            t1.b(0, 0, b.toString(), true);
            a(ke1Var, ke1Var.R, null);
        }
    }
}