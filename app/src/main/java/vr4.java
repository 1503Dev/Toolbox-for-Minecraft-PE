package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: vr4  reason: default package */
public final class vr4 extends hs4 {
    public final /* synthetic */ as4 Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ zw5 S;
    public final /* synthetic */ aw0 T;
    public final /* synthetic */ xr4 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr4(xr4 xr4Var, aw0 aw0Var, rr4 rr4Var, int i, zw5 zw5Var, aw0 aw0Var2) {
        super(aw0Var);
        this.U = xr4Var;
        this.Q = rr4Var;
        this.R = i;
        this.S = zw5Var;
        this.T = aw0Var2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, es4] */
    @Override // defpackage.hs4
    public final void b() {
        try {
            xr4 xr4Var = this.U;
            ?? r1 = xr4Var.a.m;
            as4 as4Var = this.Q;
            String str = xr4Var.b;
            int i = this.R;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", as4Var.b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", as4Var.a());
            r1.S2(bundle, new wr4(this.U, this.S));
        } catch (RemoteException e) {
            xr4.c.b(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.R), this.U.b);
            this.T.a(new RuntimeException(e));
        }
    }
}