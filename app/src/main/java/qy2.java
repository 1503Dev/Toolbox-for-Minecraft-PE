package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: qy2  reason: default package */
public final /* synthetic */ class qy2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ qy2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf;
        String str;
        hc2 hc2Var;
        switch (this.P) {
            case 0:
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    ((vx2) rx2Var).e();
                    return;
                }
                return;
            case 1:
                gc2 gc2Var = ((h53) this.Q).Y;
                lp2 lp2Var = new lp2();
                gc2Var.getClass();
                try {
                    try {
                        IBinder b = vv2.a(gc2Var.a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                        if (b == null) {
                            hc2Var = null;
                        } else {
                            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                            if (queryLocalInterface instanceof hc2) {
                                hc2Var = (hc2) queryLocalInterface;
                            } else {
                                hc2Var = new hc2(b);
                            }
                        }
                        Parcel A = hc2Var.A();
                        k22.e(A, lp2Var);
                        hc2Var.c0(A, 1);
                        return;
                    } catch (Exception e) {
                        throw new uv2(e);
                    }
                } catch (RemoteException e2) {
                    valueOf = String.valueOf(e2.getMessage());
                    str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
                    sv2.g(str.concat(valueOf));
                    return;
                } catch (uv2 e3) {
                    valueOf = String.valueOf(e3.getMessage());
                    str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
                    sv2.g(str.concat(valueOf));
                    return;
                }
            case 2:
                oc3 oc3Var = (oc3) this.Q;
                synchronized (oc3Var) {
                    if (!oc3Var.T.isDone()) {
                        oc3Var.T.h(Boolean.TRUE);
                    }
                }
                return;
            case 3:
                ((y03) this.Q).B0();
                return;
            case 4:
                ((uq3) this.Q).b();
                return;
            case 5:
                f64 f64Var = (f64) this.Q;
                synchronized (f64Var) {
                    f64Var.b.clear();
                    f64Var.a.clear();
                    f64Var.d();
                    f64Var.e();
                }
                return;
            default:
                xs5 xs5Var = (xs5) this.Q;
                synchronized (xs5Var.a) {
                    if (!xs5Var.l) {
                        long j = xs5Var.k - 1;
                        xs5Var.k = j;
                        if (j <= 0) {
                            if (j < 0) {
                                IllegalStateException illegalStateException = new IllegalStateException();
                                synchronized (xs5Var.a) {
                                    xs5Var.m = illegalStateException;
                                }
                            } else {
                                xs5Var.a();
                            }
                        }
                    }
                }
                return;
        }
    }
}