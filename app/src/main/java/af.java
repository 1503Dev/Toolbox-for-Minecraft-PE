package defpackage;

import androidx.databinding.e;
import defpackage.nj;

/* renamed from: af  reason: default package */
public final class af<T> extends j9<T> {
    public ya0 d;
    public boolean e;
    public nj<T> f;
    public final af<T>.a g = new a();

    /* renamed from: af$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends e.a implements nj.a {
        public a() {
        }

        @Override // defpackage.nj.a
        public final void a(int i, int i2) {
            af afVar = af.this;
            if (afVar.e) {
                afVar.j(i, i2);
            }
        }

        @Override // defpackage.nj.a
        public final void b(int i, int i2) {
            af afVar = af.this;
            if (afVar.e) {
                afVar.i(i, i2);
            }
        }

        @Override // defpackage.nj.a
        public final void c(int i, int i2, int i3) {
            af afVar = af.this;
            if (afVar.e) {
                afVar.k(i, i2, i3);
            }
        }

        @Override // defpackage.nj.a
        public final void e(int i, int i2) {
            af afVar = af.this;
            if (afVar.e) {
                afVar.l(i, i2);
            }
        }

        @Override // androidx.databinding.e.a
        public final void g(int i, e eVar) {
            af afVar = af.this;
            boolean z = afVar.d.Q;
            if (z != afVar.e) {
                int c = afVar.f.c();
                if (z) {
                    afVar.j(0, c);
                } else {
                    afVar.l(0, c);
                }
                afVar.e = z;
            }
        }
    }

    public af(j9 j9Var, ya0 ya0Var) {
        this.f = j9Var;
        this.d = ya0Var;
        this.e = ya0Var.Q;
    }

    @Override // defpackage.j9, defpackage.nj
    public final Object a(int i) {
        return this.f.a(i);
    }

    @Override // defpackage.nj
    public final int c() {
        if (this.e) {
            return this.f.c();
        }
        return 0;
    }

    @Override // defpackage.nj
    public final l41<T> e(int i) {
        return this.f.e(i);
    }

    @Override // defpackage.nj
    public final T getItem(int i) {
        return this.f.getItem(i);
    }

    @Override // defpackage.j9
    public final void m() {
        this.f.d(this.g);
        this.f.h();
        this.d.a(this.g);
        ya0 ya0Var = this.d;
        if (ya0Var instanceof ea) {
            ((ea) ya0Var).h();
        }
        boolean z = this.d.Q;
        if (z != this.e) {
            int c = this.f.c();
            if (z) {
                j(0, c);
            } else {
                l(0, c);
            }
            this.e = z;
        }
    }

    @Override // defpackage.j9
    public final void n() {
        this.f.g();
        this.f.b(this.g);
        this.d.z(this.g);
        ya0 ya0Var = this.d;
        if (ya0Var instanceof ea) {
            ((ea) ya0Var).g();
        }
    }
}