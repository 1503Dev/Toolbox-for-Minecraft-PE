package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: if3  reason: default package */
public final class if3 extends i22 implements og3 {
    public if3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // defpackage.og3
    public final void P3(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 1);
    }
}