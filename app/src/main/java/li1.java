package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: li1  reason: default package */
public abstract class li1 {
    public final int a;

    public li1(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(zg1<?> zg1Var);

    public abstract void d(kg1 kg1Var, boolean z);
}