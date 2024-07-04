package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: ik4  reason: default package */
public final class ik4 {
    public final HashMap a = new HashMap();

    public final hk4 a(ak4 ak4Var, Context context, tj4 tj4Var, jz1 jz1Var) {
        bk4 bk4Var;
        hk4 hk4Var = (hk4) this.a.get(ak4Var);
        if (hk4Var == null) {
            if (ak4Var == ak4.Rewarded) {
                m92 m92Var = x92.p5;
                w82 w82Var = w82.d;
                bk4Var = new bk4(context, ak4Var, ((Integer) w82Var.c.a(m92Var)).intValue(), ((Integer) w82Var.c.a(x92.v5)).intValue(), ((Integer) w82Var.c.a(x92.x5)).intValue(), (String) w82Var.c.a(x92.z5), (String) w82Var.c.a(x92.r5), (String) w82Var.c.a(x92.t5));
            } else if (ak4Var == ak4.Interstitial) {
                m92 m92Var2 = x92.q5;
                w82 w82Var2 = w82.d;
                bk4Var = new bk4(context, ak4Var, ((Integer) w82Var2.c.a(m92Var2)).intValue(), ((Integer) w82Var2.c.a(x92.w5)).intValue(), ((Integer) w82Var2.c.a(x92.y5)).intValue(), (String) w82Var2.c.a(x92.A5), (String) w82Var2.c.a(x92.s5), (String) w82Var2.c.a(x92.u5));
            } else if (ak4Var == ak4.AppOpen) {
                m92 m92Var3 = x92.D5;
                w82 w82Var3 = w82.d;
                bk4Var = new bk4(context, ak4Var, ((Integer) w82Var3.c.a(m92Var3)).intValue(), ((Integer) w82Var3.c.a(x92.F5)).intValue(), ((Integer) w82Var3.c.a(x92.G5)).intValue(), (String) w82Var3.c.a(x92.B5), (String) w82Var3.c.a(x92.C5), (String) w82Var3.c.a(x92.E5));
            } else {
                bk4Var = null;
            }
            xj4 xj4Var = new xj4(bk4Var);
            hk4 hk4Var2 = new hk4(xj4Var, new pk4(xj4Var, tj4Var, jz1Var));
            this.a.put(ak4Var, hk4Var2);
            return hk4Var2;
        }
        return hk4Var;
    }
}