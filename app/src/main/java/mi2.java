package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: mi2  reason: default package */
public final class mi2 extends i22 implements ni2 {
    public mi2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // defpackage.ni2
    public final void F1(ji2 ji2Var) {
        Parcel A = A();
        k22.e(A, ji2Var);
        c0(A, 1);
    }

    @Override // defpackage.ni2
    public final void p(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 3);
    }

    @Override // defpackage.ni2
    public final void y(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 2);
    }
}