package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    private static int floatingToolbarItemBackgroundResId = -1;

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public x4 createButton(Context context, AttributeSet attributeSet) {
        return shouldInflateAppCompatButton(context, attributeSet) ? new x4(context, attributeSet) : new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public z4 createCheckBox(Context context, AttributeSet attributeSet) {
        return new k40(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public w5 createRadioButton(Context context, AttributeSet attributeSet) {
        return new m40(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23 || i == 24 || i == 25) {
            if (floatingToolbarItemBackgroundResId == -1) {
                floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
            }
            int i2 = floatingToolbarItemBackgroundResId;
            if (i2 != 0 && i2 != -1) {
                for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                    if (attributeSet.getAttributeNameResource(i3) == 16842964) {
                        if (floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i3, null, 0)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}