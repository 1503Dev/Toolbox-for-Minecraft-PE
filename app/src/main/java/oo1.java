package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: oo1  reason: default package */
public final class oo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new po1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new po1[i];
    }
}