package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.tf0;
import defpackage.xq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements ix0, kx0, w7 {
    public final w4 P;
    public final l6 Q;
    public final e6 R;
    public Future<tf0> S;

    public AppCompatTextView() {
        throw null;
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(ex0.a(context), attributeSet, i);
        w4 w4Var = new w4(this);
        this.P = w4Var;
        w4Var.d(attributeSet, i);
        l6 l6Var = new l6(this);
        this.Q = l6Var;
        l6Var.d(attributeSet, i);
        l6Var.b();
        this.R = new e6(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.a();
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (w7.a) {
            return super.getAutoSizeMaxTextSize();
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            return Math.round(l6Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (w7.a) {
            return super.getAutoSizeMinTextSize();
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            return Math.round(l6Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (w7.a) {
            return super.getAutoSizeStepGranularity();
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            return Math.round(l6Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (w7.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            return l6Var.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (w7.a) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        l6 l6Var = this.Q;
        if (l6Var == null) {
            return 0;
        }
        return l6Var.i.a;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // defpackage.ix0
    public ColorStateList getSupportBackgroundTintList() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.b();
        }
        return null;
    }

    @Override // defpackage.ix0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        fx0 fx0Var = this.Q.h;
        if (fx0Var != null) {
            return fx0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        fx0 fx0Var = this.Q.h;
        if (fx0Var != null) {
            return fx0Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<tf0> future = this.S;
        if (future != null) {
            try {
                this.S = null;
                xw0.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        e6 e6Var;
        if (Build.VERSION.SDK_INT < 28 && (e6Var = this.R) != null) {
            TextClassifier textClassifier = e6Var.b;
            if (textClassifier == null) {
                TextClassificationManager textClassificationManager = (TextClassificationManager) e6Var.a.getContext().getSystemService(TextClassificationManager.class);
                if (textClassificationManager != null) {
                    return textClassificationManager.getTextClassifier();
                }
                textClassifier = TextClassifier.NO_OP;
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public tf0.a getTextMetricsParamsCompat() {
        return xw0.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p5.m(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        l6 l6Var = this.Q;
        if (l6Var != null && !w7.a) {
            l6Var.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<tf0> future = this.S;
        if (future != null) {
            try {
                this.S = null;
                xw0.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        l6 l6Var = this.Q;
        if (l6Var != null && !w7.a) {
            o6 o6Var = l6Var.i;
            if (o6Var.i() && o6Var.a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.Q.i.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (w7.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.f(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (w7.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (w7.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? z5.b(context, i) : null, i2 != 0 ? z5.b(context, i2) : null, i3 != 0 ? z5.b(context, i3) : null, i4 != 0 ? z5.b(context, i4) : null);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? z5.b(context, i) : null, i2 != 0 ? z5.b(context, i2) : null, i3 != 0 ? z5.b(context, i3) : null, i4 != 0 ? z5.b(context, i4) : null);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xw0.f(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            xw0.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            xw0.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ja.a(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(tf0 tf0Var) {
        xw0.d(this, tf0Var);
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.h(colorStateList);
        }
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.i(mode);
        }
    }

    @Override // defpackage.kx0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z;
        l6 l6Var = this.Q;
        if (l6Var.h == null) {
            l6Var.h = new fx0();
        }
        fx0 fx0Var = l6Var.h;
        fx0Var.a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        fx0Var.d = z;
        l6Var.b = fx0Var;
        l6Var.c = fx0Var;
        l6Var.d = fx0Var;
        l6Var.e = fx0Var;
        l6Var.f = fx0Var;
        l6Var.g = fx0Var;
        l6Var.b();
    }

    @Override // defpackage.kx0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z;
        l6 l6Var = this.Q;
        if (l6Var.h == null) {
            l6Var.h = new fx0();
        }
        fx0 fx0Var = l6Var.h;
        fx0Var.b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        fx0Var.c = z;
        l6Var.b = fx0Var;
        l6Var.c = fx0Var;
        l6Var.d = fx0Var;
        l6Var.e = fx0Var;
        l6Var.f = fx0Var;
        l6Var.g = fx0Var;
        l6Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        e6 e6Var;
        if (Build.VERSION.SDK_INT < 28 && (e6Var = this.R) != null) {
            e6Var.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<tf0> future) {
        this.S = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(tf0.a aVar) {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.b;
        int i2 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        if (i < 23) {
            float textScaleX = aVar.a.getTextScaleX();
            getPaint().set(aVar.a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.a);
        hl0.b(this, aVar.c);
        y5.b(this, aVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = w7.a;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        l6 l6Var = this.Q;
        if (l6Var != null && !z2) {
            o6 o6Var = l6Var.i;
            if (o6Var.i() && o6Var.a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                l6Var.i.f(i, f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r0 != null) goto L19;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTypeface(Typeface typeface, int i) {
        xq.b bVar;
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            Context context = getContext();
            e21 e21Var = w11.a;
            if (context != null) {
                if (Build.VERSION.SDK_INT < 21) {
                    e21 e21Var2 = w11.a;
                    e21Var2.getClass();
                    long g = e21.g(typeface);
                    if (g == 0) {
                        bVar = null;
                    } else {
                        bVar = e21Var2.a.get(Long.valueOf(g));
                    }
                    if (bVar != null) {
                        typeface2 = e21Var2.a(context, bVar, context.getResources(), i);
                    }
                }
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }
}