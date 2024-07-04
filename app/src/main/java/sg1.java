package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: sg1  reason: default package */
public final class sg1 implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = in0.k(parcel, readInt);
                    break;
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
                    uri = (Uri) in0.c(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = in0.d(parcel, readInt);
                    break;
                case '\b':
                    j = in0.l(parcel, readInt);
                    break;
                case '\t':
                    str6 = in0.d(parcel, readInt);
                    break;
                case '\n':
                    Parcelable.Creator<Scope> creator = Scope.CREATOR;
                    int m = in0.m(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (m == 0) {
                        arrayList = null;
                        break;
                    } else {
                        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                        parcel.setDataPosition(dataPosition + m);
                        arrayList = createTypedArrayList;
                        break;
                    }
                case 11:
                    str7 = in0.d(parcel, readInt);
                    break;
                case '\f':
                    str8 = in0.d(parcel, readInt);
                    break;
                default:
                    in0.n(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}