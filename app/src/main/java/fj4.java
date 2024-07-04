package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fj4  reason: default package */
public final class fj4 {
    public final yh4 a;
    public final ci4 b;
    public final r04 c;
    public final gn4 d;
    public final qm4 e;

    public fj4(r04 r04Var, gn4 gn4Var, yh4 yh4Var, ci4 ci4Var, qm4 qm4Var) {
        this.a = yh4Var;
        this.b = ci4Var;
        this.c = r04Var;
        this.d = gn4Var;
        this.e = qm4Var;
    }

    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(2, (String) it.next());
        }
    }

    public final void b(int i, String str) {
        if (!this.a.i0) {
            this.d.a(str, this.e);
            return;
        }
        jv5.A.j.getClass();
        this.c.a(new s04(System.currentTimeMillis(), this.b.b, str, i));
    }
}