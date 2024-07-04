package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;

/* renamed from: zu0  reason: default package */
public class zu0 extends CompoundButton {
    public static final a E0 = new a();
    public static final int[] F0 = {16842912};
    public StaticLayout A0;
    public w3 B0;
    public ObjectAnimator C0;
    public final Rect D0;
    public Drawable P;
    public ColorStateList Q;
    public PorterDuff.Mode R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public PorterDuff.Mode W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public CharSequence g0;
    public CharSequence h0;
    public boolean i0;
    public int j0;
    public int k0;
    public float l0;
    public float m0;
    public VelocityTracker n0;
    public int o0;
    public float p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public final TextPaint x0;
    public ColorStateList y0;
    public StaticLayout z0;

    /* renamed from: zu0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Property<zu0, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(zu0 zu0Var) {
            return Float.valueOf(zu0Var.p0);
        }

        @Override // android.util.Property
        public final void set(zu0 zu0Var, Float f) {
            zu0Var.setThumbPosition(f.floatValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zu0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        Typeface typeface;
        Typeface create;
        int i;
        int resourceId;
        int i2 = ih0.switchStyle;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.T = false;
        this.V = null;
        this.W = null;
        this.a0 = false;
        this.b0 = false;
        this.n0 = VelocityTracker.obtain();
        this.D0 = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.x0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        hx0 hx0Var = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.SwitchCompat, i2, 0));
        Drawable e = hx0Var.e(lj0.SwitchCompat_android_thumb);
        this.P = e;
        if (e != null) {
            e.setCallback(this);
        }
        Drawable e2 = hx0Var.e(lj0.SwitchCompat_track);
        this.U = e2;
        if (e2 != null) {
            e2.setCallback(this);
        }
        this.g0 = hx0Var.k(lj0.SwitchCompat_android_textOn);
        this.h0 = hx0Var.k(lj0.SwitchCompat_android_textOff);
        this.i0 = hx0Var.a(lj0.SwitchCompat_showText, true);
        this.c0 = hx0Var.d(lj0.SwitchCompat_thumbTextPadding, 0);
        this.d0 = hx0Var.d(lj0.SwitchCompat_switchMinWidth, 0);
        this.e0 = hx0Var.d(lj0.SwitchCompat_switchPadding, 0);
        this.f0 = hx0Var.a(lj0.SwitchCompat_splitTrack, false);
        ColorStateList b = hx0Var.b(lj0.SwitchCompat_thumbTint);
        if (b != null) {
            this.Q = b;
            this.S = true;
        }
        PorterDuff.Mode d = um.d(hx0Var.h(lj0.SwitchCompat_thumbTintMode, -1), null);
        if (this.R != d) {
            this.R = d;
            this.T = true;
        }
        if (this.S || this.T) {
            a();
        }
        ColorStateList b2 = hx0Var.b(lj0.SwitchCompat_trackTint);
        if (b2 != null) {
            this.V = b2;
            this.a0 = true;
        }
        PorterDuff.Mode d2 = um.d(hx0Var.h(lj0.SwitchCompat_trackTintMode, -1), null);
        if (this.W != d2) {
            this.W = d2;
            this.b0 = true;
        }
        if (this.a0 || this.b0) {
            b();
        }
        int i3 = hx0Var.i(lj0.SwitchCompat_switchTextAppearance, 0);
        if (i3 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, lj0.TextAppearance);
            int i4 = lj0.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0 || (colorStateList = z5.a(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(i4) : colorStateList;
            this.y0 = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(lj0.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i5 = obtainStyledAttributes.getInt(lj0.TextAppearance_android_typeface, -1);
            int i6 = obtainStyledAttributes.getInt(lj0.TextAppearance_android_textStyle, -1);
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i6 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i6);
                } else {
                    create = Typeface.create(typeface, i6);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i = create.getStyle();
                } else {
                    i = 0;
                }
                int i7 = ((-1) ^ i) & i6;
                textPaint.setFakeBoldText((i7 & 1) != 0);
                textPaint.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            this.B0 = obtainStyledAttributes.getBoolean(lj0.TextAppearance_textAllCaps, false) ? new w3(getContext()) : null;
            obtainStyledAttributes.recycle();
        }
        new l6(this).d(attributeSet, i2);
        hx0Var.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k0 = viewConfiguration.getScaledTouchSlop();
        this.o0 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.p0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((c51.a(this) ? 1.0f - this.p0 : this.p0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.U;
        if (drawable != null) {
            Rect rect = this.D0;
            drawable.getPadding(rect);
            Drawable drawable2 = this.P;
            Rect c = drawable2 != null ? um.c(drawable2) : um.c;
            return ((((this.q0 - this.s0) - rect.left) - rect.right) - c.left) - c.right;
        }
        return 0;
    }

    public final void a() {
        Drawable drawable = this.P;
        if (drawable != null) {
            if (this.S || this.T) {
                Drawable mutate = km.h(drawable).mutate();
                this.P = mutate;
                if (this.S) {
                    km.f(mutate, this.Q);
                }
                if (this.T) {
                    km.g(this.P, this.R);
                }
                if (this.P.isStateful()) {
                    this.P.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.U;
        if (drawable != null) {
            if (this.a0 || this.b0) {
                Drawable mutate = km.h(drawable).mutate();
                this.U = mutate;
                if (this.a0) {
                    km.f(mutate, this.V);
                }
                if (this.b0) {
                    km.g(this.U, this.W);
                }
                if (this.U.isStateful()) {
                    this.U.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        w3 w3Var = this.B0;
        if (w3Var != null) {
            charSequence = w3Var.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.x0;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.D0;
        int i3 = this.t0;
        int i4 = this.u0;
        int i5 = this.v0;
        int i6 = this.w0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.P;
        if (drawable != null) {
            rect = um.c(drawable);
        } else {
            rect = um.c;
        }
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.U.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.U.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.P;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.s0 + rect2.right;
            this.P.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null && Build.VERSION.SDK_INT >= 21) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.P;
        if (drawable != null) {
            km.c(drawable, f, f2);
        }
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            km.c(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.P;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.U;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (c51.a(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.q0;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.e0 : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (c51.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.q0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.e0 : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.i0;
    }

    public boolean getSplitTrack() {
        return this.f0;
    }

    public int getSwitchMinWidth() {
        return this.d0;
    }

    public int getSwitchPadding() {
        return this.e0;
    }

    public CharSequence getTextOff() {
        return this.h0;
    }

    public CharSequence getTextOn() {
        return this.g0;
    }

    public Drawable getThumbDrawable() {
        return this.P;
    }

    public int getThumbTextPadding() {
        return this.c0;
    }

    public ColorStateList getThumbTintList() {
        return this.Q;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.R;
    }

    public Drawable getTrackDrawable() {
        return this.U;
    }

    public ColorStateList getTrackTintList() {
        return this.V;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.W;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.C0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.C0.end();
        this.C0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.D0;
        Drawable drawable = this.U;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.u0;
        int i2 = this.w0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.P;
        if (drawable != null) {
            if (!this.f0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c = um.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c.left;
                rect.right -= c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.z0 : this.A0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.y0;
            if (colorStateList != null) {
                this.x0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.x0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.g0 : this.h0;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.P != null) {
            Rect rect = this.D0;
            Drawable drawable = this.U;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c = um.c(this.P);
            i5 = Math.max(0, c.left - rect.left);
            i9 = Math.max(0, c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (c51.a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.q0 + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.q0) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i10 = this.r0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i10 / 2);
            i7 = i10 + height;
            i8 = height;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.r0 + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.r0;
        }
        this.t0 = i6;
        this.u0 = i8;
        this.w0 = i7;
        this.v0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.i0) {
            if (this.z0 == null) {
                this.z0 = c(this.g0);
            }
            if (this.A0 == null) {
                this.A0 = c(this.h0);
            }
        }
        Rect rect = this.D0;
        Drawable drawable = this.P;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.P.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.P.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.i0) {
            i5 = (this.c0 * 2) + Math.max(this.z0.getWidth(), this.A0.getWidth());
        } else {
            i5 = 0;
        }
        this.s0 = Math.max(i5, i3);
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.U.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.P;
        if (drawable3 != null) {
            Rect c = um.c(drawable3);
            i7 = Math.max(i7, c.left);
            i8 = Math.max(i8, c.right);
        }
        int max = Math.max(this.d0, (this.s0 * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.q0 = max;
        this.r0 = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.g0 : this.h0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float f;
        this.n0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.j0;
                    if (i != 1) {
                        if (i == 2) {
                            float x = motionEvent.getX();
                            int thumbScrollRange = getThumbScrollRange();
                            float f3 = x - this.l0;
                            if (thumbScrollRange != 0) {
                                f = f3 / thumbScrollRange;
                            } else if (f3 > 0.0f) {
                                f = 1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (c51.a(this)) {
                                f = -f;
                            }
                            float f4 = this.p0;
                            float f5 = f + f4;
                            if (f5 >= 0.0f) {
                                if (f5 > 1.0f) {
                                    f2 = 1.0f;
                                } else {
                                    f2 = f5;
                                }
                            }
                            if (f2 != f4) {
                                this.l0 = x;
                                setThumbPosition(f2);
                            }
                            return true;
                        }
                    } else {
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x2 - this.l0) > this.k0 || Math.abs(y - this.m0) > this.k0) {
                            this.j0 = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.l0 = x2;
                            this.m0 = y;
                            return true;
                        }
                    }
                }
            }
            if (this.j0 == 2) {
                this.j0 = 0;
                if (motionEvent.getAction() == 1 && isEnabled()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean isChecked = isChecked();
                if (z) {
                    this.n0.computeCurrentVelocity(1000);
                    float xVelocity = this.n0.getXVelocity();
                    if (Math.abs(xVelocity) > this.o0) {
                        if (!c51.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = getTargetCheckedState();
                    }
                } else {
                    z2 = isChecked;
                }
                if (z2 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z2);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.j0 = 0;
            this.n0.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                if (this.P != null) {
                    int thumbOffset = getThumbOffset();
                    this.P.getPadding(this.D0);
                    int i2 = this.u0;
                    int i3 = this.k0;
                    int i4 = i2 - i3;
                    int i5 = (this.t0 + thumbOffset) - i3;
                    Rect rect = this.D0;
                    int i6 = this.s0 + i5 + rect.left + rect.right + i3;
                    int i7 = this.w0 + i3;
                    if (x3 > i5 && x3 < i6 && y2 > i4 && y2 < i7) {
                        z3 = true;
                    }
                }
                if (z3) {
                    this.j0 = 1;
                    this.l0 = x3;
                    this.m0 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 0.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (isLaidOut()) {
                if (isChecked) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, E0, f);
                this.C0 = ofFloat;
                ofFloat.setDuration(250L);
                this.C0.setAutoCancel(true);
                this.C0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.C0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xw0.f(callback, this));
    }

    public void setShowText(boolean z) {
        if (this.i0 != z) {
            this.i0 = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.d0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.e0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.x0.getTypeface() == null || this.x0.getTypeface().equals(typeface)) && (this.x0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.x0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.h0 = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.g0 = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.P = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.p0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(z5.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.c0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.Q = colorStateList;
        this.S = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.R = mode;
        this.T = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.U = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(z5.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.V = colorStateList;
        this.a0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.W = mode;
        this.b0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P || drawable == this.U;
    }
}