package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: x4  reason: default package */
public class x4 extends Button implements ix0, w7 {
    public final w4 P;
    public final l6 Q;

    public x4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ih0.buttonStyle);
    }

    public x4(Context context, AttributeSet attributeSet, int i) {
        super(ex0.a(context), attributeSet, i);
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

    public ColorStateList getSupportBackgroundTintList() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        l6 l6Var = this.Q;
        if (l6Var != null && !w7.a) {
            l6Var.i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xw0.f(callback, this));
    }

    public void setSupportAllCaps(boolean z) {
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.h(colorStateList);
        }
    }

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
}