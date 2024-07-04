package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: u14  reason: default package */
public final class u14 implements wj3 {
    public final xv2 P;
    public final dz4 Q;
    public final yh4 R;
    public final y03 S;
    public final li4 T;
    public final og2 U;
    public final boolean V;

    public u14(xv2 xv2Var, bx2 bx2Var, yh4 yh4Var, l13 l13Var, li4 li4Var, boolean z, og2 og2Var) {
        this.P = xv2Var;
        this.Q = bx2Var;
        this.R = yh4Var;
        this.S = l13Var;
        this.T = li4Var;
        this.V = z;
        this.U = og2Var;
    }

    @Override // defpackage.wj3
    public final void c(boolean z, Context context, wd3 wd3Var) {
        boolean z2;
        boolean z3;
        float f;
        int i;
        float f2;
        w73 w73Var = (w73) zw4.I(this.Q);
        this.S.w0(true);
        if (this.V) {
            z2 = this.U.a(true);
        } else {
            z2 = true;
        }
        boolean z4 = this.V;
        if (z4) {
            og2 og2Var = this.U;
            synchronized (og2Var) {
                z3 = og2Var.b;
            }
        } else {
            z3 = false;
        }
        if (z4) {
            og2 og2Var2 = this.U;
            synchronized (og2Var2) {
                f2 = og2Var2.c;
            }
            f = f2;
        } else {
            f = 0.0f;
        }
        tl5 tl5Var = new tl5(z2, true, z3, f, z, this.R.O, false);
        if (wd3Var != null) {
            wd3Var.e();
        }
        ea2 ea2Var = jv5.A.b;
        qj3 q = w73Var.q();
        y03 y03Var = this.S;
        int i2 = this.R.Q;
        if (i2 == -1) {
            by5 by5Var = this.T.j;
            if (by5Var != null) {
                int i3 = by5Var.P;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                xv2 xv2Var = this.P;
                yh4 yh4Var = this.R;
                String str = yh4Var.B;
                ei4 ei4Var = yh4Var.s;
                ea2.z(context, new AdOverlayInfoParcel(q, y03Var, i, xv2Var, str, tl5Var, ei4Var.b, ei4Var.a, this.T.f, wd3Var), true);
            }
            sv2.b("Error setting app open orientation; no targeting orientation available.");
            i2 = this.R.Q;
        }
        i = i2;
        xv2 xv2Var2 = this.P;
        yh4 yh4Var2 = this.R;
        String str2 = yh4Var2.B;
        ei4 ei4Var2 = yh4Var2.s;
        ea2.z(context, new AdOverlayInfoParcel(q, y03Var, i, xv2Var2, str2, tl5Var, ei4Var2.b, ei4Var2.a, this.T.f, wd3Var), true);
    }
}