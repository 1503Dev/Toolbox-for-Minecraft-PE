package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: qp2  reason: default package */
public final class qp2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        Bundle bundle = null;
        pn5 pn5Var = null;
        zr5 zr5Var = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        xv2 xv2Var = null;
        Bundle bundle2 = null;
        int i2 = 0;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        nc2 nc2Var = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        String str9 = null;
        String str10 = null;
        boolean z4 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        bv3 bv3Var = null;
        boolean z5 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z6 = false;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        gi2 gi2Var = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = in0.k(parcel, readInt);
                    break;
                case 2:
                    bundle = in0.a(parcel, readInt);
                    break;
                case 3:
                    pn5Var = (pn5) in0.c(parcel, readInt, pn5.CREATOR);
                    break;
                case 4:
                    zr5Var = (zr5) in0.c(parcel, readInt, zr5.CREATOR);
                    break;
                case 5:
                    str = in0.d(parcel, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) in0.c(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) in0.c(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case '\b':
                    str2 = in0.d(parcel, readInt);
                    break;
                case '\t':
                    str3 = in0.d(parcel, readInt);
                    break;
                case '\n':
                    str4 = in0.d(parcel, readInt);
                    break;
                case 11:
                    xv2Var = (xv2) in0.c(parcel, readInt, xv2.CREATOR);
                    break;
                case '\f':
                    bundle2 = in0.a(parcel, readInt);
                    break;
                case '\r':
                    i2 = in0.k(parcel, readInt);
                    break;
                case 14:
                    arrayList = in0.f(parcel, readInt);
                    break;
                case 15:
                    bundle3 = in0.a(parcel, readInt);
                    break;
                case 16:
                    z = in0.i(parcel, readInt);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    in0.n(parcel, readInt);
                    break;
                case 18:
                    i3 = in0.k(parcel, readInt);
                    break;
                case 19:
                    i4 = in0.k(parcel, readInt);
                    break;
                case 20:
                    in0.p(parcel, readInt, 4);
                    f = parcel.readFloat();
                    break;
                case 21:
                    str5 = in0.d(parcel, readInt);
                    break;
                case 25:
                    j = in0.l(parcel, readInt);
                    break;
                case 26:
                    str6 = in0.d(parcel, readInt);
                    break;
                case 27:
                    arrayList2 = in0.f(parcel, readInt);
                    break;
                case 28:
                    str7 = in0.d(parcel, readInt);
                    break;
                case 29:
                    nc2Var = (nc2) in0.c(parcel, readInt, nc2.CREATOR);
                    break;
                case 30:
                    arrayList3 = in0.f(parcel, readInt);
                    break;
                case 31:
                    j2 = in0.l(parcel, readInt);
                    break;
                case '!':
                    str8 = in0.d(parcel, readInt);
                    break;
                case '\"':
                    in0.p(parcel, readInt, 4);
                    f2 = parcel.readFloat();
                    break;
                case '#':
                    i5 = in0.k(parcel, readInt);
                    break;
                case '$':
                    i6 = in0.k(parcel, readInt);
                    break;
                case '%':
                    z3 = in0.i(parcel, readInt);
                    break;
                case '\'':
                    str9 = in0.d(parcel, readInt);
                    break;
                case '(':
                    z2 = in0.i(parcel, readInt);
                    break;
                case ')':
                    str10 = in0.d(parcel, readInt);
                    break;
                case '*':
                    z4 = in0.i(parcel, readInt);
                    break;
                case '+':
                    i7 = in0.k(parcel, readInt);
                    break;
                case ',':
                    bundle4 = in0.a(parcel, readInt);
                    break;
                case '-':
                    str11 = in0.d(parcel, readInt);
                    break;
                case '.':
                    bv3Var = (bv3) in0.c(parcel, readInt, bv3.CREATOR);
                    break;
                case '/':
                    z5 = in0.i(parcel, readInt);
                    break;
                case '0':
                    bundle5 = in0.a(parcel, readInt);
                    break;
                case '1':
                    str12 = in0.d(parcel, readInt);
                    break;
                case '2':
                    str13 = in0.d(parcel, readInt);
                    break;
                case '3':
                    str14 = in0.d(parcel, readInt);
                    break;
                case '4':
                    z6 = in0.i(parcel, readInt);
                    break;
                case '5':
                    int m = in0.m(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (m == 0) {
                        arrayList4 = null;
                        break;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i9 = 0; i9 < readInt2; i9++) {
                            arrayList7.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + m);
                        arrayList4 = arrayList7;
                        break;
                    }
                case '6':
                    str15 = in0.d(parcel, readInt);
                    break;
                case '7':
                    arrayList5 = in0.f(parcel, readInt);
                    break;
                case '8':
                    i8 = in0.k(parcel, readInt);
                    break;
                case '9':
                    z7 = in0.i(parcel, readInt);
                    break;
                case ':':
                    z8 = in0.i(parcel, readInt);
                    break;
                case ';':
                    z9 = in0.i(parcel, readInt);
                    break;
                case '<':
                    arrayList6 = in0.f(parcel, readInt);
                    break;
                case '=':
                    str16 = in0.d(parcel, readInt);
                    break;
                case '?':
                    gi2Var = (gi2) in0.c(parcel, readInt, gi2.CREATOR);
                    break;
                case '@':
                    str17 = in0.d(parcel, readInt);
                    break;
                case 'A':
                    bundle6 = in0.a(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new pp2(i, bundle, pn5Var, zr5Var, str, applicationInfo, packageInfo, str2, str3, str4, xv2Var, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, nc2Var, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, bv3Var, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, gi2Var, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new pp2[i];
    }
}