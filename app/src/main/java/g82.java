package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: g82  reason: default package */
public final class g82 implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final Status createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        gf gfVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 1000) {
                                in0.n(parcel, readInt);
                            } else {
                                i = in0.k(parcel, readInt);
                            }
                        } else {
                            gfVar = (gf) in0.c(parcel, readInt, gf.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) in0.c(parcel, readInt, PendingIntent.CREATOR);
                    }
                } else {
                    str = in0.d(parcel, readInt);
                }
            } else {
                i2 = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new Status(i, i2, str, pendingIntent, gfVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}