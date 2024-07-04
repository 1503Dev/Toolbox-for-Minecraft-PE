package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;

/* renamed from: mm2  reason: default package */
public abstract class mm2 extends j22 implements nm2 {
    public mm2() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        jl2 il2Var;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        il2Var = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                        if (queryLocalInterface instanceof jl2) {
                            il2Var = (jl2) queryLocalInterface;
                        } else {
                            il2Var = new il2(readStrongBinder);
                        }
                    }
                    k22.b(parcel);
                    i24 i24Var = (i24) this;
                    i24Var.Q.d = il2Var;
                    ((w24) i24Var.P.c).K();
                } else {
                    k22.b(parcel);
                    ((i24) this).p((tz3) k22.a(parcel, tz3.CREATOR));
                }
            } else {
                String readString = parcel.readString();
                k22.b(parcel);
                ((w24) ((i24) this).P.c).x1(0, readString);
            }
        } else {
            hw b = uv0.b(parcel, parcel);
            i24 i24Var2 = (i24) this;
            i24Var2.Q.c = (View) va0.c0(b);
            ((w24) i24Var2.P.c).K();
        }
        parcel2.writeNoException();
        return true;
    }
}