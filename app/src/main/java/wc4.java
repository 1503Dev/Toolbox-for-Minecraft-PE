package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: wc4  reason: default package */
public final class wc4 implements mc4 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public wc4(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        boolean z = true;
        hj4.c(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.b;
        if (i == -2) {
            z = false;
        }
        if (z) {
            bundle.putInt("cnt", i);
        }
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle a = hj4.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = hj4.a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f);
        a2.putBoolean("active_network_metered", this.e);
    }
}