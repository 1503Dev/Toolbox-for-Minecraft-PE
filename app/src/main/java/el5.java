package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: el5  reason: default package */
public final class el5 implements Runnable, nz1 {
    public boolean S;
    public final boolean T;
    public final boolean U;
    public final ExecutorService V;
    public final dp4 W;
    public Context X;
    public final Context Y;
    public xv2 Z;
    public final xv2 a0;
    public final boolean b0;
    public int d0;
    public final Vector P = new Vector();
    public final AtomicReference Q = new AtomicReference();
    public final AtomicReference R = new AtomicReference();
    public final CountDownLatch c0 = new CountDownLatch(1);

    public el5(Context context, xv2 xv2Var) {
        this.X = context;
        this.Y = context;
        this.Z = xv2Var;
        this.a0 = xv2Var;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.V = newCachedThreadPool;
        l92 l92Var = x92.N1;
        w82 w82Var = w82.d;
        boolean booleanValue = ((Boolean) w82Var.c.a(l92Var)).booleanValue();
        this.b0 = booleanValue;
        this.W = dp4.a(context, newCachedThreadPool, booleanValue);
        this.T = ((Boolean) w82Var.c.a(x92.K1)).booleanValue();
        this.U = ((Boolean) w82Var.c.a(x92.O1)).booleanValue();
        if (((Boolean) w82Var.c.a(x92.M1)).booleanValue()) {
            this.d0 = 2;
        } else {
            this.d0 = 1;
        }
        if (!((Boolean) w82Var.c.a(x92.L2)).booleanValue()) {
            this.S = j();
        }
        if (!((Boolean) w82Var.c.a(x92.F2)).booleanValue()) {
            mv2 mv2Var = n62.f.a;
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                run();
                return;
            }
        }
        zw2.a.execute(this);
    }

    @Override // defpackage.nz1
    public final void b(MotionEvent motionEvent) {
        nz1 l = l();
        if (l == null) {
            this.P.add(new Object[]{motionEvent});
            return;
        }
        m();
        l.b(motionEvent);
    }

    @Override // defpackage.nz1
    public final void c(View view) {
        nz1 l = l();
        if (l != null) {
            l.c(view);
        }
    }

    @Override // defpackage.nz1
    public final void d(StackTraceElement[] stackTraceElementArr) {
        nz1 l;
        if (!k() || (l = l()) == null) {
            return;
        }
        l.d(stackTraceElementArr);
    }

    @Override // defpackage.nz1
    public final String e(Context context, View view, Activity activity) {
        l92 l92Var = x92.n8;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (k()) {
                nz1 l = l();
                if (((Boolean) w82Var.c.a(x92.o8)).booleanValue()) {
                    cu5 cu5Var = jv5.A.c;
                    cu5.d(view, 2);
                }
                if (l != null) {
                    return l.e(context, view, activity);
                }
                return "";
            }
            return "";
        }
        nz1 l2 = l();
        if (((Boolean) w82Var.c.a(x92.o8)).booleanValue()) {
            cu5 cu5Var2 = jv5.A.c;
            cu5.d(view, 2);
        }
        if (l2 != null) {
            return l2.e(context, view, activity);
        }
        return "";
    }

    @Override // defpackage.nz1
    public final String f(Context context) {
        nz1 l;
        if (k() && (l = l()) != null) {
            m();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return l.f(context);
        }
        return "";
    }

    @Override // defpackage.nz1
    public final void g(int i, int i2, int i3) {
        nz1 l = l();
        if (l == null) {
            this.P.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        m();
        l.g(i, i2, i3);
    }

    @Override // defpackage.nz1
    public final String h(Context context, String str, View view) {
        return i(context, str, view, null);
    }

    @Override // defpackage.nz1
    public final String i(Context context, String str, View view, Activity activity) {
        if (k()) {
            nz1 l = l();
            if (((Boolean) w82.d.c.a(x92.o8)).booleanValue()) {
                cu5 cu5Var = jv5.A.c;
                cu5.d(view, 4);
            }
            if (l != null) {
                m();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                return l.i(context, str, view, activity);
            }
            return "";
        }
        return "";
    }

    public final boolean j() {
        Context context = this.X;
        dp4 dp4Var = this.W;
        dk5 dk5Var = new dk5(0, this);
        nq4 nq4Var = new nq4(this.X, eb1.u(context, dp4Var), dk5Var, ((Boolean) w82.d.c.a(x92.L1)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (nq4.f) {
            h22 g = nq4Var.g(1);
            if (g == null) {
                nq4Var.f(currentTimeMillis, 4025);
            } else {
                File c = nq4Var.c(g.G());
                if (!new File(c, "pcam.jar").exists()) {
                    nq4Var.f(currentTimeMillis, 4026);
                } else if (!new File(c, "pcbc").exists()) {
                    nq4Var.f(currentTimeMillis, 4027);
                } else {
                    nq4Var.f(currentTimeMillis, 5019);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean k() {
        try {
            this.c0.await();
            return true;
        } catch (InterruptedException e) {
            sv2.h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final nz1 l() {
        int i;
        AtomicReference atomicReference;
        if (this.T && !this.S) {
            i = 1;
        } else {
            i = this.d0;
        }
        if (i == 2) {
            atomicReference = this.R;
        } else {
            atomicReference = this.Q;
        }
        return (nz1) atomicReference.get();
    }

    public final void m() {
        nz1 l = l();
        if (this.P.isEmpty() || l == null) {
            return;
        }
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                l.b((MotionEvent) objArr[0]);
            } else if (length == 3) {
                l.g(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.P.clear();
    }

    public final void n(boolean z) {
        String str = this.Z.P;
        Context context = this.X;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        int i = qz1.u0;
        pz1.t(context, z);
        this.Q.set(new qz1(context, str, z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, xv2] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i;
        kz1 a;
        boolean z2;
        try {
            l92 l92Var = x92.L2;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                this.S = j();
            }
            boolean z3 = this.Z.S;
            if (!((Boolean) w82Var.c.a(x92.I0)).booleanValue() && z3) {
                z = true;
            } else {
                z = false;
            }
            if (this.T && !this.S) {
                i = 1;
            } else {
                i = this.d0;
            }
            if (i == 1) {
                n(z);
                if (this.d0 == 2) {
                    this.V.execute(new c25(this, z, 0));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.Z.P;
                    Context context = this.X;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    boolean z4 = this.b0;
                    synchronized (kz1.class) {
                        a = kz1.a(str, context, Executors.newCachedThreadPool(), z, z4);
                    }
                    this.R.set(a);
                    if (this.U) {
                        synchronized (a) {
                            z2 = a.e0;
                        }
                        if (!z2) {
                            this.d0 = 1;
                            n(z);
                        }
                    }
                } catch (NullPointerException e) {
                    this.d0 = 1;
                    n(z);
                    this.W.c(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.c0.countDown();
            this.X = null;
            this.Z = null;
        }
    }
}