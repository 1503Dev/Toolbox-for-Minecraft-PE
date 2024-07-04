package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: cu2  reason: default package */
public abstract class cu2 extends j22 implements du2 {
    public cu2() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            k22.b(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            k22.b(parcel);
            ((cp2) this).z(readString);
        } else if (i != 3) {
            return false;
        } else {
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            k22.b(parcel);
            ((cp2) this).i1((Bundle) k22.a(parcel, Bundle.CREATOR), readString2, readString3);
        }
        parcel2.writeNoException();
        return true;
    }
}