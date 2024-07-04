package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kh2  reason: default package */
public final class kh2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        in0.n(parcel, readInt);
                    } else {
                        strArr2 = in0.e(parcel, readInt);
                    }
                } else {
                    strArr = in0.e(parcel, readInt);
                }
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new jh2(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jh2[i];
    }
}