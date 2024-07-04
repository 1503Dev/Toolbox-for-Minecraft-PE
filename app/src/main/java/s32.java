package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: s32  reason: default package */
public final class s32 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ wk2 d;

    public s32(Context context, String str, tk2 tk2Var) {
        this.b = context;
        this.c = str;
        this.d = tk2Var;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.b, "rewarded");
        return new ok4();
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.J3(new va0(this.b), this.c, this.d, 231004000);
    }

    @Override // defpackage.q52
    public final Object c() {
        as2 as2Var;
        Object ur2Var;
        Context context = this.b;
        String str = this.c;
        wk2 wk2Var = this.d;
        va0 va0Var = new va0(context);
        try {
            try {
                IBinder b = vv2.a(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (b == null) {
                    as2Var = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof as2) {
                        as2Var = (as2) queryLocalInterface;
                    } else {
                        as2Var = new as2(b);
                    }
                }
                IBinder d3 = as2Var.d3(va0Var, str, wk2Var);
                if (d3 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = d3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                if (queryLocalInterface2 instanceof wr2) {
                    ur2Var = (wr2) queryLocalInterface2;
                } else {
                    ur2Var = new ur2(d3);
                }
                return ur2Var;
            } catch (Exception e) {
                throw new uv2(e);
            }
        } catch (RemoteException e2) {
            e = e2;
            sv2.i("#007 Could not call remote method.", e);
            return null;
        } catch (uv2 e3) {
            e = e3;
            sv2.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}