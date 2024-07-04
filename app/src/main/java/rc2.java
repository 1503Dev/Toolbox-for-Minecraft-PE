package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rc2  reason: default package */
public final class rc2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        zq4 zq4Var = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = in0.k(parcel, readInt);
                    break;
                case 2:
                    z = in0.i(parcel, readInt);
                    break;
                case 3:
                    i2 = in0.k(parcel, readInt);
                    break;
                case 4:
                    z2 = in0.i(parcel, readInt);
                    break;
                case 5:
                    i3 = in0.k(parcel, readInt);
                    break;
                case 6:
                    zq4Var = (zq4) in0.c(parcel, readInt, zq4.CREATOR);
                    break;
                case 7:
                    z3 = in0.i(parcel, readInt);
                    break;
                case '\b':
                    i4 = in0.k(parcel, readInt);
                    break;
                case '\t':
                    i5 = in0.k(parcel, readInt);
                    break;
                case '\n':
                    z4 = in0.i(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new nc2(i, z, i2, z2, i3, zq4Var, z3, i4, i5, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new nc2[i];
    }
}