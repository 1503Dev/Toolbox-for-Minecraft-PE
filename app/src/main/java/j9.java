package defpackage;

import defpackage.nj;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j9  reason: default package */
public abstract class j9<T> implements nj<T> {
    public Object b;
    public final ArrayList a = new ArrayList();
    public int c = 0;

    @Override // defpackage.nj
    public Object a(int i) {
        return this.b;
    }

    @Override // defpackage.nj
    public final void b(nj.a aVar) {
        this.a.remove(aVar);
    }

    @Override // defpackage.nj
    public final void d(nj.a aVar) {
        this.a.add(aVar);
    }

    public final boolean f() {
        return this.c > 0;
    }

    @Override // defpackage.nj
    public final void g() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            n();
        }
    }

    @Override // defpackage.nj
    public final void h() {
        int i = this.c;
        this.c = i + 1;
        if (i == 0) {
            m();
        }
    }

    public void i(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj.a) it.next()).b(i, i2);
        }
    }

    public void j(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj.a) it.next()).a(i, i2);
        }
    }

    public void k(int i, int i2, int i3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj.a) it.next()).c(i, i2, i3);
        }
    }

    public void l(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj.a) it.next()).e(i, i2);
        }
    }

    public void m() {
    }

    public void n() {
    }
}