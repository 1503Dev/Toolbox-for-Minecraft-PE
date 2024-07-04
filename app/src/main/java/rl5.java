package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rl5  reason: default package */
public final class rl5 {
    public static final /* synthetic */ int a = 0;

    static {
        rl5.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}