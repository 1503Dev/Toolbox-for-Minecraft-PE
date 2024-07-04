package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fp2  reason: default package */
public final class fp2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    iBinder2 = in0.j(parcel, readInt);
                }
            } else {
                iBinder = in0.j(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new ep2(iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ep2[i];
    }
}