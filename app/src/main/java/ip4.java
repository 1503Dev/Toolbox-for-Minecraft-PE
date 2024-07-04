package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: ip4  reason: default package */
public final class ip4 {
    public final Context a;
    public final Looper b;

    public ip4(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        sp4 w = up4.w();
        String packageName = this.a.getPackageName();
        w.j();
        up4.y((up4) w.Q, packageName);
        w.j();
        up4.A((up4) w.Q);
        qp4 w2 = rp4.w();
        w2.j();
        rp4.y((rp4) w2.Q, str);
        w2.j();
        rp4.z((rp4) w2.Q);
        w.j();
        up4.z((up4) w.Q, (rp4) w2.h());
        jp4 jp4Var = new jp4(this.a, this.b, (up4) w.h());
        synchronized (jp4Var.c) {
            if (!jp4Var.d) {
                jp4Var.d = true;
                jp4Var.a.n();
            }
        }
    }
}