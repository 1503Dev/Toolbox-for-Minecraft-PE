package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ex5  reason: default package */
public final class ex5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        tz3 tz3Var = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = in0.d(parcel, readInt);
                    break;
                case 2:
                    j = in0.l(parcel, readInt);
                    break;
                case 3:
                    tz3Var = (tz3) in0.c(parcel, readInt, tz3.CREATOR);
                    break;
                case 4:
                    bundle = in0.a(parcel, readInt);
                    break;
                case 5:
                    str2 = in0.d(parcel, readInt);
                    break;
                case 6:
                    str3 = in0.d(parcel, readInt);
                    break;
                case 7:
                    str4 = in0.d(parcel, readInt);
                    break;
                case '\b':
                    str5 = in0.d(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new fw5(str, j, tz3Var, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new fw5[i];
    }
}