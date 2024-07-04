package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: yi1  reason: default package */
public final class yi1 extends et<ji1> {
    public final hw0 A;

    public yi1(Context context, Looper looper, jd jdVar, hw0 hw0Var, ff ffVar, zb0 zb0Var) {
        super(context, looper, 270, jdVar, ffVar, zb0Var);
        this.A = hw0Var;
    }

    @Override // defpackage.k9, defpackage.l4.e
    public final int f() {
        return 203400000;
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof ji1 ? (ji1) queryLocalInterface : new ji1(iBinder);
    }

    @Override // defpackage.k9
    public final wp[] r() {
        return vh1.b;
    }

    @Override // defpackage.k9
    public final Bundle t() {
        hw0 hw0Var = this.A;
        hw0Var.getClass();
        Bundle bundle = new Bundle();
        String str = hw0Var.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.k9
    public final boolean y() {
        return true;
    }
}