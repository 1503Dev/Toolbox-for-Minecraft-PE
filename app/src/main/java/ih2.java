package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ih2  reason: default package */
public final class ih2 extends rw2 {
    public ih2(Context context, Looper looper, sh2 sh2Var, th2 th2Var) {
        super(br2.a(context), looper, 166, sh2Var, th2Var);
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof oh2 ? (oh2) queryLocalInterface : new oh2(iBinder);
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}