package defpackage;

import androidx.databinding.g;
import java.util.List;

/* renamed from: s10  reason: default package */
public final class s10<T> extends j9<T> {
    public List<? extends T> d;
    public int e = 0;
    public h20<T> f;
    public s10<T>.a g;

    /* renamed from: s10$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends g.a {
        public a() {
        }

        @Override // androidx.databinding.g.a
        public final void a(g gVar) {
            int size = s10.this.d.size();
            s10 s10Var = s10.this;
            s10Var.i(0, Math.min(s10Var.e, size));
            s10 s10Var2 = s10.this;
            int i = s10Var2.e;
            if (size > i) {
                s10.super.j(i, size - i);
            } else if (size < i) {
                s10.super.l(size, i - size);
            }
            s10.this.e = size;
        }

        @Override // androidx.databinding.g.a
        public final void b(g gVar, int i, int i2) {
            s10.this.i(i, i2);
        }

        @Override // androidx.databinding.g.a
        public final void c(g gVar, int i, int i2) {
            s10.this.j(i, i2);
        }

        @Override // androidx.databinding.g.a
        public final void d(g gVar, int i, int i2, int i3) {
            s10.this.k(i, i2, i3);
        }

        @Override // androidx.databinding.g.a
        public final void e(g gVar, int i, int i2) {
            s10.this.l(i, i2);
        }
    }

    public s10(g gVar, lj ljVar) {
        q(gVar, new q10(ljVar));
        this.g = new a();
        if (f()) {
            gVar.l(this.g);
            if (gVar instanceof ea) {
                ((ea) gVar).h();
            }
        }
    }

    @Override // defpackage.nj
    public final int c() {
        return this.e;
    }

    @Override // defpackage.nj
    public final l41<T> e(int i) {
        h20<T> h20Var = this.f;
        this.d.get(i);
        return h20Var.b();
    }

    @Override // defpackage.nj
    public final T getItem(int i) {
        return this.d.get(i);
    }

    @Override // defpackage.j9
    public final void i(int i, int i2) {
        super.i(i, i2);
    }

    @Override // defpackage.j9
    public final void j(int i, int i2) {
        this.e += i2;
        super.j(i, i2);
    }

    @Override // defpackage.j9
    public final void k(int i, int i2, int i3) {
        super.k(i, i2, i3);
    }

    @Override // defpackage.j9
    public final void l(int i, int i2) {
        this.e -= i2;
        super.l(i, i2);
    }

    @Override // defpackage.j9
    public final void m() {
        s10<T>.a aVar = this.g;
        if (aVar != null) {
            ((g) this.d).l(aVar);
            List<? extends T> list = this.d;
            if (list instanceof ea) {
                ((ea) list).h();
            }
        }
        int i = this.e;
        if (i > 0) {
            super.l(0, i);
        }
        int size = this.d.size();
        this.e = size;
        super.j(0, size);
    }

    @Override // defpackage.j9
    public final void n() {
        s10<T>.a aVar = this.g;
        if (aVar != null) {
            ((g) this.d).j(aVar);
            List<? extends T> list = this.d;
            if (list instanceof ea) {
                ((ea) list).g();
            }
        }
    }

    public final void q(List<? extends T> list, h20<T> h20Var) {
        s10<T>.a aVar = this.g;
        if (aVar != null) {
            ((g) this.d).j(aVar);
            this.g = null;
            List<? extends T> list2 = this.d;
            if (list2 instanceof ea) {
                ((ea) list2).g();
            }
        }
        this.d = list;
        this.f = h20Var;
        int i = this.e;
        if (i > 0) {
            super.l(0, i);
        }
        int size = this.d.size();
        this.e = size;
        super.j(0, size);
    }

    public s10(List list, lj ljVar) {
        q(list, new r10(ljVar));
    }
}