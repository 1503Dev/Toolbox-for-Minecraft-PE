package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class y extends o {
    public final /* synthetic */ x q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, Context context) {
        super(context);
        this.q = xVar;
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.z
    public final void c(View view, RecyclerView.z.a aVar) {
        x xVar = this.q;
        RecyclerView recyclerView = xVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] a = xVar.a(recyclerView.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        double g = g(Math.max(Math.abs(i), Math.abs(i2)));
        Double.isNaN(g);
        Double.isNaN(g);
        int ceil = (int) Math.ceil(g / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            aVar.a = i;
            aVar.b = i2;
            aVar.c = ceil;
            aVar.e = decelerateInterpolator;
            aVar.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.o
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}