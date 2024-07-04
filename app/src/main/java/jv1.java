package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jv1  reason: default package */
public final class jv1 {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final ou1 e;
    public final vu1 f;
    public final wu1[] g;
    public pu1 h;
    public final ArrayList i;
    public final ArrayList j;
    public final d60 k;

    public jv1(aw1 aw1Var, tv1 tv1Var) {
        d60 d60Var = new d60(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = aw1Var;
        this.f = tv1Var;
        this.g = new wu1[4];
        this.k = d60Var;
    }

    public final void a(gv1 gv1Var) {
        gv1Var.W = this;
        synchronized (this.b) {
            this.b.add(gv1Var);
        }
        gv1Var.V = Integer.valueOf(this.a.incrementAndGet());
        gv1Var.g("add-to-queue");
        b();
        this.c.add(gv1Var);
    }

    public final void b() {
        synchronized (this.j) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((hv1) it.next()).a();
            }
        }
    }

    public final void c() {
        pu1 pu1Var = this.h;
        if (pu1Var != null) {
            pu1Var.S = true;
            pu1Var.interrupt();
        }
        wu1[] wu1VarArr = this.g;
        for (int i = 0; i < 4; i++) {
            wu1 wu1Var = wu1VarArr[i];
            if (wu1Var != null) {
                wu1Var.S = true;
                wu1Var.interrupt();
            }
        }
        pu1 pu1Var2 = new pu1(this.c, this.d, this.e, this.k);
        this.h = pu1Var2;
        pu1Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            wu1 wu1Var2 = new wu1(this.d, this.f, this.e, this.k);
            this.g[i2] = wu1Var2;
            wu1Var2.start();
        }
    }
}