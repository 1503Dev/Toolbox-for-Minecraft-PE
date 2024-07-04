package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: jw3  reason: default package */
public final class jw3 extends gu3 {
    public final /* synthetic */ Bundle T;
    public final /* synthetic */ Activity U;
    public final /* synthetic */ m24 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw3(m24 m24Var, Bundle bundle, Activity activity) {
        super(m24Var.P, true);
        this.V = m24Var;
        this.T = bundle;
        this.U = activity;
    }

    @Override // defpackage.gu3
    public final void b() {
        Bundle bundle;
        if (this.T != null) {
            bundle = new Bundle();
            if (this.T.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.T.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ky2 ky2Var = this.V.P.h;
        uf0.f(ky2Var);
        ky2Var.g3(new va0(this.U), bundle, this.Q);
    }
}