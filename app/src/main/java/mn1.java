package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mn1  reason: default package */
public final class mn1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nn1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new nn1[i];
    }
}