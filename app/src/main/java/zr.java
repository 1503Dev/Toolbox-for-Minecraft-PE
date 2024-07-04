package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: zr  reason: default package */
public final class zr implements Runnable {
    public final /* synthetic */ ArrayList P;
    public final /* synthetic */ Map Q;

    public zr(ArrayList arrayList, e7 e7Var) {
        this.P = arrayList;
        this.Q = e7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.P.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.P.get(i);
            a41.o(view, (String) this.Q.get(a41.g(view)));
        }
    }
}