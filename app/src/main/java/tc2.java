package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: tc2  reason: default package */
public abstract class tc2 extends j22 implements uc2 {
    public tc2() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static uc2 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof uc2 ? (uc2) queryLocalInterface : new sc2(iBinder);
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            ArrayList arrayList = ((ic2) this).R;
            parcel2.writeNoException();
            parcel2.writeList(arrayList);
            return true;
        }
        String str = ((ic2) this).P;
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}