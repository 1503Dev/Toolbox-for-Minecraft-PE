package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: vm  reason: default package */
public class vm extends Drawable implements Drawable.Callback {
    public Drawable P;

    public vm(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.P = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.P.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.P.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.P.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.P.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.P.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.P.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.P.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.P.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.P.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.P.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.P.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.P.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.P.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.P.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.P.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.P.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.P.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.P.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.P.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.P.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.P.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.P.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        km.c(this.P, f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.P;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.P.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        km.e(this.P, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        km.f(this.P, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        km.g(this.P, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.P.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}