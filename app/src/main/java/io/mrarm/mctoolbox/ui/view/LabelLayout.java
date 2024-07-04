package io.mrarm.mctoolbox.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.mrarm.mctoolbox.ui.view.LabelLayout;

public class LabelLayout extends FrameLayout {
    public static final /* synthetic */ int j0 = 0;
    public FrameLayout P;
    public View Q;
    public CharSequence R;
    public TextPaint S;
    public ColorStateList T;
    public int U;
    public boolean V;
    public float W;
    public float a0;
    public float b0;
    public int c0;
    public int d0;
    public float e0;
    public boolean f0;
    public ValueAnimator g0;
    public up h0;
    public AccelerateInterpolator i0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            LabelLayout labelLayout = LabelLayout.this;
            int i = LabelLayout.j0;
            labelLayout.b(false);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public LabelLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.W = 0.0f;
        this.a0 = 0.0f;
        this.b0 = 0.0f;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 1.0f;
        this.f0 = false;
        this.h0 = new up();
        this.i0 = new AccelerateInterpolator();
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        super.addView(this.P, -1, generateDefaultLayoutParams());
        TextPaint textPaint = new TextPaint(129);
        this.S = textPaint;
        textPaint.setTypeface(Typeface.DEFAULT);
        this.c0 = getResources().getDimensionPixelSize(2131165247);
        this.d0 = getResources().getDimensionPixelSize(2131165254);
        this.S.setTextSize(this.c0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, kj0.LabelLayout, 0, 0);
        try {
            this.f0 = obtainStyledAttributes.getBoolean(3, false);
            this.R = obtainStyledAttributes.getString(1);
            this.T = obtainStyledAttributes.getColorStateList(0);
            this.U = obtainStyledAttributes.getColor(2, 0);
            obtainStyledAttributes.recycle();
            this.S.setColor(this.T.getColorForState(getDrawableState(), this.T.getDefaultColor()));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.g0.setDuration(200L);
            this.g0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r00
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LabelLayout labelLayout = LabelLayout.this;
                    int i = LabelLayout.j0;
                    labelLayout.getClass();
                    labelLayout.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    labelLayout.invalidate();
                }
            });
            d();
            c();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean a(View view) {
        if (view.isFocused()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.Q = view;
        this.P.addView(view, i, layoutParams);
        d();
        if (view instanceof EditText) {
            ((EditText) view).addTextChangedListener(new a());
        }
        b(false);
    }

    public final void b(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        View view = this.Q;
        if (view != null && (view instanceof TextView) && ((TextView) view).getText().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !a(this)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f0) {
            z3 = false;
        }
        float f = this.e0;
        float f2 = 0.0f;
        if (f <= 0.0f || f >= 1.0f) {
            if (f == 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 == z4 && !this.g0.isRunning()) {
                return;
            }
        }
        if (z) {
            ValueAnimator valueAnimator = this.g0;
            float[] fArr = new float[2];
            fArr[0] = this.e0;
            if (z3) {
                f2 = 1.0f;
            }
            fArr[1] = f2;
            valueAnimator.setFloatValues(fArr);
            this.g0.start();
            return;
        }
        this.g0.cancel();
        if (z3) {
            f2 = 1.0f;
        }
        this.e0 = f2;
    }

    public final void c() {
        View view;
        if (this.Q == null) {
            return;
        }
        this.W = this.Q.getPaddingLeft() + view.getLeft();
        this.S.setTextSize(this.c0);
        this.a0 = getPaddingTop() - this.S.ascent();
        this.S.setTextSize(this.d0);
        int top = this.Q.getTop();
        View view2 = this.Q;
        int compoundPaddingTop = top + (view2 instanceof TextView ? ((TextView) view2).getCompoundPaddingTop() : view2.getPaddingTop());
        int bottom = this.Q.getBottom();
        View view3 = this.Q;
        float compoundPaddingBottom = ((compoundPaddingTop + (bottom - (view3 instanceof TextView ? ((TextView) view3).getCompoundPaddingBottom() : view3.getPaddingBottom()))) / 2) + this.P.getTop();
        this.b0 = compoundPaddingBottom;
        this.b0 = (((this.S.descent() - this.S.ascent()) / 2.0f) - this.S.descent()) + compoundPaddingBottom;
    }

    public final void d() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        this.S.setTextSize(this.c0);
        int i = (int) (-this.S.ascent());
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.P.requestLayout();
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int save = canvas.save();
        if (this.R != null) {
            float min = Math.min(Math.max(this.e0, 0.0f), 1.0f);
            this.e0 = min;
            float f = this.a0;
            float interpolation = ((1.0f - this.i0.getInterpolation(1.0f - min)) * (this.b0 - f)) + f;
            this.S.setTextSize(this.e0 > 0.0f ? this.d0 : this.c0);
            this.S.setLinearText(false);
            float f2 = this.e0;
            if (f2 > 0.0f && f2 < 1.0f) {
                int i = this.c0;
                float interpolation2 = (((1.0f - this.h0.getInterpolation(1.0f - f2)) * (this.d0 - i)) + i) / this.d0;
                canvas.scale(interpolation2, interpolation2, this.W, interpolation);
                this.S.setLinearText(true);
            }
            CharSequence charSequence = this.R;
            canvas.drawText(charSequence, 0, charSequence.length(), this.W, interpolation, this.S);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.Q != null) {
            boolean a2 = a(this);
            this.S.setColor(a2 ? this.U : this.T.getColorForState(getDrawableState(), this.T.getDefaultColor()));
            if (this.V != a2) {
                this.V = a2;
                b(true);
                invalidate();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    public void setHint(CharSequence charSequence) {
        this.R = charSequence;
        d();
    }
}