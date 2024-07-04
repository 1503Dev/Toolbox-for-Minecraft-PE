package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: of  reason: default package */
public abstract class of<T> implements pf<T> {
    public final ArrayList a = new ArrayList();
    public T b;
    public qf<T> c;
    public a d;

    /* renamed from: of$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public of(qf<T> qfVar) {
        this.c = qfVar;
    }

    @Override // defpackage.pf
    public final void a(T t) {
        this.b = t;
        e(this.d, t);
    }

    public abstract boolean b(l71 l71Var);

    public abstract boolean c(T t);

    public final void d(Collection collection) {
        this.a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            l71 l71Var = (l71) it.next();
            if (b(l71Var)) {
                this.a.add(l71Var.a);
            }
        }
        if (this.a.isEmpty()) {
            qf<T> qfVar = this.c;
            synchronized (qfVar.c) {
                if (qfVar.d.remove(this) && qfVar.d.isEmpty()) {
                    qfVar.d();
                }
            }
        } else {
            qf<T> qfVar2 = this.c;
            synchronized (qfVar2.c) {
                if (qfVar2.d.add(this)) {
                    if (qfVar2.d.size() == 1) {
                        qfVar2.e = qfVar2.a();
                        y20.c().a(qf.f, String.format("%s: initial state = %s", qfVar2.getClass().getSimpleName(), qfVar2.e), new Throwable[0]);
                        qfVar2.c();
                    }
                    a(qfVar2.e);
                }
            }
        }
        e(this.d, this.b);
    }

    public final void e(a aVar, T t) {
        if (!this.a.isEmpty() && aVar != null) {
            if (t != null && !c(t)) {
                ArrayList arrayList = this.a;
                q61 q61Var = (q61) aVar;
                synchronized (q61Var.c) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (q61Var.a(str)) {
                            y20.c().a(q61.d, String.format("Constraints met for %s", str), new Throwable[0]);
                            arrayList2.add(str);
                        }
                    }
                    p61 p61Var = q61Var.a;
                    if (p61Var != null) {
                        p61Var.e(arrayList2);
                    }
                }
                return;
            }
            ArrayList arrayList3 = this.a;
            q61 q61Var2 = (q61) aVar;
            synchronized (q61Var2.c) {
                p61 p61Var2 = q61Var2.a;
                if (p61Var2 != null) {
                    p61Var2.c(arrayList3);
                }
            }
        }
    }
}