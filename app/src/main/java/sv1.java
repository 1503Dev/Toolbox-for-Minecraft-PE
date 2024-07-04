package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: sv1  reason: default package */
public final class sv1 implements bl4 {
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public /* synthetic */ sv1(o54 o54Var, hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        this.P = o54Var;
        this.Q = hi4Var;
        this.R = yh4Var;
        this.S = h14Var;
    }

    public /* synthetic */ sv1(pu1 pu1Var, PriorityBlockingQueue priorityBlockingQueue, d60 d60Var) {
        this.P = new HashMap();
        this.S = d60Var;
        this.Q = pu1Var;
        this.R = priorityBlockingQueue;
    }

    public final synchronized void a(gv1 gv1Var) {
        String e = gv1Var.e();
        List list = (List) ((Map) this.P).remove(e);
        if (list != null && !list.isEmpty()) {
            if (rv1.a) {
                rv1.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), e);
            }
            gv1 gv1Var2 = (gv1) list.remove(0);
            ((Map) this.P).put(e, list);
            synchronized (gv1Var2.T) {
                gv1Var2.Z = this;
            }
            try {
                ((BlockingQueue) this.R).put(gv1Var2);
            } catch (InterruptedException e2) {
                rv1.b("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                pu1 pu1Var = (pu1) this.Q;
                pu1Var.S = true;
                pu1Var.interrupt();
            }
        }
    }

    public final synchronized boolean b(gv1 gv1Var) {
        String e = gv1Var.e();
        if (((Map) this.P).containsKey(e)) {
            List list = (List) ((Map) this.P).get(e);
            if (list == null) {
                list = new ArrayList();
            }
            gv1Var.g("waiting-for-response");
            list.add(gv1Var);
            ((Map) this.P).put(e, list);
            if (rv1.a) {
                rv1.a("Request for cacheKey=%s is in flight, putting on hold.", e);
            }
            return true;
        }
        ((Map) this.P).put(e, null);
        synchronized (gv1Var.T) {
            gv1Var.Z = this;
        }
        if (rv1.a) {
            rv1.a("new request, sending to network %s", e);
        }
        return false;
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        Void r5 = (Void) obj;
        return ((o54) this.P).b.a((hi4) this.Q, (yh4) this.R, (h14) this.S);
    }
}