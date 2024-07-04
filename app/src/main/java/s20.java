package defpackage;

import defpackage.el0;
import java.util.Iterator;

/* renamed from: s20  reason: default package */
public final /* synthetic */ class s20 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ s20(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                v20 v20Var = (v20) this.Q;
                v20Var.showAtLocation(v20Var.a.getWindow().getDecorView(), 119, 0, 0);
                v20Var.a();
                return;
            default:
                el0.b bVar = (el0.b) this.Q;
                el0.this.d.remove(bVar.a);
                Iterator it = bVar.d.iterator();
                while (it.hasNext()) {
                    ((el0.a) it.next()).b();
                }
                return;
        }
    }
}