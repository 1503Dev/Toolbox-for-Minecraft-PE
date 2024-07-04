package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: ju3  reason: default package */
public final class ju3 implements zp5, h23 {
    public final Context P;
    public final xv2 Q;
    public cu3 R;
    public l13 S;
    public boolean T;
    public boolean U;
    public long V;
    public og3 W;
    public boolean X;

    public ju3(Context context, xv2 xv2Var) {
        this.P = context;
        this.Q = xv2Var;
    }

    @Override // defpackage.zp5
    public final synchronized void A(int i) {
        this.S.destroy();
        if (!this.X) {
            vz3.k("Inspector closed.");
            og3 og3Var = this.W;
            if (og3Var != null) {
                try {
                    og3Var.P3(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.U = false;
        this.T = false;
        this.V = 0L;
        this.X = false;
        this.W = null;
    }

    @Override // defpackage.zp5
    public final void Z() {
    }

    public final synchronized void a(og3 og3Var, ch2 ch2Var, bf2 bf2Var) {
        if (!f(og3Var)) {
            return;
        }
        try {
            jv5 jv5Var = jv5.A;
            k13 k13Var = jv5Var.d;
            l13 a = k13.a(this.P, new k23(0, 0, 0), "", false, false, null, null, this.Q, null, null, new j52(), null, null);
            this.S = a;
            g13 R = a.R();
            if (R == null) {
                sv2.g("Failed to obtain a web view for the ad inspector");
                try {
                    og3Var.P3(oj4.d(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            this.W = og3Var;
            R.a(null, null, null, null, null, false, null, null, null, null, null, null, null, null, ch2Var, null, new bh2(this.P), bf2Var);
            R.V = this;
            l13 l13Var = this.S;
            p92 p92Var = x92.y7;
            l13Var.P.loadUrl((String) w82.d.c.a(p92Var));
            ea2.z(this.P, new AdOverlayInfoParcel(this, this.S, this.Q), true);
            jv5Var.j.getClass();
            this.V = System.currentTimeMillis();
        } catch (j13 e) {
            sv2.h("Failed to obtain a web view for the ad inspector", e);
            try {
                og3Var.P3(oj4.d(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override // defpackage.zp5
    public final void b() {
    }

    @Override // defpackage.zp5
    public final synchronized void c() {
        this.U = true;
        e("");
    }

    @Override // defpackage.h23
    public final synchronized void d(boolean z) {
        if (z) {
            vz3.k("Ad inspector loaded.");
            this.T = true;
            e("");
            return;
        }
        sv2.g("Ad inspector failed to load.");
        try {
            og3 og3Var = this.W;
            if (og3Var != null) {
                og3Var.P3(oj4.d(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.X = true;
        this.S.destroy();
    }

    @Override // defpackage.zp5
    public final void d3() {
    }

    public final synchronized void e(String str) {
        if (this.T && this.U) {
            zw2.e.execute(new gl3(1, this, str));
        }
    }

    public final synchronized boolean f(og3 og3Var) {
        l92 l92Var = x92.x7;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            sv2.g("Ad inspector had an internal error.");
            try {
                og3Var.P3(oj4.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.R == null) {
            sv2.g("Ad inspector had an internal error.");
            try {
                og3Var.P3(oj4.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.T && !this.U) {
                jv5.A.j.getClass();
                if (System.currentTimeMillis() >= this.V + ((Integer) w82Var.c.a(x92.A7)).intValue()) {
                    return true;
                }
            }
            sv2.g("Ad inspector cannot be opened because it is already open.");
            try {
                og3Var.P3(oj4.d(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // defpackage.zp5
    public final void n3() {
    }
}