package defpackage;

import androidx.lifecycle.LiveData;
import defpackage.uc0;

/* renamed from: vc0  reason: default package */
public final class vc0 implements uc0 {
    public final v60<uc0.a> c = new v60<>();
    public final yq0<uc0.a.c> d = new yq0<>();

    public vc0() {
        a(uc0.b);
    }

    public final void a(uc0.a aVar) {
        boolean z;
        v60<uc0.a> v60Var = this.c;
        synchronized (v60Var.a) {
            if (v60Var.e == LiveData.j) {
                z = true;
            } else {
                z = false;
            }
            v60Var.e = aVar;
        }
        if (z) {
            a7.D1().E1(v60Var.i);
        }
        if (aVar instanceof uc0.a.c) {
            this.d.j((uc0.a.c) aVar);
        } else if (aVar instanceof uc0.a.C0047a) {
            this.d.k(((uc0.a.C0047a) aVar).a);
        }
    }
}