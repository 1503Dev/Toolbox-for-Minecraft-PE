package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: un5  reason: default package */
public final class un5 implements Parcelable.Creator<kf> {
    @Override // android.os.Parcelable.Creator
    public final kf createFromParcel(Parcel parcel) {
        int m;
        int dataPosition;
        int o = in0.o(parcel);
        gm0 gm0Var = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    gm0Var = (gm0) in0.c(parcel, readInt, gm0.CREATOR);
                    continue;
                case 2:
                    z = in0.i(parcel, readInt);
                    continue;
                case 3:
                    z2 = in0.i(parcel, readInt);
                    continue;
                case 4:
                    m = in0.m(parcel, readInt);
                    dataPosition = parcel.dataPosition();
                    if (m == 0) {
                        iArr = null;
                        continue;
                    } else {
                        iArr = parcel.createIntArray();
                        break;
                    }
                case 5:
                    i = in0.k(parcel, readInt);
                    continue;
                case 6:
                    m = in0.m(parcel, readInt);
                    dataPosition = parcel.dataPosition();
                    if (m == 0) {
                        iArr2 = null;
                        continue;
                    } else {
                        iArr2 = parcel.createIntArray();
                        break;
                    }
                default:
                    in0.n(parcel, readInt);
                    continue;
            }
            parcel.setDataPosition(dataPosition + m);
        }
        in0.h(parcel, o);
        return new kf(gm0Var, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ kf[] newArray(int i) {
        return new kf[i];
    }
}