package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.a;
import defpackage.lw0;
import defpackage.s0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

public class Chip extends z4 implements a.InterfaceC0024a, or0 {
    public static final Rect l0 = new Rect();
    public static final int[] m0 = {16842913};
    public static final int[] n0 = {16842911};
    public com.google.android.material.chip.a S;
    public InsetDrawable T;
    public RippleDrawable U;
    public View.OnClickListener V;
    public CompoundButton.OnCheckedChangeListener W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public int f0;
    public int g0;
    public final b h0;
    public final Rect i0;
    public final RectF j0;
    public final a k0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends z61 {
        public a() {
        }

        @Override // defpackage.z61
        public final void S0(int i) {
        }

        @Override // defpackage.z61
        public final void T0(Typeface typeface, boolean z) {
            CharSequence text;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.S;
            if (aVar.q1) {
                text = aVar.s0;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends pp {
        public b(Chip chip) {
            super(chip);
        }

        @Override // defpackage.pp
        public final void l(ArrayList arrayList) {
            boolean z = false;
            arrayList.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.l0;
            if (chip.e()) {
                com.google.android.material.chip.a aVar = Chip.this.S;
                if (aVar != null && aVar.y0) {
                    z = true;
                }
                if (z) {
                    arrayList.add(1);
                }
            }
        }

        @Override // defpackage.pp
        public final boolean o(int i, int i2) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.V;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.h0.t(1, 1);
                }
            }
            return z;
        }

        @Override // defpackage.pp
        public final void p(s0 s0Var) {
            String str;
            s0Var.a.setCheckable(Chip.this.f());
            s0Var.a.setClickable(Chip.this.isClickable());
            if (!Chip.this.f() && !Chip.this.isClickable()) {
                str = "android.view.View";
            } else if (Chip.this.f()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            s0Var.h(str);
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                s0Var.a.setText(text);
            } else {
                s0Var.j(text);
            }
        }

        @Override // defpackage.pp
        public final void q(int i, s0 s0Var) {
            String str = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = ui0.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                s0Var.j(closeIconContentDescription);
                s0Var.a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                s0Var.b(s0.a.e);
                s0Var.a.setEnabled(Chip.this.isEnabled());
                return;
            }
            s0Var.j("");
            s0Var.a.setBoundsInParent(Chip.l0);
        }

        @Override // defpackage.pp
        public final void r(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.d0 = z;
                chip.refreshDrawableState();
            }
        }

        public final int v(float f, float f2) {
            Chip chip = Chip.this;
            Rect rect = Chip.l0;
            if (chip.e() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r9);
        iw0 iw0Var;
        TextUtils.TruncateAt truncateAt;
        int i;
        int i2;
        q60 q60Var;
        Context context2;
        int i3;
        float dimension;
        float dimension2;
        float dimension3;
        float dimension4;
        int i4;
        boolean hasValue;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int i5 = gh0.chipStyle;
        this.i0 = new Rect();
        this.j0 = new RectF();
        this.k0 = new a();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        int i6 = zi0.Widget_MaterialComponents_Chip_Action;
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context, attributeSet, i5, i6);
        Context context3 = aVar.R0;
        int[] iArr = ij0.Chip;
        TypedArray e = yw0.e(context3, attributeSet, iArr, i5, i6, new int[0]);
        int i7 = ij0.Chip_shapeAppearance;
        aVar.s1 = e.hasValue(i7);
        ColorStateList b2 = n40.b(aVar.R0, e, ij0.Chip_chipSurfaceColor);
        if (aVar.l0 != b2) {
            aVar.l0 = b2;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList b3 = n40.b(aVar.R0, e, ij0.Chip_chipBackgroundColor);
        if (aVar.m0 != b3) {
            aVar.m0 = b3;
            aVar.onStateChange(aVar.getState());
        }
        float dimension5 = e.getDimension(ij0.Chip_chipMinHeight, 0.0f);
        if (aVar.n0 != dimension5) {
            aVar.n0 = dimension5;
            aVar.invalidateSelf();
            aVar.t();
        }
        int i8 = ij0.Chip_chipCornerRadius;
        if (e.hasValue(i8)) {
            aVar.y(e.getDimension(i8, 0.0f));
        }
        aVar.D(n40.b(aVar.R0, e, ij0.Chip_chipStrokeColor));
        aVar.E(e.getDimension(ij0.Chip_chipStrokeWidth, 0.0f));
        aVar.N(n40.b(aVar.R0, e, ij0.Chip_rippleColor));
        String text = e.getText(ij0.Chip_android_text);
        text = text == null ? "" : text;
        if (!TextUtils.equals(aVar.s0, text)) {
            aVar.s0 = text;
            aVar.X0.d = true;
            aVar.invalidateSelf();
            aVar.t();
        }
        Context context4 = aVar.R0;
        int i9 = ij0.Chip_android_textAppearance;
        q60 q60Var2 = null;
        if (e.hasValue(i9) && (resourceId3 = e.getResourceId(i9, 0)) != 0) {
            iw0Var = new iw0(context4, resourceId3);
        } else {
            iw0Var = null;
        }
        aVar.X0.b(iw0Var, aVar.R0);
        int i10 = e.getInt(ij0.Chip_android_ellipsize, 0);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    truncateAt = TextUtils.TruncateAt.END;
                }
                aVar.C(e.getBoolean(ij0.Chip_chipIconVisible, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                    aVar.C(e.getBoolean(ij0.Chip_chipIconEnabled, false));
                }
                aVar.z(n40.c(aVar.R0, e, ij0.Chip_chipIcon));
                i = ij0.Chip_chipIconTint;
                if (e.hasValue(i)) {
                    aVar.B(n40.b(aVar.R0, e, i));
                }
                aVar.A(e.getDimension(ij0.Chip_chipIconSize, 0.0f));
                aVar.K(e.getBoolean(ij0.Chip_closeIconVisible, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                    aVar.K(e.getBoolean(ij0.Chip_closeIconEnabled, false));
                }
                aVar.F(n40.c(aVar.R0, e, ij0.Chip_closeIcon));
                aVar.J(n40.b(aVar.R0, e, ij0.Chip_closeIconTint));
                aVar.H(e.getDimension(ij0.Chip_closeIconSize, 0.0f));
                aVar.v(e.getBoolean(ij0.Chip_android_checkable, false));
                aVar.x(e.getBoolean(ij0.Chip_checkedIconVisible, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                    aVar.x(e.getBoolean(ij0.Chip_checkedIconEnabled, false));
                }
                aVar.w(n40.c(aVar.R0, e, ij0.Chip_checkedIcon));
                Context context5 = aVar.R0;
                i2 = ij0.Chip_showMotionSpec;
                if (!e.hasValue(i2) && (resourceId2 = e.getResourceId(i2, 0)) != 0) {
                    q60Var = q60.a(context5, resourceId2);
                } else {
                    q60Var = null;
                }
                aVar.H0 = q60Var;
                context2 = aVar.R0;
                i3 = ij0.Chip_hideMotionSpec;
                if (e.hasValue(i3) && (resourceId = e.getResourceId(i3, 0)) != 0) {
                    q60Var2 = q60.a(context2, resourceId);
                }
                aVar.I0 = q60Var2;
                dimension = e.getDimension(ij0.Chip_chipStartPadding, 0.0f);
                if (aVar.J0 != dimension) {
                    aVar.J0 = dimension;
                    aVar.invalidateSelf();
                    aVar.t();
                }
                aVar.M(e.getDimension(ij0.Chip_iconStartPadding, 0.0f));
                aVar.L(e.getDimension(ij0.Chip_iconEndPadding, 0.0f));
                dimension2 = e.getDimension(ij0.Chip_textStartPadding, 0.0f);
                if (aVar.M0 != dimension2) {
                    aVar.M0 = dimension2;
                    aVar.invalidateSelf();
                    aVar.t();
                }
                dimension3 = e.getDimension(ij0.Chip_textEndPadding, 0.0f);
                if (aVar.N0 != dimension3) {
                    aVar.N0 = dimension3;
                    aVar.invalidateSelf();
                    aVar.t();
                }
                aVar.I(e.getDimension(ij0.Chip_closeIconStartPadding, 0.0f));
                aVar.G(e.getDimension(ij0.Chip_closeIconEndPadding, 0.0f));
                dimension4 = e.getDimension(ij0.Chip_chipEndPadding, 0.0f);
                if (aVar.Q0 != dimension4) {
                    aVar.Q0 = dimension4;
                    aVar.invalidateSelf();
                    aVar.t();
                }
                aVar.r1 = e.getDimensionPixelSize(ij0.Chip_android_maxWidth, Integer.MAX_VALUE);
                e.recycle();
                TypedArray e2 = yw0.e(context, attributeSet, iArr, i5, i6, new int[0]);
                this.e0 = e2.getBoolean(ij0.Chip_ensureMinTouchTargetSize, false);
                this.g0 = (int) Math.ceil(e2.getDimension(ij0.Chip_chipMinTouchTargetSize, (float) Math.ceil(b51.a(getContext(), 48))));
                e2.recycle();
                setChipDrawable(aVar);
                aVar.h(a41.e(this));
                TypedArray e3 = yw0.e(context, attributeSet, iArr, i5, i6, new int[0]);
                i4 = Build.VERSION.SDK_INT;
                if (i4 < 23) {
                    setTextColor(n40.b(context, e3, ij0.Chip_android_textColor));
                }
                hasValue = e3.hasValue(i7);
                e3.recycle();
                b bVar = new b(this);
                this.h0 = bVar;
                if (i4 < 24) {
                    a41.n(this, bVar);
                } else {
                    g();
                }
                if (!hasValue && i4 >= 21) {
                    setOutlineProvider(new tc(this));
                }
                setChecked(this.a0);
                setText(aVar.s0);
                setEllipsize(aVar.p1);
                setIncludeFontPadding(false);
                k();
                if (!this.S.q1) {
                    setSingleLine();
                }
                setGravity(8388627);
                j();
                if (this.e0) {
                    setMinHeight(this.g0);
                }
                this.f0 = getLayoutDirection();
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            truncateAt = TextUtils.TruncateAt.START;
        }
        aVar.p1 = truncateAt;
        aVar.C(e.getBoolean(ij0.Chip_chipIconVisible, false));
        if (attributeSet != null) {
            aVar.C(e.getBoolean(ij0.Chip_chipIconEnabled, false));
        }
        aVar.z(n40.c(aVar.R0, e, ij0.Chip_chipIcon));
        i = ij0.Chip_chipIconTint;
        if (e.hasValue(i)) {
        }
        aVar.A(e.getDimension(ij0.Chip_chipIconSize, 0.0f));
        aVar.K(e.getBoolean(ij0.Chip_closeIconVisible, false));
        if (attributeSet != null) {
            aVar.K(e.getBoolean(ij0.Chip_closeIconEnabled, false));
        }
        aVar.F(n40.c(aVar.R0, e, ij0.Chip_closeIcon));
        aVar.J(n40.b(aVar.R0, e, ij0.Chip_closeIconTint));
        aVar.H(e.getDimension(ij0.Chip_closeIconSize, 0.0f));
        aVar.v(e.getBoolean(ij0.Chip_android_checkable, false));
        aVar.x(e.getBoolean(ij0.Chip_checkedIconVisible, false));
        if (attributeSet != null) {
            aVar.x(e.getBoolean(ij0.Chip_checkedIconEnabled, false));
        }
        aVar.w(n40.c(aVar.R0, e, ij0.Chip_checkedIcon));
        Context context52 = aVar.R0;
        i2 = ij0.Chip_showMotionSpec;
        if (!e.hasValue(i2)) {
        }
        q60Var = null;
        aVar.H0 = q60Var;
        context2 = aVar.R0;
        i3 = ij0.Chip_hideMotionSpec;
        if (e.hasValue(i3)) {
            q60Var2 = q60.a(context2, resourceId);
        }
        aVar.I0 = q60Var2;
        dimension = e.getDimension(ij0.Chip_chipStartPadding, 0.0f);
        if (aVar.J0 != dimension) {
        }
        aVar.M(e.getDimension(ij0.Chip_iconStartPadding, 0.0f));
        aVar.L(e.getDimension(ij0.Chip_iconEndPadding, 0.0f));
        dimension2 = e.getDimension(ij0.Chip_textStartPadding, 0.0f);
        if (aVar.M0 != dimension2) {
        }
        dimension3 = e.getDimension(ij0.Chip_textEndPadding, 0.0f);
        if (aVar.N0 != dimension3) {
        }
        aVar.I(e.getDimension(ij0.Chip_closeIconStartPadding, 0.0f));
        aVar.G(e.getDimension(ij0.Chip_closeIconEndPadding, 0.0f));
        dimension4 = e.getDimension(ij0.Chip_chipEndPadding, 0.0f);
        if (aVar.Q0 != dimension4) {
        }
        aVar.r1 = e.getDimensionPixelSize(ij0.Chip_android_maxWidth, Integer.MAX_VALUE);
        e.recycle();
        TypedArray e22 = yw0.e(context, attributeSet, iArr, i5, i6, new int[0]);
        this.e0 = e22.getBoolean(ij0.Chip_ensureMinTouchTargetSize, false);
        this.g0 = (int) Math.ceil(e22.getDimension(ij0.Chip_chipMinTouchTargetSize, (float) Math.ceil(b51.a(getContext(), 48))));
        e22.recycle();
        setChipDrawable(aVar);
        aVar.h(a41.e(this));
        TypedArray e32 = yw0.e(context, attributeSet, iArr, i5, i6, new int[0]);
        i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
        }
        hasValue = e32.hasValue(i7);
        e32.recycle();
        b bVar2 = new b(this);
        this.h0 = bVar2;
        if (i4 < 24) {
        }
        if (!hasValue) {
            setOutlineProvider(new tc(this));
        }
        setChecked(this.a0);
        setText(aVar.s0);
        setEllipsize(aVar.p1);
        setIncludeFontPadding(false);
        k();
        if (!this.S.q1) {
        }
        setGravity(8388627);
        j();
        if (this.e0) {
        }
        this.f0 = getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.j0.setEmpty();
        if (e()) {
            com.google.android.material.chip.a aVar = this.S;
            RectF rectF = this.j0;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.Q()) {
                float f = aVar.Q0 + aVar.P0 + aVar.C0 + aVar.O0 + aVar.N0;
                if (km.b(aVar) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return this.j0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.i0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.i0;
    }

    private iw0 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.X0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0024a
    public final void a() {
        d(this.g0);
        h();
        j();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public final void d(int i) {
        int i2;
        int i3;
        this.g0 = i;
        if (!this.e0) {
            if (this.T != null) {
                this.T = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
                return;
            }
            return;
        }
        int max = Math.max(0, i - ((int) this.S.n0));
        int max2 = Math.max(0, i - this.S.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.T != null) {
                this.T = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
                return;
            }
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        } else {
            i3 = 0;
        }
        if (this.T != null) {
            Rect rect = new Rect();
            this.T.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.T = new InsetDrawable((Drawable) this.S, i2, i3, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Field declaredField;
        boolean z;
        boolean z2;
        if (motionEvent.getAction() == 10) {
            try {
                declaredField = pp.class.getDeclaredField("m");
                declaredField.setAccessible(true);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
            if (((Integer) declaredField.get(this.h0)).intValue() != Integer.MIN_VALUE) {
                Method declaredMethod = pp.class.getDeclaredMethod("u", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.h0, Integer.valueOf((int) RecyclerView.UNDEFINED_DURATION));
                z = true;
                if (!z) {
                    b bVar = this.h0;
                    if (bVar.h.isEnabled() && bVar.h.isTouchExplorationEnabled()) {
                        int action = motionEvent.getAction();
                        if (action != 7 && action != 9) {
                            if (action == 10 && bVar.m != Integer.MIN_VALUE) {
                                bVar.u(RecyclerView.UNDEFINED_DURATION);
                                z2 = true;
                            }
                        } else {
                            int v = bVar.v(motionEvent.getX(), motionEvent.getY());
                            bVar.u(v);
                        }
                        if (z2 && !super.dispatchHoverEvent(motionEvent)) {
                            return false;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                return true;
            }
        }
        z = false;
        if (!z) {
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.h0;
        bVar.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i2 = 130;
                                        }
                                    } else {
                                        i2 = 17;
                                    }
                                } else {
                                    i2 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && bVar.m(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = bVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        bVar.o(i3, 16);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = bVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = bVar.m(1, null);
            }
        }
        if (z && this.h0.l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.z4, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.S;
        boolean z = false;
        if (aVar != null && com.google.android.material.chip.a.s(aVar.z0)) {
            com.google.android.material.chip.a aVar2 = this.S;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.d0) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.c0) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.b0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.d0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.c0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.b0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(aVar2.l1, iArr)) {
                aVar2.l1 = iArr;
                if (aVar2.Q()) {
                    z = aVar2.u(aVar2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            Drawable drawable = aVar.z0;
            if (drawable != null) {
                if (drawable instanceof y71) {
                    drawable = ((y71) drawable).b();
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        com.google.android.material.chip.a aVar = this.S;
        return aVar != null && aVar.E0;
    }

    public final void g() {
        b bVar;
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        if (e()) {
            com.google.android.material.chip.a aVar = this.S;
            if (aVar != null && aVar.y0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar = this.h0;
                a41.n(this, bVar);
            }
        }
        bVar = null;
        a41.n(this, bVar);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.T;
        return insetDrawable == null ? this.S : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.G0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.m0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.q();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.S;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.Q0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || (drawable = aVar.u0) == null) {
            return null;
        }
        if (drawable instanceof y71) {
            drawable = ((y71) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.w0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.v0;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.n0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.J0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.p0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.q0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || (drawable = aVar.z0) == null) {
            return null;
        }
        if (drawable instanceof y71) {
            drawable = ((y71) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.D0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.P0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.C0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.O0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.B0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.p1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        b bVar = this.h0;
        if (bVar.l != 1 && bVar.k != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public q60 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.I0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.L0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.K0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.r0;
        }
        return null;
    }

    public kr0 getShapeAppearanceModel() {
        return this.S.P.a;
    }

    public q60 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.H0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.N0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            return aVar.M0;
        }
        return 0.0f;
    }

    public final void h() {
        if (am0.a) {
            i();
            return;
        }
        com.google.android.material.chip.a aVar = this.S;
        if (!aVar.m1) {
            aVar.m1 = true;
            aVar.n1 = am0.b(aVar.r0);
            aVar.onStateChange(aVar.getState());
        }
        Drawable backgroundDrawable = getBackgroundDrawable();
        WeakHashMap<View, String> weakHashMap = a41.a;
        setBackground(backgroundDrawable);
        if (getBackgroundDrawable() == this.T && this.S.getCallback() == null) {
            this.S.setCallback(this.T);
        }
    }

    public final void i() {
        this.U = new RippleDrawable(am0.b(this.S.r0), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.S;
        if (aVar.m1) {
            aVar.m1 = false;
            aVar.n1 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.U;
        WeakHashMap<View, String> weakHashMap = a41.a;
        setBackground(rippleDrawable);
    }

    public final void j() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.S) != null) {
            float p = aVar.p();
            com.google.android.material.chip.a aVar2 = this.S;
            int o = (int) (aVar2.o() + aVar2.J0 + aVar2.M0);
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, String> weakHashMap = a41.a;
            setPaddingRelative(o, paddingTop, (int) (p + aVar.Q0 + aVar.N0), paddingBottom);
        }
    }

    public final void k() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        iw0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(getContext(), paint, this.k0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vj.B(this, this.S);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, m0);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, n0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        b bVar = this.h0;
        int i2 = bVar.l;
        if (i2 != Integer.MIN_VALUE) {
            bVar.j(i2);
        }
        if (z) {
            bVar.m(i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((f() || isClickable()) ? f() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f0 != i) {
            this.f0 = i;
            j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.b0) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.b0) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.V;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                this.h0.t(1, 1);
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        if (!z && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.U) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.z4, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.U) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.z4, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.v(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.v(aVar.R0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null) {
            this.a0 = z;
        } else if (aVar.E0) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.W) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.w(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.w(z5.b(aVar.R0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.x(aVar.R0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.x(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || aVar.m0 == colorStateList) {
            return;
        }
        aVar.m0 = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList a2;
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null && aVar.m0 != (a2 = z5.a(aVar.R0, i))) {
            aVar.m0 = a2;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.y(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.y(aVar.R0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.S;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.o1 = new WeakReference<>(null);
            }
            this.S = aVar;
            aVar.q1 = false;
            aVar.o1 = new WeakReference<>(this);
            d(this.g0);
            h();
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || aVar.Q0 == f) {
            return;
        }
        aVar.Q0 = f;
        aVar.invalidateSelf();
        aVar.t();
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            float dimension = aVar.R0.getResources().getDimension(i);
            if (aVar.Q0 != dimension) {
                aVar.Q0 = dimension;
                aVar.invalidateSelf();
                aVar.t();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.z(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.z(z5.b(aVar.R0, i));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.A(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.A(aVar.R0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.B(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.B(z5.a(aVar.R0, i));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.C(aVar.R0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.C(z);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || aVar.n0 == f) {
            return;
        }
        aVar.n0 = f;
        aVar.invalidateSelf();
        aVar.t();
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            float dimension = aVar.R0.getResources().getDimension(i);
            if (aVar.n0 != dimension) {
                aVar.n0 = dimension;
                aVar.invalidateSelf();
                aVar.t();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || aVar.J0 == f) {
            return;
        }
        aVar.J0 = f;
        aVar.invalidateSelf();
        aVar.t();
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            float dimension = aVar.R0.getResources().getDimension(i);
            if (aVar.J0 != dimension) {
                aVar.J0 = dimension;
                aVar.invalidateSelf();
                aVar.t();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.D(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.D(z5.a(aVar.R0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.E(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.E(aVar.R0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.F(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        boolean z;
        x9 x9Var;
        lw0.d dVar;
        SpannableStringBuilder spannableStringBuilder;
        char c;
        lw0.d dVar2;
        String str;
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null && aVar.D0 != charSequence) {
            String str2 = x9.d;
            Locale locale = Locale.getDefault();
            int i = ow0.a;
            boolean z2 = false;
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                x9Var = x9.g;
            } else {
                x9Var = x9.f;
            }
            kw0 kw0Var = x9Var.c;
            if (charSequence == null) {
                spannableStringBuilder = null;
            } else {
                boolean b2 = ((lw0.c) kw0Var).b(charSequence, charSequence.length());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if ((x9Var.b & 2) != 0) {
                    z2 = true;
                }
                String str3 = "";
                if (z2) {
                    if (b2) {
                        dVar2 = lw0.b;
                    } else {
                        dVar2 = lw0.a;
                    }
                    boolean b3 = dVar2.b(charSequence, charSequence.length());
                    if (!x9Var.a && (b3 || x9.a(charSequence) == 1)) {
                        str = x9.d;
                    } else if (!x9Var.a || (b3 && x9.a(charSequence) != -1)) {
                        str = "";
                    } else {
                        str = x9.e;
                    }
                    spannableStringBuilder2.append((CharSequence) str);
                }
                if (b2 != x9Var.a) {
                    if (b2) {
                        c = 8235;
                    } else {
                        c = 8234;
                    }
                    spannableStringBuilder2.append(c);
                    spannableStringBuilder2.append(charSequence);
                    spannableStringBuilder2.append((char) 8236);
                } else {
                    spannableStringBuilder2.append(charSequence);
                }
                if (b2) {
                    dVar = lw0.b;
                } else {
                    dVar = lw0.a;
                }
                boolean b4 = dVar.b(charSequence, charSequence.length());
                if (!x9Var.a && (b4 || x9.b(charSequence) == 1)) {
                    str3 = x9.d;
                } else if (x9Var.a && (!b4 || x9.b(charSequence) == -1)) {
                    str3 = x9.e;
                }
                spannableStringBuilder2.append((CharSequence) str3);
                spannableStringBuilder = spannableStringBuilder2;
            }
            aVar.D0 = spannableStringBuilder;
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.G(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.G(aVar.R0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.F(z5.b(aVar.R0, i));
        }
        g();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.H(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.H(aVar.R0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.I(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.I(aVar.R0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.J(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.J(z5.a(aVar.R0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.K(z);
        }
        g();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.h(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.S == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.S;
            if (aVar != null) {
                aVar.p1 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.e0 = z;
        d(this.g0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(q60 q60Var) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.I0 = q60Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.I0 = q60.a(aVar.R0, i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.L(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.L(aVar.R0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.M(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.M(aVar.R0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.S == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.r1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.W = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.V = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.N(colorStateList);
        }
        if (!this.S.m1) {
            i();
        }
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.N(z5.a(aVar.R0, i));
            if (!this.S.m1) {
                i();
            }
        }
    }

    @Override // defpackage.or0
    public void setShapeAppearanceModel(kr0 kr0Var) {
        this.S.setShapeAppearanceModel(kr0Var);
    }

    public void setShowMotionSpec(q60 q60Var) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.H0 = q60Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.H0 = q60.a(aVar.R0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.q1) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.S;
        if (aVar2 != null && !TextUtils.equals(aVar2.s0, charSequence)) {
            aVar2.s0 = charSequence;
            aVar2.X0.d = true;
            aVar2.invalidateSelf();
            aVar2.t();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.X0.b(new iw0(aVar.R0, i), aVar.R0);
        }
        k();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || aVar.N0 == f) {
            return;
        }
        aVar.N0 = f;
        aVar.invalidateSelf();
        aVar.t();
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            float dimension = aVar.R0.getResources().getDimension(i);
            if (aVar.N0 != dimension) {
                aVar.N0 = dimension;
                aVar.invalidateSelf();
                aVar.t();
            }
        }
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar == null || aVar.M0 == f) {
            return;
        }
        aVar.M0 = f;
        aVar.invalidateSelf();
        aVar.t();
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            float dimension = aVar.R0.getResources().getDimension(i);
            if (aVar.M0 != dimension) {
                aVar.M0 = dimension;
                aVar.invalidateSelf();
                aVar.t();
            }
        }
    }

    public void setTextAppearance(iw0 iw0Var) {
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.X0.b(iw0Var, aVar.R0);
        }
        k();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.S;
        if (aVar != null) {
            aVar.X0.b(new iw0(aVar.R0, i), aVar.R0);
        }
        k();
    }
}