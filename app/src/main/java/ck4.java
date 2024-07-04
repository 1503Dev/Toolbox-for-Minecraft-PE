package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ck4  reason: default package */
public final class ck4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = in0.k(parcel, readInt);
                    break;
                case 2:
                    i2 = in0.k(parcel, readInt);
                    break;
                case 3:
                    i3 = in0.k(parcel, readInt);
                    break;
                case 4:
                    i4 = in0.k(parcel, readInt);
                    break;
                case 5:
                    str = in0.d(parcel, readInt);
                    break;
                case 6:
                    i5 = in0.k(parcel, readInt);
                    break;
                case 7:
                    i6 = in0.k(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new bk4(i, i2, i3, i4, str, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bk4[i];
    }
}