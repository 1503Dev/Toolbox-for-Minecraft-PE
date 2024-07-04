package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: fm2  reason: default package */
public final class fm2 extends i22 implements co2 {
    public fm2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // defpackage.co2
    public final void zze(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 2);
    }

    @Override // defpackage.co2
    public final boolean zzf(hw hwVar, String str, String str2) {
        Parcel A = A();
        k22.e(A, hwVar);
        A.writeString(str);
        A.writeString(str2);
        boolean z = true;
        Parcel Z = Z(A, 1);
        if (Z.readInt() == 0) {
            z = false;
        }
        Z.recycle();
        return z;
    }
}