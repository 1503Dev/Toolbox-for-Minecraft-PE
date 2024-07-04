package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: xr  reason: default package */
public final class xr implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ ArrayList Q;
    public final /* synthetic */ ArrayList R;
    public final /* synthetic */ ArrayList S;
    public final /* synthetic */ ArrayList T;

    public xr(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.P = i;
        this.Q = arrayList;
        this.R = arrayList2;
        this.S = arrayList3;
        this.T = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.P; i++) {
            a41.o((View) this.Q.get(i), (String) this.R.get(i));
            a41.o((View) this.S.get(i), (String) this.T.get(i));
        }
    }
}