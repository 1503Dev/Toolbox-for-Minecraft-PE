package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: qc4  reason: default package */
public final class qc4 {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final qm4 d;
    public final zr3 e;

    public qc4(Context context, yw2 yw2Var, Set set, qm4 qm4Var, zr3 zr3Var) {
        this.a = context;
        this.c = yw2Var;
        this.b = set;
        this.d = qm4Var;
        this.e = zr3Var;
    }

    public final oy4 a(final Object obj) {
        hm4 t = eb1.t(this.a, 8);
        t.f();
        final ArrayList arrayList = new ArrayList(this.b.size());
        for (final nc4 nc4Var : this.b) {
            dz4 c = nc4Var.c();
            jv5.A.j.getClass();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            c.b(new Runnable() { // from class: oc4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    qc4 qc4Var = qc4.this;
                    long j = elapsedRealtime;
                    nc4 nc4Var2 = nc4Var;
                    qc4Var.getClass();
                    jv5 jv5Var = jv5.A;
                    jv5Var.j.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                    if (((Boolean) rb2.a.d()).booleanValue()) {
                        String b = pt4.b(nc4Var2.getClass().getCanonicalName());
                        vz3.k("Signal runtime (ms) : " + b + " = " + elapsedRealtime2);
                    }
                    l92 l92Var = x92.H1;
                    w82 w82Var = w82.d;
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        yr3 a = qc4Var.e.a();
                        a.a("action", "lat_ms");
                        a.a("lat_grp", "sig_lat_grp");
                        a.a("lat_id", String.valueOf(nc4Var2.a()));
                        a.a("clat_ms", String.valueOf(elapsedRealtime2));
                        if (((Boolean) w82Var.c.a(x92.I1)).booleanValue()) {
                            av2 av2Var = jv5Var.g.c.c;
                            synchronized (av2Var) {
                                str = (String) av2Var.R;
                            }
                            a.a("seq_num", str);
                        }
                        a.b.b.execute(new sy2(2, a));
                    }
                }
            }, zw2.f);
            arrayList.add(c);
        }
        oy4 a = zw4.s(arrayList).a(new Callable() { // from class: pc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<dz4> list = arrayList;
                Object obj2 = obj;
                for (dz4 dz4Var : list) {
                    mc4 mc4Var = (mc4) dz4Var.get();
                    if (mc4Var != null) {
                        mc4Var.b(obj2);
                    }
                }
                return obj2;
            }
        }, this.c);
        if (rm4.b()) {
            pm4.c(a, this.d, t, false);
        }
        return a;
    }
}