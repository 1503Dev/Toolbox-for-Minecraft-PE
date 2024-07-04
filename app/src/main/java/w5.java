package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: w5  reason: default package */
public class w5 extends RadioButton implements jx0, ix0 {
    public final b5 P;
    public final w4 Q;
    public final l6 R;

    public w5(Context context, AttributeSet attributeSet, int i) {
        super(ex0.a(context), attributeSet, i);
        b5 b5Var = new b5(this);
        this.P = b5Var;
        b5Var.b(attributeSet, i);
        w4 w4Var = new w4(this);
        this.Q = w4Var;
        w4Var.d(attributeSet, i);
        l6 l6Var = new l6(this);
        this.R = l6Var;
        l6Var.d(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w4 w4Var = this.Q;
        if (w4Var != null) {
            w4Var.a();
        }
        l6 l6Var = this.R;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        b5 b5Var = this.P;
        if (b5Var != null) {
            b5Var.getClass();
        }
        return compoundPaddingLeft;
    }

    @Override // defpackage.ix0
    public ColorStateList getSupportBackgroundTintList() {
        w4 w4Var = this.Q;
        if (w4Var != null) {
            return w4Var.b();
        }
        return null;
    }

    @Override // defpackage.ix0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w4 w4Var = this.Q;
        if (w4Var != null) {
            return w4Var.c();
        }
        return null;
    }

    @Override // defpackage.jx0
    public ColorStateList getSupportButtonTintList() {
        b5 b5Var = this.P;
        if (b5Var != null) {
            return b5Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        b5 b5Var = this.P;
        if (b5Var != null) {
            return b5Var.c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w4 w4Var = this.Q;
        if (w4Var != null) {
            w4Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w4 w4Var = this.Q;
        if (w4Var != null) {
            w4Var.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(z5.b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        b5 b5Var = this.P;
        if (b5Var != null) {
            if (b5Var.f) {
                b5Var.f = false;
                return;
            }
            b5Var.f = true;
            b5Var.a();
        }
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w4 w4Var = this.Q;
        if (w4Var != null) {
            w4Var.h(colorStateList);
        }
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w4 w4Var = this.Q;
        if (w4Var != null) {
            w4Var.i(mode);
        }
    }

    @Override // defpackage.jx0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        b5 b5Var = this.P;
        if (b5Var != null) {
            b5Var.b = colorStateList;
            b5Var.d = true;
            b5Var.a();
        }
    }

    @Override // defpackage.jx0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        b5 b5Var = this.P;
        if (b5Var != null) {
            b5Var.c = mode;
            b5Var.e = true;
            b5Var.a();
        }
    }
}