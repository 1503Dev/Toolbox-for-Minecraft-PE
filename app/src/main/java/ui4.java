package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ui4  reason: default package */
public final class ui4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        tz3 tz3Var = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                in0.n(parcel, readInt);
                            } else {
                                iBinder = in0.j(parcel, readInt);
                            }
                        } else {
                            tz3Var = (tz3) in0.c(parcel, readInt, tz3.CREATOR);
                        }
                    } else {
                        str2 = in0.d(parcel, readInt);
                    }
                } else {
                    str = in0.d(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new tz3(i, str, str2, tz3Var, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new tz3[i];
    }
}