package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.s0;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements f90, c90 {
    public static final a s0 = new a();
    public static final int[] t0 = {16843130};
    public long P;
    public final Rect Q;
    public OverScroller R;
    public EdgeEffect S;
    public EdgeEffect T;
    public int U;
    public boolean V;
    public boolean W;
    public View a0;
    public boolean b0;
    public VelocityTracker c0;
    public boolean d0;
    public boolean e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public final int[] j0;
    public final int[] k0;
    public int l0;
    public int m0;
    public c n0;
    public final h90 o0;
    public final d90 p0;
    public float q0;
    public b r0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends h0 {
        @Override // defpackage.h0
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // defpackage.h0
        public final void d(View view, s0 s0Var) {
            int scrollRange;
            this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            s0Var.h(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                s0Var.a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    s0Var.b(s0.a.g);
                    s0Var.b(s0.a.k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    s0Var.b(s0.a.f);
                    s0Var.b(s0.a.l);
                }
            }
        }

        @Override // defpackage.h0
        public final boolean g(View view, int i, Bundle bundle) {
            if (super.g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i != 8192 && i != 16908344) {
                    if (i != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a(NestedScrollView nestedScrollView, int i);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public int P;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.P = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder b = e5.b("HorizontalScrollView.SavedState{");
            b.append(Integer.toHexString(System.identityHashCode(this)));
            b.append(" scrollPosition=");
            b.append(this.P);
            b.append("}");
            return b.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.P);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = eh0.nestedScrollViewStyle;
        this.Q = new Rect();
        this.V = true;
        this.W = false;
        this.a0 = null;
        this.b0 = false;
        this.e0 = true;
        this.i0 = -1;
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.R = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f0 = viewConfiguration.getScaledTouchSlop();
        this.g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.o0 = new h90();
        this.p0 = new d90(this);
        setNestedScrollingEnabled(true);
        a41.n(this, s0);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.q0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.q0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.q0;
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, view2);
    }

    public final boolean a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && p(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.Q);
            offsetDescendantRectToMyCoords(findNextFocus, this.Q);
            c(b(this.Q));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            c(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!p(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final void c(int i) {
        if (i != 0) {
            if (this.e0) {
                u(0, i, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.R.isFinished()) {
            return;
        }
        this.R.computeScrollOffset();
        int currY = this.R.getCurrY();
        int i = currY - this.m0;
        this.m0 = currY;
        int[] iArr = this.k0;
        boolean z = false;
        iArr[1] = 0;
        this.p0.c(0, i, iArr, null, 1);
        int i2 = i - this.k0[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            s(i2, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.k0;
            iArr2[1] = 0;
            this.p0.e(0, scrollY2, 0, i3, this.j0, 1, iArr2);
            i2 = i3 - this.k0[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                e();
                if (i2 < 0) {
                    if (this.S.isFinished()) {
                        edgeEffect = this.S;
                        edgeEffect.onAbsorb((int) this.R.getCurrVelocity());
                    }
                } else if (this.T.isFinished()) {
                    edgeEffect = this.T;
                    edgeEffect.onAbsorb((int) this.R.getCurrVelocity());
                }
            }
            this.R.abortAnimation();
            w(1);
        }
        if (!this.R.isFinished()) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            postInvalidateOnAnimation();
            return;
        }
        w(1);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d() {
        this.b0 = false;
        VelocityTracker velocityTracker = this.c0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.c0 = null;
        }
        w(0);
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.T.onRelease();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.p0.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.p0.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.p0.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.p0.e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.S != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.S.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21 && !getClipToPadding()) {
                    paddingLeft = 0;
                } else {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                }
                if (i2 >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.S.setSize(width, height);
                if (this.S.draw(canvas)) {
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (!this.T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i = 0 + getPaddingLeft();
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate(i - width2, max);
                canvas.rotate(180.0f, width2, 0.0f);
                this.T.setSize(width2, height2);
                if (this.T.draw(canvas)) {
                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public final void e() {
        if (getOverScrollMode() == 2) {
            this.S = null;
            this.T = null;
        } else if (this.S == null) {
            Context context = getContext();
            this.S = new EdgeEffect(context);
            this.T = new EdgeEffect(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        Rect rect;
        int i;
        this.Q.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
                if (z) {
                    if (!isFocused() || keyEvent.getKeyCode() == 4) {
                        return false;
                    }
                    View findFocus = findFocus();
                    if (findFocus == this) {
                        findFocus = null;
                    }
                    View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                    if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                        return true;
                    }
                    return false;
                } else if (keyEvent.getAction() != 0) {
                    return false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    int i2 = 33;
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                return false;
                            }
                            if (!keyEvent.isShiftPressed()) {
                                i2 = 130;
                            }
                            if (i2 == 130) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int height = getHeight();
                            if (z2) {
                                this.Q.top = getScrollY() + height;
                                int childCount = getChildCount();
                                if (childCount > 0) {
                                    View childAt2 = getChildAt(childCount - 1);
                                    int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                                    rect = this.Q;
                                    if (rect.top + height > paddingBottom) {
                                        i = paddingBottom - height;
                                        rect.top = i;
                                    }
                                }
                                Rect rect2 = this.Q;
                                int i3 = rect2.top;
                                int i4 = height + i3;
                                rect2.bottom = i4;
                                t(i2, i3, i4);
                                return false;
                            }
                            this.Q.top = getScrollY() - height;
                            rect = this.Q;
                            if (rect.top < 0) {
                                i = 0;
                                rect.top = i;
                            }
                            Rect rect22 = this.Q;
                            int i32 = rect22.top;
                            int i42 = height + i32;
                            rect22.bottom = i42;
                            t(i2, i32, i42);
                            return false;
                        } else if (!keyEvent.isAltPressed()) {
                            return a(130);
                        } else {
                            return k(130);
                        }
                    } else if (!keyEvent.isAltPressed()) {
                        return a(33);
                    } else {
                        return k(33);
                    }
                }
            }
        }
        z = false;
        if (z) {
        }
    }

    public final void g(int i) {
        if (getChildCount() > 0) {
            this.R.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            v(2, 1);
            this.m0 = getScrollY();
            WeakHashMap<View, String> weakHashMap = a41.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h90 h90Var = this.o0;
        return h90Var.b | h90Var.a;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // defpackage.e90
    public final void h(View view, View view2, int i, int i2) {
        h90 h90Var = this.o0;
        if (i2 == 1) {
            h90Var.b = i;
        } else {
            h90Var.a = i;
        }
        v(2, i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.p0.f(0) == null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.e90
    public final void i(View view, int i) {
        h90 h90Var = this.o0;
        if (i == 1) {
            h90Var.b = 0;
        } else {
            h90Var.a = 0;
        }
        w(i);
    }

    @Override // android.view.View, defpackage.c90
    public final boolean isNestedScrollingEnabled() {
        return this.p0.d;
    }

    @Override // defpackage.e90
    public final void j(View view, int i, int i2, int[] iArr, int i3) {
        this.p0.c(i, i2, iArr, null, i3);
    }

    public final boolean k(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.Q;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.Q.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.Q;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.Q;
        return t(i, rect3.top, rect3.bottom);
    }

    @Override // defpackage.f90
    public final void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        q(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // defpackage.e90
    public final void n(View view, int i, int i2, int i3, int i4, int i5) {
        q(i4, i5, null);
    }

    @Override // defpackage.e90
    public final boolean o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.b0) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 2 && this.b0) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            r(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.i0;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.U) > this.f0 && (2 & getNestedScrollAxes()) == 0) {
                                this.b0 = true;
                                this.U = y;
                                if (this.c0 == null) {
                                    this.c0 = VelocityTracker.obtain();
                                }
                                this.c0.addMovement(motionEvent);
                                this.l0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.b0 = false;
            this.i0 = -1;
            VelocityTracker velocityTracker = this.c0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c0 = null;
            }
            if (this.R.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    z = true;
                    if (z) {
                        this.b0 = false;
                        VelocityTracker velocityTracker2 = this.c0;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.c0 = null;
                        }
                    } else {
                        this.U = y2;
                        this.i0 = motionEvent.getPointerId(0);
                        VelocityTracker velocityTracker3 = this.c0;
                        if (velocityTracker3 == null) {
                            this.c0 = VelocityTracker.obtain();
                        } else {
                            velocityTracker3.clear();
                        }
                        this.c0.addMovement(motionEvent);
                        this.R.computeScrollOffset();
                        this.b0 = !this.R.isFinished();
                        v(2, 0);
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return this.b0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.V = false;
        View view = this.a0;
        if (view != null && l(view, this)) {
            View view2 = this.a0;
            view2.getDrawingRect(this.Q);
            offsetDescendantRectToMyCoords(view2, this.Q);
            int b2 = b(this.Q);
            if (b2 != 0) {
                scrollBy(0, b2);
            }
        }
        this.a0 = null;
        if (!this.W) {
            if (this.n0 != null) {
                scrollTo(getScrollX(), this.n0.P);
                this.n0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.W = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        g((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        q(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        h(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ p(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.n0 = cVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.P = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        b bVar = this.r0;
        if (bVar != null) {
            bVar.a(this, i2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !p(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.Q);
        offsetDescendantRectToMyCoords(findFocus, this.Q);
        c(b(this.Q));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r19.R.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f6, code lost:
        if (r19.R.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f8, code lost:
        r1 = defpackage.a41.a;
        postInvalidateOnAnimation();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        boolean z2;
        if (this.c0 == null) {
            this.c0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.l0);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                r(motionEvent);
                                this.U = (int) motionEvent.getY(motionEvent.findPointerIndex(this.i0));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.U = (int) motionEvent.getY(actionIndex);
                            this.i0 = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.b0) {
                            if (getChildCount() > 0) {
                            }
                        }
                        this.i0 = -1;
                        d();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.i0);
                    if (findPointerIndex == -1) {
                        StringBuilder b2 = e5.b("Invalid pointerId=");
                        b2.append(this.i0);
                        b2.append(" in onTouchEvent");
                        Log.e("NestedScrollView", b2.toString());
                    } else {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        int i = this.U - y;
                        if (!this.b0 && Math.abs(i) > this.f0) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.b0 = true;
                            int i2 = this.f0;
                            i = i > 0 ? i - i2 : i + i2;
                        }
                        if (this.b0) {
                            if (this.p0.c(0, i, this.k0, this.j0, 0)) {
                                i -= this.k0[1];
                                this.l0 += this.j0[1];
                            }
                            this.U = y - this.j0[1];
                            int scrollY = getScrollY();
                            int scrollRange = getScrollRange();
                            int overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 && (overScrollMode != 1 || scrollRange <= 0)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (s(i, 0, getScrollY(), scrollRange)) {
                                if (this.p0.f(0) != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    this.c0.clear();
                                }
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            int[] iArr = this.k0;
                            iArr[1] = 0;
                            this.p0.e(0, scrollY2, 0, i - scrollY2, this.j0, 0, iArr);
                            int i3 = this.U;
                            int i4 = this.j0[1];
                            this.U = i3 - i4;
                            this.l0 += i4;
                            if (z) {
                                int i5 = i - this.k0[1];
                                e();
                                int i6 = scrollY + i5;
                                if (i6 < 0) {
                                    eo.a(this.S, i5 / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                    if (!this.T.isFinished()) {
                                        edgeEffect = this.T;
                                        edgeEffect.onRelease();
                                    }
                                    edgeEffect2 = this.S;
                                    if (edgeEffect2 != null && (!edgeEffect2.isFinished() || !this.T.isFinished())) {
                                        WeakHashMap<View, String> weakHashMap = a41.a;
                                        postInvalidateOnAnimation();
                                    }
                                } else {
                                    if (i6 > scrollRange) {
                                        eo.a(this.T, i5 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                        if (!this.S.isFinished()) {
                                            edgeEffect = this.S;
                                            edgeEffect.onRelease();
                                        }
                                    }
                                    edgeEffect2 = this.S;
                                    if (edgeEffect2 != null) {
                                        WeakHashMap<View, String> weakHashMap2 = a41.a;
                                        postInvalidateOnAnimation();
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.c0;
                velocityTracker.computeCurrentVelocity(1000, this.h0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.i0);
                if (Math.abs(yVelocity) >= this.g0) {
                    int i7 = -yVelocity;
                    float f = i7;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        g(i7);
                    }
                }
                this.i0 = -1;
                d();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.R.isFinished();
            this.b0 = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.R.isFinished()) {
                this.R.abortAnimation();
                w(1);
            }
            this.U = (int) motionEvent.getY();
            this.i0 = motionEvent.getPointerId(0);
            v(2, 0);
        }
        VelocityTracker velocityTracker2 = this.c0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(View view, int i, int i2) {
        view.getDrawingRect(this.Q);
        offsetDescendantRectToMyCoords(view, this.Q);
        return this.Q.bottom + i >= getScrollY() && this.Q.top - i <= getScrollY() + i2;
    }

    public final void q(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.p0.d(scrollY2, i - scrollY2, i2, iArr);
    }

    public final void r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.i0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.U = (int) motionEvent.getY(i);
            this.i0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.c0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.V) {
            view2.getDrawingRect(this.Q);
            offsetDescendantRectToMyCoords(view2, this.Q);
            int b2 = b(this.Q);
            if (b2 != 0) {
                scrollBy(0, b2);
            }
        } else {
            this.a0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b2 = b(rect);
        if (b2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, b2);
            } else {
                u(0, b2, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.c0) != null) {
            velocityTracker.recycle();
            this.c0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.V = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i3 + i;
        int i7 = i4 + 0;
        if (i5 > 0 || i5 < 0) {
            z = true;
            i5 = 0;
        } else {
            z = false;
        }
        if (i6 > i7) {
            i6 = i7;
        } else if (i6 < 0) {
            i6 = 0;
        } else {
            z2 = false;
            if (z2) {
                if (this.p0.f(1) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.R.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
            }
            onOverScrolled(i5, i6, z, z2);
            if (z && !z2) {
                return false;
            }
        }
        z2 = true;
        if (z2) {
        }
        onOverScrolled(i5, i6, z, z2);
        return z ? true : true;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.d0) {
            this.d0 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.p0.g(z);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.r0 = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.e0 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return v(i, 0);
    }

    @Override // android.view.View, defpackage.c90
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 < top && bottom < i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 >= scrollY && i3 <= i5) {
            z2 = false;
        } else {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            c(i4);
            z2 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    public final void u(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.P > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.R;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z) {
                v(2, 1);
            } else {
                w(1);
            }
            this.m0 = getScrollY();
            WeakHashMap<View, String> weakHashMap = a41.a;
            postInvalidateOnAnimation();
        } else {
            if (!this.R.isFinished()) {
                this.R.abortAnimation();
                w(1);
            }
            scrollBy(i, i2);
        }
        this.P = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(int i, int i2) {
        return this.p0.h(i, i2);
    }

    public final void w(int i) {
        this.p0.i(i);
    }
}