package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: c04  reason: default package */
public final class c04 {
    public final tk2 a;
    public final zq5 b;
    public final p31 c;
    public final uy3 d;
    public vj1 e;
    public q2 f;
    public h3[] g;
    public r6 h;
    public pq2 i;
    public q31 j;
    public String k;
    @NotOnlyInitialized
    public final ViewGroup l;
    public int m;
    public boolean n;

    public c04(ViewGroup viewGroup) {
        zq5 zq5Var = zq5.a;
        this.a = new tk2();
        this.c = new p31();
        this.d = new uy3(this);
        this.l = viewGroup;
        this.b = zq5Var;
        this.i = null;
        new AtomicBoolean(false);
        this.m = 0;
    }

    public static zr5 a(Context context, h3[] h3VarArr, int i) {
        boolean z = false;
        for (h3 h3Var : h3VarArr) {
            if (h3Var.equals(h3.j)) {
                return new zr5("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zr5 zr5Var = new zr5(context, h3VarArr);
        if (i == 1) {
            z = true;
        }
        zr5Var.Y = z;
        return zr5Var;
    }

    public final void b(fx3 fx3Var) {
        Object d;
        try {
            if (this.i == null) {
                if (this.g != null && this.k != null) {
                    Context context = this.l.getContext();
                    zr5 a = a(context, this.g, this.m);
                    if ("search_v2".equals(a.P)) {
                        d = new av1(n62.f.b, context, a, this.k).d(context, false);
                    } else {
                        d = new dt1(n62.f.b, context, a, this.k, this.a).d(context, false);
                    }
                    pq2 pq2Var = (pq2) d;
                    this.i = pq2Var;
                    pq2Var.S3(new d25(this.d));
                    vj1 vj1Var = this.e;
                    if (vj1Var != null) {
                        this.i.R2(new p82(vj1Var));
                    }
                    r6 r6Var = this.h;
                    if (r6Var != null) {
                        this.i.a1(new z22(r6Var));
                    }
                    q31 q31Var = this.j;
                    if (q31Var != null) {
                        this.i.c3(new zq4(q31Var));
                    }
                    this.i.F2(new tl4(null));
                    this.i.j4(this.n);
                    pq2 pq2Var2 = this.i;
                    if (pq2Var2 != null) {
                        try {
                            hw k = pq2Var2.k();
                            if (k != null) {
                                if (((Boolean) kb2.f.d()).booleanValue()) {
                                    if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                                        mv2.b.post(new hq1(1, this, k));
                                    }
                                }
                                this.l.addView((View) va0.c0(k));
                            }
                        } catch (RemoteException e) {
                            sv2.i("#007 Could not call remote method.", e);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            pq2 pq2Var3 = this.i;
            pq2Var3.getClass();
            zq5 zq5Var = this.b;
            Context context2 = this.l.getContext();
            zq5Var.getClass();
            pq2Var3.z1(zq5.a(context2, fx3Var));
        } catch (RemoteException e2) {
            sv2.i("#007 Could not call remote method.", e2);
        }
    }

    public final void c(h3... h3VarArr) {
        this.g = h3VarArr;
        try {
            pq2 pq2Var = this.i;
            if (pq2Var != null) {
                pq2Var.K1(a(this.l.getContext(), this.g, this.m));
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        this.l.requestLayout();
    }
}