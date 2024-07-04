package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: tp2  reason: default package */
public final class tp2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        ApplicationInfo applicationInfo = null;
        String str = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    applicationInfo = (ApplicationInfo) in0.c(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    str = in0.d(parcel, readInt);
                    break;
                case 3:
                    packageInfo = (PackageInfo) in0.c(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 4:
                    str2 = in0.d(parcel, readInt);
                    break;
                case 5:
                    i = in0.k(parcel, readInt);
                    break;
                case 6:
                    str3 = in0.d(parcel, readInt);
                    break;
                case 7:
                    arrayList = in0.f(parcel, readInt);
                    break;
                case '\b':
                    z = in0.i(parcel, readInt);
                    break;
                case '\t':
                    z2 = in0.i(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new sp2(applicationInfo, str, packageInfo, str2, i, str3, arrayList, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sp2[i];
    }
}