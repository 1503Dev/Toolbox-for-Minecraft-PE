package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: so1  reason: default package */
public final class so1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        String readString2 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        return new to1(readString, readString2, nv4.u(createStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new to1[i];
    }
}