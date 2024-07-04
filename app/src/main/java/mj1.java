package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: mj1  reason: default package */
public abstract class mj1 extends gw2<Boolean> {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ k9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj1(k9 k9Var, int i, Bundle bundle) {
        super(k9Var, Boolean.TRUE);
        this.f = k9Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // defpackage.gw2
    public final /* bridge */ /* synthetic */ void a() {
        gf gfVar;
        PendingIntent pendingIntent = null;
        if (this.d == 0) {
            if (!d()) {
                this.f.A(1, null);
                gfVar = new gf(8, null);
            } else {
                return;
            }
        } else {
            this.f.A(1, null);
            Bundle bundle = this.e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            gfVar = new gf(this.d, pendingIntent);
        }
        c(gfVar);
    }

    @Override // defpackage.gw2
    public final void b() {
    }

    public abstract void c(gf gfVar);

    public abstract boolean d();
}