package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: w42  reason: default package */
public final class w42 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        long j = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                in0.n(parcel, readInt);
                            } else {
                                z3 = in0.i(parcel, readInt);
                            }
                        } else {
                            j = in0.l(parcel, readInt);
                        }
                    } else {
                        z2 = in0.i(parcel, readInt);
                    }
                } else {
                    z = in0.i(parcel, readInt);
                }
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) in0.c(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        in0.h(parcel, o);
        return new v42(parcelFileDescriptor, z, z2, j, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new v42[i];
    }
}