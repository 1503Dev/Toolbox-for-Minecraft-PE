package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: q5  reason: default package */
public class q5 extends ImageButton implements ix0, lx0 {
    public final w4 P;
    public final r5 Q;

    public q5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ih0.imageButtonStyle);
    }

    public q5(Context context, AttributeSet attributeSet, int i) {
        super(ex0.a(context), attributeSet, i);
        w4 w4Var = new w4(this);
        this.P = w4Var;
        w4Var.d(attributeSet, i);
        r5 r5Var = new r5(this);
        this.Q = r5Var;
        r5Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.a();
        }
        r5 r5Var = this.Q;
        if (r5Var != null) {
            r5Var.a();
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

    @Override // defpackage.lx0
    public ColorStateList getSupportImageTintList() {
        fx0 fx0Var;
        r5 r5Var = this.Q;
        if (r5Var == null || (fx0Var = r5Var.b) == null) {
            return null;
        }
        return fx0Var.a;
    }

    @Override // defpackage.lx0
    public PorterDuff.Mode getSupportImageTintMode() {
        fx0 fx0Var;
        r5 r5Var = this.Q;
        if (r5Var == null || (fx0Var = r5Var.b) == null) {
            return null;
        }
        return fx0Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        boolean z;
        Drawable background = this.Q.a.getBackground();
        if (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        r5 r5Var = this.Q;
        if (r5Var != null) {
            r5Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        r5 r5Var = this.Q;
        if (r5Var != null) {
            r5Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.Q.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        r5 r5Var = this.Q;
        if (r5Var != null) {
            r5Var.a();
        }
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

    @Override // defpackage.lx0
    public void setSupportImageTintList(ColorStateList colorStateList) {
        r5 r5Var = this.Q;
        if (r5Var != null) {
            if (r5Var.b == null) {
                r5Var.b = new fx0();
            }
            fx0 fx0Var = r5Var.b;
            fx0Var.a = colorStateList;
            fx0Var.d = true;
            r5Var.a();
        }
    }

    @Override // defpackage.lx0
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        r5 r5Var = this.Q;
        if (r5Var != null) {
            if (r5Var.b == null) {
                r5Var.b = new fx0();
            }
            fx0 fx0Var = r5Var.b;
            fx0Var.b = mode;
            fx0Var.c = true;
            r5Var.a();
        }
    }
}