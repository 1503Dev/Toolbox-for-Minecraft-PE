package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.k9;

/* renamed from: zp4  reason: default package */
public final class zp4 extends rw2 {
    public final int y;

    public zp4(Context context, Looper looper, k9.a aVar, k9.b bVar, int i) {
        super(context, looper, 116, aVar, bVar);
        this.y = i;
    }

    @Override // defpackage.k9, defpackage.l4.e
    public final int f() {
        return this.y;
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof eq4 ? (eq4) queryLocalInterface : new eq4(iBinder);
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.gass.START";
    }
}