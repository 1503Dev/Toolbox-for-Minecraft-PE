package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class v {
    public static int a(RecyclerView.a0 a0Var, t tVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.H() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(tVar.l(), tVar.b(view2) - tVar.e(view));
        }
        return Math.abs(RecyclerView.o.M(view) - RecyclerView.o.M(view2)) + 1;
    }

    public static int b(RecyclerView.a0 a0Var, t tVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.H() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.b() - Math.max(RecyclerView.o.M(view), RecyclerView.o.M(view2))) - 1) : Math.max(0, Math.min(RecyclerView.o.M(view), RecyclerView.o.M(view2)));
        if (z) {
            return Math.round((max * (Math.abs(tVar.b(view2) - tVar.e(view)) / (Math.abs(RecyclerView.o.M(view) - RecyclerView.o.M(view2)) + 1))) + (tVar.k() - tVar.e(view)));
        }
        return max;
    }

    public static int c(RecyclerView.a0 a0Var, t tVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.H() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((tVar.b(view2) - tVar.e(view)) / (Math.abs(RecyclerView.o.M(view) - RecyclerView.o.M(view2)) + 1)) * a0Var.b());
        }
        return a0Var.b();
    }
}