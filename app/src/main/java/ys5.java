package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ys5  reason: default package */
public final class ys5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        zr5[] zr5VarArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = in0.d(parcel, readInt);
                    break;
                case 3:
                    i = in0.k(parcel, readInt);
                    break;
                case 4:
                    i2 = in0.k(parcel, readInt);
                    break;
                case 5:
                    z = in0.i(parcel, readInt);
                    break;
                case 6:
                    i3 = in0.k(parcel, readInt);
                    break;
                case 7:
                    i4 = in0.k(parcel, readInt);
                    break;
                case '\b':
                    zr5VarArr = (zr5[]) in0.g(parcel, readInt, zr5.CREATOR);
                    break;
                case '\t':
                    z2 = in0.i(parcel, readInt);
                    break;
                case '\n':
                    z3 = in0.i(parcel, readInt);
                    break;
                case 11:
                    z4 = in0.i(parcel, readInt);
                    break;
                case '\f':
                    z5 = in0.i(parcel, readInt);
                    break;
                case '\r':
                    z6 = in0.i(parcel, readInt);
                    break;
                case 14:
                    z7 = in0.i(parcel, readInt);
                    break;
                case 15:
                    z8 = in0.i(parcel, readInt);
                    break;
                case 16:
                    z9 = in0.i(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new zr5(str, i, i2, z, i3, i4, zr5VarArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zr5[i];
    }
}