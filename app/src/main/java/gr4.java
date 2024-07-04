package defpackage;

import android.content.Context;

/* renamed from: gr4  reason: default package */
public final class gr4 extends dr4 {
    public static gr4 h;

    public gr4(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final gr4 f(Context context) {
        gr4 gr4Var;
        synchronized (gr4.class) {
            if (h == null) {
                h = new gr4(context);
            }
            gr4Var = h;
        }
        return gr4Var;
    }

    public final void g() {
        synchronized (gr4.class) {
            er4 er4Var = this.f;
            if (er4Var.b.contains(this.a)) {
                d(false);
            }
        }
    }
}