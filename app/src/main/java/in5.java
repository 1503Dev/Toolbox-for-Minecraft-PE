package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: in5  reason: default package */
public final class in5 {
    public final wp5 a;
    public final hn5 e;
    public final ho5 h;
    public final a54 i;
    public boolean j;
    public bf5 k;
    public yw5 l = new yw5();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public in5(hn5 hn5Var, ho5 ho5Var, a54 a54Var, wp5 wp5Var) {
        this.a = wp5Var;
        this.e = hn5Var;
        this.h = ho5Var;
        this.i = a54Var;
    }

    public final kd3 a() {
        if (!this.b.isEmpty()) {
            int i = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                gn5 gn5Var = (gn5) this.b.get(i2);
                gn5Var.d = i;
                i += gn5Var.a.o.c();
            }
            return new nn5(this.b, this.l);
        }
        return kd3.a;
    }

    public final void b(bf5 bf5Var) {
        tv2.I(!this.j);
        this.k = bf5Var;
        for (int i = 0; i < this.b.size(); i++) {
            gn5 gn5Var = (gn5) this.b.get(i);
            l(gn5Var);
            this.g.add(gn5Var);
        }
        this.j = true;
    }

    public final void c(nv5 nv5Var) {
        gn5 gn5Var = (gn5) this.c.remove(nv5Var);
        gn5Var.getClass();
        gn5Var.a.h(nv5Var);
        gn5Var.c.remove(((yu5) nv5Var).P);
        if (!this.c.isEmpty()) {
            j();
        }
        k(gn5Var);
    }

    public final kd3 d(int i, List list, yw5 yw5Var) {
        if (!list.isEmpty()) {
            this.l = yw5Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                gn5 gn5Var = (gn5) list.get(i2 - i);
                if (i2 > 0) {
                    gn5 gn5Var2 = (gn5) this.b.get(i2 - 1);
                    zu5 zu5Var = gn5Var2.a.o;
                    gn5Var.d = zu5Var.c() + gn5Var2.d;
                } else {
                    gn5Var.d = 0;
                }
                gn5Var.e = false;
                gn5Var.c.clear();
                i(i2, gn5Var.a.o.c());
                this.b.add(i2, gn5Var);
                this.d.put(gn5Var.b, gn5Var);
                if (this.j) {
                    l(gn5Var);
                    if (this.c.isEmpty()) {
                        this.g.add(gn5Var);
                    } else {
                        fn5 fn5Var = (fn5) this.f.get(gn5Var);
                        if (fn5Var != null) {
                            fn5Var.a.j(fn5Var.b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final kd3 e() {
        boolean z;
        if (this.b.size() >= 0) {
            z = true;
        } else {
            z = false;
        }
        tv2.G(z);
        this.l = null;
        return a();
    }

    public final kd3 f(int i, int i2, yw5 yw5Var) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= this.b.size()) {
            z = true;
        } else {
            z = false;
        }
        tv2.G(z);
        this.l = yw5Var;
        m(i, i2);
        return a();
    }

    public final kd3 g(List list, yw5 yw5Var) {
        m(0, this.b.size());
        return d(this.b.size(), list, yw5Var);
    }

    public final kd3 h(yw5 yw5Var) {
        int size = this.b.size();
        if (yw5Var.b.length != size) {
            yw5Var = new yw5(new Random(yw5Var.a.nextLong())).a(size);
        }
        this.l = yw5Var;
        return a();
    }

    public final void i(int i, int i2) {
        while (i < this.b.size()) {
            ((gn5) this.b.get(i)).d += i2;
            i++;
        }
    }

    public final void j() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            gn5 gn5Var = (gn5) it.next();
            if (gn5Var.c.isEmpty()) {
                fn5 fn5Var = (fn5) this.f.get(gn5Var);
                if (fn5Var != null) {
                    fn5Var.a.j(fn5Var.b);
                }
                it.remove();
            }
        }
    }

    public final void k(gn5 gn5Var) {
        if (gn5Var.e && gn5Var.c.isEmpty()) {
            fn5 fn5Var = (fn5) this.f.remove(gn5Var);
            fn5Var.getClass();
            fn5Var.a.f(fn5Var.b);
            fn5Var.a.d(fn5Var.c);
            fn5Var.a.a(fn5Var.c);
            this.g.remove(gn5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zm5, pv5] */
    public final void l(gn5 gn5Var) {
        kv5 kv5Var = gn5Var.a;
        ?? r1 = new pv5() { // from class: zm5
            @Override // defpackage.pv5
            public final void a(qv5 qv5Var, kd3 kd3Var) {
                ((dl4) ((im5) in5.this.e).W).c(22);
            }
        };
        en5 en5Var = new en5(this, gn5Var);
        this.f.put(gn5Var, new fn5(kv5Var, r1, en5Var));
        int i = zn4.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        kv5Var.i(new Handler(myLooper, null), en5Var);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        kv5Var.b(new Handler(myLooper2, null), en5Var);
        kv5Var.e(r1, this.k, this.a);
    }

    public final void m(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                gn5 gn5Var = (gn5) this.b.remove(i2);
                this.d.remove(gn5Var.b);
                i(i2, -gn5Var.a.o.c());
                gn5Var.e = true;
                if (this.j) {
                    k(gn5Var);
                }
            } else {
                return;
            }
        }
    }
}