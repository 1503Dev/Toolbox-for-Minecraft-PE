package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: eq1  reason: default package */
public final class eq1 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ wk2 c;

    public eq1(Context context, tk2 tk2Var) {
        this.b = context;
        this.c = tk2Var;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.d2(new va0(this.b), this.c, 231004000);
    }

    @Override // defpackage.q52
    public final Object c() {
        lo2 jo2Var;
        va0 va0Var = new va0(this.b);
        try {
            try {
                IBinder b = vv2.a(this.b).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = ko2.P;
                if (b == null) {
                    jo2Var = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    if (queryLocalInterface instanceof lo2) {
                        jo2Var = (lo2) queryLocalInterface;
                    } else {
                        jo2Var = new jo2(b);
                    }
                }
                return jo2Var.V(va0Var, this.c);
            } catch (Exception e) {
                throw new uv2(e);
            }
        } catch (RemoteException | NullPointerException | uv2 unused) {
            return null;
        }
    }
}