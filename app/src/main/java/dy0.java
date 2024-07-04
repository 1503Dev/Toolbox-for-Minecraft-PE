package defpackage;

import defpackage.iy0;
import io.mrarm.simpleads.SimpleInterstitialAdActivity;

/* renamed from: dy0  reason: default package */
public final /* synthetic */ class dy0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ dy0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                hy0 hy0Var = (hy0) this.Q;
                if (((iy0) hy0Var.p).M() != null) {
                    iy0.a M = ((iy0) hy0Var.p).M();
                    iy0.H0(M.a, hy0Var.f, hy0Var.g, hy0Var.h);
                    return;
                }
                return;
            case 1:
                int i = t90.b;
                ((t90) this.Q).getContentView().setSystemUiVisibility(5894);
                return;
            default:
                int i2 = SimpleInterstitialAdActivity.f0;
                ((SimpleInterstitialAdActivity) this.Q).r();
                return;
        }
    }
}