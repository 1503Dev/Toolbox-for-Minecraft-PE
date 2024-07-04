package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.nj;

/* renamed from: fj  reason: default package */
public class fj extends RecyclerView.g<j41> implements nj.a {
    public nj c;
    public int d = 0;
    public boolean e = false;

    @Override // defpackage.nj.a
    public final void a(int i, int i2) {
        this.a.e(i, i2);
    }

    @Override // defpackage.nj.a
    public final void b(int i, int i2) {
        this.a.d(i, i2);
    }

    @Override // defpackage.nj.a
    public final void c(int i, int i2, int i3) {
        if (i3 == 1) {
            this.a.c(i, i2);
            return;
        }
        this.a.f(i, i3);
        this.a.e(i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int d() {
        return this.c.c();
    }

    @Override // defpackage.nj.a
    public final void e(int i, int i2) {
        this.a.f(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int g(int i) {
        return this.c.e(i).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void h() {
        nj njVar;
        int i = this.d;
        this.d = i + 1;
        if (i == 0 && (njVar = this.c) != null && this.e) {
            njVar.h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void i(j41 j41Var, int i) {
        j41Var.B(this.c.getItem(i), this.c.a(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.d0 j(RecyclerView recyclerView, int i) {
        return ((l41) l41.c.get(Integer.valueOf(i))).a(recyclerView.getContext(), recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void k() {
        nj njVar;
        int i = this.d - 1;
        this.d = i;
        if (i == 0 && (njVar = this.c) != null && this.e) {
            njVar.g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void l(j41 j41Var) {
        j41Var.C();
    }

    public final void m(j9 j9Var) {
        if (this.c != null) {
            j9Var.b(this);
        }
        nj njVar = this.c;
        if (njVar != null && this.d > 0 && this.e) {
            njVar.g();
        }
        this.c = j9Var;
        this.e = true;
        if (this.d > 0) {
            j9Var.h();
        }
        j9Var.d(this);
        this.a.b();
    }
}