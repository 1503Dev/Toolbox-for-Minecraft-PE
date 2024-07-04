package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;

@SuppressLint({"RestrictedApi"})
@TargetApi(18)
/* renamed from: xr4  reason: default package */
public final class xr4 {
    public static final gs4 c = new gs4("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final ps4 a;
    public final String b;

    public xr4(Context context) {
        this.a = qs4.a(context) ? new ps4(context.getApplicationContext(), c, d) : null;
        this.b = context.getPackageName();
    }

    public final void a(rr4 rr4Var, zw5 zw5Var, int i) {
        if (this.a == null) {
            c.a("error: %s", "Play Store not found.");
            return;
        }
        aw0 aw0Var = new aw0();
        ps4 ps4Var = this.a;
        vr4 vr4Var = new vr4(this, aw0Var, rr4Var, i, zw5Var, aw0Var);
        ps4Var.getClass();
        ps4Var.a().post(new js4(ps4Var, aw0Var, aw0Var, vr4Var));
    }
}