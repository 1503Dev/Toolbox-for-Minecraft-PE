package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: cx  reason: default package */
public final class cx {
    public static void a(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            if (imageView instanceof lx0) {
                ((lx0) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        h4.d(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || d4.b(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}