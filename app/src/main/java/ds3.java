package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ds3  reason: default package */
public final class ds3 implements pl4 {
    public final xr3 Q;
    public final kd R;
    public final HashMap P = new HashMap();
    public final HashMap S = new HashMap();

    public ds3(xr3 xr3Var, Set set, kd kdVar) {
        this.Q = xr3Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            as3 as3Var = (as3) it.next();
            this.S.put(as3Var.c, as3Var);
        }
        this.R = kdVar;
    }

    public final void a(ml4 ml4Var, boolean z) {
        String str;
        ml4 ml4Var2 = ((as3) this.S.get(ml4Var)).b;
        if (this.P.containsKey(ml4Var2)) {
            if (true != z) {
                str = "f.";
            } else {
                str = "s.";
            }
            long b = this.R.b() - ((Long) this.P.get(ml4Var2)).longValue();
            this.Q.a.put("label.".concat(((as3) this.S.get(ml4Var)).a), str.concat(String.valueOf(Long.toString(b))));
        }
    }

    @Override // defpackage.pl4
    public final void b(ml4 ml4Var, String str) {
        if (this.P.containsKey(ml4Var)) {
            long b = this.R.b() - ((Long) this.P.get(ml4Var)).longValue();
            this.Q.a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(b))));
        }
        if (this.S.containsKey(ml4Var)) {
            a(ml4Var, true);
        }
    }

    @Override // defpackage.pl4
    public final void c(String str) {
    }

    @Override // defpackage.pl4
    public final void h(ml4 ml4Var, String str) {
        this.P.put(ml4Var, Long.valueOf(this.R.b()));
    }

    @Override // defpackage.pl4
    public final void s(ml4 ml4Var, String str, Throwable th) {
        if (this.P.containsKey(ml4Var)) {
            this.Q.a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.R.b() - ((Long) this.P.get(ml4Var)).longValue()))));
        }
        if (this.S.containsKey(ml4Var)) {
            a(ml4Var, false);
        }
    }
}