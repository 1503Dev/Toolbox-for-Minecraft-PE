package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.c;
import java.util.WeakHashMap;

public class NavigationMenuItemView extends cr implements l.a {
    public static final int[] x0 = {16842912};
    public int n0;
    public boolean o0;
    public boolean p0;
    public final CheckedTextView q0;
    public FrameLayout r0;
    public h s0;
    public ColorStateList t0;
    public boolean u0;
    public Drawable v0;
    public final a w0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends h0 {
        public a() {
        }

        @Override // defpackage.h0
        public final void d(View view, s0 s0Var) {
            this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
            s0Var.a.setCheckable(NavigationMenuItemView.this.p0);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.w0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ki0.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(rh0.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(fi0.design_menu_item_text);
        this.q0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        a41.n(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.r0 == null) {
                this.r0 = (FrameLayout) ((ViewStub) findViewById(fi0.design_menu_item_action_area_stub)).inflate();
            }
            this.r0.removeAllViews();
            this.r0.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public final void c(h hVar) {
        int i;
        c.a aVar;
        int i2;
        StateListDrawable stateListDrawable;
        this.s0 = hVar;
        if (hVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(ih0.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(x0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, String> weakHashMap = a41.a;
            setBackground(stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.q);
        f01.a(hVar.r, this);
        h hVar2 = this.s0;
        if ((hVar2.e == null && hVar2.getIcon() == null && this.s0.getActionView() != null) ? false : false) {
            this.q0.setVisibility(8);
            FrameLayout frameLayout = this.r0;
            if (frameLayout != null) {
                aVar = (c.a) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            this.q0.setVisibility(0);
            FrameLayout frameLayout2 = this.r0;
            if (frameLayout2 != null) {
                aVar = (c.a) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        ((ViewGroup.MarginLayoutParams) aVar).width = i2;
        this.r0.setLayoutParams(aVar);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public h getItemData() {
        return this.s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.s0;
        if (hVar != null && hVar.isCheckable() && this.s0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, x0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.p0 != z) {
            this.p0 = z;
            this.w0.h(this.q0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.q0.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        Drawable drawable2;
        if (drawable != null) {
            if (this.u0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = km.h(drawable).mutate();
                km.f(drawable, this.t0);
            }
            int i = this.n0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.o0) {
            if (this.v0 == null) {
                Resources resources = getResources();
                int i2 = wh0.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = il0.a;
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable2 = resources.getDrawable(i2, theme);
                } else {
                    drawable2 = resources.getDrawable(i2);
                }
                this.v0 = drawable2;
                if (drawable2 != null) {
                    int i3 = this.n0;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.v0;
        }
        this.q0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.q0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.n0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        this.u0 = colorStateList != null;
        h hVar = this.s0;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.q0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.o0 = z;
    }

    public void setTextAppearance(int i) {
        xw0.e(this.q0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.q0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.q0.setText(charSequence);
    }
}