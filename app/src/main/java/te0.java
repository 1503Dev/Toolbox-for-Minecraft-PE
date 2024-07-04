package defpackage;

import defpackage.qs0;
import defpackage.ve0;
import defpackage.xs0;
import io.mrarm.mctoolbox.bridge.b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: te0  reason: default package */
public final /* synthetic */ class te0 implements qs0.b, xs0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ te0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        n21 n21Var = (n21) this.a;
        boolean z = n21.W;
        if (((b) n21Var.R).c.Q) {
            n21Var.dismiss();
        }
    }

    @Override // defpackage.qs0.b
    public final void b(ol0 ol0Var) {
        boolean z;
        T t;
        ka0 ka0Var = (ka0) this.a;
        ka0Var.getClass();
        int i = ol0Var.a.R;
        if (i >= 200 && i < 300) {
            z = true;
        } else {
            z = false;
        }
        if (z && (t = ol0Var.b) != 0 && ((vt0) t).b()) {
            long a = ((vt0) ol0Var.b).a();
            if (a != 0) {
                ka0Var.a(a);
                return;
            }
            throw new IllegalArgumentException("next check in needs to be > 0");
        }
        throw new IllegalArgumentException("unsuccessful response");
    }

    public final void c(da daVar, ArrayList arrayList) {
        ve0 ve0Var = (ve0) this.a;
        ve0Var.getClass();
        if (daVar.a != 0) {
            ve0Var.f = true;
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gt0 gt0Var = (gt0) it.next();
            ve0.a aVar = (ve0.a) ve0Var.d.get(gt0Var.b.optString("productId"));
            if (aVar != null) {
                aVar.b = gt0Var;
                aVar.d.H(gt0Var.b.optString("price"));
            }
        }
    }
}