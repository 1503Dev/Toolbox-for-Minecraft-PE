package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: rp2  reason: default package */
public final class rp2 extends k9 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rp2(Context context, Looper looper, ox3 ox3Var, ox3 ox3Var2) {
        super(r0 != null ? r0 : context, looper, 8, ox3Var, ox3Var2);
        Context applicationContext = context.getApplicationContext();
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return queryLocalInterface instanceof eq2 ? (eq2) queryLocalInterface : new cq2(iBinder);
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.ads.service.ADS";
    }
}