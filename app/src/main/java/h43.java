package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: h43  reason: default package */
public final class h43 {
    public final Object a;
    public Object b;
    public Serializable c;
    public Object d;

    public /* synthetic */ h43() {
        this.c = new ArrayDeque();
        this.d = null;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public /* synthetic */ h43(w33 w33Var) {
        this.a = w33Var;
    }

    public final void a(uo4 uo4Var) {
        uo4Var.a = this;
        ((ArrayDeque) this.c).add(uo4Var);
        if (((uo4) this.d) == null) {
            uo4 uo4Var2 = (uo4) ((ArrayDeque) this.c).poll();
            this.d = uo4Var2;
            if (uo4Var2 != null) {
                uo4Var2.executeOnExecutor((ThreadPoolExecutor) this.b, new Object[0]);
            }
        }
    }
}