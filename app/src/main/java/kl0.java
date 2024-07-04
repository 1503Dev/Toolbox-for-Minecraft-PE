package defpackage;

import defpackage.il0;

/* renamed from: kl0  reason: default package */
public final class kl0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ il0.c Q;

    public kl0(il0.c cVar, int i) {
        this.Q = cVar;
        this.P = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Q.c(this.P);
    }
}