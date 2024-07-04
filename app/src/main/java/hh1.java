package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hh1  reason: default package */
public final class hh1 {
    public static final /* synthetic */ int a = 0;

    static {
        hh1.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}