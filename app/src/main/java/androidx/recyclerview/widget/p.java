package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class p extends x {
    public s d;
    public r e;

    public static View d(RecyclerView.o oVar, t tVar) {
        int H = oVar.H();
        View view = null;
        if (H == 0) {
            return null;
        }
        int l = (tVar.l() / 2) + tVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < H; i2++) {
            View G = oVar.G(i2);
            int abs = Math.abs(((tVar.c(G) / 2) + tVar.e(G)) - l);
            if (abs < i) {
                view = G;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.x
    public final int[] a(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.o()) {
            t e = e(oVar);
            iArr[0] = ((e.c(view) / 2) + e.e(view)) - ((e.l() / 2) + e.k());
        } else {
            iArr[0] = 0;
        }
        if (oVar.p()) {
            t f = f(oVar);
            iArr[1] = ((f.c(view) / 2) + f.e(view)) - ((f.l() / 2) + f.k());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(RecyclerView.o oVar, t tVar, int i, int i2) {
        int i3;
        int max;
        this.b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int H = oVar.H();
        float f = 1.0f;
        if (H != 0) {
            View view = null;
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            for (int i6 = 0; i6 < H; i6++) {
                View G = oVar.G(i6);
                int M = RecyclerView.o.M(G);
                if (M != -1) {
                    if (M < i4) {
                        view = G;
                        i4 = M;
                    }
                    if (M > i5) {
                        view2 = G;
                        i5 = M;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(tVar.b(view), tVar.b(view2)) - Math.min(tVar.e(view), tVar.e(view2))) != 0) {
                f = (max * 1.0f) / ((i5 - i4) + 1);
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        if (Math.abs(iArr[0]) > Math.abs(iArr[1])) {
            i3 = iArr[0];
        } else {
            i3 = iArr[1];
        }
        return Math.round(i3 / f);
    }

    public final t e(RecyclerView.o oVar) {
        r rVar = this.e;
        if (rVar == null || rVar.a != oVar) {
            this.e = new r(oVar);
        }
        return this.e;
    }

    public final t f(RecyclerView.o oVar) {
        s sVar = this.d;
        if (sVar == null || sVar.a != oVar) {
            this.d = new s(oVar);
        }
        return this.d;
    }
}