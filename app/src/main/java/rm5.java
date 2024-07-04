package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rm5  reason: default package */
public final class rm5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    z = in0.i(parcel, readInt);
                    break;
                case 3:
                    z2 = in0.i(parcel, readInt);
                    break;
                case 4:
                    str = in0.d(parcel, readInt);
                    break;
                case 5:
                    z3 = in0.i(parcel, readInt);
                    break;
                case 6:
                    in0.p(parcel, readInt, 4);
                    f = parcel.readFloat();
                    break;
                case 7:
                    i = in0.k(parcel, readInt);
                    break;
                case '\b':
                    z4 = in0.i(parcel, readInt);
                    break;
                case '\t':
                    z5 = in0.i(parcel, readInt);
                    break;
                case '\n':
                    z6 = in0.i(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new tl5(z, z2, str, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new tl5[i];
    }
}