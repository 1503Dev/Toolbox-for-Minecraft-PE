package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: si4  reason: default package */
public final class si4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        in0.n(parcel, readInt);
                    } else {
                        iBinder2 = in0.j(parcel, readInt);
                    }
                } else {
                    iBinder = in0.j(parcel, readInt);
                }
            } else {
                z = in0.i(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new rg0(z, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rg0[i];
    }
}