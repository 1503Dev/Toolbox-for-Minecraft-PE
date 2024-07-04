package defpackage;

import androidx.databinding.d;
import androidx.databinding.f;
import androidx.databinding.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: eb0  reason: default package */
public final class eb0<From, To> extends uj0<To> implements t01<To> {
    public final g<From> Q;
    public final ArrayList<To> R;
    public final p70 S;
    public d T;
    public final eb0<From, To>.a U;
    public int V;

    /* renamed from: eb0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends g.a<g<From>> {
        public a() {
        }

        @Override // androidx.databinding.g.a
        public final void a(g<From> gVar) {
            eb0.this.y();
            eb0 eb0Var = eb0.this;
            d dVar = eb0Var.T;
            if (dVar != null) {
                dVar.j(eb0Var, 0, null);
            }
        }

        @Override // androidx.databinding.g.a
        public final void b(g<From> gVar, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                eb0 eb0Var = eb0.this;
                int i4 = i + i3;
                eb0Var.R.set(i4, eb0Var.S.a(eb0Var.Q.get(i4)));
            }
            eb0 eb0Var2 = eb0.this;
            d dVar = eb0Var2.T;
            if (dVar != null) {
                dVar.j(eb0Var2, 1, d.i(i, 0, i2));
            }
        }

        @Override // androidx.databinding.g.a
        public final void c(g<From> gVar, int i, int i2) {
            if (i2 == 1) {
                eb0 eb0Var = eb0.this;
                eb0Var.R.add(i, eb0Var.S.a(eb0Var.Q.get(i)));
            } else {
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    eb0 eb0Var2 = eb0.this;
                    objArr[i3] = eb0Var2.S.a(eb0Var2.Q.get(i + i3));
                }
                eb0.this.R.addAll(i, Arrays.asList(objArr));
            }
            eb0 eb0Var3 = eb0.this;
            d dVar = eb0Var3.T;
            if (dVar != null) {
                dVar.j(eb0Var3, 2, d.i(i, 0, i2));
            }
        }

        @Override // androidx.databinding.g.a
        public final void d(g<From> gVar, int i, int i2, int i3) {
            List<To> subList = eb0.this.R.subList(i, i + i3);
            ArrayList arrayList = new ArrayList(subList);
            subList.clear();
            eb0.this.R.addAll(i2, arrayList);
            eb0 eb0Var = eb0.this;
            d dVar = eb0Var.T;
            if (dVar != null) {
                dVar.j(eb0Var, 3, d.i(i, i2, i3));
            }
        }

        @Override // androidx.databinding.g.a
        public final void e(g<From> gVar, int i, int i2) {
            eb0.this.R.subList(i, i + i2).clear();
            eb0 eb0Var = eb0.this;
            d dVar = eb0Var.T;
            if (dVar != null) {
                dVar.j(eb0Var, 4, d.i(i, 0, i2));
            }
        }
    }

    public eb0(f fVar, p70 p70Var) {
        super(new ArrayList());
        this.U = new a();
        this.V = 0;
        this.Q = fVar;
        this.S = p70Var;
        this.R = (ArrayList) this.P;
    }

    @Override // defpackage.ea
    public final void g() {
        int i = this.V - 1;
        this.V = i;
        if (i == 0) {
            g<From> gVar = this.Q;
            if (gVar instanceof ea) {
                ((ea) gVar).g();
            }
            this.Q.j(this.U);
            this.R.clear();
        }
    }

    @Override // defpackage.ea
    public final void h() {
        int i = this.V;
        this.V = i + 1;
        if (i == 0) {
            this.Q.l(this.U);
            g<From> gVar = this.Q;
            if (gVar instanceof ea) {
                ((ea) gVar).h();
            }
            y();
        }
    }

    @Override // defpackage.t01
    public final void i(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0 + i2;
            this.R.set(i3, this.S.a(this.Q.get(i3)));
        }
        d dVar = this.T;
        if (dVar != null) {
            dVar.j(this, 1, d.i(0, 0, i));
        }
    }

    @Override // androidx.databinding.g
    public final void j(g.a<? extends g<To>> aVar) {
        d dVar = this.T;
        if (dVar != null) {
            dVar.f(aVar);
        }
    }

    @Override // androidx.databinding.g
    public final void l(g.a<? extends g<To>> aVar) {
        if (this.T == null) {
            this.T = new d();
        }
        this.T.a(aVar);
    }

    public final void y() {
        this.R.clear();
        this.R.ensureCapacity(this.Q.size());
        for (int i = 0; i < this.Q.size(); i++) {
            this.R.add(this.S.a(this.Q.get(i)));
        }
        d dVar = this.T;
        if (dVar != null) {
            dVar.j(this, 0, null);
        }
    }
}