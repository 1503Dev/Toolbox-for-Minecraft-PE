package defpackage;

import android.os.Bundle;

/* renamed from: qa4  reason: default package */
public final class qa4 implements mc4 {
    public final Bundle a;

    public qa4(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = hj4.a(bundle, "device");
        a.putBundle("android_mem_info", this.a);
        bundle.putBundle("device", a);
    }
}