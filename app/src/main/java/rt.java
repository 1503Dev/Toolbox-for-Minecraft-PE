package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: rt  reason: default package */
public final class rt implements mn0, p61, mp {
    public static final String X = y20.e("GreedyScheduler");
    public final Context P;
    public final a71 Q;
    public final q61 R;
    public nk T;
    public boolean U;
    public Boolean W;
    public final HashSet S = new HashSet();
    public final Object V = new Object();

    public rt(Context context, a aVar, b71 b71Var, a71 a71Var) {
        this.P = context;
        this.Q = a71Var;
        this.R = new q61(context, b71Var, this);
        this.T = new nk(this, aVar.e);
    }

    @Override // defpackage.mp
    public final void a(String str, boolean z) {
        synchronized (this.V) {
            Iterator it = this.S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l71 l71Var = (l71) it.next();
                if (l71Var.a.equals(str)) {
                    y20.c().a(X, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.S.remove(l71Var);
                    this.R.b(this.S);
                    break;
                }
            }
        }
    }

    @Override // defpackage.mn0
    public final void b(String str) {
        Runnable runnable;
        if (this.W == null) {
            this.W = Boolean.valueOf(dg0.a(this.P, this.Q.g));
        }
        if (!this.W.booleanValue()) {
            y20.c().d(X, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.U) {
            this.Q.k.b(this);
            this.U = true;
        }
        y20.c().a(X, String.format("Cancelling work ID %s", str), new Throwable[0]);
        nk nkVar = this.T;
        if (nkVar != null && (runnable = (Runnable) nkVar.c.remove(str)) != null) {
            ((Handler) nkVar.b.Q).removeCallbacks(runnable);
        }
        this.Q.J1(str);
    }

    @Override // defpackage.p61
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            y20.c().a(X, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.Q.J1(str);
        }
    }

    @Override // defpackage.mn0
    public final void d(l71... l71VarArr) {
        boolean z;
        if (this.W == null) {
            this.W = Boolean.valueOf(dg0.a(this.P, this.Q.g));
        }
        if (!this.W.booleanValue()) {
            y20.c().d(X, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.U) {
            this.Q.k.b(this);
            this.U = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (l71 l71Var : l71VarArr) {
            long a = l71Var.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (l71Var.b == y61.ENQUEUED) {
                if (currentTimeMillis < a) {
                    nk nkVar = this.T;
                    if (nkVar != null) {
                        Runnable runnable = (Runnable) nkVar.c.remove(l71Var.a);
                        if (runnable != null) {
                            ((Handler) nkVar.b.Q).removeCallbacks(runnable);
                        }
                        mk mkVar = new mk(nkVar, l71Var);
                        nkVar.c.put(l71Var.a, mkVar);
                        ((Handler) nkVar.b.Q).postDelayed(mkVar, l71Var.a() - System.currentTimeMillis());
                    }
                } else if (l71Var.b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && l71Var.j.c) {
                        y20.c().a(X, String.format("Ignoring WorkSpec %s, Requires device idle.", l71Var), new Throwable[0]);
                    } else {
                        if (i >= 24) {
                            if (l71Var.j.h.a.size() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                y20.c().a(X, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", l71Var), new Throwable[0]);
                            }
                        }
                        hashSet.add(l71Var);
                        hashSet2.add(l71Var.a);
                    }
                } else {
                    y20.c().a(X, String.format("Starting work for %s", l71Var.a), new Throwable[0]);
                    this.Q.I1(l71Var.a, null);
                }
            }
        }
        synchronized (this.V) {
            if (!hashSet.isEmpty()) {
                y20.c().a(X, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.S.addAll(hashSet);
                this.R.b(this.S);
            }
        }
    }

    @Override // defpackage.p61
    public final void e(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            y20.c().a(X, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.Q.I1(str, null);
        }
    }

    @Override // defpackage.mn0
    public final boolean f() {
        return false;
    }
}