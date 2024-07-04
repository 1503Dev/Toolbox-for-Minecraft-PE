package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: sa4  reason: default package */
public final class sa4 implements mc4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sa4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                xh4 xh4Var = (xh4) this.b;
                if (xh4Var != null) {
                    synchronized (xh4Var.b) {
                        xh4Var.a();
                        z = true;
                        if (xh4Var.d == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    bundle.putBoolean("render_in_browser", z2);
                    xh4 xh4Var2 = (xh4) this.b;
                    synchronized (xh4Var2.b) {
                        xh4Var2.a();
                        if (xh4Var2.d != 3) {
                            z = false;
                        }
                    }
                    bundle.putBoolean("disable_ml", z);
                    return;
                }
                return;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (!TextUtils.isEmpty((String) this.b)) {
                    bundle2.putString("query_info", (String) this.b);
                    return;
                }
                return;
        }
    }
}