package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: c1  reason: default package */
public final class c1 extends Drawable {
    public final ActionBarContainer a;

    public c1(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.W) {
            Drawable drawable = actionBarContainer.V;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.T;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.a;
        Drawable drawable3 = actionBarContainer2.U;
        if (drawable3 == null || !actionBarContainer2.a0) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.W) {
            Drawable drawable = actionBarContainer.V;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.T;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}