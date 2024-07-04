package defpackage;

import defpackage.il0;
import defpackage.w11;

/* renamed from: vb  reason: default package */
public final class vb implements Runnable {
    public final /* synthetic */ ar P;
    public final /* synthetic */ int Q;

    public vb(ar arVar, int i) {
        this.P = arVar;
        this.Q = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ar arVar = this.P;
        int i = this.Q;
        il0.c cVar = ((w11.a) arVar).W;
        if (cVar != null) {
            cVar.c(i);
        }
    }
}