package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: dj1  reason: default package */
public final class dj1 extends f0 {
    public static final Parcelable.Creator<dj1> CREATOR = new ej1();
    public final int P;
    public final Account Q;
    public final int R;
    public final GoogleSignInAccount S;

    public dj1(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.P = i;
        this.Q = account;
        this.R = i2;
        this.S = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.i(parcel, 2, this.Q, i);
        tv2.g(parcel, 3, this.R);
        tv2.i(parcel, 4, this.S, i);
        tv2.A(parcel, s);
    }
}