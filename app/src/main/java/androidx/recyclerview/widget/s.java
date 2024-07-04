package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class s extends t {
    public s(RecyclerView.o oVar) {
        super(oVar);
    }

    @Override // androidx.recyclerview.widget.t
    public final int b(View view) {
        this.a.getClass();
        return RecyclerView.o.F(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.t
    public final int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.p) view.getLayoutParams()).Q;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.t
    public final int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.p) view.getLayoutParams()).Q;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.t
    public final int e(View view) {
        this.a.getClass();
        return (view.getTop() - RecyclerView.o.Q(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.t
    public final int f() {
        return this.a.e0;
    }

    @Override // androidx.recyclerview.widget.t
    public final int g() {
        RecyclerView.o oVar = this.a;
        return oVar.e0 - oVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.t
    public final int h() {
        return this.a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.t
    public final int i() {
        return this.a.c0;
    }

    @Override // androidx.recyclerview.widget.t
    public final int j() {
        return this.a.b0;
    }

    @Override // androidx.recyclerview.widget.t
    public final int k() {
        return this.a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.t
    public final int l() {
        RecyclerView.o oVar = this.a;
        return (oVar.e0 - oVar.getPaddingTop()) - this.a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.t
    public final int n(View view) {
        this.a.R(view, this.c);
        return this.c.bottom;
    }

    @Override // androidx.recyclerview.widget.t
    public final int o(View view) {
        this.a.R(view, this.c);
        return this.c.top;
    }

    @Override // androidx.recyclerview.widget.t
    public final void p(int i) {
        this.a.W(i);
    }
}