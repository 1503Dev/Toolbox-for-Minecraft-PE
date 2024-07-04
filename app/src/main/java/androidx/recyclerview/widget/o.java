package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.z {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public o(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view, RecyclerView.z.a aVar) {
        int i;
        RecyclerView.o oVar;
        int i2;
        PointF pointF;
        RecyclerView.o oVar2;
        int ceil;
        PointF pointF2 = this.k;
        int i3 = -1;
        int i4 = 0;
        if (pointF2 != null) {
            float f = pointF2.x;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    i = 1;
                } else {
                    i = -1;
                }
                oVar = this.c;
                if (oVar == null && oVar.o()) {
                    RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                    i2 = e((view.getLeft() - RecyclerView.o.L(view)) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, RecyclerView.o.O(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, oVar.getPaddingLeft(), oVar.d0 - oVar.getPaddingRight(), i);
                } else {
                    i2 = 0;
                }
                pointF = this.k;
                if (pointF != null) {
                    float f2 = pointF.y;
                    if (f2 != 0.0f) {
                        if (f2 > 0.0f) {
                            i3 = 1;
                        }
                        oVar2 = this.c;
                        if (oVar2 != null && oVar2.p()) {
                            RecyclerView.p pVar2 = (RecyclerView.p) view.getLayoutParams();
                            i4 = e((view.getTop() - RecyclerView.o.Q(view)) - ((ViewGroup.MarginLayoutParams) pVar2).topMargin, RecyclerView.o.F(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin, oVar2.getPaddingTop(), oVar2.e0 - oVar2.getPaddingBottom(), i3);
                        }
                        double g = g((int) Math.sqrt((i4 * i4) + (i2 * i2)));
                        Double.isNaN(g);
                        Double.isNaN(g);
                        ceil = (int) Math.ceil(g / 0.3356d);
                        if (ceil > 0) {
                            int i5 = -i4;
                            DecelerateInterpolator decelerateInterpolator = this.j;
                            aVar.a = -i2;
                            aVar.b = i5;
                            aVar.c = ceil;
                            aVar.e = decelerateInterpolator;
                            aVar.f = true;
                            return;
                        }
                        return;
                    }
                }
                i3 = 0;
                oVar2 = this.c;
                if (oVar2 != null) {
                    RecyclerView.p pVar22 = (RecyclerView.p) view.getLayoutParams();
                    i4 = e((view.getTop() - RecyclerView.o.Q(view)) - ((ViewGroup.MarginLayoutParams) pVar22).topMargin, RecyclerView.o.F(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) pVar22).bottomMargin, oVar2.getPaddingTop(), oVar2.e0 - oVar2.getPaddingBottom(), i3);
                }
                double g2 = g((int) Math.sqrt((i4 * i4) + (i2 * i2)));
                Double.isNaN(g2);
                Double.isNaN(g2);
                ceil = (int) Math.ceil(g2 / 0.3356d);
                if (ceil > 0) {
                }
            }
        }
        i = 0;
        oVar = this.c;
        if (oVar == null) {
        }
        i2 = 0;
        pointF = this.k;
        if (pointF != null) {
        }
        i3 = 0;
        oVar2 = this.c;
        if (oVar2 != null) {
        }
        double g22 = g((int) Math.sqrt((i4 * i4) + (i2 * i2)));
        Double.isNaN(g22);
        Double.isNaN(g22);
        ceil = (int) Math.ceil(g22 / 0.3356d);
        if (ceil > 0) {
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int g(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = f(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }
}