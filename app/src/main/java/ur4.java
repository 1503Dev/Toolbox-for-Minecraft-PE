package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: ur4  reason: default package */
public final class ur4 extends hs4 {
    public final /* synthetic */ sr4 Q;
    public final /* synthetic */ zw5 R;
    public final /* synthetic */ aw0 S;
    public final /* synthetic */ xr4 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur4(xr4 xr4Var, aw0 aw0Var, kr4 kr4Var, zw5 zw5Var, aw0 aw0Var2) {
        super(aw0Var);
        this.T = xr4Var;
        this.Q = kr4Var;
        this.R = zw5Var;
        this.S = aw0Var2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, es4] */
    @Override // defpackage.hs4
    public final void b() {
        try {
            xr4 xr4Var = this.T;
            ?? r1 = xr4Var.a.m;
            sr4 sr4Var = this.Q;
            String str = xr4Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", sr4Var.b());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", sr4Var.a());
            r1.k1(bundle, new wr4(this.T, this.R));
        } catch (RemoteException e) {
            xr4.c.b(e, "dismiss overlay display from: %s", this.T.b);
            this.S.a(new RuntimeException(e));
        }
    }
}