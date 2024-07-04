package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.f;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.f5;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class ActionBarOverlayLayout extends ViewGroup implements xj, g90, e90, f90 {
    public static final int[] t0 = {ih0.actionBarSize, 16842841};
    public int P;
    public int Q;
    public ContentFrameLayout R;
    public ActionBarContainer S;
    public yj T;
    public Drawable U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public int e0;
    public final Rect f0;
    public final Rect g0;
    public final Rect h0;
    public final Rect i0;
    public final Rect j0;
    public final Rect k0;
    public final Rect l0;
    public d m0;
    public OverScroller n0;
    public ViewPropertyAnimator o0;
    public final a p0;
    public final b q0;
    public final c r0;
    public final h90 s0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.o0 = null;
            actionBarOverlayLayout.c0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.o0 = null;
            actionBarOverlayLayout.c0 = false;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.o0 = actionBarOverlayLayout.S.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.p0);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.o0 = actionBarOverlayLayout.S.animate().translationY(-ActionBarOverlayLayout.this.S.getHeight()).setListener(ActionBarOverlayLayout.this.p0);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface d {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = 0;
        this.f0 = new Rect();
        this.g0 = new Rect();
        this.h0 = new Rect();
        this.i0 = new Rect();
        this.j0 = new Rect();
        this.k0 = new Rect();
        this.l0 = new Rect();
        this.p0 = new a();
        this.q0 = new b();
        this.r0 = new c();
        r(context);
        this.s0 = new h90();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        e eVar = (e) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.xj
    public final boolean a() {
        s();
        return this.T.a();
    }

    @Override // defpackage.xj
    public final void b(f fVar, f5.c cVar) {
        s();
        this.T.b(fVar, cVar);
    }

    @Override // defpackage.xj
    public final void c() {
        s();
        this.T.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // defpackage.xj
    public final boolean d() {
        s();
        return this.T.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.U == null || this.V) {
            return;
        }
        if (this.S.getVisibility() == 0) {
            i = (int) (this.S.getTranslationY() + this.S.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.U.setBounds(0, i, getWidth(), this.U.getIntrinsicHeight() + i);
        this.U.draw(canvas);
    }

    @Override // defpackage.xj
    public final boolean e() {
        s();
        return this.T.e();
    }

    @Override // defpackage.xj
    public final boolean f() {
        s();
        return this.T.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        s();
        WeakHashMap<View, String> weakHashMap = a41.a;
        getWindowSystemUiVisibility();
        boolean p = p(this.S, rect, false);
        this.i0.set(rect);
        Rect rect2 = this.i0;
        Rect rect3 = this.f0;
        Method method = c51.a;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        if (!this.j0.equals(this.i0)) {
            this.j0.set(this.i0);
            p = true;
        }
        if (!this.g0.equals(this.f0)) {
            this.g0.set(this.f0);
            p = true;
        }
        if (p) {
            requestLayout();
        }
        return true;
    }

    @Override // defpackage.xj
    public final boolean g() {
        s();
        return this.T.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.S;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h90 h90Var = this.s0;
        return h90Var.b | h90Var.a;
    }

    public CharSequence getTitle() {
        s();
        return this.T.getTitle();
    }

    @Override // defpackage.e90
    public final void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.e90
    public final void i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.e90
    public final void j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.xj
    public final void k(int i) {
        s();
        if (i == 2) {
            this.T.t();
        } else if (i == 5) {
            this.T.u();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // defpackage.xj
    public final void l() {
        s();
        this.T.h();
    }

    @Override // defpackage.f90
    public final void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.e90
    public final void n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.e90
    public final boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        a41.m(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        Rect rect;
        s();
        measureChildWithMargins(this.S, i, 0, i2, 0);
        e eVar = (e) this.S.getLayoutParams();
        int max = Math.max(0, this.S.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.S.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.S.getMeasuredState());
        WeakHashMap<View, String> weakHashMap = a41.a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.P;
            if (this.a0 && this.S.getTabContainer() != null) {
                measuredHeight += this.P;
            }
        } else {
            measuredHeight = this.S.getVisibility() != 8 ? this.S.getMeasuredHeight() : 0;
        }
        this.h0.set(this.f0);
        this.k0.set(this.i0);
        if (!this.W && !z) {
            rect = this.h0;
        } else {
            rect = this.k0;
        }
        rect.top += measuredHeight;
        rect.bottom += 0;
        p(this.R, this.h0, true);
        if (!this.l0.equals(this.k0)) {
            this.l0.set(this.k0);
            this.R.a(this.k0);
        }
        measureChildWithMargins(this.R, i, 0, i2, 0);
        e eVar2 = (e) this.R.getLayoutParams();
        int max3 = Math.max(max, this.R.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.R.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.R.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.b0 || !z) {
            return false;
        }
        this.n0.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.n0.getFinalY() > this.S.getHeight()) {
            z2 = true;
        }
        if (z2) {
            q();
            this.r0.run();
        } else {
            q();
            this.q0.run();
        }
        this.c0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.d0 + i2;
        this.d0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        k61 k61Var;
        x41 x41Var;
        this.s0.a = i;
        this.d0 = getActionBarHideOffset();
        q();
        d dVar = this.m0;
        if (dVar != null && (x41Var = (k61Var = (k61) dVar).t) != null) {
            x41Var.a();
            k61Var.t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.S.getVisibility() != 0) {
            return false;
        }
        return this.b0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onStopNestedScroll(View view) {
        if (this.b0 && !this.c0) {
            if (this.d0 <= this.S.getHeight()) {
                q();
                postDelayed(this.q0, 600L);
                return;
            }
            q();
            postDelayed(this.r0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i2 = this.e0 ^ i;
        this.e0 = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d dVar = this.m0;
        if (dVar != null) {
            ((k61) dVar).p = !z2;
            if (!z && z2) {
                k61 k61Var = (k61) dVar;
                if (!k61Var.q) {
                    k61Var.q = true;
                    k61Var.g(true);
                }
            } else {
                k61 k61Var2 = (k61) dVar;
                if (k61Var2.q) {
                    k61Var2.q = false;
                    k61Var2.g(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.m0 != null) {
            a41.m(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.Q = i;
        d dVar = this.m0;
        if (dVar != null) {
            ((k61) dVar).o = i;
        }
    }

    public final void q() {
        removeCallbacks(this.q0);
        removeCallbacks(this.r0);
        ViewPropertyAnimator viewPropertyAnimator = this.o0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(t0);
        this.P = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.U = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.V = context.getApplicationInfo().targetSdkVersion < 19;
        this.n0 = new OverScroller(context);
    }

    public final void s() {
        yj wrapper;
        if (this.R == null) {
            this.R = (ContentFrameLayout) findViewById(hi0.action_bar_activity_content);
            this.S = (ActionBarContainer) findViewById(hi0.action_bar_container);
            View findViewById = findViewById(hi0.action_bar);
            if (findViewById instanceof yj) {
                wrapper = (yj) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder b2 = e5.b("Can't make a decor toolbar out of ");
                b2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(b2.toString());
            }
            this.T = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.S.setTranslationY(-Math.max(0, Math.min(i, this.S.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.m0 = dVar;
        if (getWindowToken() != null) {
            ((k61) this.m0).o = this.Q;
            int i = this.e0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                a41.m(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.a0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.b0) {
            this.b0 = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.T.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.T.setIcon(drawable);
    }

    public void setLogo(int i) {
        s();
        this.T.q(i);
    }

    public void setOverlayMode(boolean z) {
        this.W = z;
        this.V = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.xj
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.T.setWindowCallback(callback);
    }

    @Override // defpackage.xj
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.T.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}