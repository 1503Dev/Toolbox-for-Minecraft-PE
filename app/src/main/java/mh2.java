package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mh2  reason: default package */
public final class mh2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = in0.i(parcel, readInt);
                    break;
                case 2:
                    str = in0.d(parcel, readInt);
                    break;
                case 3:
                    i = in0.k(parcel, readInt);
                    break;
                case 4:
                    bArr = in0.b(parcel, readInt);
                    break;
                case 5:
                    strArr = in0.e(parcel, readInt);
                    break;
                case 6:
                    strArr2 = in0.e(parcel, readInt);
                    break;
                case 7:
                    z2 = in0.i(parcel, readInt);
                    break;
                case '\b':
                    j = in0.l(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new lh2(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lh2[i];
    }
}