package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: ej1  reason: default package */
public final class ej1 implements Parcelable.Creator<dj1> {
    @Override // android.os.Parcelable.Creator
    public final dj1 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            in0.n(parcel, readInt);
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) in0.c(parcel, readInt, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        i2 = in0.k(parcel, readInt);
                    }
                } else {
                    account = (Account) in0.c(parcel, readInt, Account.CREATOR);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new dj1(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ dj1[] newArray(int i) {
        return new dj1[i];
    }
}