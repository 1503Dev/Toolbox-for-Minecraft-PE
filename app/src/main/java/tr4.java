package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: tr4  reason: default package */
public final class tr4 extends hs4 {
    public final /* synthetic */ yr4 Q;
    public final /* synthetic */ zw5 R;
    public final /* synthetic */ aw0 S;
    public final /* synthetic */ xr4 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr4(xr4 xr4Var, aw0 aw0Var, yr4 yr4Var, zw5 zw5Var, aw0 aw0Var2) {
        super(aw0Var);
        this.T = xr4Var;
        this.Q = yr4Var;
        this.R = zw5Var;
        this.S = aw0Var2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IInterface, es4] */
    @Override // defpackage.hs4
    public final void b() {
        try {
            xr4 xr4Var = this.T;
            ?? r2 = xr4Var.a.m;
            String str = xr4Var.b;
            yr4 yr4Var = this.Q;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", yr4Var.e());
            bundle.putString("adFieldEnifd", yr4Var.f());
            bundle.putInt("layoutGravity", yr4Var.c());
            bundle.putFloat("layoutVerticalMargin", yr4Var.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", yr4Var.d());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str);
            if (yr4Var.g() != null) {
                bundle.putString("appId", yr4Var.g());
            }
            r2.W3(str, bundle, new wr4(this.T, this.R));
        } catch (RemoteException e) {
            xr4.c.b(e, "show overlay display from: %s", this.T.b);
            this.S.a(new RuntimeException(e));
        }
    }
}