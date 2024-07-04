package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: sp3  reason: default package */
public abstract class sp3 extends j22 implements mq3 {
    public sp3() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static mq3 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof mq3 ? (mq3) queryLocalInterface : new yo3(iBinder);
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        String str;
        Parcelable e;
        switch (i) {
            case 1:
                str = ((gd3) this).P;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 2:
                str = ((gd3) this).Q;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List list = ((gd3) this).T;
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 4:
                e = ((gd3) this).e();
                parcel2.writeNoException();
                k22.d(parcel2, e);
                return true;
            case 5:
                e = ((gd3) this).X;
                parcel2.writeNoException();
                k22.d(parcel2, e);
                return true;
            case 6:
                str = ((gd3) this).R;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}