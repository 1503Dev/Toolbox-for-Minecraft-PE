package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: fp5  reason: default package */
public final class fp5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        tw2 tw2Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        xv2 xv2Var = null;
        String str4 = null;
        tl5 tl5Var = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    tw2Var = (tw2) in0.c(parcel, readInt, tw2.CREATOR);
                    break;
                case 3:
                    iBinder = in0.j(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = in0.j(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = in0.j(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = in0.j(parcel, readInt);
                    break;
                case 7:
                    str = in0.d(parcel, readInt);
                    break;
                case '\b':
                    z = in0.i(parcel, readInt);
                    break;
                case '\t':
                    str2 = in0.d(parcel, readInt);
                    break;
                case '\n':
                    iBinder5 = in0.j(parcel, readInt);
                    break;
                case 11:
                    i = in0.k(parcel, readInt);
                    break;
                case '\f':
                    i2 = in0.k(parcel, readInt);
                    break;
                case '\r':
                    str3 = in0.d(parcel, readInt);
                    break;
                case 14:
                    xv2Var = (xv2) in0.c(parcel, readInt, xv2.CREATOR);
                    break;
                case 15:
                default:
                    in0.n(parcel, readInt);
                    break;
                case 16:
                    str4 = in0.d(parcel, readInt);
                    break;
                case 17:
                    tl5Var = (tl5) in0.c(parcel, readInt, tl5.CREATOR);
                    break;
                case 18:
                    iBinder6 = in0.j(parcel, readInt);
                    break;
                case 19:
                    str5 = in0.d(parcel, readInt);
                    break;
                case 20:
                    iBinder7 = in0.j(parcel, readInt);
                    break;
                case 21:
                    iBinder8 = in0.j(parcel, readInt);
                    break;
                case 22:
                    iBinder9 = in0.j(parcel, readInt);
                    break;
                case 23:
                    iBinder10 = in0.j(parcel, readInt);
                    break;
                case 24:
                    str6 = in0.d(parcel, readInt);
                    break;
                case 25:
                    str7 = in0.d(parcel, readInt);
                    break;
                case 26:
                    iBinder11 = in0.j(parcel, readInt);
                    break;
                case 27:
                    iBinder12 = in0.j(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new AdOverlayInfoParcel(tw2Var, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, xv2Var, str4, tl5Var, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}