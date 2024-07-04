package defpackage;

import androidx.databinding.f;
import androidx.databinding.g;
import defpackage.nj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: oj  reason: default package */
public final class oj extends j9 {
    public List<nj> d;
    public ArrayList e;
    public ArrayList f;
    public int g;
    public int h;
    public b i;

    /* renamed from: oj$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements nj.a {
        public nj a;
        public int b;

        public a(nj njVar, int i) {
            this.a = njVar;
            this.b = i;
        }

        @Override // defpackage.nj.a
        public final void a(int i, int i2) {
            oj ojVar = oj.this;
            ojVar.h += i2;
            ojVar.j(ojVar.q(this.b) + i, i2);
            oj.this.r(this.b + 1);
        }

        @Override // defpackage.nj.a
        public final void b(int i, int i2) {
            oj ojVar = oj.this;
            ojVar.i(ojVar.q(this.b) + i, i2);
        }

        @Override // defpackage.nj.a
        public final void c(int i, int i2, int i3) {
            oj ojVar = oj.this;
            ojVar.k(ojVar.q(this.b) + i, oj.this.q(this.b) + i2, i3);
        }

        @Override // defpackage.nj.a
        public final void e(int i, int i2) {
            oj ojVar = oj.this;
            ojVar.h -= i2;
            ojVar.l(ojVar.q(this.b) + i, i2);
            oj.this.r(this.b + 1);
        }
    }

    /* renamed from: oj$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends g.a<g<nj>> {
        public b() {
        }

        @Override // androidx.databinding.g.a
        public final void a(g<nj> gVar) {
            oj.this.t();
        }

        @Override // androidx.databinding.g.a
        public final void b(g<nj> gVar, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                oj ojVar = oj.this;
                int i4 = i + i3;
                a aVar = (a) ojVar.e.get(i4);
                if (aVar.a != ojVar.d.get(i4)) {
                    int c = aVar.a.c();
                    aVar.a.b(aVar);
                    nj njVar = ojVar.d.get(i4);
                    aVar.a = njVar;
                    njVar.d(aVar);
                    int c2 = aVar.a.c();
                    ojVar.r(i4 + 1);
                    ojVar.h = (c2 - c) + ojVar.h;
                    ojVar.l(ojVar.q(i4), c);
                    ojVar.j(ojVar.q(i4), c2);
                }
            }
        }

        @Override // androidx.databinding.g.a
        public final void c(g<nj> gVar, int i, int i2) {
            oj ojVar = oj.this;
            if (i2 == 1) {
                ojVar.s(i);
                return;
            }
            ojVar.getClass();
            a[] aVarArr = new a[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i4 + i;
                nj njVar = ojVar.d.get(i5);
                if (ojVar.f()) {
                    njVar.h();
                }
                aVarArr[i4] = new a(njVar, i5);
                i3 += njVar.c();
                njVar.d(aVarArr[i4]);
            }
            ojVar.e.addAll(i, Arrays.asList(aVarArr));
            for (int i6 = i + i2; i6 < ojVar.e.size(); i6++) {
                ((a) ojVar.e.get(i6)).b = i6;
            }
            for (int i7 = 0; i7 < i2; i7++) {
                ojVar.f.add(-1);
            }
            ojVar.r(i + 1);
            ojVar.h += i3;
            ojVar.j(ojVar.q(i), i3);
        }

        @Override // androidx.databinding.g.a
        public final void d(g<nj> gVar, int i, int i2, int i3) {
            e(gVar, i, i3);
            c(gVar, i2, i3);
        }

        @Override // androidx.databinding.g.a
        public final void e(g<nj> gVar, int i, int i2) {
            ArrayList arrayList;
            oj ojVar = oj.this;
            if (i2 == 1) {
                a aVar = (a) ojVar.e.remove(i);
                aVar.a.b(aVar);
                for (int i3 = i; i3 < ojVar.e.size(); i3++) {
                    a aVar2 = (a) ojVar.e.get(i3);
                    aVar2.b--;
                }
                int c = aVar.a.c();
                ojVar.f.remove(arrayList.size() - 1);
                ojVar.r(i + 1);
                ojVar.h -= c;
                ojVar.l(ojVar.q(i), c);
                if (ojVar.f()) {
                    aVar.a.g();
                    return;
                }
                return;
            }
            List subList = ojVar.e.subList(i, i + i2);
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                a aVar3 = (a) subList.get(i5);
                aVar3.a.b(aVar3);
                i4 += aVar3.a.c();
                if (ojVar.f()) {
                    aVar3.a.g();
                }
            }
            subList.clear();
            for (int i6 = i; i6 < ojVar.e.size(); i6++) {
                ((a) ojVar.e.get(i6)).b = i6;
            }
            ArrayList arrayList2 = ojVar.f;
            arrayList2.subList(arrayList2.size() - i2, ojVar.f.size()).clear();
            ojVar.r(i + 1);
            ojVar.h -= i4;
            ojVar.l(ojVar.q(i), i2);
        }
    }

    public oj() {
        ArrayList arrayList = new ArrayList();
        this.h = 0;
        if (arrayList == this.d) {
            return;
        }
        u(arrayList);
        t();
    }

    @Override // defpackage.j9, defpackage.nj
    public final Object a(int i) {
        int p = p(i);
        Object a2 = this.d.get(p).a(i - ((Integer) this.f.get(p)).intValue());
        return a2 != null ? a2 : this.b;
    }

    @Override // defpackage.nj
    public final int c() {
        return this.h;
    }

    @Override // defpackage.nj
    public final l41 e(int i) {
        int p = p(i);
        return this.d.get(p).e(i - ((Integer) this.f.get(p)).intValue());
    }

    @Override // defpackage.nj
    public final Object getItem(int i) {
        int p = p(i);
        return this.d.get(p).getItem(i - ((Integer) this.f.get(p)).intValue());
    }

    @Override // defpackage.j9
    public final void m() {
        if (this.i != null) {
            List<nj> list = this.d;
            if (list instanceof ea) {
                ((ea) list).h();
            }
        }
        for (nj njVar : this.d) {
            njVar.h();
        }
    }

    @Override // defpackage.j9
    public final void n() {
        for (nj njVar : this.d) {
            njVar.g();
        }
        if (this.i != null) {
            List<nj> list = this.d;
            if (list instanceof ea) {
                ((ea) list).g();
            }
        }
    }

    public final void o(j9 j9Var) {
        this.d.add(j9Var);
        s(this.d.size() - 1);
    }

    public final int p(int i) {
        q(this.d.size());
        int size = this.d.size();
        int i2 = 0;
        while (size - i2 > 1) {
            int i3 = (i2 + size) / 2;
            if (((Integer) this.f.get(i3)).intValue() > i) {
                size = i3;
            } else {
                i2 = i3;
            }
        }
        return i2;
    }

    public final int q(int i) {
        int i2 = this.g;
        if (i >= i2) {
            while (i2 <= i) {
                ArrayList arrayList = this.f;
                int i3 = i2 - 1;
                arrayList.set(i2, Integer.valueOf(this.d.get(i3).c() + ((Integer) arrayList.get(i3)).intValue()));
                i2++;
            }
            this.g = i + 1;
        }
        return ((Integer) this.f.get(i)).intValue();
    }

    public final void r(int i) {
        if (this.g > i) {
            this.g = i;
        }
    }

    public final void s(int i) {
        nj njVar = this.d.get(i);
        if (f()) {
            njVar.h();
        }
        a aVar = new a(njVar, i);
        this.e.add(i, aVar);
        int i2 = i + 1;
        for (int i3 = i2; i3 < this.e.size(); i3++) {
            ((a) this.e.get(i3)).b = i3;
        }
        int c = njVar.c();
        this.f.add(-1);
        r(i2);
        this.h += c;
        j(q(i), c);
        njVar.d(aVar);
    }

    public final void t() {
        int i = this.h;
        if (i > 0) {
            l(0, i);
        }
        this.e = new ArrayList(this.d.size());
        ArrayList arrayList = new ArrayList(this.d.size() + 1);
        this.f = arrayList;
        arrayList.add(0);
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            nj njVar = this.d.get(i2);
            this.h += this.d.get(i2).c();
            a aVar = new a(njVar, i2);
            this.e.add(aVar);
            njVar.d(aVar);
            this.f.add(Integer.valueOf(this.h));
        }
        this.g = this.d.size() + 1;
        int i3 = this.h;
        if (i3 > 0) {
            j(0, i3);
        }
    }

    public final void u(List<nj> list) {
        b bVar = this.i;
        if (bVar != null) {
            ((g) this.d).j(bVar);
            this.i = null;
            if ((this.d instanceof ea) && f()) {
                ((ea) this.d).g();
            }
        }
        this.d = list;
    }

    public oj(f fVar, p70 p70Var) {
        this.h = 0;
        eb0 eb0Var = new eb0(fVar, p70Var);
        if (eb0Var == this.d) {
            return;
        }
        u(eb0Var);
        b bVar = new b();
        this.i = bVar;
        eb0Var.l(bVar);
        if (f()) {
            eb0Var.h();
        }
        t();
    }
}