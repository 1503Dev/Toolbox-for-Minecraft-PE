package defpackage;

import defpackage.eg1;

/* renamed from: u1  reason: default package */
public final class u1 implements eg1.a {
    public boolean P;
    public final /* synthetic */ z61 Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ eg1.b S;

    public u1(z61 z61Var, String str, eg1.b bVar) {
        this.Q = z61Var;
        this.R = str;
        this.S = bVar;
    }

    @Override // defpackage.eg1.a
    public final boolean a() {
        return this.P;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this) {
            if (this.P) {
                return;
            }
            this.P = true;
            w1.b(this.Q, this.R);
            if (this.S.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder b = e5.b("RequestNotFilled called due to a native timeout. ");
                StringBuilder b2 = e5.b("Timeout set to: ");
                b2.append(this.S.a);
                b2.append(" ms. ");
                b.append(b2.toString());
                StringBuilder sb = new StringBuilder();
                sb.append("Execution took: ");
                long currentTimeMillis = System.currentTimeMillis();
                eg1.b bVar = this.S;
                sb.append(currentTimeMillis - (bVar.b - bVar.a));
                sb.append(" ms. ");
                b.append(sb.toString());
                b.append("Interstitial request not yet started.");
                t1.b(0, 0, b.toString(), true);
            }
        }
    }
}