package defpackage;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: l12  reason: default package */
public final class l12 extends c22 {
    public final dk5 h;

    public l12(l02 l02Var, gx1 gx1Var, int i, dk5 dk5Var) {
        super(l02Var, "sGX187VmldVivMx8d2G9ijy8IexWLJjVBriaGlzwhpHKAK1AG3if6ICXfcjwXboZ", "IowIKykYnY6WZolnjAhl1KeEVDwldWZiaxuj9ry3exU=", gx1Var, i, 94);
        this.h = dk5Var;
    }

    @Override // defpackage.c22
    public final void b() {
        Method method = this.e;
        dk5 dk5Var = this.h;
        dk5Var.Q = Collections.emptyList();
        int intValue = ((Integer) method.invoke(null, (List) dk5Var.Q)).intValue();
        synchronized (this.d) {
            gx1 gx1Var = this.d;
            int h = j82.h(intValue);
            gx1Var.j();
            ey1.p0((ey1) gx1Var.Q, h);
        }
    }
}