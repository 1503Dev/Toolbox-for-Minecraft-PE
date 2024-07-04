package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.sk0;

/* renamed from: xx1  reason: default package */
public final class xx1 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ wk2 d;
    public final /* synthetic */ t42 e;

    public xx1(t42 t42Var, Context context, String str, tk2 tk2Var) {
        this.e = t42Var;
        this.b = context;
        this.c = str;
        this.d = tk2Var;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.b, "native_ad");
        return new af4();
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.T3(new va0(this.b), this.c, this.d, 231004000);
    }

    @Override // defpackage.q52
    public final Object c() {
        eo2 eo2Var;
        Object hl2Var;
        x92.a(this.b);
        if (((Boolean) w82.d.c.a(x92.p8)).booleanValue()) {
            try {
                va0 va0Var = new va0(this.b);
                try {
                    IBinder b = vv2.a(this.b).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                    if (b == null) {
                        eo2Var = null;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof eo2) {
                            eo2Var = (eo2) queryLocalInterface;
                        } else {
                            eo2Var = new eo2(b);
                        }
                    }
                    IBinder d3 = eo2Var.d3(va0Var, this.c, this.d);
                    if (d3 == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = d3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (queryLocalInterface2 instanceof jn2) {
                        hl2Var = (jn2) queryLocalInterface2;
                    } else {
                        hl2Var = new hl2(d3);
                    }
                } catch (Exception e) {
                    throw new uv2(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                this.e.f = ip2.a(this.b);
                this.e.f.d("ClientApiBroker.createAdLoaderBuilder", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                this.e.f = ip2.a(this.b);
                this.e.f.d("ClientApiBroker.createAdLoaderBuilder", e);
                return null;
            } catch (uv2 e4) {
                e = e4;
                this.e.f = ip2.a(this.b);
                this.e.f.d("ClientApiBroker.createAdLoaderBuilder", e);
                return null;
            }
        } else {
            xk5 xk5Var = this.e.b;
            Context context = this.b;
            String str = this.c;
            wk2 wk2Var = this.d;
            xk5Var.getClass();
            try {
                IBinder d32 = ((eo2) xk5Var.b(context)).d3(new va0(context), str, wk2Var);
                if (d32 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = d32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface3 instanceof jn2) {
                    hl2Var = (jn2) queryLocalInterface3;
                } else {
                    hl2Var = new hl2(d32);
                }
            } catch (RemoteException | sk0.a e5) {
                sv2.h("Could not create remote builder for AdLoader.", e5);
                return null;
            }
        }
        return hl2Var;
    }
}