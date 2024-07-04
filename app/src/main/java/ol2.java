package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.hw;
import java.util.List;

/* renamed from: ol2  reason: default package */
public abstract class ol2 extends j22 implements pl2 {
    public ol2() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        String str;
        IInterface n;
        int i2;
        switch (i) {
            case 2:
                str = ((dm2) this).P.a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List r = ((dm2) this).r();
                parcel2.writeNoException();
                parcel2.writeList(r);
                return true;
            case 4:
                str = ((dm2) this).P.c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                n = ((dm2) this).n();
                parcel2.writeNoException();
                k22.e(parcel2, n);
                return true;
            case 6:
                str = ((dm2) this).P.e;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 7:
                str = ((dm2) this).P.f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                double b = ((dm2) this).b();
                parcel2.writeNoException();
                parcel2.writeDouble(b);
                return true;
            case 9:
                str = ((dm2) this).P.h;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                str = ((dm2) this).P.i;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                n = ((dm2) this).j();
                parcel2.writeNoException();
                k22.e(parcel2, n);
                return true;
            case 12:
                parcel2.writeNoException();
                n = null;
                k22.e(parcel2, n);
                return true;
            case 13:
                ((dm2) this).o();
                parcel2.writeNoException();
                n = null;
                k22.e(parcel2, n);
                return true;
            case 14:
                ((dm2) this).k();
                parcel2.writeNoException();
                n = null;
                k22.e(parcel2, n);
                return true;
            case 15:
                n = ((dm2) this).t();
                parcel2.writeNoException();
                k22.e(parcel2, n);
                return true;
            case 16:
                Bundle bundle = ((dm2) this).P.l;
                parcel2.writeNoException();
                k22.d(parcel2, bundle);
                return true;
            case 17:
                i2 = ((dm2) this).P.m;
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                parcel2.writeInt(i2);
                return true;
            case 18:
                i2 = ((dm2) this).P.n;
                parcel2.writeNoException();
                ClassLoader classLoader2 = k22.a;
                parcel2.writeInt(i2);
                return true;
            case 19:
                ((dm2) this).F();
                parcel2.writeNoException();
                return true;
            case 20:
                ((dm2) this).q3(uv0.b(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 21:
                ((dm2) this).Q0(hw.a.Z(parcel.readStrongBinder()), hw.a.Z(parcel.readStrongBinder()), uv0.b(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 22:
                ((dm2) this).L0(uv0.b(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                ((dm2) this).e();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                ((dm2) this).f();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                ((dm2) this).h();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}