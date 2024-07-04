package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: mo2  reason: default package */
public final class mo2 extends sk0 {
    public mo2() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // defpackage.sk0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof so2 ? (so2) queryLocalInterface : new qo2(iBinder);
    }
}