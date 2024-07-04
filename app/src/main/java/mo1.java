package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mo1  reason: default package */
public final class mo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new no1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new no1[i];
    }
}