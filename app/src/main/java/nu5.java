package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nu5  reason: default package */
public abstract class nu5 implements qv5 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final sv5 c = new sv5(new CopyOnWriteArrayList(), null);
    public final js5 d = new js5(new CopyOnWriteArrayList(), null);
    public Looper e;
    public kd3 f;
    public wp5 g;

    @Override // defpackage.qv5
    public /* synthetic */ void N() {
    }

    @Override // defpackage.qv5
    public final void a(ks5 ks5Var) {
        js5 js5Var = this.d;
        Iterator it = js5Var.b.iterator();
        while (it.hasNext()) {
            is5 is5Var = (is5) it.next();
            if (is5Var.a == ks5Var) {
                js5Var.b.remove(is5Var);
            }
        }
    }

    @Override // defpackage.qv5
    public final void b(Handler handler, ks5 ks5Var) {
        this.d.b.add(new is5(ks5Var));
    }

    @Override // defpackage.qv5
    public final void c(pv5 pv5Var) {
        this.e.getClass();
        boolean isEmpty = this.b.isEmpty();
        this.b.add(pv5Var);
        if (isEmpty) {
            l();
        }
    }

    @Override // defpackage.qv5
    public final void d(tv5 tv5Var) {
        sv5 sv5Var = this.c;
        Iterator it = sv5Var.b.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            if (rv5Var.b == tv5Var) {
                sv5Var.b.remove(rv5Var);
            }
        }
    }

    @Override // defpackage.qv5
    public final void e(pv5 pv5Var, bf5 bf5Var, wp5 wp5Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        tv2.G(looper == null || looper == myLooper);
        this.g = wp5Var;
        kd3 kd3Var = this.f;
        this.a.add(pv5Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(pv5Var);
            m(bf5Var);
        } else if (kd3Var != null) {
            c(pv5Var);
            pv5Var.a(this, kd3Var);
        }
    }

    @Override // defpackage.qv5
    public final void f(pv5 pv5Var) {
        this.a.remove(pv5Var);
        if (!this.a.isEmpty()) {
            j(pv5Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        o();
    }

    @Override // defpackage.qv5
    public final void i(Handler handler, tv5 tv5Var) {
        this.c.b.add(new rv5(handler, tv5Var));
    }

    @Override // defpackage.qv5
    public final void j(pv5 pv5Var) {
        boolean z = !this.b.isEmpty();
        this.b.remove(pv5Var);
        if (z && this.b.isEmpty()) {
            k();
        }
    }

    public void k() {
    }

    public void l() {
    }

    public abstract void m(bf5 bf5Var);

    public final void n(kd3 kd3Var) {
        this.f = kd3Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pv5) arrayList.get(i)).a(this, kd3Var);
        }
    }

    public abstract void o();

    @Override // defpackage.qv5
    public /* synthetic */ void u() {
    }
}