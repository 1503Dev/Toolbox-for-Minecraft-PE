package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: ku  reason: default package */
public abstract class ku extends q41<View> {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public ku() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    public ku(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout v;
        int i4;
        n61 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (v = v(coordinatorLayout.d(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (v.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a.g().d + lastWindowInsets.a();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int x = (x(v) + size) - v.getMeasuredHeight();
            if (i5 == -1) {
                i4 = 1073741824;
            } else {
                i4 = RecyclerView.UNDEFINED_DURATION;
            }
            coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec(x, i4));
            return true;
        }
        return false;
    }

    @Override // defpackage.q41
    public final void u(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout v = v(coordinatorLayout.d(view));
        int i3 = 0;
        if (v != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, v.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((v.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            n61 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.a.g().a + rect.left;
                    rect.right -= lastWindowInsets.a.g().c;
                }
            }
            Rect rect2 = this.d;
            int i4 = fVar.c;
            if (i4 == 0) {
                i2 = 8388659;
            } else {
                i2 = i4;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.f != 0) {
                float w = w(v);
                int i5 = this.f;
                i3 = p5.f((int) (w * i5), 0, i5);
            }
            view.layout(rect2.left, rect2.top - i3, rect2.right, rect2.bottom - i3);
            i3 = rect2.top - v.getBottom();
        } else {
            coordinatorLayout.q(view, i);
        }
        this.e = i3;
    }

    public abstract AppBarLayout v(ArrayList arrayList);

    public float w(View view) {
        return 1.0f;
    }

    public int x(View view) {
        return view.getMeasuredHeight();
    }
}