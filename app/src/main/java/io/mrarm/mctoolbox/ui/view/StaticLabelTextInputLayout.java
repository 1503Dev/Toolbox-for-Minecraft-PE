package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;

public class StaticLabelTextInputLayout extends TextInputLayout {
    public boolean h1;
    public boolean i1;
    public CharSequence j1;
    public TextPaint k1;
    public int l1;
    public int m1;
    public boolean n1;
    public float o1;
    public float p1;

    public StaticLabelTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h1 = false;
        this.i1 = false;
        this.o1 = 0.0f;
        this.p1 = 0.0f;
        TextPaint textPaint = new TextPaint(129);
        this.k1 = textPaint;
        textPaint.setTypeface(getTypeface());
        this.k1.setTextSize(getResources().getDimensionPixelSize(2131165247));
        this.l1 = getDefaultHintTextColor().getColorForState(LinearLayout.ENABLED_STATE_SET, 0);
        this.m1 = getHintTextColor().getColorForState(LinearLayout.ENABLED_FOCUSED_STATE_SET, 0);
        this.k1.setColor(this.l1);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (getEditText() != null) {
            setForceShowHint(true);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public final void draw(Canvas canvas) {
        CharSequence charSequence;
        super.draw(canvas);
        int save = canvas.save();
        if (this.h1 && (charSequence = this.j1) != null) {
            canvas.drawText(charSequence, 0, charSequence.length(), this.o1, this.p1 - this.k1.ascent(), this.k1);
        }
        canvas.restoreToCount(save);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean isFocused;
        TextPaint textPaint;
        int i;
        super.drawableStateChanged();
        if (getEditText() == null || this.n1 == (isFocused = getEditText().isFocused())) {
            return;
        }
        this.n1 = isFocused;
        if (isFocused) {
            textPaint = this.k1;
            i = this.m1;
        } else {
            textPaint = this.k1;
            i = this.l1;
        }
        textPaint.setColor(i);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getEditText() != null) {
            this.o1 = getEditText().getCompoundPaddingLeft() + getEditText().getLeft();
            this.p1 = getPaddingTop();
        }
    }

    public void setForceShowHint(boolean z) {
        CharSequence charSequence;
        boolean z2;
        if (z) {
            charSequence = getHint();
        } else {
            charSequence = null;
        }
        CharSequence charSequence2 = this.j1;
        this.j1 = charSequence;
        boolean z3 = this.h1;
        if (z != z3) {
            int i = 0;
            if (!this.f0 && !z3) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.i1 = z2;
            if (z) {
                setHintEnabled(false);
            }
            this.h1 = z;
            FrameLayout frameLayout = (FrameLayout) getChildAt(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            if (z) {
                i = (int) (-this.k1.ascent());
            }
            if (i != layoutParams.topMargin) {
                layoutParams.topMargin = i;
                frameLayout.requestLayout();
            }
            if (!z) {
                setHintEnabled(this.i1);
                setHint(charSequence2);
            }
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setHintEnabled(boolean z) {
        if (this.h1) {
            this.i1 = z;
        } else {
            super.setHintEnabled(z);
        }
    }
}