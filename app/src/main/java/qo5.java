package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: qo5  reason: default package */
public final class qo5 implements Parcelable.Creator<dt> {
    public static void a(dt dtVar, Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, dtVar.P);
        tv2.g(parcel, 2, dtVar.Q);
        tv2.g(parcel, 3, dtVar.R);
        tv2.k(parcel, 4, dtVar.S);
        tv2.f(parcel, 5, dtVar.T);
        tv2.o(parcel, 6, dtVar.U, i);
        tv2.b(parcel, 7, dtVar.V);
        tv2.i(parcel, 8, dtVar.W, i);
        tv2.o(parcel, 10, dtVar.X, i);
        tv2.o(parcel, 11, dtVar.Y, i);
        tv2.a(parcel, 12, dtVar.Z);
        tv2.g(parcel, 13, dtVar.a0);
        tv2.a(parcel, 14, dtVar.b0);
        tv2.k(parcel, 15, dtVar.c0);
        tv2.A(parcel, s);
    }

    @Override // android.os.Parcelable.Creator
    public final dt createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        wp[] wpVarArr = null;
        wp[] wpVarArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = in0.k(parcel, readInt);
                    break;
                case 2:
                    i2 = in0.k(parcel, readInt);
                    break;
                case 3:
                    i3 = in0.k(parcel, readInt);
                    break;
                case 4:
                    str = in0.d(parcel, readInt);
                    break;
                case 5:
                    iBinder = in0.j(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) in0.g(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = in0.a(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) in0.c(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    in0.n(parcel, readInt);
                    break;
                case '\n':
                    wpVarArr = (wp[]) in0.g(parcel, readInt, wp.CREATOR);
                    break;
                case 11:
                    wpVarArr2 = (wp[]) in0.g(parcel, readInt, wp.CREATOR);
                    break;
                case '\f':
                    z = in0.i(parcel, readInt);
                    break;
                case '\r':
                    i4 = in0.k(parcel, readInt);
                    break;
                case 14:
                    z2 = in0.i(parcel, readInt);
                    break;
                case 15:
                    str2 = in0.d(parcel, readInt);
                    break;
            }
        }
        in0.h(parcel, o);
        return new dt(i, i2, i3, str, iBinder, scopeArr, bundle, account, wpVarArr, wpVarArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ dt[] newArray(int i) {
        return new dt[i];
    }
}