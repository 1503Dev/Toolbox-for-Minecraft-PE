package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class d implements Runnable {
    public final /* synthetic */ ArrayList P;
    public final /* synthetic */ k Q;

    public d(k kVar, ArrayList arrayList) {
        this.Q = kVar;
        this.P = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.Q;
            kVar.getClass();
            RecyclerView.d0 d0Var = aVar.a;
            View view2 = null;
            if (d0Var == null) {
                view = null;
            } else {
                view = d0Var.P;
            }
            RecyclerView.d0 d0Var2 = aVar.b;
            if (d0Var2 != null) {
                view2 = d0Var2.P;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(kVar.f);
                kVar.r.add(aVar.a);
                duration.translationX(aVar.e - aVar.c);
                duration.translationY(aVar.f - aVar.d);
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                kVar.r.add(aVar.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
            }
        }
        this.P.clear();
        this.Q.n.remove(this.P);
    }
}