package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.k9;

/* renamed from: op2  reason: default package */
public final class op2 extends rw2 {
    public op2(Context context, Looper looper, k9.a aVar, k9.b bVar) {
        super(br2.a(context), looper, 8, aVar, bVar);
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof aq2 ? (aq2) queryLocalInterface : new yp2(iBinder);
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.ads.service.START";
    }
}