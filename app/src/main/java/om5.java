package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: om5  reason: default package */
public final class om5 implements Parcelable.Creator<ql5> {
    @Override // android.os.Parcelable.Creator
    public final ql5 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        Bundle bundle = null;
        wp[] wpVarArr = null;
        kf kfVar = null;
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            in0.n(parcel, readInt);
                        } else {
                            kfVar = (kf) in0.c(parcel, readInt, kf.CREATOR);
                        }
                    } else {
                        i = in0.k(parcel, readInt);
                    }
                } else {
                    wpVarArr = (wp[]) in0.g(parcel, readInt, wp.CREATOR);
                }
            } else {
                bundle = in0.a(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new ql5(bundle, wpVarArr, i, kfVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ql5[] newArray(int i) {
        return new ql5[i];
    }
}