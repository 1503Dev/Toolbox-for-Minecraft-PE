package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import defpackage.k9;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: hp4  reason: default package */
public final class hp4 implements k9.a, k9.b {
    public final zp4 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;
    public final dp4 f;
    public final long g;
    public final int h;

    public hp4(Context context, int i, String str, String str2, dp4 dp4Var) {
        this.b = str;
        this.h = i;
        this.c = str2;
        this.f = dp4Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.e = handlerThread;
        handlerThread.start();
        this.g = System.currentTimeMillis();
        zp4 zp4Var = new zp4(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = zp4Var;
        this.d = new LinkedBlockingQueue();
        zp4Var.n();
    }

    @Override // defpackage.k9.a
    public final void A(int i) {
        try {
            b(4011, this.g, null);
            this.d.put(new lq4(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.k9.b
    public final void Z(gf gfVar) {
        try {
            b(4012, this.g, null);
            this.d.put(new lq4(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        zp4 zp4Var = this.a;
        if (zp4Var != null) {
            if (zp4Var.a() || this.a.g()) {
                this.a.p();
            }
        }
    }

    public final void b(int i, long j, Exception exc) {
        this.f.c(i, System.currentTimeMillis() - j, exc);
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
                jq4 jq4Var = new jq4(1, 1, this.h - 1, this.b, this.c);
                Parcel A = eq4Var.A();
                k22.c(A, jq4Var);
                Parcel Z = eq4Var.Z(A, 3);
                Z.recycle();
                b(5011, this.g, null);
                this.d.put((lq4) k22.a(Z, lq4.CREATOR));
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}