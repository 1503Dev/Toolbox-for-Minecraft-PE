package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

@CoordinatorLayout.d(Behavior.class)
public final class AppBarLayout extends LinearLayout {
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public int b0;
    public WeakReference<View> c0;
    public ValueAnimator d0;
    public int[] e0;
    public Drawable f0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends iu<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public int m;
        public boolean n;
        public float o;
        public WeakReference<View> p;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a extends c0 {
            public static final Parcelable.Creator<a> CREATOR = new C0022a();
            public int R;
            public float S;
            public boolean T;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
            public static class C0022a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new a[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.R = parcel.readInt();
                this.S = parcel.readFloat();
                this.T = parcel.readByte() != 0;
            }

            public a(AbsSavedState absSavedState) {
                super(absSavedState);
            }

            @Override // defpackage.c0, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.P, i);
                parcel.writeInt(this.R);
                parcel.writeFloat(this.S);
                parcel.writeByte(this.T ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.m = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = -1;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof c90) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (i3 < childCount) {
                    view = appBarLayout.getChildAt(i3);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    }
                    i3++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i4 = ((a) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    int minimumHeight = view.getMinimumHeight();
                    if (i2 <= 0 || (i4 & 12) == 0 ? !((i4 & 2) == 0 || (-i) < (view.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i) >= (view.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        z2 = true;
                        if (appBarLayout.a0) {
                            z2 = appBarLayout.c(D(coordinatorLayout));
                        }
                        boolean b = appBarLayout.b(z2);
                        if (!z) {
                            if (b) {
                                List list = (List) ((os0) coordinatorLayout.Q.b).getOrDefault(appBarLayout, null);
                                coordinatorLayout.S.clear();
                                if (list != null) {
                                    coordinatorLayout.S.addAll(list);
                                }
                                ArrayList arrayList = coordinatorLayout.S;
                                int size = arrayList.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size) {
                                        break;
                                    }
                                    CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) arrayList.get(i5)).getLayoutParams()).a;
                                    if (cVar instanceof ScrollingViewBehavior) {
                                        if (((ScrollingViewBehavior) cVar).f != 0) {
                                            z3 = true;
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                                if (!z3) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        appBarLayout.jumpDrawablesToCurrentState();
                    }
                }
                z2 = false;
                if (appBarLayout.a0) {
                }
                boolean b2 = appBarLayout.b(z2);
                if (!z) {
                }
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
        @Override // defpackage.iu
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            List list;
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y = y();
            if (i2 != 0 && y >= i2 && y <= i3) {
                int f = p5.f(i, i2, i3);
                if (y == f) {
                    return 0;
                }
                if (appBarLayout.T) {
                    int abs = Math.abs(f);
                    int childCount = appBarLayout.getChildCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= childCount) {
                            break;
                        }
                        View childAt = appBarLayout.getChildAt(i7);
                        a aVar = (a) childAt.getLayoutParams();
                        Interpolator interpolator = aVar.b;
                        if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                            if (interpolator != null) {
                                int i8 = aVar.a;
                                if ((i8 & 1) != 0) {
                                    i6 = childAt.getHeight() + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0;
                                    if ((i8 & 2) != 0) {
                                        WeakHashMap<View, String> weakHashMap = a41.a;
                                        i6 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i6 = 0;
                                }
                                WeakHashMap<View, String> weakHashMap2 = a41.a;
                                if (childAt.getFitsSystemWindows()) {
                                    i6 -= appBarLayout.getTopInset();
                                }
                                if (i6 > 0) {
                                    float f2 = i6;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f2) * f2)) * Integer.signum(f);
                                }
                            }
                        } else {
                            i7++;
                        }
                    }
                }
                i4 = f;
                r41 r41Var = this.a;
                int i9 = 1;
                if (r41Var != null) {
                    if (r41Var.d != i4) {
                        r41Var.d = i4;
                        r41Var.a();
                        z = true;
                        int i10 = y - f;
                        this.j = f - i4;
                        if (!z && appBarLayout.T && (list = (List) ((os0) coordinatorLayout.Q.b).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                            for (i5 = 0; i5 < list.size(); i5++) {
                                View view2 = (View) list.get(i5);
                                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
                                if (cVar != null) {
                                    cVar.d(coordinatorLayout, view2, appBarLayout);
                                }
                            }
                        }
                        appBarLayout.P = t();
                        if (!appBarLayout.willNotDraw()) {
                            WeakHashMap<View, String> weakHashMap3 = a41.a;
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        if (f < y) {
                            i9 = -1;
                        }
                        F(coordinatorLayout, appBarLayout, f, i9, false);
                        return i10;
                    }
                } else {
                    this.b = i4;
                }
                z = false;
                int i102 = y - f;
                this.j = f - i4;
                if (!z) {
                    while (i5 < list.size()) {
                    }
                }
                appBarLayout.P = t();
                if (!appBarLayout.willNotDraw()) {
                }
                if (f < y) {
                }
                F(coordinatorLayout, appBarLayout, f, i9, false);
                return i102;
            }
            this.j = 0;
            return 0;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(y() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int y = y();
            if (y == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(i4.e);
                this.l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(round, 600));
            this.l.setIntValues(y, i);
            this.l.start();
        }

        public final void E(CoordinatorLayout coordinatorLayout, T t) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int y = y();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i < childCount) {
                    View childAt = t.getChildAt(i);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    a aVar = (a) childAt.getLayoutParams();
                    if ((aVar.a & 32) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        top -= ((LinearLayout.LayoutParams) aVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    int i2 = -y;
                    if (top <= i2 && bottom >= i2) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i3 = aVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        WeakHashMap<View, String> weakHashMap = a41.a;
                        i5 += childAt2.getMinimumHeight();
                    } else {
                        if ((i3 & 5) == 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            WeakHashMap<View, String> weakHashMap2 = a41.a;
                            int minimumHeight = childAt2.getMinimumHeight() + i5;
                            if (y < minimumHeight) {
                                i4 = minimumHeight;
                            } else {
                                i5 = minimumHeight;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += ((LinearLayout.LayoutParams) aVar2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    }
                    if (y < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    C(coordinatorLayout, t, p5.f(i4, -t.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // defpackage.q41, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.g(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.n) {
                    round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    round = Math.round(childAt.getHeight() * this.o) + i3;
                }
                B(coordinatorLayout, appBarLayout, round);
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        C(coordinatorLayout, appBarLayout, i4);
                    } else {
                        B(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        C(coordinatorLayout, appBarLayout, 0);
                    } else {
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.U = 0;
            this.m = -1;
            int f = p5.f(t(), -appBarLayout.getTotalScrollRange(), 0);
            r41 r41Var = this.a;
            if (r41Var != null) {
                if (r41Var.d != f) {
                    r41Var.d = f;
                    r41Var.a();
                }
            } else {
                this.b = f;
            }
            F(coordinatorLayout, appBarLayout, t(), 0, true);
            appBarLayout.P = t();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                appBarLayout.postInvalidateOnAnimation();
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            int i3;
            int i4;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i != 0) {
                if (i < 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    i3 = i5;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i3 != i4) {
                    iArr[1] = A(coordinatorLayout, appBarLayout, y() - i, i3, i4);
                }
            }
            if (appBarLayout.a0) {
                appBarLayout.b(appBarLayout.c(view2));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = A(coordinatorLayout, appBarLayout, y() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof a)) {
                this.m = -1;
                return;
            }
            a aVar = (a) parcelable;
            this.m = aVar.R;
            this.o = aVar.S;
            this.n = aVar.T;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int t = t();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + t;
                if (childAt.getTop() + t <= 0 && bottom >= 0) {
                    a aVar = new a(absSavedState);
                    aVar.R = i;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z = true;
                    }
                    aVar.T = z;
                    aVar.S = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r2 != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z;
            boolean z2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = i & 2;
            boolean z3 = true;
            if (i3 != 0) {
                if (!appBarLayout.a0) {
                    if (appBarLayout.getTotalScrollRange() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z3 && (valueAnimator = this.l) != null) {
                    valueAnimator.cancel();
                }
                this.p = null;
                this.k = i2;
                return z3;
            }
            z3 = false;
            if (z3) {
                valueAnimator.cancel();
            }
            this.p = null;
            this.k = i2;
            return z3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.a0) {
                    appBarLayout.b(appBarLayout.c(view2));
                }
            }
            this.p = new WeakReference<>(view2);
        }

        @Override // defpackage.iu
        public final boolean v(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.p;
            if (weakReference != null) {
                View view2 = weakReference.get();
                return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        @Override // defpackage.iu
        public final int w(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // defpackage.iu
        public final int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // defpackage.iu
        public final int y() {
            return t() + this.j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.iu
        public final void z(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            E(coordinatorLayout, appBarLayout);
            if (appBarLayout.a0) {
                appBarLayout.b(appBarLayout.c(D(coordinatorLayout)));
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class ScrollingViewBehavior extends ku {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.ScrollingViewBehavior_Layout);
            this.f = obtainStyledAttributes.getDimensionPixelSize(ij0.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int f;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).j + this.e;
                if (this.f == 0) {
                    f = 0;
                } else {
                    float w = w(view2);
                    int i = this.f;
                    f = p5.f((int) (w * i), 0, i);
                }
                a41.j(view, bottom - f);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.a0) {
                    appBarLayout.b(appBarLayout.c(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList d = coordinatorLayout.d(view);
            int size = d.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    View view2 = (View) d.get(i2);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i2++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    if (!z) {
                        i = 4;
                    }
                    appBarLayout.U = 2 | i | 8;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ku
        public final AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.ku
        public final float w(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
                if (cVar instanceof BaseBehavior) {
                    i = ((BaseBehavior) cVar).y();
                } else {
                    i = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.ku
        public final int x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends LinearLayout.LayoutParams {
        public int a;
        public Interpolator b;

        public a() {
            super(-1, -2);
            this.a = 1;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(ij0.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i = ij0.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }

    public static a a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new a((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean b(boolean z) {
        if (this.W != z) {
            this.W = z;
            refreshDrawableState();
            if (this.a0 && (getBackground() instanceof o40)) {
                o40 o40Var = (o40) getBackground();
                float dimension = getResources().getDimension(rh0.design_appbar_elevation);
                float f = z ? 0.0f : dimension;
                if (!z) {
                    dimension = 0.0f;
                }
                ValueAnimator valueAnimator = this.d0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
                this.d0 = ofFloat;
                ofFloat.setDuration(getResources().getInteger(ii0.app_bar_elevation_anim_duration));
                this.d0.setInterpolator(i4.a);
                this.d0.addUpdateListener(new o4(o40Var));
                this.d0.start();
            }
            return true;
        }
        return false;
    }

    public final boolean c(View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.c0 == null && (i = this.b0) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.b0);
            }
            if (view2 != null) {
                this.c0 = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.c0;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                return !childAt.getFitsSystemWindows();
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        if (this.f0 != null && getTopInset() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.P);
            this.f0.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.R;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    minimumHeight = childAt.getMinimumHeight();
                } else if ((i4 & 2) != 0) {
                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                    minimumHeight = measuredHeight - childAt.getMinimumHeight();
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0) {
                        WeakHashMap<View, String> weakHashMap3 = a41.a;
                        if (childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                    }
                    i3 += i;
                }
                i = minimumHeight + i5;
                if (childCount == 0) {
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.R = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.S;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + childAt.getMeasuredHeight();
            int i4 = aVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.S = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.b0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, String> weakHashMap = a41.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.U;
    }

    public Drawable getStatusBarForeground() {
        return this.f0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.Q;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + i3;
            if (i2 == 0) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (childAt.getFitsSystemWindows()) {
                    i5 -= getTopInset();
                }
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, String> weakHashMap2 = a41.a;
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.Q = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof o40) {
            vj.B(this, (o40) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.e0 == null) {
            this.e0 = new int[4];
        }
        int[] iArr = this.e0;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.V;
        int i2 = gh0.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.W) ? gh0.state_lifted : -gh0.state_lifted;
        int i3 = gh0.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.W) ? gh0.state_collapsed : -gh0.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.c0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, String> weakHashMap = a41.a;
        boolean z4 = true;
        if (getFitsSystemWindows() && d()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                a41.j(getChildAt(childCount), topInset);
            }
        }
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((a) getChildAt(i5).getLayoutParams()).b != null) {
                this.T = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.a0) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount3) {
                    int i7 = ((a) getChildAt(i6).getLayoutParams()).a;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        z2 = true;
                        break;
                    }
                    i6++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                z4 = false;
            }
        }
        if (this.V != z4) {
            this.V = z4;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (getFitsSystemWindows() && d()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = p5.f(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.Q = -1;
        this.R = -1;
        this.S = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof o40) {
            ((o40) background).h(f);
        }
    }

    public void setExpanded(boolean z) {
        int i;
        int i2;
        WeakHashMap<View, String> weakHashMap = a41.a;
        boolean isLaidOut = isLaidOut();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (isLaidOut) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        this.U = i | i2 | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z) {
        this.a0 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.b0 = i;
        WeakReference<View> weakReference = this.c0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c0 = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f0 = drawable3;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f0.setState(getDrawableState());
                }
                Drawable drawable4 = this.f0;
                WeakHashMap<View, String> weakHashMap = a41.a;
                km.d(drawable4, getLayoutDirection());
                Drawable drawable5 = this.f0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f0.setCallback(this);
            }
            if (this.f0 != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap<View, String> weakHashMap2 = a41.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(z5.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            o51.a(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}