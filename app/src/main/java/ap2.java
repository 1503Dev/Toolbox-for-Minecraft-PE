package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ap2  reason: default package */
public abstract class ap2 extends j22 implements bp2 {
    public static bp2 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof bp2 ? (bp2) queryLocalInterface : new zo2(iBinder);
    }
}