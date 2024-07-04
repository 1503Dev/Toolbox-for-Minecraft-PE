package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: yf3  reason: default package */
public final class yf3 extends et<j25> {
    public yf3(Context context, Looper looper, jd jdVar, ff ffVar, zb0 zb0Var) {
        super(context, looper, 300, jdVar, ffVar, zb0Var);
    }

    @Override // defpackage.k9, defpackage.l4.e
    public final int f() {
        return 212800000;
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof j25 ? (j25) queryLocalInterface : new j25(iBinder);
    }

    @Override // defpackage.k9
    public final wp[] r() {
        return xz3.b;
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // defpackage.k9
    public final boolean y() {
        return true;
    }
}