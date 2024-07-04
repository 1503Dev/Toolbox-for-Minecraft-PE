package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: vp2  reason: default package */
public final class vp2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        ArrayList<String> arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    in0.n(parcel, readInt);
                } else {
                    arrayList = in0.f(parcel, readInt);
                }
            } else {
                z = in0.i(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new up2(arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new up2[i];
    }
}