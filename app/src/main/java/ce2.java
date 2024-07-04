package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ce2  reason: default package */
public abstract class ce2 extends j22 implements de2 {
    public ce2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        sd2 qd2Var;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                qd2Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                qd2Var = queryLocalInterface instanceof sd2 ? (sd2) queryLocalInterface : new qd2(readStrongBinder);
            }
            k22.b(parcel);
            ((ye2) this).y1(qd2Var);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}