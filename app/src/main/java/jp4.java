package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import defpackage.k9;

/* renamed from: jp4  reason: default package */
public final class jp4 implements k9.a, k9.b {
    public final zp4 a;
    public final up4 b;
    public final Object c = new Object();
    public boolean d = false;
    public boolean e = false;

    public jp4(Context context, Looper looper, up4 up4Var) {
        this.b = up4Var;
        this.a = new zp4(context, looper, this, this, 12800000);
    }

    @Override // defpackage.k9.a
    public final void A(int i) {
    }

    @Override // defpackage.k9.b
    public final void Z(gf gfVar) {
    }

    public final void a() {
        synchronized (this.c) {
            if (this.a.a() || this.a.g()) {
                this.a.p();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // defpackage.k9.a
    public final void c0() {
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            this.e = true;
            try {
                eq4 eq4Var = (eq4) this.a.v();
                xp4 xp4Var = new xp4(this.b.D(), 1);
                Parcel A = eq4Var.A();
                k22.c(A, xp4Var);
                eq4Var.c0(A, 2);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
            a();
        }
    }
}