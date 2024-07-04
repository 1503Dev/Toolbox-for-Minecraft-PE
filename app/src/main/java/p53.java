package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p53  reason: default package */
public final class p53 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = in0.l(parcel, readInt);
                    break;
                case 2:
                    j2 = in0.l(parcel, readInt);
                    break;
                case 3:
                    z = in0.i(parcel, readInt);
                    break;
                case 4:
                    str = in0.d(parcel, readInt);
                    break;
                case 5:
                    str2 = in0.d(parcel, readInt);
                    break;
                case 6:
                    str3 = in0.d(parcel, readInt);
                    break;
                case 7:
                    bundle = in0.a(parcel, readInt);
                    break;
                case '\b':
                    str4 = in0.d(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new c53(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new c53[i];
    }
}