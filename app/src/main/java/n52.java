package defpackage;

import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: n52  reason: default package */
public final class n52 extends tv1 {
    public final Context b;

    public n52(Context context) {
        this.b = context;
    }

    @Override // defpackage.tv1, defpackage.vu1
    public final yu1 a(gv1 gv1Var) {
        boolean z;
        if (gv1Var.Q == 0) {
            if (Pattern.matches((String) w82.d.c.a(x92.F3), gv1Var.R)) {
                mv2 mv2Var = n62.f.a;
                if (jt.b.c(this.b, 13400000) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    yu1 a = new uh2(this.b).a(gv1Var);
                    if (a != null) {
                        vz3.k("Got gmscore asset response: ".concat(String.valueOf(gv1Var.R)));
                        return a;
                    }
                    vz3.k("Failed to get gmscore asset response: ".concat(String.valueOf(gv1Var.R)));
                }
            }
        }
        return super.a(gv1Var);
    }
}