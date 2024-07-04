package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ic4  reason: default package */
public final class ic4 extends sk0 {
    public ic4() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // defpackage.sk0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof l83 ? (l83) queryLocalInterface : new l83(iBinder);
    }
}