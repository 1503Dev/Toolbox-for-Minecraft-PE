package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;

/* renamed from: u42  reason: default package */
public final class u42 {
    public ScheduledFuture a = null;
    public final zw1 b = new zw1(1, this);
    public final Object c = new Object();
    public x42 d;
    public Context e;
    public a52 f;

    public static /* bridge */ /* synthetic */ void b(u42 u42Var) {
        synchronized (u42Var.c) {
            x42 x42Var = u42Var.d;
            if (x42Var == null) {
                return;
            }
            if (x42Var.a() || u42Var.d.g()) {
                u42Var.d.p();
            }
            u42Var.d = null;
            u42Var.f = null;
            Binder.flushPendingCommands();
        }
    }

    public final v42 a(y42 y42Var) {
        synchronized (this.c) {
            if (this.f == null) {
                return new v42();
            }
            try {
                if (this.d.B()) {
                    a52 a52Var = this.f;
                    Parcel A = a52Var.A();
                    k22.c(A, y42Var);
                    Parcel Z = a52Var.Z(A, 2);
                    v42 v42Var = (v42) k22.a(Z, v42.CREATOR);
                    Z.recycle();
                    return v42Var;
                }
                a52 a52Var2 = this.f;
                Parcel A2 = a52Var2.A();
                k22.c(A2, y42Var);
                Parcel Z2 = a52Var2.Z(A2, 1);
                v42 v42Var2 = (v42) k22.a(Z2, v42.CREATOR);
                Z2.recycle();
                return v42Var2;
            } catch (RemoteException e) {
                sv2.e("Unable to call into cache service.", e);
                return new v42();
            }
        }
    }

    public final void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.c) {
            if (this.e != null) {
                return;
            }
            this.e = context.getApplicationContext();
            l92 l92Var = x92.v3;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                d();
            } else {
                if (((Boolean) w82Var.c.a(x92.u3)).booleanValue()) {
                    jv5.A.f.b(new o42(this));
                }
            }
        }
    }

    public final void d() {
        x42 x42Var;
        synchronized (this.c) {
            try {
                if (this.e != null && this.d == null) {
                    p42 p42Var = new p42(this);
                    q42 q42Var = new q42(this);
                    synchronized (this) {
                        x42Var = new x42(this.e, jv5.A.r.a(), p42Var, q42Var);
                    }
                    this.d = x42Var;
                    x42Var.n();
                }
            } finally {
            }
        }
    }
}