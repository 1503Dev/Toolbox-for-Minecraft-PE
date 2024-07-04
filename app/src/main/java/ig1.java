package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: ig1  reason: default package */
public final class ig1 implements Parcelable.Creator<gw0> {
    @Override // android.os.Parcelable.Creator
    public final gw0 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        while (true) {
            ArrayList arrayList = null;
            while (parcel.dataPosition() < o) {
                int readInt = parcel.readInt();
                char c = (char) readInt;
                if (c != 1) {
                    if (c != 2) {
                        in0.n(parcel, readInt);
                    } else {
                        Parcelable.Creator<e60> creator = e60.CREATOR;
                        int m = in0.m(parcel, readInt);
                        int dataPosition = parcel.dataPosition();
                        if (m == 0) {
                            break;
                        }
                        arrayList = parcel.createTypedArrayList(creator);
                        parcel.setDataPosition(dataPosition + m);
                    }
                } else {
                    i = in0.k(parcel, readInt);
                }
            }
            in0.h(parcel, o);
            return new gw0(i, arrayList);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gw0[] newArray(int i) {
        return new gw0[i];
    }
}