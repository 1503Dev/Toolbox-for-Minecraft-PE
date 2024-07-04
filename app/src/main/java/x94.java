package defpackage;

import android.os.Bundle;

/* renamed from: x94  reason: default package */
public final class x94 implements mc4 {
    public final String a;
    public final String b;
    public final Bundle c;

    public /* synthetic */ x94(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.a);
        bundle.putString("fc_consent", this.b);
        bundle.putBundle("iab_consent_info", this.c);
    }
}