package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: t41  reason: default package */
public final class t41 extends ViewGroup {
    public static final int[] m0 = {16842931};
    public Parcelable P;
    public int Q;
    public Drawable R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;
    public boolean a0;
    public int b0;
    public float c0;
    public float d0;
    public float e0;
    public int f0;
    public VelocityTracker g0;
    public boolean h0;
    public ArrayList i0;
    public f j0;
    public ArrayList k0;
    public int l0;

    /* renamed from: t41$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            cVar.getClass();
            cVar2.getClass();
            return 0;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: t41$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public @interface b {
    }

    /* renamed from: t41$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
    }

    /* renamed from: t41$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t41.m0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: t41$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface e {
        void a(t41 t41Var);
    }

    /* renamed from: t41$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface f {
        void a(int i);
    }

    /* renamed from: t41$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class g extends c0 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int R;
        public Parcelable S;

        /* renamed from: t41$g$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new g[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
            this.R = parcel.readInt();
            this.S = parcel.readParcelable(classLoader);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder b = e5.b("FragmentPager.SavedState{");
            b.append(Integer.toHexString(System.identityHashCode(this)));
            b.append(" position=");
            b.append(this.R);
            b.append("}");
            return b.toString();
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            parcel.writeInt(this.R);
            parcel.writeParcelable(this.S, i);
        }
    }

    static {
        new a();
    }

    public static boolean b(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && b(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.U != z) {
            this.U = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r3 >= r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r3 <= r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        View findNextFocus;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (parent instanceof ViewGroup) {
                        if (parent == this) {
                            z = true;
                            break;
                        }
                        parent = parent.getParent();
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder b2 = e5.b("arrowScroll tried to find focus based on non-child current focused view ");
                    b2.append(sb.toString());
                    Log.e("ViewPager", b2.toString());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null && findNextFocus != findFocus) {
                if (i != 17) {
                    int i2 = c(findNextFocus).left;
                    int i3 = c(findFocus).left;
                    if (findFocus != null) {
                    }
                    z2 = findNextFocus.requestFocus();
                } else if (i == 66) {
                    int i4 = c(findNextFocus).left;
                    int i5 = c(findFocus).left;
                    if (findFocus != null) {
                    }
                    z2 = findNextFocus.requestFocus();
                }
            }
            if (z2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z2;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
            if (i != 17) {
            }
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3).getVisibility() == 0) {
                    throw null;
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i).getVisibility() == 0) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new d();
        }
        d dVar = (d) layoutParams;
        boolean z2 = dVar.a;
        if (view.getClass().getAnnotation(b.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        dVar.a = z3;
        if (this.T) {
            if (!z3) {
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    public final Rect c(View view) {
        Rect rect = new Rect();
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        int i;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                z = a(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                z = a(1);
                            }
                        }
                    } else if (!keyEvent.hasModifiers(2)) {
                        i = 66;
                        z = a(i);
                    }
                } else if (!keyEvent.hasModifiers(2)) {
                    i = 17;
                    z = a(i);
                }
                if (z) {
                    return false;
                }
            }
            z = false;
            if (z) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (getOverScrollMode() == 0) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.R;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d();
    }

    public nd0 getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.V;
    }

    public int getPageMargin() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.Q > 0 && this.R != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        boolean z;
        int action = motionEvent.getAction() & 255;
        int i = 0;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.W) {
                    return true;
                }
                if (this.a0) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f0) {
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            this.c0 = motionEvent.getX(i);
                            this.f0 = motionEvent.getPointerId(i);
                            VelocityTracker velocityTracker = this.g0;
                            if (velocityTracker != null) {
                                velocityTracker.clear();
                            }
                        }
                    }
                } else {
                    int i2 = this.f0;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        float x = motionEvent.getX(findPointerIndex);
                        float f3 = x - this.c0;
                        float abs = Math.abs(f3);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.e0);
                        if (f3 != 0.0f) {
                            float f4 = this.c0;
                            if ((f4 < this.b0 && f3 > 0.0f) || (f4 > getWidth() - this.b0 && f3 < 0.0f)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && b((int) f3, (int) x, (int) y, this, false)) {
                                this.c0 = x;
                                this.a0 = true;
                                return false;
                            }
                        }
                        float f5 = 0;
                        if (abs > f5 && abs * 0.5f > abs2) {
                            this.W = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            if (f3 > 0.0f) {
                                f2 = this.d0 + f5;
                            } else {
                                f2 = this.d0 - f5;
                            }
                            this.c0 = f2;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f5) {
                            this.a0 = true;
                        }
                        if (this.W) {
                            this.c0 = x;
                            getScrollX();
                            getClientWidth();
                            throw null;
                        }
                    }
                }
                if (this.g0 == null) {
                    this.g0 = VelocityTracker.obtain();
                }
                this.g0.addMovement(motionEvent);
                return this.W;
            }
            float x2 = motionEvent.getX();
            this.d0 = x2;
            this.c0 = x2;
            this.e0 = motionEvent.getY();
            this.f0 = motionEvent.getPointerId(0);
            this.a0 = false;
            throw null;
        }
        this.f0 = -1;
        this.W = false;
        this.a0 = false;
        VelocityTracker velocityTracker2 = this.g0;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.g0 = null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a) {
                    int i10 = dVar.b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                i5 = paddingLeft;
                            } else {
                                max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i12 == 16) {
                            if (i12 != 48) {
                                if (i12 != 80) {
                                    i6 = paddingTop;
                                } else {
                                    max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = max2;
                        i6 = paddingTop;
                        paddingTop = i14;
                        int i132 = paddingLeft + scrollX;
                        childAt.layout(i132, paddingTop, childAt.getMeasuredWidth() + i132, childAt.getMeasuredHeight() + paddingTop);
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = max;
                    i5 = paddingLeft;
                    paddingLeft = i15;
                    if (i12 == 16) {
                    }
                    int i142 = max2;
                    i6 = paddingTop;
                    paddingTop = i142;
                    int i1322 = paddingLeft + scrollX;
                    childAt.layout(i1322, paddingTop, childAt.getMeasuredWidth() + i1322, childAt.getMeasuredHeight() + paddingTop);
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8 && !((d) childAt2.getLayoutParams()).a) {
                throw null;
            }
        }
        if (!this.h0) {
            this.h0 = false;
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d dVar;
        d dVar2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.b0 = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.a) {
                int i6 = dVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z = true;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = RecyclerView.UNDEFINED_DURATION;
                if (z2) {
                    i3 = 1073741824;
                } else {
                    if (z) {
                        i9 = 1073741824;
                    }
                    i3 = RecyclerView.UNDEFINED_DURATION;
                }
                int i10 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i3 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i9;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i3), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.S = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.T = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.a)) {
                dVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.S);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            if (getChildAt(i2).getVisibility() == 0) {
                throw null;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.P);
        this.P = gVar.S;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.R = 0;
        return gVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.T) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(nd0 nd0Var) {
        ArrayList arrayList = this.k0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            ((e) this.k0.get(i)).a(this);
        }
    }

    public void setCurrentItem(int i) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.V) {
            this.V = i;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.j0 = fVar;
    }

    public void setPageMargin(int i) {
        this.Q = i;
        if (getWidth() > 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(cg.b(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.R = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.l0 == i) {
            return;
        }
        this.l0 = i;
        f fVar = this.j0;
        if (fVar != null) {
            fVar.a(i);
        }
        ArrayList arrayList = this.i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar2 = (f) this.i0.get(i2);
                if (fVar2 != null) {
                    fVar2.a(i);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.R;
    }
}