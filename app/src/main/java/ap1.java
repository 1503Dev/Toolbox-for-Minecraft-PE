package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ap1  reason: default package */
public final class ap1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bp1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bp1[i];
    }
}