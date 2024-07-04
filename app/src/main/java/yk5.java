package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbqi;
import java.util.concurrent.Callable;

/* renamed from: yk5  reason: default package */
public final /* synthetic */ class yk5 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ yk5(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n22 l22Var;
        switch (this.P) {
            case 0:
                ((lm5) this.Q).b.Q.getWindow().setBackgroundDrawable((Drawable) this.R);
                return;
            case 1:
                m52 m52Var = (m52) this.Q;
                Context context = (Context) this.R;
                if (((Boolean) w82.d.c.a(x92.c4)).booleanValue()) {
                    try {
                        try {
                            IBinder b = vv2.a(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i = m22.P;
                            if (b == null) {
                                l22Var = null;
                            } else {
                                IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                if (queryLocalInterface instanceof n22) {
                                    l22Var = (n22) queryLocalInterface;
                                } else {
                                    l22Var = new l22(b);
                                }
                            }
                            m52Var.a = l22Var;
                            m52Var.a.w1(new va0(context));
                            m52Var.b = true;
                            return;
                        } catch (Exception e) {
                            throw new uv2(e);
                        }
                    } catch (RemoteException | NullPointerException | uv2 unused) {
                        sv2.b("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 2:
                ((zi2) this.Q).P.m((String) this.R);
                return;
            case 3:
                ea2 ea2Var = jv5.A.b;
                ea2.z(((zzbqi) this.R).a, (AdOverlayInfoParcel) this.Q, true);
                return;
            case 4:
                zw2.e.execute(new wi2(1, (h53) this.Q, (Runnable) this.R));
                return;
            case 5:
                d16 d16Var = ((c16) this.Q).b;
                int i2 = zn4.a;
                xl5 xl5Var = (xl5) d16Var;
                bm5 bm5Var = xl5Var.P;
                int i3 = bm5.X;
                bm5Var.getClass();
                i94 i94Var = xl5Var.P.k;
                i94Var.b(25, new cz1(3, (wo3) this.R));
                i94Var.a();
                return;
            default:
                try {
                    ((ay5) this.Q).n(((Callable) this.R).call());
                    return;
                } catch (Exception e2) {
                    ((ay5) this.Q).m(e2);
                    return;
                } catch (Throwable th) {
                    ((ay5) this.Q).m(new RuntimeException(th));
                    return;
                }
        }
    }

    public yk5(zzbqi zzbqiVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.P = 3;
        this.R = zzbqiVar;
        this.Q = adOverlayInfoParcel;
    }
}