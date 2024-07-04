package defpackage;

import defpackage.cw;
import defpackage.ns0;

/* renamed from: nx  reason: default package */
public final /* synthetic */ class nx implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ nx(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                cw.a aVar = ((ox) this.Q).U;
                if (aVar != null) {
                    ((ia0) aVar).a();
                    return;
                }
                return;
            case 1:
                ((az0) this.Q).e.setVisibility(8);
                return;
            default:
                ((ns0.c) this.Q).b();
                return;
        }
    }
}