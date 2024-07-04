package defpackage;

import android.os.RemoteException;

/* renamed from: p13  reason: default package */
public final /* synthetic */ class p13 implements Runnable {
    public final /* synthetic */ q13 P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ boolean T;

    public /* synthetic */ p13(q13 q13Var, int i, int i2, boolean z, boolean z2) {
        this.P = q13Var;
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        iu3 iu3Var;
        iu3 iu3Var2;
        iu3 iu3Var3;
        q13 q13Var = this.P;
        int i2 = this.Q;
        int i3 = this.R;
        boolean z6 = this.S;
        boolean z7 = this.T;
        synchronized (q13Var.Q) {
            boolean z8 = q13Var.V;
            boolean z9 = false;
            if (!z8 && i3 == 1) {
                i3 = 1;
                i = 1;
                z = true;
            } else {
                i = i3;
                z = false;
            }
            if (i2 != i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && i == 1) {
                z3 = true;
                i = 1;
            } else {
                z3 = false;
            }
            if (z2 && i == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 && i == 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            q13Var.V = (z8 || z) ? true : true;
            if (z) {
                try {
                    iu3 iu3Var4 = q13Var.U;
                    if (iu3Var4 != null) {
                        iu3Var4.g();
                    }
                } catch (RemoteException e) {
                    sv2.i("#007 Could not call remote method.", e);
                }
            }
            if (z3 && (iu3Var3 = q13Var.U) != null) {
                iu3Var3.f();
            }
            if (z4 && (iu3Var2 = q13Var.U) != null) {
                iu3Var2.h();
            }
            if (z5) {
                iu3 iu3Var5 = q13Var.U;
                if (iu3Var5 != null) {
                    iu3Var5.b();
                }
                q13Var.P.E();
            }
            if (z6 != z7 && (iu3Var = q13Var.U) != null) {
                iu3Var.k0(z7);
            }
        }
    }
}