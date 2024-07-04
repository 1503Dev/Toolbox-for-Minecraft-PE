package defpackage;

import androidx.databinding.g;

/* renamed from: db0  reason: default package */
public final class db0<T> extends ga {
    public final g<T> R;
    public final db0<T>.a S = new a();
    public int T = 0;

    /* renamed from: db0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends g.a<g<T>> {
        public a() {
        }

        @Override // androidx.databinding.g.a
        public final void a(g<T> gVar) {
            db0.this.F();
        }

        @Override // androidx.databinding.g.a
        public final void b(g<T> gVar, int i, int i2) {
        }

        @Override // androidx.databinding.g.a
        public final void c(g<T> gVar, int i, int i2) {
            db0.this.F();
        }

        @Override // androidx.databinding.g.a
        public final void d(g<T> gVar, int i, int i2, int i3) {
        }

        @Override // androidx.databinding.g.a
        public final void e(g<T> gVar, int i, int i2) {
            db0.this.F();
        }
    }

    public db0(cb0 cb0Var) {
        this.R = cb0Var;
    }

    @Override // defpackage.bb0
    public final int H() {
        return this.R.size();
    }

    @Override // defpackage.bb0
    public final void I(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ea
    public final void g() {
        int i = this.T - 1;
        this.T = i;
        if (i == 0) {
            g<T> gVar = this.R;
            if (gVar instanceof ea) {
                ((ea) gVar).g();
            }
            this.R.j(this.S);
        }
    }

    @Override // defpackage.ea
    public final void h() {
        int i = this.T;
        this.T = i + 1;
        if (i == 0) {
            this.R.l(this.S);
            g<T> gVar = this.R;
            if (gVar instanceof ea) {
                ((ea) gVar).h();
            }
            F();
        }
    }
}