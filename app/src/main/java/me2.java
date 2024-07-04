package defpackage;

import android.os.Parcel;

/* renamed from: me2  reason: default package */
public abstract class me2 extends j22 implements gf2 {
    public me2() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                i();
                break;
            case 2:
                int readInt = parcel.readInt();
                k22.b(parcel);
                y(readInt);
                break;
            case 3:
                break;
            case 4:
                g();
                break;
            case 5:
                j();
                break;
            case 6:
                d();
                break;
            case 7:
                h();
                break;
            case 8:
                k22.b(parcel);
                p((tz3) k22.a(parcel, tz3.CREATOR));
                break;
            case 9:
                l();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}