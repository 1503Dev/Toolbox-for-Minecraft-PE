package defpackage;

import android.os.Bundle;

/* renamed from: ba4  reason: default package */
public final class ba4 implements mc4 {
    public final /* synthetic */ int a;
    public final Bundle b;

    public /* synthetic */ ba4(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.a) {
            case 0:
                ((Bundle) obj).putBundle("content_info", this.b);
                return;
            default:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = this.b;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                    return;
                }
                return;
        }
    }
}