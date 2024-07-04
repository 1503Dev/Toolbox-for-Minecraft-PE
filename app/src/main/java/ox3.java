package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import defpackage.k9;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ox3  reason: default package */
public abstract class ox3 implements k9.a, k9.b {
    public final bx2 a = new bx2();
    public boolean b = false;
    public boolean c = false;
    public rp2 d;
    public Context e;
    public Looper f;
    public ScheduledExecutorService g;

    @Override // defpackage.k9.a
    public void A(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        sv2.b(format);
        this.a.c(new gw3(format));
    }

    @Override // defpackage.k9.b
    public final void Z(gf gfVar) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(gfVar.Q));
        sv2.b(format);
        this.a.c(new gw3(format));
    }

    public final synchronized void a() {
        this.c = true;
        rp2 rp2Var = this.d;
        if (rp2Var == null) {
            return;
        }
        if (rp2Var.a() || this.d.g()) {
            this.d.p();
        }
        Binder.flushPendingCommands();
    }
}