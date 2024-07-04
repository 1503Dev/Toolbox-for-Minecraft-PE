package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: co1  reason: default package */
public final class co1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new do1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new do1[i];
    }
}