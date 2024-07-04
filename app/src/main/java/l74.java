package defpackage;

import android.os.Bundle;

/* renamed from: l74  reason: default package */
public final class l74 implements mc4 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ l74(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (true != this.b) {
                    str = "0";
                } else {
                    str = "1";
                }
                bundle.putString("adid_p", str);
                return;
            default:
                ((Bundle) obj).putBoolean("is_gbid", this.b);
                return;
        }
    }
}