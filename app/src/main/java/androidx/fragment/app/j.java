package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class j implements Runnable {
    public final /* synthetic */ c P;
    public final /* synthetic */ c Q;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ View S;
    public final /* synthetic */ as T;
    public final /* synthetic */ Rect U;

    public j(c cVar, c cVar2, boolean z, e7 e7Var, View view, as asVar, Rect rect) {
        this.P = cVar;
        this.Q = cVar2;
        this.R = z;
        this.S = view;
        this.T = asVar;
        this.U = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.P;
        c cVar2 = this.Q;
        if (this.R) {
            cVar2.getClass();
        } else {
            cVar.getClass();
        }
        View view = this.S;
        if (view != null) {
            as asVar = this.T;
            Rect rect = this.U;
            asVar.getClass();
            as.i(view, rect);
        }
    }
}