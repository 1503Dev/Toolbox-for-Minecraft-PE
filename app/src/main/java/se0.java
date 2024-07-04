package defpackage;

import defpackage.qs0;
import defpackage.xs0;
import java.util.Iterator;
import java.util.List;

/* renamed from: se0  reason: default package */
public final /* synthetic */ class se0 implements tg0, xs0.a, qs0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ se0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        n21 n21Var = (n21) this.a;
        String str = n21Var.S.Q;
        if (str != null) {
            n21Var.T.setText(str);
        }
    }

    @Override // defpackage.qs0.a
    public final void b(Throwable th) {
        ns0 ns0Var = (ns0) this.a;
        ns0Var.d = null;
        ns0Var.h = false;
        Iterator it = ns0Var.g.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ns0Var.g.clear();
    }

    @Override // defpackage.tg0
    public final void c(da daVar, List list) {
        ((ve0) this.a).c(daVar, list);
    }
}