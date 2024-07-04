package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.sk0;

/* renamed from: km5  reason: default package */
public final class km5 extends sk0 {
    public km5() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // defpackage.sk0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof jr2 ? (jr2) queryLocalInterface : new jr2(iBinder);
    }

    public final pq2 c(Context context, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        jr2 jr2Var;
        pq2 xo2Var;
        pq2 xo2Var2;
        x92.a(context);
        if (((Boolean) w82.d.c.a(x92.p8)).booleanValue()) {
            try {
                va0 va0Var = new va0(context);
                try {
                    IBinder b = vv2.a(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b == null) {
                        jr2Var = null;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof jr2) {
                            jr2Var = (jr2) queryLocalInterface;
                        } else {
                            jr2Var = new jr2(b);
                        }
                    }
                    IBinder d3 = jr2Var.d3(va0Var, zr5Var, str, wk2Var, i);
                    if (d3 == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = d3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if (queryLocalInterface2 instanceof pq2) {
                        xo2Var = (pq2) queryLocalInterface2;
                    } else {
                        xo2Var = new xo2(d3);
                    }
                    return xo2Var;
                } catch (Exception e) {
                    throw new uv2(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                ip2.a(context).d("AdManagerCreator.newAdManagerByDynamiteLoader", e);
                sv2.i("#007 Could not call remote method.", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                ip2.a(context).d("AdManagerCreator.newAdManagerByDynamiteLoader", e);
                sv2.i("#007 Could not call remote method.", e);
                return null;
            } catch (uv2 e4) {
                e = e4;
                ip2.a(context).d("AdManagerCreator.newAdManagerByDynamiteLoader", e);
                sv2.i("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder d32 = ((jr2) b(context)).d3(new va0(context), zr5Var, str, wk2Var, i);
            if (d32 == null) {
                return null;
            }
            IInterface queryLocalInterface3 = d32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface3 instanceof pq2) {
                xo2Var2 = (pq2) queryLocalInterface3;
            } else {
                xo2Var2 = new xo2(d32);
            }
            return xo2Var2;
        } catch (RemoteException | sk0.a e5) {
            sv2.c("Could not create remote AdManager.", e5);
            return null;
        }
    }
}