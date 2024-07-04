package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import defpackage.sk0;

/* renamed from: z02  reason: default package */
public final class z02 extends q52 {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ t42 e;

    public z02(t42 t42Var, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.e = t42Var;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.d, "native_ad_view_delegate");
        return new bi4();
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.B1(new va0(this.b), new va0(this.c));
    }

    @Override // defpackage.q52
    public final Object c() {
        hd2 fd2Var;
        Object cd2Var;
        x92.a(this.d);
        if (((Boolean) w82.d.c.a(x92.p8)).booleanValue()) {
            try {
                va0 va0Var = new va0(this.d);
                va0 va0Var2 = new va0(this.b);
                va0 va0Var3 = new va0(this.c);
                try {
                    IBinder b = vv2.a(this.d).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                    int i = gd2.P;
                    if (b == null) {
                        fd2Var = null;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                        if (queryLocalInterface instanceof hd2) {
                            fd2Var = (hd2) queryLocalInterface;
                        } else {
                            fd2Var = new fd2(b);
                        }
                    }
                    IBinder k3 = fd2Var.k3(va0Var, va0Var2, va0Var3);
                    int i2 = dd2.P;
                    if (k3 == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = k3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    if (queryLocalInterface2 instanceof ed2) {
                        cd2Var = (ed2) queryLocalInterface2;
                    } else {
                        cd2Var = new cd2(k3);
                    }
                } catch (Exception e) {
                    throw new uv2(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                this.e.f = ip2.a(this.d);
                this.e.f.d("ClientApiBroker.createNativeAdViewDelegate", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                this.e.f = ip2.a(this.d);
                this.e.f.d("ClientApiBroker.createNativeAdViewDelegate", e);
                return null;
            } catch (uv2 e4) {
                e = e4;
                this.e.f = ip2.a(this.d);
                this.e.f.d("ClientApiBroker.createNativeAdViewDelegate", e);
                return null;
            }
        } else {
            we2 we2Var = this.e.d;
            Context context = this.d;
            FrameLayout frameLayout = this.b;
            FrameLayout frameLayout2 = this.c;
            we2Var.getClass();
            try {
                IBinder k32 = ((hd2) we2Var.b(context)).k3(new va0(context), new va0(frameLayout), new va0(frameLayout2));
                if (k32 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = k32.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                if (queryLocalInterface3 instanceof ed2) {
                    cd2Var = (ed2) queryLocalInterface3;
                } else {
                    cd2Var = new cd2(k32);
                }
            } catch (RemoteException | sk0.a e5) {
                sv2.h("Could not create remote NativeAdViewDelegate.", e5);
                return null;
            }
        }
        return cd2Var;
    }
}