package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.sk0;

/* renamed from: iz1  reason: default package */
public final class iz1 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ t42 c;

    public iz1(t42 t42Var, Context context) {
        this.c = t42Var;
        this.b = context;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.b, "mobile_ads_settings");
        return new lh4();
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.b0(new va0(this.b), 231004000);
    }

    @Override // defpackage.q52
    public final Object c() {
        l83 l83Var;
        Object r53Var;
        x92.a(this.b);
        if (((Boolean) w82.d.c.a(x92.p8)).booleanValue()) {
            try {
                va0 va0Var = new va0(this.b);
                try {
                    IBinder b = vv2.a(this.b).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                    if (b == null) {
                        l83Var = null;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof l83) {
                            l83Var = (l83) queryLocalInterface;
                        } else {
                            l83Var = new l83(b);
                        }
                    }
                    Parcel A = l83Var.A();
                    k22.e(A, va0Var);
                    A.writeInt(231004000);
                    Parcel Z = l83Var.Z(A, 1);
                    IBinder readStrongBinder = Z.readStrongBinder();
                    Z.recycle();
                    if (readStrongBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    if (queryLocalInterface2 instanceof q73) {
                        r53Var = (q73) queryLocalInterface2;
                    } else {
                        r53Var = new r53(readStrongBinder);
                    }
                } catch (Exception e) {
                    throw new uv2(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                this.c.f = ip2.a(this.b);
                this.c.f.d("ClientApiBroker.getMobileAdsSettingsManager", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                this.c.f = ip2.a(this.b);
                this.c.f.d("ClientApiBroker.getMobileAdsSettingsManager", e);
                return null;
            } catch (uv2 e4) {
                e = e4;
                this.c.f = ip2.a(this.b);
                this.c.f.d("ClientApiBroker.getMobileAdsSettingsManager", e);
                return null;
            }
        } else {
            ic4 ic4Var = this.c.c;
            Context context = this.b;
            ic4Var.getClass();
            try {
                va0 va0Var2 = new va0(context);
                l83 l83Var2 = (l83) ic4Var.b(context);
                Parcel A2 = l83Var2.A();
                k22.e(A2, va0Var2);
                A2.writeInt(231004000);
                Parcel Z2 = l83Var2.Z(A2, 1);
                IBinder readStrongBinder2 = Z2.readStrongBinder();
                Z2.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                if (queryLocalInterface3 instanceof q73) {
                    r53Var = (q73) queryLocalInterface3;
                } else {
                    r53Var = new r53(readStrongBinder2);
                }
            } catch (RemoteException | sk0.a e5) {
                sv2.h("Could not get remote MobileAdsSettingManager.", e5);
                return null;
            }
        }
        return r53Var;
    }
}