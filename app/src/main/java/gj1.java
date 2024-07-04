package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gj1  reason: default package */
public final class gj1 implements Parcelable.Creator<fj1> {
    @Override // android.os.Parcelable.Creator
    public final fj1 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        IBinder iBinder = null;
        gf gfVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
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
                                z2 = in0.i(parcel, readInt);
                            }
                        } else {
                            z = in0.i(parcel, readInt);
                        }
                    } else {
                        gfVar = (gf) in0.c(parcel, readInt, gf.CREATOR);
                    }
                } else {
                    iBinder = in0.j(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new fj1(i, iBinder, gfVar, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fj1[] newArray(int i) {
        return new fj1[i];
    }
}