package defpackage;

/* renamed from: ib1  reason: default package */
public final class ib1 implements Runnable {
    public final /* synthetic */ fb1 P;
    public final /* synthetic */ String Q;

    public ib1(fb1 fb1Var, String str) {
        this.P = fb1Var;
        this.Q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.P.getEnableMessages()) {
            fb1 fb1Var = this.P;
            StringBuilder b = e5.b("NativeLayer.dispatch_messages(ADC3_update(");
            b.append(this.Q);
            b.append("), '");
            b.append(this.P.q0);
            b.append("');");
            fb1Var.k(b.toString());
        }
    }
}