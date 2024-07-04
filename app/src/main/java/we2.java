package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: we2  reason: default package */
public final class we2 extends sk0 {
    public we2() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // defpackage.sk0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof hd2 ? (hd2) queryLocalInterface : new fd2(iBinder);
    }
}