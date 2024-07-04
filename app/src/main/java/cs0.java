package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.kt;

/* renamed from: cs0  reason: default package */
public final class cs0 extends et<ai1> implements zh1 {
    public final boolean A;
    public final jd B;
    public final Bundle C;
    public final Integer D;

    public cs0(Context context, Looper looper, jd jdVar, Bundle bundle, kt.a aVar, kt.b bVar) {
        super(context, looper, 44, jdVar, aVar, bVar);
        this.A = true;
        this.B = jdVar;
        this.C = bundle;
        this.D = jdVar.h;
    }

    @Override // defpackage.k9, defpackage.l4.e
    public final int f() {
        return 12451000;
    }

    @Override // defpackage.k9, defpackage.l4.e
    public final boolean l() {
        return this.A;
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof ai1 ? (ai1) queryLocalInterface : new ai1(iBinder);
    }

    @Override // defpackage.k9
    public final Bundle t() {
        if (!this.c.getPackageName().equals(this.B.e)) {
            this.C.putString("com.google.android.gms.signin.internal.realClientPackageName", this.B.e);
        }
        return this.C;
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.signin.service.START";
    }
}