package defpackage;

import java.math.BigDecimal;

/* renamed from: ae1  reason: default package */
public final class ae1 implements g2 {
    public final /* synthetic */ zd1 a;

    /* renamed from: ae1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ String P;
        public final /* synthetic */ String Q;
        public final /* synthetic */ float R;

        public a(String str, String str2, float f) {
            this.P = str;
            this.Q = str2;
            this.R = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zd1 zd1Var;
            if (this.P.equals(ae1.this.a.o)) {
                zd1Var = ae1.this.a;
            } else {
                z1 z1Var = ga1.h().k().f.get(this.P);
                if (z1Var != null) {
                    zd1Var = z1Var.getOmidManager();
                } else {
                    zd1Var = null;
                }
                if (zd1Var == null) {
                    return;
                }
            }
            zd1Var.c(this.Q, this.R);
        }
    }

    public ae1(zd1 zd1Var) {
        this.a = zd1Var;
    }

    @Override // defpackage.g2
    public final void a(f2 f2Var) {
        double optDouble;
        ic1 d = eb1.d((String) f2Var.Q, null);
        String q = d.q("event_type");
        synchronized (d.a) {
            optDouble = d.a.optDouble("duration", 0.0d);
        }
        float floatValue = BigDecimal.valueOf(optDouble).floatValue();
        boolean j = d.j("replay");
        boolean equals = d.q("skip_type").equals("dec");
        String q2 = d.q("asi");
        if (q.equals("skip") && equals) {
            this.a.k = true;
        } else if (!j || (!q.equals("start") && !q.equals("first_quartile") && !q.equals("midpoint") && !q.equals("third_quartile") && !q.equals("complete"))) {
            eg1.n(new a(q2, q, floatValue));
        }
    }
}