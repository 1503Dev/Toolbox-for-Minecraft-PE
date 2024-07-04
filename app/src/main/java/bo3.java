package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bo3  reason: default package */
public final class bo3 extends i22 {
    public bo3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final gn3 d3(va0 va0Var, wk2 wk2Var) {
        gn3 rl3Var;
        Parcel A = A();
        k22.e(A, va0Var);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            rl3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            rl3Var = queryLocalInterface instanceof gn3 ? (gn3) queryLocalInterface : new rl3(readStrongBinder);
        }
        Z.recycle();
        return rl3Var;
    }
}