package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ti1  reason: default package */
public final class ti1 implements Parcelable.Creator<e60> {
    @Override // android.os.Parcelable.Creator
    public final e60 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
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
                    j = in0.l(parcel, readInt);
                    break;
                case 5:
                    j2 = in0.l(parcel, readInt);
                    break;
                case 6:
                    str = in0.d(parcel, readInt);
                    break;
                case 7:
                    str2 = in0.d(parcel, readInt);
                    break;
                case '\b':
                    i4 = in0.k(parcel, readInt);
                    break;
                case '\t':
                    i5 = in0.k(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new e60(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e60[] newArray(int i) {
        return new e60[i];
    }
}