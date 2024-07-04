package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cp1  reason: default package */
public final class cp1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dp1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dp1[i];
    }
}