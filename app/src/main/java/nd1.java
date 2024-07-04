package defpackage;

/* renamed from: nd1  reason: default package */
public final class nd1 implements zc1 {

    /* renamed from: nd1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ String P;
        public final /* synthetic */ String Q;

        public a(String str, String str2) {
            this.P = str;
            this.Q = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                g2 g2Var = ga1.h().q.get(this.P);
                if (g2Var != null) {
                    g2Var.a(new f2(this.P, this.Q));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public nd1() {
        ga1.f("CustomMessage.controller_send", this);
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        ic1 ic1Var = rc1Var.b;
        eg1.n(new a(ic1Var.q("type"), ic1Var.q("message")));
    }
}