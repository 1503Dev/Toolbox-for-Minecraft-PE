package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: n84  reason: default package */
public final class n84 extends j22 implements de3 {
    public final String P;
    public final String Q;

    public n84(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.P = str;
        this.Q = str2;
    }

    public static de3 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof de3 ? (de3) queryLocalInterface : new nc3(iBinder);
    }

    @Override // defpackage.de3
    public final String b() {
        return this.P;
    }

    @Override // defpackage.de3
    public final String e() {
        return this.Q;
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        String str;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            str = this.Q;
        } else {
            str = this.P;
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}