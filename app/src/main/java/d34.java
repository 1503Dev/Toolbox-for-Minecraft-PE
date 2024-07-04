package defpackage;

import android.content.Context;

/* renamed from: d34  reason: default package */
public final class d34 implements wj3 {
    public final yh4 P;
    public final zm2 Q;
    public final o2 R;
    public zd3 S = null;

    public d34(yh4 yh4Var, zm2 zm2Var, o2 o2Var) {
        this.P = yh4Var;
        this.Q = zm2Var;
        this.R = o2Var;
    }

    @Override // defpackage.wj3
    public final void c(boolean z, Context context, wd3 wd3Var) {
        boolean m0;
        try {
            int ordinal = this.R.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 6) {
                        m0 = this.Q.h2(new va0(context));
                    }
                    throw new vj3("Adapter failed to show.");
                }
                m0 = this.Q.t3(new va0(context));
            } else {
                m0 = this.Q.m0(new va0(context));
            }
            if (m0) {
                if (this.S == null) {
                    return;
                }
                if (!((Boolean) w82.d.c.a(x92.g1)).booleanValue() && this.P.Y == 2) {
                    this.S.a();
                    return;
                }
                return;
            }
            throw new vj3("Adapter failed to show.");
        } catch (Throwable th) {
            throw new vj3(th);
        }
    }
}