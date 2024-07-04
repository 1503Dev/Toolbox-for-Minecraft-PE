package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ud2  reason: default package */
public final class ud2 extends i22 implements vd2 {
    public ud2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // defpackage.vd2
    public final void j2(nd2 nd2Var) {
        Parcel A = A();
        k22.e(A, nd2Var);
        c0(A, 1);
    }
}