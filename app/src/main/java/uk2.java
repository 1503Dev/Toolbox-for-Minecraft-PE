package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: uk2  reason: default package */
public final class uk2 extends i22 implements wk2 {
    public uk2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // defpackage.wk2
    public final boolean D(String str) {
        boolean z;
        Parcel A = A();
        A.writeString(str);
        Parcel Z = Z(A, 2);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.wk2
    public final zm2 H(String str) {
        zm2 xm2Var;
        Parcel A = A();
        A.writeString(str);
        Parcel Z = Z(A, 3);
        IBinder readStrongBinder = Z.readStrongBinder();
        int i = ym2.P;
        if (readStrongBinder == null) {
            xm2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            if (queryLocalInterface instanceof zm2) {
                xm2Var = (zm2) queryLocalInterface;
            } else {
                xm2Var = new xm2(readStrongBinder);
            }
        }
        Z.recycle();
        return xm2Var;
    }

    @Override // defpackage.wk2
    public final boolean P(String str) {
        boolean z;
        Parcel A = A();
        A.writeString(str);
        Parcel Z = Z(A, 4);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.wk2
    public final zk2 z(String str) {
        zk2 xk2Var;
        Parcel A = A();
        A.writeString(str);
        Parcel Z = Z(A, 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            xk2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            xk2Var = queryLocalInterface instanceof zk2 ? (zk2) queryLocalInterface : new xk2(readStrongBinder);
        }
        Z.recycle();
        return xk2Var;
    }
}