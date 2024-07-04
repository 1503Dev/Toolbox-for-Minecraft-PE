package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* renamed from: m40  reason: default package */
public final class m40 extends w5 {
    public static final int U = zi0.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] V = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList S;
    public boolean T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m40(Context context, AttributeSet attributeSet) {
        super(yw0.d(context, attributeSet, r3, r4), attributeSet, r3);
        int i = gh0.radioButtonStyle;
        int i2 = U;
        TypedArray e = yw0.e(getContext(), attributeSet, ij0.MaterialRadioButton, i, i2, new int[0]);
        this.T = e.getBoolean(ij0.MaterialRadioButton_useMaterialThemeColors, false);
        e.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.S == null) {
            int a = nu2.a(this, gh0.colorControlActivated);
            int a2 = nu2.a(this, gh0.colorOnSurface);
            int a3 = nu2.a(this, gh0.colorSurface);
            this.S = new ColorStateList(V, new int[]{nu2.c(1.0f, a3, a), nu2.c(0.54f, a3, a2), nu2.c(0.38f, a3, a2), nu2.c(0.38f, a3, a2)});
        }
        return this.S;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        ColorStateList supportButtonTintList;
        super.onAttachedToWindow();
        if (this.T) {
            if (Build.VERSION.SDK_INT >= 21) {
                supportButtonTintList = getButtonTintList();
            } else {
                supportButtonTintList = getSupportButtonTintList();
            }
            if (supportButtonTintList == null) {
                setUseMaterialThemeColors(true);
            }
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.T = z;
        ye.b(this, z ? getMaterialThemeColorsTintList() : null);
    }
}