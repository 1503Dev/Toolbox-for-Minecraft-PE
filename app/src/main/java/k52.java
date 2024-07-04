package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: k52  reason: default package */
public final /* synthetic */ class k52 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ k52(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                l52 l52Var = (l52) this.Q;
                synchronized (l52Var) {
                    try {
                        m52 m52Var = l52Var.c;
                        if (m52Var.b) {
                            m52Var.a.p0(l52Var.a);
                            l52Var.c.a.X(0);
                            l52Var.c.a.v(l52Var.b);
                            l52Var.c.a.r0();
                            l52Var.c.a.e();
                        }
                    } catch (RemoteException e) {
                        sv2.c("Clearcut log failed", e);
                    }
                }
                return;
            case 1:
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    ((vx2) rx2Var).d();
                    return;
                }
                return;
            case 2:
                so3 so3Var = (so3) this.Q;
                try {
                    so3Var.getClass();
                    uf0.b("#008 Must be called on the main UI thread.");
                    View view = so3Var.P;
                    if (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(so3Var.P);
                        }
                    }
                    jl3 jl3Var = so3Var.R;
                    if (jl3Var != null) {
                        jl3Var.q();
                    }
                    so3Var.R = null;
                    so3Var.P = null;
                    so3Var.Q = null;
                    so3Var.S = true;
                    return;
                } catch (RemoteException e2) {
                    sv2.i("#007 Could not call remote method.", e2);
                    return;
                }
            case 3:
                jt3 jt3Var = (jt3) this.Q;
                synchronized (jt3Var) {
                    if (!jt3Var.c) {
                        jv5.A.j.getClass();
                        jt3Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - jt3Var.d), "Timeout.", false);
                        jt3Var.l.a("com.google.android.gms.ads.MobileAds", "timeout");
                        jt3Var.o.B("com.google.android.gms.ads.MobileAds", "timeout");
                        jt3Var.e.c(new Exception());
                    }
                }
                return;
            default:
                tv2.x(((fy4) ((z63) this.Q).Q).g(), "persistFlags");
                return;
        }
    }
}