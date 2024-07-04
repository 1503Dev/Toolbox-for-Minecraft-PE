package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: u5  reason: default package */
public final class u5 extends PopupWindow {
    public static final boolean b;
    public boolean a;

    static {
        b = Build.VERSION.SDK_INT < 21;
    }

    public u5(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.PopupWindow, i, i2);
        int i3 = lj0.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i3)) {
            boolean z = obtainStyledAttributes.getBoolean(i3, false);
            if (b) {
                this.a = z;
            } else {
                of0.a(this, z);
            }
        }
        int i4 = lj0.PopupWindow_android_popupBackground;
        if (obtainStyledAttributes.hasValue(i4) && (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) != 0) {
            drawable = z5.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i4);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}