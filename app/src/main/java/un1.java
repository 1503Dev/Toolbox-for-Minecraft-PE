package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: un1  reason: default package */
public final class un1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new vn1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new vn1[i];
    }
}