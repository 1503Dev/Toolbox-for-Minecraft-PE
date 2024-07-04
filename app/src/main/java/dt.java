package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.rv;

/* renamed from: dt  reason: default package */
public final class dt extends f0 {
    public static final Parcelable.Creator<dt> CREATOR = new qo5();
    public final int P;
    public final int Q;
    public int R;
    public String S;
    public IBinder T;
    public Scope[] U;
    public Bundle V;
    public Account W;
    public wp[] X;
    public wp[] Y;
    public boolean Z;
    public int a0;
    public boolean b0;
    public String c0;

    public dt(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, wp[] wpVarArr, wp[] wpVarArr2, boolean z, int i4, boolean z2, String str2) {
        this.P = i;
        this.Q = i2;
        this.R = i3;
        if ("com.google.android.gms".equals(str)) {
            this.S = "com.google.android.gms";
        } else {
            this.S = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = rv.a.P;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                rv cx5Var = queryLocalInterface instanceof rv ? (rv) queryLocalInterface : new cx5(iBinder);
                int i6 = x0.Q;
                if (cx5Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = cx5Var.c();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.W = account2;
        } else {
            this.T = iBinder;
            this.W = account;
        }
        this.U = scopeArr;
        this.V = bundle;
        this.X = wpVarArr;
        this.Y = wpVarArr2;
        this.Z = z;
        this.a0 = i4;
        this.b0 = z2;
        this.c0 = str2;
    }

    public dt(int i, String str) {
        this.P = 6;
        this.R = jt.a;
        this.Q = i;
        this.Z = true;
        this.c0 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qo5.a(this, parcel, i);
    }
}