package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int i0 = 0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;
        public boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.ExtendedFloatingActionButton_Behavior_Layout);
            this.b = obtainStyledAttributes.getBoolean(ij0.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.c = obtainStyledAttributes.getBoolean(ij0.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view) {
            int i = ExtendedFloatingActionButton.i0;
            ((ExtendedFloatingActionButton) view).getLeft();
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z = ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList d = coordinatorLayout.d(extendedFloatingActionButton);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) d.get(i2);
                if (view2 instanceof AppBarLayout) {
                    t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z = ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z) {
                        u(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i);
            int i3 = ExtendedFloatingActionButton.i0;
            return true;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((!this.b && !this.c) || fVar.f != appBarLayout.getId()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            rk.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                boolean z2 = this.c;
                int i = ExtendedFloatingActionButton.i0;
                throw null;
            }
            boolean z3 = this.c;
            int i2 = ExtendedFloatingActionButton.i0;
            throw null;
        }

        public final boolean u(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((!this.b && !this.c) || fVar.f != view.getId()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                boolean z2 = this.c;
                int i = ExtendedFloatingActionButton.i0;
                throw null;
            }
            boolean z3 = this.c;
            int i2 = ExtendedFloatingActionButton.i0;
            throw null;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    static {
        new a();
        new b();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        WeakHashMap<View, String> weakHashMap = a41.a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public q60 getExtendMotionSpec() {
        throw null;
    }

    public q60 getHideMotionSpec() {
        throw null;
    }

    public q60 getShowMotionSpec() {
        throw null;
    }

    public q60 getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(q60 q60Var) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(q60.a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(q60 q60Var) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(q60.a(getContext(), i));
    }

    public void setShowMotionSpec(q60 q60Var) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(q60.a(getContext(), i));
    }

    public void setShrinkMotionSpec(q60 q60Var) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(q60.a(getContext(), i));
    }
}