package androidx.recyclerview.widget;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class x extends RecyclerView.r {
    public RecyclerView a;
    public Scroller b;
    public final a c = new a();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends RecyclerView.t {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                x.this.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public abstract int[] a(RecyclerView.o oVar, View view);

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        RecyclerView.o layoutManager;
        View view;
        t e;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        p pVar = (p) this;
        if (layoutManager.p()) {
            e = pVar.f(layoutManager);
        } else if (layoutManager.o()) {
            e = pVar.e(layoutManager);
        } else {
            view = null;
            if (view != null) {
                return;
            }
            int[] a2 = a(layoutManager, view);
            int i = a2[0];
            if (i != 0 || a2[1] != 0) {
                this.a.smoothScrollBy(i, a2[1]);
                return;
            }
            return;
        }
        view = p.d(layoutManager, e);
        if (view != null) {
        }
    }
}