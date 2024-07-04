package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: sq2  reason: default package */
public final class sq2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        Bundle bundle = null;
        xv2 xv2Var = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        bk4 bk4Var = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bundle = in0.a(parcel, readInt);
                    break;
                case 2:
                    xv2Var = (xv2) in0.c(parcel, readInt, xv2.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) in0.c(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = in0.d(parcel, readInt);
                    break;
                case 5:
                    arrayList = in0.f(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) in0.c(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = in0.d(parcel, readInt);
                    break;
                case '\b':
                default:
                    in0.n(parcel, readInt);
                    break;
                case '\t':
                    str3 = in0.d(parcel, readInt);
                    break;
                case '\n':
                    bk4Var = (bk4) in0.c(parcel, readInt, bk4.CREATOR);
                    break;
                case 11:
                    str4 = in0.d(parcel, readInt);
                    break;
                case '\f':
                    z = in0.i(parcel, readInt);
                    break;
                case '\r':
                    z2 = in0.i(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new rq2(bundle, xv2Var, applicationInfo, str, arrayList, packageInfo, str2, str3, bk4Var, str4, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rq2[i];
    }
}