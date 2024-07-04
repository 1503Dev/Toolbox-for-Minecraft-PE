package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fl2  reason: default package */
public final class fl2 {
    public static final /* synthetic */ int a = 0;

    static {
        fl2.class.getClassLoader();
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}