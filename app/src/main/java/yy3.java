package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: yy3  reason: default package */
public final class yy3 implements pl4 {
    public final HashMap P = new HashMap();
    public final HashMap Q = new HashMap();
    public final vl4 R;

    public yy3(Set set, vl4 vl4Var) {
        this.R = vl4Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            xy3 xy3Var = (xy3) it.next();
            this.P.put(xy3Var.a, "ttc");
            this.Q.put(xy3Var.b, "ttc");
        }
    }

    @Override // defpackage.pl4
    public final void b(ml4 ml4Var, String str) {
        this.R.d("task.".concat(String.valueOf(str)), "s.");
        if (this.Q.containsKey(ml4Var)) {
            this.R.d("label.".concat(String.valueOf((String) this.Q.get(ml4Var))), "s.");
        }
    }

    @Override // defpackage.pl4
    public final void c(String str) {
    }

    @Override // defpackage.pl4
    public final void h(ml4 ml4Var, String str) {
        this.R.c("task.".concat(String.valueOf(str)));
        if (this.P.containsKey(ml4Var)) {
            this.R.c("label.".concat(String.valueOf((String) this.P.get(ml4Var))));
        }
    }

    @Override // defpackage.pl4
    public final void s(ml4 ml4Var, String str, Throwable th) {
        this.R.d("task.".concat(String.valueOf(str)), "f.");
        if (this.Q.containsKey(ml4Var)) {
            this.R.d("label.".concat(String.valueOf((String) this.Q.get(ml4Var))), "f.");
        }
    }
}