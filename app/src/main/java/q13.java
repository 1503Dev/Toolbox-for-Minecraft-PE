package defpackage;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q13  reason: default package */
public final class q13 extends mr3 {
    public final gy2 P;
    public final boolean R;
    public final boolean S;
    public int T;
    public iu3 U;
    public boolean V;
    public float X;
    public float Y;
    public float Z;
    public boolean a0;
    public boolean b0;
    public ee2 c0;
    public final Object Q = new Object();
    public boolean W = true;

    public q13(gy2 gy2Var, float f, boolean z, boolean z2) {
        this.P = gy2Var;
        this.X = f;
        this.R = z;
        this.S = z2;
    }

    @Override // defpackage.cs3
    public final float b() {
        float f;
        synchronized (this.Q) {
            f = this.Z;
        }
        return f;
    }

    @Override // defpackage.cs3
    public final float e() {
        float f;
        synchronized (this.Q) {
            f = this.Y;
        }
        return f;
    }

    @Override // defpackage.cs3
    public final int f() {
        int i;
        synchronized (this.Q) {
            i = this.T;
        }
        return i;
    }

    @Override // defpackage.cs3
    public final iu3 g() {
        iu3 iu3Var;
        synchronized (this.Q) {
            iu3Var = this.U;
        }
        return iu3Var;
    }

    @Override // defpackage.cs3
    public final float h() {
        float f;
        synchronized (this.Q) {
            f = this.X;
        }
        return f;
    }

    @Override // defpackage.cs3
    public final void h0(boolean z) {
        w4(true != z ? "unmute" : "mute", null);
    }

    @Override // defpackage.cs3
    public final void k() {
        w4("stop", null);
    }

    @Override // defpackage.cs3
    public final void l() {
        w4("pause", null);
    }

    @Override // defpackage.cs3
    public final boolean m() {
        boolean z;
        synchronized (this.Q) {
            z = false;
            if (this.R && this.a0) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.cs3
    public final void m3(iu3 iu3Var) {
        synchronized (this.Q) {
            this.U = iu3Var;
        }
    }

    @Override // defpackage.cs3
    public final void n() {
        w4("play", null);
    }

    @Override // defpackage.cs3
    public final boolean q() {
        boolean z;
        synchronized (this.Q) {
            z = this.W;
        }
        return z;
    }

    @Override // defpackage.cs3
    public final boolean t() {
        boolean z;
        boolean m = m();
        synchronized (this.Q) {
            if (!m) {
                z = (this.b0 && this.S) ? true : true;
            }
            z = false;
        }
        return z;
    }

    public final void u4(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.Q) {
            z2 = true;
            if (f2 == this.X && f3 == this.Z) {
                z2 = false;
            }
            this.X = f2;
            this.Y = f;
            z3 = this.W;
            this.W = z;
            i2 = this.T;
            this.T = i;
            float f4 = this.Z;
            this.Z = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.P.x().invalidate();
            }
        }
        if (z2) {
            try {
                ee2 ee2Var = this.c0;
                if (ee2Var != null) {
                    ee2Var.c0(ee2Var.A(), 2);
                }
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
        zw2.e.execute(new p13(this, i2, i, z3, z));
    }

    public final void v4(zq4 zq4Var) {
        String str;
        String str2;
        String str3;
        boolean z = zq4Var.P;
        boolean z2 = zq4Var.Q;
        boolean z3 = zq4Var.R;
        synchronized (this.Q) {
            this.a0 = z2;
            this.b0 = z3;
        }
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        if (true != z2) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        if (true != z3) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        e7 e7Var = new e7(3);
        e7Var.put("muteStart", str);
        e7Var.put("customControlsRequested", str2);
        e7Var.put("clickToExpandRequested", str3);
        w4("initialState", Collections.unmodifiableMap(e7Var));
    }

    public final void w4(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zw2.e.execute(new sn5(1, this, hashMap));
    }
}