package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: r5  reason: default package */
public final class r5 {
    public final ImageView a;
    public fx0 b;
    public fx0 c;

    public r5(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            um.b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i <= 21 && i == 21) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.c == null) {
                    this.c = new fx0();
                }
                fx0 fx0Var = this.c;
                PorterDuff.Mode mode2 = null;
                fx0Var.a = null;
                fx0Var.d = false;
                fx0Var.b = null;
                fx0Var.c = false;
                ImageView imageView = this.a;
                if (i >= 21) {
                    colorStateList = imageView.getImageTintList();
                } else if (imageView instanceof lx0) {
                    colorStateList = ((lx0) imageView).getSupportImageTintList();
                } else {
                    colorStateList = null;
                }
                if (colorStateList != null) {
                    fx0Var.d = true;
                    fx0Var.a = colorStateList;
                }
                ImageView imageView2 = this.a;
                if (i >= 21) {
                    mode = imageView2.getImageTintMode();
                } else {
                    if (imageView2 instanceof lx0) {
                        mode2 = ((lx0) imageView2).getSupportImageTintMode();
                    }
                    mode = mode2;
                }
                if (mode != null) {
                    fx0Var.c = true;
                    fx0Var.b = mode;
                }
                if (!fx0Var.d && !fx0Var.c) {
                    z2 = false;
                } else {
                    n5.e(drawable, fx0Var, this.a.getDrawableState());
                }
                if (z2) {
                    return;
                }
            }
            fx0 fx0Var2 = this.b;
            if (fx0Var2 != null) {
                n5.e(drawable, fx0Var2, this.a.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        ColorStateList imageTintList;
        int i2;
        hx0 m = hx0.m(this.a.getContext(), attributeSet, lj0.AppCompatImageView, i);
        try {
            Drawable drawable2 = this.a.getDrawable();
            if (drawable2 == null && (i2 = m.i(lj0.AppCompatImageView_srcCompat, -1)) != -1 && (drawable2 = z5.b(this.a.getContext(), i2)) != null) {
                this.a.setImageDrawable(drawable2);
            }
            if (drawable2 != null) {
                um.b(drawable2);
            }
            int i3 = lj0.AppCompatImageView_tint;
            if (m.l(i3)) {
                cx.a(this.a, m.b(i3));
            }
            int i4 = lj0.AppCompatImageView_tintMode;
            if (m.l(i4)) {
                ImageView imageView = this.a;
                PorterDuff.Mode d = um.d(m.h(i4, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 21) {
                    imageView.setImageTintMode(d);
                    if (i5 == 21 && (drawable = imageView.getDrawable()) != null) {
                        imageTintList = imageView.getImageTintList();
                        if (imageTintList != null) {
                            if (drawable.isStateful()) {
                                drawable.setState(imageView.getDrawableState());
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    }
                } else if (imageView instanceof lx0) {
                    ((lx0) imageView).setSupportImageTintMode(d);
                }
            }
        } finally {
            m.n();
        }
    }

    public final void c(int i) {
        if (i != 0) {
            Drawable b = z5.b(this.a.getContext(), i);
            if (b != null) {
                um.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }
}