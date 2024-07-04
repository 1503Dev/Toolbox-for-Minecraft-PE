package defpackage;

import defpackage.l4;

/* renamed from: xg1  reason: default package */
public final class xg1 implements Runnable {
    public final /* synthetic */ yg1 P;

    public xg1(yg1 yg1Var) {
        this.P = yg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l4.e eVar = this.P.a.Q;
        eVar.d(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}