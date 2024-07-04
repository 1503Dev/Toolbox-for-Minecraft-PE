package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: fs4  reason: default package */
public abstract class fs4 extends j22 {
    public fs4() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) k22.a(parcel, Bundle.CREATOR);
        k22.b(parcel);
        wr4 wr4Var = (wr4) this;
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        if (string == null) {
            string = null;
        }
        wr4Var.P.f(new qr4(i2, string));
        if (i2 == 8157) {
            xr4 xr4Var = wr4Var.Q;
            if (xr4Var.a != null) {
                xr4.c.c("unbind LMD display overlay service", new Object[0]);
                ps4 ps4Var = xr4Var.a;
                ps4Var.getClass();
                ps4Var.a().post(new ks4(ps4Var));
            }
        }
        return true;
    }
}