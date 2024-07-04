package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: a81  reason: default package */
public final class a81 extends z71 {
    public static Method W;

    public a81(b81 b81Var, Resources resources) {
        super(b81Var, resources);
        if (W == null) {
            try {
                W = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // defpackage.z71
    public final boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.U;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        Rect dirtyBounds;
        dirtyBounds = this.U.getDirtyBounds();
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.U.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.U;
        if (drawable != null && (method = W) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.U.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.U.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // defpackage.z71, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // defpackage.z71, android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.U.setTint(i);
        }
    }

    @Override // defpackage.z71, android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.U.setTintList(colorStateList);
        }
    }

    @Override // defpackage.z71, android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.U.setTintMode(mode);
        }
    }

    public a81(Drawable drawable) {
        super(drawable);
        if (W == null) {
            try {
                W = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}