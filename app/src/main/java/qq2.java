package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: qq2  reason: default package */
public final class qq2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                in0.n(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) in0.c(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        in0.h(parcel, o);
        return new lq2(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lq2[i];
    }
}