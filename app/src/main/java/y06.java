package defpackage;

import android.util.Pair;

/* renamed from: y06  reason: default package */
public final class y06 implements wy4 {
    public final /* synthetic */ dk1 P;

    public y06(dk1 dk1Var) {
        this.P = dk1Var;
    }

    @Override // defpackage.wy4
    public final /* synthetic */ void f(Object obj) {
        ew1 ew1Var = (ew1) obj;
        sv2.b("Initialized webview successfully for SDKCore.");
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        jv5.A.g.f("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        dk1 dk1Var = this.P;
        xi4.c(dk1Var.c0, dk1Var.U, "sgf", new Pair("sgf_reason", th.getMessage()));
        sv2.e("Failed to initialize webview for loading SDKCore. ", th);
    }
}