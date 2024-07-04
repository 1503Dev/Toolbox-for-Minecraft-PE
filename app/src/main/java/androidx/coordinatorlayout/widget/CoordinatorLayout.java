package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import defpackage.a41;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class CoordinatorLayout extends ViewGroup implements e90, f90 {
    public static final String l0;
    public static final Class<?>[] m0;
    public static final ThreadLocal<Map<String, Constructor<c>>> n0;
    public static final i o0;
    public static final if0 p0;
    public final ArrayList P;
    public final wl Q;
    public final ArrayList R;
    public final ArrayList S;
    public final int[] T;
    public final int[] U;
    public boolean V;
    public boolean W;
    public int[] a0;
    public View b0;
    public View c0;
    public g d0;
    public boolean e0;
    public n61 f0;
    public boolean g0;
    public Drawable h0;
    public ViewGroup.OnHierarchyChangeListener i0;
    public a j0;
    public final h90 k0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements tb0 {
        public a() {
        }

        @Override // defpackage.tb0
        public final n61 a(View view, n61 n61Var) {
            boolean z;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f0, n61Var)) {
                coordinatorLayout.f0 = n61Var;
                boolean z2 = true;
                if (n61Var.a() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                coordinatorLayout.g0 = z;
                coordinatorLayout.setWillNotDraw((z || coordinatorLayout.getBackground() != null) ? false : false);
                if (!n61Var.a.h()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, String> weakHashMap = a41.a;
                        if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).a != null && n61Var.a.h()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return n61Var;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void e() {
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        public boolean i(View view) {
            return false;
        }

        public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        }

        @Deprecated
        public void k(View view, int i) {
        }

        public void l(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                k(v, i2);
            }
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean p(int i) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return p(i);
            }
            return false;
        }

        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.i0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.i0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;

        public f() {
            super(-2, -2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ej0.CoordinatorLayout_Layout);
            this.c = obtainStyledAttributes.getInteger(ej0.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = obtainStyledAttributes.getResourceId(ej0.CoordinatorLayout_Layout_layout_anchor, -1);
            this.d = obtainStyledAttributes.getInteger(ej0.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = obtainStyledAttributes.getInteger(ej0.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = obtainStyledAttributes.getInt(ej0.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = obtainStyledAttributes.getInt(ej0.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = ej0.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(i);
                String str = CoordinatorLayout.l0;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.l0;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.n0;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.m0);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(k6.b("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public final boolean a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.o;
            }
            return this.n;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.p(0);
            return true;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class h extends c0 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public SparseArray<Parcelable> R;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.R = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.R.append(iArr[i], readParcelableArray[i]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeParcelable(this.P, i);
            SparseArray<Parcelable> sparseArray = this.R;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.R.keyAt(i3);
                parcelableArr[i3] = this.R.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float f;
            View view3 = view;
            View view4 = view2;
            WeakHashMap<View, String> weakHashMap = a41.a;
            int i = Build.VERSION.SDK_INT;
            float f2 = 0.0f;
            if (i >= 21) {
                f = view3.getZ();
            } else {
                f = 0.0f;
            }
            if (i >= 21) {
                f2 = view4.getZ();
            }
            if (f > f2) {
                return -1;
            }
            if (f < f2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        l0 = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            o0 = new i();
        } else {
            o0 = null;
        }
        m0 = new Class[]{Context.class, AttributeSet.class};
        n0 = new ThreadLocal<>();
        p0 = new if0(12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r5);
        TypedArray obtainStyledAttributes;
        int i2 = dh0.coordinatorLayoutStyle;
        this.P = new ArrayList();
        this.Q = new wl(0);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new int[2];
        this.U = new int[2];
        this.k0 = new h90();
        int[] iArr = ej0.CoordinatorLayout;
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, yi0.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        }
        TypedArray typedArray = obtainStyledAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, yi0.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, 0);
            }
        }
        int resourceId = typedArray.getResourceId(ej0.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.a0 = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.a0.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr2 = this.a0;
                iArr2[i3] = (int) (iArr2[i3] * f2);
            }
        }
        this.h0 = typedArray.getDrawable(ej0.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        x();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) p0.a();
        return rect == null ? new Rect() : rect;
    }

    public static void f(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int width;
        int height;
        int i5 = fVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        if (i9 != 1) {
            if (i9 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i10 != 16) {
            if (i10 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i7 != 1) {
            if (i7 != 5) {
                width -= i3;
            }
        } else {
            width -= i3 / 2;
        }
        if (i8 != 16) {
            if (i8 != 80) {
                height -= i4;
            }
        } else {
            height -= i4 / 2;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    public static f k(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.e();
                    }
                    fVar.a = behavior;
                    fVar.b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c newInstance = dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        c cVar2 = fVar.a;
                        if (cVar2 != newInstance) {
                            if (cVar2 != null) {
                                cVar2.e();
                            }
                            fVar.a = newInstance;
                            fVar.b = true;
                            if (newInstance != null) {
                                newInstance.c(fVar);
                            }
                        }
                    } catch (Exception e2) {
                        StringBuilder b2 = e5.b("Default behavior class ");
                        b2.append(dVar.value().getName());
                        b2.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", b2.toString(), e2);
                    }
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public static void v(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            a41.i(view, i2 - i3);
            fVar.i = i2;
        }
    }

    public static void w(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            a41.j(view, i2 - i3);
            fVar.j = i2;
        }
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public final void c(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            e(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final ArrayList d(View view) {
        wl wlVar = this.Q;
        int i2 = ((os0) wlVar.b).R;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ((os0) wlVar.b).j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((os0) wlVar.b).h(i3));
            }
        }
        this.S.clear();
        if (arrayList != null) {
            this.S.addAll(arrayList);
        }
        return this.S;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.h0;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = i41.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = i41.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        i41.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = i41.b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int g(int i2) {
        StringBuilder sb;
        int[] iArr = this.a0;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.P);
    }

    public final n61 getLastWindowInsets() {
        return this.f0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h90 h90Var = this.k0;
        return h90Var.b | h90Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.h0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // defpackage.e90
    public final void h(View view, View view2, int i2, int i3) {
        h90 h90Var = this.k0;
        if (i3 == 1) {
            h90Var.b = i2;
        } else {
            h90Var.a = i2;
        }
        this.c0 = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((f) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.e90
    public final void i(View view, int i2) {
        h90 h90Var = this.k0;
        if (i2 == 1) {
            h90Var.b = 0;
        } else {
            h90Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.a;
                if (cVar != null) {
                    cVar.r(this, childAt, view, i2);
                }
                if (i2 != 0) {
                    if (i2 == 1) {
                        fVar.o = false;
                    }
                } else {
                    fVar.n = false;
                }
                fVar.p = false;
            }
        }
        this.c0 = null;
    }

    @Override // defpackage.e90
    public final void j(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.T;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.j(this, childAt, view, i3, iArr2, i4);
                    int[] iArr3 = this.T;
                    if (i2 > 0) {
                        min = Math.max(i5, iArr3[0]);
                    } else {
                        min = Math.min(i5, iArr3[0]);
                    }
                    i5 = min;
                    int[] iArr4 = this.T;
                    if (i3 > 0) {
                        min2 = Math.max(i6, iArr4[1]);
                    } else {
                        min2 = Math.min(i6, iArr4[1]);
                    }
                    i6 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            p(1);
        }
    }

    public final boolean l(View view, int i2, int i3) {
        Rect a2 = a();
        e(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a2.setEmpty();
            p0.b(a2);
        }
    }

    @Override // defpackage.f90
    public final void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.T;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.T;
                    if (i4 > 0) {
                        min = Math.max(i7, iArr3[0]);
                    } else {
                        min = Math.min(i7, iArr3[0]);
                    }
                    i7 = min;
                    if (i5 > 0) {
                        min2 = Math.max(i8, this.T[1]);
                    } else {
                        min2 = Math.min(i8, this.T[1]);
                    }
                    i8 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            p(1);
        }
    }

    @Override // defpackage.e90
    public final void n(View view, int i2, int i3, int i4, int i5, int i6) {
        m(view, i2, i3, i4, i5, 0, this.U);
    }

    @Override // defpackage.e90
    public final boolean o(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean q = cVar.q(this, childAt, view, view2, i2, i3);
                    z |= q;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            fVar.o = q;
                        }
                    } else {
                        fVar.n = q;
                    }
                } else if (i3 != 0) {
                    if (i3 == 1) {
                        fVar.o = false;
                    }
                } else {
                    fVar.n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.e0) {
            if (this.d0 == null) {
                this.d0 = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.d0);
        }
        if (this.f0 == null) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (getFitsSystemWindows()) {
                a41.m(this);
            }
        }
        this.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.e0 && this.d0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.d0);
        }
        View view = this.c0;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.W = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g0 || this.h0 == null) {
            return;
        }
        n61 n61Var = this.f0;
        int a2 = n61Var != null ? n61Var.a() : 0;
        if (a2 > 0) {
            this.h0.setBounds(0, 0, getWidth(), a2);
            this.h0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean s = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap<View, String> weakHashMap = a41.a;
        int layoutDirection = getLayoutDirection();
        int size = this.P.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.P.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019c, code lost:
        if (r0.h(r30, r19, r24, r20, r25) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        c cVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        t();
        int childCount = getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 < childCount) {
                View childAt = getChildAt(i17);
                wl wlVar = this.Q;
                int i18 = ((os0) wlVar.b).R;
                int i19 = 0;
                while (true) {
                    if (i19 < i18) {
                        ArrayList arrayList = (ArrayList) ((os0) wlVar.b).j(i19);
                        if (arrayList != null && arrayList.contains(childAt)) {
                            z4 = true;
                            break;
                        }
                        i19++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                if (z4) {
                    z = true;
                    break;
                }
                i17++;
            } else {
                z = false;
                break;
            }
        }
        if (z != this.e0) {
            if (z) {
                if (this.W) {
                    if (this.d0 == null) {
                        this.d0 = new g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.d0);
                }
                this.e0 = true;
            } else {
                if (this.W && this.d0 != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.d0);
                }
                this.e0 = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, String> weakHashMap = a41.a;
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.f0 != null && getFitsSystemWindows()) {
            z3 = true;
        } else {
            z3 = false;
        }
        int size3 = this.P.size();
        int i22 = suggestedMinimumWidth;
        int i23 = suggestedMinimumHeight;
        int i24 = 0;
        int i25 = 0;
        while (i25 < size3) {
            View view = (View) this.P.get(i25);
            if (view.getVisibility() == 8) {
                i16 = i25;
                i9 = size3;
                i14 = paddingLeft;
                i10 = paddingRight;
                i11 = layoutDirection;
            } else {
                f fVar = (f) view.getLayoutParams();
                int i26 = fVar.e;
                if (i26 >= 0 && mode != 0) {
                    int g2 = g(i26);
                    i4 = i24;
                    int i27 = fVar.c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i5 = i25;
                    if ((absoluteGravity == 3 && !z2) || (absoluteGravity == 5 && z2)) {
                        i6 = Math.max(0, (size - paddingRight) - g2);
                    } else if ((absoluteGravity == 5 && !z2) || (absoluteGravity == 3 && z2)) {
                        i6 = Math.max(0, g2 - paddingLeft);
                    }
                    if (!z3 && !view.getFitsSystemWindows()) {
                        int i28 = this.f0.a.g().c + this.f0.a.g().a;
                        int a2 = this.f0.a.g().d + this.f0.a();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - i28, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a2, mode2);
                    } else {
                        i7 = i2;
                        i8 = i3;
                    }
                    cVar = fVar.a;
                    if (cVar == null) {
                        int i29 = i4;
                        i16 = i5;
                        i14 = paddingLeft;
                        i15 = i29;
                        i10 = paddingRight;
                        i12 = i23;
                        i11 = layoutDirection;
                        i13 = i22;
                        i9 = size3;
                    } else {
                        i9 = size3;
                        i10 = paddingRight;
                        i11 = layoutDirection;
                        i12 = i23;
                        i13 = i22;
                        int i30 = i5;
                        i14 = paddingLeft;
                        i15 = i4;
                        i16 = i30;
                    }
                    measureChildWithMargins(view, i7, i6, i8, 0);
                    int max = Math.max(i13, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    i22 = max;
                    i23 = Math.max(i12, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i24 = View.combineMeasuredStates(i15, view.getMeasuredState());
                } else {
                    i4 = i24;
                    i5 = i25;
                }
                i6 = 0;
                if (!z3) {
                }
                i7 = i2;
                i8 = i3;
                cVar = fVar.a;
                if (cVar == null) {
                }
                measureChildWithMargins(view, i7, i6, i8, 0);
                int max2 = Math.max(i13, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                i22 = max2;
                i23 = Math.max(i12, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i24 = View.combineMeasuredStates(i15, view.getMeasuredState());
            }
            i25 = i16 + 1;
            paddingLeft = i14;
            paddingRight = i10;
            layoutDirection = i11;
            size3 = i9;
        }
        int i31 = i24;
        setMeasuredDimension(View.resolveSizeAndState(i22, i2, (-16777216) & i31), View.resolveSizeAndState(i23, i3, i31 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z |= cVar.i(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        j(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        n(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        h(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.P);
        SparseArray<Parcelable> sparseArray = hVar.R;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = k(childAt).a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (id != -1 && cVar != null && (o = cVar.o(childAt)) != null) {
                sparseArray.append(id, o);
            }
        }
        hVar.R = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.g90
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean s;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.b0 == null) {
            z = s(motionEvent, 1);
        } else {
            z = false;
        }
        c cVar = ((f) this.b0.getLayoutParams()).a;
        if (cVar != null) {
            s = cVar.s(this, this.b0, motionEvent);
            motionEvent2 = null;
            if (this.b0 != null) {
                s |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                u(false);
            }
            return s;
        }
        s = false;
        motionEvent2 = null;
        if (this.b0 != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        u(false);
        return s;
    }

    public final void p(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        boolean z4;
        c cVar;
        WeakHashMap<View, String> weakHashMap = a41.a;
        int layoutDirection = getLayoutDirection();
        int size = this.P.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i14 = i2;
        int i15 = 0;
        while (i15 < size) {
            View view = (View) this.P.get(i15);
            f fVar = (f) view.getLayoutParams();
            if (i14 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = a4;
                i3 = i15;
            } else {
                int i16 = 0;
                while (i16 < i15) {
                    if (fVar.l == ((View) this.P.get(i16))) {
                        f fVar2 = (f) view.getLayoutParams();
                        if (fVar2.k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            e(fVar2.k, a5);
                            c(view, a6, false);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i13 = i15;
                            rect2 = a4;
                            i11 = i16;
                            f(layoutDirection, a5, a7, fVar2, measuredWidth, measuredHeight);
                            if (a7.left == a6.left && a7.top == a6.top) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            b(fVar2, a7, measuredWidth, measuredHeight);
                            int i17 = a7.left - a6.left;
                            int i18 = a7.top - a6.top;
                            if (i17 != 0) {
                                a41.i(view, i17);
                            }
                            if (i18 != 0) {
                                a41.j(view, i18);
                            }
                            if (z4 && (cVar = fVar2.a) != null) {
                                cVar.d(this, view, fVar2.k);
                            }
                            a5.setEmpty();
                            if0 if0Var = p0;
                            if0Var.b(a5);
                            a6.setEmpty();
                            if0Var.b(a6);
                            a7.setEmpty();
                            if0Var.b(a7);
                            i16 = i11 + 1;
                            size = i12;
                            i15 = i13;
                            a4 = rect2;
                        }
                    }
                    i11 = i16;
                    i12 = size;
                    rect2 = a4;
                    i13 = i15;
                    i16 = i11 + 1;
                    size = i12;
                    i15 = i13;
                    a4 = rect2;
                }
                int i19 = size;
                Rect rect3 = a4;
                i3 = i15;
                c(view, a3, true);
                if (fVar.g != 0 && !a3.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.g, layoutDirection);
                    int i20 = absoluteGravity & 112;
                    if (i20 != 48) {
                        if (i20 == 80) {
                            a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                        }
                    } else {
                        a2.top = Math.max(a2.top, a3.bottom);
                    }
                    int i21 = absoluteGravity & 7;
                    if (i21 != 3) {
                        if (i21 == 5) {
                            a2.right = Math.max(a2.right, getWidth() - a3.left);
                        }
                    } else {
                        a2.left = Math.max(a2.left, a3.right);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar3 = (f) view.getLayoutParams();
                        c cVar2 = fVar3.a;
                        Rect a8 = a();
                        Rect a9 = a();
                        a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 != null && cVar2.a(view)) {
                            if (!a9.contains(a8)) {
                                StringBuilder b2 = e5.b("Rect should be within the child's bounds. Rect:");
                                b2.append(a8.toShortString());
                                b2.append(" | Bounds:");
                                b2.append(a9.toShortString());
                                throw new IllegalArgumentException(b2.toString());
                            }
                        } else {
                            a8.set(a9);
                        }
                        a9.setEmpty();
                        if0 if0Var2 = p0;
                        if0Var2.b(a9);
                        if (!a8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar3.h, layoutDirection);
                            if ((absoluteGravity2 & 48) == 48 && (i9 = (a8.top - ((ViewGroup.MarginLayoutParams) fVar3).topMargin) - fVar3.j) < (i10 = a2.top)) {
                                w(view, i10 - i9);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin) + fVar3.j) < (i8 = a2.bottom)) {
                                w(view, height - i8);
                                z2 = true;
                            }
                            if (!z2) {
                                w(view, 0);
                            }
                            if ((absoluteGravity2 & 3) == 3 && (i6 = (a8.left - ((ViewGroup.MarginLayoutParams) fVar3).leftMargin) - fVar3.i) < (i7 = a2.left)) {
                                v(view, i7 - i6);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin) + fVar3.i) < (i5 = a2.right)) {
                                v(view, width - i5);
                                z3 = true;
                            }
                            if (!z3) {
                                v(view, 0);
                            }
                        }
                        a8.setEmpty();
                        if0Var2.b(a8);
                    }
                }
                if (i2 != 2) {
                    rect = rect3;
                    rect.set(((f) view.getLayoutParams()).q);
                    if (rect.equals(a3)) {
                        i4 = i19;
                        i14 = i2;
                    } else {
                        ((f) view.getLayoutParams()).q.set(a3);
                    }
                } else {
                    rect = rect3;
                }
                i4 = i19;
                for (int i22 = i3 + 1; i22 < i4; i22++) {
                    View view2 = (View) this.P.get(i22);
                    f fVar4 = (f) view2.getLayoutParams();
                    c cVar3 = fVar4.a;
                    if (cVar3 != null && cVar3.b(view2, view)) {
                        if (i2 == 0 && fVar4.p) {
                            fVar4.p = false;
                        } else {
                            if (i2 != 2) {
                                z = cVar3.d(this, view2, view);
                            } else {
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar4.p = z;
                            }
                        }
                    }
                }
                i14 = i2;
            }
            i15 = i3 + 1;
            size = i4;
            a4 = rect;
        }
        Rect rect4 = a4;
        a2.setEmpty();
        if0 if0Var3 = p0;
        if0Var3.b(a2);
        a3.setEmpty();
        if0Var3.b(a3);
        rect4.setEmpty();
        if0Var3.b(rect4);
    }

    public final void q(View view, int i2) {
        boolean z;
        Rect a2;
        Rect a3;
        if0 if0Var;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        int i3 = 0;
        if (view2 == null && fVar.f != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (view2 != null) {
                a2 = a();
                a3 = a();
                try {
                    e(view2, a2);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    f(i2, a2, a3, fVar2, measuredWidth, measuredHeight);
                    b(fVar2, a3, measuredWidth, measuredHeight);
                    view.layout(a3.left, a3.top, a3.right, a3.bottom);
                    return;
                } finally {
                    a2.setEmpty();
                    if0Var = p0;
                    if0Var.b(a2);
                    a3.setEmpty();
                    if0Var.b(a3);
                }
            }
            int i4 = fVar.e;
            if (i4 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i5 = fVar3.c;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i2 == 1) {
                    i4 = width - i4;
                }
                int g2 = g(i4) - measuredWidth2;
                if (i6 != 1) {
                    if (i6 == 5) {
                        g2 += measuredWidth2;
                    }
                } else {
                    g2 += measuredWidth2 / 2;
                }
                if (i7 != 16) {
                    if (i7 == 80) {
                        i3 = measuredHeight2 + 0;
                    }
                } else {
                    i3 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(g2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            a2 = a();
            a2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
            if (this.f0 != null) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a2.left = this.f0.a.g().a + a2.left;
                    a2.top = this.f0.a() + a2.top;
                    a2.right -= this.f0.a.g().c;
                    a2.bottom -= this.f0.a.g().d;
                }
            }
            a3 = a();
            int i8 = fVar4.c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i2);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final void r(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar != null && cVar.m(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.V) {
            return;
        }
        u(false);
        this.V = true;
    }

    public final boolean s(MotionEvent motionEvent, int i2) {
        boolean z;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.R;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            if (isChildrenDrawingOrderEnabled) {
                i3 = getChildDrawingOrder(childCount, i4);
            } else {
                i3 = i4;
            }
            arrayList.add(getChildAt(i3));
        }
        i iVar = o0;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.a;
            if ((z2 || z3) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 != 0) {
                        if (i2 == 1) {
                            cVar.s(this, view, motionEvent2);
                        }
                    } else {
                        cVar.f(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z2 && cVar != null) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            z2 = cVar.s(this, view, motionEvent);
                        }
                    } else {
                        z2 = cVar.f(this, view, motionEvent);
                    }
                    if (z2) {
                        this.b0 = view;
                    }
                }
                if (fVar.a == null) {
                    fVar.m = false;
                }
                boolean z4 = fVar.m;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    fVar.m = z;
                }
                if (z && !z4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && !z3) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.i0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.h0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.h0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.h0.setState(getDrawableState());
                }
                Drawable drawable4 = this.h0;
                WeakHashMap<View, String> weakHashMap = a41.a;
                km.d(drawable4, getLayoutDirection());
                Drawable drawable5 = this.h0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.h0.setCallback(this);
            }
            WeakHashMap<View, String> weakHashMap2 = a41.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? cg.b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.h0;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.h0.setVisible(z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r5 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        this.P.clear();
        wl wlVar = this.Q;
        int i2 = ((os0) wlVar.b).R;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = (ArrayList) ((os0) wlVar.b).j(i3);
            if (arrayList != null) {
                arrayList.clear();
                ((hf0) wlVar.a).b(arrayList);
            }
        }
        ((os0) wlVar.b).clear();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f k = k(childAt);
            if (k.f == -1) {
                k.l = null;
                k.k = null;
            } else {
                View view = k.k;
                if (view != null) {
                    if (view.getId() == k.f) {
                        View view2 = k.k;
                        for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                            if (parent != null && parent != childAt) {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                            } else {
                                k.l = null;
                                k.k = null;
                            }
                        }
                        k.l = view2;
                        z = true;
                    }
                    z = false;
                    break;
                }
                View findViewById = findViewById(k.f);
                k.k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                            }
                        }
                        k.l = findViewById;
                    }
                } else if (!isInEditMode()) {
                    StringBuilder b2 = e5.b("Could not find CoordinatorLayout descendant view with id ");
                    b2.append(getResources().getResourceName(k.f));
                    b2.append(" to anchor view ");
                    b2.append(childAt);
                    throw new IllegalStateException(b2.toString());
                }
                k.l = null;
                k.k = null;
            }
            wl wlVar2 = this.Q;
            if (!((os0) wlVar2.b).containsKey(childAt)) {
                ((os0) wlVar2.b).put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != k.l) {
                        WeakHashMap<View, String> weakHashMap = a41.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity != 0 && (Gravity.getAbsoluteGravity(k.h, layoutDirection) & absoluteGravity) == absoluteGravity) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3 && ((cVar = k.a) == null || !cVar.b(childAt, childAt2))) {
                            z2 = false;
                            if (z2) {
                                if (!((os0) this.Q.b).containsKey(childAt2)) {
                                    wl wlVar3 = this.Q;
                                    if (!((os0) wlVar3.b).containsKey(childAt2)) {
                                        ((os0) wlVar3.b).put(childAt2, null);
                                    }
                                }
                                wl wlVar4 = this.Q;
                                if (((os0) wlVar4.b).containsKey(childAt2) && ((os0) wlVar4.b).containsKey(childAt)) {
                                    ArrayList arrayList2 = (ArrayList) ((os0) wlVar4.b).getOrDefault(childAt2, null);
                                    if (arrayList2 == null) {
                                        arrayList2 = (ArrayList) ((hf0) wlVar4.a).a();
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        ((os0) wlVar4.b).put(childAt2, arrayList2);
                                    }
                                    arrayList2.add(childAt);
                                } else {
                                    throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
            }
        }
        ArrayList arrayList3 = this.P;
        wl wlVar5 = this.Q;
        ((ArrayList) wlVar5.c).clear();
        ((HashSet) wlVar5.d).clear();
        int i6 = ((os0) wlVar5.b).R;
        for (int i7 = 0; i7 < i6; i7++) {
            wlVar5.a(((os0) wlVar5.b).h(i7), (ArrayList) wlVar5.c, (HashSet) wlVar5.d);
        }
        arrayList3.addAll((ArrayList) wlVar5.c);
        Collections.reverse(this.P);
    }

    public final void u(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.f(this, childAt, obtain);
                } else {
                    cVar.s(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.b0 = null;
        this.V = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h0;
    }

    public final void x() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getFitsSystemWindows()) {
            if (this.j0 == null) {
                this.j0 = new a();
            }
            a aVar = this.j0;
            if (i2 >= 21) {
                a41.a.c(this, aVar);
            }
            setSystemUiVisibility(1280);
        } else if (i2 >= 21) {
            a41.a.c(this, null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}