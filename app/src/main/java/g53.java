package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: g53  reason: default package */
public final /* synthetic */ class g53 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ g53(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        switch (this.P) {
            case 0:
                h53 h53Var = (h53) this.Q;
                h53Var.getClass();
                jv5 jv5Var = jv5.A;
                nl5 b = jv5Var.g.b();
                b.B();
                synchronized (b.a) {
                    z = b.A;
                }
                if (z) {
                    nl5 b2 = jv5Var.g.b();
                    b2.B();
                    synchronized (b2.a) {
                        str = b2.B;
                    }
                    if (!jv5Var.m.f(h53Var.P, str, h53Var.Q.P)) {
                        jv5Var.g.b().w(false);
                        jv5Var.g.b().v("");
                        return;
                    }
                    return;
                }
                return;
            case 1:
                jl3 jl3Var = (jl3) this.Q;
                jl3Var.k.g();
                nl3 nl3Var = jl3Var.j;
                synchronized (nl3Var) {
                    y03 y03Var = nl3Var.i;
                    if (y03Var != null) {
                        y03Var.destroy();
                        nl3Var.i = null;
                    }
                    y03 y03Var2 = nl3Var.j;
                    if (y03Var2 != null) {
                        y03Var2.destroy();
                        nl3Var.j = null;
                    }
                    y03 y03Var3 = nl3Var.k;
                    if (y03Var3 != null) {
                        y03Var3.destroy();
                        nl3Var.k = null;
                    }
                    nl3Var.l = null;
                    nl3Var.u.clear();
                    nl3Var.v.clear();
                    nl3Var.b = null;
                    nl3Var.c = null;
                    nl3Var.d = null;
                    nl3Var.e = null;
                    nl3Var.h = null;
                    nl3Var.m = null;
                    nl3Var.o = null;
                    nl3Var.p = null;
                    nl3Var.r = null;
                    nl3Var.s = null;
                    nl3Var.t = null;
                }
                return;
            case 2:
                jt3 jt3Var = (jt3) this.Q;
                is3 is3Var = jt3Var.l;
                synchronized (is3Var) {
                    l92 l92Var = x92.G1;
                    w82 w82Var = w82.d;
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        if (!((Boolean) w82Var.c.a(x92.k7)).booleanValue() && !is3Var.d) {
                            HashMap e = is3Var.e();
                            e.put("action", "init_finished");
                            is3Var.b.add(e);
                            Iterator it = is3Var.b.iterator();
                            while (it.hasNext()) {
                                is3Var.f.a((Map) it.next(), false);
                            }
                            is3Var.d = true;
                        }
                    }
                }
                jt3Var.o.b();
                jt3Var.b = true;
                return;
            default:
                qf4 qf4Var = (qf4) this.Q;
                qf4Var.P.a().execute(new j02(4, qf4Var));
                return;
        }
    }
}