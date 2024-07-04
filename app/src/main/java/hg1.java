package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: hg1  reason: default package */
public class hg1 implements IInterface {
    public final IBinder P;
    public final String Q;

    public hg1(IBinder iBinder, String str) {
        this.P = iBinder;
        this.Q = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.P;
    }
}