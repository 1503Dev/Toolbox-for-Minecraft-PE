package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: zk1  reason: default package */
public abstract class zk1 extends l82 {
    public zk1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r7.P >= r5.P) goto L19;
     */
    @Override // defpackage.l82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(int i, Parcel parcel, Parcel parcel2) {
        gm0 gm0Var;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                ql5 ql5Var = (ql5) lw2.a(parcel, ql5.CREATOR);
                hg3 hg3Var = (hg3) this;
                k9 k9Var = hg3Var.P;
                uf0.g(k9Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                uf0.f(ql5Var);
                k9Var.v = ql5Var;
                if (k9Var instanceof yf3) {
                    kf kfVar = ql5Var.S;
                    fm0 a = fm0.a();
                    if (kfVar == null) {
                        gm0Var = null;
                    } else {
                        gm0Var = kfVar.P;
                    }
                    synchronized (a) {
                        if (gm0Var == null) {
                            gm0Var = fm0.c;
                        } else {
                            gm0 gm0Var2 = a.a;
                            if (gm0Var2 != null) {
                            }
                        }
                        a.a = gm0Var;
                    }
                }
                Bundle bundle = ql5Var.P;
                uf0.g(hg3Var.P, "onPostInitComplete can be called only once per call to getRemoteService");
                k9 k9Var2 = hg3Var.P;
                int i2 = hg3Var.Q;
                h82 h82Var = k9Var2.f;
                h82Var.sendMessage(h82Var.obtainMessage(1, i2, -1, new zi4(k9Var2, readInt, readStrongBinder, bundle)));
                hg3Var.P = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) lw2.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            hg3 hg3Var2 = (hg3) this;
            uf0.g(hg3Var2.P, "onPostInitComplete can be called only once per call to getRemoteService");
            k9 k9Var3 = hg3Var2.P;
            int i3 = hg3Var2.Q;
            h82 h82Var2 = k9Var3.f;
            h82Var2.sendMessage(h82Var2.obtainMessage(1, i3, -1, new zi4(k9Var3, parcel.readInt(), parcel.readStrongBinder(), (Bundle) lw2.a(parcel, Bundle.CREATOR))));
            hg3Var2.P = null;
        }
        parcel2.writeNoException();
        return true;
    }
}