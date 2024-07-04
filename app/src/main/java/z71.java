package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: z71  reason: default package */
public class z71 extends Drawable implements Drawable.Callback, y71, dx0 {
    public static final PorterDuff.Mode V = PorterDuff.Mode.SRC_IN;
    public int P;
    public PorterDuff.Mode Q;
    public boolean R;
    public b81 S;
    public boolean T;
    public Drawable U;

    public z71(b81 b81Var, Resources resources) {
        Drawable.ConstantState constantState;
        this.S = b81Var;
        if (b81Var == null || (constantState = b81Var.b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    @Override // defpackage.y71
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.U = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            b81 b81Var = this.S;
            if (b81Var != null) {
                b81Var.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // defpackage.y71
    public final Drawable b() {
        return this.U;
    }

    public boolean c() {
        return true;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            b81 b81Var = this.S;
            ColorStateList colorStateList = b81Var.c;
            PorterDuff.Mode mode = b81Var.d;
            if (colorStateList == null || mode == null) {
                this.R = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.R || colorForState != this.P || mode != this.Q) {
                    setColorFilter(colorForState, mode);
                    this.P = colorForState;
                    this.Q = mode;
                    this.R = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.U.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        b81 b81Var = this.S;
        return changingConfigurations | (b81Var != null ? b81Var.getChangingConfigurations() : 0) | this.U.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        b81 b81Var = this.S;
        if (b81Var != null) {
            if (b81Var.b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b81Var.a = getChangingConfigurations();
                return this.S;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.U.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.U.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.U.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return km.b(this.U);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.U.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.U.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.U.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.U.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.U.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.U.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.U.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        b81 b81Var;
        ColorStateList colorStateList = (!c() || (b81Var = this.S) == null) ? null : b81Var.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.U.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.U.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.T && super.mutate() == this) {
            this.S = new b81(this.S);
            Drawable drawable = this.U;
            if (drawable != null) {
                drawable.mutate();
            }
            b81 b81Var = this.S;
            if (b81Var != null) {
                Drawable drawable2 = this.U;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                b81Var.b = constantState;
            }
            this.T = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.U;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return km.d(this.U, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.U.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.U.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.U.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.U.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.U.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.U.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.U.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.U.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public void setTintList(ColorStateList colorStateList) {
        this.S.c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public void setTintMode(PorterDuff.Mode mode) {
        this.S.d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.U.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public z71(Drawable drawable) {
        this.S = new b81(this.S);
        a(drawable);
    }
}