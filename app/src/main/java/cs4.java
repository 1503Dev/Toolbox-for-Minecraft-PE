package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cs4  reason: default package */
public final class cs4 extends i22 implements es4 {
    public cs4(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // defpackage.es4
    public final void S2(Bundle bundle, wr4 wr4Var) {
        Parcel A = A();
        k22.c(A, bundle);
        k22.e(A, wr4Var);
        b2(A, 3);
    }

    @Override // defpackage.es4
    public final void W3(String str, Bundle bundle, wr4 wr4Var) {
        Parcel A = A();
        A.writeString(str);
        k22.c(A, bundle);
        k22.e(A, wr4Var);
        b2(A, 1);
    }

    @Override // defpackage.es4
    public final void k1(Bundle bundle, wr4 wr4Var) {
        Parcel A = A();
        k22.c(A, bundle);
        k22.e(A, wr4Var);
        b2(A, 2);
    }
}