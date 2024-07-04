package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public class MaterialButton extends x4 implements Checkable, or0 {
    public static final int[] f0 = {16842911};
    public static final int[] g0 = {16842912};
    public static final int h0 = zi0.Widget_MaterialComponents_Button;
    public final z30 R;
    public final LinkedHashSet<a> S;
    public PorterDuff.Mode T;
    public ColorStateList U;
    public Drawable V;
    public int W;
    public int a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public int e0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(yw0.d(context, attributeSet, r6, r7), attributeSet, r6);
        int i = gh0.materialButtonStyle;
        int i2 = h0;
        this.S = new LinkedHashSet<>();
        this.c0 = false;
        this.d0 = false;
        Context context2 = getContext();
        TypedArray e = yw0.e(context2, attributeSet, ij0.MaterialButton, i, i2, new int[0]);
        this.b0 = e.getDimensionPixelSize(ij0.MaterialButton_iconPadding, 0);
        this.T = b51.b(e.getInt(ij0.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.U = n40.b(getContext(), e, ij0.MaterialButton_iconTint);
        this.V = n40.c(getContext(), e, ij0.MaterialButton_icon);
        this.e0 = e.getInteger(ij0.MaterialButton_iconGravity, 1);
        this.W = e.getDimensionPixelSize(ij0.MaterialButton_iconSize, 0);
        z30 z30Var = new z30(this, kr0.b(context2, attributeSet, i, i2).a());
        this.R = z30Var;
        z30Var.c(e);
        e.recycle();
        setCompoundDrawablePadding(this.b0);
        b(this.V != null);
    }

    private String getA11yClassName() {
        boolean z;
        Class cls;
        z30 z30Var = this.R;
        if (z30Var != null && z30Var.q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public final boolean a() {
        z30 z30Var = this.R;
        return (z30Var == null || z30Var.o) ? false : true;
    }

    public final void b(boolean z) {
        boolean z2;
        Drawable drawable = this.V;
        boolean z3 = false;
        if (drawable != null) {
            Drawable mutate = km.h(drawable).mutate();
            this.V = mutate;
            km.f(mutate, this.U);
            PorterDuff.Mode mode = this.T;
            if (mode != null) {
                km.g(this.V, mode);
            }
            int i = this.W;
            if (i == 0) {
                i = this.V.getIntrinsicWidth();
            }
            int i2 = this.W;
            if (i2 == 0) {
                i2 = this.V.getIntrinsicHeight();
            }
            Drawable drawable2 = this.V;
            int i3 = this.a0;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.e0;
        if (i4 != 1 && i4 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            Drawable drawable3 = this.V;
            if (z2) {
                setCompoundDrawablesRelative(drawable3, null, null, null);
                return;
            } else {
                setCompoundDrawablesRelative(null, null, drawable3, null);
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable4 = compoundDrawablesRelative[0];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((z2 && drawable4 != this.V) || (!z2 && drawable5 != this.V)) {
            z3 = true;
        }
        if (z3) {
            Drawable drawable6 = this.V;
            if (z2) {
                setCompoundDrawablesRelative(drawable6, null, null, null);
            } else {
                setCompoundDrawablesRelative(null, null, drawable6, null);
            }
        }
    }

    public final void c() {
        boolean z;
        if (this.V != null && getLayout() != null) {
            int i = this.e0;
            boolean z2 = true;
            if (i != 1 && i != 3) {
                TextPaint paint = getPaint();
                String charSequence = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                }
                int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
                int i2 = this.W;
                if (i2 == 0) {
                    i2 = this.V.getIntrinsicWidth();
                }
                int measuredWidth = getMeasuredWidth() - min;
                WeakHashMap<View, String> weakHashMap = a41.a;
                int paddingEnd = ((((measuredWidth - getPaddingEnd()) - i2) - this.b0) - getPaddingStart()) / 2;
                if (getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.e0 != 4) {
                    z2 = false;
                }
                if (z != z2) {
                    paddingEnd = -paddingEnd;
                }
                if (this.a0 != paddingEnd) {
                    this.a0 = paddingEnd;
                    b(false);
                    return;
                }
                return;
            }
            this.a0 = 0;
            b(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.R.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.V;
    }

    public int getIconGravity() {
        return this.e0;
    }

    public int getIconPadding() {
        return this.b0;
    }

    public int getIconSize() {
        return this.W;
    }

    public ColorStateList getIconTint() {
        return this.U;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.T;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.R.l;
        }
        return null;
    }

    public kr0 getShapeAppearanceModel() {
        if (a()) {
            return this.R.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.R.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.R.h;
        }
        return 0;
    }

    @Override // defpackage.x4, defpackage.ix0
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.R.j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // defpackage.x4, defpackage.ix0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.R.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.c0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vj.B(this, this.R.b(false));
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        z30 z30Var = this.R;
        if (z30Var != null && z30Var.q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, g0);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.x4, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // defpackage.x4, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        z30 z30Var = this.R;
        if (z30Var != null && z30Var.q) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.x4, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z30 z30Var;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (z30Var = this.R) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = z30Var.m;
            if (drawable != null) {
                drawable.setBounds(z30Var.c, z30Var.e, i6 - z30Var.d, i5 - z30Var.f);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }

    @Override // defpackage.x4, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        c();
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (a()) {
            z30 z30Var = this.R;
            if (z30Var.b(false) != null) {
                z30Var.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.x4, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                z30 z30Var = this.R;
                z30Var.o = true;
                z30Var.a.setSupportBackgroundTintList(z30Var.j);
                z30Var.a.setSupportBackgroundTintMode(z30Var.i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.x4, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? z5.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.R.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        boolean z2;
        z30 z30Var = this.R;
        if (z30Var != null && z30Var.q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && isEnabled() && this.c0 != z) {
            this.c0 = z;
            refreshDrawableState();
            if (this.d0) {
                return;
            }
            this.d0 = true;
            Iterator<a> it = this.S.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.d0 = false;
        }
    }

    public void setCornerRadius(int i) {
        if (a()) {
            z30 z30Var = this.R;
            if (!z30Var.p || z30Var.g != i) {
                z30Var.g = i;
                z30Var.p = true;
                z30Var.e(z30Var.b.e(i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.R.b(false).h(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.V != drawable) {
            this.V = drawable;
            b(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.e0 != i) {
            this.e0 = i;
            c();
        }
    }

    public void setIconPadding(int i) {
        if (this.b0 != i) {
            this.b0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? z5.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.W != i) {
            this.W = i;
            b(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            b(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.T != mode) {
            this.T = mode;
            b(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(z5.a(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            this.R.d(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(z5.a(getContext(), i));
        }
    }

    @Override // defpackage.or0
    public void setShapeAppearanceModel(kr0 kr0Var) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.R.e(kr0Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            z30 z30Var = this.R;
            z30Var.n = z;
            z30Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            z30 z30Var = this.R;
            if (z30Var.k != colorStateList) {
                z30Var.k = colorStateList;
                z30Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(z5.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            z30 z30Var = this.R;
            if (z30Var.h != i) {
                z30Var.h = i;
                z30Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.x4, defpackage.ix0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            z30 z30Var = this.R;
            if (z30Var.j != colorStateList) {
                z30Var.j = colorStateList;
                if (z30Var.b(false) != null) {
                    km.f(z30Var.b(false), z30Var.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // defpackage.x4, defpackage.ix0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            z30 z30Var = this.R;
            if (z30Var.i != mode) {
                z30Var.i = mode;
                if (z30Var.b(false) != null && z30Var.i != null) {
                    km.g(z30Var.b(false), z30Var.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.c0);
    }
}