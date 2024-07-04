package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.g41;
import defpackage.h0;
import defpackage.o40;
import defpackage.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int K = zi0.Widget_Design_BottomSheet_Modal;
    public int A;
    public WeakReference<V> B;
    public WeakReference<View> C;
    public final ArrayList<d> D;
    public VelocityTracker E;
    public int F;
    public int G;
    public boolean H;
    public HashMap I;
    public final b J;
    public int a;
    public boolean b;
    public float c;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public o40 h;
    public kr0 i;
    public boolean j;
    public BottomSheetBehavior<V>.f k;
    public ValueAnimator l;
    public int m;
    public int n;
    public int o;
    public float p;
    public int q;
    public float r;
    public boolean s;
    public boolean t;
    public int u;
    public g41 v;
    public boolean w;
    public int x;
    public boolean y;
    public int z;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ View P;
        public final /* synthetic */ int Q;

        public a(View view, int i) {
            this.P = view;
            this.Q = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.D(this.P, this.Q);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends g41.c {
        public b() {
        }

        @Override // defpackage.g41.c
        public final int a(View view, int i) {
            return view.getLeft();
        }

        @Override // defpackage.g41.c
        public final int b(View view, int i) {
            int i2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = BottomSheetBehavior.K;
            int z = bottomSheetBehavior.z();
            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
            if (bottomSheetBehavior2.s) {
                i2 = bottomSheetBehavior2.A;
            } else {
                i2 = bottomSheetBehavior2.q;
            }
            return p5.f(i, z, i2);
        }

        @Override // defpackage.g41.c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q;
        }

        @Override // defpackage.g41.c
        public final void f(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.C(1);
            }
        }

        @Override // defpackage.g41.c
        public final void g(View view, int i, int i2) {
            BottomSheetBehavior.this.w(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
            if (java.lang.Math.abs(r5 - r3.a.o) < java.lang.Math.abs(r5 - r3.a.q)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
            if (java.lang.Math.abs(r5 - r0) < java.lang.Math.abs(r5 - r3.a.q)) goto L32;
         */
        @Override // defpackage.g41.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f, float f2) {
            int i;
            BottomSheetBehavior bottomSheetBehavior;
            BottomSheetBehavior bottomSheetBehavior2;
            int i2;
            int i3;
            if (f2 < 0.0f) {
                bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.b) {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    i3 = bottomSheetBehavior3.o;
                    if (top <= i3) {
                        i = bottomSheetBehavior3.m;
                        i2 = 3;
                    }
                    i2 = 6;
                    i = i3;
                }
                i = bottomSheetBehavior.n;
                i2 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                if (bottomSheetBehavior4.s && bottomSheetBehavior4.F(view, f2) && (view.getTop() > BottomSheetBehavior.this.q || Math.abs(f) < Math.abs(f2))) {
                    i = BottomSheetBehavior.this.A;
                    i2 = 5;
                } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                    bottomSheetBehavior2 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior2.b) {
                        int top2 = view.getTop();
                    }
                    i = bottomSheetBehavior2.q;
                    i2 = 4;
                } else {
                    int top3 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior5.b) {
                        if (Math.abs(top3 - bottomSheetBehavior5.n) < Math.abs(top3 - BottomSheetBehavior.this.q)) {
                            bottomSheetBehavior = BottomSheetBehavior.this;
                            i = bottomSheetBehavior.n;
                            i2 = 3;
                        }
                    } else {
                        int i4 = bottomSheetBehavior5.o;
                        if (top3 < i4) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior5.q)) {
                                i = BottomSheetBehavior.this.m;
                                i2 = 3;
                            }
                        }
                        i3 = BottomSheetBehavior.this.o;
                        i2 = 6;
                        i = i3;
                    }
                    bottomSheetBehavior2 = BottomSheetBehavior.this;
                    i = bottomSheetBehavior2.q;
                    i2 = 4;
                }
            }
            BottomSheetBehavior.this.G(view, i2, i, true);
        }

        @Override // defpackage.g41.c
        public final boolean i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.u;
            if (i2 == 1 || bottomSheetBehavior.H) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.F == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.B;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements w0 {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class d {
        public abstract void a();

        public abstract void b(int i);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends c0 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public final int R;
        public int S;
        public boolean T;
        public boolean U;
        public boolean V;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new e[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.R = parcel.readInt();
            this.S = parcel.readInt();
            this.T = parcel.readInt() == 1;
            this.U = parcel.readInt() == 1;
            this.V = parcel.readInt() == 1;
        }

        public e(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.R = bottomSheetBehavior.u;
            this.S = bottomSheetBehavior.d;
            this.T = bottomSheetBehavior.b;
            this.U = bottomSheetBehavior.s;
            this.V = bottomSheetBehavior.t;
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S);
            parcel.writeInt(this.T ? 1 : 0);
            parcel.writeInt(this.U ? 1 : 0);
            parcel.writeInt(this.V ? 1 : 0);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements Runnable {
        public final View P;
        public boolean Q;
        public int R;

        public f(View view, int i) {
            this.P = view;
            this.R = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g41 g41Var = BottomSheetBehavior.this.v;
            if (g41Var != null && g41Var.g()) {
                View view = this.P;
                WeakHashMap<View, String> weakHashMap = a41.a;
                view.postOnAnimation(this);
            } else {
                BottomSheetBehavior.this.C(this.R);
            }
            this.Q = false;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = null;
        this.p = 0.5f;
        this.r = -1.0f;
        this.u = 4;
        this.D = new ArrayList<>();
        this.J = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        this.a = 0;
        this.b = true;
        this.k = null;
        this.p = 0.5f;
        this.r = -1.0f;
        this.u = 4;
        this.D = new ArrayList<>();
        this.J = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.BottomSheetBehavior_Layout);
        this.g = obtainStyledAttributes.hasValue(ij0.BottomSheetBehavior_Layout_shapeAppearance);
        int i3 = ij0.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i3);
        if (hasValue) {
            v(context, attributeSet, hasValue, n40.b(context, obtainStyledAttributes, i3));
        } else {
            v(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = ofFloat;
        ofFloat.setDuration(500L);
        this.l.addUpdateListener(new ta(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.r = obtainStyledAttributes.getDimension(ij0.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        int i4 = ij0.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            A(i2, false);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(i4, -1), false);
        }
        boolean z = obtainStyledAttributes.getBoolean(ij0.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.s != z) {
            this.s = z;
            if (!z && this.u == 5) {
                B(4);
            }
            H();
        }
        boolean z2 = obtainStyledAttributes.getBoolean(ij0.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.B != null) {
                u();
            }
            if (this.b && this.u == 6) {
                i = 3;
            } else {
                i = this.u;
            }
            C(i);
            H();
        }
        this.t = obtainStyledAttributes.getBoolean(ij0.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.a = obtainStyledAttributes.getInt(ij0.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f2 = obtainStyledAttributes.getFloat(ij0.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.p = f2;
            int i5 = obtainStyledAttributes.getInt(ij0.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (i5 >= 0) {
                this.m = i5;
                obtainStyledAttributes.recycle();
                this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                return;
            }
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public static View x(View view) {
        boolean z;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (Build.VERSION.SDK_INT >= 21) {
            z = view.isNestedScrollingEnabled();
        } else if (view instanceof c90) {
            z = ((c90) view).isNestedScrollingEnabled();
        } else {
            z = false;
        }
        if (z) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View x = x(viewGroup.getChildAt(i));
                if (x != null) {
                    return x;
                }
            }
            return null;
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> y(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void A(int i, boolean z) {
        V v;
        boolean z2 = true;
        if (i == -1) {
            if (!this.e) {
                this.e = true;
            }
            z2 = false;
        } else {
            if (this.e || this.d != i) {
                this.e = false;
                this.d = Math.max(0, i);
            }
            z2 = false;
        }
        if (!z2 || this.B == null) {
            return;
        }
        u();
        if (this.u != 4 || (v = this.B.get()) == null) {
            return;
        }
        if (z) {
            E(this.u);
        } else {
            v.requestLayout();
        }
    }

    public final void B(int i) {
        if (i == this.u) {
            return;
        }
        if (this.B != null) {
            E(i);
        } else if (i == 4 || i == 3 || i == 6 || (this.s && i == 5)) {
            this.u = i;
        }
    }

    public final void C(int i) {
        if (this.u == i) {
            return;
        }
        this.u = i;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i == 6 || i == 3) {
            J(true);
        } else if (i == 5 || i == 4) {
            J(false);
        }
        I(i);
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            this.D.get(i2).b(i);
        }
        H();
    }

    public final void D(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.q;
        } else if (i == 6) {
            i2 = this.o;
            if (this.b && i2 <= (i3 = this.n)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = z();
        } else if (this.s && i == 5) {
            i2 = this.A;
        } else {
            throw new IllegalArgumentException(k6.a("Illegal state argument: ", i));
        }
        G(view, i, i2, false);
    }

    public final void E(int i) {
        V v = this.B.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (v.isAttachedToWindow()) {
                v.post(new a(v, i));
                return;
            }
        }
        D(v, i);
    }

    public boolean F(View view, float f2) {
        if (this.t) {
            return true;
        }
        if (view.getTop() < this.q) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.q)) / ((float) this.d) > 0.5f;
    }

    public final void G(View view, int i, int i2, boolean z) {
        boolean i3;
        if (z) {
            i3 = this.v.q(view.getLeft(), i2);
        } else {
            g41 g41Var = this.v;
            int left = view.getLeft();
            g41Var.r = view;
            g41Var.c = -1;
            i3 = g41Var.i(left, i2, 0, 0);
            if (!i3 && g41Var.a == 0 && g41Var.r != null) {
                g41Var.r = null;
            }
        }
        if (i3) {
            C(2);
            I(i);
            if (this.k == null) {
                this.k = new f(view, i);
            }
            BottomSheetBehavior<V>.f fVar = this.k;
            boolean z2 = fVar.Q;
            fVar.R = i;
            if (!z2) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                view.postOnAnimation(fVar);
                this.k.Q = true;
                return;
            }
            return;
        }
        C(i);
    }

    public final void H() {
        V v;
        s0.a aVar;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a41.l(v, 524288);
            a41.h(v, 0);
        } else {
            WeakHashMap<View, String> weakHashMap = a41.a;
        }
        if (i >= 21) {
            a41.l(v, 262144);
            a41.h(v, 0);
        }
        if (i >= 21) {
            a41.l(v, 1048576);
            a41.h(v, 0);
        }
        if (this.s && this.u != 5) {
            t(v, s0.a.j, 5);
        }
        int i2 = this.u;
        int i3 = 6;
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 6) {
                    t(v, s0.a.i, 4);
                    t(v, s0.a.h, 3);
                    return;
                }
                return;
            }
            if (this.b) {
                i3 = 3;
            }
            aVar = s0.a.h;
        } else {
            if (this.b) {
                i3 = 4;
            }
            aVar = s0.a.i;
        }
        t(v, aVar, i3);
    }

    public final void I(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.j != z) {
            this.j = z;
            if (this.h == null || (valueAnimator = this.l) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.l.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.l.setFloatValues(1.0f - f2, f2);
            this.l.start();
        }
    }

    public final void J(boolean z) {
        int i;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.I == null) {
                this.I = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = coordinatorLayout.getChildAt(i2);
            if (childAt != this.B.get()) {
                HashMap hashMap = this.I;
                if (!z) {
                    if (hashMap != null && hashMap.containsKey(childAt)) {
                        i = ((Integer) this.I.get(childAt)).intValue();
                    }
                } else {
                    hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    i = 4;
                }
                WeakHashMap<View, String> weakHashMap = a41.a;
                childAt.setImportantForAccessibility(i);
            }
        }
        if (!z) {
            this.I = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.B = null;
        this.v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void e() {
        this.B = null;
        this.v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        g41 g41Var;
        if (!v.isShown()) {
            this.w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.F = -1;
            VelocityTracker velocityTracker = this.E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.E = null;
            }
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.H = false;
                this.F = -1;
                if (this.w) {
                    this.w = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            if (this.u != 2) {
                WeakReference<View> weakReference = this.C;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.l(view, x, this.G)) {
                    this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.H = true;
                }
            }
            if (this.F == -1 && !coordinatorLayout.l(v, x, this.G)) {
                z = true;
            } else {
                z = false;
            }
            this.w = z;
        }
        if (!this.w && (g41Var = this.v) != null && g41Var.r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.C;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.w || this.u == 1 || coordinatorLayout.l(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.v == null || Math.abs(this.G - motionEvent.getY()) <= this.v.b) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        boolean z;
        float f2;
        o40 o40Var;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(rh0.design_bottom_sheet_peek_height_min);
            this.B = new WeakReference<>(v);
            if (this.g && (o40Var = this.h) != null) {
                v.setBackground(o40Var);
            }
            o40 o40Var2 = this.h;
            if (o40Var2 != null) {
                float f3 = this.r;
                if (f3 == -1.0f) {
                    f3 = a41.e(v);
                }
                o40Var2.h(f3);
                if (this.u == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.j = z;
                o40 o40Var3 = this.h;
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                o40.b bVar = o40Var3.P;
                if (bVar.j != f2) {
                    bVar.j = f2;
                    o40Var3.S = true;
                    o40Var3.invalidateSelf();
                }
            }
            H();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.v == null) {
            this.v = new g41(coordinatorLayout.getContext(), coordinatorLayout, this.J);
        }
        int top = v.getTop();
        coordinatorLayout.q(v, i);
        this.z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        this.n = Math.max(0, height - v.getHeight());
        this.o = (int) ((1.0f - this.p) * this.A);
        u();
        int i3 = this.u;
        if (i3 == 3) {
            i2 = z();
        } else if (i3 == 6) {
            i2 = this.o;
        } else if (this.s && i3 == 5) {
            i2 = this.A;
        } else if (i3 == 4) {
            i2 = this.q;
        } else {
            if (i3 == 1 || i3 == 2) {
                a41.j(v, top - v.getTop());
            }
            this.C = new WeakReference<>(x(v));
            return true;
        }
        a41.j(v, i2);
        this.C = new WeakReference<>(x(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(View view) {
        WeakReference<View> weakReference = this.C;
        return (weakReference == null || view != weakReference.get() || this.u == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        int i3;
        if (i2 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (view2 != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i;
        if (i > 0) {
            if (i4 < z()) {
                int z = top - z();
                iArr[1] = z;
                a41.j(view, -z);
                i3 = 3;
                C(i3);
            } else {
                iArr[1] = i;
                a41.j(view, -i);
                C(1);
            }
        } else if (i < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.q;
            if (i4 <= i5 || this.s) {
                iArr[1] = i;
                a41.j(view, -i);
                C(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                a41.j(view, -i6);
                i3 = 4;
                C(i3);
            }
        }
        w(view.getTop());
        this.x = i;
        this.y = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        e eVar = (e) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = eVar.S;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = eVar.T;
            }
            if (i == -1 || (i & 4) == 4) {
                this.s = eVar.U;
            }
            if (i == -1 || (i & 8) == 8) {
                this.t = eVar.V;
            }
        }
        int i2 = eVar.R;
        if (i2 != 1 && i2 != 2) {
            this.u = i2;
        } else {
            this.u = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new e(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean q(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.x = 0;
        this.y = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.q)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
        if (java.lang.Math.abs(r2 - r1.o) < java.lang.Math.abs(r2 - r1.q)) goto L39;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == z()) {
            C(3);
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (weakReference != null && view == weakReference.get() && this.y) {
            if (this.x > 0) {
                i2 = z();
            } else {
                if (this.s) {
                    VelocityTracker velocityTracker = this.E;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.c);
                        yVelocity = this.E.getYVelocity(this.F);
                    }
                    if (F(v, yVelocity)) {
                        i2 = this.A;
                        i3 = 5;
                    }
                }
                if (this.x == 0) {
                    int top = v.getTop();
                    if (this.b) {
                        if (Math.abs(top - this.n) < Math.abs(top - this.q)) {
                            i2 = this.n;
                        }
                        i2 = this.q;
                        i3 = 4;
                    } else {
                        int i4 = this.o;
                        if (top < i4) {
                            if (top < Math.abs(top - this.q)) {
                                i2 = this.m;
                            }
                        }
                        i2 = this.o;
                        i3 = 6;
                    }
                } else {
                    if (!this.b) {
                        int top2 = v.getTop();
                    }
                    i2 = this.q;
                    i3 = 4;
                }
            }
            G(v, i3, i2, false);
            this.y = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == 1 && actionMasked == 0) {
            return true;
        }
        g41 g41Var = this.v;
        if (g41Var != null) {
            g41Var.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.F = -1;
            VelocityTracker velocityTracker = this.E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.E = null;
            }
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.w) {
            float abs = Math.abs(this.G - motionEvent.getY());
            g41 g41Var2 = this.v;
            if (abs > g41Var2.b) {
                g41Var2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.w;
    }

    public final void t(V v, s0.a aVar, int i) {
        c cVar = new c(i);
        WeakHashMap<View, String> weakHashMap = a41.a;
        h0 h0Var = null;
        s0.a aVar2 = new s0.a(null, aVar.b, cVar, aVar.c);
        if (Build.VERSION.SDK_INT >= 21) {
            View.AccessibilityDelegate c2 = a41.c(v);
            if (c2 != null) {
                if (c2 instanceof h0.a) {
                    h0Var = ((h0.a) c2).a;
                } else {
                    h0Var = new h0(c2);
                }
            }
            if (h0Var == null) {
                h0Var = new h0();
            }
            a41.n(v, h0Var);
            a41.l(v, aVar2.a());
            int i2 = ai0.tag_accessibility_actions;
            ArrayList arrayList = (ArrayList) v.getTag(i2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                v.setTag(i2, arrayList);
            }
            arrayList.add(aVar2);
            a41.h(v, 0);
        }
    }

    public final void u() {
        int max = this.e ? Math.max(this.f, this.A - ((this.z * 9) / 16)) : this.d;
        if (this.b) {
            this.q = Math.max(this.A - max, this.n);
        } else {
            this.q = this.A - max;
        }
    }

    public final void v(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.g) {
            this.i = kr0.b(context, attributeSet, gh0.bottomSheetStyle, K).a();
            o40 o40Var = new o40(this.i);
            this.h = o40Var;
            o40Var.g(context);
            if (z && colorStateList != null) {
                this.h.i(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.h.setTint(typedValue.data);
        }
    }

    public final void w(int i) {
        if (this.B.get() == null || this.D.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            this.D.get(i2).a();
        }
    }

    public final int z() {
        return this.b ? this.n : this.m;
    }
}