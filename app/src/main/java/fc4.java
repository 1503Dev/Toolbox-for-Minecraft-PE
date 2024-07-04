package defpackage;

import android.os.Bundle;

/* renamed from: fc4  reason: default package */
public final class fc4 implements mc4 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;

    public fc4(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        p92 p92Var = x92.Y2;
        w82 w82Var = w82.d;
        bundle.putString("extra_caps", (String) w82Var.c.a(p92Var));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) w82Var.c.a(x92.S4)).booleanValue()) {
            bundle.putString("ev", "22.1.0");
        }
        Bundle a = hj4.a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) mb2.a.d()).booleanValue());
        a.putBoolean("instant_app", this.a);
        a.putBoolean("lite", this.b);
        a.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = hj4.a(a, "build_meta");
        a2.putString("cl", "525816637");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}