package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.hw;
import java.util.List;

/* renamed from: t63  reason: default package */
public abstract class t63 extends j22 implements q73 {
    public t63() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        di2 di2Var = null;
        og3 og3Var = null;
        boolean z = false;
        switch (i) {
            case 1:
                l();
                parcel2.writeNoException();
                break;
            case 2:
                float readFloat = parcel.readFloat();
                k22.b(parcel);
                I0(readFloat);
                parcel2.writeNoException();
                break;
            case 3:
                String readString = parcel.readString();
                k22.b(parcel);
                x2(readString);
                parcel2.writeNoException();
                break;
            case 4:
                ClassLoader classLoader = k22.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                k22.b(parcel);
                o4(z);
                parcel2.writeNoException();
                break;
            case 5:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                k22.b(parcel);
                Z3(Z, readString2);
                parcel2.writeNoException();
                break;
            case 6:
                String readString3 = parcel.readString();
                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                f2(Z2, readString3);
                parcel2.writeNoException();
                break;
            case 7:
                float b = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                break;
            case 8:
                boolean r = r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = k22.a;
                parcel2.writeInt(r ? 1 : 0);
                break;
            case 9:
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 10:
                String readString4 = parcel.readString();
                k22.b(parcel);
                W(readString4);
                parcel2.writeNoException();
                break;
            case 11:
                wk2 t4 = vk2.t4(parcel.readStrongBinder());
                k22.b(parcel);
                i2(t4);
                parcel2.writeNoException();
                break;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    if (queryLocalInterface instanceof di2) {
                        di2Var = (di2) queryLocalInterface;
                    } else {
                        di2Var = new bi2(readStrongBinder);
                    }
                }
                k22.b(parcel);
                Q1(di2Var);
                parcel2.writeNoException();
                break;
            case 13:
                List h = h();
                parcel2.writeNoException();
                parcel2.writeTypedList(h);
                break;
            case 14:
                k22.b(parcel);
                I2((mm4) k22.a(parcel, mm4.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                g();
                parcel2.writeNoException();
                break;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (queryLocalInterface2 instanceof og3) {
                        og3Var = (og3) queryLocalInterface2;
                    } else {
                        og3Var = new if3(readStrongBinder2);
                    }
                }
                k22.b(parcel);
                n1(og3Var);
                parcel2.writeNoException();
                break;
            case 17:
                ClassLoader classLoader3 = k22.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                k22.b(parcel);
                h0(z);
                parcel2.writeNoException();
                break;
            case 18:
                String readString5 = parcel.readString();
                k22.b(parcel);
                O0(readString5);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}