package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z42  reason: default package */
public final class z42 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = in0.d(parcel, readInt);
                    break;
                case 3:
                    j = in0.l(parcel, readInt);
                    break;
                case 4:
                    str2 = in0.d(parcel, readInt);
                    break;
                case 5:
                    str3 = in0.d(parcel, readInt);
                    break;
                case 6:
                    str4 = in0.d(parcel, readInt);
                    break;
                case 7:
                    bundle = in0.a(parcel, readInt);
                    break;
                case '\b':
                    z = in0.i(parcel, readInt);
                    break;
                case '\t':
                    j2 = in0.l(parcel, readInt);
                    break;
                case '\n':
                    str5 = in0.d(parcel, readInt);
                    break;
                case 11:
                    i = in0.k(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new y42(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new y42[i];
    }
}