package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yo1  reason: default package */
public final class yo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zo1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zo1[i];
    }
}