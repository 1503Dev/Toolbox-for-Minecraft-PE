package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: j25  reason: default package */
public final class j25 implements IInterface {
    public final IBinder P;
    public final String Q = "com.google.android.gms.appset.internal.IAppSetService";

    public j25(IBinder iBinder) {
        this.P = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.P;
    }
}