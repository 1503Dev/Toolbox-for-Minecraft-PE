package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qw2  reason: default package */
public final class qw2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    iBinder = in0.j(parcel, readInt);
                }
            } else {
                z = in0.i(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new u2(z, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new u2[i];
    }
}