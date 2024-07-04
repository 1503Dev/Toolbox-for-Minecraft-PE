package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements Runnable {
    public final /* synthetic */ ArrayList P;
    public final /* synthetic */ k Q;

    public c(k kVar, ArrayList arrayList) {
        this.Q = kVar;
        this.P = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.Q;
            RecyclerView.d0 d0Var = bVar.a;
            int i = bVar.b;
            int i2 = bVar.c;
            int i3 = bVar.d;
            int i4 = bVar.e;
            kVar.getClass();
            View view = d0Var.P;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.p.add(d0Var);
            animate.setDuration(kVar.e).setListener(new h(kVar, d0Var, i5, view, i6, animate)).start();
        }
        this.P.clear();
        this.Q.m.remove(this.P);
    }
}