package defpackage;

import android.os.Bundle;

/* renamed from: ga4  reason: default package */
public final class ga4 implements mc4 {
    public final String a;
    public final boolean b;

    public ga4(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.a);
        if (this.b) {
            bundle.putString("de", "1");
        }
    }
}