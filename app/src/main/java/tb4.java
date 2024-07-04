package defpackage;

import android.os.Bundle;

/* renamed from: tb4  reason: default package */
public final class tb4 implements mc4 {
    public final String a;
    public final Bundle b;

    public tb4(Bundle bundle, String str) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.a);
        if (this.b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.b);
    }
}