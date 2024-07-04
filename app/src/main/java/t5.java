package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: t5  reason: default package */
public final class t5 extends MultiAutoCompleteTextView implements ix0 {
    public static final int[] R = {16843126};
    public final w4 P;
    public final l6 Q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t5(Context context, AttributeSet attributeSet) {
        super(ex0.a(context), attributeSet, r0);
        int i = ih0.autoCompleteTextViewStyle;
        hx0 m = hx0.m(getContext(), attributeSet, R, i);
        if (m.l(0)) {
            setDropDownBackgroundDrawable(m.e(0));
        }
        m.n();
        w4 w4Var = new w4(this);
        this.P = w4Var;
        w4Var.d(attributeSet, i);
        l6 l6Var = new l6(this);
        this.Q = l6Var;
        l6Var.d(attributeSet, i);
        l6Var.b();
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p5.m(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(z5.b(getContext(), i));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.e(context, i);
        }
    }
}