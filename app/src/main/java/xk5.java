package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: xk5  reason: default package */
public final class xk5 extends sk0 {
    public xk5() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // defpackage.sk0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof eo2 ? (eo2) queryLocalInterface : new eo2(iBinder);
    }
}