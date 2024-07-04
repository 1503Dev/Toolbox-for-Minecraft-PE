package defpackage;

import android.content.Context;

/* renamed from: hc3  reason: default package */
public final class hc3 implements ff3 {
    public final Context P;
    public final li4 Q;
    public final xv2 R;
    public final f25 S;
    public final jt3 T;
    public final rm4 U;
    public final String V;

    public hc3(Context context, li4 li4Var, xv2 xv2Var, nl5 nl5Var, jt3 jt3Var, rm4 rm4Var, String str) {
        this.P = context;
        this.Q = li4Var;
        this.R = xv2Var;
        this.S = nl5Var;
        this.T = jt3Var;
        this.U = rm4Var;
        this.V = str;
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
        String str;
        l92 l92Var = x92.m3;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            su2 f = this.S.f();
            sz3 sz3Var = jv5.A.k;
            Context context = this.P;
            xv2 xv2Var = this.R;
            String str2 = this.Q.f;
            rm4 rm4Var = this.U;
            if (f != null) {
                sz3Var.getClass();
                str = f.d;
            } else {
                str = null;
            }
            sz3Var.a(context, xv2Var, false, f, str, str2, null, rm4Var);
        }
        if (((Boolean) w82Var.c.a(x92.I4)).booleanValue()) {
            String str3 = this.V;
            if (str3 != "app_open_ad") {
                if (str3 != null && str3.equals("app_open_ad")) {
                    return;
                }
            } else {
                return;
            }
        }
        this.T.b();
    }
}