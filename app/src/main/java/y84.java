package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: y84  reason: default package */
public final class y84 implements mc4 {
    public final String a;
    public final int b;

    public y84(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        Bundle a = hj4.a(bundle, "pii");
        bundle.putBundle("pii", a);
        a.putString("pvid", this.a);
        a.putInt("pvid_s", this.b);
    }
}