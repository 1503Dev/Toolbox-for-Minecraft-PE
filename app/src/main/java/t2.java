package defpackage;

import android.os.RemoteException;

/* renamed from: t2  reason: default package */
public final class t2 extends h9 {
    public h3[] getAdSizes() {
        return this.P.g;
    }

    public r6 getAppEventListener() {
        return this.P.h;
    }

    public p31 getVideoController() {
        return this.P.c;
    }

    public q31 getVideoOptions() {
        return this.P.j;
    }

    public void setAdSizes(h3... h3VarArr) {
        if (h3VarArr == null || h3VarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.P.c(h3VarArr);
    }

    public void setAppEventListener(r6 r6Var) {
        c04 c04Var = this.P;
        c04Var.getClass();
        try {
            c04Var.h = r6Var;
            pq2 pq2Var = c04Var.i;
            if (pq2Var != null) {
                pq2Var.a1(r6Var != null ? new z22(r6Var) : null);
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    public void setManualImpressionsEnabled(boolean z) {
        c04 c04Var = this.P;
        c04Var.n = z;
        try {
            pq2 pq2Var = c04Var.i;
            if (pq2Var != null) {
                pq2Var.j4(z);
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    public void setVideoOptions(q31 q31Var) {
        zq4 zq4Var;
        c04 c04Var = this.P;
        c04Var.j = q31Var;
        try {
            pq2 pq2Var = c04Var.i;
            if (pq2Var != null) {
                if (q31Var == null) {
                    zq4Var = null;
                } else {
                    zq4Var = new zq4(q31Var);
                }
                pq2Var.c3(zq4Var);
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}