package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q82  reason: default package */
public final class q82 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z = false;
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
                    str3 = in0.d(parcel, readInt);
                    break;
                case 5:
                    str4 = in0.d(parcel, readInt);
                    break;
                case 6:
                    str5 = in0.d(parcel, readInt);
                    break;
                case 7:
                    str6 = in0.d(parcel, readInt);
                    break;
                case '\b':
                    str7 = in0.d(parcel, readInt);
                    break;
                case '\t':
                    intent = (Intent) in0.c(parcel, readInt, Intent.CREATOR);
                    break;
                case '\n':
                    iBinder = in0.j(parcel, readInt);
                    break;
                case 11:
                    z = in0.i(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new tw2(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new tw2[i];
    }
}