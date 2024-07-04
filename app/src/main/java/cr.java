package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.c;

/* renamed from: cr  reason: default package */
public class cr extends c {
    public Drawable h0;
    public final Rect i0;
    public final Rect j0;
    public int k0;
    public boolean l0;
    public boolean m0;

    public cr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.i0 = new Rect();
        this.j0 = new Rect();
        this.k0 = 119;
        this.l0 = true;
        this.m0 = false;
        TypedArray e = yw0.e(context, attributeSet, ij0.ForegroundLinearLayout, 0, 0, new int[0]);
        this.k0 = e.getInt(ij0.ForegroundLinearLayout_android_foregroundGravity, this.k0);
        Drawable drawable = e.getDrawable(ij0.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.l0 = e.getBoolean(ij0.ForegroundLinearLayout_foregroundInsidePadding, true);
        e.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.h0;
        if (drawable != null) {
            if (this.m0) {
                this.m0 = false;
                Rect rect = this.i0;
                Rect rect2 = this.j0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.l0) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.k0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.h0;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.h0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.h0.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.h0;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.k0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m0 = z | this.m0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.m0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.h0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.h0);
            }
            this.h0 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.k0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.k0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.k0 = i;
            if (i == 119 && this.h0 != null) {
                this.h0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h0;
    }
}