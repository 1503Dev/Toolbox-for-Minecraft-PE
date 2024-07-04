package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;

public class MaterialToolbar extends Toolbar {
    public static final int E0 = zi0.Widget_MaterialComponents_Toolbar;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(yw0.d(context, attributeSet, r0, E0), attributeSet, r0);
        int i;
        int i2 = gh0.toolbarStyle;
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            o40 o40Var = new o40();
            if (background != null) {
                i = ((ColorDrawable) background).getColor();
            } else {
                i = 0;
            }
            o40Var.i(ColorStateList.valueOf(i));
            o40Var.g(context2);
            o40Var.h(a41.e(this));
            setBackground(o40Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof o40) {
            vj.B(this, (o40) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof o40) {
            ((o40) background).h(f);
        }
    }
}