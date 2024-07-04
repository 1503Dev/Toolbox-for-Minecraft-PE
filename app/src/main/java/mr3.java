package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: mr3  reason: default package */
public abstract class mr3 extends j22 implements cs3 {
    public mr3() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static cs3 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof cs3 ? (cs3) queryLocalInterface : new dr3(iBinder);
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        float h;
        iu3 ts3Var;
        int i2;
        boolean z;
        boolean z2 = false;
        switch (i) {
            case 1:
                n();
                parcel2.writeNoException();
                break;
            case 2:
                l();
                parcel2.writeNoException();
                break;
            case 3:
                ClassLoader classLoader = k22.a;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                k22.b(parcel);
                h0(z2);
                parcel2.writeNoException();
                break;
            case 4:
                z = q();
                parcel2.writeNoException();
                ClassLoader classLoader2 = k22.a;
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 5:
                int f = f();
                parcel2.writeNoException();
                i2 = f;
                parcel2.writeInt(i2);
                break;
            case 6:
                h = h();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                break;
            case 7:
                h = e();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ts3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof iu3) {
                        ts3Var = (iu3) queryLocalInterface;
                    } else {
                        ts3Var = new ts3(readStrongBinder);
                    }
                }
                k22.b(parcel);
                m3(ts3Var);
                parcel2.writeNoException();
                break;
            case 9:
                h = b();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                break;
            case 10:
                z = m();
                parcel2.writeNoException();
                ClassLoader classLoader22 = k22.a;
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 11:
                iu3 g = g();
                parcel2.writeNoException();
                k22.e(parcel2, g);
                break;
            case 12:
                z = t();
                parcel2.writeNoException();
                ClassLoader classLoader222 = k22.a;
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 13:
                k();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}