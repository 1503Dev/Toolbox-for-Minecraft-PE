package defpackage;

import android.os.Parcel;

/* renamed from: mj2  reason: default package */
public abstract class mj2 extends j22 implements ik2 {
    public mj2() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        String b;
        if (i != 1) {
            if (i == 2) {
                b = b();
            } else if (i == 3) {
                boolean g = g();
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                parcel2.writeInt(g ? 1 : 0);
                return true;
            } else if (i == 4) {
                b = e();
            } else if (i != 5) {
                return false;
            } else {
                int readInt = parcel.readInt();
                k22.b(parcel);
                v2((pn5) k22.a(parcel, pn5.CREATOR), readInt);
            }
            parcel2.writeNoException();
            parcel2.writeString(b);
            return true;
        }
        k22.b(parcel);
        X2((pn5) k22.a(parcel, pn5.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}