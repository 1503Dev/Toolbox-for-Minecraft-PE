package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cx5  reason: default package */
public final class cx5 extends pj1 implements rv {
    public cx5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // defpackage.rv
    public final Account c() {
        Parcel A = A(Z(), 2);
        Account account = (Account) lw2.a(A, Account.CREATOR);
        A.recycle();
        return account;
    }
}