package defpackage;

import android.os.Bundle;

/* renamed from: h94  reason: default package */
public final class h94 implements mc4 {
    public final double a;
    public final boolean b;

    public h94(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = hj4.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = hj4.a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.b);
        a2.putDouble("battery_level", this.a);
    }
}