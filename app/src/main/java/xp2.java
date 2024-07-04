package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xp2  reason: default package */
public final class xp2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = in0.d(parcel, readInt);
                    break;
                case 2:
                    i = in0.k(parcel, readInt);
                    break;
                case 3:
                    bundle = in0.a(parcel, readInt);
                    break;
                case 4:
                    bArr = in0.b(parcel, readInt);
                    break;
                case 5:
                    z = in0.i(parcel, readInt);
                    break;
                case 6:
                    str2 = in0.d(parcel, readInt);
                    break;
                case 7:
                    str3 = in0.d(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new wp2(str, i, bundle, bArr, z, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new wp2[i];
    }
}