package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int L0 = 0;
    public AnimatorSet E0;
    public Animator F0;
    public int G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public Behavior K0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public final a g;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (Behavior.this.f.get() != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Behavior.this.e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.g = new a();
            this.e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g = new a();
            this.e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.L0;
            View q = bottomAppBar.q();
            if (q != null) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (!q.isLaidOut()) {
                    ((CoordinatorLayout.f) q.getLayoutParams()).d = 49;
                    if (q instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) q;
                        floatingActionButton.addOnLayoutChangeListener(this.g);
                        floatingActionButton.c();
                        floatingActionButton.d(new ra(bottomAppBar));
                        floatingActionButton.e();
                    }
                    bottomAppBar.t();
                    throw null;
                }
            }
            coordinatorLayout.q(bottomAppBar, i);
            super.g(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.q(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends c0 {
        public static final Parcelable.Creator<a> CREATOR = new C0023a();
        public int R;
        public boolean S;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class C0023a implements Parcelable.ClassLoaderCreator<a> {
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
            this.S = parcel.readInt() != 0;
        }

        public a(Toolbar.g gVar) {
            super(gVar);
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return s(this.G0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().R;
    }

    private sa getTopEdgeTreatment() {
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.K0 == null) {
            this.K0 = new Behavior();
        }
        return this.K0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().R;
    }

    public int getFabAlignmentMode() {
        return this.G0;
    }

    public int getFabAnimationMode() {
        return this.H0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().Q;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().P;
    }

    public boolean getHideOnScroll() {
        return this.I0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vj.B(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int r;
        super.onLayout(z, i, i2, i3, i4);
        FloatingActionButton floatingActionButton = null;
        if (z) {
            Animator animator = this.F0;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = this.E0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            t();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            View q = q();
            if (q instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton) q;
            }
            if (floatingActionButton != null && floatingActionButton.i()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                r = r(actionMenuView, 0, false);
            } else {
                r = r(actionMenuView, this.G0, this.J0);
            }
            actionMenuView.setTranslationX(r);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.P);
        this.G0 = aVar.R;
        this.J0 = aVar.S;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a((Toolbar.g) super.onSaveInstanceState());
        aVar.R = this.G0;
        aVar.S = this.J0;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View q() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((os0) coordinatorLayout.Q.b).getOrDefault(this, null);
        coordinatorLayout.S.clear();
        if (list != null) {
            coordinatorLayout.S.addAll(list);
        }
        Iterator it = coordinatorLayout.S.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
            while (it.hasNext()) {
            }
        }
        return null;
    }

    public final int r(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2;
        int i2;
        int left;
        boolean z3;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (z2) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (z2) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        int i4 = i2 - left;
        if (i != 1 || !z) {
            return 0;
        }
        return i4;
    }

    public final float s(int i) {
        boolean z;
        WeakHashMap<View, String> weakHashMap = a41.a;
        int i2 = 1;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            int measuredWidth = (getMeasuredWidth() / 2) - 0;
            if (z) {
                i2 = -1;
            }
            return measuredWidth * i2;
        }
        return 0.0f;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        km.f(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f == getCradleVerticalOffset()) {
            return;
        }
        getTopEdgeTreatment().R = f;
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        boolean z;
        int i2;
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2;
        FloatingActionButton floatingActionButton3 = null;
        if (this.G0 != i) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (isLaidOut()) {
                AnimatorSet animatorSet = this.E0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.H0 == 1) {
                    View q = q();
                    if (q instanceof FloatingActionButton) {
                        floatingActionButton2 = (FloatingActionButton) q;
                    } else {
                        floatingActionButton2 = null;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton2, "translationX", s(i));
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                } else {
                    View q2 = q();
                    if (q2 instanceof FloatingActionButton) {
                        floatingActionButton = (FloatingActionButton) q2;
                    } else {
                        floatingActionButton = null;
                    }
                    if (floatingActionButton != null && !floatingActionButton.h()) {
                        floatingActionButton.g(new oa(this, i), true);
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                this.E0 = animatorSet2;
                animatorSet2.addListener(new na(this));
                this.E0.start();
            }
        }
        boolean z2 = this.J0;
        WeakHashMap<View, String> weakHashMap2 = a41.a;
        if (isLaidOut()) {
            Animator animator = this.F0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            View q3 = q();
            if (q3 instanceof FloatingActionButton) {
                floatingActionButton3 = (FloatingActionButton) q3;
            }
            if (floatingActionButton3 != null && floatingActionButton3.i()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - r(actionMenuView, i2, z2)) > 1.0f) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat3.addListener(new qa(this, actionMenuView, i2, z2));
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.setDuration(150L);
                    animatorSet3.playSequentially(ofFloat3, ofFloat2);
                    arrayList2.add(animatorSet3);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat2);
                }
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(arrayList2);
            this.F0 = animatorSet4;
            animatorSet4.addListener(new pa(this));
            this.F0.start();
        }
        this.G0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.H0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().Q = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().P = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.I0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void t() {
        FloatingActionButton floatingActionButton;
        sa topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        q();
        if (this.J0) {
            View q = q();
            if (q instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton) q;
            } else {
                floatingActionButton = null;
            }
            if (floatingActionButton != null) {
                floatingActionButton.i();
            }
        }
        throw null;
    }
}