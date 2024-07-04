package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lw2  reason: default package */
public final class lw2 {
    static {
        lw2.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}