package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
        boolean z;
        TypedValue a = y30.a(context, gh0.textAppearanceLineHeightEnabled);
        if (a != null && a.type == 18 && a.data == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = ij0.MaterialTextView;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int h = h(context, obtainStyledAttributes, ij0.MaterialTextView_android_lineHeight, ij0.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (!(h != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(ij0.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    d(resourceId, theme);
                }
            }
        }
    }

    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    public final void d(int i, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, ij0.MaterialTextAppearance);
        int h = h(getContext(), obtainStyledAttributes, ij0.MaterialTextAppearance_android_lineHeight, ij0.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (h >= 0) {
            setLineHeight(h);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        TypedValue a = y30.a(context, gh0.textAppearanceLineHeightEnabled);
        boolean z = true;
        if (a != null && a.type == 18 && a.data == 0) {
            z = false;
        }
        if (z) {
            d(i, context.getTheme());
        }
    }
}