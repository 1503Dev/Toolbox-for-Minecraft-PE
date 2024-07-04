package defpackage;

import android.view.View;
import androidx.fragment.app.c;
import androidx.fragment.app.l;
import java.util.ArrayList;

/* renamed from: ur  reason: default package */
public final class ur implements Runnable {
    public final /* synthetic */ Object P;
    public final /* synthetic */ as Q;
    public final /* synthetic */ View R;
    public final /* synthetic */ c S;
    public final /* synthetic */ ArrayList T;
    public final /* synthetic */ ArrayList U;
    public final /* synthetic */ ArrayList V;
    public final /* synthetic */ Object W;

    public ur(Object obj, as asVar, View view, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.P = obj;
        this.Q = asVar;
        this.R = view;
        this.S = cVar;
        this.T = arrayList;
        this.U = arrayList2;
        this.V = arrayList3;
        this.W = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.P;
        if (obj != null) {
            this.Q.l(this.R, obj);
            this.U.addAll(l.f(this.Q, this.P, this.S, this.T, this.R));
        }
        if (this.V != null) {
            if (this.W != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.R);
                this.Q.m(this.W, this.V, arrayList);
            }
            this.V.clear();
            this.V.add(this.R);
        }
    }
}