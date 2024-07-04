package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.sk0;

/* renamed from: gk1  reason: default package */
public final class gk1 extends q52 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ t42 c;

    public gk1(t42 t42Var, Activity activity) {
        this.c = t42Var;
        this.b = activity;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.b, "ad_overlay");
        return null;
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.S(new va0(this.b));
    }

    @Override // defpackage.q52
    public final Object c() {
        so2 qo2Var;
        Object no2Var;
        x92.a(this.b);
        if (((Boolean) w82.d.c.a(x92.p8)).booleanValue()) {
            try {
                va0 va0Var = new va0(this.b);
                try {
                    IBinder b = vv2.a(this.b).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                    int i = ro2.P;
                    if (b == null) {
                        qo2Var = null;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                        if (queryLocalInterface instanceof so2) {
                            qo2Var = (so2) queryLocalInterface;
                        } else {
                            qo2Var = new qo2(b);
                        }
                    }
                    IBinder D1 = qo2Var.D1(va0Var);
                    int i2 = oo2.P;
                    if (D1 == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = D1.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    if (queryLocalInterface2 instanceof po2) {
                        no2Var = (po2) queryLocalInterface2;
                    } else {
                        no2Var = new no2(D1);
                    }
                } catch (Exception e) {
                    throw new uv2(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                this.c.f = ip2.a(this.b.getApplicationContext());
                this.c.f.d("ClientApiBroker.createAdOverlay", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                this.c.f = ip2.a(this.b.getApplicationContext());
                this.c.f.d("ClientApiBroker.createAdOverlay", e);
                return null;
            } catch (uv2 e4) {
                e = e4;
                this.c.f = ip2.a(this.b.getApplicationContext());
                this.c.f.d("ClientApiBroker.createAdOverlay", e);
                return null;
            }
        } else {
            mo2 mo2Var = this.c.e;
            Activity activity = this.b;
            mo2Var.getClass();
            try {
                IBinder D12 = ((so2) mo2Var.b(activity)).D1(new va0(activity));
                if (D12 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = D12.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                if (queryLocalInterface3 instanceof po2) {
                    no2Var = (po2) queryLocalInterface3;
                } else {
                    no2Var = new no2(D12);
                }
            } catch (RemoteException | sk0.a e5) {
                sv2.h("Could not create remote AdOverlay.", e5);
                return null;
            }
        }
        return no2Var;
    }
}