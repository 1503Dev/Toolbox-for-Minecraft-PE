package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: h44  reason: default package */
public final class h44 implements wy4 {
    public final /* synthetic */ long P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ yh4 R;
    public final /* synthetic */ ci4 S;
    public final /* synthetic */ bn4 T;
    public final /* synthetic */ hi4 U;
    public final /* synthetic */ i44 V;

    public h44(i44 i44Var, long j, String str, yh4 yh4Var, ci4 ci4Var, bn4 bn4Var, hi4 hi4Var) {
        this.V = i44Var;
        this.P = j;
        this.Q = str;
        this.R = yh4Var;
        this.S = ci4Var;
        this.T = bn4Var;
        this.U = hi4Var;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        long b = this.V.a.b() - this.P;
        i44.a(this.V, this.Q, 0, b, this.R.f0, null);
        i44 i44Var = this.V;
        if (i44Var.e) {
            i44Var.b.a(this.S, this.R, 0, null, b);
        }
        this.V.f.b(this.R, b, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    @Override // defpackage.wy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Throwable th) {
        int i;
        tz3 tz3Var;
        Integer valueOf;
        i44 i44Var;
        tz3 a;
        int i2;
        tz3 tz3Var2;
        i14 i14Var;
        long b = this.V.a.b() - this.P;
        if (th instanceof TimeoutException) {
            i = 2;
        } else {
            if (th instanceof u34) {
                valueOf = null;
                i = 3;
            } else if (th instanceof CancellationException) {
                i = 4;
            } else if (th instanceof ni4) {
                i = 5;
            } else {
                int i3 = 6;
                if (th instanceof vu3) {
                    if (oj4.a(th).P == 3) {
                        i3 = 1;
                    }
                    if (((Boolean) w82.d.c.a(x92.m1)).booleanValue() && (th instanceof i14) && (tz3Var = ((i14) th).Q) != null) {
                        valueOf = Integer.valueOf(tz3Var.P);
                        i = i3;
                    }
                }
                i = i3;
            }
            i44.a(this.V, this.Q, i, b, this.R.f0, valueOf);
            i44Var = this.V;
            if (i44Var.e) {
                j44 j44Var = i44Var.b;
                ci4 ci4Var = this.S;
                yh4 yh4Var = this.R;
                if (th instanceof i14) {
                    i14Var = (i14) th;
                } else {
                    i14Var = null;
                }
                j44Var.a(ci4Var, yh4Var, i, i14Var, b);
            }
            if (((Boolean) w82.d.c.a(x92.Z6)).booleanValue()) {
                gn4 gn4Var = this.V.c;
                bn4 bn4Var = this.T;
                hi4 hi4Var = this.U;
                yh4 yh4Var2 = this.R;
                gn4Var.b(bn4Var.a(hi4Var, yh4Var2, yh4Var2.n));
            }
            a = oj4.a(th);
            i2 = a.P;
            if ((i2 != 3 || i2 == 0) && (tz3Var2 = a.S) != null && !tz3Var2.R.equals("com.google.android.gms.ads")) {
                a = oj4.a(new i14(13, a.S));
            }
            this.V.f.b(this.R, b, a, false);
        }
        valueOf = null;
        i44.a(this.V, this.Q, i, b, this.R.f0, valueOf);
        i44Var = this.V;
        if (i44Var.e) {
        }
        if (((Boolean) w82.d.c.a(x92.Z6)).booleanValue()) {
        }
        a = oj4.a(th);
        i2 = a.P;
        if (i2 != 3) {
        }
        a = oj4.a(new i14(13, a.S));
        this.V.f.b(this.R, b, a, false);
    }
}