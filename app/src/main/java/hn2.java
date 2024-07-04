package defpackage;

import android.os.Parcel;
import defpackage.hw;

/* renamed from: hn2  reason: default package */
public abstract class hn2 extends j22 implements co2 {
    public hn2() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            hw Z = hw.a.Z(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            k22.b(parcel);
            boolean zzf = zzf(Z, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i != 2) {
            return false;
        } else {
            hw Z2 = hw.a.Z(parcel.readStrongBinder());
            k22.b(parcel);
            zze(Z2);
            parcel2.writeNoException();
        }
        return true;
    }
}