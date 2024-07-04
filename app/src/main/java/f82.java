package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f82  reason: default package */
public final class f82 implements Parcelable.Creator<gf> {
    @Override // android.os.Parcelable.Creator
    public final gf createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            in0.n(parcel, readInt);
                        } else {
                            str = in0.d(parcel, readInt);
                        }
                    } else {
                        pendingIntent = (PendingIntent) in0.c(parcel, readInt, PendingIntent.CREATOR);
                    }
                } else {
                    i2 = in0.k(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new gf(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gf[] newArray(int i) {
        return new gf[i];
    }
}