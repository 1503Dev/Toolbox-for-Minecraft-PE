package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ao1  reason: default package */
public final class ao1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bo1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bo1[i];
    }
}