package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.b;
import java.util.Calendar;

/* renamed from: c40  reason: default package */
public final class c40 extends RecyclerView.n {
    public final Calendar a = zf.b(null);
    public final Calendar b = zf.b(null);
    public final /* synthetic */ b c;

    public c40(b bVar) {
        this.c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof i91) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            i91 i91Var = (i91) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (pd0<Long, Long> pd0Var : this.c.J0.j()) {
                pd0Var.getClass();
            }
        }
    }
}