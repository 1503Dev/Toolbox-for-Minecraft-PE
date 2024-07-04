package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import defpackage.k9;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: gp4  reason: default package */
public final class gp4 implements k9.a, k9.b {
    public final zp4 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public gp4(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        zp4 zp4Var = new zp4(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = zp4Var;
        this.d = new LinkedBlockingQueue();
        zp4Var.n();
    }

    public static ey1 a() {
        gx1 X = ey1.X();
        X.j();
        ey1.I0((ey1) X.Q, 32768L);
        return (ey1) X.h();
    }

    @Override // defpackage.k9.a
    public final void A(int i) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.k9.b
    public final void Z(gf gfVar) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    public final void b() {
        zp4 zp4Var = this.a;
        if (zp4Var != null) {
            if (zp4Var.a() || this.a.g()) {
                this.a.p();
            }
        }
    }

    @Override // defpackage.k9.a
    public final void c0() {
        eq4 eq4Var;
        try {
            eq4Var = (eq4) this.a.v();
        } catch (DeadObjectException | IllegalStateException unused) {
            eq4Var = null;
        }
        if (eq4Var != null) {
            try {
                try {
                    aq4 aq4Var = new aq4(this.b, this.c, 1);
                    Parcel A = eq4Var.A();
                    k22.c(A, aq4Var);
                    Parcel Z = eq4Var.Z(A, 1);
                    cq4 cq4Var = (cq4) k22.a(Z, cq4.CREATOR);
                    Z.recycle();
                    if (cq4Var.Q == null) {
                        try {
                            cq4Var.Q = ey1.t0(cq4Var.R, ud5.c);
                            cq4Var.R = null;
                        } catch (NullPointerException | te5 e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    cq4Var.c();
                    this.d.put(cq4Var.Q);
                } catch (Throwable unused2) {
                    this.d.put(a());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                b();
                this.e.quit();
                throw th;
            }
            b();
            this.e.quit();
        }
    }
}