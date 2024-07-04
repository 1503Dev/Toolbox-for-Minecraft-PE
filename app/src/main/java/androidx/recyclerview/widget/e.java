package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements Runnable {
    public final /* synthetic */ ArrayList P;
    public final /* synthetic */ k Q;

    public e(k kVar, ArrayList arrayList) {
        this.Q = kVar;
        this.P = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) it.next();
            k kVar = this.Q;
            kVar.getClass();
            View view = d0Var.P;
            ViewPropertyAnimator animate = view.animate();
            kVar.o.add(d0Var);
            animate.alpha(1.0f).setDuration(kVar.c).setListener(new g(view, animate, kVar, d0Var)).start();
        }
        this.P.clear();
        this.Q.l.remove(this.P);
    }
}