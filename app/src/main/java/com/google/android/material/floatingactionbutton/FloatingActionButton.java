package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import defpackage.oa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@CoordinatorLayout.d(Behavior.class)
public final class FloatingActionButton extends r51 implements ix0, lx0, op, or0 {
    public ColorStateList Q;
    public PorterDuff.Mode R;
    public ColorStateList S;
    public PorterDuff.Mode T;
    public ColorStateList U;
    public int V;
    public int W;
    public boolean a0;
    public d b0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.FloatingActionButton_Behavior_Layout);
            this.b = obtainStyledAttributes.getBoolean(ij0.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z = ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    v(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList d = coordinatorLayout.d(floatingActionButton);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) d.get(i2);
                if (view2 instanceof AppBarLayout) {
                    if (u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z = ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && v(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.b || fVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        public final boolean u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (t(appBarLayout, floatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                rk.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.g(null, false);
                    return true;
                }
                floatingActionButton.k(null, false);
                return true;
            }
            return false;
        }

        public final boolean v(View view, FloatingActionButton floatingActionButton) {
            if (t(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.g(null, false);
                    return true;
                }
                floatingActionButton.k(null, false);
                return true;
            }
            return false;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements jr0 {
        public b() {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c<T extends FloatingActionButton> implements d.e {
        public c(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.d.e
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.e
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                ((c) obj).getClass();
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        d dVar;
        if (this.b0 == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                dVar = new mq(this, new b());
            } else {
                dVar = new d(this, new b());
            }
            this.b0 = dVar;
        }
        return this.b0;
    }

    @Override // defpackage.op
    public final boolean a() {
        throw null;
    }

    public final void c() {
        d impl = getImpl();
        if (impl.q == null) {
            impl.q = new ArrayList<>();
        }
        impl.q.add(null);
    }

    public final void d(ra raVar) {
        d impl = getImpl();
        if (impl.p == null) {
            impl.p = new ArrayList<>();
        }
        impl.p.add(raVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().g(getDrawableState());
    }

    public final void e() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.r == null) {
            impl.r = new ArrayList<>();
        }
        impl.r.add(cVar);
    }

    public final int f(int i) {
        int i2 = this.W;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? rh0.design_fab_size_normal : rh0.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(oa oaVar, boolean z) {
        com.google.android.material.floatingactionbutton.a aVar;
        boolean z2;
        int i;
        d impl = getImpl();
        if (oaVar == null) {
            aVar = null;
        } else {
            aVar = new com.google.android.material.floatingactionbutton.a(this, oaVar);
        }
        boolean z3 = false;
        if (impl.s.getVisibility() != 0 ? impl.o != 2 : impl.o == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Animator animator = impl.j;
            if (animator != null) {
                animator.cancel();
            }
            FloatingActionButton floatingActionButton = impl.s;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (floatingActionButton.isLaidOut() && !impl.s.isInEditMode()) {
                z3 = true;
            }
            if (z3) {
                q60 q60Var = impl.l;
                if (q60Var == null) {
                    if (impl.i == null) {
                        impl.i = q60.a(impl.s.getContext(), bh0.design_fab_hide_motion_spec);
                    }
                    q60Var = impl.i;
                    q60Var.getClass();
                }
                AnimatorSet a2 = impl.a(q60Var, 0.0f, 0.0f, 0.0f);
                a2.addListener(new com.google.android.material.floatingactionbutton.b(impl, z, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.q;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            FloatingActionButton floatingActionButton2 = impl.s;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton2.b(i, z);
            if (aVar != null) {
                aVar.a.a(aVar.b);
            }
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.Q;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.R;
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.W;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public q60 getHideMotionSpec() {
        return getImpl().l;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.U;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.U;
    }

    public kr0 getShapeAppearanceModel() {
        kr0 kr0Var = getImpl().a;
        kr0Var.getClass();
        return kr0Var;
    }

    public q60 getShowMotionSpec() {
        return getImpl().k;
    }

    public int getSize() {
        return this.V;
    }

    public int getSizeDimension() {
        return f(this.V);
    }

    @Override // defpackage.ix0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // defpackage.ix0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // defpackage.lx0
    public ColorStateList getSupportImageTintList() {
        return this.S;
    }

    @Override // defpackage.lx0
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.T;
    }

    public boolean getUseCompatPadding() {
        return this.a0;
    }

    public final boolean h() {
        d impl = getImpl();
        int visibility = impl.s.getVisibility();
        int i = impl.o;
        if (visibility == 0) {
            if (i != 1) {
                return false;
            }
        } else if (i == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        d impl = getImpl();
        int visibility = impl.s.getVisibility();
        int i = impl.o;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.S;
        if (colorStateList == null) {
            km.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.T;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(n5.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().e();
    }

    public final void k(oa.a aVar, boolean z) {
        com.google.android.material.floatingactionbutton.a aVar2;
        boolean z2;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        boolean z3 = true;
        if (impl.s.getVisibility() == 0 ? impl.o != 1 : impl.o == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Animator animator = impl.j;
            if (animator != null) {
                animator.cancel();
            }
            FloatingActionButton floatingActionButton = impl.s;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if ((!floatingActionButton.isLaidOut() || impl.s.isInEditMode()) ? false : false) {
                if (impl.s.getVisibility() != 0) {
                    impl.s.setAlpha(0.0f);
                    impl.s.setScaleY(0.0f);
                    impl.s.setScaleX(0.0f);
                    impl.n = 0.0f;
                    Matrix matrix = impl.v;
                    matrix.reset();
                    impl.s.getDrawable();
                    impl.s.setImageMatrix(matrix);
                }
                q60 q60Var = impl.k;
                if (q60Var == null) {
                    if (impl.h == null) {
                        impl.h = q60.a(impl.s.getContext(), bh0.design_fab_show_motion_spec);
                    }
                    q60Var = impl.h;
                    q60Var.getClass();
                }
                AnimatorSet a2 = impl.a(q60Var, 1.0f, 1.0f, 1.0f);
                a2.addListener(new com.google.android.material.floatingactionbutton.c(impl, z, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.p;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.s.b(0, z);
            impl.s.setAlpha(1.0f);
            impl.s.setScaleY(1.0f);
            impl.s.setScaleX(1.0f);
            impl.n = 1.0f;
            Matrix matrix2 = impl.v;
            matrix2.reset();
            impl.s.getDrawable();
            impl.s.setImageMatrix(matrix2);
            if (aVar2 != null) {
                aVar2.a.b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof mq)) {
            ViewTreeObserver viewTreeObserver = impl.s.getViewTreeObserver();
            if (impl.w == null) {
                impl.w = new lq(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.w);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.s.getViewTreeObserver();
        lq lqVar = impl.w;
        if (lqVar != null) {
            viewTreeObserver.removeOnPreDrawListener(lqVar);
            impl.w = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = (getSizeDimension() + 0) / 2;
        getImpl().l();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qp)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qp qpVar = (qp) parcelable;
        super.onRestoreInstanceState(qpVar.P);
        qpVar.R.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new os0();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (isLaidOut()) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.R != mode) {
            this.R = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        d impl = getImpl();
        if (impl.d != f) {
            impl.d = f;
            impl.h(f, impl.e, impl.f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.e != f) {
            impl.e = f;
            impl.h(impl.d, f, impl.f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.f != f) {
            impl.f = f;
            impl.h(impl.d, impl.e, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.W) {
            this.W = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().b) {
            getImpl().b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(q60 q60Var) {
        getImpl().l = q60Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(q60.a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.n = impl.n;
            Matrix matrix = impl.v;
            matrix.reset();
            impl.s.getDrawable();
            impl.s.setImageMatrix(matrix);
            if (this.S != null) {
                j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            getImpl().j();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<d.e> arrayList = getImpl().r;
        if (arrayList != null) {
            Iterator<d.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<d.e> arrayList = getImpl().r;
        if (arrayList != null) {
            Iterator<d.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        d impl = getImpl();
        impl.c = z;
        impl.l();
        throw null;
    }

    @Override // defpackage.or0
    public void setShapeAppearanceModel(kr0 kr0Var) {
        getImpl().a = kr0Var;
    }

    public void setShowMotionSpec(q60 q60Var) {
        getImpl().k = q60Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(q60.a(getContext(), i));
    }

    public void setSize(int i) {
        this.W = 0;
        if (i != this.V) {
            this.V = i;
            requestLayout();
        }
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // defpackage.lx0
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            j();
        }
    }

    @Override // defpackage.lx0
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.T != mode) {
            this.T = mode;
            j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().i();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().i();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().i();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            getImpl().f();
        }
    }

    @Override // defpackage.r51, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}