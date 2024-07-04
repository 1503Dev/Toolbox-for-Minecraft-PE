package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: gi1  reason: default package */
public final class gi1 implements Parcelable.Creator<di1> {
    @Override // android.os.Parcelable.Creator
    public final di1 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    str = in0.d(parcel, readInt);
                }
            } else {
                arrayList = in0.f(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new di1(str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ di1[] newArray(int i) {
        return new di1[i];
    }
}