package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: it2  reason: default package */
public final class it2 implements s22 {
    public final Context P;
    public final Object Q;
    public final String R;
    public boolean S;

    public it2(Context context, String str) {
        this.P = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.R = str;
        this.S = false;
        this.Q = new Object();
    }

    public final void a(boolean z) {
        jv5 jv5Var = jv5.A;
        if (!jv5Var.w.j(this.P)) {
            return;
        }
        synchronized (this.Q) {
            try {
                if (this.S == z) {
                    return;
                }
                this.S = z;
                if (TextUtils.isEmpty(this.R)) {
                    return;
                }
                if (this.S) {
                    qt2 qt2Var = jv5Var.w;
                    Context context = this.P;
                    String str = this.R;
                    if (qt2Var.j(context)) {
                        if (qt2.k(context)) {
                            qt2Var.d(new jt2(str, 0), "beginAdUnitExposure");
                        } else {
                            qt2Var.a(context, str, "beginAdUnitExposure");
                        }
                    }
                } else {
                    qt2 qt2Var2 = jv5Var.w;
                    Context context2 = this.P;
                    String str2 = this.R;
                    if (qt2Var2.j(context2)) {
                        if (qt2.k(context2)) {
                            qt2Var2.d(new e83(2, str2), "endAdUnitExposure");
                        } else {
                            qt2Var2.a(context2, str2, "endAdUnitExposure");
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.s22
    public final void h0(r22 r22Var) {
        a(r22Var.j);
    }
}