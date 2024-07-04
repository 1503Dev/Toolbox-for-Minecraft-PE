package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: xs2  reason: default package */
public final class xs2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = in0.d(parcel, readInt);
                    break;
                case 3:
                    str2 = in0.d(parcel, readInt);
                    break;
                case 4:
                    z = in0.i(parcel, readInt);
                    break;
                case 5:
                    z2 = in0.i(parcel, readInt);
                    break;
                case 6:
                    arrayList = in0.f(parcel, readInt);
                    break;
                case 7:
                    z3 = in0.i(parcel, readInt);
                    break;
                case '\b':
                    z4 = in0.i(parcel, readInt);
                    break;
                case '\t':
                    arrayList2 = in0.f(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new ws2(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ws2[i];
    }
}