package defpackage;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: w02  reason: default package */
public final class w02 extends c22 {
    public w02(l02 l02Var, gx1 gx1Var, int i) {
        super(l02Var, "kwtXYBCvBLfWcikGQlC0YCCiAi3jf0v8mKFP3Rqx70Jf0cytKZO4qWHMAffIVrkU", "nMO31gtWkn27JzpwW/zLPiiIPhLCWt7BVghY/Hyr+TE=", gx1Var, i, 49);
    }

    @Override // defpackage.c22
    public final void b() {
        gx1 gx1Var = this.d;
        gx1Var.j();
        ey1.l0((ey1) gx1Var.Q, 3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
            gx1 gx1Var2 = this.d;
            if (true == booleanValue) {
                i = 2;
            }
            gx1Var2.j();
            ey1.l0((ey1) gx1Var2.Q, i);
        } catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof Settings.SettingNotFoundException) {
                return;
            }
            throw e;
        }
    }
}