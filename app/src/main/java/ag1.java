package defpackage;

import defpackage.eg1;
import java.util.Date;

/* renamed from: ag1  reason: default package */
public final class ag1 {
    public boolean a = true;
    public final a b = new a();
    public Runnable c;
    public b d;

    /* renamed from: ag1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            new rc1("AdColony.heartbeat", 1).b();
            ag1 ag1Var = ag1.this;
            ag1Var.getClass();
            if (ga1.j()) {
                eg1.b bVar = new eg1.b(ga1.h().U);
                bg1 bg1Var = new bg1(ag1Var, bVar);
                ag1Var.c = bg1Var;
                eg1.e(bVar.a(), bg1Var);
            }
        }
    }

    /* renamed from: ag1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final ic1 a;

        public b(ic1 ic1Var) {
            ic1 ic1Var2;
            if (ic1Var != null) {
                ic1Var2 = ic1Var.n("payload");
            } else {
                ic1Var2 = new ic1();
            }
            this.a = ic1Var2;
            eb1.j(ic1Var2, "heartbeatLastTimestamp", hc1.e.format(new Date()));
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public final void a() {
        this.a = true;
        eg1.q(this.b);
        eg1.q(this.c);
        this.c = null;
    }
}