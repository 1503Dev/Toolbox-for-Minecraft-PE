package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: b34  reason: default package */
public final class b34 implements wj3 {
    public final Context P;
    public final xv2 Q;
    public final dz4 R;
    public final yh4 S;
    public final y03 T;
    public final li4 U;
    public final og2 V;
    public final boolean W;

    public b34(Context context, xv2 xv2Var, bx2 bx2Var, yh4 yh4Var, l13 l13Var, li4 li4Var, boolean z, og2 og2Var) {
        this.P = context;
        this.Q = xv2Var;
        this.R = bx2Var;
        this.S = yh4Var;
        this.T = l13Var;
        this.U = li4Var;
        this.V = og2Var;
        this.W = z;
    }

    @Override // defpackage.wj3
    public final void c(boolean z, Context context, wd3 wd3Var) {
        boolean z2;
        boolean z3;
        float f;
        float f2;
        ej3 ej3Var = (ej3) zw4.I(this.R);
        this.T.w0(true);
        if (this.W) {
            z2 = this.V.a(false);
        } else {
            z2 = false;
        }
        cu5 cu5Var = jv5.A.c;
        boolean c = cu5.c(this.P);
        boolean z4 = this.W;
        if (z4) {
            og2 og2Var = this.V;
            synchronized (og2Var) {
                z3 = og2Var.b;
            }
        } else {
            z3 = false;
        }
        if (z4) {
            og2 og2Var2 = this.V;
            synchronized (og2Var2) {
                f2 = og2Var2.c;
            }
            f = f2;
        } else {
            f = 0.0f;
        }
        tl5 tl5Var = new tl5(z2, c, z3, f, z, this.S.O, false);
        if (wd3Var != null) {
            wd3Var.e();
        }
        qj3 q = ej3Var.q();
        y03 y03Var = this.T;
        yh4 yh4Var = this.S;
        int i = yh4Var.Q;
        xv2 xv2Var = this.Q;
        String str = yh4Var.B;
        ei4 ei4Var = yh4Var.s;
        ea2.z(context, new AdOverlayInfoParcel(q, y03Var, i, xv2Var, str, tl5Var, ei4Var.b, ei4Var.a, this.U.f, wd3Var), true);
    }
}