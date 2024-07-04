package defpackage;

import android.os.Parcel;
import defpackage.hw;

/* renamed from: sq4  reason: default package */
public abstract class sq4 extends j22 implements tq4 {
    public sq4() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                hw.a.Z(parcel.readStrongBinder());
                parcel.readString();
                k22.b(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                k22.b(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                k22.b(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                k22.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                hw.a.Z(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                k22.b(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}