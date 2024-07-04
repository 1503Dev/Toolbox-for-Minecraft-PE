package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: ep5  reason: default package */
public final class ep5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        bo4 bo4Var = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        sw2 sw2Var = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = in0.k(parcel, readInt);
                    break;
                case 2:
                    j = in0.l(parcel, readInt);
                    break;
                case 3:
                    bundle = in0.a(parcel, readInt);
                    break;
                case 4:
                    i2 = in0.k(parcel, readInt);
                    break;
                case 5:
                    arrayList = in0.f(parcel, readInt);
                    break;
                case 6:
                    z = in0.i(parcel, readInt);
                    break;
                case 7:
                    i3 = in0.k(parcel, readInt);
                    break;
                case '\b':
                    z2 = in0.i(parcel, readInt);
                    break;
                case '\t':
                    str = in0.d(parcel, readInt);
                    break;
                case '\n':
                    bo4Var = (bo4) in0.c(parcel, readInt, bo4.CREATOR);
                    break;
                case 11:
                    location = (Location) in0.c(parcel, readInt, Location.CREATOR);
                    break;
                case '\f':
                    str2 = in0.d(parcel, readInt);
                    break;
                case '\r':
                    bundle2 = in0.a(parcel, readInt);
                    break;
                case 14:
                    bundle3 = in0.a(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = in0.f(parcel, readInt);
                    break;
                case 16:
                    str3 = in0.d(parcel, readInt);
                    break;
                case 17:
                    str4 = in0.d(parcel, readInt);
                    break;
                case 18:
                    z3 = in0.i(parcel, readInt);
                    break;
                case 19:
                    sw2Var = (sw2) in0.c(parcel, readInt, sw2.CREATOR);
                    break;
                case 20:
                    i4 = in0.k(parcel, readInt);
                    break;
                case 21:
                    str5 = in0.d(parcel, readInt);
                    break;
                case 22:
                    arrayList3 = in0.f(parcel, readInt);
                    break;
                case 23:
                    i5 = in0.k(parcel, readInt);
                    break;
                case 24:
                    str6 = in0.d(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new pn5(i, j, bundle, i2, arrayList, z, i3, z2, str, bo4Var, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, sw2Var, i4, str5, arrayList3, i5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new pn5[i];
    }
}