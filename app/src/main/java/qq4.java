package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: qq4  reason: default package */
public final class qq4 {
    public final tq4 a;
    public final boolean b = true;

    public qq4(tq4 tq4Var) {
        this.a = tq4Var;
    }

    public static qq4 a(Context context, String str) {
        try {
            try {
                try {
                    IBinder b = DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    tq4 tq4Var = null;
                    if (b != null) {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof tq4) {
                            tq4Var = (tq4) queryLocalInterface;
                        } else {
                            tq4Var = new rq4(b);
                        }
                    }
                    tq4Var.r1(new va0(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new qq4(tq4Var);
                } catch (Exception e) {
                    throw new wp4(e);
                }
            } catch (Exception e2) {
                throw new wp4(e2);
            }
        } catch (RemoteException | NullPointerException | SecurityException | wp4 unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new qq4(new uq4());
        }
    }
}