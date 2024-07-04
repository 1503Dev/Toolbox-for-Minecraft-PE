package defpackage;

/* renamed from: hb1  reason: default package */
public final class hb1 implements Runnable {
    public final /* synthetic */ fb1 P;

    public hb1(fb1 fb1Var) {
        this.P = fb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.P.removeJavascriptInterface("NativeLayer");
    }
}