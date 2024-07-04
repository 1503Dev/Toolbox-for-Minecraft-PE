package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: b54  reason: default package */
public final class b54 implements wj3 {
    public final Context P;
    public final qq3 Q;
    public final li4 R;
    public final xv2 S;
    public final yh4 T;
    public final dz4 U;
    public final y03 V;
    public final og2 W;
    public final boolean X;

    public b54(Context context, qq3 qq3Var, li4 li4Var, xv2 xv2Var, yh4 yh4Var, bx2 bx2Var, l13 l13Var, og2 og2Var, boolean z) {
        this.P = context;
        this.Q = qq3Var;
        this.R = li4Var;
        this.S = xv2Var;
        this.T = yh4Var;
        this.U = bx2Var;
        this.V = l13Var;
        this.W = og2Var;
        this.X = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Type inference failed for: r2v7, types: [y03] */
    @Override // defpackage.wj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z, Context context, wd3 wd3Var) {
        l13 l13Var;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        boolean z5;
        zp3 zp3Var = (zp3) zw4.I(this.U);
        try {
            yh4 yh4Var = this.T;
            if (this.V.k0()) {
                if (((Boolean) w82.d.c.a(x92.z0)).booleanValue()) {
                    og2 og2Var = null;
                    l13 a = this.Q.a(this.R.e, null, null);
                    a.D0("/reward", new ah2(zp3Var.p()));
                    uq3 uq3Var = new uq3();
                    uq3Var.a(this.P, a);
                    pq3 s = zp3Var.s();
                    if (this.X) {
                        og2Var = this.W;
                    }
                    s.a(a, true, og2Var);
                    a.R().V = new vi1(4, uq3Var, a);
                    a.R().W = new d60(7, a);
                    ei4 ei4Var = yh4Var.s;
                    a.X(ei4Var.b, ei4Var.a);
                    l13Var = a;
                    l13Var.w0(true);
                    if (!this.X) {
                        z2 = this.W.a(false);
                    } else {
                        z2 = false;
                    }
                    cu5 cu5Var = jv5.A.c;
                    boolean c = cu5.c(this.P);
                    z3 = this.X;
                    if (!z3) {
                        og2 og2Var2 = this.W;
                        synchronized (og2Var2) {
                            z5 = og2Var2.b;
                        }
                        z4 = z5;
                    } else {
                        z4 = false;
                    }
                    if (!z3) {
                        og2 og2Var3 = this.W;
                        synchronized (og2Var3) {
                            f2 = og2Var3.c;
                        }
                        f = f2;
                    } else {
                        f = 0.0f;
                    }
                    yh4 yh4Var2 = this.T;
                    tl5 tl5Var = new tl5(z2, c, z4, f, z, yh4Var2.O, yh4Var2.P);
                    if (wd3Var != null) {
                        wd3Var.e();
                    }
                    qj3 q = zp3Var.q();
                    yh4 yh4Var3 = this.T;
                    int i = yh4Var3.Q;
                    xv2 xv2Var = this.S;
                    String str = yh4Var3.B;
                    ei4 ei4Var2 = yh4Var3.s;
                    ea2.z(context, new AdOverlayInfoParcel(q, l13Var, i, xv2Var, str, tl5Var, ei4Var2.b, ei4Var2.a, this.R.f, wd3Var), true);
                }
            }
            l13Var = this.V;
            l13Var.w0(true);
            if (!this.X) {
            }
            cu5 cu5Var2 = jv5.A.c;
            boolean c2 = cu5.c(this.P);
            z3 = this.X;
            if (!z3) {
            }
            if (!z3) {
            }
            yh4 yh4Var22 = this.T;
            tl5 tl5Var2 = new tl5(z2, c2, z4, f, z, yh4Var22.O, yh4Var22.P);
            if (wd3Var != null) {
            }
            qj3 q2 = zp3Var.q();
            yh4 yh4Var32 = this.T;
            int i2 = yh4Var32.Q;
            xv2 xv2Var2 = this.S;
            String str2 = yh4Var32.B;
            ei4 ei4Var22 = yh4Var32.s;
            ea2.z(context, new AdOverlayInfoParcel(q2, l13Var, i2, xv2Var2, str2, tl5Var2, ei4Var22.b, ei4Var22.a, this.R.f, wd3Var), true);
        } catch (j13 e) {
            sv2.e("", e);
        }
    }
}