package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.l;
import java.util.ArrayList;

public final class k implements Runnable {
    public final /* synthetic */ as P;
    public final /* synthetic */ e7 Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ l.a S;
    public final /* synthetic */ ArrayList T;
    public final /* synthetic */ View U;
    public final /* synthetic */ c V;
    public final /* synthetic */ c W;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ ArrayList Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Rect a0;

    public k(as asVar, e7 e7Var, Object obj, l.a aVar, ArrayList arrayList, View view, c cVar, c cVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.P = asVar;
        this.Q = e7Var;
        this.R = obj;
        this.S = aVar;
        this.T = arrayList;
        this.U = view;
        this.V = cVar;
        this.W = cVar2;
        this.X = z;
        this.Y = arrayList2;
        this.Z = obj2;
        this.a0 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e7<String, View> c = l.c(this.P, this.Q, this.R, this.S);
        if (c != null) {
            this.T.addAll(c.values());
            this.T.add(this.U);
        }
        c cVar = this.V;
        c cVar2 = this.W;
        if (this.X) {
            cVar2.getClass();
        } else {
            cVar.getClass();
        }
        Object obj = this.R;
        if (obj != null) {
            this.P.s(obj, this.Y, this.T);
            View g = l.g(c, this.S, this.Z, this.X);
            if (g != null) {
                as asVar = this.P;
                Rect rect = this.a0;
                asVar.getClass();
                as.i(g, rect);
            }
        }
    }
}