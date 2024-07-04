package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: h9  reason: default package */
public abstract class h9 extends ViewGroup {
    @NotOnlyInitialized
    public final c04 P;

    public h9(Context context) {
        super(context);
        this.P = new c04(this);
    }

    public final void a(d3 d3Var) {
        uf0.b("#008 Must be called on the main UI thread.");
        x92.a(getContext());
        if (((Boolean) kb2.f.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                jv2.b.execute(new ow2(0, this, d3Var));
                return;
            }
        }
        this.P.b(d3Var.a);
    }

    public q2 getAdListener() {
        return this.P.f;
    }

    public h3 getAdSize() {
        zr5 h;
        c04 c04Var = this.P;
        c04Var.getClass();
        try {
            pq2 pq2Var = c04Var.i;
            if (pq2Var != null && (h = pq2Var.h()) != null) {
                return new h3(h.T, h.Q, h.P);
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        h3[] h3VarArr = c04Var.g;
        if (h3VarArr != null) {
            return h3VarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        pq2 pq2Var;
        c04 c04Var = this.P;
        if (c04Var.k == null && (pq2Var = c04Var.i) != null) {
            try {
                c04Var.k = pq2Var.w();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
        return c04Var.k;
    }

    public fc0 getOnPaidEventListener() {
        this.P.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rl0 getResponseInfo() {
        mq3 mq3Var;
        pq2 pq2Var;
        c04 c04Var = this.P;
        c04Var.getClass();
        try {
            pq2Var = c04Var.i;
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        if (pq2Var != null) {
            mq3Var = pq2Var.l();
            if (mq3Var != null) {
                return null;
            }
            return new rl0(mq3Var);
        }
        mq3Var = null;
        if (mq3Var != null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        h3 h3Var;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                h3Var = getAdSize();
            } catch (NullPointerException e) {
                sv2.e("Unable to retrieve ad size.", e);
                h3Var = null;
            }
            if (h3Var != null) {
                Context context = getContext();
                int b = h3Var.b(context);
                i3 = h3Var.a(context);
                i4 = b;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(q2 q2Var) {
        c04 c04Var = this.P;
        c04Var.f = q2Var;
        uy3 uy3Var = c04Var.d;
        synchronized (uy3Var.P) {
            uy3Var.Q = q2Var;
        }
        if (q2Var == null) {
            c04 c04Var2 = this.P;
            c04Var2.getClass();
            try {
                c04Var2.e = null;
                pq2 pq2Var = c04Var2.i;
                if (pq2Var != null) {
                    pq2Var.R2(null);
                    return;
                }
                return;
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
                return;
            }
        }
        if (q2Var instanceof vj1) {
            c04 c04Var3 = this.P;
            vj1 vj1Var = (vj1) q2Var;
            c04Var3.getClass();
            try {
                c04Var3.e = vj1Var;
                pq2 pq2Var2 = c04Var3.i;
                if (pq2Var2 != null) {
                    pq2Var2.R2(new p82(vj1Var));
                }
            } catch (RemoteException e2) {
                sv2.i("#007 Could not call remote method.", e2);
            }
        }
        if (q2Var instanceof r6) {
            c04 c04Var4 = this.P;
            r6 r6Var = (r6) q2Var;
            c04Var4.getClass();
            try {
                c04Var4.h = r6Var;
                pq2 pq2Var3 = c04Var4.i;
                if (pq2Var3 != null) {
                    pq2Var3.a1(new z22(r6Var));
                }
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            }
        }
    }

    public void setAdSize(h3 h3Var) {
        c04 c04Var = this.P;
        h3[] h3VarArr = {h3Var};
        if (c04Var.g == null) {
            c04Var.c(h3VarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void setAdUnitId(String str) {
        c04 c04Var = this.P;
        if (c04Var.k == null) {
            c04Var.k = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public void setOnPaidEventListener(fc0 fc0Var) {
        c04 c04Var = this.P;
        c04Var.getClass();
        try {
            c04Var.getClass();
            pq2 pq2Var = c04Var.i;
            if (pq2Var != null) {
                pq2Var.F2(new tl4(fc0Var));
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}