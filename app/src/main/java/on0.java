package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: on0  reason: default package */
public final class on0 extends ViewGroup {
    public q2 getAdListener() {
        throw null;
    }

    public h3 getAdSize() {
        throw null;
    }

    public String getAdUnitId() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        h3 h3Var;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                h3Var = getAdSize();
            } catch (NullPointerException e) {
                sv2.e("Unable to retrieve ad size.", e);
                h3Var = null;
            }
            if (h3Var != null) {
                Context context = getContext();
                int b = h3Var.b(context);
                i3 = h3Var.a(context);
                i4 = b;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(q2 q2Var) {
        throw null;
    }

    public void setAdSize(h3 h3Var) {
        throw null;
    }

    public void setAdUnitId(String str) {
        throw null;
    }
}